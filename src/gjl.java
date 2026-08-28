import com.google.common.collect.Maps;
import java.util.Map;

public final class gjl extends ghp<chj, fuj<chj>> {
   private static final Map<chq, ale> a = ac.a(Maps.newEnumMap(chq.class), $$0 -> {
      $$0.put(chq.a, new ale("textures/entity/horse/horse_white.png"));
      $$0.put(chq.b, new ale("textures/entity/horse/horse_creamy.png"));
      $$0.put(chq.c, new ale("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chq.d, new ale("textures/entity/horse/horse_brown.png"));
      $$0.put(chq.e, new ale("textures/entity/horse/horse_black.png"));
      $$0.put(chq.f, new ale("textures/entity/horse/horse_gray.png"));
      $$0.put(chq.g, new ale("textures/entity/horse/horse_darkbrown.png"));
   });

   public gjl(giv.a $$0) {
      super($$0, new fuj<>($$0.a(fwx.ap)), 1.1F);
      this.a(new gmw(this));
      this.a(new gmv(this, $$0.f()));
   }

   public ale a(chj $$0) {
      return a.get($$0.s());
   }
}
