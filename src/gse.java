import com.google.common.collect.Maps;
import java.util.Map;

public final class gse extends gqe<ckc, gyi, gbv> {
   private static final Map<ckj, alz> a = ae.a(Maps.newEnumMap(ckj.class), $$0 -> {
      $$0.put(ckj.a, alz.b("textures/entity/horse/horse_white.png"));
      $$0.put(ckj.b, alz.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(ckj.c, alz.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ckj.d, alz.b("textures/entity/horse/horse_brown.png"));
      $$0.put(ckj.e, alz.b("textures/entity/horse/horse_black.png"));
      $$0.put(ckj.f, alz.b("textures/entity/horse/horse_gray.png"));
      $$0.put(ckj.g, alz.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gse(gro.a $$0) {
      super($$0, new gbv($$0.a(gel.ba)), new gbv($$0.a(gel.bc)), 1.1F);
      this.a(new gvr(this));
      this.a(new gvq(this, $$0.f(), $$0.h()));
   }

   public alz a(gyi $$0) {
      return a.get($$0.a);
   }

   public gyi b() {
      return new gyi();
   }

   public void a(ckc $$0, gyi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.af().v();
   }
}
