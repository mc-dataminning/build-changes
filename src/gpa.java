import com.google.common.collect.Maps;
import java.util.Map;

public final class gpa extends gnb<cix, gvc, fyv> {
   private static final Map<cje, ali> a = ae.a(Maps.newEnumMap(cje.class), $$0 -> {
      $$0.put(cje.a, ali.b("textures/entity/horse/horse_white.png"));
      $$0.put(cje.b, ali.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cje.c, ali.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cje.d, ali.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cje.e, ali.b("textures/entity/horse/horse_black.png"));
      $$0.put(cje.f, ali.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cje.g, ali.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gpa(gok.a $$0) {
      super($$0, new fyv($$0.a(gbl.aP)), new fyv($$0.a(gbl.aQ)), 1.1F);
      this.a(new gsm(this));
      this.a(new gsl(this, $$0.f(), $$0.h()));
   }

   public ali a(gvc $$0) {
      return a.get($$0.a);
   }

   public gvc c() {
      return new gvc();
   }

   public void a(cix $$0, gvc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.ak().v();
   }
}
