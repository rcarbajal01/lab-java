package sts;

import java.util.UUID;
import java.util.logging.Logger;

/*
 * Check the following class and identify what issues it might entail.
 */
public class EmailAccount {

	private UUID uuid;
	private String username;
	private String name;
	private String telno;
	private long quota = 0L;
	private boolean use2FA = false;
    private static final Logger LOGGER = Logger.getLogger(EmailAccount.class.getName());


	public EmailAccount(final String user, final String n) {
		if (checkServer()) {
			this.uuid = UUID.randomUUID();
			this.username = user;
			this.name = n;
			LOGGER.info("Email Account for " + n + "created");
		}
	}

	private boolean checkServer() {
		boolean result = false;
		// Check Mailbox server is online
		// Open Connection to Mailbox server
		// Check available space for new mailbox creation
		return result;
	}

	public UUID getUuid() {
		return this.uuid;
	}

	public boolean isUse2FA() {
		return this.use2FA;
	}

	public void setUse2FA(final boolean use2FA) {
		this.use2FA = use2FA;
		LOGGER.info("Enabled 2FA");
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getFullName() {
		return this.name;
	}
	
	public void setFullName(final String n) {
		if (n != this.name) {
			this.name = n;
			LOGGER.info("Name for email account changed to " + n);
		}
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(final String telno) {
		this.telno = telno;
	}

	public long getQuota() {
		return quota;
	}

	public void setQuota(final long quota) {
		this.quota = quota;
		LOGGER.info("Set quoata to " + quota);
	}
	
	

}
