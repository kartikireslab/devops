package com.ireslab.coinclaim.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author iRESlab
 *
 */
@Component
@PropertySource(value = "classpath:clm_token_config.properties")
@ConfigurationProperties
public class TokenConfig implements Cloneable {

	private String tokenSymbol;
	private String tokenDecimal;

	private String tokenContractAddress;
	private String tokenContractBinary;
	private String tokenDeployerPrivateKey;

	/**
	 * @return the tokenCode
	 */
	public String getTokenSymbol() {
		return tokenSymbol;
	}

	/**
	 * @param tokenSymbol
	 *            the tokenCode to set
	 */
	public void setTokenSymbol(String tokenSymbol) {
		this.tokenSymbol = tokenSymbol;
	}

	/**
	 * @return the tokenDecimal
	 */
	public String getTokenDecimal() {
		return tokenDecimal;
	}

	/**
	 * @param tokenDecimal
	 *            the tokenDecimal to set
	 */
	public void setTokenDecimal(String tokenDecimal) {
		this.tokenDecimal = tokenDecimal;
	}

	/**
	 * @return the tokenContractAddress
	 */
	public String getTokenContractAddress() {
		return tokenContractAddress;
	}

	/**
	 * @param tokenContractAddress
	 *            the tokenContractAddress to set
	 */
	public void setTokenContractAddress(String tokenContractAddress) {
		this.tokenContractAddress = tokenContractAddress;
	}

	/**
	 * @return the tokenContractBinary
	 */
	public String getTokenContractBinary() {
		return tokenContractBinary;
	}

	/**
	 * @param tokenContractBinary
	 *            the tokenContractBinary to set
	 */
	public void setTokenContractBinary(String tokenContractBinary) {
		this.tokenContractBinary = tokenContractBinary;
	}

	/**
	 * @return the tokenDeployerPrivateKey
	 */
	public String getTokenDeployerPrivateKey() {
		return tokenDeployerPrivateKey;
	}

	/**
	 * @param tokenDeployerPrivateKey
	 *            the tokenDeployerPrivateKey to set
	 */
	public void setTokenDeployerPrivateKey(String tokenDeployerPrivateKey) {
		this.tokenDeployerPrivateKey = tokenDeployerPrivateKey;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
