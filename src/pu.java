import javax.annotation.Nullable;

public class pu {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final aqs d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = atq.a($$1, -1.0F, 1.0F);
      return atq.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static ctd a(boolean $$0, float $$1, float $$2, ctp.a $$3, cte.a $$4, @Nullable aqs $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static ctd a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, ctp.a $$7, cte.a $$8, @Nullable aqs $$9
   ) {
      ctj.a $$10 = new ctj.a().b($$3).c($$4).a(12638463).d(a($$1)).a(ctb.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new ctd.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cte.a $$0) {
      oy.a($$0);
      oy.aw($$0);
      oy.b($$0);
      oy.c($$0);
      oy.ap($$0);
      oy.at($$0);
   }

   public static ctd a(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a();
      oy.a($$3);
      $$3.a(blo.b, new ctp.c(bkz.bn, 8, 4, 4));
      $$3.a(blo.b, new ctp.c(bkz.aC, 4, 2, 3));
      $$3.a(blo.b, new ctp.c(bkz.N, 8, 2, 4));
      if ($$2) {
         oy.c($$3);
      } else {
         oy.b($$3);
         oy.a($$3, 100, 25, 100, false);
      }

      cte.a $$4 = new cte.a($$0, $$1);
      a($$4);
      oy.m($$4);
      oy.n($$4);
      oy.f($$4);
      oy.j($$4);
      $$4.a(dms.b.j, $$2 ? qq.ar : qq.as);
      oy.V($$4);
      oy.U($$4);
      oy.ac($$4);
      oy.ad($$4);
      oy.p($$4);
      aqs $$5 = aqt.a(aqv.oX);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static ctd a(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, aqt.a(aqv.pk));
   }

   public static ctd b(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.i($$2);
      $$2.a(blo.b, new ctp.c(bkz.at, 40, 1, 2)).a(blo.a, new ctp.c(bkz.aq, 2, 1, 3)).a(blo.b, new ctp.c(bkz.as, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, aqt.a(aqv.pj));
   }

   public static ctd c(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.i($$2);
      $$2.a(blo.b, new ctp.c(bkz.at, 40, 1, 2)).a(blo.b, new ctp.c(bkz.as, 80, 1, 2)).a(blo.a, new ctp.c(bkz.aq, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, aqt.a(aqv.pl));
   }

   private static ctd a(ih<dwq> $$0, ih<doz<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, ctp.a $$6, aqs $$7) {
      cte.a $$8 = new cte.a($$0, $$1);
      a($$8);
      oy.f($$8);
      oy.j($$8);
      if ($$3) {
         oy.r($$8);
      } else {
         if ($$5) {
            oy.q($$8);
         }

         if ($$4) {
            oy.F($$8);
         } else {
            oy.E($$8);
         }
      }

      oy.Y($$8);
      oy.I($$8);
      oy.ac($$8);
      oy.ad($$8);
      oy.ah($$8);
      if ($$4) {
         oy.ag($$8);
      } else {
         oy.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static ctd b(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a();
      oy.a($$3);
      $$3.a(blo.b, new ctp.c(bkz.aj, 5, 4, 6));
      oy.c($$3);
      cte.a $$4 = new cte.a($$0, $$1);
      a($$4);
      oy.f($$4);
      oy.j($$4);
      if ($$2) {
         oy.D($$4);
      } else {
         oy.C($$4);
      }

      oy.V($$4);
      oy.Z($$4);
      oy.ac($$4);
      oy.ad($$4);
      oy.h($$4);
      oy.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static ctd d(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.f($$2);
      cte.a $$3 = new cte.a($$0, $$1);
      oy.al($$3);
      a($$3);
      oy.f($$3);
      oy.j($$3);
      oy.V($$3);
      oy.Z($$3);
      oy.T($$3);
      oy.ac($$3);
      oy.ai($$3);
      oy.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, aqt.a(aqv.ph));
   }

   public static ctd a(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      ctp.a $$5 = new ctp.a();
      cte.a $$6 = new cte.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         oy.e($$5);
         if ($$4) {
            $$6.a(dms.b.e, ql.a);
            $$6.a(dms.b.e, ql.b);
         }
      } else {
         oy.d($$5);
         oy.ab($$6);
         if ($$2) {
            $$6.a(dms.b.j, qq.d);
         }
      }

      oy.f($$6);
      oy.j($$6);
      if ($$3) {
         oy.H($$6);
         oy.V($$6);
         oy.Z($$6);
      } else {
         oy.S($$6);
      }

      oy.ac($$6);
      if ($$2) {
         $$6.a(dms.b.j, qq.E);
         $$6.a(dms.b.j, qq.e);
      } else {
         oy.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static ctd e(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.h($$2);
      cte.a $$3 = new cte.a($$0, $$1);
      a($$3);
      oy.f($$3);
      oy.j($$3);
      oy.R($$3);
      oy.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static ctd a(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2, boolean $$3) {
      cte.a $$4 = new cte.a($$0, $$1);
      a($$4);
      if (!$$2) {
         oy.J($$4);
      }

      oy.f($$4);
      oy.j($$4);
      if ($$2) {
         oy.z($$4);
         oy.V($$4);
         oy.K($$4);
      } else {
         oy.y($$4);
         oy.Y($$4);
         oy.L($$4);
      }

      oy.ac($$4);
      oy.ad($$4);
      ctp.a $$5 = new ctp.a();
      oy.a($$5);
      $$5.a(blo.b, new ctp.c(bkz.Y, 1, 2, 6)).a(blo.b, new ctp.c(bkz.w, 1, 1, 1));
      oy.c($$5);
      if ($$3) {
         $$5.a(blo.b, new ctp.c(bkz.aj, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static ctd c(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a();
      oy.c($$3);
      cte.a $$4 = new cte.a($$0, $$1);
      a($$4);
      oy.f($$4);
      oy.g($$4);
      oy.j($$4);
      if ($$2) {
         oy.G($$4);
      }

      oy.M($$4);
      oy.ac($$4);
      oy.ae($$4);
      return new ctd.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new ctj.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(ctb.b).a(aqt.a(aqv.pi)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static ctd a(ctp.a $$0, int $$1, int $$2, cte.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cte.a s(ih<dwq> $$0, ih<doz<?>> $$1) {
      cte.a $$2 = new cte.a($$0, $$1);
      a($$2);
      oy.f($$2);
      oy.j($$2);
      oy.u($$2);
      oy.V($$2);
      oy.Z($$2);
      oy.ac($$2);
      oy.ad($$2);
      return $$2;
   }

   public static ctd d(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a();
      oy.a($$3, 3, 4, 15);
      $$3.a(blo.g, new ctp.c(bkz.aE, 15, 1, 5));
      cte.a $$4 = s($$0, $$1);
      $$4.a(dms.b.j, $$2 ? qi.h : qi.c);
      oy.an($$4);
      oy.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static ctd e(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a();
      oy.a($$3, 1, 4, 10);
      $$3.a(blo.f, new ctp.c(bkz.v, 1, 1, 2));
      cte.a $$4 = s($$0, $$1);
      $$4.a(dms.b.j, $$2 ? qi.g : qi.b);
      oy.an($$4);
      oy.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static ctd f(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a();
      if ($$2) {
         oy.a($$3, 8, 4, 8);
      } else {
         oy.a($$3, 10, 2, 15);
      }

      $$3.a(blo.g, new ctp.c(bkz.aB, 5, 1, 3)).a(blo.g, new ctp.c(bkz.bc, 25, 8, 8)).a(blo.f, new ctp.c(bkz.v, 2, 1, 2));
      cte.a $$4 = s($$0, $$1);
      $$4.a(dms.b.j, $$2 ? qi.f : qi.a);
      if ($$2) {
         oy.an($$4);
      }

      oy.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static ctd f(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a().a(blo.g, new ctp.c(bkz.aB, 15, 1, 3));
      oy.a($$2, 10, 4);
      cte.a $$3 = s($$0, $$1).a(dms.b.j, qi.m).a(dms.b.j, qi.a).a(dms.b.j, qi.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static ctd g(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a().a(blo.f, new ctp.c(bkz.aT, 1, 1, 4)).a(blo.g, new ctp.c(bkz.aE, 15, 1, 5)).a(blo.b, new ctp.c(bkz.az, 1, 1, 2));
      oy.c($$3);
      $$3.a(blo.a, new ctp.c(bkz.y, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cte.a $$5 = new cte.a($$0, $$1);
      oy.ar($$5);
      a($$5);
      oy.as($$5);
      oy.f($$5);
      oy.j($$5);
      oy.u($$5);
      oy.V($$5);
      oy.Z($$5);
      oy.ac($$5);
      oy.ad($$5);
      return new ctd.a().a(true).a($$4).a(ctd.d.b).b(0.5F).a(new ctj.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(ctb.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static ctd b(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cte.a $$5 = new cte.a($$0, $$1);
      a($$5);
      aqs $$6;
      if ($$4) {
         $$6 = aqt.a(aqv.pg);
         $$5.a(dms.b.j, qq.Y);
      } else {
         $$6 = aqt.a(aqv.oW);
         oy.N($$5);
      }

      oy.f($$5);
      oy.j($$5);
      if ($$4) {
         $$5.a(dms.b.j, qq.aa);
         $$5.a(dms.b.j, qq.R);
         oy.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               oy.x($$5);
            } else {
               oy.v($$5);
            }
         } else {
            oy.w($$5);
         }

         oy.V($$5);
         oy.O($$5);
      }

      oy.ac($$5);
      oy.ad($$5);
      ctp.a $$8 = new ctp.a();
      oy.a($$8);
      oy.c($$8);
      if ($$4) {
         $$8.a(blo.b, new ctp.c(bkz.aC, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(blo.b, new ctp.c(bkz.bn, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static ctd h(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a();
      oy.a($$3);
      $$3.a(blo.b, new ctp.c(bkz.bn, 8, 4, 4)).a(blo.b, new ctp.c(bkz.aC, 4, 2, 3)).a(blo.b, new ctp.c(bkz.N, 8, 2, 4));
      oy.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cte.a $$5 = new cte.a($$0, $$1);
      a($$5);
      oy.n($$5);
      oy.f($$5);
      oy.j($$5);
      oy.s($$5);
      oy.V($$5);
      oy.aa($$5);
      oy.ad($$5);
      if ($$2) {
         oy.o($$5);
      } else {
         oy.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static ctd g(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.a($$2);
      oy.c($$2);
      cte.a $$3 = new cte.a($$0, $$1);
      a($$3);
      $$3.a(dms.b.j, qq.X);
      oy.N($$3);
      oy.f($$3);
      oy.j($$3);
      oy.V($$3);
      oy.O($$3);
      oy.ac($$3);
      oy.ad($$3);
      aqs $$4 = aqt.a(aqv.oW);
      return new ctd.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new ctj.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(ctj.b.b).a(ctb.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ctd h(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.a($$2);
      oy.c($$2);
      $$2.a(blo.a, new ctp.c(bkz.aL, 1, 1, 1));
      $$2.a(blo.b, new ctp.c(bkz.O, 10, 2, 5));
      cte.a $$3 = new cte.a($$0, $$1);
      oy.al($$3);
      a($$3);
      oy.f($$3);
      oy.k($$3);
      oy.P($$3);
      oy.ac($$3);
      oy.aj($$3);
      $$3.a(dms.b.j, qi.e);
      aqs $$4 = aqt.a(aqv.oV);
      return new ctd.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new ctj.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(ctj.b.c).a(ctb.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ctd i(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.c($$2);
      $$2.a(blo.a, new ctp.c(bkz.aL, 1, 1, 1));
      $$2.a(blo.b, new ctp.c(bkz.O, 10, 2, 5));
      $$2.a(blo.g, new ctp.c(bkz.bc, 25, 8, 8));
      cte.a $$3 = new cte.a($$0, $$1);
      oy.al($$3);
      a($$3);
      oy.f($$3);
      oy.l($$3);
      oy.Q($$3);
      $$3.a(dms.b.j, qi.e);
      aqs $$4 = aqt.a(aqv.oV);
      return new ctd.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new ctj.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(ctj.b.c).a(ctb.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ctd i(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      ctp.a $$3 = new ctp.a().a(blo.f, new ctp.c(bkz.aT, 2, 1, 4)).a(blo.g, new ctp.c(bkz.aE, 5, 1, 5));
      oy.c($$3);
      $$3.a(blo.a, new ctp.c(bkz.y, $$2 ? 1 : 100, 1, 1));
      cte.a $$4 = new cte.a($$0, $$1);
      a($$4);
      oy.f($$4);
      oy.j($$4);
      oy.u($$4);
      oy.V($$4);
      oy.Z($$4);
      oy.ac($$4);
      oy.ad($$4);
      if (!$$2) {
         $$4.a(dms.b.j, qi.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static ctd b(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2, boolean $$3) {
      ctp.a $$4 = new ctp.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(blo.b, new ctp.c(bkz.bd, 5, 2, 5));
      }

      oy.c($$4);
      cte.a $$6 = new cte.a($$0, $$1);
      a($$6);
      oy.f($$6);
      oy.j($$6);
      oy.V($$6);
      oy.Z($$6);
      oy.ac($$6);
      oy.ad($$6);
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

   public static ctd j(ih<dwq> $$0, ih<doz<?>> $$1) {
      cte.a $$2 = new cte.a($$0, $$1);
      $$2.a(dms.b.k, ql.n);
      return a(false, 0.5F, 0.5F, new ctp.a(), $$2, d);
   }

   public static ctd j(ih<dwq> $$0, ih<doz<?>> $$1, boolean $$2) {
      cte.a $$3 = new cte.a($$0, $$1);
      ctp.a $$4 = new ctp.a();
      $$4.a(blo.b, new ctp.c($$2 ? bkz.av : bkz.w, 1, 1, 2)).a(blo.b, new ctp.c(bkz.aC, 2, 2, 6)).a(blo.b, new ctp.c(bkz.aF, 2, 2, 4));
      oy.c($$4);
      a($$3);
      oy.ab($$3);
      oy.f($$3);
      oy.j($$3);
      if ($$2) {
         oy.W($$3);
      } else {
         oy.X($$3);
      }

      oy.h($$3);
      oy.i($$3);
      aqs $$5 = aqt.a($$2 ? aqv.oZ : aqv.oY);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static ctd k(ih<dwq> $$0, ih<doz<?>> $$1) {
      cte.a $$2 = new cte.a($$0, $$1);
      ctp.a $$3 = new ctp.a();
      $$3.a(blo.b, new ctp.c(bkz.U, 5, 1, 3));
      oy.c($$3);
      a($$2);
      oy.aq($$2);
      oy.f($$2);
      oy.j($$2);
      oy.h($$2);
      oy.i($$2);
      aqs $$4 = aqt.a(aqv.pb);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static ctd l(ih<dwq> $$0, ih<doz<?>> $$1) {
      cte.a $$2 = new cte.a($$0, $$1);
      ctp.a $$3 = new ctp.a();
      $$3.a(blo.b, new ctp.c(bkz.U, 5, 1, 3));
      oy.c($$3);
      a($$2);
      oy.aq($$2);
      oy.f($$2);
      oy.j($$2);
      oy.h($$2);
      oy.i($$2);
      aqs $$4 = aqt.a(aqv.oT);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static ctd m(ih<dwq> $$0, ih<doz<?>> $$1) {
      cte.a $$2 = new cte.a($$0, $$1);
      ctp.a $$3 = new ctp.a();
      oy.c($$3);
      a($$2);
      oy.f($$2);
      oy.j($$2);
      oy.h($$2);
      oy.i($$2);
      aqs $$4 = aqt.a(aqv.pe);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static ctd n(ih<dwq> $$0, ih<doz<?>> $$1) {
      cte.a $$2 = new cte.a($$0, $$1);
      ctp.a $$3 = new ctp.a();
      $$3.a(blo.b, new ctp.c(bkz.aC, 4, 2, 3)).a(blo.b, new ctp.c(bkz.U, 5, 1, 3));
      oy.c($$3);
      a($$2);
      oy.aq($$2);
      oy.f($$2);
      oy.j($$2);
      oy.ad($$2);
      oy.h($$2);
      oy.i($$2);
      aqs $$4 = aqt.a(aqv.pc);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static ctd o(ih<dwq> $$0, ih<doz<?>> $$1) {
      cte.a $$2 = new cte.a($$0, $$1);
      ctp.a $$3 = new ctp.a();
      oy.a($$3);
      $$3.a(blo.b, new ctp.c(bkz.bn, 8, 4, 4)).a(blo.b, new ctp.c(bkz.aC, 4, 2, 3)).a(blo.b, new ctp.c(bkz.N, 8, 2, 4));
      oy.c($$3);
      a($$2);
      oy.aq($$2);
      oy.f($$2);
      oy.j($$2);
      oy.t($$2);
      oy.ad($$2);
      oy.h($$2);
      oy.i($$2);
      aqs $$4 = aqt.a(aqv.oS);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static ctd p(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      $$2.a(blo.d, new ctp.c(bkz.f, 10, 4, 6));
      $$2.a(blo.g, new ctp.c(bkz.bc, 25, 8, 8));
      oy.c($$2);
      cte.a $$3 = new cte.a($$0, $$1);
      a($$3);
      oy.ab($$3);
      oy.f($$3);
      oy.B($$3);
      oy.j($$3);
      oy.A($$3);
      aqs $$4 = aqt.a(aqv.oU);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static ctd q(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      oy.g($$2);
      cte.a $$3 = new cte.a($$0, $$1);
      a($$3);
      oy.ab($$3);
      oy.a($$3, true);
      oy.j($$3);
      oy.S($$3);
      oy.ac($$3);
      oy.ad($$3);
      oy.d($$3);
      aqs $$4 = aqt.a(aqv.oR);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static ctd r(ih<dwq> $$0, ih<doz<?>> $$1) {
      ctp.a $$2 = new ctp.a();
      cte.a $$3 = new cte.a($$0, $$1);
      $$3.a(dms.a.a, pa.a);
      $$3.a(dms.a.a, pa.b);
      $$3.a(dms.a.a, pa.c);
      oy.aw($$3);
      oy.b($$3);
      oy.c($$3);
      oy.at($$3);
      oy.ab($$3);
      oy.f($$3);
      oy.j($$3);
      oy.S($$3);
      oy.ac($$3);
      oy.ad($$3);
      oy.e($$3);
      aqs $$4 = aqt.a(aqv.oQ);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
