package entity;

import main.GamePanel;

import java.util.Random;


public class NPC_OldMan extends Entity {

    public NPC_OldMan(GamePanel gp) {
        super(gp);

        direction = "down";
        speed = 1;

        getNPCImage();
        setDialogue();
    }

    public void getNPCImage() {

        up1 = setup("/NPC/oldman_up_1");
        up2 = setup("/NPC/oldman_up_2");
        down1 = setup("/NPC/oldman_down_1");
        down2 = setup("/NPC/oldman_down_2");
        left1 = setup("/NPC/oldman_left_1");
        left2 = setup("/NPC/oldman_left_2");
        right1 = setup("/NPC/oldman_right_1");
        right2 = setup("/NPC/oldman_right_2");

    }

    public void  setDialogue(){
        dialogues[0] = "Hello, young Fella!";
        dialogues[1] = "So you came to this forgave \nisland for treasure?";
        dialogues[2] = "I used to be a great wizard but now...\n I'm a bit too old for being \n adventure anymore";
        dialogues[3] = "I will stay here, good luck!";
    }

    public void setAction(){

        actionLockCounter++;

        if(actionLockCounter == 120){
            Random random = new Random();
            int i = random.nextInt(100)+1; // 0 - 100 number

            if( i <= 25 ){
                direction = "up";
            }
            if(i > 25 && i <= 50){
                direction = "down";
            }
            if(i > 50 && i <= 75){
                direction = "left";
            }
            if(i > 75){
                direction = "right";
            }

            actionLockCounter = 0;
        }


    }

    public void speak(){
        super.speak();
    }


}

