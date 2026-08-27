import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fwo<T extends bjg, M extends fgi<T>> extends fxy<T, M> {
   private static final aex a = new aex("textures/entity/bee/bee_stinger.png");

   public fwo(fui<T, M> $$0) {
      super($$0);
   }

   @Override
   protected int a(T $$0) {
      return $$0.eO();
   }

   @Override
   protected void a(elp $$0, foe $$1, int $$2, biq $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = arx.c($$4 * $$4 + $$6 * $$6);
      float $$9 = (float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI);
      float $$10 = (float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI);
      $$0.a(0.0F, 0.0F, 0.0F);
      $$0.a(a.d.rotationDegrees($$9 - 90.0F));
      $$0.a(a.f.rotationDegrees($$10));
      float $$11 = 0.0F;
      float $$12 = 0.125F;
      float $$13 = 0.0F;
      float $$14 = 0.0625F;
      float $$15 = 0.03125F;
      $$0.a(a.b.rotationDegrees(45.0F));
      $$0.b(0.03125F, 0.03125F, 0.03125F);
      $$0.a(2.5F, 0.0F, 0.0F);
      elt $$16 = $$1.getBuffer(fom.e(a));

      for (int $$17 = 0; $$17 < 4; $$17++) {
         $$0.a(a.b.rotationDegrees(90.0F));
         elp.a $$18 = $$0.c();
         Matrix4f $$19 = $$18.a();
         Matrix3f $$20 = $$18.b();
         a($$16, $$19, $$20, -4.5F, -1, 0.0F, 0.0F, $$2);
         a($$16, $$19, $$20, 4.5F, -1, 0.125F, 0.0F, $$2);
         a($$16, $$19, $$20, 4.5F, 1, 0.125F, 0.0625F, $$2);
         a($$16, $$19, $$20, -4.5F, 1, 0.0F, 0.0625F, $$2);
      }
   }

   private static void a(elt $$0, Matrix4f $$1, Matrix3f $$2, float $$3, int $$4, float $$5, float $$6, int $$7) {
      $$0.a($$1, $$3, (float)$$4, 0.0F).a(255, 255, 255, 255).a($$5, $$6).c(fyv.d).b($$7).a($$2, 0.0F, 1.0F, 0.0F).e();
   }
}
