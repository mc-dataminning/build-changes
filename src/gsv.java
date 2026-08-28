import com.google.common.collect.Maps;
import java.util.Map;

public final class gsv extends gqv<cjf, gzb, gcn> {
   private static final Map<cjm, akv> a = af.a(Maps.newEnumMap(cjm.class), $$0 -> {
      $$0.put(cjm.a, akv.b("textures/entity/horse/horse_white.png"));
      $$0.put(cjm.b, akv.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cjm.c, akv.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cjm.d, akv.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cjm.e, akv.b("textures/entity/horse/horse_black.png"));
      $$0.put(cjm.f, akv.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cjm.g, akv.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gsv(gsf.a $$0) {
      super($$0, new gcn($$0.a(gfd.bd)), new gcn($$0.a(gfd.bf)));
      this.a(new gwi(this));
      this.a(new gwh(this, $$0.f(), $$0.h()));
   }

   public akv a(gzb $$0) {
      return a.get($$0.a);
   }

   public gzb b() {
      return new gzb();
   }

   public void a(cjf $$0, gzb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.ak().v();
   }
}
