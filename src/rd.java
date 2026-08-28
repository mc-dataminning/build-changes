import javax.annotation.Nullable;

public class rd {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   @Nullable
   private static final awk e = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = azm.a($$1, -1.0F, 1.0F);
      return azm.g(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dkd a(boolean $$0, float $$1, float $$2, dkp.a $$3, dke.a $$4, @Nullable awk $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dkd a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dkp.a $$7, dke.a $$8, @Nullable awk $$9
   ) {
      dkj.a $$10 = new dkj.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dkb.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dkd.a().a($$0).a($$1).b($$2).a($$10.b()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dke.a $$0) {
      qg.a($$0);
      qg.ax($$0);
      qg.b($$0);
      qg.c($$0);
      qg.aq($$0);
      qg.au($$0);
   }

   public static dkd a(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a();
      qg.a($$3);
      $$3.a(bxh.b, 8, new dkp.c(bwo.bM, 4, 4));
      $$3.a(bxh.b, 4, new dkp.c(bwo.aY, 2, 3));
      $$3.a(bxh.b, 8, new dkp.c(bwo.aa, 2, 4));
      if ($$2) {
         qg.c($$3);
      } else {
         qg.b($$3);
         qg.a($$3, 100, 25, 100, false);
      }

      dke.a $$4 = new dke.a($$0, $$1);
      a($$4);
      qg.m($$4);
      qg.n($$4);
      qg.f($$4);
      qg.j($$4);
      $$4.a(egc.a.j, $$2 ? rz.aF : rz.aG);
      qg.X($$4);
      qg.W($$4);
      qg.ae($$4);
      qg.b($$4, true);
      qg.q($$4);
      awk $$5 = awl.a(awn.qY);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dkd a(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      qg.i($$2);
      $$2.a(bxh.b, 8, new dkp.c(bwo.bM, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, awl.a(awn.rl));
   }

   public static dkd b(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      qg.i($$2);
      $$2.a(bxh.b, 40, new dkp.c(bwo.aO, 1, 2)).a(bxh.a, 2, new dkp.c(bwo.aI, 1, 3)).a(bxh.b, 1, new dkp.c(bwo.aN, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, awl.a(awn.rk));
   }

   public static dkd c(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      qg.i($$2);
      $$2.a(bxh.b, 40, new dkp.c(bwo.aO, 1, 2)).a(bxh.b, 80, new dkp.c(bwo.aN, 1, 2)).a(bxh.a, 2, new dkp.c(bwo.aI, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, awl.a(awn.rm));
   }

   private static dkd a(jf<eqf> $$0, jf<eik<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dkp.a $$6, awk $$7) {
      dke.a $$8 = new dke.a($$0, $$1);
      a($$8);
      qg.f($$8);
      qg.j($$8);
      if ($$3) {
         qg.s($$8);
      } else {
         if ($$5) {
            qg.r($$8);
         }

         if ($$4) {
            qg.H($$8);
         } else {
            qg.G($$8);
         }
      }

      qg.aa($$8);
      qg.K($$8);
      qg.ae($$8);
      qg.b($$8, true);
      qg.aj($$8);
      if ($$4) {
         qg.ai($$8);
      } else {
         qg.ah($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dkd b(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a();
      qg.a($$3);
      $$3.a(bxh.b, 5, new dkp.c(bwo.ax, 4, 6));
      qg.c($$3);
      dke.a $$4 = new dke.a($$0, $$1);
      a($$4);
      qg.f($$4);
      qg.j($$4);
      if ($$2) {
         qg.F($$4);
      } else {
         qg.E($$4);
      }

      qg.o($$4);
      qg.X($$4);
      qg.ab($$4);
      qg.ae($$4);
      qg.b($$4, true);
      qg.h($$4);
      qg.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, e);
   }

   public static dkd d(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      qg.f($$2);
      dke.a $$3 = new dke.a($$0, $$1);
      qg.an($$3);
      a($$3);
      qg.f($$3);
      qg.j($$3);
      qg.X($$3);
      qg.ab($$3);
      qg.V($$3);
      qg.ae($$3);
      qg.ak($$3);
      qg.am($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, awl.a(awn.ri));
   }

   public static dkd a(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dkp.a $$5 = new dkp.a();
      dke.a $$6 = new dke.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qg.e($$5);
         if ($$4) {
            $$6.a(egc.a.e, ru.a);
            $$6.a(egc.a.e, ru.b);
         }
      } else {
         qg.d($$5);
         qg.ad($$6);
         if ($$2) {
            $$6.a(egc.a.j, rz.d);
         } else {
            qg.o($$6);
         }
      }

      qg.f($$6);
      qg.j($$6);
      if ($$3) {
         qg.J($$6);
         qg.X($$6);
         qg.ab($$6);
      } else {
         qg.U($$6);
      }

      qg.ae($$6);
      qg.b($$6, true);
      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, e);
   }

   public static dkd e(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      qg.h($$2);
      dke.a $$3 = new dke.a($$0, $$1);
      a($$3);
      qg.f($$3);
      qg.j($$3);
      qg.T($$3);
      qg.b($$3, true);
      return a(true, 0.9F, 1.0F, $$2, $$3, e);
   }

   public static dkd a(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2, boolean $$3) {
      dke.a $$4 = new dke.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qg.L($$4);
      }

      qg.f($$4);
      qg.j($$4);
      if ($$2) {
         qg.B($$4);
         qg.X($$4);
         qg.M($$4);
      } else {
         qg.A($$4);
         qg.aa($$4);
         qg.N($$4);
      }

      qg.ae($$4);
      qg.b($$4, true);
      dkp.a $$5 = new dkp.a();
      qg.a($$5);
      $$5.a(bxh.b, 1, new dkp.c(bwo.al, 2, 6)).a(bxh.b, 1, new dkp.c(bwo.I, 1, 1)).a(bxh.b, 10, new dkp.c(bwo.e, 2, 3));
      qg.c($$5);
      if ($$3) {
         $$5.a(bxh.b, 8, new dkp.c(bwo.ax, 4, 4));
         $$5.a(bxh.b, 8, new dkp.c(bwo.bM, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, e);
   }

   public static dkd c(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a();
      qg.a($$3);
      qg.c($$3);
      $$3.a(bxh.b, 6, new dkp.c(bwo.e, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bxh.b, 2, new dkp.c(bwo.bM, 4, 8));
         $$3.a(0.04F);
      }

      dke.a $$4 = new dke.a($$0, $$1);
      a($$4);
      qg.f($$4);
      qg.g($$4);
      qg.j($$4);
      if ($$2) {
         qg.I($$4);
      }

      qg.O($$4);
      qg.ae($$4);
      qg.ag($$4);
      return new dkd.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dkj.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dkb.b).a(awl.a(awn.rj)).b())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dkd a(dkp.a $$0, int $$1, int $$2, dke.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, e);
   }

   private static dke.a r(jf<eqf> $$0, jf<eik<?>> $$1) {
      dke.a $$2 = new dke.a($$0, $$1);
      a($$2);
      qg.f($$2);
      qg.j($$2);
      qg.v($$2);
      qg.X($$2);
      qg.ab($$2);
      qg.ae($$2);
      qg.b($$2, true);
      return $$2;
   }

   public static dkd d(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a();
      qg.a($$3, 3, 4, 15);
      $$3.a(bxh.g, 15, new dkp.c(bwo.ba, 1, 5));
      dke.a $$4 = r($$0, $$1);
      $$4.a(egc.a.j, $$2 ? rr.h : rr.c);
      qg.ao($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dkd e(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a();
      qg.a($$3, 1, 4, 10);
      $$3.a(bxh.f, 1, new dkp.c(bwo.H, 1, 2));
      dke.a $$4 = r($$0, $$1);
      $$4.a(egc.a.j, $$2 ? rr.g : rr.b);
      qg.ao($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dkd f(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a();
      if ($$2) {
         qg.a($$3, 8, 4, 8);
      } else {
         qg.a($$3, 10, 2, 15);
      }

      $$3.a(bxh.g, 5, new dkp.c(bwo.aX, 1, 3)).a(bxh.g, 25, new dkp.c(bwo.bA, 8, 8)).a(bxh.f, 2, new dkp.c(bwo.H, 1, 2));
      dke.a $$4 = r($$0, $$1);
      $$4.a(egc.a.j, $$2 ? rr.f : rr.a);
      qg.ap($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dkd f(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a().a(bxh.g, 15, new dkp.c(bwo.aX, 1, 3));
      qg.a($$2, 10, 4);
      dke.a $$3 = r($$0, $$1).a(egc.a.j, rr.l).a(egc.a.j, rr.a).a(egc.a.j, rr.i);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dkd g(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a().a(bxh.f, 1, new dkp.c(bwo.br, 1, 4)).a(bxh.g, 15, new dkp.c(bwo.ba, 1, 5)).a(bxh.b, 1, new dkp.c(bwo.aU, 1, 2));
      qg.c($$3);
      $$3.a(bxh.a, 5, new dkp.c(bwo.K, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dke.a $$5 = new dke.a($$0, $$1);
      qg.as($$5);
      a($$5);
      qg.at($$5);
      qg.f($$5);
      qg.j($$5);
      qg.v($$5);
      qg.X($$5);
      qg.ab($$5);
      qg.ae($$5);
      qg.b($$5, true);
      return new dkd.a().a(true).a($$4).a(dkd.d.b).b(0.5F).a(new dkj.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dkb.b).b()).a($$3.a()).a($$5.a()).a();
   }

   public static dkd b(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dke.a $$5 = new dke.a($$0, $$1);
      a($$5);
      awk $$6;
      if ($$4) {
         $$6 = awl.a(awn.rh);
         $$5.a(egc.a.j, rz.ak);
      } else {
         $$6 = awl.a(awn.qX);
         qg.P($$5);
      }

      qg.f($$5);
      qg.j($$5);
      if ($$4) {
         $$5.a(egc.a.j, rz.ao);
         $$5.a(egc.a.j, rz.Z);
         qg.ab($$5);
      } else {
         if ($$2) {
            qg.z($$5);
            if ($$3) {
               qg.y($$5);
            } else {
               qg.w($$5);
            }
         } else {
            qg.x($$5);
         }

         qg.o($$5);
         qg.X($$5);
         qg.Q($$5);
      }

      qg.ae($$5);
      qg.b($$5, true);
      dkp.a $$8 = new dkp.a();
      qg.a($$8);
      qg.c($$8);
      if ($$4) {
         $$8.a(bxh.b, 4, new dkp.c(bwo.aY, 2, 3));
      } else if (!$$2) {
         $$8.a(bxh.b, 5, new dkp.c(bwo.bM, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dkd h(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a();
      qg.a($$3);
      $$3.a(bxh.b, 8, new dkp.c(bwo.bM, 4, 4)).a(bxh.b, 4, new dkp.c(bwo.aY, 2, 3)).a(bxh.b, 8, new dkp.c(bwo.aa, 2, 4));
      qg.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dke.a $$5 = new dke.a($$0, $$1);
      a($$5);
      qg.n($$5);
      qg.f($$5);
      qg.j($$5);
      qg.t($$5);
      qg.X($$5);
      qg.ac($$5);
      qg.b($$5, true);
      if ($$2) {
         qg.p($$5);
      } else {
         qg.q($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, e);
   }

   public static dkd i(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a();
      if (!$$2) {
         qg.a($$3);
      }

      qg.c($$3);
      dke.a $$4 = new dke.a($$0, $$1);
      a($$4);
      $$4.a(egc.a.j, $$2 ? rz.aj : rz.ai);
      if (!$$2) {
         qg.P($$4);
      } else {
         $$4.a(egc.a.j, rz.an);
         $$4.a(egc.a.j, rz.am);
      }

      qg.f($$4);
      qg.j($$4);
      if (!$$2) {
         qg.X($$4);
      } else {
         $$4.a(egc.a.j, rz.ae);
      }

      qg.Q($$4);
      if (!$$2) {
         qg.ae($$4);
         qg.af($$4);
      }

      qg.b($$4, true);
      return new dkd.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(
            $$2
               ? new dkj.a().b(7768221).c(5597568).a(8484720).d(12171705).f(7832178).e(8883574).a(dkb.b).a().b()
               : new dkj.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dkj.b.b).a(dkb.b).a(awl.a(awn.qX)).b()
         )
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   public static dkd g(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      qg.a($$2);
      qg.a($$2, 70);
      $$2.a(bxh.a, 1, new dkp.c(bwo.bh, 1, 1));
      $$2.a(bxh.a, 30, new dkp.c(bwo.q, 4, 4));
      $$2.a(bxh.b, 10, new dkp.c(bwo.ab, 2, 5));
      dke.a $$3 = new dke.a($$0, $$1);
      qg.an($$3);
      a($$3);
      qg.f($$3);
      qg.k($$3);
      qg.R($$3);
      qg.ae($$3);
      qg.al($$3);
      $$3.a(egc.a.j, rr.e);
      awk $$4 = awl.a(awn.qW);
      return new dkd.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dkj.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dkj.b.c).a(dkb.b).a($$4).b())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dkd h(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      qg.a($$2, 70);
      $$2.a(bxh.a, 1, new dkp.c(bwo.bh, 1, 1));
      $$2.a(bxh.a, 30, new dkp.c(bwo.q, 4, 4));
      $$2.a(bxh.b, 10, new dkp.c(bwo.ab, 2, 5));
      $$2.a(bxh.g, 25, new dkp.c(bwo.bA, 8, 8));
      dke.a $$3 = new dke.a($$0, $$1);
      qg.an($$3);
      a($$3);
      qg.f($$3);
      qg.l($$3);
      qg.S($$3);
      $$3.a(egc.a.j, rr.e);
      awk $$4 = awl.a(awn.qW);
      return new dkd.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dkj.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dkj.b.c).a(dkb.b).a($$4).b())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dkd j(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dkp.a $$3 = new dkp.a().a(bxh.f, 2, new dkp.c(bwo.br, 1, 4)).a(bxh.g, 5, new dkp.c(bwo.ba, 1, 5));
      qg.c($$3);
      $$3.a(bxh.a, $$2 ? 1 : 100, new dkp.c(bwo.K, 1, 1));
      dke.a $$4 = new dke.a($$0, $$1);
      a($$4);
      qg.f($$4);
      qg.j($$4);
      qg.v($$4);
      qg.o($$4);
      qg.X($$4);
      qg.ab($$4);
      qg.ae($$4);
      qg.b($$4, true);
      if (!$$2) {
         $$4.a(egc.a.j, rr.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, e);
   }

   public static dkd b(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2, boolean $$3) {
      dkp.a $$4 = new dkp.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bxh.b, 5, new dkp.c(bwo.bB, 2, 5));
      }

      qg.c($$4);
      dke.a $$6 = new dke.a($$0, $$1);
      a($$6);
      qg.f($$6);
      qg.j($$6);
      qg.X($$6);
      qg.ab($$6);
      qg.ae($$6);
      qg.b($$6, true);
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

   public static dkd i(jf<eqf> $$0, jf<eik<?>> $$1) {
      dke.a $$2 = new dke.a($$0, $$1);
      $$2.a(egc.a.k, ru.n);
      return a(false, 0.5F, 0.5F, new dkp.a(), $$2, e);
   }

   public static dkd k(jf<eqf> $$0, jf<eik<?>> $$1, boolean $$2) {
      dke.a $$3 = new dke.a($$0, $$1);
      dkp.a $$4 = new dkp.a();
      $$4.a(bxh.b, 1, new dkp.c($$2 ? bwo.aQ : bwo.I, 1, 2)).a(bxh.b, 2, new dkp.c(bwo.aY, 2, 6)).a(bxh.b, 2, new dkp.c(bwo.bb, 2, 4));
      qg.c($$4);
      a($$3);
      qg.ad($$3);
      qg.f($$3);
      qg.j($$3);
      if ($$2) {
         qg.Y($$3);
      } else {
         qg.Z($$3);
      }

      qg.h($$3);
      qg.i($$3);
      awk $$5 = awl.a($$2 ? awn.ra : awn.qZ);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dkd j(jf<eqf> $$0, jf<eik<?>> $$1) {
      dke.a $$2 = new dke.a($$0, $$1);
      dkp.a $$3 = new dkp.a();
      $$3.a(bxh.b, 5, new dkp.c(bwo.ah, 1, 3));
      qg.c($$3);
      a($$2);
      qg.ar($$2);
      qg.f($$2);
      qg.j($$2);
      qg.h($$2);
      qg.i($$2);
      awk $$4 = awl.a(awn.rc);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dkd k(jf<eqf> $$0, jf<eik<?>> $$1) {
      dke.a $$2 = new dke.a($$0, $$1);
      dkp.a $$3 = new dkp.a();
      $$3.a(bxh.b, 5, new dkp.c(bwo.ah, 1, 3));
      qg.c($$3);
      a($$2);
      qg.ar($$2);
      qg.f($$2);
      qg.j($$2);
      qg.h($$2);
      qg.i($$2);
      awk $$4 = awl.a(awn.qU);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dkd l(jf<eqf> $$0, jf<eik<?>> $$1) {
      dke.a $$2 = new dke.a($$0, $$1);
      dkp.a $$3 = new dkp.a();
      qg.c($$3);
      a($$2);
      qg.f($$2);
      qg.j($$2);
      qg.h($$2);
      qg.i($$2);
      awk $$4 = awl.a(awn.rf);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dkd m(jf<eqf> $$0, jf<eik<?>> $$1) {
      dke.a $$2 = new dke.a($$0, $$1);
      dkp.a $$3 = new dkp.a();
      $$3.a(bxh.b, 4, new dkp.c(bwo.aY, 2, 3)).a(bxh.b, 5, new dkp.c(bwo.ah, 1, 3));
      qg.c($$3);
      a($$2);
      qg.ar($$2);
      qg.f($$2);
      qg.j($$2);
      qg.b($$2, false);
      qg.h($$2);
      qg.i($$2);
      awk $$4 = awl.a(awn.rd);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dkd n(jf<eqf> $$0, jf<eik<?>> $$1) {
      dke.a $$2 = new dke.a($$0, $$1);
      dkp.a $$3 = new dkp.a();
      $$3.a(bxh.b, 1, new dkp.c(bwo.bM, 1, 1)).a(bxh.b, 8, new dkp.c(bwo.aY, 2, 3)).a(bxh.b, 4, new dkp.c(bwo.aa, 2, 4));
      qg.c($$3);
      a($$2);
      qg.ar($$2);
      qg.f($$2);
      qg.j($$2);
      qg.u($$2);
      qg.b($$2, false);
      qg.h($$2);
      qg.i($$2);
      awk $$4 = awl.a(awn.qT);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dkd o(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      $$2.a(bxh.d, 10, new dkp.c(bwo.h, 4, 6));
      $$2.a(bxh.g, 25, new dkp.c(bwo.bA, 8, 8));
      qg.c($$2);
      dke.a $$3 = new dke.a($$0, $$1);
      a($$3);
      qg.ad($$3);
      qg.f($$3);
      qg.D($$3);
      qg.j($$3);
      qg.C($$3);
      awk $$4 = awl.a(awn.qV);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dkd p(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      qg.g($$2);
      dke.a $$3 = new dke.a($$0, $$1);
      a($$3);
      qg.ad($$3);
      qg.a($$3, true);
      qg.j($$3);
      qg.U($$3);
      qg.ae($$3);
      qg.b($$3, false);
      qg.d($$3);
      awk $$4 = awl.a(awn.qS);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dkd q(jf<eqf> $$0, jf<eik<?>> $$1) {
      dkp.a $$2 = new dkp.a();
      dke.a $$3 = new dke.a($$0, $$1);
      $$3.a(qi.a);
      $$3.a(qi.b);
      $$3.a(qi.c);
      qg.ax($$3);
      qg.b($$3);
      qg.c($$3);
      qg.au($$3);
      qg.ad($$3);
      qg.f($$3);
      qg.j($$3);
      qg.U($$3);
      qg.ae($$3);
      qg.b($$3, false);
      qg.e($$3);
      awk $$4 = awl.a(awn.qR);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
