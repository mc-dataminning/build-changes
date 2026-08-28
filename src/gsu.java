import com.google.common.collect.Maps;
import java.util.Map;

public final class gsu extends gqu<cje, gza, gcm> {
   private static final Map<cjl, akv> a = af.a(Maps.newEnumMap(cjl.class), $$0 -> {
      $$0.put(cjl.a, akv.b("textures/entity/horse/horse_white.png"));
      $$0.put(cjl.b, akv.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cjl.c, akv.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cjl.d, akv.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cjl.e, akv.b("textures/entity/horse/horse_black.png"));
      $$0.put(cjl.f, akv.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cjl.g, akv.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gsu(gse.a $$0) {
      super($$0, new gcm($$0.a(gfc.bd)), new gcm($$0.a(gfc.bf)));
      this.a(new gwh(this));
      this.a(new gwg(this, $$0.f(), $$0.h()));
   }

   public akv a(gza $$0) {
      return a.get($$0.a);
   }

   public gza b() {
      return new gza();
   }

   public void a(cje $$0, gza $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.ak().v();
   }
}
