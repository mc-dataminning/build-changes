import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwz extends fwb<bla, fig<bla>> {
   private static final Map<bkm<?>, agg> a = ImmutableMap.of(
      bkm.aw,
      new agg("textures/entity/piglin/piglin.png"),
      bkm.bs,
      new agg("textures/entity/piglin/zombified_piglin.png"),
      bkm.ax,
      new agg("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fwz(fvk.a $$0, fjz $$1, fjz $$2, fjz $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fzi<>(this, new fho($$0.a($$2)), new fho($$0.a($$3)), $$0.g()));
   }

   private static fig<bla> a(fjx $$0, fjz $$1, boolean $$2) {
      fig<bla> $$3 = new fig<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public agg b(bla $$0) {
      agg $$1 = a.get($$0.ag());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ag());
      } else {
         return $$1;
      }
   }

   protected boolean c(bla $$0) {
      return super.a($$0) || $$0 instanceof ccb && ((ccb)$$0).ge();
   }
}
