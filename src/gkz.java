import com.google.common.collect.Maps;
import java.util.Map;

public final class gkz extends gjd<chk, fvv<chk>> {
   private static final Map<chr, akr> a = ad.a(Maps.newEnumMap(chr.class), $$0 -> {
      $$0.put(chr.a, akr.b("textures/entity/horse/horse_white.png"));
      $$0.put(chr.b, akr.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(chr.c, akr.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chr.d, akr.b("textures/entity/horse/horse_brown.png"));
      $$0.put(chr.e, akr.b("textures/entity/horse/horse_black.png"));
      $$0.put(chr.f, akr.b("textures/entity/horse/horse_gray.png"));
      $$0.put(chr.g, akr.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gkz(gkj.a $$0) {
      super($$0, new fvv<>($$0.a(fyj.aq)), 1.1F);
      this.a(new gok(this));
      this.a(new goj(this, $$0.f()));
   }

   public akr a(chk $$0) {
      return a.get($$0.s());
   }
}
