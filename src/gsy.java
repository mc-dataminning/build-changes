import org.joml.Matrix4f;

public class gsy<T extends dyu> implements gse<T> {
   public static final alg a = alg.b("textures/environment/end_sky.png");
   public static final alg b = alg.b("textures/entity/end_portal.png");

   public gsy(gsf.a $$0) {
   }

   public void a(T $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      Matrix4f $$7 = $$2.c().a();
      this.a($$0, $$7, $$3.getBuffer(this.d()));
   }

   private void a(T $$0, Matrix4f $$1, fjg $$2) {
      float $$3 = this.c();
      float $$4 = this.b();
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, ja.d);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, ja.c);
      this.a($$0, $$1, $$2, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, ja.f);
      this.a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, ja.e);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$3, $$3, 0.0F, 0.0F, 1.0F, 1.0F, ja.a);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$4, $$4, 1.0F, 1.0F, 0.0F, 0.0F, ja.b);
   }

   private void a(T $$0, Matrix4f $$1, fjg $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, ja $$11) {
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

   protected gqc d() {
      return gqc.t();
   }
}
