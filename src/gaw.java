import org.joml.FrustumIntersection;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class gaw {
   public static final int a = 4;
   private final FrustumIntersection b = new FrustumIntersection();
   private final Matrix4f c = new Matrix4f();
   private Vector4f d;
   private double e;
   private double f;
   private double g;

   public gaw(Matrix4f $$0, Matrix4f $$1) {
      this.a($$0, $$1);
   }

   public gaw(gaw $$0) {
      this.b.set($$0.c);
      this.c.set($$0.c);
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.d = $$0.d;
   }

   public gaw a(int $$0) {
      double $$1 = Math.floor(this.e / (double)$$0) * (double)$$0;
      double $$2 = Math.floor(this.f / (double)$$0) * (double)$$0;
      double $$3 = Math.floor(this.g / (double)$$0) * (double)$$0;
      double $$4 = Math.ceil(this.e / (double)$$0) * (double)$$0;
      double $$5 = Math.ceil(this.f / (double)$$0) * (double)$$0;

      for (double $$6 = Math.ceil(this.g / (double)$$0) * (double)$$0;
         this.b
               .intersectAab(
                  (float)($$1 - this.e), (float)($$2 - this.f), (float)($$3 - this.g), (float)($$4 - this.e), (float)($$5 - this.f), (float)($$6 - this.g)
               )
            != -2;
         this.g = this.g - (double)(this.d.z() * 4.0F)
      ) {
         this.e = this.e - (double)(this.d.x() * 4.0F);
         this.f = this.f - (double)(this.d.y() * 4.0F);
      }

      return this;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   private void a(Matrix4f $$0, Matrix4f $$1) {
      $$1.mul($$0, this.c);
      this.b.set(this.c);
      this.d = this.c.transformTranspose(new Vector4f(0.0F, 0.0F, 1.0F, 0.0F));
   }

   public boolean a(epo $$0) {
      return this.a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
   }

   private boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - this.e);
      float $$7 = (float)($$1 - this.f);
      float $$8 = (float)($$2 - this.g);
      float $$9 = (float)($$3 - this.e);
      float $$10 = (float)($$4 - this.f);
      float $$11 = (float)($$5 - this.g);
      return this.b.testAab($$6, $$7, $$8, $$9, $$10, $$11);
   }
}
