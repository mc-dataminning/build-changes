import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkm extends gjn<btq, fvd<btq>> {
   private static final Map<bsz<?>, ale> a = ImmutableMap.of(
      bsz.aA,
      new ale("textures/entity/piglin/piglin.png"),
      bsz.bx,
      new ale("textures/entity/piglin/zombified_piglin.png"),
      bsz.aB,
      new ale("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gkm(giw.a $$0, fwx $$1, fwx $$2, fwx $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gmy<>(this, new ful($$0.a($$2)), new ful($$0.a($$3)), $$0.g()));
   }

   private static fvd<btq> a(fwv $$0, fwx $$1, boolean $$2) {
      fvd<btq> $$3 = new fvd<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ale c(btq $$0) {
      ale $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(btq $$0) {
      return super.a($$0) || $$0 instanceof cll && ((cll)$$0).gq();
   }
}
