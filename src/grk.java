public class grk implements grp<dwb> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gec c;
   private final gec d;
   private final geb e;
   private final geb f;

   public grk(grq.a $$0) {
      this($$0.f());
   }

   public grk(gic $$0) {
      this.c = new gec($$0.a(gif.q));
      this.d = new gec($$0.a(gif.s));
      this.e = new geb($$0.a(gif.r));
      this.f = new geb($$0.a(gif.t));
   }

   public void a(dwb $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      dzo $$6 = $$0.m();
      gec $$8;
      geb $$9;
      float $$7;
      if ($$6.b() instanceof dkz) {
         $$7 = -eau.b($$6.c(dkz.b));
         $$8 = this.c;
         $$9 = this.e;
      } else {
         $$7 = -$$6.c(dvb.b).p();
         $$8 = this.d;
         $$9 = this.f;
      }

      long $$13 = $$0.i().ae();
      iu $$14 = $$0.aw_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$13, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$7, $$8, $$9, $$15, $$0.f(), $$0.b());
   }

   public void a(fiq $$0, gpd $$1, int $$2, int $$3, cxq $$4, dwd $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fiq $$0, gpd $$1, int $$2, int $$3, float $$4, gec $$5, geb $$6, float $$7, cxq $$8, dwd $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hkj.f.a($$1, gpn::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hkj.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fiq $$0, gpd $$1, int $$2, int $$3, gig $$4, hkg $$5, boolean $$6, cxq $$7, dwd $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fiq $$0, gpd $$1, int $$2, int $$3, gig $$4, hkg $$5, boolean $$6, cxq $$7, dwd $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gpn::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gpy.w : gpy.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dwd.b $$12 = $$8.b().get($$11);
         hkg $$13 = $$6 ? gpy.a($$12.b()) : gpy.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fiq $$0, gpd $$1, int $$2, int $$3, gig $$4, hkg $$5, cxq $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gpn::n), $$2, $$3, $$7);
   }
}
