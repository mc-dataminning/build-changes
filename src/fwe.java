import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fwe extends fvw<cei> {
   private static final agi a = new agi("textures/entity/fishing_hook.png");
   private static final frc f = frc.d(a);
   private static final double g = 960.0;

   public fwe(fvx.a $$0) {
      super($$0);
   }

   public void a(cei $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      cdu $$6 = $$0.s();
      if ($$6 != null) {
         $$3.a();
         $$3.a();
         $$3.b(0.5F, 0.5F, 0.5F);
         $$3.a(this.c.b());
         $$3.a(a.d.rotationDegrees(180.0F));
         enw.a $$7 = $$3.c();
         Matrix4f $$8 = $$7.a();
         Matrix3f $$9 = $$7.b();
         eoa $$10 = $$4.getBuffer(f);
         a($$10, $$8, $$9, $$5, 0.0F, 0, 0, 1);
         a($$10, $$8, $$9, $$5, 1.0F, 0, 1, 1);
         a($$10, $$8, $$9, $$5, 1.0F, 1, 1, 0);
         a($$10, $$8, $$9, $$5, 0.0F, 1, 0, 0);
         $$3.b();
         int $$11 = $$6.fn() == bla.b ? 1 : -1;
         clj $$12 = $$6.eU();
         if (!$$12.a(clm.qS)) {
            $$11 = -$$11;
         }

         float $$13 = $$6.x($$2);
         float $$14 = atm.a(atm.c($$13) * (float) Math.PI);
         float $$15 = atm.i($$2, $$6.aV, $$6.aU) * (float) (Math.PI / 180.0);
         double $$16 = (double)atm.a($$15);
         double $$17 = (double)atm.b($$15);
         double $$18 = (double)$$11 * 0.35;
         double $$19 = 0.8;
         double $$26;
         double $$27;
         double $$28;
         float $$29;
         if ((this.c.d == null || this.c.d.ax().a()) && $$6 == etd.N().s) {
            double $$24 = 960.0 / (double)this.c.d.ae().c().intValue();
            eju $$25 = this.c.b.j().a((float)$$11 * 0.525F, -0.1F);
            $$25 = $$25.a($$24);
            $$25 = $$25.b($$14 * 0.5F);
            $$25 = $$25.a(-$$14 * 0.7F);
            $$26 = atm.d((double)$$2, $$6.K, $$6.ds()) + $$25.c;
            $$27 = atm.d((double)$$2, $$6.L, $$6.du()) + $$25.d;
            $$28 = atm.d((double)$$2, $$6.M, $$6.dy()) + $$25.e;
            $$29 = $$6.cI();
         } else {
            $$26 = atm.d((double)$$2, $$6.K, $$6.ds()) - $$17 * $$18 - $$16 * 0.8;
            $$27 = $$6.L + (double)$$6.cI() + ($$6.du() - $$6.L) * (double)$$2 - 0.45;
            $$28 = atm.d((double)$$2, $$6.M, $$6.dy()) - $$16 * $$18 + $$17 * 0.8;
            $$29 = $$6.bX() ? -0.1875F : 0.0F;
         }

         double $$30 = atm.d((double)$$2, $$0.K, $$0.ds());
         double $$31 = atm.d((double)$$2, $$0.L, $$0.du()) + 0.25;
         double $$32 = atm.d((double)$$2, $$0.M, $$0.dy());
         float $$33 = (float)($$26 - $$30);
         float $$34 = (float)($$27 - $$31) + $$29;
         float $$35 = (float)($$28 - $$32);
         eoa $$36 = $$4.getBuffer(frc.x());
         enw.a $$37 = $$3.c();
         int $$38 = 16;

         for (int $$39 = 0; $$39 <= 16; $$39++) {
            a($$33, $$34, $$35, $$36, $$37, a($$39, 16), a($$39 + 1, 16));
         }

         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(eoa $$0, Matrix4f $$1, Matrix3f $$2, int $$3, float $$4, int $$5, int $$6, int $$7) {
      $$0.a($$1, $$4 - 0.5F, (float)$$5 - 0.5F, 0.0F).a(255, 255, 255, 255).a((float)$$6, (float)$$7).c(gbl.d).b($$3).a($$2, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(float $$0, float $$1, float $$2, eoa $$3, enw.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = atm.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4.a(), $$7, $$8, $$9).a(0, 0, 0, 255).a($$4.b(), $$10, $$11, $$12).e();
   }

   public agi a(cei $$0) {
      return a;
   }
}
