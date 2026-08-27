import javax.annotation.Nullable;

public class rj {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final auv d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = axw.a($$1, -1.0F, 1.0F);
      return axw.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dat a(boolean $$0, float $$1, float $$2, dbf.a $$3, dau.a $$4, @Nullable auv $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dat a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dbf.a $$7, dau.a $$8, @Nullable auv $$9
   ) {
      daz.a $$10 = new daz.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dar.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dat.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dau.a $$0) {
      qi.a($$0);
      qi.aw($$0);
      qi.b($$0);
      qi.c($$0);
      qi.ap($$0);
      qi.at($$0);
   }

   public static dat a(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a();
      qi.a($$3);
      $$3.a(brh.b, new dbf.c(bqr.br, 8, 4, 4));
      $$3.a(brh.b, new dbf.c(bqr.aF, 4, 2, 3));
      $$3.a(brh.b, new dbf.c(bqr.Q, 8, 2, 4));
      if ($$2) {
         qi.c($$3);
      } else {
         qi.b($$3);
         qi.a($$3, 100, 25, 100, false);
      }

      dau.a $$4 = new dau.a($$0, $$1);
      a($$4);
      qi.m($$4);
      qi.n($$4);
      qi.f($$4);
      qi.j($$4);
      $$4.a(dvm.b.j, $$2 ? sf.ar : sf.as);
      qi.V($$4);
      qi.U($$4);
      qi.ac($$4);
      qi.ad($$4);
      qi.p($$4);
      auv $$5 = auw.a(auz.pY);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dat a(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.i($$2);
      $$2.a(brh.b, new dbf.c(bqr.br, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, auw.a(auz.ql));
   }

   public static dat b(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.i($$2);
      $$2.a(brh.b, new dbf.c(bqr.aw, 40, 1, 2)).a(brh.a, new dbf.c(bqr.at, 2, 1, 3)).a(brh.b, new dbf.c(bqr.av, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, auw.a(auz.qk));
   }

   public static dat c(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.i($$2);
      $$2.a(brh.b, new dbf.c(bqr.aw, 40, 1, 2)).a(brh.b, new dbf.c(bqr.av, 80, 1, 2)).a(brh.a, new dbf.c(bqr.at, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, auw.a(auz.qm));
   }

   private static dat a(iw<efk> $$0, iw<dxt<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dbf.a $$6, auv $$7) {
      dau.a $$8 = new dau.a($$0, $$1);
      a($$8);
      qi.f($$8);
      qi.j($$8);
      if ($$3) {
         qi.r($$8);
      } else {
         if ($$5) {
            qi.q($$8);
         }

         if ($$4) {
            qi.F($$8);
         } else {
            qi.E($$8);
         }
      }

      qi.Y($$8);
      qi.I($$8);
      qi.ac($$8);
      qi.ad($$8);
      qi.ah($$8);
      if ($$4) {
         qi.ag($$8);
      } else {
         qi.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dat b(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a();
      qi.a($$3);
      $$3.a(brh.b, new dbf.c(bqr.am, 5, 4, 6));
      qi.c($$3);
      dau.a $$4 = new dau.a($$0, $$1);
      a($$4);
      qi.f($$4);
      qi.j($$4);
      if ($$2) {
         qi.D($$4);
      } else {
         qi.C($$4);
      }

      qi.V($$4);
      qi.Z($$4);
      qi.ac($$4);
      qi.ad($$4);
      qi.h($$4);
      qi.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static dat d(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.f($$2);
      dau.a $$3 = new dau.a($$0, $$1);
      qi.al($$3);
      a($$3);
      qi.f($$3);
      qi.j($$3);
      qi.V($$3);
      qi.Z($$3);
      qi.T($$3);
      qi.ac($$3);
      qi.ai($$3);
      qi.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, auw.a(auz.qi));
   }

   public static dat a(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dbf.a $$5 = new dbf.a();
      dau.a $$6 = new dau.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qi.e($$5);
         if ($$4) {
            $$6.a(dvm.b.e, sa.a);
            $$6.a(dvm.b.e, sa.b);
         }
      } else {
         qi.d($$5);
         qi.ab($$6);
         if ($$2) {
            $$6.a(dvm.b.j, sf.d);
         }
      }

      qi.f($$6);
      qi.j($$6);
      if ($$3) {
         qi.H($$6);
         qi.V($$6);
         qi.Z($$6);
      } else {
         qi.S($$6);
      }

      qi.ac($$6);
      if ($$2) {
         $$6.a(dvm.b.j, sf.E);
         $$6.a(dvm.b.j, sf.e);
      } else {
         qi.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static dat e(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.h($$2);
      dau.a $$3 = new dau.a($$0, $$1);
      a($$3);
      qi.f($$3);
      qi.j($$3);
      qi.R($$3);
      qi.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static dat a(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2, boolean $$3) {
      dau.a $$4 = new dau.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qi.J($$4);
      }

      qi.f($$4);
      qi.j($$4);
      if ($$2) {
         qi.z($$4);
         qi.V($$4);
         qi.K($$4);
      } else {
         qi.y($$4);
         qi.Y($$4);
         qi.L($$4);
      }

      qi.ac($$4);
      qi.ad($$4);
      dbf.a $$5 = new dbf.a();
      qi.a($$5);
      $$5.a(brh.b, new dbf.c(bqr.ab, 1, 2, 6)).a(brh.b, new dbf.c(bqr.z, 1, 1, 1)).a(brh.b, new dbf.c(bqr.c, 10, 2, 3));
      qi.c($$5);
      if ($$3) {
         $$5.a(brh.b, new dbf.c(bqr.am, 8, 4, 4));
         $$5.a(brh.b, new dbf.c(bqr.br, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static dat c(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a();
      qi.c($$3);
      $$3.a(brh.b, new dbf.c(bqr.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(brh.b, new dbf.c(bqr.br, 2, 4, 8));
         $$3.a(0.04F);
      }

      dau.a $$4 = new dau.a($$0, $$1);
      a($$4);
      qi.f($$4);
      qi.g($$4);
      qi.j($$4);
      if ($$2) {
         qi.G($$4);
      }

      qi.M($$4);
      qi.ac($$4);
      qi.ae($$4);
      return new dat.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new daz.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dar.b).a(auw.a(auz.qj)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dat a(dbf.a $$0, int $$1, int $$2, dau.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static dau.a s(iw<efk> $$0, iw<dxt<?>> $$1) {
      dau.a $$2 = new dau.a($$0, $$1);
      a($$2);
      qi.f($$2);
      qi.j($$2);
      qi.u($$2);
      qi.V($$2);
      qi.Z($$2);
      qi.ac($$2);
      qi.ad($$2);
      return $$2;
   }

   public static dat d(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a();
      qi.a($$3, 3, 4, 15);
      $$3.a(brh.g, new dbf.c(bqr.aH, 15, 1, 5));
      dau.a $$4 = s($$0, $$1);
      $$4.a(dvm.b.j, $$2 ? rx.h : rx.c);
      qi.an($$4);
      qi.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dat e(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a();
      qi.a($$3, 1, 4, 10);
      $$3.a(brh.f, new dbf.c(bqr.y, 1, 1, 2));
      dau.a $$4 = s($$0, $$1);
      $$4.a(dvm.b.j, $$2 ? rx.g : rx.b);
      qi.an($$4);
      qi.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dat f(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a();
      if ($$2) {
         qi.a($$3, 8, 4, 8);
      } else {
         qi.a($$3, 10, 2, 15);
      }

      $$3.a(brh.g, new dbf.c(bqr.aE, 5, 1, 3)).a(brh.g, new dbf.c(bqr.bf, 25, 8, 8)).a(brh.f, new dbf.c(bqr.y, 2, 1, 2));
      dau.a $$4 = s($$0, $$1);
      $$4.a(dvm.b.j, $$2 ? rx.f : rx.a);
      if ($$2) {
         qi.an($$4);
      }

      qi.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dat f(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a().a(brh.g, new dbf.c(bqr.aE, 15, 1, 3));
      qi.a($$2, 10, 4);
      dau.a $$3 = s($$0, $$1).a(dvm.b.j, rx.m).a(dvm.b.j, rx.a).a(dvm.b.j, rx.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dat g(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a().a(brh.f, new dbf.c(bqr.aW, 1, 1, 4)).a(brh.g, new dbf.c(bqr.aH, 15, 1, 5)).a(brh.b, new dbf.c(bqr.aC, 1, 1, 2));
      qi.c($$3);
      $$3.a(brh.a, new dbf.c(bqr.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dau.a $$5 = new dau.a($$0, $$1);
      qi.ar($$5);
      a($$5);
      qi.as($$5);
      qi.f($$5);
      qi.j($$5);
      qi.u($$5);
      qi.V($$5);
      qi.Z($$5);
      qi.ac($$5);
      qi.ad($$5);
      return new dat.a().a(true).a($$4).a(dat.d.b).b(0.5F).a(new daz.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dar.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static dat b(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dau.a $$5 = new dau.a($$0, $$1);
      a($$5);
      auv $$6;
      if ($$4) {
         $$6 = auw.a(auz.qh);
         $$5.a(dvm.b.j, sf.Y);
      } else {
         $$6 = auw.a(auz.pX);
         qi.N($$5);
      }

      qi.f($$5);
      qi.j($$5);
      if ($$4) {
         $$5.a(dvm.b.j, sf.aa);
         $$5.a(dvm.b.j, sf.R);
         qi.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               qi.x($$5);
            } else {
               qi.v($$5);
            }
         } else {
            qi.w($$5);
         }

         qi.V($$5);
         qi.O($$5);
      }

      qi.ac($$5);
      qi.ad($$5);
      dbf.a $$8 = new dbf.a();
      qi.a($$8);
      qi.c($$8);
      if ($$4) {
         $$8.a(brh.b, new dbf.c(bqr.aF, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(brh.b, new dbf.c(bqr.br, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dat h(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a();
      qi.a($$3);
      $$3.a(brh.b, new dbf.c(bqr.br, 8, 4, 4)).a(brh.b, new dbf.c(bqr.aF, 4, 2, 3)).a(brh.b, new dbf.c(bqr.Q, 8, 2, 4));
      qi.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dau.a $$5 = new dau.a($$0, $$1);
      a($$5);
      qi.n($$5);
      qi.f($$5);
      qi.j($$5);
      qi.s($$5);
      qi.V($$5);
      qi.aa($$5);
      qi.ad($$5);
      if ($$2) {
         qi.o($$5);
      } else {
         qi.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static dat g(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.a($$2);
      qi.c($$2);
      dau.a $$3 = new dau.a($$0, $$1);
      a($$3);
      $$3.a(dvm.b.j, sf.X);
      qi.N($$3);
      qi.f($$3);
      qi.j($$3);
      qi.V($$3);
      qi.O($$3);
      qi.ac($$3);
      qi.ad($$3);
      auv $$4 = auw.a(auz.pX);
      return new dat.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new daz.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(daz.b.b).a(dar.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dat h(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.a($$2);
      qi.c($$2);
      $$2.a(brh.a, new dbf.c(bqr.aO, 1, 1, 1));
      $$2.a(brh.a, new dbf.c(bqr.l, 50, 4, 4));
      $$2.a(brh.b, new dbf.c(bqr.R, 10, 2, 5));
      dau.a $$3 = new dau.a($$0, $$1);
      qi.al($$3);
      a($$3);
      qi.f($$3);
      qi.k($$3);
      qi.P($$3);
      qi.ac($$3);
      qi.aj($$3);
      $$3.a(dvm.b.j, rx.e);
      auv $$4 = auw.a(auz.pW);
      return new dat.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new daz.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(daz.b.c).a(dar.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dat i(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.c($$2);
      $$2.a(brh.a, new dbf.c(bqr.aO, 1, 1, 1));
      $$2.a(brh.a, new dbf.c(bqr.l, 50, 4, 4));
      $$2.a(brh.b, new dbf.c(bqr.R, 10, 2, 5));
      $$2.a(brh.g, new dbf.c(bqr.bf, 25, 8, 8));
      dau.a $$3 = new dau.a($$0, $$1);
      qi.al($$3);
      a($$3);
      qi.f($$3);
      qi.l($$3);
      qi.Q($$3);
      $$3.a(dvm.b.j, rx.e);
      auv $$4 = auw.a(auz.pW);
      return new dat.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new daz.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(daz.b.c).a(dar.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dat i(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dbf.a $$3 = new dbf.a().a(brh.f, new dbf.c(bqr.aW, 2, 1, 4)).a(brh.g, new dbf.c(bqr.aH, 5, 1, 5));
      qi.c($$3);
      $$3.a(brh.a, new dbf.c(bqr.B, $$2 ? 1 : 100, 1, 1));
      dau.a $$4 = new dau.a($$0, $$1);
      a($$4);
      qi.f($$4);
      qi.j($$4);
      qi.u($$4);
      qi.V($$4);
      qi.Z($$4);
      qi.ac($$4);
      qi.ad($$4);
      if (!$$2) {
         $$4.a(dvm.b.j, rx.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static dat b(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2, boolean $$3) {
      dbf.a $$4 = new dbf.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(brh.b, new dbf.c(bqr.bg, 5, 2, 5));
      }

      qi.c($$4);
      dau.a $$6 = new dau.a($$0, $$1);
      a($$6);
      qi.f($$6);
      qi.j($$6);
      qi.V($$6);
      qi.Z($$6);
      qi.ac($$6);
      qi.ad($$6);
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

   public static dat j(iw<efk> $$0, iw<dxt<?>> $$1) {
      dau.a $$2 = new dau.a($$0, $$1);
      $$2.a(dvm.b.k, sa.n);
      return a(false, 0.5F, 0.5F, new dbf.a(), $$2, d);
   }

   public static dat j(iw<efk> $$0, iw<dxt<?>> $$1, boolean $$2) {
      dau.a $$3 = new dau.a($$0, $$1);
      dbf.a $$4 = new dbf.a();
      $$4.a(brh.b, new dbf.c($$2 ? bqr.ay : bqr.z, 1, 1, 2)).a(brh.b, new dbf.c(bqr.aF, 2, 2, 6)).a(brh.b, new dbf.c(bqr.aI, 2, 2, 4));
      qi.c($$4);
      a($$3);
      qi.ab($$3);
      qi.f($$3);
      qi.j($$3);
      if ($$2) {
         qi.W($$3);
      } else {
         qi.X($$3);
      }

      qi.h($$3);
      qi.i($$3);
      auv $$5 = auw.a($$2 ? auz.qa : auz.pZ);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dat k(iw<efk> $$0, iw<dxt<?>> $$1) {
      dau.a $$2 = new dau.a($$0, $$1);
      dbf.a $$3 = new dbf.a();
      $$3.a(brh.b, new dbf.c(bqr.X, 5, 1, 3));
      qi.c($$3);
      a($$2);
      qi.aq($$2);
      qi.f($$2);
      qi.j($$2);
      qi.h($$2);
      qi.i($$2);
      auv $$4 = auw.a(auz.qc);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dat l(iw<efk> $$0, iw<dxt<?>> $$1) {
      dau.a $$2 = new dau.a($$0, $$1);
      dbf.a $$3 = new dbf.a();
      $$3.a(brh.b, new dbf.c(bqr.X, 5, 1, 3));
      qi.c($$3);
      a($$2);
      qi.aq($$2);
      qi.f($$2);
      qi.j($$2);
      qi.h($$2);
      qi.i($$2);
      auv $$4 = auw.a(auz.pU);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dat m(iw<efk> $$0, iw<dxt<?>> $$1) {
      dau.a $$2 = new dau.a($$0, $$1);
      dbf.a $$3 = new dbf.a();
      qi.c($$3);
      a($$2);
      qi.f($$2);
      qi.j($$2);
      qi.h($$2);
      qi.i($$2);
      auv $$4 = auw.a(auz.qf);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dat n(iw<efk> $$0, iw<dxt<?>> $$1) {
      dau.a $$2 = new dau.a($$0, $$1);
      dbf.a $$3 = new dbf.a();
      $$3.a(brh.b, new dbf.c(bqr.aF, 4, 2, 3)).a(brh.b, new dbf.c(bqr.X, 5, 1, 3));
      qi.c($$3);
      a($$2);
      qi.aq($$2);
      qi.f($$2);
      qi.j($$2);
      qi.ad($$2);
      qi.h($$2);
      qi.i($$2);
      auv $$4 = auw.a(auz.qd);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dat o(iw<efk> $$0, iw<dxt<?>> $$1) {
      dau.a $$2 = new dau.a($$0, $$1);
      dbf.a $$3 = new dbf.a();
      $$3.a(brh.b, new dbf.c(bqr.br, 1, 1, 1)).a(brh.b, new dbf.c(bqr.aF, 8, 2, 3)).a(brh.b, new dbf.c(bqr.Q, 4, 2, 4));
      qi.c($$3);
      a($$2);
      qi.aq($$2);
      qi.f($$2);
      qi.j($$2);
      qi.t($$2);
      qi.ad($$2);
      qi.h($$2);
      qi.i($$2);
      auv $$4 = auw.a(auz.pT);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dat p(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      $$2.a(brh.d, new dbf.c(bqr.f, 10, 4, 6));
      $$2.a(brh.g, new dbf.c(bqr.bf, 25, 8, 8));
      qi.c($$2);
      dau.a $$3 = new dau.a($$0, $$1);
      a($$3);
      qi.ab($$3);
      qi.f($$3);
      qi.B($$3);
      qi.j($$3);
      qi.A($$3);
      auv $$4 = auw.a(auz.pV);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dat q(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      qi.g($$2);
      dau.a $$3 = new dau.a($$0, $$1);
      a($$3);
      qi.ab($$3);
      qi.a($$3, true);
      qi.j($$3);
      qi.S($$3);
      qi.ac($$3);
      qi.ad($$3);
      qi.d($$3);
      auv $$4 = auw.a(auz.pS);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dat r(iw<efk> $$0, iw<dxt<?>> $$1) {
      dbf.a $$2 = new dbf.a();
      dau.a $$3 = new dau.a($$0, $$1);
      $$3.a(dvm.a.a, qk.a);
      $$3.a(dvm.a.a, qk.b);
      $$3.a(dvm.a.a, qk.c);
      qi.aw($$3);
      qi.b($$3);
      qi.c($$3);
      qi.at($$3);
      qi.ab($$3);
      qi.f($$3);
      qi.j($$3);
      qi.S($$3);
      qi.ac($$3);
      qi.ad($$3);
      qi.e($$3);
      auv $$4 = auw.a(auz.pR);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
