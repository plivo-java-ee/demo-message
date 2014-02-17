/*
 * Copyright 2014 plivo-java-ee.org.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.plivo.ee.demo.message.controller;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.plivo.ee.inject.notification.From;
import org.plivo.ee.inject.notification.MessageUUID;
import org.plivo.ee.inject.notification.Text;
import org.plivo.ee.inject.notification.To;
import org.plivo.ee.inject.notification.Type;

@Named
@RequestScoped
public class MessageController {

	Logger logger = Logger.getLogger(getClass().getName());
	@Inject
	@Text
	private String text;

	@Inject
	@Type
	private String type;

	@Inject
	@To
	private String to;

	@Inject
	@MessageUUID
	private String messageUUID;

	@Inject
	@From
	private String from;

	public MessageController() {
	}

	public void log() {
		logger.info("from: " + from);
		logger.info("to: " + to);

		logger.info("type: " + type);
		logger.info("text: " + text);
		logger.info("messageUUID: " + messageUUID);
	}

}
