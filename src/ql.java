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

   private static cya a(boolean $$0, float $$1, float $$2, cym.a $$3, cyb.a $$4, @Nullable atv $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static cya a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, cym.a $$7, cyb.a $$8, @Nullable atv $$9
   ) {
      cyg.a $$10 = new cyg.a().b($$3).c($$4).a(12638463).d(a($$1)).a(cxy.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new cya.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cyb.a $$0) {
      pk.a($$0);
      pk.aw($$0);
      pk.b($$0);
      pk.c($$0);
      pk.ap($$0);
      pk.at($$0);
   }

   public static cya a(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a();
      pk.a($$3);
      $$3.a(bps.b, new cym.c(bpd.bs, 8, 4, 4));
      $$3.a(bps.b, new cym.c(bpd.aG, 4, 2, 3));
      $$3.a(bps.b, new cym.c(bpd.R, 8, 2, 4));
      if ($$2) {
         pk.c($$3);
      } else {
         pk.b($$3);
         pk.a($$3, 100, 25, 100, false);
      }

      cyb.a $$4 = new cyb.a($$0, $$1);
      a($$4);
      pk.m($$4);
      pk.n($$4);
      pk.f($$4);
      pk.j($$4);
      $$4.a(dsk.b.j, $$2 ? rh.ar : rh.as);
      pk.V($$4);
      pk.U($$4);
      pk.ac($$4);
      pk.ad($$4);
      pk.p($$4);
      atv $$5 = atw.a(aty.pO);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static cya a(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, atw.a(aty.qb));
   }

   public static cya b(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.i($$2);
      $$2.a(bps.b, new cym.c(bpd.ax, 40, 1, 2)).a(bps.a, new cym.c(bpd.au, 2, 1, 3)).a(bps.b, new cym.c(bpd.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, atw.a(aty.qa));
   }

   public static cya c(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.i($$2);
      $$2.a(bps.b, new cym.c(bpd.ax, 40, 1, 2)).a(bps.b, new cym.c(bpd.aw, 80, 1, 2)).a(bps.a, new cym.c(bpd.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, atw.a(aty.qc));
   }

   private static cya a(im<eci> $$0, im<dur<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, cym.a $$6, atv $$7) {
      cyb.a $$8 = new cyb.a($$0, $$1);
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

   public static cya b(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a();
      pk.a($$3);
      $$3.a(bps.b, new cym.c(bpd.an, 5, 4, 6));
      pk.c($$3);
      cyb.a $$4 = new cyb.a($$0, $$1);
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

   public static cya d(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.f($$2);
      cyb.a $$3 = new cyb.a($$0, $$1);
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
      return a(false, 2.0F, 0.0F, $$2, $$3, atw.a(aty.pY));
   }

   public static cya a(im<eci> $$0, im<dur<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cym.a $$5 = new cym.a();
      cyb.a $$6 = new cyb.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         pk.e($$5);
         if ($$4) {
            $$6.a(dsk.b.e, rc.a);
            $$6.a(dsk.b.e, rc.b);
         }
      } else {
         pk.d($$5);
         pk.ab($$6);
         if ($$2) {
            $$6.a(dsk.b.j, rh.d);
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
         $$6.a(dsk.b.j, rh.E);
         $$6.a(dsk.b.j, rh.e);
      } else {
         pk.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static cya e(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.h($$2);
      cyb.a $$3 = new cyb.a($$0, $$1);
      a($$3);
      pk.f($$3);
      pk.j($$3);
      pk.R($$3);
      pk.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static cya a(im<eci> $$0, im<dur<?>> $$1, boolean $$2, boolean $$3) {
      cyb.a $$4 = new cyb.a($$0, $$1);
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
      cym.a $$5 = new cym.a();
      pk.a($$5);
      $$5.a(bps.b, new cym.c(bpd.ac, 1, 2, 6)).a(bps.b, new cym.c(bpd.A, 1, 1, 1)).a(bps.b, new cym.c(bpd.d, 10, 2, 3));
      pk.c($$5);
      if ($$3) {
         $$5.a(bps.b, new cym.c(bpd.an, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static cya c(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a();
      pk.c($$3);
      $$3.a(bps.b, new cym.c(bpd.d, 1, 1, 2));
      $$3.a(0.03F);
      cyb.a $$4 = new cyb.a($$0, $$1);
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
      return new cya.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new cyg.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(cxy.b).a(atw.a(aty.pZ)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static cya a(cym.a $$0, int $$1, int $$2, cyb.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cyb.a s(im<eci> $$0, im<dur<?>> $$1) {
      cyb.a $$2 = new cyb.a($$0, $$1);
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

   public static cya d(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a();
      pk.a($$3, 3, 4, 15);
      $$3.a(bps.g, new cym.c(bpd.aI, 15, 1, 5));
      cyb.a $$4 = s($$0, $$1);
      $$4.a(dsk.b.j, $$2 ? qz.h : qz.c);
      pk.an($$4);
      pk.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static cya e(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a();
      pk.a($$3, 1, 4, 10);
      $$3.a(bps.f, new cym.c(bpd.z, 1, 1, 2));
      cyb.a $$4 = s($$0, $$1);
      $$4.a(dsk.b.j, $$2 ? qz.g : qz.b);
      pk.an($$4);
      pk.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static cya f(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a();
      if ($$2) {
         pk.a($$3, 8, 4, 8);
      } else {
         pk.a($$3, 10, 2, 15);
      }

      $$3.a(bps.g, new cym.c(bpd.aF, 5, 1, 3)).a(bps.g, new cym.c(bpd.bg, 25, 8, 8)).a(bps.f, new cym.c(bpd.z, 2, 1, 2));
      cyb.a $$4 = s($$0, $$1);
      $$4.a(dsk.b.j, $$2 ? qz.f : qz.a);
      if ($$2) {
         pk.an($$4);
      }

      pk.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static cya f(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a().a(bps.g, new cym.c(bpd.aF, 15, 1, 3));
      pk.a($$2, 10, 4);
      cyb.a $$3 = s($$0, $$1).a(dsk.b.j, qz.m).a(dsk.b.j, qz.a).a(dsk.b.j, qz.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static cya g(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a().a(bps.f, new cym.c(bpd.aX, 1, 1, 4)).a(bps.g, new cym.c(bpd.aI, 15, 1, 5)).a(bps.b, new cym.c(bpd.aD, 1, 1, 2));
      pk.c($$3);
      $$3.a(bps.a, new cym.c(bpd.C, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cyb.a $$5 = new cyb.a($$0, $$1);
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
      return new cya.a().a(true).a($$4).a(cya.d.b).b(0.5F).a(new cyg.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(cxy.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static cya b(im<eci> $$0, im<dur<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cyb.a $$5 = new cyb.a($$0, $$1);
      a($$5);
      atv $$6;
      if ($$4) {
         $$6 = atw.a(aty.pX);
         $$5.a(dsk.b.j, rh.Y);
      } else {
         $$6 = atw.a(aty.pN);
         pk.N($$5);
      }

      pk.f($$5);
      pk.j($$5);
      if ($$4) {
         $$5.a(dsk.b.j, rh.aa);
         $$5.a(dsk.b.j, rh.R);
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
      cym.a $$8 = new cym.a();
      pk.a($$8);
      pk.c($$8);
      if ($$4) {
         $$8.a(bps.b, new cym.c(bpd.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bps.b, new cym.c(bpd.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static cya h(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a();
      pk.a($$3);
      $$3.a(bps.b, new cym.c(bpd.bs, 8, 4, 4)).a(bps.b, new cym.c(bpd.aG, 4, 2, 3)).a(bps.b, new cym.c(bpd.R, 8, 2, 4));
      pk.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cyb.a $$5 = new cyb.a($$0, $$1);
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

   public static cya g(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.a($$2);
      pk.c($$2);
      cyb.a $$3 = new cyb.a($$0, $$1);
      a($$3);
      $$3.a(dsk.b.j, rh.X);
      pk.N($$3);
      pk.f($$3);
      pk.j($$3);
      pk.V($$3);
      pk.O($$3);
      pk.ac($$3);
      pk.ad($$3);
      atv $$4 = atw.a(aty.pN);
      return new cya.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new cyg.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(cyg.b.b).a(cxy.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cya h(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.a($$2);
      pk.c($$2);
      $$2.a(bps.a, new cym.c(bpd.aP, 1, 1, 1));
      $$2.a(bps.a, new cym.c(bpd.m, 50, 4, 4));
      $$2.a(bps.b, new cym.c(bpd.S, 10, 2, 5));
      cyb.a $$3 = new cyb.a($$0, $$1);
      pk.al($$3);
      a($$3);
      pk.f($$3);
      pk.k($$3);
      pk.P($$3);
      pk.ac($$3);
      pk.aj($$3);
      $$3.a(dsk.b.j, qz.e);
      atv $$4 = atw.a(aty.pM);
      return new cya.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cyg.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(cyg.b.c).a(cxy.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cya i(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.c($$2);
      $$2.a(bps.a, new cym.c(bpd.aP, 1, 1, 1));
      $$2.a(bps.a, new cym.c(bpd.m, 50, 4, 4));
      $$2.a(bps.b, new cym.c(bpd.S, 10, 2, 5));
      $$2.a(bps.g, new cym.c(bpd.bg, 25, 8, 8));
      cyb.a $$3 = new cyb.a($$0, $$1);
      pk.al($$3);
      a($$3);
      pk.f($$3);
      pk.l($$3);
      pk.Q($$3);
      $$3.a(dsk.b.j, qz.e);
      atv $$4 = atw.a(aty.pM);
      return new cya.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cyg.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(cyg.b.c).a(cxy.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cya i(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cym.a $$3 = new cym.a().a(bps.f, new cym.c(bpd.aX, 2, 1, 4)).a(bps.g, new cym.c(bpd.aI, 5, 1, 5));
      pk.c($$3);
      $$3.a(bps.a, new cym.c(bpd.C, $$2 ? 1 : 100, 1, 1));
      cyb.a $$4 = new cyb.a($$0, $$1);
      a($$4);
      pk.f($$4);
      pk.j($$4);
      pk.u($$4);
      pk.V($$4);
      pk.Z($$4);
      pk.ac($$4);
      pk.ad($$4);
      if (!$$2) {
         $$4.a(dsk.b.j, qz.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static cya b(im<eci> $$0, im<dur<?>> $$1, boolean $$2, boolean $$3) {
      cym.a $$4 = new cym.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bps.b, new cym.c(bpd.bh, 5, 2, 5));
      }

      pk.c($$4);
      cyb.a $$6 = new cyb.a($$0, $$1);
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

   public static cya j(im<eci> $$0, im<dur<?>> $$1) {
      cyb.a $$2 = new cyb.a($$0, $$1);
      $$2.a(dsk.b.k, rc.n);
      return a(false, 0.5F, 0.5F, new cym.a(), $$2, d);
   }

   public static cya j(im<eci> $$0, im<dur<?>> $$1, boolean $$2) {
      cyb.a $$3 = new cyb.a($$0, $$1);
      cym.a $$4 = new cym.a();
      $$4.a(bps.b, new cym.c($$2 ? bpd.az : bpd.A, 1, 1, 2)).a(bps.b, new cym.c(bpd.aG, 2, 2, 6)).a(bps.b, new cym.c(bpd.aJ, 2, 2, 4));
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
      atv $$5 = atw.a($$2 ? aty.pQ : aty.pP);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static cya k(im<eci> $$0, im<dur<?>> $$1) {
      cyb.a $$2 = new cyb.a($$0, $$1);
      cym.a $$3 = new cym.a();
      $$3.a(bps.b, new cym.c(bpd.Y, 5, 1, 3));
      pk.c($$3);
      a($$2);
      pk.aq($$2);
      pk.f($$2);
      pk.j($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pS);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cya l(im<eci> $$0, im<dur<?>> $$1) {
      cyb.a $$2 = new cyb.a($$0, $$1);
      cym.a $$3 = new cym.a();
      $$3.a(bps.b, new cym.c(bpd.Y, 5, 1, 3));
      pk.c($$3);
      a($$2);
      pk.aq($$2);
      pk.f($$2);
      pk.j($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pK);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cya m(im<eci> $$0, im<dur<?>> $$1) {
      cyb.a $$2 = new cyb.a($$0, $$1);
      cym.a $$3 = new cym.a();
      pk.c($$3);
      a($$2);
      pk.f($$2);
      pk.j($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pV);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static cya n(im<eci> $$0, im<dur<?>> $$1) {
      cyb.a $$2 = new cyb.a($$0, $$1);
      cym.a $$3 = new cym.a();
      $$3.a(bps.b, new cym.c(bpd.aG, 4, 2, 3)).a(bps.b, new cym.c(bpd.Y, 5, 1, 3));
      pk.c($$3);
      a($$2);
      pk.aq($$2);
      pk.f($$2);
      pk.j($$2);
      pk.ad($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pT);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static cya o(im<eci> $$0, im<dur<?>> $$1) {
      cyb.a $$2 = new cyb.a($$0, $$1);
      cym.a $$3 = new cym.a();
      pk.a($$3);
      $$3.a(bps.b, new cym.c(bpd.bs, 8, 4, 4)).a(bps.b, new cym.c(bpd.aG, 4, 2, 3)).a(bps.b, new cym.c(bpd.R, 8, 2, 4));
      pk.c($$3);
      a($$2);
      pk.aq($$2);
      pk.f($$2);
      pk.j($$2);
      pk.t($$2);
      pk.ad($$2);
      pk.h($$2);
      pk.i($$2);
      atv $$4 = atw.a(aty.pJ);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static cya p(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      $$2.a(bps.d, new cym.c(bpd.g, 10, 4, 6));
      $$2.a(bps.g, new cym.c(bpd.bg, 25, 8, 8));
      pk.c($$2);
      cyb.a $$3 = new cyb.a($$0, $$1);
      a($$3);
      pk.ab($$3);
      pk.f($$3);
      pk.B($$3);
      pk.j($$3);
      pk.A($$3);
      atv $$4 = atw.a(aty.pL);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static cya q(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      pk.g($$2);
      cyb.a $$3 = new cyb.a($$0, $$1);
      a($$3);
      pk.ab($$3);
      pk.a($$3, true);
      pk.j($$3);
      pk.S($$3);
      pk.ac($$3);
      pk.ad($$3);
      pk.d($$3);
      atv $$4 = atw.a(aty.pI);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static cya r(im<eci> $$0, im<dur<?>> $$1) {
      cym.a $$2 = new cym.a();
      cyb.a $$3 = new cyb.a($$0, $$1);
      $$3.a(dsk.a.a, pm.a);
      $$3.a(dsk.a.a, pm.b);
      $$3.a(dsk.a.a, pm.c);
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
      atv $$4 = atw.a(aty.pH);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
