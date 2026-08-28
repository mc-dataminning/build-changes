import com.google.common.collect.Maps;
import java.util.Map;

public final class goe extends gmf<cij, guf, fxz> {
   private static final Map<ciq, ale> a = ad.a(Maps.newEnumMap(ciq.class), $$0 -> {
      $$0.put(ciq.a, ale.b("textures/entity/horse/horse_white.png"));
      $$0.put(ciq.b, ale.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(ciq.c, ale.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ciq.d, ale.b("textures/entity/horse/horse_brown.png"));
      $$0.put(ciq.e, ale.b("textures/entity/horse/horse_black.png"));
      $$0.put(ciq.f, ale.b("textures/entity/horse/horse_gray.png"));
      $$0.put(ciq.g, ale.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public goe(gno.a $$0) {
      super($$0, new fxz($$0.a(gap.aP)), new fxz($$0.a(gap.aQ)), 1.1F);
      this.a(new grq(this));
      this.a(new grp(this, $$0.f()));
   }

   public ale a(guf $$0) {
      return a.get($$0.a);
   }

   public guf c() {
      return new guf();
   }

   public void a(cij $$0, guf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.fT().u();
   }
}
