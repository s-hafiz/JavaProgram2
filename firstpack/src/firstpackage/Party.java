package firstpackage;

import java.awt.*;
public class Party{

        public void buildInvite(){

                Frame f = new Frame();
                Label l = new Label("Party at Tim's");
                Button b = new Button("You bet");
                Button c = new Button("Ahoot me");
                Panel p = new Panel();
                p.add(l);
                p.add(b);
                p.add(c);
                
        }

        public static void main(String args[]){
                Party obj = new Party();
                obj.buildInvite();
        }
}
