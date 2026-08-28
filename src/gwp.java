import com.google.common.collect.Maps;
import java.util.Map;

public final class gwp extends gup<clf, hcv, ggc> {
   private static final Map<clm, alg> a = Maps.newEnumMap(
      Map.of(
         clm.a,
         alg.b("textures/entity/horse/horse_white.png"),
         clm.b,
         alg.b("textures/entity/horse/horse_creamy.png"),
         clm.c,
         alg.b("textures/entity/horse/horse_chestnut.png"),
         clm.d,
         alg.b("textures/entity/horse/horse_brown.png"),
         clm.e,
         alg.b("textures/entity/horse/horse_black.png"),
         clm.f,
         alg.b("textures/entity/horse/horse_gray.png"),
         clm.g,
         alg.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gwp(gvz.a $$0) {
      super($$0, new ggc($$0.a(git.bl)), new ggc($$0.a(git.bo)));
      this.a(new hab(this));
      this.a(new hap<>(this, $$0.h(), hkv.d.e, $$0x -> $$0x.i, new ggc($$0.a(git.bm)), new ggc($$0.a(git.bp))));
      this.a(new hap<>(this, $$0.h(), hkv.d.j, $$0x -> $$0x.b, new gfr($$0.a(git.bn)), new gfr($$0.a(git.bq))));
   }

   public alg a(hcv $$0) {
      return a.get($$0.a);
   }

   public hcv b() {
      return new hcv();
   }

   public void a(clf $$0, hcv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.aj().v();
   }
}
