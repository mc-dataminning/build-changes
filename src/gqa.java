import com.google.common.collect.Maps;
import java.util.Map;

public final class gqa extends gob<cje, gwd, fzu> {
   private static final Map<cjl, alj> a = ae.a(Maps.newEnumMap(cjl.class), $$0 -> {
      $$0.put(cjl.a, alj.b("textures/entity/horse/horse_white.png"));
      $$0.put(cjl.b, alj.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cjl.c, alj.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cjl.d, alj.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cjl.e, alj.b("textures/entity/horse/horse_black.png"));
      $$0.put(cjl.f, alj.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cjl.g, alj.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gqa(gpk.a $$0) {
      super($$0, new fzu($$0.a(gck.aZ)), new fzu($$0.a(gck.bb)), 1.1F);
      this.a(new gtn(this));
      this.a(new gtm(this, $$0.f(), $$0.h()));
   }

   public alj a(gwd $$0) {
      return a.get($$0.a);
   }

   public gwd b() {
      return new gwd();
   }

   public void a(cje $$0, gwd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n();
      $$1.h = $$0.q();
      $$1.i = $$0.af().v();
   }
}
