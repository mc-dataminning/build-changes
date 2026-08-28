import org.joml.Quaternionf;
import org.joml.Vector3f;

public abstract class gfb extends geo {
   protected float D = 0.1F * (this.r.i() * 0.5F + 0.5F) * 2.0F;

   protected gfb(gbh $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected gfb(gbh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public gfb.a p() {
      return gfb.a.a;
   }

   @Override
   public void a(fdi $$0, fhu $$1, float $$2) {
      Quaternionf $$3 = new Quaternionf();
      this.p().setRotation($$3, $$1, $$2);
      if (this.z != 0.0F) {
         $$3.rotateZ(azd.h($$2, this.A, this.z));
      }

      this.a($$0, $$1, $$3, $$2);
   }

   protected void a(fdi $$0, fhu $$1, Quaternionf $$2, float $$3) {
      eys $$4 = $$1.b();
      float $$5 = (float)(azd.d((double)$$3, this.d, this.g) - $$4.a());
      float $$6 = (float)(azd.d((double)$$3, this.e, this.h) - $$4.b());
      float $$7 = (float)(azd.d((double)$$3, this.f, this.i) - $$4.c());
      this.a($$0, $$2, $$5, $$6, $$7, $$3);
   }

   protected void a(fdi $$0, Quaternionf $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = this.b($$5);
      float $$7 = this.c();
      float $$8 = this.d();
      float $$9 = this.e();
      float $$10 = this.f();
      int $$11 = this.a($$5);
      this.a($$0, $$1, $$2, $$3, $$4, 1.0F, -1.0F, $$6, $$8, $$10, $$11);
      this.a($$0, $$1, $$2, $$3, $$4, 1.0F, 1.0F, $$6, $$8, $$9, $$11);
      this.a($$0, $$1, $$2, $$3, $$4, -1.0F, 1.0F, $$6, $$7, $$9, $$11);
      this.a($$0, $$1, $$2, $$3, $$4, -1.0F, -1.0F, $$6, $$7, $$10, $$11);
   }

   private void a(fdi $$0, Quaternionf $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, int $$10) {
      Vector3f $$11 = new Vector3f($$5, $$6, 0.0F).rotate($$1).mul($$7).add($$2, $$3, $$4);
      $$0.a($$11.x(), $$11.y(), $$11.z()).a($$8, $$9).a(this.v, this.w, this.x, this.y).c($$10);
   }

   public float b(float $$0) {
      return this.D;
   }

   @Override
   public geo d(float $$0) {
      this.D *= $$0;
      return super.d($$0);
   }

   protected abstract float c();

   protected abstract float d();

   protected abstract float e();

   protected abstract float f();

   public interface a {
      gfb.a a = ($$0, $$1, $$2) -> $$0.set($$1.f());
      gfb.a b = ($$0, $$1, $$2) -> $$0.set(0.0F, $$1.f().y, 0.0F, $$1.f().w);

      void setRotation(Quaternionf var1, fhu var2, float var3);
   }
}
