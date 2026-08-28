import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvl extends fuj {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fvl.a n;
   private final Supplier<hmc> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fvl(int $$0, int $$1, gla $$2, Supplier<hmc> $$3) {
      super(0, 0, $$0, $$1, wz.a);
      this.n = fvl.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(ftx $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.F() + (float)this.A() / 2.0F, (float)(this.G() + this.y()), 100.0F);
      float $$4 = (float)this.y() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.d();
      fkb.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.d();
      fkb.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = azo.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hqd $$0) {
   }

   @Override
   protected void a(fyi $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public ftu a(fyo $$0) {
      return null;
   }

   static record a(gjg a, gjg b) {
      public static fvl.a a(gla $$0) {
         gjg $$1 = new gjg($$0.a(gld.cs), false);
         gjg $$2 = new gjg($$0.a(gld.cy), true);
         return new fvl.a($$1, $$2);
      }

      public void a(ftx $$0, hmc $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         gjg $$2 = $$1.e() == hmc.a.a ? this.b : this.a;
         gsl $$3 = $$2.a($$1.a());
         $$0.a($$3x -> $$2.a($$0.c(), $$3x.getBuffer($$3), 15728880, hkq.d));
         $$0.c().b();
      }
   }
}
