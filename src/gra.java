import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gra extends gqg<cmb, gwx, gat> {
   private static final all a = gjs.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final all[] b = gjs.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(all[]::new);

   public gra(gpa.a $$0) {
      super($$0, new gat($$0.a(gcb.ci)), 0.0F);
   }

   public ezr a(gwx $$0) {
      return $$0.a;
   }

   public boolean a(cmb $$0, gmo $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         ezr $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bup<?> $$6 = $$0.ar();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            ezr $$9 = ezr.c($$0.dy());
            return $$1.a(new ezm($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public all b(gwx $$0) {
      return a($$0.b);
   }

   public gwx c() {
      return new gwx();
   }

   public void a(cmb $$0, gwx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), ezr.c);
      $$1.b = $$0.gw();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aZ;
      $$1.e = $$0.aX;
      $$1.f = $$0.y();
   }

   public static all a(@Nullable cvc $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(gwx $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
