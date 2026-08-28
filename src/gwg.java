import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gwg extends gvl<cnp, hce, gfu> {
   private static final ald a = got.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final ald[] j = got.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(ald[]::new);

   public gwg(guf.a $$0) {
      super($$0, new gfu($$0.a(ghc.cO)), 0.0F);
   }

   public fcu a(hce $$0) {
      return $$0.a;
   }

   public boolean a(cnp $$0, grr $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fcu $$5 = $$0.L(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bwb<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fcu $$9 = fcu.c($$0.dv());
            return $$1.a(new fcp($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public ald b(hce $$0) {
      return a($$0.b);
   }

   public hce b() {
      return new hce();
   }

   public void a(cnp $$0, hce $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.L($$2), fcu.c);
      $$1.b = $$0.t();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.aW;
      $$1.e = $$0.aU;
      $$1.f = $$0.n();
   }

   public static ald a(@Nullable cwv $$0) {
      return $$0 == null ? a : j[$$0.a()];
   }

   protected void a(hce $$0, fho $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
