import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gab extends fzd<bmm, fla<bmm>> {
   private static final Map<bly<?>, ahg> a = ImmutableMap.of(
      bly.ax,
      new ahg("textures/entity/piglin/piglin.png"),
      bly.bu,
      new ahg("textures/entity/piglin/zombified_piglin.png"),
      bly.ay,
      new ahg("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gab(fym.a $$0, fmu $$1, fmu $$2, fmu $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gcn<>(this, new fki($$0.a($$2)), new fki($$0.a($$3)), $$0.g()));
   }

   private static fla<bmm> a(fms $$0, fmu $$1, boolean $$2) {
      fla<bmm> $$3 = new fla<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ahg b(bmm $$0) {
      ahg $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean c(bmm $$0) {
      return super.a($$0) || $$0 instanceof cdw && ((cdw)$$0).ge();
   }
}
