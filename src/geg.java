import java.util.List;

public class geg implements gek<dod> {
   public static final akn a = new akn("textures/entity/beacon_beam.png");
   public static final int b = 1024;

   public geg(gel.a $$0) {
   }

   public void a(dod $$0, float $$1, eyu $$2, gck $$3, int $$4, int $$5) {
      long $$6 = $$0.i().Y();
      List<dod.a> $$7 = $$0.b();
      int $$8 = 0;

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         dod.a $$10 = $$7.get($$9);
         a($$2, $$3, $$1, $$6, $$8, $$9 == $$7.size() - 1 ? 1024 : $$10.c(), $$10.b());
         $$8 += $$10.c();
      }
   }

   private static void a(eyu $$0, gck $$1, float $$2, long $$3, int $$4, int $$5, float[] $$6) {
      a($$0, $$1, a, $$2, 1.0F, $$3, $$4, $$5, $$6, 0.2F, 0.25F);
   }

   public static void a(eyu $$0, gck $$1, akn $$2, float $$3, float $$4, long $$5, int $$6, int $$7, float[] $$8, float $$9, float $$10) {
      int $$11 = $$6 + $$7;
      $$0.a();
      $$0.a(0.5, 0.0, 0.5);
      float $$12 = (float)Math.floorMod($$5, 40) + $$3;
      float $$13 = $$7 < 0 ? $$12 : -$$12;
      float $$14 = ayf.h($$13 * 0.2F - (float)ayf.d($$13 * 0.1F));
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
      a($$0, $$1.getBuffer(gcs.e($$2, false)), $$15, $$16, $$17, 1.0F, $$6, $$11, 0.0F, $$9, $$9, 0.0F, $$22, 0.0F, 0.0F, $$25, 0.0F, 1.0F, $$29, $$28);
      $$0.b();
      $$18 = -$$10;
      float $$31 = -$$10;
      $$21 = -$$10;
      $$22 = -$$10;
      $$26 = 0.0F;
      $$27 = 1.0F;
      $$28 = -1.0F + $$14;
      $$29 = (float)$$7 * $$4 + $$28;
      a($$0, $$1.getBuffer(gcs.e($$2, true)), $$15, $$16, $$17, 0.125F, $$6, $$11, $$18, $$31, $$10, $$21, $$22, $$10, $$10, $$10, 0.0F, 1.0F, $$29, $$28);
      $$0.b();
   }

   private static void a(
      eyu $$0,
      eyy $$1,
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
      eyu.a $$20 = $$0.c();
      a($$20, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$16, $$17, $$18, $$19);
      a($$20, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$14, $$15, $$12, $$13, $$16, $$17, $$18, $$19);
      a($$20, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10, $$11, $$14, $$15, $$16, $$17, $$18, $$19);
      a($$20, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$12, $$13, $$8, $$9, $$16, $$17, $$18, $$19);
   }

   private static void a(
      eyu.a $$0,
      eyy $$1,
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
      float $$15
   ) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$13, $$14);
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9, $$13, $$15);
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$10, $$11, $$12, $$15);
      a($$0, $$1, $$2, $$3, $$4, $$5, $$7, $$10, $$11, $$12, $$14);
   }

   private static void a(eyu.a $$0, eyy $$1, float $$2, float $$3, float $$4, float $$5, int $$6, float $$7, float $$8, float $$9, float $$10) {
      $$1.a($$0, $$7, (float)$$6, $$8).a($$2, $$3, $$4, $$5).a($$9, $$10).c(gnm.d).b(15728880).b($$0, 0.0F, 1.0F, 0.0F).e();
   }

   public boolean a(dod $$0) {
      return true;
   }

   @Override
   public int aQ_() {
      return 256;
   }

   public boolean a(dod $$0, eum $$1) {
      return eum.b($$0.aA_()).d(1.0, 0.0, 1.0).a((jh)$$1.d(1.0, 0.0, 1.0), (double)this.aQ_());
   }
}
