import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gjj extends gik<bss, fua<bss>> {
   private static final Map<bsc<?>, akn> a = ImmutableMap.of(
      bsc.aA,
      new akn("textures/entity/piglin/piglin.png"),
      bsc.bx,
      new akn("textures/entity/piglin/zombified_piglin.png"),
      bsc.aB,
      new akn("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gjj(ght.a $$0, fvu $$1, fvu $$2, fvu $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new glv<>(this, new fti($$0.a($$2)), new fti($$0.a($$3)), $$0.g()));
   }

   private static fua<bss> a(fvs $$0, fvu $$1, boolean $$2) {
      fua<bss> $$3 = new fua<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akn c(bss $$0) {
      akn $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(bss $$0) {
      return super.a($$0) || $$0 instanceof ckn && ((ckn)$$0).gp();
   }
}
