import com.google.common.collect.Maps;
import java.util.Map;

public final class gnz extends gma<cig, gua, fxv> {
   private static final Map<cin, alc> a = ad.a(Maps.newEnumMap(cin.class), $$0 -> {
      $$0.put(cin.a, alc.b("textures/entity/horse/horse_white.png"));
      $$0.put(cin.b, alc.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cin.c, alc.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cin.d, alc.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cin.e, alc.b("textures/entity/horse/horse_black.png"));
      $$0.put(cin.f, alc.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cin.g, alc.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gnz(gnj.a $$0) {
      super($$0, new fxv($$0.a(gak.aP)), new fxv($$0.a(gak.aQ)), 1.1F);
      this.a(new grl(this));
      this.a(new grk(this, $$0.f()));
   }

   public alc a(gua $$0) {
      return a.get($$0.a);
   }

   public gua c() {
      return new gua();
   }

   public void a(cig $$0, gua $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.fT().u();
   }
}
