import org.joml.Vector3f;

public class gii extends gik<ln> {
   private final Vector3f a;
   private final Vector3f b;

   protected gii(gfy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ln $$7, gkb $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      float $$9 = this.r.i() * 0.4F + 0.6F;
      this.a = this.a($$7.b(), $$9);
      this.b = this.a($$7.c(), $$9);
   }

   private Vector3f a(Vector3f $$0, float $$1) {
      return new Vector3f(this.a($$0.x(), $$1), this.a($$0.y(), $$1), this.a($$0.z(), $$1));
   }

   private void f(float $$0) {
      float $$1 = ((float)this.s + $$0) / ((float)this.t + 1.0F);
      Vector3f $$2 = new Vector3f(this.a).lerp(this.b, $$1);
      this.v = $$2.x();
      this.w = $$2.y();
      this.x = $$2.z();
   }

   @Override
   public void a(ffx $$0, fkq $$1, float $$2) {
      this.f($$2);
      super.a($$0, $$1, $$2);
   }

   public static class a implements gjj<ln> {
      private final gkb a;

      public a(gkb $$0) {
         this.a = $$0;
      }

      public gjg a(ln $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gii($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
