import com.google.common.collect.Maps;
import java.util.Map;

public final class gjm extends ghq<chk, fuk<chk>> {
   private static final Map<chr, ale> a = ac.a(Maps.newEnumMap(chr.class), $$0 -> {
      $$0.put(chr.a, new ale("textures/entity/horse/horse_white.png"));
      $$0.put(chr.b, new ale("textures/entity/horse/horse_creamy.png"));
      $$0.put(chr.c, new ale("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chr.d, new ale("textures/entity/horse/horse_brown.png"));
      $$0.put(chr.e, new ale("textures/entity/horse/horse_black.png"));
      $$0.put(chr.f, new ale("textures/entity/horse/horse_gray.png"));
      $$0.put(chr.g, new ale("textures/entity/horse/horse_darkbrown.png"));
   });

   public gjm(giw.a $$0) {
      super($$0, new fuk<>($$0.a(fwy.ap)), 1.1F);
      this.a(new gmx(this));
      this.a(new gmw(this, $$0.f()));
   }

   public ale a(chk $$0) {
      return a.get($$0.s());
   }
}
