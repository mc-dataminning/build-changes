import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gic extends ghe<brg, fsv<brg>> {
   private static final Map<bqr<?>, akf> a = ImmutableMap.of(
      bqr.az,
      new akf("textures/entity/piglin/piglin.png"),
      bqr.bw,
      new akf("textures/entity/piglin/zombified_piglin.png"),
      bqr.aA,
      new akf("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gic(ggn.a $$0, fup $$1, fup $$2, fup $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gko<>(this, new fsd($$0.a($$2)), new fsd($$0.a($$3)), $$0.g()));
   }

   private static fsv<brg> a(fun $$0, fup $$1, boolean $$2) {
      fsv<brg> $$3 = new fsv<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akf c(brg $$0) {
      akf $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(brg $$0) {
      return super.a($$0) || $$0 instanceof cja && ((cja)$$0).gp();
   }
}
