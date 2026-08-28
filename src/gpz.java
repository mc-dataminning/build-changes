import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gpz extends gpf<cls, gvw, fzs> {
   private static final alh a = gir.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final alh[] b = gir.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(alh[]::new);

   public gpz(gnz.a $$0) {
      super($$0, new fzs($$0.a(gba.ci)), 0.0F);
   }

   public ezh a(gvw $$0) {
      return $$0.a;
   }

   public boolean a(cls $$0, gln $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         ezh $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bug<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            ezh $$9 = ezh.c($$0.dx());
            return $$1.a(new ezc($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public alh b(gvw $$0) {
      return a($$0.b);
   }

   public gvw c() {
      return new gvw();
   }

   public void a(cls $$0, gvw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), ezh.c);
      $$1.b = $$0.gw();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aW;
      $$1.e = $$0.aU;
      $$1.f = $$0.y();
   }

   public static alh a(@Nullable cuu $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(gvw $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
