import javax.annotation.Nullable;

public class ql {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final atv d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = aww.a($$1, -1.0F, 1.0F);
      return aww.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static cxy a(boolean $$0, float $$1, float $$2, cyk.a $$3, cxz.a $$4, @Nullable atv $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static cxy a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, cyk.a $$7, cxz.a $$8, @Nullable atv $$9
   ) {
      cye.a $$10 = new cye.a().b($$3).c($$4).a(12638463).d(a($$1)).a(cxw.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new cxy.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cxz.a $$0) {
      pk.a($$0);
      pk.aw($$0);
      pk.b($$0);
      pk.c($$0);
      pk.ap($$0);
      pk.at($$0);
   }

   public static cxy a(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a();
      pk.a($$3);
      $$3.a(bpr.b, new cyk.c(bpc.br, 8, 4, 4));
      $$3.a(bpr.b, new cyk.c(bpc.aF, 4, 2, 3));
      $$3.a(bpr.b, new cyk.c(bpc.Q, 8, 2, 4));
      if ($$2) {
         pk.c($$3);
      } else {
         pk.b($$3);
         pk.a($$3, 100, 25, 100, false);
      }

      cxz.a $$4 = new cxz.a($$0, $$1);
      a($$4);
      pk.m($$4);
      pk.n($$4);
      pk.f($$4);
      pk.j($$4);
      $$4.a(dsi.b.j, $$2 ? rh.ar : rh.as);
      pk.V($$4);
      pk.U($$4);
      pk.ac($$4);
      pk.ad($$4);
      pk.p($$4);
      atv $$5 = atw.a(aty.pK);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static cxy a(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, atw.a(aty.pX));
   }

   public static cxy b(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.i($$2);
      $$2.a(bpr.b, new cyk.c(bpc.aw, 40, 1, 2)).a(bpr.a, new cyk.c(bpc.at, 2, 1, 3)).a(bpr.b, new cyk.c(bpc.av, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, atw.a(aty.pW));
   }

   public static cxy c(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.i($$2);
      $$2.a(bpr.b, new cyk.c(bpc.aw, 40, 1, 2)).a(bpr.b, new cyk.c(bpc.av, 80, 1, 2)).a(bpr.a, new cyk.c(bpc.at, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, atw.a(aty.pY));
   }

   private static cxy a(im<ecg> $$0, im<dup<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, cyk.a $$6, atv $$7) {
      cxz.a $$8 = new cxz.a($$0, $$1);
      a($$8);
      pk.f($$8);
      pk.j($$8);
      if ($$3) {
         pk.r($$8);
      } else {
         if ($$5) {
            pk.q($$8);
         }

         if ($$4) {
            pk.F($$8);
         } else {
            pk.E($$8);
         }
      }

      pk.Y($$8);
      pk.I($$8);
      pk.ac($$8);
      pk.ad($$8);
      pk.ah($$8);
      if ($$4) {
         pk.ag($$8);
      } else {
         pk.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static cxy b(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a();
      pk.a($$3);
      $$3.a(bpr.b, new cyk.c(bpc.am, 5, 4, 6));
      pk.c($$3);
      cxz.a $$4 = new cxz.a($$0, $$1);
      a($$4);
      pk.f($$4);
      pk.j($$4);
      if ($$2) {
         pk.D($$4);
      } else {
         pk.C($$4);
      }

      pk.V($$4);
      pk.Z($$4);
      pk.ac($$4);
      pk.ad($$4);
      pk.h($$4);
      pk.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static cxy d(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.f($$2);
      cxz.a $$3 = new cxz.a($$0, $$1);
      pk.al($$3);
      a($$3);
      pk.f($$3);
      pk.j($$3);
      pk.V($$3);
      pk.Z($$3);
      pk.T($$3);
      pk.ac($$3);
      pk.ai($$3);
      pk.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, atw.a(aty.pU));
   }

   public static cxy a(im<ecg> $$0, im<dup<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cyk.a $$5 = new cyk.a();
      cxz.a $$6 = new cxz.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         pk.e($$5);
         if ($$4) {
            $$6.a(dsi.b.e, rc.a);
            $$6.a(dsi.b.e, rc.b);
         }
      } else {
         pk.d($$5);
         pk.ab($$6);
         if ($$2) {
            $$6.a(dsi.b.j, rh.d);
         }
      }

      pk.f($$6);
      pk.j($$6);
      if ($$3) {
         pk.H($$6);
         pk.V($$6);
         pk.Z($$6);
      } else {
         pk.S($$6);
      }

      pk.ac($$6);
      if ($$2) {
         $$6.a(dsi.b.j, rh.E);
         $$6.a(dsi.b.j, rh.e);
      } else {
         pk.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static cxy e(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.h($$2);
      cxz.a $$3 = new cxz.a($$0, $$1);
      a($$3);
      pk.f($$3);
      pk.j($$3);
      pk.R($$3);
      pk.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static cxy a(im<ecg> $$0, im<dup<?>> $$1, boolean $$2, boolean $$3) {
      cxz.a $$4 = new cxz.a($$0, $$1);
      a($$4);
      if (!$$2) {
         pk.J($$4);
      }

      pk.f($$4);
      pk.j($$4);
      if ($$2) {
         pk.z($$4);
         pk.V($$4);
         pk.K($$4);
      } else {
         pk.y($$4);
         pk.Y($$4);
         pk.L($$4);
      }

      pk.ac($$4);
      pk.ad($$4);
      cyk.a $$5 = new cyk.a();
      pk.a($$5);
      $$5.a(bpr.b, new cyk.c(bpc.ab, 1, 2, 6)).a(bpr.b, new cyk.c(bpc.z, 1, 1, 1)).a(bpr.b, new cyk.c(bpc.d, 10, 2, 3));
      pk.c($$5);
      if ($$3) {
         $$5.a(bpr.b, new cyk.c(bpc.am, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static cxy c(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a();
      pk.c($$3);
      $$3.a(bpr.b, new cyk.c(bpc.d, 1, 1, 2));
      $$3.a(0.03F);
      cxz.a $$4 = new cxz.a($$0, $$1);
      a($$4);
      pk.f($$4);
      pk.g($$4);
      pk.j($$4);
      if ($$2) {
         pk.G($$4);
      }

      pk.M($$4);
      pk.ac($$4);
      pk.ae($$4);
      return new cxy.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new cye.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(cxw.b).a(atw.a(aty.pV)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static cxy a(cyk.a $$0, int $$1, int $$2, cxz.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cxz.a s(im<ecg> $$0, im<dup<?>> $$1) {
      cxz.a $$2 = new cxz.a($$0, $$1);
      a($$2);
      pk.f($$2);
      pk.j($$2);
      pk.u($$2);
      pk.V($$2);
      pk.Z($$2);
      pk.ac($$2);
      pk.ad($$2);
      return $$2;
   }

   public static cxy d(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a();
      pk.a($$3, 3, 4, 15);
      $$3.a(bpr.g, new cyk.c(bpc.aH, 15, 1, 5));
      cxz.a $$4 = s($$0, $$1);
      $$4.a(dsi.b.j, $$2 ? qz.h : qz.c);
      pk.an($$4);
      pk.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static cxy e(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a();
      pk.a($$3, 1, 4, 10);
      $$3.a(bpr.f, new cyk.c(bpc.y, 1, 1, 2));
      cxz.a $$4 = s($$0, $$1);
      $$4.a(dsi.b.j, $$2 ? qz.g : qz.b);
      pk.an($$4);
      pk.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static cxy f(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a();
      if ($$2) {
         pk.a($$3, 8, 4, 8);
      } else {
         pk.a($$3, 10, 2, 15);
      }

      $$3.a(bpr.g, new cyk.c(bpc.aE, 5, 1, 3)).a(bpr.g, new cyk.c(bpc.bf, 25, 8, 8)).a(bpr.f, new cyk.c(bpc.y, 2, 1, 2));
      cxz.a $$4 = s($$0, $$1);
      $$4.a(dsi.b.j, $$2 ? qz.f : qz.a);
      if ($$2) {
         pk.an($$4);
      }

      pk.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static cxy f(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a().a(bpr.g, new cyk.c(bpc.aE, 15, 1, 3));
      pk.a($$2, 10, 4);
      cxz.a $$3 = s($$0, $$1).a(dsi.b.j, qz.m).a(dsi.b.j, qz.a).a(dsi.b.j, qz.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static cxy g(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a().a(bpr.f, new cyk.c(bpc.aW, 1, 1, 4)).a(bpr.g, new cyk.c(bpc.aH, 15, 1, 5)).a(bpr.b, new cyk.c(bpc.aC, 1, 1, 2));
      pk.c($$3);
      $$3.a(bpr.a, new cyk.c(bpc.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cxz.a $$5 = new cxz.a($$0, $$1);
      pk.ar($$5);
      a($$5);
      pk.as($$5);
      pk.f($$5);
      pk.j($$5);
      pk.u($$5);
      pk.V($$5);
      pk.Z($$5);
      pk.ac($$5);
      pk.ad($$5);
      return new cxy.a().a(true).a($$4).a(cxy.d.b).b(0.5F).a(new cye.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(cxw.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static cxy b(im<ecg> $$0, im<dup<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cxz.a $$5 = new cxz.a($$0, $$1);
      a($$5);
      atv $$6;
      if ($$4) {
         $$6 = atw.a(aty.pT);
         $$5.a(dsi.b.j, rh.Y);
      } else {
         $$6 = atw.a(aty.pJ);
         pk.N($$5);
      }

      pk.f($$5);
      pk.j($$5);
      if ($$4) {
         $$5.a(dsi.b.j, rh.aa);
         $$5.a(dsi.b.j, rh.R);
         pk.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               pk.x($$5);
            } else {
               pk.v($$5);
            }
         } else {
            pk.w($$5);
         }

         pk.V($$5);
         pk.O($$5);
      }

      pk.ac($$5);
      pk.ad($$5);
      cyk.a $$8 = new cyk.a();
      pk.a($$8);
      pk.c($$8);
      if ($$4) {
         $$8.a(bpr.b, new cyk.c(bpc.aF, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bpr.b, new cyk.c(bpc.br, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static cxy h(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a();
      pk.a($$3);
      $$3.a(bpr.b, new cyk.c(bpc.br, 8, 4, 4)).a(bpr.b, new cyk.c(bpc.aF, 4, 2, 3)).a(bpr.b, new cyk.c(bpc.Q, 8, 2, 4));
      pk.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cxz.a $$5 = new cxz.a($$0, $$1);
      a($$5);
      pk.n($$5);
      pk.f($$5);
      pk.j($$5);
      pk.s($$5);
      pk.V($$5);
      pk.aa($$5);
      pk.ad($$5);
      if ($$2) {
         pk.o($$5);
      } else {
         pk.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static cxy g(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.a($$2);
      pk.c($$2);
      cxz.a $$3 = new cxz.a($$0, $$1);
      a($$3);
      $$3.a(dsi.b.j, rh.X);
      pk.N($$3);
      pk.f($$3);
      pk.j($$3);
      pk.V($$3);
      pk.O($$3);
      pk.ac($$3);
      pk.ad($$3);
      atv $$4 = atw.a(aty.pJ);
      return new cxy.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new cye.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(cye.b.b).a(cxw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cxy h(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.a($$2);
      pk.c($$2);
      $$2.a(bpr.a, new cyk.c(bpc.aO, 1, 1, 1));
      $$2.a(bpr.b, new cyk.c(bpc.R, 10, 2, 5));
      cxz.a $$3 = new cxz.a($$0, $$1);
      pk.al($$3);
      a($$3);
      pk.f($$3);
      pk.k($$3);
      pk.P($$3);
      pk.ac($$3);
      pk.aj($$3);
      $$3.a(dsi.b.j, qz.e);
      atv $$4 = atw.a(aty.pI);
      return new cxy.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cye.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(cye.b.c).a(cxw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cxy i(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.c($$2);
      $$2.a(bpr.a, new cyk.c(bpc.aO, 1, 1, 1));
      $$2.a(bpr.b, new cyk.c(bpc.R, 10, 2, 5));
      $$2.a(bpr.g, new cyk.c(bpc.bf, 25, 8, 8));
      cxz.a $$3 = new cxz.a($$0, $$1);
      pk.al($$3);
      a($$3);
      pk.f($$3);
      pk.l($$3);
      pk.Q($$3);
      $$3.a(dsi.b.j, qz.e);
      atv $$4 = atw.a(aty.pI);
      return new cxy.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cye.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(cye.b.c).a(cxw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cxy i(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cyk.a $$3 = new cyk.a().a(bpr.f, new cyk.c(bpc.aW, 2, 1, 4)).a(bpr.g, new cyk.c(bpc.aH, 5, 1, 5));
      pk.c($$3);
      $$3.a(bpr.a, new cyk.c(bpc.B, $$2 ? 1 : 100, 1, 1));
      cxz.a $$4 = new cxz.a($$0, $$1);
      a($$4);
      pk.f($$4);
      pk.j($$4);
      pk.u($$4);
      pk.V($$4);
      pk.Z($$4);
      pk.ac($$4);
      pk.ad($$4);
      if (!$$2) {
         $$4.a(dsi.b.j, qz.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static cxy b(im<ecg> $$0, im<dup<?>> $$1, boolean $$2, boolean $$3) {
      cyk.a $$4 = new cyk.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bpr.b, new cyk.c(bpc.bg, 5, 2, 5));
      }

      pk.c($$4);
      cxz.a $$6 = new cxz.a($$0, $$1);
      a($$6);
      pk.f($$6);
      pk.j($$6);
      pk.V($$6);
      pk.Z($$6);
      pk.ac($$6);
      pk.ad($$6);
      float $$7;
      if ($$2) {
         $$7 = 0.05F;
      } else if ($$3) {
         $$7 = 0.2F;
      } else {
         $$7 = 0.8F;
      }

      return a(true, $$7, $$5 ? 0.4F : 0.3F, $$2 ? 4020182 : 4159204, 329011, null, null, $$4, $$6, d);
   }

   public static cxy j(im<ecg> $$0, im<dup<?>> $$1) {
      cxz.a $$2 = new cxz.a($$0, $$1);
      $$2.a(dsi.b.k, rc.n);
      return a(false, 0.5F, 0.5F, new cyk.a(), $$2, d);
   }

   public static cxy j(im<ecg> $$0, im<dup<?>> $$1, boolean $$2) {
      cxz.a $$3 = new cxz.a($$0, $$1);
      cyk.a $$4 = new cyk.a();
      $$4.a(bpr.b, new cyk.c($$2 ? bpc.ay : bpc.z, 1, 1, 2)).a(bpr.b, new cyk.c(bpc.aF, 2, 2, 6)).a(bpr.b, new cyk.c(bpc.aI, 2, 2, 4));
      pk.c($$4);
      a($$3);
      pk.ab($$3);
      pk.f($$3);
      pk.j($$3);
      if ($$2) {
         pk.W($$3);
      } else {
         pk.X($$3);
      }

      pk.h($$3);
      pk.i($$3);
      atv $$5 = atw.a($$2 ? aty.pM : aty.pL);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static cxy k(im<ecg> $$0, im<dup<?>> $$1) {
      cxz.a $$2 = new cxz.a($$0, $$1);
      cyk.a $$3 = new cyk.a();
      $$3.a(bpr.b, new cyk.c(bpc.X, 5, 1, 3));
      pk.c($$3);
      a($$2);
      pk.aq($$2);
      pk.f($$2);
      pk.j($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pO);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cxy l(im<ecg> $$0, im<dup<?>> $$1) {
      cxz.a $$2 = new cxz.a($$0, $$1);
      cyk.a $$3 = new cyk.a();
      $$3.a(bpr.b, new cyk.c(bpc.X, 5, 1, 3));
      pk.c($$3);
      a($$2);
      pk.aq($$2);
      pk.f($$2);
      pk.j($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pG);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cxy m(im<ecg> $$0, im<dup<?>> $$1) {
      cxz.a $$2 = new cxz.a($$0, $$1);
      cyk.a $$3 = new cyk.a();
      pk.c($$3);
      a($$2);
      pk.f($$2);
      pk.j($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pR);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static cxy n(im<ecg> $$0, im<dup<?>> $$1) {
      cxz.a $$2 = new cxz.a($$0, $$1);
      cyk.a $$3 = new cyk.a();
      $$3.a(bpr.b, new cyk.c(bpc.aF, 4, 2, 3)).a(bpr.b, new cyk.c(bpc.X, 5, 1, 3));
      pk.c($$3);
      a($$2);
      pk.aq($$2);
      pk.f($$2);
      pk.j($$2);
      pk.ad($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pP);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static cxy o(im<ecg> $$0, im<dup<?>> $$1) {
      cxz.a $$2 = new cxz.a($$0, $$1);
      cyk.a $$3 = new cyk.a();
      pk.a($$3);
      $$3.a(bpr.b, new cyk.c(bpc.br, 8, 4, 4)).a(bpr.b, new cyk.c(bpc.aF, 4, 2, 3)).a(bpr.b, new cyk.c(bpc.Q, 8, 2, 4));
      pk.c($$3);
      a($$2);
      pk.aq($$2);
      pk.f($$2);
      pk.j($$2);
      pk.t($$2);
      pk.ad($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pF);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static cxy p(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      $$2.a(bpr.d, new cyk.c(bpc.g, 10, 4, 6));
      $$2.a(bpr.g, new cyk.c(bpc.bf, 25, 8, 8));
      pk.c($$2);
      cxz.a $$3 = new cxz.a($$0, $$1);
      a($$3);
      pk.ab($$3);
      pk.f($$3);
      pk.B($$3);
      pk.j($$3);
      pk.A($$3);
      atv $$4 = atw.a(aty.pH);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static cxy q(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      pk.g($$2);
      cxz.a $$3 = new cxz.a($$0, $$1);
      a($$3);
      pk.ab($$3);
      pk.a($$3, true);
      pk.j($$3);
      pk.S($$3);
      pk.ac($$3);
      pk.ad($$3);
      pk.d($$3);
      atv $$4 = atw.a(aty.pE);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static cxy r(im<ecg> $$0, im<dup<?>> $$1) {
      cyk.a $$2 = new cyk.a();
      cxz.a $$3 = new cxz.a($$0, $$1);
      $$3.a(dsi.a.a, pm.a);
      $$3.a(dsi.a.a, pm.b);
      $$3.a(dsi.a.a, pm.c);
      pk.aw($$3);
      pk.b($$3);
      pk.c($$3);
      pk.at($$3);
      pk.ab($$3);
      pk.f($$3);
      pk.j($$3);
      pk.S($$3);
      pk.ac($$3);
      pk.ad($$3);
      pk.e($$3);
      atv $$4 = atw.a(aty.pD);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
