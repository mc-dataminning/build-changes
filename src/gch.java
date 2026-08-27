import org.joml.Matrix4f;

public class gch extends gcu {
   private final gqy a;
   private final float b;

   protected gch(fzn $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gdp $$7) {
      super($$0, $$1, $$2, $$3);
      this.j = 0.0;
      this.k = 0.0;
      this.l = 0.0;
      this.b = (float)$$4;
      this.t = 200;
      this.u = 0.0F;
      this.n = false;
      this.a = $$7.a(this.r);
   }

   @Override
   public gcy b() {
      return gcy.c;
   }

   @Override
   public void a(fbg $$0, ffu $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      $$3 *= $$3;
      float $$4 = 2.0F - $$3 * 2.0F;
      $$4 *= 0.2F;
      float $$5 = 0.125F;
      ewu $$6 = $$1.b();
      float $$7 = (float)(this.g - $$6.c);
      float $$8 = (float)(this.h - $$6.d);
      float $$9 = (float)(this.i - $$6.e);
      int $$10 = this.a($$2);
      float $$11 = this.a.c();
      float $$12 = this.a.d();
      float $$13 = this.a.g();
      float $$14 = this.a.h();
      Matrix4f $$15 = new Matrix4f().translation($$7, $$8, $$9);
      $$15.rotate((float) (Math.PI / 180.0) * this.b, 0.0F, 1.0F, 0.0F);
      $$0.a($$15, -0.125F, 0.0F, 0.125F).a($$11, $$14).a(this.v, this.w, this.x, $$4).b($$10).e();
      $$0.a($$15, 0.125F, 0.0F, 0.125F).a($$12, $$14).a(this.v, this.w, this.x, $$4).b($$10).e();
      $$0.a($$15, 0.125F, 0.0F, -0.125F).a($$12, $$13).a(this.v, this.w, this.x, $$4).b($$10).e();
      $$0.a($$15, -0.125F, 0.0F, -0.125F).a($$11, $$13).a(this.v, this.w, this.x, $$4).b($$10).e();
   }

   public static class a implements gcx<le> {
      private final gdp a;

      public a(gdp $$0) {
         this.a = $$0;
      }

      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gch($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
