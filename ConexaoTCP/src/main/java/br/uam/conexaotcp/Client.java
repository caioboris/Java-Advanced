/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uam.conexaotcp;

/**
 *
 * @author MSWagner
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    Socket socket;

    public void comunicarComServidor() throws Exception {
        String textoRequisicao = "Conexao estabelecida";
        String textoRecebido = "";
        socket = new Socket("localhost", 9600); //localhost = 127.0.0.1

        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite a sua mensagem: ");
        textoRequisicao = input.nextLine();
        
        // Enviar mensagem para o servidor
        ConexaoTCP.enviar(socket, textoRequisicao);

        // Receber mensagem do servidor
        textoRecebido = ConexaoTCP.receber(socket);

        System.out.println("Servidor enviou: " + textoRecebido);
    }

    public static void main(String[] args) {
        try {
            Client cliente = new Client();
            cliente.comunicarComServidor();
        } catch(Exception e){
            e.printStackTrace();
        }
    } 
}
