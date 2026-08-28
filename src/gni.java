import com.google.common.collect.Maps;
import java.util.Map;

public final class gni extends glj<cib, gtj, fxl> {
   private static final Map<cii, alb> a = ad.a(Maps.newEnumMap(cii.class), $$0 -> {
      $$0.put(cii.a, alb.b("textures/entity/horse/horse_white.png"));
      $$0.put(cii.b, alb.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cii.c, alb.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cii.d, alb.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cii.e, alb.b("textures/entity/horse/horse_black.png"));
      $$0.put(cii.f, alb.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cii.g, alb.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gni(gms.a $$0) {
      super($$0, new fxl($$0.a(gaa.aP)), new fxl($$0.a(gaa.aQ)), 1.1F);
      this.a(new gqu(this));
      this.a(new gqt(this, $$0.f()));
   }

   public alb a(gtj $$0) {
      return a.get($$0.a);
   }

   public gtj c() {
      return new gtj();
   }

   public void a(cib $$0, gtj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.fS().u();
   }
}
