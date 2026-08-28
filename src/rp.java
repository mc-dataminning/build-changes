import javax.annotation.Nullable;

public class rp {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   @Nullable
   private static final awb e = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = azd.a($$1, -1.0F, 1.0F);
      return azd.g(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dfh a(boolean $$0, float $$1, float $$2, dft.a $$3, dfi.a $$4, @Nullable awb $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dfh a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dft.a $$7, dfi.a $$8, @Nullable awb $$9
   ) {
      dfn.a $$10 = new dfn.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dff.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dfh.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dfi.a $$0) {
      qs.a($$0);
      qs.av($$0);
      qs.b($$0);
      qs.c($$0);
      qs.ao($$0);
      qs.as($$0);
   }

   public static dfh a(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a();
      qs.a($$3);
      $$3.a(bun.b, new dft.c(btv.bs, 8, 4, 4));
      $$3.a(bun.b, new dft.c(btv.aG, 4, 2, 3));
      $$3.a(bun.b, new dft.c(btv.Q, 8, 2, 4));
      if ($$2) {
         qs.c($$3);
      } else {
         qs.b($$3);
         qs.a($$3, 100, 25, 100, false);
      }

      dfi.a $$4 = new dfi.a($$0, $$1);
      a($$4);
      qs.m($$4);
      qs.n($$4);
      qs.f($$4);
      qs.j($$4);
      $$4.a(eag.a.j, $$2 ? sl.ar : sl.as);
      qs.V($$4);
      qs.U($$4);
      qs.ac($$4);
      qs.ad($$4);
      qs.p($$4);
      awb $$5 = awc.a(awe.qn);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dfh a(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.i($$2);
      $$2.a(bun.b, new dft.c(btv.bs, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, awc.a(awe.qA));
   }

   public static dfh b(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.i($$2);
      $$2.a(bun.b, new dft.c(btv.ax, 40, 1, 2)).a(bun.a, new dft.c(btv.au, 2, 1, 3)).a(bun.b, new dft.c(btv.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, awc.a(awe.qz));
   }

   public static dfh c(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.i($$2);
      $$2.a(bun.b, new dft.c(btv.ax, 40, 1, 2)).a(bun.b, new dft.c(btv.aw, 80, 1, 2)).a(bun.a, new dft.c(btv.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, awc.a(awe.qB));
   }

   private static dfh a(jo<ekg> $$0, jo<eco<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dft.a $$6, awb $$7) {
      dfi.a $$8 = new dfi.a($$0, $$1);
      a($$8);
      qs.f($$8);
      qs.j($$8);
      if ($$3) {
         qs.r($$8);
      } else {
         if ($$5) {
            qs.q($$8);
         }

         if ($$4) {
            qs.F($$8);
         } else {
            qs.E($$8);
         }
      }

      qs.Y($$8);
      qs.I($$8);
      qs.ac($$8);
      qs.ad($$8);
      qs.ah($$8);
      if ($$4) {
         qs.ag($$8);
      } else {
         qs.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dfh b(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a();
      qs.a($$3);
      $$3.a(bun.b, new dft.c(btv.an, 5, 4, 6));
      qs.c($$3);
      dfi.a $$4 = new dfi.a($$0, $$1);
      a($$4);
      qs.f($$4);
      qs.j($$4);
      if ($$2) {
         qs.D($$4);
      } else {
         qs.C($$4);
      }

      qs.V($$4);
      qs.Z($$4);
      qs.ac($$4);
      qs.ad($$4);
      qs.h($$4);
      qs.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, e);
   }

   public static dfh d(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.f($$2);
      dfi.a $$3 = new dfi.a($$0, $$1);
      qs.al($$3);
      a($$3);
      qs.f($$3);
      qs.j($$3);
      qs.V($$3);
      qs.Z($$3);
      qs.T($$3);
      qs.ac($$3);
      qs.ai($$3);
      qs.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, awc.a(awe.qx));
   }

   public static dfh a(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dft.a $$5 = new dft.a();
      dfi.a $$6 = new dfi.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qs.e($$5);
         if ($$4) {
            $$6.a(eag.a.e, sg.a);
            $$6.a(eag.a.e, sg.b);
         }
      } else {
         qs.d($$5);
         qs.ab($$6);
         if ($$2) {
            $$6.a(eag.a.j, sl.d);
         }
      }

      qs.f($$6);
      qs.j($$6);
      if ($$3) {
         qs.H($$6);
         qs.V($$6);
         qs.Z($$6);
      } else {
         qs.S($$6);
      }

      qs.ac($$6);
      if ($$2) {
         $$6.a(eag.a.j, sl.E);
         $$6.a(eag.a.j, sl.e);
      } else {
         qs.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, e);
   }

   public static dfh e(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.h($$2);
      dfi.a $$3 = new dfi.a($$0, $$1);
      a($$3);
      qs.f($$3);
      qs.j($$3);
      qs.R($$3);
      qs.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, e);
   }

   public static dfh a(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2, boolean $$3) {
      dfi.a $$4 = new dfi.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qs.J($$4);
      }

      qs.f($$4);
      qs.j($$4);
      if ($$2) {
         qs.z($$4);
         qs.V($$4);
         qs.K($$4);
      } else {
         qs.y($$4);
         qs.Y($$4);
         qs.L($$4);
      }

      qs.ac($$4);
      qs.ad($$4);
      dft.a $$5 = new dft.a();
      qs.a($$5);
      $$5.a(bun.b, new dft.c(btv.ab, 1, 2, 6)).a(bun.b, new dft.c(btv.z, 1, 1, 1)).a(bun.b, new dft.c(btv.c, 10, 2, 3));
      qs.c($$5);
      if ($$3) {
         $$5.a(bun.b, new dft.c(btv.an, 8, 4, 4));
         $$5.a(bun.b, new dft.c(btv.bs, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, e);
   }

   public static dfh c(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a();
      qs.c($$3);
      $$3.a(bun.b, new dft.c(btv.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bun.b, new dft.c(btv.bs, 2, 4, 8));
         $$3.a(0.04F);
      }

      dfi.a $$4 = new dfi.a($$0, $$1);
      a($$4);
      qs.f($$4);
      qs.g($$4);
      qs.j($$4);
      if ($$2) {
         qs.G($$4);
      }

      qs.M($$4);
      qs.ac($$4);
      qs.ae($$4);
      return new dfh.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dfn.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dff.b).a(awc.a(awe.qy)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dfh a(dft.a $$0, int $$1, int $$2, dfi.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, e);
   }

   private static dfi.a s(jo<ekg> $$0, jo<eco<?>> $$1) {
      dfi.a $$2 = new dfi.a($$0, $$1);
      a($$2);
      qs.f($$2);
      qs.j($$2);
      qs.u($$2);
      qs.V($$2);
      qs.Z($$2);
      qs.ac($$2);
      qs.ad($$2);
      return $$2;
   }

   public static dfh d(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a();
      qs.a($$3, 3, 4, 15);
      $$3.a(bun.g, new dft.c(btv.aI, 15, 1, 5));
      dfi.a $$4 = s($$0, $$1);
      $$4.a(eag.a.j, $$2 ? sd.h : sd.c);
      qs.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dfh e(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a();
      qs.a($$3, 1, 4, 10);
      $$3.a(bun.f, new dft.c(btv.y, 1, 1, 2));
      dfi.a $$4 = s($$0, $$1);
      $$4.a(eag.a.j, $$2 ? sd.g : sd.b);
      qs.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dfh f(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a();
      if ($$2) {
         qs.a($$3, 8, 4, 8);
      } else {
         qs.a($$3, 10, 2, 15);
      }

      $$3.a(bun.g, new dft.c(btv.aF, 5, 1, 3)).a(bun.g, new dft.c(btv.bg, 25, 8, 8)).a(bun.f, new dft.c(btv.y, 2, 1, 2));
      dfi.a $$4 = s($$0, $$1);
      $$4.a(eag.a.j, $$2 ? sd.f : sd.a);
      qs.an($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dfh f(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a().a(bun.g, new dft.c(btv.aF, 15, 1, 3));
      qs.a($$2, 10, 4);
      dfi.a $$3 = s($$0, $$1).a(eag.a.j, sd.l).a(eag.a.j, sd.a).a(eag.a.j, sd.i);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dfh g(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a().a(bun.f, new dft.c(btv.aX, 1, 1, 4)).a(bun.g, new dft.c(btv.aI, 15, 1, 5)).a(bun.b, new dft.c(btv.aD, 1, 1, 2));
      qs.c($$3);
      $$3.a(bun.a, new dft.c(btv.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dfi.a $$5 = new dfi.a($$0, $$1);
      qs.aq($$5);
      a($$5);
      qs.ar($$5);
      qs.f($$5);
      qs.j($$5);
      qs.u($$5);
      qs.V($$5);
      qs.Z($$5);
      qs.ac($$5);
      qs.ad($$5);
      return new dfh.a().a(true).a($$4).a(dfh.d.b).b(0.5F).a(new dfn.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dff.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static dfh b(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dfi.a $$5 = new dfi.a($$0, $$1);
      a($$5);
      awb $$6;
      if ($$4) {
         $$6 = awc.a(awe.qw);
         $$5.a(eag.a.j, sl.Y);
      } else {
         $$6 = awc.a(awe.qm);
         qs.N($$5);
      }

      qs.f($$5);
      qs.j($$5);
      if ($$4) {
         $$5.a(eag.a.j, sl.aa);
         $$5.a(eag.a.j, sl.R);
         qs.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               qs.x($$5);
            } else {
               qs.v($$5);
            }
         } else {
            qs.w($$5);
         }

         qs.V($$5);
         qs.O($$5);
      }

      qs.ac($$5);
      qs.ad($$5);
      dft.a $$8 = new dft.a();
      qs.a($$8);
      qs.c($$8);
      if ($$4) {
         $$8.a(bun.b, new dft.c(btv.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bun.b, new dft.c(btv.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dfh h(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a();
      qs.a($$3);
      $$3.a(bun.b, new dft.c(btv.bs, 8, 4, 4)).a(bun.b, new dft.c(btv.aG, 4, 2, 3)).a(bun.b, new dft.c(btv.Q, 8, 2, 4));
      qs.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dfi.a $$5 = new dfi.a($$0, $$1);
      a($$5);
      qs.n($$5);
      qs.f($$5);
      qs.j($$5);
      qs.s($$5);
      qs.V($$5);
      qs.aa($$5);
      qs.ad($$5);
      if ($$2) {
         qs.o($$5);
      } else {
         qs.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, e);
   }

   public static dfh g(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.a($$2);
      qs.c($$2);
      dfi.a $$3 = new dfi.a($$0, $$1);
      a($$3);
      $$3.a(eag.a.j, sl.X);
      qs.N($$3);
      qs.f($$3);
      qs.j($$3);
      qs.V($$3);
      qs.O($$3);
      qs.ac($$3);
      qs.ad($$3);
      awb $$4 = awc.a(awe.qm);
      return new dfh.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dfn.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dfn.b.b).a(dff.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dfh h(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.a($$2);
      qs.a($$2, 70);
      $$2.a(bun.a, new dft.c(btv.aP, 1, 1, 1));
      $$2.a(bun.a, new dft.c(btv.l, 30, 4, 4));
      $$2.a(bun.b, new dft.c(btv.R, 10, 2, 5));
      dfi.a $$3 = new dfi.a($$0, $$1);
      qs.al($$3);
      a($$3);
      qs.f($$3);
      qs.k($$3);
      qs.P($$3);
      qs.ac($$3);
      qs.aj($$3);
      $$3.a(eag.a.j, sd.e);
      awb $$4 = awc.a(awe.ql);
      return new dfh.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dfn.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dfn.b.c).a(dff.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dfh i(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.a($$2, 70);
      $$2.a(bun.a, new dft.c(btv.aP, 1, 1, 1));
      $$2.a(bun.a, new dft.c(btv.l, 30, 4, 4));
      $$2.a(bun.b, new dft.c(btv.R, 10, 2, 5));
      $$2.a(bun.g, new dft.c(btv.bg, 25, 8, 8));
      dfi.a $$3 = new dfi.a($$0, $$1);
      qs.al($$3);
      a($$3);
      qs.f($$3);
      qs.l($$3);
      qs.Q($$3);
      $$3.a(eag.a.j, sd.e);
      awb $$4 = awc.a(awe.ql);
      return new dfh.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dfn.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dfn.b.c).a(dff.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dfh i(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dft.a $$3 = new dft.a().a(bun.f, new dft.c(btv.aX, 2, 1, 4)).a(bun.g, new dft.c(btv.aI, 5, 1, 5));
      qs.c($$3);
      $$3.a(bun.a, new dft.c(btv.B, $$2 ? 1 : 100, 1, 1));
      dfi.a $$4 = new dfi.a($$0, $$1);
      a($$4);
      qs.f($$4);
      qs.j($$4);
      qs.u($$4);
      qs.V($$4);
      qs.Z($$4);
      qs.ac($$4);
      qs.ad($$4);
      if (!$$2) {
         $$4.a(eag.a.j, sd.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, e);
   }

   public static dfh b(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2, boolean $$3) {
      dft.a $$4 = new dft.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bun.b, new dft.c(btv.bh, 5, 2, 5));
      }

      qs.c($$4);
      dfi.a $$6 = new dfi.a($$0, $$1);
      a($$6);
      qs.f($$6);
      qs.j($$6);
      qs.V($$6);
      qs.Z($$6);
      qs.ac($$6);
      qs.ad($$6);
      float $$7;
      if ($$2) {
         $$7 = 0.05F;
      } else if ($$3) {
         $$7 = 0.2F;
      } else {
         $$7 = 0.8F;
      }

      return a(true, $$7, $$5 ? 0.4F : 0.3F, $$2 ? 4020182 : 4159204, 329011, null, null, $$4, $$6, e);
   }

   public static dfh j(jo<ekg> $$0, jo<eco<?>> $$1) {
      dfi.a $$2 = new dfi.a($$0, $$1);
      $$2.a(eag.a.k, sg.n);
      return a(false, 0.5F, 0.5F, new dft.a(), $$2, e);
   }

   public static dfh j(jo<ekg> $$0, jo<eco<?>> $$1, boolean $$2) {
      dfi.a $$3 = new dfi.a($$0, $$1);
      dft.a $$4 = new dft.a();
      $$4.a(bun.b, new dft.c($$2 ? btv.az : btv.z, 1, 1, 2)).a(bun.b, new dft.c(btv.aG, 2, 2, 6)).a(bun.b, new dft.c(btv.aJ, 2, 2, 4));
      qs.c($$4);
      a($$3);
      qs.ab($$3);
      qs.f($$3);
      qs.j($$3);
      if ($$2) {
         qs.W($$3);
      } else {
         qs.X($$3);
      }

      qs.h($$3);
      qs.i($$3);
      awb $$5 = awc.a($$2 ? awe.qp : awe.qo);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dfh k(jo<ekg> $$0, jo<eco<?>> $$1) {
      dfi.a $$2 = new dfi.a($$0, $$1);
      dft.a $$3 = new dft.a();
      $$3.a(bun.b, new dft.c(btv.X, 5, 1, 3));
      qs.c($$3);
      a($$2);
      qs.ap($$2);
      qs.f($$2);
      qs.j($$2);
      qs.h($$2);
      qs.i($$2);
      awb $$4 = awc.a(awe.qr);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dfh l(jo<ekg> $$0, jo<eco<?>> $$1) {
      dfi.a $$2 = new dfi.a($$0, $$1);
      dft.a $$3 = new dft.a();
      $$3.a(bun.b, new dft.c(btv.X, 5, 1, 3));
      qs.c($$3);
      a($$2);
      qs.ap($$2);
      qs.f($$2);
      qs.j($$2);
      qs.h($$2);
      qs.i($$2);
      awb $$4 = awc.a(awe.qj);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dfh m(jo<ekg> $$0, jo<eco<?>> $$1) {
      dfi.a $$2 = new dfi.a($$0, $$1);
      dft.a $$3 = new dft.a();
      qs.c($$3);
      a($$2);
      qs.f($$2);
      qs.j($$2);
      qs.h($$2);
      qs.i($$2);
      awb $$4 = awc.a(awe.qu);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dfh n(jo<ekg> $$0, jo<eco<?>> $$1) {
      dfi.a $$2 = new dfi.a($$0, $$1);
      dft.a $$3 = new dft.a();
      $$3.a(bun.b, new dft.c(btv.aG, 4, 2, 3)).a(bun.b, new dft.c(btv.X, 5, 1, 3));
      qs.c($$3);
      a($$2);
      qs.ap($$2);
      qs.f($$2);
      qs.j($$2);
      qs.ad($$2);
      qs.h($$2);
      qs.i($$2);
      awb $$4 = awc.a(awe.qs);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dfh o(jo<ekg> $$0, jo<eco<?>> $$1) {
      dfi.a $$2 = new dfi.a($$0, $$1);
      dft.a $$3 = new dft.a();
      $$3.a(bun.b, new dft.c(btv.bs, 1, 1, 1)).a(bun.b, new dft.c(btv.aG, 8, 2, 3)).a(bun.b, new dft.c(btv.Q, 4, 2, 4));
      qs.c($$3);
      a($$2);
      qs.ap($$2);
      qs.f($$2);
      qs.j($$2);
      qs.t($$2);
      qs.ad($$2);
      qs.h($$2);
      qs.i($$2);
      awb $$4 = awc.a(awe.qi);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dfh p(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      $$2.a(bun.d, new dft.c(btv.f, 10, 4, 6));
      $$2.a(bun.g, new dft.c(btv.bg, 25, 8, 8));
      qs.c($$2);
      dfi.a $$3 = new dfi.a($$0, $$1);
      a($$3);
      qs.ab($$3);
      qs.f($$3);
      qs.B($$3);
      qs.j($$3);
      qs.A($$3);
      awb $$4 = awc.a(awe.qk);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dfh q(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      qs.g($$2);
      dfi.a $$3 = new dfi.a($$0, $$1);
      a($$3);
      qs.ab($$3);
      qs.a($$3, true);
      qs.j($$3);
      qs.S($$3);
      qs.ac($$3);
      qs.ad($$3);
      qs.d($$3);
      awb $$4 = awc.a(awe.qh);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dfh r(jo<ekg> $$0, jo<eco<?>> $$1) {
      dft.a $$2 = new dft.a();
      dfi.a $$3 = new dfi.a($$0, $$1);
      $$3.a(qu.a);
      $$3.a(qu.b);
      $$3.a(qu.c);
      qs.av($$3);
      qs.b($$3);
      qs.c($$3);
      qs.as($$3);
      qs.ab($$3);
      qs.f($$3);
      qs.j($$3);
      qs.S($$3);
      qs.ac($$3);
      qs.ad($$3);
      qs.e($$3);
      awb $$4 = awc.a(awe.qg);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
