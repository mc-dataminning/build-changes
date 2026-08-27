import org.joml.Matrix4f;

public class gdb<T extends dof> implements gci<T> {
   public static final ajv a = new ajv("textures/environment/end_sky.png");
   public static final ajv b = new ajv("textures/entity/end_portal.png");

   public gdb(gcj.a $$0) {
   }

   public void a(T $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      Matrix4f $$6 = $$2.c().a();
      this.a($$0, $$6, $$3.getBuffer(this.d()));
   }

   private void a(T $$0, Matrix4f $$1, ewv $$2) {
      float $$3 = this.c();
      float $$4 = this.b();
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, ij.d);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, ij.c);
      this.a($$0, $$1, $$2, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, ij.f);
      this.a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, ij.e);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$3, $$3, 0.0F, 0.0F, 1.0F, 1.0F, ij.a);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$4, $$4, 1.0F, 1.0F, 0.0F, 0.0F, ij.b);
   }

   private void a(T $$0, Matrix4f $$1, ewv $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, ij $$11) {
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

   protected gaq d() {
      return gaq.u();
   }
}
