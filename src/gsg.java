import com.google.common.collect.Maps;
import java.util.Map;

public final class gsg extends gqg<ckd, gyk, gbx> {
   private static final Map<ckk, alz> a = ae.a(Maps.newEnumMap(ckk.class), $$0 -> {
      $$0.put(ckk.a, alz.b("textures/entity/horse/horse_white.png"));
      $$0.put(ckk.b, alz.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(ckk.c, alz.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ckk.d, alz.b("textures/entity/horse/horse_brown.png"));
      $$0.put(ckk.e, alz.b("textures/entity/horse/horse_black.png"));
      $$0.put(ckk.f, alz.b("textures/entity/horse/horse_gray.png"));
      $$0.put(ckk.g, alz.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gsg(grq.a $$0) {
      super($$0, new gbx($$0.a(gen.ba)), new gbx($$0.a(gen.bc)), 1.1F);
      this.a(new gvt(this));
      this.a(new gvs(this, $$0.f(), $$0.h()));
   }

   public alz a(gyk $$0) {
      return a.get($$0.a);
   }

   public gyk b() {
      return new gyk();
   }

   public void a(ckd $$0, gyk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.af().v();
   }
}
