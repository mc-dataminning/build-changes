import org.joml.Quaternionf;
import org.joml.Vector3f;

public abstract class gbq extends gbd {
   protected float D;
   private final Quaternionf a = new Quaternionf();

   protected gbq(fxw $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.D = 0.1F * (this.r.i() * 0.5F + 0.5F) * 2.0F;
   }

   protected gbq(fxw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.D = 0.1F * (this.r.i() * 0.5F + 0.5F) * 2.0F;
   }

   public gbq.a p() {
      return gbq.a.a;
   }

   @Override
   public void a(fad $$0, fer $$1, float $$2) {
      evs $$3 = $$1.b();
      float $$4 = (float)(ayz.d((double)$$2, this.d, this.g) - $$3.a());
      float $$5 = (float)(ayz.d((double)$$2, this.e, this.h) - $$3.b());
      float $$6 = (float)(ayz.d((double)$$2, this.f, this.i) - $$3.c());
      this.p().setRotation(this.a, $$1, $$2);
      if (this.z != 0.0F) {
         this.a.rotateZ(ayz.i($$2, this.A, this.z));
      }

      Vector3f[] $$7 = new Vector3f[]{
         new Vector3f(-1.0F, -1.0F, 0.0F), new Vector3f(-1.0F, 1.0F, 0.0F), new Vector3f(1.0F, 1.0F, 0.0F), new Vector3f(1.0F, -1.0F, 0.0F)
      };
      float $$8 = this.b($$2);

      for (int $$9 = 0; $$9 < 4; $$9++) {
         Vector3f $$10 = $$7[$$9];
         $$10.rotate(this.a);
         $$10.mul($$8);
         $$10.add($$4, $$5, $$6);
      }

      float $$11 = this.c();
      float $$12 = this.d();
      float $$13 = this.e();
      float $$14 = this.f();
      int $$15 = this.a($$2);
      $$0.a((double)$$7[0].x(), (double)$$7[0].y(), (double)$$7[0].z()).a($$12, $$14).a(this.v, this.w, this.x, this.y).b($$15).e();
      $$0.a((double)$$7[1].x(), (double)$$7[1].y(), (double)$$7[1].z()).a($$12, $$13).a(this.v, this.w, this.x, this.y).b($$15).e();
      $$0.a((double)$$7[2].x(), (double)$$7[2].y(), (double)$$7[2].z()).a($$11, $$13).a(this.v, this.w, this.x, this.y).b($$15).e();
      $$0.a((double)$$7[3].x(), (double)$$7[3].y(), (double)$$7[3].z()).a($$11, $$14).a(this.v, this.w, this.x, this.y).b($$15).e();
   }

   public float b(float $$0) {
      return this.D;
   }

   @Override
   public gbd d(float $$0) {
      this.D *= $$0;
      return super.d($$0);
   }

   protected abstract float c();

   protected abstract float d();

   protected abstract float e();

   protected abstract float f();

   public interface a {
      gbq.a a = ($$0, $$1, $$2) -> $$0.set($$1.f());
      gbq.a b = ($$0, $$1, $$2) -> $$0.set(0.0F, $$1.f().y, 0.0F, $$1.f().w);

      void setRotation(Quaternionf var1, fer var2, float var3);
   }
}
