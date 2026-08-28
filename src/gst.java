public class gst implements gsy<dxa> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gfh c;
   private final gfh d;
   private final gfg e;
   private final gfg f;

   public gst(gsz.a $$0) {
      this($$0.f());
   }

   public gst(gjk $$0) {
      this.c = new gfh($$0.a(gjn.q));
      this.d = new gfh($$0.a(gjn.s));
      this.e = new gfg($$0.a(gjn.r));
      this.f = new gfg($$0.a(gjn.t));
   }

   public void a(dxa $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      eao $$7 = $$0.m();
      gfh $$9;
      gfg $$10;
      float $$8;
      if ($$7.b() instanceof dlr) {
         $$8 = -ebu.b($$7.c(dlr.b));
         $$9 = this.c;
         $$10 = this.e;
      } else {
         $$8 = -$$7.c(dwa.b).p();
         $$9 = this.d;
         $$10 = this.f;
      }

      long $$14 = $$0.i().ae();
      iv $$15 = $$0.ax_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$14, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$8, $$9, $$10, $$16, $$0.f(), $$0.b());
   }

   public void a(fjy $$0, gqm $$1, int $$2, int $$3, cyi $$4, dxc $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fjy $$0, gqm $$1, int $$2, int $$3, float $$4, gfh $$5, gfg $$6, float $$7, cyi $$8, dxc $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hlt.f.a($$1, gqx::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hlt.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fjy $$0, gqm $$1, int $$2, int $$3, gjo $$4, hlq $$5, boolean $$6, cyi $$7, dxc $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fjy $$0, gqm $$1, int $$2, int $$3, gjo $$4, hlq $$5, boolean $$6, cyi $$7, dxc $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gqx::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? grg.w : grg.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dxc.b $$12 = $$8.b().get($$11);
         hlq $$13 = $$6 ? grg.a($$12.b()) : grg.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fjy $$0, gqm $$1, int $$2, int $$3, gjo $$4, hlq $$5, cyi $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gqx::n), $$2, $$3, $$7);
   }
}
