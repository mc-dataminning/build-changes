import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gko extends gjp<bts, fvf<bts>> {
   private static final Map<btb<?>, alf> a = ImmutableMap.of(
      btb.aA,
      new alf("textures/entity/piglin/piglin.png"),
      btb.bx,
      new alf("textures/entity/piglin/zombified_piglin.png"),
      btb.aB,
      new alf("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gko(giy.a $$0, fwz $$1, fwz $$2, fwz $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gna<>(this, new fun($$0.a($$2)), new fun($$0.a($$3)), $$0.g()));
   }

   private static fvf<bts> a(fwx $$0, fwz $$1, boolean $$2) {
      fvf<bts> $$3 = new fvf<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public alf c(bts $$0) {
      alf $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(bts $$0) {
      return super.a($$0) || $$0 instanceof cln && ((cln)$$0).gq();
   }
}
