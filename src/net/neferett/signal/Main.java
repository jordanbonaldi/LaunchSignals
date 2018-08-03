package net.neferett.signal;

import java.io.IOException;

import net.neferett.signal.events.Connection;
import net.neferett.signal.events.MsgEvents;
import net.neferett.socket.SockClient;
import net.neferett.socket.packet.Packet;
import net.neferett.socket.packet.PacketAction;

public class Main {

	public static void main(final String[] args) throws IOException {

		sendMessage("getall");

	}

	public static void sendMessage(final String message) throws IOException {
		final SockClient c = new SockClient("127.0.0.1", 12000, new MsgEvents(), new Connection());

		final Packet p = new Packet(PacketAction.SEND);

		p.setMessage(message);

		c.addPacket(p);
		c.buildThread().start();

	}

}
