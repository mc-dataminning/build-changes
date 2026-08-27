import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fur extends ftt<bjd, fgc<bjd>> {
   private static final Map<bip<?>, aeu> a = ImmutableMap.of(
      bip.aw,
      new aeu("textures/entity/piglin/piglin.png"),
      bip.bs,
      new aeu("textures/entity/piglin/zombified_piglin.png"),
      bip.ax,
      new aeu("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fur(ftc.a $$0, fhv $$1, fhv $$2, fhv $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fxa<>(this, new ffk($$0.a($$2)), new ffk($$0.a($$3)), $$0.g()));
   }

   private static fgc<bjd> a(fht $$0, fhv $$1, boolean $$2) {
      fgc<bjd> $$3 = new fgc<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public aeu b(bjd $$0) {
      aeu $$1 = a.get($$0.ag());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ag());
      } else {
         return $$1;
      }
   }

   protected boolean c(bjd $$0) {
      return super.a($$0) || $$0 instanceof cae && ((cae)$$0).ga();
   }
}
