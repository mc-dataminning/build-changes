import com.google.common.collect.Maps;
import java.util.Map;

public final class gop extends gmq<cis, gur, fyk> {
   private static final Map<ciz, alh> a = ad.a(Maps.newEnumMap(ciz.class), $$0 -> {
      $$0.put(ciz.a, alh.b("textures/entity/horse/horse_white.png"));
      $$0.put(ciz.b, alh.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(ciz.c, alh.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ciz.d, alh.b("textures/entity/horse/horse_brown.png"));
      $$0.put(ciz.e, alh.b("textures/entity/horse/horse_black.png"));
      $$0.put(ciz.f, alh.b("textures/entity/horse/horse_gray.png"));
      $$0.put(ciz.g, alh.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gop(gnz.a $$0) {
      super($$0, new fyk($$0.a(gba.aP)), new fyk($$0.a(gba.aQ)), 1.1F);
      this.a(new gsb(this));
      this.a(new gsa(this, $$0.f(), $$0.h()));
   }

   public alh a(gur $$0) {
      return a.get($$0.a);
   }

   public gur c() {
      return new gur();
   }

   public void a(cis $$0, gur $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.ak().v();
   }
}
