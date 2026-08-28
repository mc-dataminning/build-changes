import java.util.Optional;
import org.joml.Quaternionf;

public class gjv extends gjq {
   private final ecu a;
   private float b;
   private float F;
   private float G;
   private float H;

   gjv(gfi $$0, double $$1, double $$2, double $$3, ecu $$4, int $$5) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.D = 0.3F;
      this.a = $$4;
      this.t = $$5;
      Optional<fbx> $$6 = $$4.a($$0);
      if ($$6.isPresent()) {
         fbx $$7 = $$6.get();
         double $$8 = $$1 - $$7.a();
         double $$9 = $$2 - $$7.b();
         double $$10 = $$3 - $$7.c();
         this.F = this.b = (float)bae.d($$8, $$10);
         this.H = this.G = (float)bae.d($$9, Math.sqrt($$8 * $$8 + $$10 * $$10));
      }
   }

   @Override
   public void a(fgu $$0, fln $$1, float $$2) {
      float $$3 = bae.a(((float)this.s + $$2 - (float) (Math.PI * 2)) * 0.05F) * 2.0F;
      float $$4 = bae.h($$2, this.F, this.b);
      float $$5 = bae.h($$2, this.H, this.G) + (float) (Math.PI / 2);
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
   public giu b() {
      return giu.c;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         Optional<fbx> $$0 = this.a.a(this.c);
         if ($$0.isEmpty()) {
            this.k();
         } else {
            int $$1 = this.t - this.s;
            double $$2 = 1.0 / (double)$$1;
            fbx $$3 = $$0.get();
            this.g = bae.d($$2, this.g, $$3.a());
            this.h = bae.d($$2, this.h, $$3.b());
            this.i = bae.d($$2, this.i, $$3.c());
            double $$4 = this.g - $$3.a();
            double $$5 = this.h - $$3.b();
            double $$6 = this.i - $$3.c();
            this.F = this.b;
            this.b = (float)bae.d($$4, $$6);
            this.H = this.G;
            this.G = (float)bae.d($$5, Math.sqrt($$4 * $$4 + $$6 * $$6));
         }
      }
   }

   public static class a implements git<ly> {
      private final gjl a;

      public a(gjl $$0) {
         this.a = $$0;
      }

      public giq a(ly $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjv $$8 = new gjv($$1, $$2, $$3, $$4, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
