public class goc implements goh<dtm> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gaz c;
   private final gaz d;
   private final gay e;
   private final gay f;

   public goc(goi.a $$0) {
      this($$0.f());
   }

   public goc(gew $$0) {
      this.c = new gaz($$0.a(gez.q));
      this.d = new gaz($$0.a(gez.s));
      this.e = new gay($$0.a(gez.r));
      this.f = new gay($$0.a(gez.t));
   }

   public void a(dtm $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      dwv $$6 = $$0.m();
      gaz $$8;
      gay $$9;
      float $$7;
      if ($$6.b() instanceof dip) {
         $$7 = -dya.b($$6.c(dip.b));
         $$8 = this.c;
         $$9 = this.e;
      } else {
         $$7 = -$$6.c(dsm.b).p();
         $$8 = this.d;
         $$9 = this.f;
      }

      long $$13 = $$0.i().ad();
      ji $$14 = $$0.aA_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$13, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$7, $$8, $$9, $$15, $$0.f(), $$0.b());
   }

   public void a(ffs $$0, glv $$1, int $$2, int $$3, cvk $$4, dto $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(ffs $$0, glv $$1, int $$2, int $$3, float $$4, gaz $$5, gay $$6, float $$7, cvk $$8, dto $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hgw.f.a($$1, gmf::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hgw.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(ffs $$0, glv $$1, int $$2, int $$3, gfa $$4, hgt $$5, boolean $$6, cvk $$7, dto $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(ffs $$0, glv $$1, int $$2, int $$3, gfa $$4, hgt $$5, boolean $$6, cvk $$7, dto $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gmf::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gmq.m : gmq.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dto.b $$12 = $$8.b().get($$11);
         hgt $$13 = $$6 ? gmq.a($$12.b()) : gmq.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(ffs $$0, glv $$1, int $$2, int $$3, gfa $$4, hgt $$5, cvk $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gmf::n), $$2, $$3, $$7);
   }
}
