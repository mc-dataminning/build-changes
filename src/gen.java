import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gen extends gdp<bpq, fph<bpq>> {
   private static final Map<bpc<?>, ajh> a = ImmutableMap.of(
      bpc.az,
      new ajh("textures/entity/piglin/piglin.png"),
      bpc.bw,
      new ajh("textures/entity/piglin/zombified_piglin.png"),
      bpc.aA,
      new ajh("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gen(gcy.a $$0, frb $$1, frb $$2, frb $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new ggz<>(this, new foo($$0.a($$2)), new foo($$0.a($$3)), $$0.g()));
   }

   private static fph<bpq> a(fqz $$0, frb $$1, boolean $$2) {
      fph<bpq> $$3 = new fph<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ajh c(bpq $$0) {
      ajh $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(bpq $$0) {
      return super.a($$0) || $$0 instanceof chh && ((chh)$$0).gn();
   }
}
