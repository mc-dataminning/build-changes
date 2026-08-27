import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gim extends gho<bsc, ftf<bsc>> {
   private static final Map<brn<?>, akh> a = ImmutableMap.of(
      brn.az,
      new akh("textures/entity/piglin/piglin.png"),
      brn.bw,
      new akh("textures/entity/piglin/zombified_piglin.png"),
      brn.aA,
      new akh("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gim(ggx.a $$0, fuz $$1, fuz $$2, fuz $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gky<>(this, new fsn($$0.a($$2)), new fsn($$0.a($$3)), $$0.g()));
   }

   private static ftf<bsc> a(fux $$0, fuz $$1, boolean $$2) {
      ftf<bsc> $$3 = new ftf<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akh c(bsc $$0) {
      akh $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(bsc $$0) {
      return super.a($$0) || $$0 instanceof cjw && ((cjw)$$0).gp();
   }
}
