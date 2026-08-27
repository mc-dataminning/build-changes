import javax.annotation.Nullable;

public class qh {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final ath d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = awh.a($$1, -1.0F, 1.0F);
      return awh.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static cwm a(boolean $$0, float $$1, float $$2, cwy.a $$3, cwn.a $$4, @Nullable ath $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static cwm a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, cwy.a $$7, cwn.a $$8, @Nullable ath $$9
   ) {
      cws.a $$10 = new cws.a().b($$3).c($$4).a(12638463).d(a($$1)).a(cwk.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new cwm.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cwn.a $$0) {
      pg.a($$0);
      pg.aw($$0);
      pg.b($$0);
      pg.c($$0);
      pg.ap($$0);
      pg.at($$0);
   }

   public static cwm a(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a();
      pg.a($$3);
      $$3.a(boj.b, new cwy.c(bnu.bq, 8, 4, 4));
      $$3.a(boj.b, new cwy.c(bnu.aE, 4, 2, 3));
      $$3.a(boj.b, new cwy.c(bnu.P, 8, 2, 4));
      if ($$2) {
         pg.c($$3);
      } else {
         pg.b($$3);
         pg.a($$3, 100, 25, 100, false);
      }

      cwn.a $$4 = new cwn.a($$0, $$1);
      a($$4);
      pg.m($$4);
      pg.n($$4);
      pg.f($$4);
      pg.j($$4);
      $$4.a(dqk.b.j, $$2 ? rd.ar : rd.as);
      pg.V($$4);
      pg.U($$4);
      pg.ac($$4);
      pg.ad($$4);
      pg.p($$4);
      ath $$5 = ati.a(atk.pG);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static cwm a(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, ati.a(atk.pT));
   }

   public static cwm b(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.i($$2);
      $$2.a(boj.b, new cwy.c(bnu.av, 40, 1, 2)).a(boj.a, new cwy.c(bnu.as, 2, 1, 3)).a(boj.b, new cwy.c(bnu.au, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, ati.a(atk.pS));
   }

   public static cwm c(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.i($$2);
      $$2.a(boj.b, new cwy.c(bnu.av, 40, 1, 2)).a(boj.b, new cwy.c(bnu.au, 80, 1, 2)).a(boj.a, new cwy.c(bnu.as, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, ati.a(atk.pU));
   }

   private static cwm a(ik<eai> $$0, ik<dsr<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, cwy.a $$6, ath $$7) {
      cwn.a $$8 = new cwn.a($$0, $$1);
      a($$8);
      pg.f($$8);
      pg.j($$8);
      if ($$3) {
         pg.r($$8);
      } else {
         if ($$5) {
            pg.q($$8);
         }

         if ($$4) {
            pg.F($$8);
         } else {
            pg.E($$8);
         }
      }

      pg.Y($$8);
      pg.I($$8);
      pg.ac($$8);
      pg.ad($$8);
      pg.ah($$8);
      if ($$4) {
         pg.ag($$8);
      } else {
         pg.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static cwm b(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a();
      pg.a($$3);
      $$3.a(boj.b, new cwy.c(bnu.al, 5, 4, 6));
      pg.c($$3);
      cwn.a $$4 = new cwn.a($$0, $$1);
      a($$4);
      pg.f($$4);
      pg.j($$4);
      if ($$2) {
         pg.D($$4);
      } else {
         pg.C($$4);
      }

      pg.V($$4);
      pg.Z($$4);
      pg.ac($$4);
      pg.ad($$4);
      pg.h($$4);
      pg.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static cwm d(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.f($$2);
      cwn.a $$3 = new cwn.a($$0, $$1);
      pg.al($$3);
      a($$3);
      pg.f($$3);
      pg.j($$3);
      pg.V($$3);
      pg.Z($$3);
      pg.T($$3);
      pg.ac($$3);
      pg.ai($$3);
      pg.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, ati.a(atk.pQ));
   }

   public static cwm a(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cwy.a $$5 = new cwy.a();
      cwn.a $$6 = new cwn.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         pg.e($$5);
         if ($$4) {
            $$6.a(dqk.b.e, qy.a);
            $$6.a(dqk.b.e, qy.b);
         }
      } else {
         pg.d($$5);
         pg.ab($$6);
         if ($$2) {
            $$6.a(dqk.b.j, rd.d);
         }
      }

      pg.f($$6);
      pg.j($$6);
      if ($$3) {
         pg.H($$6);
         pg.V($$6);
         pg.Z($$6);
      } else {
         pg.S($$6);
      }

      pg.ac($$6);
      if ($$2) {
         $$6.a(dqk.b.j, rd.E);
         $$6.a(dqk.b.j, rd.e);
      } else {
         pg.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static cwm e(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.h($$2);
      cwn.a $$3 = new cwn.a($$0, $$1);
      a($$3);
      pg.f($$3);
      pg.j($$3);
      pg.R($$3);
      pg.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static cwm a(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2, boolean $$3) {
      cwn.a $$4 = new cwn.a($$0, $$1);
      a($$4);
      if (!$$2) {
         pg.J($$4);
      }

      pg.f($$4);
      pg.j($$4);
      if ($$2) {
         pg.z($$4);
         pg.V($$4);
         pg.K($$4);
      } else {
         pg.y($$4);
         pg.Y($$4);
         pg.L($$4);
      }

      pg.ac($$4);
      pg.ad($$4);
      cwy.a $$5 = new cwy.a();
      pg.a($$5);
      $$5.a(boj.b, new cwy.c(bnu.aa, 1, 2, 6)).a(boj.b, new cwy.c(bnu.y, 1, 1, 1)).a(boj.b, new cwy.c(bnu.d, 10, 2, 3));
      pg.c($$5);
      if ($$3) {
         $$5.a(boj.b, new cwy.c(bnu.al, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static cwm c(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a();
      pg.c($$3);
      $$3.a(boj.b, new cwy.c(bnu.d, 1, 1, 2));
      $$3.a(0.03F);
      cwn.a $$4 = new cwn.a($$0, $$1);
      a($$4);
      pg.f($$4);
      pg.g($$4);
      pg.j($$4);
      if ($$2) {
         pg.G($$4);
      }

      pg.M($$4);
      pg.ac($$4);
      pg.ae($$4);
      return new cwm.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new cws.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(cwk.b).a(ati.a(atk.pR)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static cwm a(cwy.a $$0, int $$1, int $$2, cwn.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cwn.a s(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwn.a $$2 = new cwn.a($$0, $$1);
      a($$2);
      pg.f($$2);
      pg.j($$2);
      pg.u($$2);
      pg.V($$2);
      pg.Z($$2);
      pg.ac($$2);
      pg.ad($$2);
      return $$2;
   }

   public static cwm d(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a();
      pg.a($$3, 3, 4, 15);
      $$3.a(boj.g, new cwy.c(bnu.aG, 15, 1, 5));
      cwn.a $$4 = s($$0, $$1);
      $$4.a(dqk.b.j, $$2 ? qv.h : qv.c);
      pg.an($$4);
      pg.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static cwm e(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a();
      pg.a($$3, 1, 4, 10);
      $$3.a(boj.f, new cwy.c(bnu.x, 1, 1, 2));
      cwn.a $$4 = s($$0, $$1);
      $$4.a(dqk.b.j, $$2 ? qv.g : qv.b);
      pg.an($$4);
      pg.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static cwm f(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a();
      if ($$2) {
         pg.a($$3, 8, 4, 8);
      } else {
         pg.a($$3, 10, 2, 15);
      }

      $$3.a(boj.g, new cwy.c(bnu.aD, 5, 1, 3)).a(boj.g, new cwy.c(bnu.be, 25, 8, 8)).a(boj.f, new cwy.c(bnu.x, 2, 1, 2));
      cwn.a $$4 = s($$0, $$1);
      $$4.a(dqk.b.j, $$2 ? qv.f : qv.a);
      if ($$2) {
         pg.an($$4);
      }

      pg.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static cwm f(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a().a(boj.g, new cwy.c(bnu.aD, 15, 1, 3));
      pg.a($$2, 10, 4);
      cwn.a $$3 = s($$0, $$1).a(dqk.b.j, qv.m).a(dqk.b.j, qv.a).a(dqk.b.j, qv.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static cwm g(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a().a(boj.f, new cwy.c(bnu.aV, 1, 1, 4)).a(boj.g, new cwy.c(bnu.aG, 15, 1, 5)).a(boj.b, new cwy.c(bnu.aB, 1, 1, 2));
      pg.c($$3);
      $$3.a(boj.a, new cwy.c(bnu.A, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cwn.a $$5 = new cwn.a($$0, $$1);
      pg.ar($$5);
      a($$5);
      pg.as($$5);
      pg.f($$5);
      pg.j($$5);
      pg.u($$5);
      pg.V($$5);
      pg.Z($$5);
      pg.ac($$5);
      pg.ad($$5);
      return new cwm.a().a(true).a($$4).a(cwm.d.b).b(0.5F).a(new cws.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(cwk.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static cwm b(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cwn.a $$5 = new cwn.a($$0, $$1);
      a($$5);
      ath $$6;
      if ($$4) {
         $$6 = ati.a(atk.pP);
         $$5.a(dqk.b.j, rd.Y);
      } else {
         $$6 = ati.a(atk.pF);
         pg.N($$5);
      }

      pg.f($$5);
      pg.j($$5);
      if ($$4) {
         $$5.a(dqk.b.j, rd.aa);
         $$5.a(dqk.b.j, rd.R);
         pg.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               pg.x($$5);
            } else {
               pg.v($$5);
            }
         } else {
            pg.w($$5);
         }

         pg.V($$5);
         pg.O($$5);
      }

      pg.ac($$5);
      pg.ad($$5);
      cwy.a $$8 = new cwy.a();
      pg.a($$8);
      pg.c($$8);
      if ($$4) {
         $$8.a(boj.b, new cwy.c(bnu.aE, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(boj.b, new cwy.c(bnu.bq, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static cwm h(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a();
      pg.a($$3);
      $$3.a(boj.b, new cwy.c(bnu.bq, 8, 4, 4)).a(boj.b, new cwy.c(bnu.aE, 4, 2, 3)).a(boj.b, new cwy.c(bnu.P, 8, 2, 4));
      pg.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cwn.a $$5 = new cwn.a($$0, $$1);
      a($$5);
      pg.n($$5);
      pg.f($$5);
      pg.j($$5);
      pg.s($$5);
      pg.V($$5);
      pg.aa($$5);
      pg.ad($$5);
      if ($$2) {
         pg.o($$5);
      } else {
         pg.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static cwm g(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.a($$2);
      pg.c($$2);
      cwn.a $$3 = new cwn.a($$0, $$1);
      a($$3);
      $$3.a(dqk.b.j, rd.X);
      pg.N($$3);
      pg.f($$3);
      pg.j($$3);
      pg.V($$3);
      pg.O($$3);
      pg.ac($$3);
      pg.ad($$3);
      ath $$4 = ati.a(atk.pF);
      return new cwm.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new cws.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(cws.b.b).a(cwk.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cwm h(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.a($$2);
      pg.c($$2);
      $$2.a(boj.a, new cwy.c(bnu.aN, 1, 1, 1));
      $$2.a(boj.b, new cwy.c(bnu.Q, 10, 2, 5));
      cwn.a $$3 = new cwn.a($$0, $$1);
      pg.al($$3);
      a($$3);
      pg.f($$3);
      pg.k($$3);
      pg.P($$3);
      pg.ac($$3);
      pg.aj($$3);
      $$3.a(dqk.b.j, qv.e);
      ath $$4 = ati.a(atk.pE);
      return new cwm.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cws.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(cws.b.c).a(cwk.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cwm i(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.c($$2);
      $$2.a(boj.a, new cwy.c(bnu.aN, 1, 1, 1));
      $$2.a(boj.b, new cwy.c(bnu.Q, 10, 2, 5));
      $$2.a(boj.g, new cwy.c(bnu.be, 25, 8, 8));
      cwn.a $$3 = new cwn.a($$0, $$1);
      pg.al($$3);
      a($$3);
      pg.f($$3);
      pg.l($$3);
      pg.Q($$3);
      $$3.a(dqk.b.j, qv.e);
      ath $$4 = ati.a(atk.pE);
      return new cwm.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cws.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(cws.b.c).a(cwk.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cwm i(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwy.a $$3 = new cwy.a().a(boj.f, new cwy.c(bnu.aV, 2, 1, 4)).a(boj.g, new cwy.c(bnu.aG, 5, 1, 5));
      pg.c($$3);
      $$3.a(boj.a, new cwy.c(bnu.A, $$2 ? 1 : 100, 1, 1));
      cwn.a $$4 = new cwn.a($$0, $$1);
      a($$4);
      pg.f($$4);
      pg.j($$4);
      pg.u($$4);
      pg.V($$4);
      pg.Z($$4);
      pg.ac($$4);
      pg.ad($$4);
      if (!$$2) {
         $$4.a(dqk.b.j, qv.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static cwm b(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2, boolean $$3) {
      cwy.a $$4 = new cwy.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(boj.b, new cwy.c(bnu.bf, 5, 2, 5));
      }

      pg.c($$4);
      cwn.a $$6 = new cwn.a($$0, $$1);
      a($$6);
      pg.f($$6);
      pg.j($$6);
      pg.V($$6);
      pg.Z($$6);
      pg.ac($$6);
      pg.ad($$6);
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

   public static cwm j(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwn.a $$2 = new cwn.a($$0, $$1);
      $$2.a(dqk.b.k, qy.n);
      return a(false, 0.5F, 0.5F, new cwy.a(), $$2, d);
   }

   public static cwm j(ik<eai> $$0, ik<dsr<?>> $$1, boolean $$2) {
      cwn.a $$3 = new cwn.a($$0, $$1);
      cwy.a $$4 = new cwy.a();
      $$4.a(boj.b, new cwy.c($$2 ? bnu.ax : bnu.y, 1, 1, 2)).a(boj.b, new cwy.c(bnu.aE, 2, 2, 6)).a(boj.b, new cwy.c(bnu.aH, 2, 2, 4));
      pg.c($$4);
      a($$3);
      pg.ab($$3);
      pg.f($$3);
      pg.j($$3);
      if ($$2) {
         pg.W($$3);
      } else {
         pg.X($$3);
      }

      pg.h($$3);
      pg.i($$3);
      ath $$5 = ati.a($$2 ? atk.pI : atk.pH);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static cwm k(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwn.a $$2 = new cwn.a($$0, $$1);
      cwy.a $$3 = new cwy.a();
      $$3.a(boj.b, new cwy.c(bnu.W, 5, 1, 3));
      pg.c($$3);
      a($$2);
      pg.aq($$2);
      pg.f($$2);
      pg.j($$2);
      pg.h($$2);
      pg.i($$2);
      ath $$4 = ati.a(atk.pK);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cwm l(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwn.a $$2 = new cwn.a($$0, $$1);
      cwy.a $$3 = new cwy.a();
      $$3.a(boj.b, new cwy.c(bnu.W, 5, 1, 3));
      pg.c($$3);
      a($$2);
      pg.aq($$2);
      pg.f($$2);
      pg.j($$2);
      pg.h($$2);
      pg.i($$2);
      ath $$4 = ati.a(atk.pC);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cwm m(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwn.a $$2 = new cwn.a($$0, $$1);
      cwy.a $$3 = new cwy.a();
      pg.c($$3);
      a($$2);
      pg.f($$2);
      pg.j($$2);
      pg.h($$2);
      pg.i($$2);
      ath $$4 = ati.a(atk.pN);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static cwm n(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwn.a $$2 = new cwn.a($$0, $$1);
      cwy.a $$3 = new cwy.a();
      $$3.a(boj.b, new cwy.c(bnu.aE, 4, 2, 3)).a(boj.b, new cwy.c(bnu.W, 5, 1, 3));
      pg.c($$3);
      a($$2);
      pg.aq($$2);
      pg.f($$2);
      pg.j($$2);
      pg.ad($$2);
      pg.h($$2);
      pg.i($$2);
      ath $$4 = ati.a(atk.pL);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static cwm o(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwn.a $$2 = new cwn.a($$0, $$1);
      cwy.a $$3 = new cwy.a();
      pg.a($$3);
      $$3.a(boj.b, new cwy.c(bnu.bq, 8, 4, 4)).a(boj.b, new cwy.c(bnu.aE, 4, 2, 3)).a(boj.b, new cwy.c(bnu.P, 8, 2, 4));
      pg.c($$3);
      a($$2);
      pg.aq($$2);
      pg.f($$2);
      pg.j($$2);
      pg.t($$2);
      pg.ad($$2);
      pg.h($$2);
      pg.i($$2);
      ath $$4 = ati.a(atk.pB);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static cwm p(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      $$2.a(boj.d, new cwy.c(bnu.g, 10, 4, 6));
      $$2.a(boj.g, new cwy.c(bnu.be, 25, 8, 8));
      pg.c($$2);
      cwn.a $$3 = new cwn.a($$0, $$1);
      a($$3);
      pg.ab($$3);
      pg.f($$3);
      pg.B($$3);
      pg.j($$3);
      pg.A($$3);
      ath $$4 = ati.a(atk.pD);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static cwm q(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      pg.g($$2);
      cwn.a $$3 = new cwn.a($$0, $$1);
      a($$3);
      pg.ab($$3);
      pg.a($$3, true);
      pg.j($$3);
      pg.S($$3);
      pg.ac($$3);
      pg.ad($$3);
      pg.d($$3);
      ath $$4 = ati.a(atk.pA);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static cwm r(ik<eai> $$0, ik<dsr<?>> $$1) {
      cwy.a $$2 = new cwy.a();
      cwn.a $$3 = new cwn.a($$0, $$1);
      $$3.a(dqk.a.a, pi.a);
      $$3.a(dqk.a.a, pi.b);
      $$3.a(dqk.a.a, pi.c);
      pg.aw($$3);
      pg.b($$3);
      pg.c($$3);
      pg.at($$3);
      pg.ab($$3);
      pg.f($$3);
      pg.j($$3);
      pg.S($$3);
      pg.ac($$3);
      pg.ad($$3);
      pg.e($$3);
      ath $$4 = ati.a(atk.pz);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
