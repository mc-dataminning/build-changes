import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkp extends gjq<btt, fvg<btt>> {
   private static final Map<btc<?>, alf> a = ImmutableMap.of(
      btc.aA,
      new alf("textures/entity/piglin/piglin.png"),
      btc.bx,
      new alf("textures/entity/piglin/zombified_piglin.png"),
      btc.aB,
      new alf("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gkp(giz.a $$0, fxa $$1, fxa $$2, fxa $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gnb<>(this, new fuo($$0.a($$2)), new fuo($$0.a($$3)), $$0.g()));
   }

   private static fvg<btt> a(fwy $$0, fxa $$1, boolean $$2) {
      fvg<btt> $$3 = new fvg<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public alf c(btt $$0) {
      alf $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(btt $$0) {
      return super.a($$0) || $$0 instanceof clo && ((clo)$$0).gq();
   }
}
