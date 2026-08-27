import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ggx extends gfz<bqq, frq<bqq>> {
   private static final Map<bqb<?>, ajt> a = ImmutableMap.of(
      bqb.az,
      new ajt("textures/entity/piglin/piglin.png"),
      bqb.bw,
      new ajt("textures/entity/piglin/zombified_piglin.png"),
      bqb.aA,
      new ajt("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public ggx(gfi.a $$0, ftk $$1, ftk $$2, ftk $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gjj<>(this, new fqy($$0.a($$2)), new fqy($$0.a($$3)), $$0.g()));
   }

   private static frq<bqq> a(fti $$0, ftk $$1, boolean $$2) {
      frq<bqq> $$3 = new frq<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ajt c(bqq $$0) {
      ajt $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(bqq $$0) {
      return super.a($$0) || $$0 instanceof cii && ((cii)$$0).gn();
   }
}
