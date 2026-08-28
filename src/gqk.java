import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gqk extends gpq<clx, gwh, gad> {
   private static final ali a = gjc.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final ali[] b = gjc.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(ali[]::new);

   public gqk(gok.a $$0) {
      super($$0, new gad($$0.a(gbl.ci)), 0.0F);
   }

   public ezn a(gwh $$0) {
      return $$0.a;
   }

   public boolean a(clx $$0, gly $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         ezn $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bul<?> $$6 = $$0.ar();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            ezn $$9 = ezn.c($$0.dx());
            return $$1.a(new ezi($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public ali b(gwh $$0) {
      return a($$0.b);
   }

   public gwh c() {
      return new gwh();
   }

   public void a(clx $$0, gwh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), ezn.c);
      $$1.b = $$0.gv();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aZ;
      $$1.e = $$0.aX;
      $$1.f = $$0.y();
   }

   public static ali a(@Nullable cuy $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(gwh $$0, feb $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
