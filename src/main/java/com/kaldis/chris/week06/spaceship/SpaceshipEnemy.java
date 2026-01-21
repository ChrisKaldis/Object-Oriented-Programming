package com.kaldis.chris.week06.spaceship;

import com.kaldis.chris.week06.Week6;

public class SpaceshipEnemy extends Spaceship {

    public SpaceshipEnemy() {
        super((Week6.COSMOS_WIDTH - Week6.SPACESHIP_WIDTH) / 2, 0 ,15, "Evil");
    }

}
