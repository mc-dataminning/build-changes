import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxm extends fwo<bli, fit<bli>> {
   private static final Map<bku<?>, agi> a = ImmutableMap.of(
      bku.aw,
      new agi("textures/entity/piglin/piglin.png"),
      bku.bs,
      new agi("textures/entity/piglin/zombified_piglin.png"),
      bku.ax,
      new agi("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fxm(fvx.a $$0, fkm $$1, fkm $$2, fkm $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fzv<>(this, new fib($$0.a($$2)), new fib($$0.a($$3)), $$0.g()));
   }

   private static fit<bli> a(fkk $$0, fkm $$1, boolean $$2) {
      fit<bli> $$3 = new fit<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public agi b(bli $$0) {
      agi $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean c(bli $$0) {
      return super.a($$0) || $$0 instanceof ccj && ((ccj)$$0).gf();
   }
}
