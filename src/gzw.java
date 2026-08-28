import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gzw extends gzb<cpq, hfz, gjh> {
   private static final alr a = gsh.s.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final alr[] j = gsh.t.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(alr[]::new);

   public gzw(gxv.a $$0) {
      super($$0, new gjh($$0.a(gkq.cU)), 0.0F);
   }

   public fgc a(hfz $$0) {
      return $$0.a;
   }

   public boolean a(cpq $$0, gvh $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fgc $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bxn<?> $$6 = $$0.an();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fgc $$9 = fgc.c($$0.dv());
            return $$1.a(new ffx($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public alr b(hfz $$0) {
      return a($$0.b);
   }

   public hfz b() {
      return new hfz();
   }

   public void a(cpq $$0, hfz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), fgc.c);
      $$1.b = $$0.gv();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aX;
      $$1.e = $$0.aV;
      $$1.f = $$0.u();
   }

   public static alr a(@Nullable czi $$0) {
      return $$0 == null ? a : j[$$0.a()];
   }

   protected void a(hfz $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
