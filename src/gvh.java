import org.joml.Matrix4f;

public class gvh<T extends dzz> implements gun<T> {
   public static final ali a = ali.b("textures/environment/end_sky.png");
   public static final ali b = ali.b("textures/entity/end_portal.png");

   public gvh(guo.a $$0) {
   }

   public void a(T $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      Matrix4f $$7 = $$2.c().a();
      this.a($$0, $$7, $$3.getBuffer(this.d()));
   }

   private void a(T $$0, Matrix4f $$1, flr $$2) {
      float $$3 = this.c();
      float $$4 = this.b();
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, jb.d);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, jb.c);
      this.a($$0, $$1, $$2, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, jb.f);
      this.a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, jb.e);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$3, $$3, 0.0F, 0.0F, 1.0F, 1.0F, jb.a);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$4, $$4, 1.0F, 1.0F, 0.0F, 0.0F, jb.b);
   }

   private void a(T $$0, Matrix4f $$1, flr $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, jb $$11) {
      if ($$0.a($$11)) {
         $$2.a($$1, $$3, $$5, $$7);
         $$2.a($$1, $$4, $$5, $$8);
         $$2.a($$1, $$4, $$6, $$9);
         $$2.a($$1, $$3, $$6, $$10);
      }
   }

   protected float b() {
      return 0.75F;
   }

   protected float c() {
      return 0.375F;
   }

   protected gsl d() {
      return gsl.u();
   }
}
