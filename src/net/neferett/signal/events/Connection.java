package net.neferett.signal.events;

import net.neferett.socket.events.ConnectEvent;
import net.neferett.socket.events.manager.EventListener;
import net.neferett.socket.events.manager.SocketEvent;

public class Connection implements EventListener {

	@SocketEvent
	public void onConnect(final ConnectEvent e) {
		System.out.println("Connecté");
	}

}
