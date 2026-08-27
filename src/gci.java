import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gci extends gbk<boi, fnf<boi>> {
   private static final Map<bnu<?>, aiy> a = ImmutableMap.of(
      bnu.ay,
      new aiy("textures/entity/piglin/piglin.png"),
      bnu.bv,
      new aiy("textures/entity/piglin/zombified_piglin.png"),
      bnu.az,
      new aiy("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gci(gat.a $$0, fpa $$1, fpa $$2, fpa $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new geu<>(this, new fmn($$0.a($$2)), new fmn($$0.a($$3)), $$0.g()));
   }

   private static fnf<boi> a(foy $$0, fpa $$1, boolean $$2) {
      fnf<boi> $$3 = new fnf<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public aiy c(boi $$0) {
      aiy $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean d(boi $$0) {
      return super.a($$0) || $$0 instanceof cfw && ((cfw)$$0).gg();
   }
}
