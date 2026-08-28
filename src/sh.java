import javax.annotation.Nullable;

public class sh {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   @Nullable
   private static final axc e = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = bae.a($$1, -1.0F, 1.0F);
      return bae.g(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dik a(boolean $$0, float $$1, float $$2, diw.a $$3, dil.a $$4, @Nullable axc $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dik a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, diw.a $$7, dil.a $$8, @Nullable axc $$9
   ) {
      diq.a $$10 = new diq.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dii.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dik.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dil.a $$0) {
      rj.a($$0);
      rj.av($$0);
      rj.b($$0);
      rj.c($$0);
      rj.ao($$0);
      rj.as($$0);
   }

   public static dik a(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a();
      rj.a($$3);
      $$3.a(bwj.b, new diw.c(bvr.bM, 8, 4, 4));
      $$3.a(bwj.b, new diw.c(bvr.aY, 4, 2, 3));
      $$3.a(bwj.b, new diw.c(bvr.ab, 8, 2, 4));
      if ($$2) {
         rj.c($$3);
      } else {
         rj.b($$3);
         rj.a($$3, 100, 25, 100, false);
      }

      dil.a $$4 = new dil.a($$0, $$1);
      a($$4);
      rj.m($$4);
      rj.n($$4);
      rj.f($$4);
      rj.j($$4);
      $$4.a(edm.a.j, $$2 ? td.as : td.at);
      rj.V($$4);
      rj.U($$4);
      rj.ac($$4);
      rj.ad($$4);
      rj.p($$4);
      axc $$5 = axd.a(axf.qE);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dik a(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      rj.i($$2);
      $$2.a(bwj.b, new diw.c(bvr.bM, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, axd.a(axf.qR));
   }

   public static dik b(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      rj.i($$2);
      $$2.a(bwj.b, new diw.c(bvr.aP, 40, 1, 2)).a(bwj.a, new diw.c(bvr.aJ, 2, 1, 3)).a(bwj.b, new diw.c(bvr.aO, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, axd.a(axf.qQ));
   }

   public static dik c(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      rj.i($$2);
      $$2.a(bwj.b, new diw.c(bvr.aP, 40, 1, 2)).a(bwj.b, new diw.c(bvr.aO, 80, 1, 2)).a(bwj.a, new diw.c(bvr.aJ, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, axd.a(axf.qS));
   }

   private static dik a(jr<eno> $$0, jr<efu<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, diw.a $$6, axc $$7) {
      dil.a $$8 = new dil.a($$0, $$1);
      a($$8);
      rj.f($$8);
      rj.j($$8);
      if ($$3) {
         rj.r($$8);
      } else {
         if ($$5) {
            rj.q($$8);
         }

         if ($$4) {
            rj.F($$8);
         } else {
            rj.E($$8);
         }
      }

      rj.Y($$8);
      rj.I($$8);
      rj.ac($$8);
      rj.ad($$8);
      rj.ah($$8);
      if ($$4) {
         rj.ag($$8);
      } else {
         rj.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dik b(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a();
      rj.a($$3);
      $$3.a(bwj.b, new diw.c(bvr.ay, 5, 4, 6));
      rj.c($$3);
      dil.a $$4 = new dil.a($$0, $$1);
      a($$4);
      rj.f($$4);
      rj.j($$4);
      if ($$2) {
         rj.D($$4);
      } else {
         rj.C($$4);
      }

      rj.V($$4);
      rj.Z($$4);
      rj.ac($$4);
      rj.ad($$4);
      rj.h($$4);
      rj.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, e);
   }

   public static dik d(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      rj.f($$2);
      dil.a $$3 = new dil.a($$0, $$1);
      rj.al($$3);
      a($$3);
      rj.f($$3);
      rj.j($$3);
      rj.V($$3);
      rj.Z($$3);
      rj.T($$3);
      rj.ac($$3);
      rj.ai($$3);
      rj.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, axd.a(axf.qO));
   }

   public static dik a(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      diw.a $$5 = new diw.a();
      dil.a $$6 = new dil.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         rj.e($$5);
         if ($$4) {
            $$6.a(edm.a.e, sy.a);
            $$6.a(edm.a.e, sy.b);
         }
      } else {
         rj.d($$5);
         rj.ab($$6);
         if ($$2) {
            $$6.a(edm.a.j, td.d);
         }
      }

      rj.f($$6);
      rj.j($$6);
      if ($$3) {
         rj.H($$6);
         rj.V($$6);
         rj.Z($$6);
      } else {
         rj.S($$6);
      }

      rj.ac($$6);
      if ($$2) {
         $$6.a(edm.a.j, td.E);
         $$6.a(edm.a.j, td.e);
      } else {
         rj.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, e);
   }

   public static dik e(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      rj.h($$2);
      dil.a $$3 = new dil.a($$0, $$1);
      a($$3);
      rj.f($$3);
      rj.j($$3);
      rj.R($$3);
      rj.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, e);
   }

   public static dik a(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2, boolean $$3) {
      dil.a $$4 = new dil.a($$0, $$1);
      a($$4);
      if (!$$2) {
         rj.J($$4);
      }

      rj.f($$4);
      rj.j($$4);
      if ($$2) {
         rj.z($$4);
         rj.V($$4);
         rj.K($$4);
      } else {
         rj.y($$4);
         rj.Y($$4);
         rj.L($$4);
      }

      rj.ac($$4);
      rj.ad($$4);
      diw.a $$5 = new diw.a();
      rj.a($$5);
      $$5.a(bwj.b, new diw.c(bvr.am, 1, 2, 6)).a(bwj.b, new diw.c(bvr.J, 1, 1, 1)).a(bwj.b, new diw.c(bvr.e, 10, 2, 3));
      rj.c($$5);
      if ($$3) {
         $$5.a(bwj.b, new diw.c(bvr.ay, 8, 4, 4));
         $$5.a(bwj.b, new diw.c(bvr.bM, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, e);
   }

   public static dik c(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a();
      rj.c($$3);
      $$3.a(bwj.b, new diw.c(bvr.e, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bwj.b, new diw.c(bvr.bM, 2, 4, 8));
         $$3.a(0.04F);
      }

      dil.a $$4 = new dil.a($$0, $$1);
      a($$4);
      rj.f($$4);
      rj.g($$4);
      rj.j($$4);
      if ($$2) {
         rj.G($$4);
      }

      rj.M($$4);
      rj.ac($$4);
      rj.ae($$4);
      return new dik.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new diq.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dii.b).a(axd.a(axf.qP)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dik a(diw.a $$0, int $$1, int $$2, dil.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, e);
   }

   private static dil.a r(jr<eno> $$0, jr<efu<?>> $$1) {
      dil.a $$2 = new dil.a($$0, $$1);
      a($$2);
      rj.f($$2);
      rj.j($$2);
      rj.u($$2);
      rj.V($$2);
      rj.Z($$2);
      rj.ac($$2);
      rj.ad($$2);
      return $$2;
   }

   public static dik d(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a();
      rj.a($$3, 3, 4, 15);
      $$3.a(bwj.g, new diw.c(bvr.ba, 15, 1, 5));
      dil.a $$4 = r($$0, $$1);
      $$4.a(edm.a.j, $$2 ? sv.h : sv.c);
      rj.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dik e(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a();
      rj.a($$3, 1, 4, 10);
      $$3.a(bwj.f, new diw.c(bvr.I, 1, 1, 2));
      dil.a $$4 = r($$0, $$1);
      $$4.a(edm.a.j, $$2 ? sv.g : sv.b);
      rj.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dik f(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a();
      if ($$2) {
         rj.a($$3, 8, 4, 8);
      } else {
         rj.a($$3, 10, 2, 15);
      }

      $$3.a(bwj.g, new diw.c(bvr.aX, 5, 1, 3)).a(bwj.g, new diw.c(bvr.bA, 25, 8, 8)).a(bwj.f, new diw.c(bvr.I, 2, 1, 2));
      dil.a $$4 = r($$0, $$1);
      $$4.a(edm.a.j, $$2 ? sv.f : sv.a);
      rj.an($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dik f(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a().a(bwj.g, new diw.c(bvr.aX, 15, 1, 3));
      rj.a($$2, 10, 4);
      dil.a $$3 = r($$0, $$1).a(edm.a.j, sv.l).a(edm.a.j, sv.a).a(edm.a.j, sv.i);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dik g(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a().a(bwj.f, new diw.c(bvr.br, 1, 1, 4)).a(bwj.g, new diw.c(bvr.ba, 15, 1, 5)).a(bwj.b, new diw.c(bvr.aV, 1, 1, 2));
      rj.c($$3);
      $$3.a(bwj.a, new diw.c(bvr.L, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dil.a $$5 = new dil.a($$0, $$1);
      rj.aq($$5);
      a($$5);
      rj.ar($$5);
      rj.f($$5);
      rj.j($$5);
      rj.u($$5);
      rj.V($$5);
      rj.Z($$5);
      rj.ac($$5);
      rj.ad($$5);
      return new dik.a().a(true).a($$4).a(dik.d.b).b(0.5F).a(new diq.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dii.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static dik b(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dil.a $$5 = new dil.a($$0, $$1);
      a($$5);
      axc $$6;
      if ($$4) {
         $$6 = axd.a(axf.qN);
         $$5.a(edm.a.j, td.Z);
      } else {
         $$6 = axd.a(axf.qD);
         rj.N($$5);
      }

      rj.f($$5);
      rj.j($$5);
      if ($$4) {
         $$5.a(edm.a.j, td.ab);
         $$5.a(edm.a.j, td.R);
         rj.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               rj.x($$5);
            } else {
               rj.v($$5);
            }
         } else {
            rj.w($$5);
         }

         rj.V($$5);
         rj.O($$5);
      }

      rj.ac($$5);
      rj.ad($$5);
      diw.a $$8 = new diw.a();
      rj.a($$8);
      rj.c($$8);
      if ($$4) {
         $$8.a(bwj.b, new diw.c(bvr.aY, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bwj.b, new diw.c(bvr.bM, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dik h(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a();
      rj.a($$3);
      $$3.a(bwj.b, new diw.c(bvr.bM, 8, 4, 4)).a(bwj.b, new diw.c(bvr.aY, 4, 2, 3)).a(bwj.b, new diw.c(bvr.ab, 8, 2, 4));
      rj.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dil.a $$5 = new dil.a($$0, $$1);
      a($$5);
      rj.n($$5);
      rj.f($$5);
      rj.j($$5);
      rj.s($$5);
      rj.V($$5);
      rj.aa($$5);
      rj.ad($$5);
      if ($$2) {
         rj.o($$5);
      } else {
         rj.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, e);
   }

   public static dik i(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a();
      if (!$$2) {
         rj.a($$3);
      }

      rj.c($$3);
      dil.a $$4 = new dil.a($$0, $$1);
      a($$4);
      $$4.a(edm.a.j, $$2 ? td.Y : td.X);
      if (!$$2) {
         rj.N($$4);
      }

      rj.f($$4);
      rj.j($$4);
      if (!$$2) {
         rj.V($$4);
      }

      rj.O($$4);
      if (!$$2) {
         rj.ac($$4);
      }

      rj.ad($$4);
      axc $$5 = axd.a(axf.qD);
      return new dik.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(
            $$2
               ? new diq.a().b(7768221).c(5597568).a(8484720).d(12171705).f(7832178).e(8883574).a(dii.b).a($$5).a()
               : new diq.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(diq.b.b).a(dii.b).a($$5).a()
         )
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   public static dik g(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      rj.a($$2);
      rj.a($$2, 70);
      $$2.a(bwj.a, new diw.c(bvr.bh, 1, 1, 1));
      $$2.a(bwj.a, new diw.c(bvr.q, 30, 4, 4));
      $$2.a(bwj.b, new diw.c(bvr.ac, 10, 2, 5));
      dil.a $$3 = new dil.a($$0, $$1);
      rj.al($$3);
      a($$3);
      rj.f($$3);
      rj.k($$3);
      rj.P($$3);
      rj.ac($$3);
      rj.aj($$3);
      $$3.a(edm.a.j, sv.e);
      axc $$4 = axd.a(axf.qC);
      return new dik.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new diq.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(diq.b.c).a(dii.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dik h(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      rj.a($$2, 70);
      $$2.a(bwj.a, new diw.c(bvr.bh, 1, 1, 1));
      $$2.a(bwj.a, new diw.c(bvr.q, 30, 4, 4));
      $$2.a(bwj.b, new diw.c(bvr.ac, 10, 2, 5));
      $$2.a(bwj.g, new diw.c(bvr.bA, 25, 8, 8));
      dil.a $$3 = new dil.a($$0, $$1);
      rj.al($$3);
      a($$3);
      rj.f($$3);
      rj.l($$3);
      rj.Q($$3);
      $$3.a(edm.a.j, sv.e);
      axc $$4 = axd.a(axf.qC);
      return new dik.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new diq.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(diq.b.c).a(dii.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dik j(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      diw.a $$3 = new diw.a().a(bwj.f, new diw.c(bvr.br, 2, 1, 4)).a(bwj.g, new diw.c(bvr.ba, 5, 1, 5));
      rj.c($$3);
      $$3.a(bwj.a, new diw.c(bvr.L, $$2 ? 1 : 100, 1, 1));
      dil.a $$4 = new dil.a($$0, $$1);
      a($$4);
      rj.f($$4);
      rj.j($$4);
      rj.u($$4);
      rj.V($$4);
      rj.Z($$4);
      rj.ac($$4);
      rj.ad($$4);
      if (!$$2) {
         $$4.a(edm.a.j, sv.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, e);
   }

   public static dik b(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2, boolean $$3) {
      diw.a $$4 = new diw.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bwj.b, new diw.c(bvr.bB, 5, 2, 5));
      }

      rj.c($$4);
      dil.a $$6 = new dil.a($$0, $$1);
      a($$6);
      rj.f($$6);
      rj.j($$6);
      rj.V($$6);
      rj.Z($$6);
      rj.ac($$6);
      rj.ad($$6);
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

   public static dik i(jr<eno> $$0, jr<efu<?>> $$1) {
      dil.a $$2 = new dil.a($$0, $$1);
      $$2.a(edm.a.k, sy.n);
      return a(false, 0.5F, 0.5F, new diw.a(), $$2, e);
   }

   public static dik k(jr<eno> $$0, jr<efu<?>> $$1, boolean $$2) {
      dil.a $$3 = new dil.a($$0, $$1);
      diw.a $$4 = new diw.a();
      $$4.a(bwj.b, new diw.c($$2 ? bvr.aR : bvr.J, 1, 1, 2)).a(bwj.b, new diw.c(bvr.aY, 2, 2, 6)).a(bwj.b, new diw.c(bvr.bb, 2, 2, 4));
      rj.c($$4);
      a($$3);
      rj.ab($$3);
      rj.f($$3);
      rj.j($$3);
      if ($$2) {
         rj.W($$3);
      } else {
         rj.X($$3);
      }

      rj.h($$3);
      rj.i($$3);
      axc $$5 = axd.a($$2 ? axf.qG : axf.qF);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dik j(jr<eno> $$0, jr<efu<?>> $$1) {
      dil.a $$2 = new dil.a($$0, $$1);
      diw.a $$3 = new diw.a();
      $$3.a(bwj.b, new diw.c(bvr.ai, 5, 1, 3));
      rj.c($$3);
      a($$2);
      rj.ap($$2);
      rj.f($$2);
      rj.j($$2);
      rj.h($$2);
      rj.i($$2);
      axc $$4 = axd.a(axf.qI);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dik k(jr<eno> $$0, jr<efu<?>> $$1) {
      dil.a $$2 = new dil.a($$0, $$1);
      diw.a $$3 = new diw.a();
      $$3.a(bwj.b, new diw.c(bvr.ai, 5, 1, 3));
      rj.c($$3);
      a($$2);
      rj.ap($$2);
      rj.f($$2);
      rj.j($$2);
      rj.h($$2);
      rj.i($$2);
      axc $$4 = axd.a(axf.qA);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dik l(jr<eno> $$0, jr<efu<?>> $$1) {
      dil.a $$2 = new dil.a($$0, $$1);
      diw.a $$3 = new diw.a();
      rj.c($$3);
      a($$2);
      rj.f($$2);
      rj.j($$2);
      rj.h($$2);
      rj.i($$2);
      axc $$4 = axd.a(axf.qL);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dik m(jr<eno> $$0, jr<efu<?>> $$1) {
      dil.a $$2 = new dil.a($$0, $$1);
      diw.a $$3 = new diw.a();
      $$3.a(bwj.b, new diw.c(bvr.aY, 4, 2, 3)).a(bwj.b, new diw.c(bvr.ai, 5, 1, 3));
      rj.c($$3);
      a($$2);
      rj.ap($$2);
      rj.f($$2);
      rj.j($$2);
      rj.ad($$2);
      rj.h($$2);
      rj.i($$2);
      axc $$4 = axd.a(axf.qJ);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dik n(jr<eno> $$0, jr<efu<?>> $$1) {
      dil.a $$2 = new dil.a($$0, $$1);
      diw.a $$3 = new diw.a();
      $$3.a(bwj.b, new diw.c(bvr.bM, 1, 1, 1)).a(bwj.b, new diw.c(bvr.aY, 8, 2, 3)).a(bwj.b, new diw.c(bvr.ab, 4, 2, 4));
      rj.c($$3);
      a($$2);
      rj.ap($$2);
      rj.f($$2);
      rj.j($$2);
      rj.t($$2);
      rj.ad($$2);
      rj.h($$2);
      rj.i($$2);
      axc $$4 = axd.a(axf.qz);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dik o(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      $$2.a(bwj.d, new diw.c(bvr.h, 10, 4, 6));
      $$2.a(bwj.g, new diw.c(bvr.bA, 25, 8, 8));
      rj.c($$2);
      dil.a $$3 = new dil.a($$0, $$1);
      a($$3);
      rj.ab($$3);
      rj.f($$3);
      rj.B($$3);
      rj.j($$3);
      rj.A($$3);
      axc $$4 = axd.a(axf.qB);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dik p(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      rj.g($$2);
      dil.a $$3 = new dil.a($$0, $$1);
      a($$3);
      rj.ab($$3);
      rj.a($$3, true);
      rj.j($$3);
      rj.S($$3);
      rj.ac($$3);
      rj.ad($$3);
      rj.d($$3);
      axc $$4 = axd.a(axf.qy);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dik q(jr<eno> $$0, jr<efu<?>> $$1) {
      diw.a $$2 = new diw.a();
      dil.a $$3 = new dil.a($$0, $$1);
      $$3.a(rl.a);
      $$3.a(rl.b);
      $$3.a(rl.c);
      rj.av($$3);
      rj.b($$3);
      rj.c($$3);
      rj.as($$3);
      rj.ab($$3);
      rj.f($$3);
      rj.j($$3);
      rj.S($$3);
      rj.ac($$3);
      rj.ad($$3);
      rj.e($$3);
      axc $$4 = axd.a(axf.qx);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
