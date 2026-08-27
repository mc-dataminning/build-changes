import javax.annotation.Nullable;

public class qx {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final auj d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = axk.a($$1, -1.0F, 1.0F);
      return axk.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static czw a(boolean $$0, float $$1, float $$2, dai.a $$3, czx.a $$4, @Nullable auj $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static czw a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dai.a $$7, czx.a $$8, @Nullable auj $$9
   ) {
      dac.a $$10 = new dac.a().b($$3).c($$4).a(12638463).d(a($$1)).a(czu.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new czw.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(czx.a $$0) {
      pw.a($$0);
      pw.aw($$0);
      pw.b($$0);
      pw.c($$0);
      pw.ap($$0);
      pw.at($$0);
   }

   public static czw a(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a();
      pw.a($$3);
      $$3.a(bqr.b, new dai.c(bqb.br, 8, 4, 4));
      $$3.a(bqr.b, new dai.c(bqb.aF, 4, 2, 3));
      $$3.a(bqr.b, new dai.c(bqb.Q, 8, 2, 4));
      if ($$2) {
         pw.c($$3);
      } else {
         pw.b($$3);
         pw.a($$3, 100, 25, 100, false);
      }

      czx.a $$4 = new czx.a($$0, $$1);
      a($$4);
      pw.m($$4);
      pw.n($$4);
      pw.f($$4);
      pw.j($$4);
      $$4.a(dun.b.j, $$2 ? rt.ar : rt.as);
      pw.V($$4);
      pw.U($$4);
      pw.ac($$4);
      pw.ad($$4);
      pw.p($$4);
      auj $$5 = auk.a(aum.pR);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static czw a(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, auk.a(aum.qe));
   }

   public static czw b(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.i($$2);
      $$2.a(bqr.b, new dai.c(bqb.aw, 40, 1, 2)).a(bqr.a, new dai.c(bqb.at, 2, 1, 3)).a(bqr.b, new dai.c(bqb.av, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, auk.a(aum.qd));
   }

   public static czw c(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.i($$2);
      $$2.a(bqr.b, new dai.c(bqb.aw, 40, 1, 2)).a(bqr.b, new dai.c(bqb.av, 80, 1, 2)).a(bqr.a, new dai.c(bqb.at, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, auk.a(aum.qf));
   }

   private static czw a(im<eel> $$0, im<dwu<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dai.a $$6, auj $$7) {
      czx.a $$8 = new czx.a($$0, $$1);
      a($$8);
      pw.f($$8);
      pw.j($$8);
      if ($$3) {
         pw.r($$8);
      } else {
         if ($$5) {
            pw.q($$8);
         }

         if ($$4) {
            pw.F($$8);
         } else {
            pw.E($$8);
         }
      }

      pw.Y($$8);
      pw.I($$8);
      pw.ac($$8);
      pw.ad($$8);
      pw.ah($$8);
      if ($$4) {
         pw.ag($$8);
      } else {
         pw.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static czw b(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a();
      pw.a($$3);
      $$3.a(bqr.b, new dai.c(bqb.am, 5, 4, 6));
      pw.c($$3);
      czx.a $$4 = new czx.a($$0, $$1);
      a($$4);
      pw.f($$4);
      pw.j($$4);
      if ($$2) {
         pw.D($$4);
      } else {
         pw.C($$4);
      }

      pw.V($$4);
      pw.Z($$4);
      pw.ac($$4);
      pw.ad($$4);
      pw.h($$4);
      pw.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static czw d(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.f($$2);
      czx.a $$3 = new czx.a($$0, $$1);
      pw.al($$3);
      a($$3);
      pw.f($$3);
      pw.j($$3);
      pw.V($$3);
      pw.Z($$3);
      pw.T($$3);
      pw.ac($$3);
      pw.ai($$3);
      pw.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, auk.a(aum.qb));
   }

   public static czw a(im<eel> $$0, im<dwu<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dai.a $$5 = new dai.a();
      czx.a $$6 = new czx.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         pw.e($$5);
         if ($$4) {
            $$6.a(dun.b.e, ro.a);
            $$6.a(dun.b.e, ro.b);
         }
      } else {
         pw.d($$5);
         pw.ab($$6);
         if ($$2) {
            $$6.a(dun.b.j, rt.d);
         }
      }

      pw.f($$6);
      pw.j($$6);
      if ($$3) {
         pw.H($$6);
         pw.V($$6);
         pw.Z($$6);
      } else {
         pw.S($$6);
      }

      pw.ac($$6);
      if ($$2) {
         $$6.a(dun.b.j, rt.E);
         $$6.a(dun.b.j, rt.e);
      } else {
         pw.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static czw e(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.h($$2);
      czx.a $$3 = new czx.a($$0, $$1);
      a($$3);
      pw.f($$3);
      pw.j($$3);
      pw.R($$3);
      pw.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static czw a(im<eel> $$0, im<dwu<?>> $$1, boolean $$2, boolean $$3) {
      czx.a $$4 = new czx.a($$0, $$1);
      a($$4);
      if (!$$2) {
         pw.J($$4);
      }

      pw.f($$4);
      pw.j($$4);
      if ($$2) {
         pw.z($$4);
         pw.V($$4);
         pw.K($$4);
      } else {
         pw.y($$4);
         pw.Y($$4);
         pw.L($$4);
      }

      pw.ac($$4);
      pw.ad($$4);
      dai.a $$5 = new dai.a();
      pw.a($$5);
      $$5.a(bqr.b, new dai.c(bqb.ab, 1, 2, 6)).a(bqr.b, new dai.c(bqb.z, 1, 1, 1)).a(bqr.b, new dai.c(bqb.c, 10, 2, 3));
      pw.c($$5);
      if ($$3) {
         $$5.a(bqr.b, new dai.c(bqb.am, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static czw c(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a();
      pw.c($$3);
      $$3.a(bqr.b, new dai.c(bqb.c, 1, 1, 2));
      $$3.a(0.03F);
      czx.a $$4 = new czx.a($$0, $$1);
      a($$4);
      pw.f($$4);
      pw.g($$4);
      pw.j($$4);
      if ($$2) {
         pw.G($$4);
      }

      pw.M($$4);
      pw.ac($$4);
      pw.ae($$4);
      return new czw.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dac.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(czu.b).a(auk.a(aum.qc)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static czw a(dai.a $$0, int $$1, int $$2, czx.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static czx.a s(im<eel> $$0, im<dwu<?>> $$1) {
      czx.a $$2 = new czx.a($$0, $$1);
      a($$2);
      pw.f($$2);
      pw.j($$2);
      pw.u($$2);
      pw.V($$2);
      pw.Z($$2);
      pw.ac($$2);
      pw.ad($$2);
      return $$2;
   }

   public static czw d(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a();
      pw.a($$3, 3, 4, 15);
      $$3.a(bqr.g, new dai.c(bqb.aH, 15, 1, 5));
      czx.a $$4 = s($$0, $$1);
      $$4.a(dun.b.j, $$2 ? rl.h : rl.c);
      pw.an($$4);
      pw.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static czw e(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a();
      pw.a($$3, 1, 4, 10);
      $$3.a(bqr.f, new dai.c(bqb.y, 1, 1, 2));
      czx.a $$4 = s($$0, $$1);
      $$4.a(dun.b.j, $$2 ? rl.g : rl.b);
      pw.an($$4);
      pw.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static czw f(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a();
      if ($$2) {
         pw.a($$3, 8, 4, 8);
      } else {
         pw.a($$3, 10, 2, 15);
      }

      $$3.a(bqr.g, new dai.c(bqb.aE, 5, 1, 3)).a(bqr.g, new dai.c(bqb.bf, 25, 8, 8)).a(bqr.f, new dai.c(bqb.y, 2, 1, 2));
      czx.a $$4 = s($$0, $$1);
      $$4.a(dun.b.j, $$2 ? rl.f : rl.a);
      if ($$2) {
         pw.an($$4);
      }

      pw.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static czw f(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a().a(bqr.g, new dai.c(bqb.aE, 15, 1, 3));
      pw.a($$2, 10, 4);
      czx.a $$3 = s($$0, $$1).a(dun.b.j, rl.m).a(dun.b.j, rl.a).a(dun.b.j, rl.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static czw g(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a().a(bqr.f, new dai.c(bqb.aW, 1, 1, 4)).a(bqr.g, new dai.c(bqb.aH, 15, 1, 5)).a(bqr.b, new dai.c(bqb.aC, 1, 1, 2));
      pw.c($$3);
      $$3.a(bqr.a, new dai.c(bqb.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      czx.a $$5 = new czx.a($$0, $$1);
      pw.ar($$5);
      a($$5);
      pw.as($$5);
      pw.f($$5);
      pw.j($$5);
      pw.u($$5);
      pw.V($$5);
      pw.Z($$5);
      pw.ac($$5);
      pw.ad($$5);
      return new czw.a().a(true).a($$4).a(czw.d.b).b(0.5F).a(new dac.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(czu.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static czw b(im<eel> $$0, im<dwu<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      czx.a $$5 = new czx.a($$0, $$1);
      a($$5);
      auj $$6;
      if ($$4) {
         $$6 = auk.a(aum.qa);
         $$5.a(dun.b.j, rt.Y);
      } else {
         $$6 = auk.a(aum.pQ);
         pw.N($$5);
      }

      pw.f($$5);
      pw.j($$5);
      if ($$4) {
         $$5.a(dun.b.j, rt.aa);
         $$5.a(dun.b.j, rt.R);
         pw.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               pw.x($$5);
            } else {
               pw.v($$5);
            }
         } else {
            pw.w($$5);
         }

         pw.V($$5);
         pw.O($$5);
      }

      pw.ac($$5);
      pw.ad($$5);
      dai.a $$8 = new dai.a();
      pw.a($$8);
      pw.c($$8);
      if ($$4) {
         $$8.a(bqr.b, new dai.c(bqb.aF, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bqr.b, new dai.c(bqb.br, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static czw h(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a();
      pw.a($$3);
      $$3.a(bqr.b, new dai.c(bqb.br, 8, 4, 4)).a(bqr.b, new dai.c(bqb.aF, 4, 2, 3)).a(bqr.b, new dai.c(bqb.Q, 8, 2, 4));
      pw.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      czx.a $$5 = new czx.a($$0, $$1);
      a($$5);
      pw.n($$5);
      pw.f($$5);
      pw.j($$5);
      pw.s($$5);
      pw.V($$5);
      pw.aa($$5);
      pw.ad($$5);
      if ($$2) {
         pw.o($$5);
      } else {
         pw.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static czw g(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.a($$2);
      pw.c($$2);
      czx.a $$3 = new czx.a($$0, $$1);
      a($$3);
      $$3.a(dun.b.j, rt.X);
      pw.N($$3);
      pw.f($$3);
      pw.j($$3);
      pw.V($$3);
      pw.O($$3);
      pw.ac($$3);
      pw.ad($$3);
      auj $$4 = auk.a(aum.pQ);
      return new czw.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dac.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dac.b.b).a(czu.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static czw h(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.a($$2);
      pw.c($$2);
      $$2.a(bqr.a, new dai.c(bqb.aO, 1, 1, 1));
      $$2.a(bqr.a, new dai.c(bqb.l, 50, 4, 4));
      $$2.a(bqr.b, new dai.c(bqb.R, 10, 2, 5));
      czx.a $$3 = new czx.a($$0, $$1);
      pw.al($$3);
      a($$3);
      pw.f($$3);
      pw.k($$3);
      pw.P($$3);
      pw.ac($$3);
      pw.aj($$3);
      $$3.a(dun.b.j, rl.e);
      auj $$4 = auk.a(aum.pP);
      return new czw.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dac.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dac.b.c).a(czu.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static czw i(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.c($$2);
      $$2.a(bqr.a, new dai.c(bqb.aO, 1, 1, 1));
      $$2.a(bqr.a, new dai.c(bqb.l, 50, 4, 4));
      $$2.a(bqr.b, new dai.c(bqb.R, 10, 2, 5));
      $$2.a(bqr.g, new dai.c(bqb.bf, 25, 8, 8));
      czx.a $$3 = new czx.a($$0, $$1);
      pw.al($$3);
      a($$3);
      pw.f($$3);
      pw.l($$3);
      pw.Q($$3);
      $$3.a(dun.b.j, rl.e);
      auj $$4 = auk.a(aum.pP);
      return new czw.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dac.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dac.b.c).a(czu.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static czw i(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      dai.a $$3 = new dai.a().a(bqr.f, new dai.c(bqb.aW, 2, 1, 4)).a(bqr.g, new dai.c(bqb.aH, 5, 1, 5));
      pw.c($$3);
      $$3.a(bqr.a, new dai.c(bqb.B, $$2 ? 1 : 100, 1, 1));
      czx.a $$4 = new czx.a($$0, $$1);
      a($$4);
      pw.f($$4);
      pw.j($$4);
      pw.u($$4);
      pw.V($$4);
      pw.Z($$4);
      pw.ac($$4);
      pw.ad($$4);
      if (!$$2) {
         $$4.a(dun.b.j, rl.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static czw b(im<eel> $$0, im<dwu<?>> $$1, boolean $$2, boolean $$3) {
      dai.a $$4 = new dai.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bqr.b, new dai.c(bqb.bg, 5, 2, 5));
      }

      pw.c($$4);
      czx.a $$6 = new czx.a($$0, $$1);
      a($$6);
      pw.f($$6);
      pw.j($$6);
      pw.V($$6);
      pw.Z($$6);
      pw.ac($$6);
      pw.ad($$6);
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

   public static czw j(im<eel> $$0, im<dwu<?>> $$1) {
      czx.a $$2 = new czx.a($$0, $$1);
      $$2.a(dun.b.k, ro.n);
      return a(false, 0.5F, 0.5F, new dai.a(), $$2, d);
   }

   public static czw j(im<eel> $$0, im<dwu<?>> $$1, boolean $$2) {
      czx.a $$3 = new czx.a($$0, $$1);
      dai.a $$4 = new dai.a();
      $$4.a(bqr.b, new dai.c($$2 ? bqb.ay : bqb.z, 1, 1, 2)).a(bqr.b, new dai.c(bqb.aF, 2, 2, 6)).a(bqr.b, new dai.c(bqb.aI, 2, 2, 4));
      pw.c($$4);
      a($$3);
      pw.ab($$3);
      pw.f($$3);
      pw.j($$3);
      if ($$2) {
         pw.W($$3);
      } else {
         pw.X($$3);
      }

      pw.h($$3);
      pw.i($$3);
      auj $$5 = auk.a($$2 ? aum.pT : aum.pS);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static czw k(im<eel> $$0, im<dwu<?>> $$1) {
      czx.a $$2 = new czx.a($$0, $$1);
      dai.a $$3 = new dai.a();
      $$3.a(bqr.b, new dai.c(bqb.X, 5, 1, 3));
      pw.c($$3);
      a($$2);
      pw.aq($$2);
      pw.f($$2);
      pw.j($$2);
      pw.h($$2);
      pw.i($$2);
      auj $$4 = auk.a(aum.pV);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static czw l(im<eel> $$0, im<dwu<?>> $$1) {
      czx.a $$2 = new czx.a($$0, $$1);
      dai.a $$3 = new dai.a();
      $$3.a(bqr.b, new dai.c(bqb.X, 5, 1, 3));
      pw.c($$3);
      a($$2);
      pw.aq($$2);
      pw.f($$2);
      pw.j($$2);
      pw.h($$2);
      pw.i($$2);
      auj $$4 = auk.a(aum.pN);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static czw m(im<eel> $$0, im<dwu<?>> $$1) {
      czx.a $$2 = new czx.a($$0, $$1);
      dai.a $$3 = new dai.a();
      pw.c($$3);
      a($$2);
      pw.f($$2);
      pw.j($$2);
      pw.h($$2);
      pw.i($$2);
      auj $$4 = auk.a(aum.pY);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static czw n(im<eel> $$0, im<dwu<?>> $$1) {
      czx.a $$2 = new czx.a($$0, $$1);
      dai.a $$3 = new dai.a();
      $$3.a(bqr.b, new dai.c(bqb.aF, 4, 2, 3)).a(bqr.b, new dai.c(bqb.X, 5, 1, 3));
      pw.c($$3);
      a($$2);
      pw.aq($$2);
      pw.f($$2);
      pw.j($$2);
      pw.ad($$2);
      pw.h($$2);
      pw.i($$2);
      auj $$4 = auk.a(aum.pW);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static czw o(im<eel> $$0, im<dwu<?>> $$1) {
      czx.a $$2 = new czx.a($$0, $$1);
      dai.a $$3 = new dai.a();
      pw.a($$3);
      $$3.a(bqr.b, new dai.c(bqb.br, 8, 4, 4)).a(bqr.b, new dai.c(bqb.aF, 4, 2, 3)).a(bqr.b, new dai.c(bqb.Q, 8, 2, 4));
      pw.c($$3);
      a($$2);
      pw.aq($$2);
      pw.f($$2);
      pw.j($$2);
      pw.t($$2);
      pw.ad($$2);
      pw.h($$2);
      pw.i($$2);
      auj $$4 = auk.a(aum.pM);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static czw p(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      $$2.a(bqr.d, new dai.c(bqb.f, 10, 4, 6));
      $$2.a(bqr.g, new dai.c(bqb.bf, 25, 8, 8));
      pw.c($$2);
      czx.a $$3 = new czx.a($$0, $$1);
      a($$3);
      pw.ab($$3);
      pw.f($$3);
      pw.B($$3);
      pw.j($$3);
      pw.A($$3);
      auj $$4 = auk.a(aum.pO);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static czw q(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      pw.g($$2);
      czx.a $$3 = new czx.a($$0, $$1);
      a($$3);
      pw.ab($$3);
      pw.a($$3, true);
      pw.j($$3);
      pw.S($$3);
      pw.ac($$3);
      pw.ad($$3);
      pw.d($$3);
      auj $$4 = auk.a(aum.pL);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static czw r(im<eel> $$0, im<dwu<?>> $$1) {
      dai.a $$2 = new dai.a();
      czx.a $$3 = new czx.a($$0, $$1);
      $$3.a(dun.a.a, py.a);
      $$3.a(dun.a.a, py.b);
      $$3.a(dun.a.a, py.c);
      pw.aw($$3);
      pw.b($$3);
      pw.c($$3);
      pw.at($$3);
      pw.ab($$3);
      pw.f($$3);
      pw.j($$3);
      pw.S($$3);
      pw.ac($$3);
      pw.ad($$3);
      pw.e($$3);
      auj $$4 = auk.a(aum.pK);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
