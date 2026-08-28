import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hal extends gzq<cph, hgl, gjw> {
   private static final alk a = gsw.s.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final alk[] j = gsw.t.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(alk[]::new);

   public hal(gyk.a $$0) {
      super($$0, new gjw($$0.a(glf.cU)), 0.0F);
   }

   public ffs a(hgl $$0) {
      return $$0.a;
   }

   public boolean a(cph $$0, gvw $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         ffs $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bxe<?> $$6 = $$0.an();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            ffs $$9 = ffs.c($$0.dv());
            return $$1.a(new ffn($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public alk b(hgl $$0) {
      return a($$0.b);
   }

   public hgl b() {
      return new hgl();
   }

   public void a(cph $$0, hgl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), ffs.c);
      $$1.b = $$0.t();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aX;
      $$1.e = $$0.aV;
      $$1.f = $$0.n();
   }

   public static alk a(@Nullable cyy $$0) {
      return $$0 == null ? a : j[$$0.a()];
   }

   protected void a(hgl $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
