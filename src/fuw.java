import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fuw extends fty<bji, fgh<bji>> {
   private static final Map<biu<?>, aex> a = ImmutableMap.of(
      biu.aw,
      new aex("textures/entity/piglin/piglin.png"),
      biu.bs,
      new aex("textures/entity/piglin/zombified_piglin.png"),
      biu.ax,
      new aex("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fuw(fth.a $$0, fia $$1, fia $$2, fia $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fxf<>(this, new ffp($$0.a($$2)), new ffp($$0.a($$3)), $$0.g()));
   }

   private static fgh<bji> a(fhy $$0, fia $$1, boolean $$2) {
      fgh<bji> $$3 = new fgh<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public aex b(bji $$0) {
      aex $$1 = a.get($$0.ag());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ag());
      } else {
         return $$1;
      }
   }

   protected boolean c(bji $$0) {
      return super.a($$0) || $$0 instanceof caj && ((caj)$$0).gd();
   }
}
