import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gle extends gkf<bte, fvu<bte>> {
   private static final Map<bsn<?>, akk> a = ImmutableMap.of(
      bsn.aA,
      new akk("textures/entity/piglin/piglin.png"),
      bsn.bx,
      new akk("textures/entity/piglin/zombified_piglin.png"),
      bsn.aB,
      new akk("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gle(gjo.a $$0, fxo $$1, fxo $$2, fxo $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gnq<>(this, new fvc($$0.a($$2)), new fvc($$0.a($$3)), $$0.g()));
   }

   private static fvu<bte> a(fxm $$0, fxo $$1, boolean $$2) {
      fvu<bte> $$3 = new fvu<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akk c(bte $$0) {
      akk $$1 = a.get($$0.am());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.am());
      } else {
         return $$1;
      }
   }

   protected boolean d(bte $$0) {
      return super.a($$0) || $$0 instanceof cla && ((cla)$$0).gn();
   }
}
