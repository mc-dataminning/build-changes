import org.joml.Matrix4f;

public class fye<T extends dkj> implements fxl<T> {
   public static final aiy a = new aiy("textures/environment/end_sky.png");
   public static final aiy b = new aiy("textures/entity/end_portal.png");

   public fye(fxm.a $$0) {
   }

   public void a(T $$0, float $$1, esa $$2, fvl $$3, int $$4, int $$5) {
      Matrix4f $$6 = $$2.c().a();
      this.a($$0, $$6, $$3.getBuffer(this.d()));
   }

   private void a(T $$0, Matrix4f $$1, ese $$2) {
      float $$3 = this.c();
      float $$4 = this.b();
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, ie.d);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, ie.c);
      this.a($$0, $$1, $$2, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, ie.f);
      this.a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, ie.e);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$3, $$3, 0.0F, 0.0F, 1.0F, 1.0F, ie.a);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$4, $$4, 1.0F, 1.0F, 0.0F, 0.0F, ie.b);
   }

   private void a(T $$0, Matrix4f $$1, ese $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, ie $$11) {
      if ($$0.a($$11)) {
         $$2.a($$1, $$3, $$5, $$7).e();
         $$2.a($$1, $$4, $$5, $$8).e();
         $$2.a($$1, $$4, $$6, $$9).e();
         $$2.a($$1, $$3, $$6, $$10).e();
      }
   }

   protected float b() {
      return 0.75F;
   }

   protected float c() {
      return 0.375F;
   }

   protected fvt d() {
      return fvt.u();
   }
}
