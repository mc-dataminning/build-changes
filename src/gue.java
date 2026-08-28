import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gue extends gtj<cmd, hae, gdt> {
   private static final akv a = gms.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final akv[] b = gms.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(akv[]::new);

   public gue(gsd.a $$0) {
      super($$0, new gdt($$0.a(gfb.cE)), 0.0F);
   }

   public faz a(hae $$0) {
      return $$0.a;
   }

   public boolean a(cmd $$0, gpp $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         faz $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bur<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            faz $$9 = faz.c($$0.dv());
            return $$1.a(new fau($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public akv b(hae $$0) {
      return a($$0.b);
   }

   public hae b() {
      return new hae();
   }

   public void a(cmd $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), faz.c);
      $$1.b = $$0.gs();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aZ;
      $$1.e = $$0.aX;
      $$1.f = $$0.t();
   }

   public static akv a(@Nullable cvl $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(hae $$0, fft $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
