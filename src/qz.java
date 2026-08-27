import javax.annotation.Nullable;

public class qz {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final aul d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = axm.a($$1, -1.0F, 1.0F);
      return axm.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static daf a(boolean $$0, float $$1, float $$2, dar.a $$3, dag.a $$4, @Nullable aul $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static daf a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dar.a $$7, dag.a $$8, @Nullable aul $$9
   ) {
      dal.a $$10 = new dal.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dad.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new daf.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dag.a $$0) {
      py.a($$0);
      py.aw($$0);
      py.b($$0);
      py.c($$0);
      py.ap($$0);
      py.at($$0);
   }

   public static daf a(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a();
      py.a($$3);
      $$3.a(bqw.b, new dar.c(bqg.br, 8, 4, 4));
      $$3.a(bqw.b, new dar.c(bqg.aF, 4, 2, 3));
      $$3.a(bqw.b, new dar.c(bqg.Q, 8, 2, 4));
      if ($$2) {
         py.c($$3);
      } else {
         py.b($$3);
         py.a($$3, 100, 25, 100, false);
      }

      dag.a $$4 = new dag.a($$0, $$1);
      a($$4);
      py.m($$4);
      py.n($$4);
      py.f($$4);
      py.j($$4);
      $$4.a(duw.b.j, $$2 ? rv.ar : rv.as);
      py.V($$4);
      py.U($$4);
      py.ac($$4);
      py.ad($$4);
      py.p($$4);
      aul $$5 = aum.a(auo.pR);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static daf a(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.i($$2);
      $$2.a(bqw.b, new dar.c(bqg.br, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, aum.a(auo.qe));
   }

   public static daf b(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.i($$2);
      $$2.a(bqw.b, new dar.c(bqg.aw, 40, 1, 2)).a(bqw.a, new dar.c(bqg.at, 2, 1, 3)).a(bqw.b, new dar.c(bqg.av, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, aum.a(auo.qd));
   }

   public static daf c(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.i($$2);
      $$2.a(bqw.b, new dar.c(bqg.aw, 40, 1, 2)).a(bqw.b, new dar.c(bqg.av, 80, 1, 2)).a(bqw.a, new dar.c(bqg.at, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, aum.a(auo.qf));
   }

   private static daf a(io<eeu> $$0, io<dxd<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dar.a $$6, aul $$7) {
      dag.a $$8 = new dag.a($$0, $$1);
      a($$8);
      py.f($$8);
      py.j($$8);
      if ($$3) {
         py.r($$8);
      } else {
         if ($$5) {
            py.q($$8);
         }

         if ($$4) {
            py.F($$8);
         } else {
            py.E($$8);
         }
      }

      py.Y($$8);
      py.I($$8);
      py.ac($$8);
      py.ad($$8);
      py.ah($$8);
      if ($$4) {
         py.ag($$8);
      } else {
         py.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static daf b(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a();
      py.a($$3);
      $$3.a(bqw.b, new dar.c(bqg.am, 5, 4, 6));
      py.c($$3);
      dag.a $$4 = new dag.a($$0, $$1);
      a($$4);
      py.f($$4);
      py.j($$4);
      if ($$2) {
         py.D($$4);
      } else {
         py.C($$4);
      }

      py.V($$4);
      py.Z($$4);
      py.ac($$4);
      py.ad($$4);
      py.h($$4);
      py.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static daf d(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.f($$2);
      dag.a $$3 = new dag.a($$0, $$1);
      py.al($$3);
      a($$3);
      py.f($$3);
      py.j($$3);
      py.V($$3);
      py.Z($$3);
      py.T($$3);
      py.ac($$3);
      py.ai($$3);
      py.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, aum.a(auo.qb));
   }

   public static daf a(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dar.a $$5 = new dar.a();
      dag.a $$6 = new dag.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         py.e($$5);
         if ($$4) {
            $$6.a(duw.b.e, rq.a);
            $$6.a(duw.b.e, rq.b);
         }
      } else {
         py.d($$5);
         py.ab($$6);
         if ($$2) {
            $$6.a(duw.b.j, rv.d);
         }
      }

      py.f($$6);
      py.j($$6);
      if ($$3) {
         py.H($$6);
         py.V($$6);
         py.Z($$6);
      } else {
         py.S($$6);
      }

      py.ac($$6);
      if ($$2) {
         $$6.a(duw.b.j, rv.E);
         $$6.a(duw.b.j, rv.e);
      } else {
         py.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static daf e(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.h($$2);
      dag.a $$3 = new dag.a($$0, $$1);
      a($$3);
      py.f($$3);
      py.j($$3);
      py.R($$3);
      py.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static daf a(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2, boolean $$3) {
      dag.a $$4 = new dag.a($$0, $$1);
      a($$4);
      if (!$$2) {
         py.J($$4);
      }

      py.f($$4);
      py.j($$4);
      if ($$2) {
         py.z($$4);
         py.V($$4);
         py.K($$4);
      } else {
         py.y($$4);
         py.Y($$4);
         py.L($$4);
      }

      py.ac($$4);
      py.ad($$4);
      dar.a $$5 = new dar.a();
      py.a($$5);
      $$5.a(bqw.b, new dar.c(bqg.ab, 1, 2, 6)).a(bqw.b, new dar.c(bqg.z, 1, 1, 1)).a(bqw.b, new dar.c(bqg.c, 10, 2, 3));
      py.c($$5);
      if ($$3) {
         $$5.a(bqw.b, new dar.c(bqg.am, 8, 4, 4));
         $$5.a(bqw.b, new dar.c(bqg.br, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static daf c(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a();
      py.c($$3);
      $$3.a(bqw.b, new dar.c(bqg.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bqw.b, new dar.c(bqg.br, 2, 4, 8));
         $$3.a(0.04F);
      }

      dag.a $$4 = new dag.a($$0, $$1);
      a($$4);
      py.f($$4);
      py.g($$4);
      py.j($$4);
      if ($$2) {
         py.G($$4);
      }

      py.M($$4);
      py.ac($$4);
      py.ae($$4);
      return new daf.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dal.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dad.b).a(aum.a(auo.qc)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static daf a(dar.a $$0, int $$1, int $$2, dag.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static dag.a s(io<eeu> $$0, io<dxd<?>> $$1) {
      dag.a $$2 = new dag.a($$0, $$1);
      a($$2);
      py.f($$2);
      py.j($$2);
      py.u($$2);
      py.V($$2);
      py.Z($$2);
      py.ac($$2);
      py.ad($$2);
      return $$2;
   }

   public static daf d(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a();
      py.a($$3, 3, 4, 15);
      $$3.a(bqw.g, new dar.c(bqg.aH, 15, 1, 5));
      dag.a $$4 = s($$0, $$1);
      $$4.a(duw.b.j, $$2 ? rn.h : rn.c);
      py.an($$4);
      py.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static daf e(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a();
      py.a($$3, 1, 4, 10);
      $$3.a(bqw.f, new dar.c(bqg.y, 1, 1, 2));
      dag.a $$4 = s($$0, $$1);
      $$4.a(duw.b.j, $$2 ? rn.g : rn.b);
      py.an($$4);
      py.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static daf f(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a();
      if ($$2) {
         py.a($$3, 8, 4, 8);
      } else {
         py.a($$3, 10, 2, 15);
      }

      $$3.a(bqw.g, new dar.c(bqg.aE, 5, 1, 3)).a(bqw.g, new dar.c(bqg.bf, 25, 8, 8)).a(bqw.f, new dar.c(bqg.y, 2, 1, 2));
      dag.a $$4 = s($$0, $$1);
      $$4.a(duw.b.j, $$2 ? rn.f : rn.a);
      if ($$2) {
         py.an($$4);
      }

      py.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static daf f(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a().a(bqw.g, new dar.c(bqg.aE, 15, 1, 3));
      py.a($$2, 10, 4);
      dag.a $$3 = s($$0, $$1).a(duw.b.j, rn.m).a(duw.b.j, rn.a).a(duw.b.j, rn.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static daf g(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a().a(bqw.f, new dar.c(bqg.aW, 1, 1, 4)).a(bqw.g, new dar.c(bqg.aH, 15, 1, 5)).a(bqw.b, new dar.c(bqg.aC, 1, 1, 2));
      py.c($$3);
      $$3.a(bqw.a, new dar.c(bqg.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dag.a $$5 = new dag.a($$0, $$1);
      py.ar($$5);
      a($$5);
      py.as($$5);
      py.f($$5);
      py.j($$5);
      py.u($$5);
      py.V($$5);
      py.Z($$5);
      py.ac($$5);
      py.ad($$5);
      return new daf.a().a(true).a($$4).a(daf.d.b).b(0.5F).a(new dal.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dad.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static daf b(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dag.a $$5 = new dag.a($$0, $$1);
      a($$5);
      aul $$6;
      if ($$4) {
         $$6 = aum.a(auo.qa);
         $$5.a(duw.b.j, rv.Y);
      } else {
         $$6 = aum.a(auo.pQ);
         py.N($$5);
      }

      py.f($$5);
      py.j($$5);
      if ($$4) {
         $$5.a(duw.b.j, rv.aa);
         $$5.a(duw.b.j, rv.R);
         py.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               py.x($$5);
            } else {
               py.v($$5);
            }
         } else {
            py.w($$5);
         }

         py.V($$5);
         py.O($$5);
      }

      py.ac($$5);
      py.ad($$5);
      dar.a $$8 = new dar.a();
      py.a($$8);
      py.c($$8);
      if ($$4) {
         $$8.a(bqw.b, new dar.c(bqg.aF, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bqw.b, new dar.c(bqg.br, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static daf h(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a();
      py.a($$3);
      $$3.a(bqw.b, new dar.c(bqg.br, 8, 4, 4)).a(bqw.b, new dar.c(bqg.aF, 4, 2, 3)).a(bqw.b, new dar.c(bqg.Q, 8, 2, 4));
      py.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dag.a $$5 = new dag.a($$0, $$1);
      a($$5);
      py.n($$5);
      py.f($$5);
      py.j($$5);
      py.s($$5);
      py.V($$5);
      py.aa($$5);
      py.ad($$5);
      if ($$2) {
         py.o($$5);
      } else {
         py.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static daf g(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.a($$2);
      py.c($$2);
      dag.a $$3 = new dag.a($$0, $$1);
      a($$3);
      $$3.a(duw.b.j, rv.X);
      py.N($$3);
      py.f($$3);
      py.j($$3);
      py.V($$3);
      py.O($$3);
      py.ac($$3);
      py.ad($$3);
      aul $$4 = aum.a(auo.pQ);
      return new daf.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dal.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dal.b.b).a(dad.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static daf h(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.a($$2);
      py.c($$2);
      $$2.a(bqw.a, new dar.c(bqg.aO, 1, 1, 1));
      $$2.a(bqw.a, new dar.c(bqg.l, 50, 4, 4));
      $$2.a(bqw.b, new dar.c(bqg.R, 10, 2, 5));
      dag.a $$3 = new dag.a($$0, $$1);
      py.al($$3);
      a($$3);
      py.f($$3);
      py.k($$3);
      py.P($$3);
      py.ac($$3);
      py.aj($$3);
      $$3.a(duw.b.j, rn.e);
      aul $$4 = aum.a(auo.pP);
      return new daf.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dal.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dal.b.c).a(dad.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static daf i(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.c($$2);
      $$2.a(bqw.a, new dar.c(bqg.aO, 1, 1, 1));
      $$2.a(bqw.a, new dar.c(bqg.l, 50, 4, 4));
      $$2.a(bqw.b, new dar.c(bqg.R, 10, 2, 5));
      $$2.a(bqw.g, new dar.c(bqg.bf, 25, 8, 8));
      dag.a $$3 = new dag.a($$0, $$1);
      py.al($$3);
      a($$3);
      py.f($$3);
      py.l($$3);
      py.Q($$3);
      $$3.a(duw.b.j, rn.e);
      aul $$4 = aum.a(auo.pP);
      return new daf.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dal.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dal.b.c).a(dad.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static daf i(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dar.a $$3 = new dar.a().a(bqw.f, new dar.c(bqg.aW, 2, 1, 4)).a(bqw.g, new dar.c(bqg.aH, 5, 1, 5));
      py.c($$3);
      $$3.a(bqw.a, new dar.c(bqg.B, $$2 ? 1 : 100, 1, 1));
      dag.a $$4 = new dag.a($$0, $$1);
      a($$4);
      py.f($$4);
      py.j($$4);
      py.u($$4);
      py.V($$4);
      py.Z($$4);
      py.ac($$4);
      py.ad($$4);
      if (!$$2) {
         $$4.a(duw.b.j, rn.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static daf b(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2, boolean $$3) {
      dar.a $$4 = new dar.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bqw.b, new dar.c(bqg.bg, 5, 2, 5));
      }

      py.c($$4);
      dag.a $$6 = new dag.a($$0, $$1);
      a($$6);
      py.f($$6);
      py.j($$6);
      py.V($$6);
      py.Z($$6);
      py.ac($$6);
      py.ad($$6);
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

   public static daf j(io<eeu> $$0, io<dxd<?>> $$1) {
      dag.a $$2 = new dag.a($$0, $$1);
      $$2.a(duw.b.k, rq.n);
      return a(false, 0.5F, 0.5F, new dar.a(), $$2, d);
   }

   public static daf j(io<eeu> $$0, io<dxd<?>> $$1, boolean $$2) {
      dag.a $$3 = new dag.a($$0, $$1);
      dar.a $$4 = new dar.a();
      $$4.a(bqw.b, new dar.c($$2 ? bqg.ay : bqg.z, 1, 1, 2)).a(bqw.b, new dar.c(bqg.aF, 2, 2, 6)).a(bqw.b, new dar.c(bqg.aI, 2, 2, 4));
      py.c($$4);
      a($$3);
      py.ab($$3);
      py.f($$3);
      py.j($$3);
      if ($$2) {
         py.W($$3);
      } else {
         py.X($$3);
      }

      py.h($$3);
      py.i($$3);
      aul $$5 = aum.a($$2 ? auo.pT : auo.pS);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static daf k(io<eeu> $$0, io<dxd<?>> $$1) {
      dag.a $$2 = new dag.a($$0, $$1);
      dar.a $$3 = new dar.a();
      $$3.a(bqw.b, new dar.c(bqg.X, 5, 1, 3));
      py.c($$3);
      a($$2);
      py.aq($$2);
      py.f($$2);
      py.j($$2);
      py.h($$2);
      py.i($$2);
      aul $$4 = aum.a(auo.pV);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static daf l(io<eeu> $$0, io<dxd<?>> $$1) {
      dag.a $$2 = new dag.a($$0, $$1);
      dar.a $$3 = new dar.a();
      $$3.a(bqw.b, new dar.c(bqg.X, 5, 1, 3));
      py.c($$3);
      a($$2);
      py.aq($$2);
      py.f($$2);
      py.j($$2);
      py.h($$2);
      py.i($$2);
      aul $$4 = aum.a(auo.pN);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static daf m(io<eeu> $$0, io<dxd<?>> $$1) {
      dag.a $$2 = new dag.a($$0, $$1);
      dar.a $$3 = new dar.a();
      py.c($$3);
      a($$2);
      py.f($$2);
      py.j($$2);
      py.h($$2);
      py.i($$2);
      aul $$4 = aum.a(auo.pY);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static daf n(io<eeu> $$0, io<dxd<?>> $$1) {
      dag.a $$2 = new dag.a($$0, $$1);
      dar.a $$3 = new dar.a();
      $$3.a(bqw.b, new dar.c(bqg.aF, 4, 2, 3)).a(bqw.b, new dar.c(bqg.X, 5, 1, 3));
      py.c($$3);
      a($$2);
      py.aq($$2);
      py.f($$2);
      py.j($$2);
      py.ad($$2);
      py.h($$2);
      py.i($$2);
      aul $$4 = aum.a(auo.pW);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static daf o(io<eeu> $$0, io<dxd<?>> $$1) {
      dag.a $$2 = new dag.a($$0, $$1);
      dar.a $$3 = new dar.a();
      $$3.a(bqw.b, new dar.c(bqg.br, 1, 1, 1)).a(bqw.b, new dar.c(bqg.aF, 8, 2, 3)).a(bqw.b, new dar.c(bqg.Q, 4, 2, 4));
      py.c($$3);
      a($$2);
      py.aq($$2);
      py.f($$2);
      py.j($$2);
      py.t($$2);
      py.ad($$2);
      py.h($$2);
      py.i($$2);
      aul $$4 = aum.a(auo.pM);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static daf p(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      $$2.a(bqw.d, new dar.c(bqg.f, 10, 4, 6));
      $$2.a(bqw.g, new dar.c(bqg.bf, 25, 8, 8));
      py.c($$2);
      dag.a $$3 = new dag.a($$0, $$1);
      a($$3);
      py.ab($$3);
      py.f($$3);
      py.B($$3);
      py.j($$3);
      py.A($$3);
      aul $$4 = aum.a(auo.pO);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static daf q(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      py.g($$2);
      dag.a $$3 = new dag.a($$0, $$1);
      a($$3);
      py.ab($$3);
      py.a($$3, true);
      py.j($$3);
      py.S($$3);
      py.ac($$3);
      py.ad($$3);
      py.d($$3);
      aul $$4 = aum.a(auo.pL);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static daf r(io<eeu> $$0, io<dxd<?>> $$1) {
      dar.a $$2 = new dar.a();
      dag.a $$3 = new dag.a($$0, $$1);
      $$3.a(duw.a.a, qa.a);
      $$3.a(duw.a.a, qa.b);
      $$3.a(duw.a.a, qa.c);
      py.aw($$3);
      py.b($$3);
      py.c($$3);
      py.at($$3);
      py.ab($$3);
      py.f($$3);
      py.j($$3);
      py.S($$3);
      py.ac($$3);
      py.ad($$3);
      py.e($$3);
      aul $$4 = aum.a(auo.pK);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
