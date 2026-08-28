import java.util.Optional;
import org.joml.Quaternionf;

public class gfx extends gft {
   private final dzt a;
   private float b;
   private float F;
   private float G;
   private float H;

   gfx(gbm $$0, double $$1, double $$2, double $$3, dzt $$4, int $$5) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.D = 0.3F;
      this.a = $$4;
      this.t = $$5;
      Optional<eyw> $$6 = $$4.a($$0);
      if ($$6.isPresent()) {
         eyw $$7 = $$6.get();
         double $$8 = $$1 - $$7.a();
         double $$9 = $$2 - $$7.b();
         double $$10 = $$3 - $$7.c();
         this.F = this.b = (float)azf.d($$8, $$10);
         this.H = this.G = (float)azf.d($$9, Math.sqrt($$8 * $$8 + $$10 * $$10));
      }
   }

   @Override
   public void a(fdm $$0, fhy $$1, float $$2) {
      float $$3 = azf.a(((float)this.s + $$2 - (float) (Math.PI * 2)) * 0.05F) * 2.0F;
      float $$4 = azf.h($$2, this.F, this.b);
      float $$5 = azf.h($$2, this.H, this.G) + (float) (Math.PI / 2);
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
   public gex b() {
      return gex.c;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         Optional<eyw> $$0 = this.a.a(this.c);
         if ($$0.isEmpty()) {
            this.k();
         } else {
            int $$1 = this.t - this.s;
            double $$2 = 1.0 / (double)$$1;
            eyw $$3 = $$0.get();
            this.g = azf.d($$2, this.g, $$3.a());
            this.h = azf.d($$2, this.h, $$3.b());
            this.i = azf.d($$2, this.i, $$3.c());
            double $$4 = this.g - $$3.a();
            double $$5 = this.h - $$3.b();
            double $$6 = this.i - $$3.c();
            this.F = this.b;
            this.b = (float)azf.d($$4, $$6);
            this.H = this.G;
            this.G = (float)azf.d($$5, Math.sqrt($$4 * $$4 + $$6 * $$6));
         }
      }
   }

   public static class a implements gew<lt> {
      private final gfo a;

      public a(gfo $$0) {
         this.a = $$0;
      }

      public get a(lt $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gfx $$8 = new gfx($$1, $$2, $$3, $$4, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
