import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gpo extends gou<clj, gvk, fzh> {
   private static final ale a = gig.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final ale[] b = gig.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(ale[]::new);

   public gpo(gno.a $$0) {
      super($$0, new fzh($$0.a(gap.ci)), 0.0F);
   }

   public eyw a(gvk $$0) {
      return $$0.a;
   }

   public boolean a(clj $$0, glc $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         eyw $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bty<?> $$6 = $$0.ao();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            eyw $$9 = eyw.c($$0.ds());
            return $$1.a(new eyr($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public ale b(gvk $$0) {
      return a($$0.b);
   }

   public gvk c() {
      return new gvk();
   }

   public void a(clj $$0, gvk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), eyw.c);
      $$1.b = $$0.gp();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aV;
      $$1.e = $$0.aT;
      $$1.f = $$0.y();
   }

   public static ale a(@Nullable cum $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(gvk $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
