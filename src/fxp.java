import java.util.List;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fxp implements fxt<dis> {
   public static final aiy a = new aiy("textures/entity/beacon_beam.png");
   public static final int b = 1024;

   public fxp(fxu.a $$0) {
   }

   public void a(dis $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      long $$6 = $$0.i().X();
      List<dis.a> $$7 = $$0.c();
      int $$8 = 0;

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         dis.a $$10 = $$7.get($$9);
         a($$2, $$3, $$1, $$6, $$8, $$9 == $$7.size() - 1 ? 1024 : $$10.c(), $$10.b());
         $$8 += $$10.c();
      }
   }

   private static void a(esh $$0, fvt $$1, float $$2, long $$3, int $$4, int $$5, float[] $$6) {
      a($$0, $$1, a, $$2, 1.0F, $$3, $$4, $$5, $$6, 0.2F, 0.25F);
   }

   public static void a(esh $$0, fvt $$1, aiy $$2, float $$3, float $$4, long $$5, int $$6, int $$7, float[] $$8, float $$9, float $$10) {
      int $$11 = $$6 + $$7;
      $$0.a();
      $$0.a(0.5, 0.0, 0.5);
      float $$12 = (float)Math.floorMod($$5, 40) + $$3;
      float $$13 = $$7 < 0 ? $$12 : -$$12;
      float $$14 = awi.h($$13 * 0.2F - (float)awi.d($$13 * 0.1F));
      float $$15 = $$8[0];
      float $$16 = $$8[1];
      float $$17 = $$8[2];
      $$0.a();
      $$0.a(a.d.rotationDegrees($$12 * 2.25F - 45.0F));
      float $$18 = 0.0F;
      float $$21 = 0.0F;
      float $$22 = -$$9;
      float $$23 = 0.0F;
      float $$24 = 0.0F;
      float $$25 = -$$9;
      float $$26 = 0.0F;
      float $$27 = 1.0F;
      float $$28 = -1.0F + $$14;
      float $$29 = (float)$$7 * $$4 * (0.5F / $$9) + $$28;
      a($$0, $$1.getBuffer(fwb.e($$2, false)), $$15, $$16, $$17, 1.0F, $$6, $$11, 0.0F, $$9, $$9, 0.0F, $$22, 0.0F, 0.0F, $$25, 0.0F, 1.0F, $$29, $$28);
      $$0.b();
      $$18 = -$$10;
      float $$31 = -$$10;
      $$21 = -$$10;
      $$22 = -$$10;
      $$26 = 0.0F;
      $$27 = 1.0F;
      $$28 = -1.0F + $$14;
      $$29 = (float)$$7 * $$4 + $$28;
      a($$0, $$1.getBuffer(fwb.e($$2, true)), $$15, $$16, $$17, 0.125F, $$6, $$11, $$18, $$31, $$10, $$21, $$22, $$10, $$10, $$10, 0.0F, 1.0F, $$29, $$28);
      $$0.b();
   }

   private static void a(
      esh $$0,
      esl $$1,
      float $$2,
      float $$3,
      float $$4,
      float $$5,
      int $$6,
      int $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14,
      float $$15,
      float $$16,
      float $$17,
      float $$18,
      float $$19
   ) {
      esh.a $$20 = $$0.c();
      Matrix4f $$21 = $$20.a();
      Matrix3f $$22 = $$20.b();
      a($$21, $$22, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$16, $$17, $$18, $$19);
      a($$21, $$22, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$14, $$15, $$12, $$13, $$16, $$17, $$18, $$19);
      a($$21, $$22, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10, $$11, $$14, $$15, $$16, $$17, $$18, $$19);
      a($$21, $$22, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$12, $$13, $$8, $$9, $$16, $$17, $$18, $$19);
   }

   private static void a(
      Matrix4f $$0,
      Matrix3f $$1,
      esl $$2,
      float $$3,
      float $$4,
      float $$5,
      float $$6,
      int $$7,
      int $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14,
      float $$15,
      float $$16
   ) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9, $$10, $$14, $$15);
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$9, $$10, $$14, $$16);
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$11, $$12, $$13, $$16);
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$11, $$12, $$13, $$15);
   }

   private static void a(Matrix4f $$0, Matrix3f $$1, esl $$2, float $$3, float $$4, float $$5, float $$6, int $$7, float $$8, float $$9, float $$10, float $$11) {
      $$2.a($$0, $$8, (float)$$7, $$9).a($$3, $$4, $$5, $$6).a($$10, $$11).c(ggs.d).b(15728880).a($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public boolean a(dis $$0) {
      return true;
   }

   @Override
   public int aT_() {
      return 256;
   }

   public boolean a(dis $$0, enz $$1) {
      return enz.b($$0.aE_()).d(1.0, 0.0, 1.0).a((it)$$1.d(1.0, 0.0, 1.0), (double)this.aT_());
   }
}
