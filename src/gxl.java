import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gxl extends gwq<cnz, hdj, ggx> {
   private static final ale a = gpy.s.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final ale[] j = gpy.t.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(ale[]::new);

   public gxl(gvk.a $$0) {
      super($$0, new ggx($$0.a(gif.cO)), 0.0F);
   }

   public fdw a(hdj $$0) {
      return $$0.a;
   }

   public boolean a(cnz $$0, gsw $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fdw $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bwj<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fdw $$9 = fdw.c($$0.dv());
            return $$1.a(new fdr($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public ale b(hdj $$0) {
      return a($$0.b);
   }

   public hdj b() {
      return new hdj();
   }

   public void a(cnz $$0, hdj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), fdw.c);
      $$1.b = $$0.t();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aX;
      $$1.e = $$0.aV;
      $$1.f = $$0.n();
   }

   public static ale a(@Nullable cxq $$0) {
      return $$0 == null ? a : j[$$0.a()];
   }

   protected void a(hdj $$0, fiq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
