import java.util.List;

public class guj<T extends dyc & dxw> implements gun<T> {
   public static final ali a = ali.b("textures/entity/beacon_beam.png");
   public static final int b = 2048;
   private static final float e = 96.0F;
   public static final float c = 0.2F;
   public static final float d = 0.25F;

   public guj(guo.a $$0) {
   }

   @Override
   public void a(T $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      long $$7 = $$0.i().ae();
      float $$8 = (float)$$6.d($$0.aB_().b()).i();
      gqz $$9 = frd.Q().t;
      float $$10 = $$9 != null && $$9.gH() ? 1.0F : Math.max(1.0F, $$8 / 96.0F);
      List<dxw.a> $$11 = $$0.a();
      int $$12 = 0;

      for (int $$13 = 0; $$13 < $$11.size(); $$13++) {
         dxw.a $$14 = $$11.get($$13);
         a($$2, $$3, $$1, $$10, $$7, $$12, $$13 == $$11.size() - 1 ? 2048 : $$14.c(), $$14.b());
         $$12 += $$14.c();
      }
   }

   private static void a(flo $$0, gsa $$1, float $$2, float $$3, long $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, a, $$2, 1.0F, $$4, $$5, $$6, $$7, 0.2F * $$3, 0.25F * $$3);
   }

   public static void a(flo $$0, gsa $$1, ali $$2, float $$3, float $$4, long $$5, int $$6, int $$7, int $$8, float $$9, float $$10) {
      int $$11 = $$6 + $$7;
      $$0.a();
      $$0.a(0.5, 0.0, 0.5);
      float $$12 = (float)Math.floorMod($$5, 40) + $$3;
      float $$13 = $$7 < 0 ? $$12 : -$$12;
      float $$14 = azo.i($$13 * 0.2F - (float)azo.d($$13 * 0.1F));
      $$0.a();
      $$0.a(a.d.rotationDegrees($$12 * 2.25F - 45.0F));
      float $$15 = 0.0F;
      float $$18 = 0.0F;
      float $$19 = -$$9;
      float $$20 = 0.0F;
      float $$21 = 0.0F;
      float $$22 = -$$9;
      float $$23 = 0.0F;
      float $$24 = 1.0F;
      float $$25 = -1.0F + $$14;
      float $$26 = (float)$$7 * $$4 * (0.5F / $$9) + $$25;
      a($$0, $$1.getBuffer(gsl.e($$2, false)), $$8, $$6, $$11, 0.0F, $$9, $$9, 0.0F, $$19, 0.0F, 0.0F, $$22, 0.0F, 1.0F, $$26, $$25);
      $$0.b();
      $$15 = -$$10;
      float $$28 = -$$10;
      $$18 = -$$10;
      $$19 = -$$10;
      $$23 = 0.0F;
      $$24 = 1.0F;
      $$25 = -1.0F + $$14;
      $$26 = (float)$$7 * $$4 + $$25;
      a($$0, $$1.getBuffer(gsl.e($$2, true)), axy.c(32, $$8), $$6, $$11, $$15, $$28, $$10, $$18, $$19, $$10, $$10, $$10, 0.0F, 1.0F, $$26, $$25);
      $$0.b();
   }

   private static void a(
      flo $$0,
      flr $$1,
      int $$2,
      int $$3,
      int $$4,
      float $$5,
      float $$6,
      float $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14,
      float $$15,
      float $$16
   ) {
      flo.a $$17 = $$0.c();
      a($$17, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$13, $$14, $$15, $$16);
      a($$17, $$1, $$2, $$3, $$4, $$11, $$12, $$9, $$10, $$13, $$14, $$15, $$16);
      a($$17, $$1, $$2, $$3, $$4, $$7, $$8, $$11, $$12, $$13, $$14, $$15, $$16);
      a($$17, $$1, $$2, $$3, $$4, $$9, $$10, $$5, $$6, $$13, $$14, $$15, $$16);
   }

   private static void a(
      flo.a $$0, flr $$1, int $$2, int $$3, int $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12
   ) {
      a($$0, $$1, $$2, $$4, $$5, $$6, $$10, $$11);
      a($$0, $$1, $$2, $$3, $$5, $$6, $$10, $$12);
      a($$0, $$1, $$2, $$3, $$7, $$8, $$9, $$12);
      a($$0, $$1, $$2, $$4, $$7, $$8, $$9, $$11);
   }

   private static void a(flo.a $$0, flr $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      $$1.a($$0, $$4, (float)$$3, $$5).a($$2).a($$6, $$7).b(hkq.d).c(15728880).b($$0, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public boolean a(T $$0) {
      return true;
   }

   @Override
   public int aV_() {
      return frd.Q().n.aH() * 16;
   }

   @Override
   public boolean a(T $$0, ffq $$1) {
      return ffq.b($$0.aB_()).d(1.0, 0.0, 1.0).a((jp)$$1.d(1.0, 0.0, 1.0), (double)this.aV_());
   }
}
