import java.util.Optional;
import org.joml.Quaternionf;

public class ghj extends ghf {
   private final eao a;
   private float b;
   private float F;
   private float G;
   private float H;

   ghj(gcy $$0, double $$1, double $$2, double $$3, eao $$4, int $$5) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.D = 0.3F;
      this.a = $$4;
      this.t = $$5;
      Optional<ezr> $$6 = $$4.a($$0);
      if ($$6.isPresent()) {
         ezr $$7 = $$6.get();
         double $$8 = $$1 - $$7.a();
         double $$9 = $$2 - $$7.b();
         double $$10 = $$3 - $$7.c();
         this.F = this.b = (float)azn.d($$8, $$10);
         this.H = this.G = (float)azn.d($$9, Math.sqrt($$8 * $$8 + $$10 * $$10));
      }
   }

   @Override
   public void a(feo $$0, fjg $$1, float $$2) {
      float $$3 = azn.a(((float)this.s + $$2 - (float) (Math.PI * 2)) * 0.05F) * 2.0F;
      float $$4 = azn.h($$2, this.F, this.b);
      float $$5 = azn.h($$2, this.H, this.G) + (float) (Math.PI / 2);
      Quaternionf $$6 = new Quaternionf();
      $$6.rotationY($$4).rotateX(-$$5).rotateY($$3);
      this.a($$0, $$1, $$6, $$2);
      $$6.rotationY((float) -Math.PI + $$4).rotateX($$5).rotateY($$3);
      this.a($$0, $$1, $$6, $$2);
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public ggj b() {
      return ggj.c;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         Optional<ezr> $$0 = this.a.a(this.c);
         if ($$0.isEmpty()) {
            this.k();
         } else {
            int $$1 = this.t - this.s;
            double $$2 = 1.0 / (double)$$1;
            ezr $$3 = $$0.get();
            this.g = azn.d($$2, this.g, $$3.a());
            this.h = azn.d($$2, this.h, $$3.b());
            this.i = azn.d($$2, this.i, $$3.c());
            double $$4 = this.g - $$3.a();
            double $$5 = this.h - $$3.b();
            double $$6 = this.i - $$3.c();
            this.F = this.b;
            this.b = (float)azn.d($$4, $$6);
            this.H = this.G;
            this.G = (float)azn.d($$5, Math.sqrt($$4 * $$4 + $$6 * $$6));
         }
      }
   }

   public static class a implements ggi<lx> {
      private final gha a;

      public a(gha $$0) {
         this.a = $$0;
      }

      public ggf a(lx $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ghj $$8 = new ghj($$1, $$2, $$3, $$4, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
