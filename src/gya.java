import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gya extends gxf<cof, hdz, ghk> {
   private static final alg a = gqn.s.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final alg[] j = gqn.t.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(alg[]::new);

   public gya(gvz.a $$0) {
      super($$0, new ghk($$0.a(git.cQ)), 0.0F);
   }

   public fei a(hdz $$0) {
      return $$0.a;
   }

   public boolean a(cof $$0, gtl $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fei $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bwm<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fei $$9 = fei.c($$0.dv());
            return $$1.a(new fed($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public alg b(hdz $$0) {
      return a($$0.b);
   }

   public hdz b() {
      return new hdz();
   }

   public void a(cof $$0, hdz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), fei.c);
      $$1.b = $$0.t();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aX;
      $$1.e = $$0.aV;
      $$1.f = $$0.n();
   }

   public static alg a(@Nullable cxw $$0) {
      return $$0 == null ? a : j[$$0.a()];
   }

   protected void a(hdz $$0, fjc $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
