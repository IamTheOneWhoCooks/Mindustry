package io.anuke.mindustry.content;

import com.badlogic.gdx.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Items {
    public static final Item

    stone = new Item("stone", Color.valueOf("777777")) {{
        hardness = 3;
    }},

    iron = new Item("iron", Color.valueOf("bc8271")){{
        type = ItemType.material;
        hardness = 1;
    }},

    lead = new Item("lead", Color.valueOf("8e85a2")){{
        type = ItemType.material;
        hardness = 1;
    }},

    coal = new Item("coal", Color.valueOf("272727")) {{
        explosiveness = 0.2f;
        flammability = 0.5f;
        fluxiness = 0.3f;
        hardness = 2;
    }},

    steel = new Item("steel", Color.valueOf("e2e2e2")){{
        type = ItemType.material;
    }},

    titanium = new Item("titanium", Color.valueOf("8da1e3")){{
        type = ItemType.material;
        hardness = 3;
    }},

    thorium = new Item("thorium", Color.valueOf("f9a3c7")) {{
        type = ItemType.material;
        explosiveness = 0.1f;
        hardness = 4;
    }},

    silicon = new Item("silicon", Color.valueOf("53565c")){{
        type = ItemType.material;
    }},

    plastic = new Item("plastic", Color.valueOf("e9ead3")){{
        type = ItemType.material;
        flammability = 0.2f;
        explosiveness = 0.1f;
    }},

    surgealloy = new Item("surge-alloy", Color.valueOf("b4d5c7")){{
        type = ItemType.material;
    }},

    biomatter = new Item("biomatter", Color.valueOf("648b55")) {{
        flammability = 0.4f;
        fluxiness = 0.2f;
    }},

    sand = new Item("sand", Color.valueOf("e3d39e")){{
        fluxiness = 0.5f;
    }},

    blastCompound = new Item("blast-compound", Color.valueOf("ff795e")){{
        flammability = 0.2f;
        explosiveness = 0.6f;
    }},

    thermite = new Item("thermite", Color.valueOf("ff795e")){{
        flammability = 0.7f;
        explosiveness = 0.2f;
    }};
}
