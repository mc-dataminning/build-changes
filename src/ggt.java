import java.util.List;

public class ggt implements ggx<dqc> {
   public static final akr a = akr.b("textures/entity/beacon_beam.png");
   public static final int b = 1024;

   public ggt(ggy.a $$0) {
   }

   public void a(dqc $$0, float $$1, fbg $$2, gex $$3, int $$4, int $$5) {
      long $$6 = $$0.i().Z();
      List<dqc.a> $$7 = $$0.b();
      int $$8 = 0;

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         dqc.a $$10 = $$7.get($$9);
         a($$2, $$3, $$1, $$6, $$8, $$9 == $$7.size() - 1 ? 1024 : $$10.c(), $$10.b());
         $$8 += $$10.c();
      }
   }

   private static void a(fbg $$0, gex $$1, float $$2, long $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, a, $$2, 1.0F, $$3, $$4, $$5, $$6, 0.2F, 0.25F);
   }

   public static void a(fbg $$0, gex $$1, akr $$2, float $$3, float $$4, long $$5, int $$6, int $$7, int $$8, float $$9, float $$10) {
      int $$11 = $$6 + $$7;
      $$0.a();
      $$0.a(0.5, 0.0, 0.5);
      float $$12 = (float)Math.floorMod($$5, 40) + $$3;
      float $$13 = $$7 < 0 ? $$12 : -$$12;
      float $$14 = ayo.h($$13 * 0.2F - (float)ayo.d($$13 * 0.1F));
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
      a($$0, $$1.getBuffer(gff.e($$2, false)), $$8, $$6, $$11, 0.0F, $$9, $$9, 0.0F, $$19, 0.0F, 0.0F, $$22, 0.0F, 1.0F, $$26, $$25);
      $$0.b();
      $$15 = -$$10;
      float $$28 = -$$10;
      $$18 = -$$10;
      $$19 = -$$10;
      $$23 = 0.0F;
      $$24 = 1.0F;
      $$25 = -1.0F + $$14;
      $$26 = (float)$$7 * $$4 + $$25;
      a($$0, $$1.getBuffer(gff.e($$2, true)), axy.b.b(32, $$8), $$6, $$11, $$15, $$28, $$10, $$18, $$19, $$10, $$10, $$10, 0.0F, 1.0F, $$26, $$25);
      $$0.b();
   }

   private static void a(
      fbg $$0,
      fbk $$1,
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
      fbg.a $$17 = $$0.c();
      a($$17, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$13, $$14, $$15, $$16);
      a($$17, $$1, $$2, $$3, $$4, $$11, $$12, $$9, $$10, $$13, $$14, $$15, $$16);
      a($$17, $$1, $$2, $$3, $$4, $$7, $$8, $$11, $$12, $$13, $$14, $$15, $$16);
      a($$17, $$1, $$2, $$3, $$4, $$9, $$10, $$5, $$6, $$13, $$14, $$15, $$16);
   }

   private static void a(
      fbg.a $$0, fbk $$1, int $$2, int $$3, int $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12
   ) {
      a($$0, $$1, $$2, $$4, $$5, $$6, $$10, $$11);
      a($$0, $$1, $$2, $$3, $$5, $$6, $$10, $$12);
      a($$0, $$1, $$2, $$3, $$7, $$8, $$9, $$12);
      a($$0, $$1, $$2, $$4, $$7, $$8, $$9, $$11);
   }

   private static void a(fbg.a $$0, fbk $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      $$1.a($$0, $$4, (float)$$3, $$5).a($$2).a($$6, $$7).b(gqa.d).c(15728880).b($$0, 0.0F, 1.0F, 0.0F);
   }

   public boolean a(dqc $$0) {
      return true;
   }

   @Override
   public int aW_() {
      return 256;
   }

   public boolean a(dqc $$0, exa $$1) {
      return exa.b($$0.aD_()).d(1.0, 0.0, 1.0).a((jw)$$1.d(1.0, 0.0, 1.0), (double)this.aW_());
   }
}
