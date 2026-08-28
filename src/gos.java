import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gos extends gny<clb, guo, fyt> {
   private static final alb a = ghm.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final alb[] b = ghm.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(alb[]::new);

   public gos(gms.a $$0) {
      super($$0, new fyt($$0.a(gaa.ch)), 0.0F);
   }

   public eye a(guo $$0) {
      return $$0.a;
   }

   public boolean a(clb $$0, gkh $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         eye $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            btq<?> $$6 = $$0.ao();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            eye $$9 = eye.c($$0.ds());
            return $$1.a(new exz($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public alb b(guo $$0) {
      return a($$0.b);
   }

   public guo c() {
      return new guo();
   }

   public void a(clb $$0, guo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), eye.c);
      $$1.b = $$0.gp();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aW;
      $$1.e = $$0.aU;
      $$1.f = $$0.y();
   }

   public static alb a(@Nullable cue $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(guo $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
