import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gdn extends gcp<boz, foi<boz>> {
   private static final Map<bol<?>, ajc> a = ImmutableMap.of(
      bol.ay,
      new ajc("textures/entity/piglin/piglin.png"),
      bol.bv,
      new ajc("textures/entity/piglin/zombified_piglin.png"),
      bol.az,
      new ajc("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gdn(gby.a $$0, fqd $$1, fqd $$2, fqd $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gfz<>(this, new fnq($$0.a($$2)), new fnq($$0.a($$3)), $$0.g()));
   }

   private static foi<boz> a(fqb $$0, fqd $$1, boolean $$2) {
      foi<boz> $$3 = new foi<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ajc c(boz $$0) {
      ajc $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(boz $$0) {
      return super.a($$0) || $$0 instanceof cgp && ((cgp)$$0).gl();
   }
}
