import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fzd extends fyf<blx, fkc<blx>> {
   private static final Map<blj<?>, agt> a = ImmutableMap.of(
      blj.ax,
      new agt("textures/entity/piglin/piglin.png"),
      blj.bu,
      new agt("textures/entity/piglin/zombified_piglin.png"),
      blj.ay,
      new agt("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fzd(fxo.a $$0, flw $$1, flw $$2, flw $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gbp<>(this, new fjk($$0.a($$2)), new fjk($$0.a($$3)), $$0.g()));
   }

   private static fkc<blx> a(flu $$0, flw $$1, boolean $$2) {
      fkc<blx> $$3 = new fkc<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public agt b(blx $$0) {
      agt $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean c(blx $$0) {
      return super.a($$0) || $$0 instanceof cdg && ((cdg)$$0).ge();
   }
}
