import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ghg extends ggi<bqv, frz<bqv>> {
   private static final Map<bqg<?>, ajv> a = ImmutableMap.of(
      bqg.az,
      new ajv("textures/entity/piglin/piglin.png"),
      bqg.bw,
      new ajv("textures/entity/piglin/zombified_piglin.png"),
      bqg.aA,
      new ajv("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public ghg(gfr.a $$0, ftt $$1, ftt $$2, ftt $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gjs<>(this, new frh($$0.a($$2)), new frh($$0.a($$3)), $$0.g()));
   }

   private static frz<bqv> a(ftr $$0, ftt $$1, boolean $$2) {
      frz<bqv> $$3 = new frz<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ajv c(bqv $$0) {
      ajv $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(bqv $$0) {
      return super.a($$0) || $$0 instanceof cip && ((cip)$$0).gn();
   }
}
