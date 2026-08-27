import org.joml.Matrix4f;

public class geh<T extends dpd> implements gdo<T> {
   public static final akh a = new akh("textures/environment/end_sky.png");
   public static final akh b = new akh("textures/entity/end_portal.png");

   public geh(gdp.a $$0) {
   }

   public void a(T $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      Matrix4f $$6 = $$2.c().a();
      this.a($$0, $$6, $$3.getBuffer(this.d()));
   }

   private void a(T $$0, Matrix4f $$1, eyb $$2) {
      float $$3 = this.c();
      float $$4 = this.b();
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, is.d);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, is.c);
      this.a($$0, $$1, $$2, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, is.f);
      this.a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, is.e);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$3, $$3, 0.0F, 0.0F, 1.0F, 1.0F, is.a);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$4, $$4, 1.0F, 1.0F, 0.0F, 0.0F, is.b);
   }

   private void a(T $$0, Matrix4f $$1, eyb $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, is $$11) {
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

   protected gbw d() {
      return gbw.u();
   }
}
