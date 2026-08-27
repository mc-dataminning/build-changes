import org.joml.Matrix3f;
import org.joml.Matrix4f;

public abstract class fxf<T extends cfh> extends fye<T> {
   public fxf(fyf.a $$0) {
      super($$0);
   }

   public void a(T $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aui.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aui.i($$2, $$0.O, $$0.dE())));
      int $$6 = 0;
      float $$7 = 0.0F;
      float $$8 = 0.5F;
      float $$9 = 0.0F;
      float $$10 = 0.15625F;
      float $$11 = 0.0F;
      float $$12 = 0.15625F;
      float $$13 = 0.15625F;
      float $$14 = 0.3125F;
      float $$15 = 0.05625F;
      float $$16 = (float)$$0.e - $$2;
      if ($$16 > 0.0F) {
         float $$17 = -aui.a($$16 * 3.0F) * $$16;
         $$3.a(a.f.rotationDegrees($$17));
      }

      $$3.a(a.b.rotationDegrees(45.0F));
      $$3.b(0.05625F, 0.05625F, 0.05625F);
      $$3.a(-4.0F, 0.0F, 0.0F);
      epx $$18 = $$4.getBuffer(fth.d(this.a($$0)));
      ept.a $$19 = $$3.c();
      Matrix4f $$20 = $$19.a();
      Matrix3f $$21 = $$19.b();
      this.a($$20, $$21, $$18, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, $$5);
      this.a($$20, $$21, $$18, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, $$5);
      this.a($$20, $$21, $$18, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, $$5);
      this.a($$20, $$21, $$18, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, $$5);
      this.a($$20, $$21, $$18, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, $$5);
      this.a($$20, $$21, $$18, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, $$5);
      this.a($$20, $$21, $$18, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, $$5);
      this.a($$20, $$21, $$18, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, $$5);

      for (int $$22 = 0; $$22 < 4; $$22++) {
         $$3.a(a.b.rotationDegrees(90.0F));
         this.a($$20, $$21, $$18, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, $$5);
         this.a($$20, $$21, $$18, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, $$5);
         this.a($$20, $$21, $$18, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, $$5);
         this.a($$20, $$21, $$18, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, $$5);
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(Matrix4f $$0, Matrix3f $$1, epx $$2, int $$3, int $$4, int $$5, float $$6, float $$7, int $$8, int $$9, int $$10, int $$11) {
      $$2.a($$0, (float)$$3, (float)$$4, (float)$$5).a(255, 255, 255, 255).a($$6, $$7).c(gdw.d).b($$11).a($$1, (float)$$8, (float)$$10, (float)$$9).e();
   }
}
