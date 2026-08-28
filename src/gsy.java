public class gsy implements gtd<dxf> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gfm c;
   private final gfm d;
   private final gfl e;
   private final gfl f;

   public gsy(gte.a $$0) {
      this($$0.f());
   }

   public gsy(gjp $$0) {
      this.c = new gfm($$0.a(gjs.q));
      this.d = new gfm($$0.a(gjs.s));
      this.e = new gfl($$0.a(gjs.r));
      this.f = new gfl($$0.a(gjs.t));
   }

   public void a(dxf $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      eat $$7 = $$0.m();
      gfm $$9;
      gfl $$10;
      float $$8;
      if ($$7.b() instanceof dlw) {
         $$8 = -ebz.b($$7.c(dlw.b));
         $$9 = this.c;
         $$10 = this.e;
      } else {
         $$8 = -$$7.c(dwf.b).p();
         $$9 = this.d;
         $$10 = this.f;
      }

      long $$14 = $$0.i().ae();
      iv $$15 = $$0.ax_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$14, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$8, $$9, $$10, $$16, $$0.f(), $$0.b());
   }

   public void a(fkd $$0, gqr $$1, int $$2, int $$3, cyl $$4, dxh $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fkd $$0, gqr $$1, int $$2, int $$3, float $$4, gfm $$5, gfl $$6, float $$7, cyl $$8, dxh $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hma.f.a($$1, grc::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hma.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fkd $$0, gqr $$1, int $$2, int $$3, gjt $$4, hlx $$5, boolean $$6, cyl $$7, dxh $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fkd $$0, gqr $$1, int $$2, int $$3, gjt $$4, hlx $$5, boolean $$6, cyl $$7, dxh $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, grc::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? grl.w : grl.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dxh.b $$12 = $$8.b().get($$11);
         hlx $$13 = $$6 ? grl.a($$12.b()) : grl.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fkd $$0, gqr $$1, int $$2, int $$3, gjt $$4, hlx $$5, cyl $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, grc::n), $$2, $$3, $$7);
   }
}
