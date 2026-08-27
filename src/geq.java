import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class geq extends gds<bpr, fpj<bpr>> {
   private static final Map<bpd<?>, ajh> a = ImmutableMap.of(
      bpd.aA,
      new ajh("textures/entity/piglin/piglin.png"),
      bpd.bx,
      new ajh("textures/entity/piglin/zombified_piglin.png"),
      bpd.aB,
      new ajh("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public geq(gdb.a $$0, frd $$1, frd $$2, frd $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new ghc<>(this, new foq($$0.a($$2)), new foq($$0.a($$3)), $$0.g()));
   }

   private static fpj<bpr> a(frb $$0, frd $$1, boolean $$2) {
      fpj<bpr> $$3 = new fpj<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ajh c(bpr $$0) {
      ajh $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(bpr $$0) {
      return super.a($$0) || $$0 instanceof chj && ((chj)$$0).gn();
   }
}
