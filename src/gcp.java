import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gcp extends gbr<bok, fnm<bok>> {
   private static final Map<bnw<?>, aiy> a = ImmutableMap.of(
      bnw.ay,
      new aiy("textures/entity/piglin/piglin.png"),
      bnw.bv,
      new aiy("textures/entity/piglin/zombified_piglin.png"),
      bnw.az,
      new aiy("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gcp(gba.a $$0, fph $$1, fph $$2, fph $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gfb<>(this, new fmu($$0.a($$2)), new fmu($$0.a($$3)), $$0.g()));
   }

   private static fnm<bok> a(fpf $$0, fph $$1, boolean $$2) {
      fnm<bok> $$3 = new fnm<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public aiy c(bok $$0) {
      aiy $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(bok $$0) {
      return super.a($$0) || $$0 instanceof cga && ((cga)$$0).gg();
   }
}
