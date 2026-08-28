import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gug extends gtl<cmf, hag, gdv> {
   private static final akv a = gmu.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final akv[] b = gmu.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(akv[]::new);

   public gug(gsf.a $$0) {
      super($$0, new gdv($$0.a(gfd.cE)), 0.0F);
   }

   public fbb a(hag $$0) {
      return $$0.a;
   }

   public boolean a(cmf $$0, gpr $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fbb $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            but<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fbb $$9 = fbb.c($$0.dv());
            return $$1.a(new faw($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public akv b(hag $$0) {
      return a($$0.b);
   }

   public hag b() {
      return new hag();
   }

   public void a(cmf $$0, hag $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), fbb.c);
      $$1.b = $$0.gs();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aZ;
      $$1.e = $$0.aX;
      $$1.f = $$0.t();
   }

   public static akv a(@Nullable cvn $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(hag $$0, ffv $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
