import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fze extends fyz<bme> {
   private static final ahh a = new ahh("textures/entity/experience_orb.png");
   private static final fub f = fub.g(a);

   public fze(fza.a $$0) {
      super($$0);
      this.d = 0.15F;
      this.e = 0.75F;
   }

   protected int a(bme $$0, hx $$1) {
      return aup.a(super.a($$0, $$1) + 7, 0, 15);
   }

   public void a(bme $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      $$3.a();
      int $$6 = $$0.s();
      float $$7 = (float)($$6 % 4 * 16 + 0) / 64.0F;
      float $$8 = (float)($$6 % 4 * 16 + 16) / 64.0F;
      float $$9 = (float)($$6 / 4 * 16 + 0) / 64.0F;
      float $$10 = (float)($$6 / 4 * 16 + 16) / 64.0F;
      float $$11 = 1.0F;
      float $$12 = 0.5F;
      float $$13 = 0.25F;
      float $$14 = 255.0F;
      float $$15 = ((float)$$0.ah + $$2) / 2.0F;
      int $$16 = (int)((aup.a($$15 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      int $$17 = 255;
      int $$18 = (int)((aup.a($$15 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      $$3.a(0.0F, 0.1F, 0.0F);
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      float $$19 = 0.3F;
      $$3.b(0.3F, 0.3F, 0.3F);
      eqo $$20 = $$4.getBuffer(f);
      eqk.a $$21 = $$3.c();
      Matrix4f $$22 = $$21.a();
      Matrix3f $$23 = $$21.b();
      a($$20, $$22, $$23, -0.5F, -0.25F, $$16, 255, $$18, $$7, $$10, $$5);
      a($$20, $$22, $$23, 0.5F, -0.25F, $$16, 255, $$18, $$8, $$10, $$5);
      a($$20, $$22, $$23, 0.5F, 0.75F, $$16, 255, $$18, $$8, $$9, $$5);
      a($$20, $$22, $$23, -0.5F, 0.75F, $$16, 255, $$18, $$7, $$9, $$5);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(eqo $$0, Matrix4f $$1, Matrix3f $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$9, int $$10) {
      $$0.a($$1, $$3, $$4, 0.0F).a($$5, $$6, $$7, 128).a($$8, $$9).c(ges.d).b($$10).a($$2, 0.0F, 1.0F, 0.0F).e();
   }

   public ahh a(bme $$0) {
      return a;
   }
}
