import javax.annotation.Nullable;

public class pj {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final aqa d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = asy.a($$1, -1.0F, 1.0F);
      return asy.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static crx a(boolean $$0, float $$1, float $$2, csj.a $$3, cry.a $$4, @Nullable aqa $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static crx a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, csj.a $$7, cry.a $$8, @Nullable aqa $$9
   ) {
      csd.a $$10 = new csd.a().b($$3).c($$4).a(12638463).d(a($$1)).a(crv.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new crx.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cry.a $$0) {
      on.a($$0);
      on.aw($$0);
      on.b($$0);
      on.c($$0);
      on.ap($$0);
      on.at($$0);
   }

   public static crx a(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a();
      on.a($$3);
      $$3.a(bkm.b, new csj.c(bjx.bn, 8, 4, 4));
      $$3.a(bkm.b, new csj.c(bjx.aC, 4, 2, 3));
      $$3.a(bkm.b, new csj.c(bjx.N, 8, 2, 4));
      if ($$2) {
         on.c($$3);
      } else {
         on.b($$3);
         on.a($$3, 100, 25, 100, false);
      }

      cry.a $$4 = new cry.a($$0, $$1);
      a($$4);
      on.m($$4);
      on.n($$4);
      on.f($$4);
      on.j($$4);
      $$4.a(dlg.b.j, $$2 ? qf.ar : qf.as);
      on.V($$4);
      on.U($$4);
      on.ac($$4);
      on.ad($$4);
      on.p($$4);
      aqa $$5 = aqb.a(aqd.oF);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static crx a(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, aqb.a(aqd.oS));
   }

   public static crx b(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.i($$2);
      $$2.a(bkm.b, new csj.c(bjx.at, 40, 1, 2)).a(bkm.a, new csj.c(bjx.aq, 2, 1, 3)).a(bkm.b, new csj.c(bjx.as, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, aqb.a(aqd.oR));
   }

   public static crx c(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.i($$2);
      $$2.a(bkm.b, new csj.c(bjx.at, 40, 1, 2)).a(bkm.b, new csj.c(bjx.as, 80, 1, 2)).a(bkm.a, new csj.c(bjx.aq, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, aqb.a(aqd.oT));
   }

   private static crx a(ic<dve> $$0, ic<dnn<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, csj.a $$6, aqa $$7) {
      cry.a $$8 = new cry.a($$0, $$1);
      a($$8);
      on.f($$8);
      on.j($$8);
      if ($$3) {
         on.r($$8);
      } else {
         if ($$5) {
            on.q($$8);
         }

         if ($$4) {
            on.F($$8);
         } else {
            on.E($$8);
         }
      }

      on.Y($$8);
      on.I($$8);
      on.ac($$8);
      on.ad($$8);
      on.ah($$8);
      if ($$4) {
         on.ag($$8);
      } else {
         on.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static crx b(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a();
      on.a($$3);
      $$3.a(bkm.b, new csj.c(bjx.aj, 5, 4, 6));
      on.c($$3);
      cry.a $$4 = new cry.a($$0, $$1);
      a($$4);
      on.f($$4);
      on.j($$4);
      if ($$2) {
         on.D($$4);
      } else {
         on.C($$4);
      }

      on.V($$4);
      on.Z($$4);
      on.ac($$4);
      on.ad($$4);
      on.h($$4);
      on.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static crx d(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.f($$2);
      cry.a $$3 = new cry.a($$0, $$1);
      on.al($$3);
      a($$3);
      on.f($$3);
      on.j($$3);
      on.V($$3);
      on.Z($$3);
      on.T($$3);
      on.ac($$3);
      on.ai($$3);
      on.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, aqb.a(aqd.oP));
   }

   public static crx a(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      csj.a $$5 = new csj.a();
      cry.a $$6 = new cry.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         on.e($$5);
         if ($$4) {
            $$6.a(dlg.b.e, qa.a);
            $$6.a(dlg.b.e, qa.b);
         }
      } else {
         on.d($$5);
         on.ab($$6);
         if ($$2) {
            $$6.a(dlg.b.j, qf.d);
         }
      }

      on.f($$6);
      on.j($$6);
      if ($$3) {
         on.H($$6);
         on.V($$6);
         on.Z($$6);
      } else {
         on.S($$6);
      }

      on.ac($$6);
      if ($$2) {
         $$6.a(dlg.b.j, qf.E);
         $$6.a(dlg.b.j, qf.e);
      } else {
         on.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static crx e(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.h($$2);
      cry.a $$3 = new cry.a($$0, $$1);
      a($$3);
      on.f($$3);
      on.j($$3);
      on.R($$3);
      on.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static crx a(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2, boolean $$3) {
      cry.a $$4 = new cry.a($$0, $$1);
      a($$4);
      if (!$$2) {
         on.J($$4);
      }

      on.f($$4);
      on.j($$4);
      if ($$2) {
         on.z($$4);
         on.V($$4);
         on.K($$4);
      } else {
         on.y($$4);
         on.Y($$4);
         on.L($$4);
      }

      on.ac($$4);
      on.ad($$4);
      csj.a $$5 = new csj.a();
      on.a($$5);
      $$5.a(bkm.b, new csj.c(bjx.Y, 1, 2, 6)).a(bkm.b, new csj.c(bjx.w, 1, 1, 1));
      on.c($$5);
      if ($$3) {
         $$5.a(bkm.b, new csj.c(bjx.aj, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static crx c(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a();
      on.c($$3);
      cry.a $$4 = new cry.a($$0, $$1);
      a($$4);
      on.f($$4);
      on.g($$4);
      on.j($$4);
      if ($$2) {
         on.G($$4);
      }

      on.M($$4);
      on.ac($$4);
      on.ae($$4);
      return new crx.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new csd.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(crv.b).a(aqb.a(aqd.oQ)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static crx a(csj.a $$0, int $$1, int $$2, cry.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cry.a s(ic<dve> $$0, ic<dnn<?>> $$1) {
      cry.a $$2 = new cry.a($$0, $$1);
      a($$2);
      on.f($$2);
      on.j($$2);
      on.u($$2);
      on.V($$2);
      on.Z($$2);
      on.ac($$2);
      on.ad($$2);
      return $$2;
   }

   public static crx d(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a();
      on.a($$3, 3, 4, 15);
      $$3.a(bkm.g, new csj.c(bjx.aE, 15, 1, 5));
      cry.a $$4 = s($$0, $$1);
      $$4.a(dlg.b.j, $$2 ? px.h : px.c);
      on.an($$4);
      on.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static crx e(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a();
      on.a($$3, 1, 4, 10);
      $$3.a(bkm.f, new csj.c(bjx.v, 1, 1, 2));
      cry.a $$4 = s($$0, $$1);
      $$4.a(dlg.b.j, $$2 ? px.g : px.b);
      on.an($$4);
      on.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static crx f(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a();
      if ($$2) {
         on.a($$3, 8, 4, 8);
      } else {
         on.a($$3, 10, 2, 15);
      }

      $$3.a(bkm.g, new csj.c(bjx.aB, 5, 1, 3)).a(bkm.g, new csj.c(bjx.bc, 25, 8, 8)).a(bkm.f, new csj.c(bjx.v, 2, 1, 2));
      cry.a $$4 = s($$0, $$1);
      $$4.a(dlg.b.j, $$2 ? px.f : px.a);
      if ($$2) {
         on.an($$4);
      }

      on.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static crx f(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a().a(bkm.g, new csj.c(bjx.aB, 15, 1, 3));
      on.a($$2, 10, 4);
      cry.a $$3 = s($$0, $$1).a(dlg.b.j, px.m).a(dlg.b.j, px.a).a(dlg.b.j, px.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static crx g(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a().a(bkm.f, new csj.c(bjx.aT, 1, 1, 4)).a(bkm.g, new csj.c(bjx.aE, 15, 1, 5)).a(bkm.b, new csj.c(bjx.az, 1, 1, 2));
      on.c($$3);
      $$3.a(bkm.a, new csj.c(bjx.y, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cry.a $$5 = new cry.a($$0, $$1);
      on.ar($$5);
      a($$5);
      on.as($$5);
      on.f($$5);
      on.j($$5);
      on.u($$5);
      on.V($$5);
      on.Z($$5);
      on.ac($$5);
      on.ad($$5);
      return new crx.a().a(true).a($$4).a(crx.d.b).b(0.5F).a(new csd.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(crv.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static crx b(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cry.a $$5 = new cry.a($$0, $$1);
      a($$5);
      aqa $$6;
      if ($$4) {
         $$6 = aqb.a(aqd.oO);
         $$5.a(dlg.b.j, qf.Y);
      } else {
         $$6 = aqb.a(aqd.oE);
         on.N($$5);
      }

      on.f($$5);
      on.j($$5);
      if ($$4) {
         $$5.a(dlg.b.j, qf.aa);
         $$5.a(dlg.b.j, qf.R);
         on.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               on.x($$5);
            } else {
               on.v($$5);
            }
         } else {
            on.w($$5);
         }

         on.V($$5);
         on.O($$5);
      }

      on.ac($$5);
      on.ad($$5);
      csj.a $$8 = new csj.a();
      on.a($$8);
      on.c($$8);
      if ($$4) {
         $$8.a(bkm.b, new csj.c(bjx.aC, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bkm.b, new csj.c(bjx.bn, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static crx h(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a();
      on.a($$3);
      $$3.a(bkm.b, new csj.c(bjx.bn, 8, 4, 4)).a(bkm.b, new csj.c(bjx.aC, 4, 2, 3)).a(bkm.b, new csj.c(bjx.N, 8, 2, 4));
      on.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cry.a $$5 = new cry.a($$0, $$1);
      a($$5);
      on.n($$5);
      on.f($$5);
      on.j($$5);
      on.s($$5);
      on.V($$5);
      on.aa($$5);
      on.ad($$5);
      if ($$2) {
         on.o($$5);
      } else {
         on.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static crx g(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.a($$2);
      on.c($$2);
      cry.a $$3 = new cry.a($$0, $$1);
      a($$3);
      $$3.a(dlg.b.j, qf.X);
      on.N($$3);
      on.f($$3);
      on.j($$3);
      on.V($$3);
      on.O($$3);
      on.ac($$3);
      on.ad($$3);
      aqa $$4 = aqb.a(aqd.oE);
      return new crx.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new csd.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(csd.b.b).a(crv.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static crx h(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.a($$2);
      on.c($$2);
      $$2.a(bkm.a, new csj.c(bjx.aL, 1, 1, 1));
      $$2.a(bkm.b, new csj.c(bjx.O, 10, 2, 5));
      cry.a $$3 = new cry.a($$0, $$1);
      on.al($$3);
      a($$3);
      on.f($$3);
      on.k($$3);
      on.P($$3);
      on.ac($$3);
      on.aj($$3);
      $$3.a(dlg.b.j, px.e);
      aqa $$4 = aqb.a(aqd.oD);
      return new crx.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new csd.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(csd.b.c).a(crv.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static crx i(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.c($$2);
      $$2.a(bkm.a, new csj.c(bjx.aL, 1, 1, 1));
      $$2.a(bkm.b, new csj.c(bjx.O, 10, 2, 5));
      $$2.a(bkm.g, new csj.c(bjx.bc, 25, 8, 8));
      cry.a $$3 = new cry.a($$0, $$1);
      on.al($$3);
      a($$3);
      on.f($$3);
      on.l($$3);
      on.Q($$3);
      $$3.a(dlg.b.j, px.e);
      aqa $$4 = aqb.a(aqd.oD);
      return new crx.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new csd.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(csd.b.c).a(crv.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static crx i(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      csj.a $$3 = new csj.a().a(bkm.f, new csj.c(bjx.aT, 2, 1, 4)).a(bkm.g, new csj.c(bjx.aE, 5, 1, 5));
      on.c($$3);
      $$3.a(bkm.a, new csj.c(bjx.y, $$2 ? 1 : 100, 1, 1));
      cry.a $$4 = new cry.a($$0, $$1);
      a($$4);
      on.f($$4);
      on.j($$4);
      on.u($$4);
      on.V($$4);
      on.Z($$4);
      on.ac($$4);
      on.ad($$4);
      if (!$$2) {
         $$4.a(dlg.b.j, px.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static crx b(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2, boolean $$3) {
      csj.a $$4 = new csj.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bkm.b, new csj.c(bjx.bd, 5, 2, 5));
      }

      on.c($$4);
      cry.a $$6 = new cry.a($$0, $$1);
      a($$6);
      on.f($$6);
      on.j($$6);
      on.V($$6);
      on.Z($$6);
      on.ac($$6);
      on.ad($$6);
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

   public static crx j(ic<dve> $$0, ic<dnn<?>> $$1) {
      cry.a $$2 = new cry.a($$0, $$1);
      $$2.a(dlg.b.k, qa.n);
      return a(false, 0.5F, 0.5F, new csj.a(), $$2, d);
   }

   public static crx j(ic<dve> $$0, ic<dnn<?>> $$1, boolean $$2) {
      cry.a $$3 = new cry.a($$0, $$1);
      csj.a $$4 = new csj.a();
      $$4.a(bkm.b, new csj.c($$2 ? bjx.av : bjx.w, 1, 1, 2)).a(bkm.b, new csj.c(bjx.aC, 2, 2, 6)).a(bkm.b, new csj.c(bjx.aF, 2, 2, 4));
      on.c($$4);
      a($$3);
      on.ab($$3);
      on.f($$3);
      on.j($$3);
      if ($$2) {
         on.W($$3);
      } else {
         on.X($$3);
      }

      on.h($$3);
      on.i($$3);
      aqa $$5 = aqb.a($$2 ? aqd.oH : aqd.oG);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static crx k(ic<dve> $$0, ic<dnn<?>> $$1) {
      cry.a $$2 = new cry.a($$0, $$1);
      csj.a $$3 = new csj.a();
      $$3.a(bkm.b, new csj.c(bjx.U, 5, 1, 3));
      on.c($$3);
      a($$2);
      on.aq($$2);
      on.f($$2);
      on.j($$2);
      on.h($$2);
      on.i($$2);
      aqa $$4 = aqb.a(aqd.oJ);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static crx l(ic<dve> $$0, ic<dnn<?>> $$1) {
      cry.a $$2 = new cry.a($$0, $$1);
      csj.a $$3 = new csj.a();
      $$3.a(bkm.b, new csj.c(bjx.U, 5, 1, 3));
      on.c($$3);
      a($$2);
      on.aq($$2);
      on.f($$2);
      on.j($$2);
      on.h($$2);
      on.i($$2);
      aqa $$4 = aqb.a(aqd.oB);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static crx m(ic<dve> $$0, ic<dnn<?>> $$1) {
      cry.a $$2 = new cry.a($$0, $$1);
      csj.a $$3 = new csj.a();
      on.c($$3);
      a($$2);
      on.f($$2);
      on.j($$2);
      on.h($$2);
      on.i($$2);
      aqa $$4 = aqb.a(aqd.oM);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static crx n(ic<dve> $$0, ic<dnn<?>> $$1) {
      cry.a $$2 = new cry.a($$0, $$1);
      csj.a $$3 = new csj.a();
      $$3.a(bkm.b, new csj.c(bjx.aC, 4, 2, 3)).a(bkm.b, new csj.c(bjx.U, 5, 1, 3));
      on.c($$3);
      a($$2);
      on.aq($$2);
      on.f($$2);
      on.j($$2);
      on.ad($$2);
      on.h($$2);
      on.i($$2);
      aqa $$4 = aqb.a(aqd.oK);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static crx o(ic<dve> $$0, ic<dnn<?>> $$1) {
      cry.a $$2 = new cry.a($$0, $$1);
      csj.a $$3 = new csj.a();
      on.a($$3);
      $$3.a(bkm.b, new csj.c(bjx.bn, 8, 4, 4)).a(bkm.b, new csj.c(bjx.aC, 4, 2, 3)).a(bkm.b, new csj.c(bjx.N, 8, 2, 4));
      on.c($$3);
      a($$2);
      on.aq($$2);
      on.f($$2);
      on.j($$2);
      on.t($$2);
      on.ad($$2);
      on.h($$2);
      on.i($$2);
      aqa $$4 = aqb.a(aqd.oA);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static crx p(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      $$2.a(bkm.d, new csj.c(bjx.f, 10, 4, 6));
      $$2.a(bkm.g, new csj.c(bjx.bc, 25, 8, 8));
      on.c($$2);
      cry.a $$3 = new cry.a($$0, $$1);
      a($$3);
      on.ab($$3);
      on.f($$3);
      on.B($$3);
      on.j($$3);
      on.A($$3);
      aqa $$4 = aqb.a(aqd.oC);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static crx q(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      on.g($$2);
      cry.a $$3 = new cry.a($$0, $$1);
      a($$3);
      on.ab($$3);
      on.a($$3, true);
      on.j($$3);
      on.S($$3);
      on.ac($$3);
      on.ad($$3);
      on.d($$3);
      aqa $$4 = aqb.a(aqd.oz);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static crx r(ic<dve> $$0, ic<dnn<?>> $$1) {
      csj.a $$2 = new csj.a();
      cry.a $$3 = new cry.a($$0, $$1);
      $$3.a(dlg.a.a, op.a);
      $$3.a(dlg.a.a, op.b);
      $$3.a(dlg.a.a, op.c);
      on.aw($$3);
      on.b($$3);
      on.c($$3);
      on.at($$3);
      on.ab($$3);
      on.f($$3);
      on.j($$3);
      on.S($$3);
      on.ac($$3);
      on.ad($$3);
      on.e($$3);
      aqa $$4 = aqb.a(aqd.oy);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
