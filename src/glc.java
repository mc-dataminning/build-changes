import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class glc extends gkd<btd, fvs<btd>> {
   private static final Map<bsm<?>, akk> a = ImmutableMap.of(
      bsm.aA,
      new akk("textures/entity/piglin/piglin.png"),
      bsm.bx,
      new akk("textures/entity/piglin/zombified_piglin.png"),
      bsm.aB,
      new akk("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public glc(gjm.a $$0, fxm $$1, fxm $$2, fxm $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gno<>(this, new fva($$0.a($$2)), new fva($$0.a($$3)), $$0.g()));
   }

   private static fvs<btd> a(fxk $$0, fxm $$1, boolean $$2) {
      fvs<btd> $$3 = new fvs<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akk c(btd $$0) {
      akk $$1 = a.get($$0.al());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.al());
      } else {
         return $$1;
      }
   }

   protected boolean d(btd $$0) {
      return super.a($$0) || $$0 instanceof ckz && ((ckz)$$0).go();
   }
}
