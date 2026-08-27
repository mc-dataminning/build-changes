import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gaa extends fzc<bmm, fkz<bmm>> {
   private static final Map<bly<?>, ahg> a = ImmutableMap.of(
      bly.ax,
      new ahg("textures/entity/piglin/piglin.png"),
      bly.bu,
      new ahg("textures/entity/piglin/zombified_piglin.png"),
      bly.ay,
      new ahg("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gaa(fyl.a $$0, fmt $$1, fmt $$2, fmt $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gcm<>(this, new fkh($$0.a($$2)), new fkh($$0.a($$3)), $$0.g()));
   }

   private static fkz<bmm> a(fmr $$0, fmt $$1, boolean $$2) {
      fkz<bmm> $$3 = new fkz<>($$0.a($$1));
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
