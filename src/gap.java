import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gap extends fzr<bmq, fln<bmq>> {
   private static final Map<bmc<?>, ahh> a = ImmutableMap.of(
      bmc.ay,
      new ahh("textures/entity/piglin/piglin.png"),
      bmc.bv,
      new ahh("textures/entity/piglin/zombified_piglin.png"),
      bmc.az,
      new ahh("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gap(fza.a $$0, fnh $$1, fnh $$2, fnh $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gdb<>(this, new fkv($$0.a($$2)), new fkv($$0.a($$3)), $$0.g()));
   }

   private static fln<bmq> a(fnf $$0, fnh $$1, boolean $$2) {
      fln<bmq> $$3 = new fln<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ahh c(bmq $$0) {
      ahh $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(bmq $$0) {
      return super.a($$0) || $$0 instanceof cef && ((cef)$$0).gf();
   }
}
