import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkw extends gjx<bta, fvm<bta>> {
   private static final Map<bsj<?>, akk> a = ImmutableMap.of(
      bsj.aA,
      new akk("textures/entity/piglin/piglin.png"),
      bsj.bx,
      new akk("textures/entity/piglin/zombified_piglin.png"),
      bsj.aB,
      new akk("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gkw(gjg.a $$0, fxg $$1, fxg $$2, fxg $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gni<>(this, new fuu($$0.a($$2)), new fuu($$0.a($$3)), $$0.g()));
   }

   private static fvm<bta> a(fxe $$0, fxg $$1, boolean $$2) {
      fvm<bta> $$3 = new fvm<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akk c(bta $$0) {
      akk $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(bta $$0) {
      return super.a($$0) || $$0 instanceof ckw && ((ckw)$$0).gn();
   }
}
