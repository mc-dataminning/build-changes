import javax.annotation.Nullable;

public class oo {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final apc d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = ary.a($$1, -1.0F, 1.0F);
      return ary.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static cqv a(boolean $$0, float $$1, float $$2, crh.a $$3, cqw.a $$4, @Nullable apc $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static cqv a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, crh.a $$7, cqw.a $$8, @Nullable apc $$9
   ) {
      crb.a $$10 = new crb.a().b($$3).c($$4).a(12638463).d(a($$1)).a(cqt.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new cqv.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cqw.a $$0) {
      ns.a($$0);
      ns.aw($$0);
      ns.b($$0);
      ns.c($$0);
      ns.ap($$0);
      ns.at($$0);
   }

   public static cqv a(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a();
      ns.a($$3);
      $$3.a(bjl.b, new crh.c(biw.bn, 8, 4, 4));
      $$3.a(bjl.b, new crh.c(biw.aC, 4, 2, 3));
      $$3.a(bjl.b, new crh.c(biw.N, 8, 2, 4));
      if ($$2) {
         ns.c($$3);
      } else {
         ns.b($$3);
         ns.a($$3, 100, 25, 100, false);
      }

      cqw.a $$4 = new cqw.a($$0, $$1);
      a($$4);
      ns.m($$4);
      ns.n($$4);
      ns.f($$4);
      ns.j($$4);
      $$4.a(dkq.b.j, $$2 ? pk.ar : pk.as);
      ns.V($$4);
      ns.U($$4);
      ns.ac($$4);
      ns.ad($$4);
      ns.p($$4);
      apc $$5 = apd.a(apf.oD);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static cqv a(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, apd.a(apf.oQ));
   }

   public static cqv b(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.i($$2);
      $$2.a(bjl.b, new crh.c(biw.at, 40, 1, 2)).a(bjl.a, new crh.c(biw.aq, 2, 1, 3)).a(bjl.b, new crh.c(biw.as, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, apd.a(apf.oP));
   }

   public static cqv c(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.i($$2);
      $$2.a(bjl.b, new crh.c(biw.at, 40, 1, 2)).a(bjl.b, new crh.c(biw.as, 80, 1, 2)).a(bjl.a, new crh.c(biw.aq, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, apd.a(apf.oR));
   }

   private static cqv a(hh<duo> $$0, hh<dmx<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, crh.a $$6, apc $$7) {
      cqw.a $$8 = new cqw.a($$0, $$1);
      a($$8);
      ns.f($$8);
      ns.j($$8);
      if ($$3) {
         ns.r($$8);
      } else {
         if ($$5) {
            ns.q($$8);
         }

         if ($$4) {
            ns.F($$8);
         } else {
            ns.E($$8);
         }
      }

      ns.Y($$8);
      ns.I($$8);
      ns.ac($$8);
      ns.ad($$8);
      ns.ah($$8);
      if ($$4) {
         ns.ag($$8);
      } else {
         ns.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static cqv b(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a();
      ns.a($$3);
      $$3.a(bjl.b, new crh.c(biw.aj, 5, 4, 6));
      ns.c($$3);
      cqw.a $$4 = new cqw.a($$0, $$1);
      a($$4);
      ns.f($$4);
      ns.j($$4);
      if ($$2) {
         ns.D($$4);
      } else {
         ns.C($$4);
      }

      ns.V($$4);
      ns.Z($$4);
      ns.ac($$4);
      ns.ad($$4);
      ns.h($$4);
      ns.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static cqv d(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.f($$2);
      cqw.a $$3 = new cqw.a($$0, $$1);
      ns.al($$3);
      a($$3);
      ns.f($$3);
      ns.j($$3);
      ns.V($$3);
      ns.Z($$3);
      ns.T($$3);
      ns.ac($$3);
      ns.ai($$3);
      ns.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, apd.a(apf.oN));
   }

   public static cqv a(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      crh.a $$5 = new crh.a();
      cqw.a $$6 = new cqw.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         ns.e($$5);
         if ($$4) {
            $$6.a(dkq.b.e, pf.a);
            $$6.a(dkq.b.e, pf.b);
         }
      } else {
         ns.d($$5);
         ns.ab($$6);
         if ($$2) {
            $$6.a(dkq.b.j, pk.d);
         }
      }

      ns.f($$6);
      ns.j($$6);
      if ($$3) {
         ns.H($$6);
         ns.V($$6);
         ns.Z($$6);
      } else {
         ns.S($$6);
      }

      ns.ac($$6);
      if ($$2) {
         $$6.a(dkq.b.j, pk.E);
         $$6.a(dkq.b.j, pk.e);
      } else {
         ns.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static cqv e(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.h($$2);
      cqw.a $$3 = new cqw.a($$0, $$1);
      a($$3);
      ns.f($$3);
      ns.j($$3);
      ns.R($$3);
      ns.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static cqv a(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2, boolean $$3) {
      cqw.a $$4 = new cqw.a($$0, $$1);
      a($$4);
      if (!$$2) {
         ns.J($$4);
      }

      ns.f($$4);
      ns.j($$4);
      if ($$2) {
         ns.z($$4);
         ns.V($$4);
         ns.K($$4);
      } else {
         ns.y($$4);
         ns.Y($$4);
         ns.L($$4);
      }

      ns.ac($$4);
      ns.ad($$4);
      crh.a $$5 = new crh.a();
      ns.a($$5);
      $$5.a(bjl.b, new crh.c(biw.Y, 1, 2, 6)).a(bjl.b, new crh.c(biw.w, 1, 1, 1));
      ns.c($$5);
      if ($$3) {
         $$5.a(bjl.b, new crh.c(biw.aj, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static cqv c(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a();
      ns.c($$3);
      cqw.a $$4 = new cqw.a($$0, $$1);
      a($$4);
      ns.f($$4);
      ns.g($$4);
      ns.j($$4);
      if ($$2) {
         ns.G($$4);
      }

      ns.M($$4);
      ns.ac($$4);
      ns.ae($$4);
      return new cqv.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new crb.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(cqt.b).a(apd.a(apf.oO)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static cqv a(crh.a $$0, int $$1, int $$2, cqw.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cqw.a s(hh<duo> $$0, hh<dmx<?>> $$1) {
      cqw.a $$2 = new cqw.a($$0, $$1);
      a($$2);
      ns.f($$2);
      ns.j($$2);
      ns.u($$2);
      ns.V($$2);
      ns.Z($$2);
      ns.ac($$2);
      ns.ad($$2);
      return $$2;
   }

   public static cqv d(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a();
      ns.a($$3, 3, 4, 15);
      $$3.a(bjl.g, new crh.c(biw.aE, 15, 1, 5));
      cqw.a $$4 = s($$0, $$1);
      $$4.a(dkq.b.j, $$2 ? pc.h : pc.c);
      ns.an($$4);
      ns.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static cqv e(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a();
      ns.a($$3, 1, 4, 10);
      $$3.a(bjl.f, new crh.c(biw.v, 1, 1, 2));
      cqw.a $$4 = s($$0, $$1);
      $$4.a(dkq.b.j, $$2 ? pc.g : pc.b);
      ns.an($$4);
      ns.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static cqv f(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a();
      if ($$2) {
         ns.a($$3, 8, 4, 8);
      } else {
         ns.a($$3, 10, 2, 15);
      }

      $$3.a(bjl.g, new crh.c(biw.aB, 5, 1, 3)).a(bjl.g, new crh.c(biw.bc, 25, 8, 8)).a(bjl.f, new crh.c(biw.v, 2, 1, 2));
      cqw.a $$4 = s($$0, $$1);
      $$4.a(dkq.b.j, $$2 ? pc.f : pc.a);
      if ($$2) {
         ns.an($$4);
      }

      ns.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static cqv f(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a().a(bjl.g, new crh.c(biw.aB, 15, 1, 3));
      ns.a($$2, 10, 4);
      cqw.a $$3 = s($$0, $$1).a(dkq.b.j, pc.m).a(dkq.b.j, pc.a).a(dkq.b.j, pc.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static cqv g(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a().a(bjl.f, new crh.c(biw.aT, 1, 1, 4)).a(bjl.g, new crh.c(biw.aE, 15, 1, 5)).a(bjl.b, new crh.c(biw.az, 1, 1, 2));
      ns.c($$3);
      $$3.a(bjl.a, new crh.c(biw.y, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cqw.a $$5 = new cqw.a($$0, $$1);
      ns.ar($$5);
      a($$5);
      ns.as($$5);
      ns.f($$5);
      ns.j($$5);
      ns.u($$5);
      ns.V($$5);
      ns.Z($$5);
      ns.ac($$5);
      ns.ad($$5);
      return new cqv.a().a(true).a($$4).a(cqv.d.b).b(0.5F).a(new crb.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(cqt.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static cqv b(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cqw.a $$5 = new cqw.a($$0, $$1);
      a($$5);
      apc $$6;
      if ($$4) {
         $$6 = apd.a(apf.oM);
         $$5.a(dkq.b.j, pk.Y);
      } else {
         $$6 = apd.a(apf.oC);
         ns.N($$5);
      }

      ns.f($$5);
      ns.j($$5);
      if ($$4) {
         $$5.a(dkq.b.j, pk.aa);
         $$5.a(dkq.b.j, pk.R);
         ns.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               ns.x($$5);
            } else {
               ns.v($$5);
            }
         } else {
            ns.w($$5);
         }

         ns.V($$5);
         ns.O($$5);
      }

      ns.ac($$5);
      ns.ad($$5);
      crh.a $$8 = new crh.a();
      ns.a($$8);
      ns.c($$8);
      if ($$4) {
         $$8.a(bjl.b, new crh.c(biw.aC, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bjl.b, new crh.c(biw.bn, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static cqv h(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a();
      ns.a($$3);
      $$3.a(bjl.b, new crh.c(biw.bn, 8, 4, 4)).a(bjl.b, new crh.c(biw.aC, 4, 2, 3)).a(bjl.b, new crh.c(biw.N, 8, 2, 4));
      ns.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cqw.a $$5 = new cqw.a($$0, $$1);
      a($$5);
      ns.n($$5);
      ns.f($$5);
      ns.j($$5);
      ns.s($$5);
      ns.V($$5);
      ns.aa($$5);
      ns.ad($$5);
      if ($$2) {
         ns.o($$5);
      } else {
         ns.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static cqv g(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.a($$2);
      ns.c($$2);
      cqw.a $$3 = new cqw.a($$0, $$1);
      a($$3);
      $$3.a(dkq.b.j, pk.X);
      ns.N($$3);
      ns.f($$3);
      ns.j($$3);
      ns.V($$3);
      ns.O($$3);
      ns.ac($$3);
      ns.ad($$3);
      apc $$4 = apd.a(apf.oC);
      return new cqv.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new crb.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(crb.b.b).a(cqt.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqv h(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.a($$2);
      ns.c($$2);
      $$2.a(bjl.a, new crh.c(biw.aL, 1, 1, 1));
      $$2.a(bjl.b, new crh.c(biw.O, 10, 2, 5));
      cqw.a $$3 = new cqw.a($$0, $$1);
      ns.al($$3);
      a($$3);
      ns.f($$3);
      ns.k($$3);
      ns.P($$3);
      ns.ac($$3);
      ns.aj($$3);
      $$3.a(dkq.b.j, pc.e);
      apc $$4 = apd.a(apf.oB);
      return new cqv.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new crb.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(crb.b.c).a(cqt.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqv i(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.c($$2);
      $$2.a(bjl.a, new crh.c(biw.aL, 1, 1, 1));
      $$2.a(bjl.b, new crh.c(biw.O, 10, 2, 5));
      $$2.a(bjl.g, new crh.c(biw.bc, 25, 8, 8));
      cqw.a $$3 = new cqw.a($$0, $$1);
      ns.al($$3);
      a($$3);
      ns.f($$3);
      ns.l($$3);
      ns.Q($$3);
      $$3.a(dkq.b.j, pc.e);
      apc $$4 = apd.a(apf.oB);
      return new cqv.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new crb.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(crb.b.c).a(cqt.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqv i(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      crh.a $$3 = new crh.a().a(bjl.f, new crh.c(biw.aT, 2, 1, 4)).a(bjl.g, new crh.c(biw.aE, 5, 1, 5));
      ns.c($$3);
      $$3.a(bjl.a, new crh.c(biw.y, $$2 ? 1 : 100, 1, 1));
      cqw.a $$4 = new cqw.a($$0, $$1);
      a($$4);
      ns.f($$4);
      ns.j($$4);
      ns.u($$4);
      ns.V($$4);
      ns.Z($$4);
      ns.ac($$4);
      ns.ad($$4);
      if (!$$2) {
         $$4.a(dkq.b.j, pc.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static cqv b(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2, boolean $$3) {
      crh.a $$4 = new crh.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bjl.b, new crh.c(biw.bd, 5, 2, 5));
      }

      ns.c($$4);
      cqw.a $$6 = new cqw.a($$0, $$1);
      a($$6);
      ns.f($$6);
      ns.j($$6);
      ns.V($$6);
      ns.Z($$6);
      ns.ac($$6);
      ns.ad($$6);
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

   public static cqv j(hh<duo> $$0, hh<dmx<?>> $$1) {
      cqw.a $$2 = new cqw.a($$0, $$1);
      $$2.a(dkq.b.k, pf.n);
      return a(false, 0.5F, 0.5F, new crh.a(), $$2, d);
   }

   public static cqv j(hh<duo> $$0, hh<dmx<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a($$0, $$1);
      crh.a $$4 = new crh.a();
      $$4.a(bjl.b, new crh.c($$2 ? biw.av : biw.w, 1, 1, 2)).a(bjl.b, new crh.c(biw.aC, 2, 2, 6)).a(bjl.b, new crh.c(biw.aF, 2, 2, 4));
      ns.c($$4);
      a($$3);
      ns.ab($$3);
      ns.f($$3);
      ns.j($$3);
      if ($$2) {
         ns.W($$3);
      } else {
         ns.X($$3);
      }

      ns.h($$3);
      ns.i($$3);
      apc $$5 = apd.a($$2 ? apf.oF : apf.oE);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static cqv k(hh<duo> $$0, hh<dmx<?>> $$1) {
      cqw.a $$2 = new cqw.a($$0, $$1);
      crh.a $$3 = new crh.a();
      $$3.a(bjl.b, new crh.c(biw.U, 5, 1, 3));
      ns.c($$3);
      a($$2);
      ns.aq($$2);
      ns.f($$2);
      ns.j($$2);
      ns.h($$2);
      ns.i($$2);
      apc $$4 = apd.a(apf.oH);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cqv l(hh<duo> $$0, hh<dmx<?>> $$1) {
      cqw.a $$2 = new cqw.a($$0, $$1);
      crh.a $$3 = new crh.a();
      $$3.a(bjl.b, new crh.c(biw.U, 5, 1, 3));
      ns.c($$3);
      a($$2);
      ns.aq($$2);
      ns.f($$2);
      ns.j($$2);
      ns.h($$2);
      ns.i($$2);
      apc $$4 = apd.a(apf.oz);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cqv m(hh<duo> $$0, hh<dmx<?>> $$1) {
      cqw.a $$2 = new cqw.a($$0, $$1);
      crh.a $$3 = new crh.a();
      ns.c($$3);
      a($$2);
      ns.f($$2);
      ns.j($$2);
      ns.h($$2);
      ns.i($$2);
      apc $$4 = apd.a(apf.oK);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static cqv n(hh<duo> $$0, hh<dmx<?>> $$1) {
      cqw.a $$2 = new cqw.a($$0, $$1);
      crh.a $$3 = new crh.a();
      $$3.a(bjl.b, new crh.c(biw.aC, 4, 2, 3)).a(bjl.b, new crh.c(biw.U, 5, 1, 3));
      ns.c($$3);
      a($$2);
      ns.aq($$2);
      ns.f($$2);
      ns.j($$2);
      ns.ad($$2);
      ns.h($$2);
      ns.i($$2);
      apc $$4 = apd.a(apf.oI);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static cqv o(hh<duo> $$0, hh<dmx<?>> $$1) {
      cqw.a $$2 = new cqw.a($$0, $$1);
      crh.a $$3 = new crh.a();
      ns.a($$3);
      $$3.a(bjl.b, new crh.c(biw.bn, 8, 4, 4)).a(bjl.b, new crh.c(biw.aC, 4, 2, 3)).a(bjl.b, new crh.c(biw.N, 8, 2, 4));
      ns.c($$3);
      a($$2);
      ns.aq($$2);
      ns.f($$2);
      ns.j($$2);
      ns.t($$2);
      ns.ad($$2);
      ns.h($$2);
      ns.i($$2);
      apc $$4 = apd.a(apf.oy);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static cqv p(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      $$2.a(bjl.d, new crh.c(biw.f, 10, 4, 6));
      $$2.a(bjl.g, new crh.c(biw.bc, 25, 8, 8));
      ns.c($$2);
      cqw.a $$3 = new cqw.a($$0, $$1);
      a($$3);
      ns.ab($$3);
      ns.f($$3);
      ns.B($$3);
      ns.j($$3);
      ns.A($$3);
      apc $$4 = apd.a(apf.oA);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static cqv q(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      ns.g($$2);
      cqw.a $$3 = new cqw.a($$0, $$1);
      a($$3);
      ns.ab($$3);
      ns.a($$3, true);
      ns.j($$3);
      ns.S($$3);
      ns.ac($$3);
      ns.ad($$3);
      ns.d($$3);
      apc $$4 = apd.a(apf.ox);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static cqv r(hh<duo> $$0, hh<dmx<?>> $$1) {
      crh.a $$2 = new crh.a();
      cqw.a $$3 = new cqw.a($$0, $$1);
      $$3.a(dkq.a.a, nu.a);
      $$3.a(dkq.a.a, nu.b);
      $$3.a(dkq.a.a, nu.c);
      ns.aw($$3);
      ns.b($$3);
      ns.c($$3);
      ns.at($$3);
      ns.ab($$3);
      ns.f($$3);
      ns.j($$3);
      ns.S($$3);
      ns.ac($$3);
      ns.ad($$3);
      ns.e($$3);
      apc $$4 = apd.a(apf.ow);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
