import javax.annotation.Nullable;

public class ra {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   @Nullable
   private static final avx e = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = ayz.a($$1, -1.0F, 1.0F);
      return ayz.g(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dhk a(boolean $$0, float $$1, float $$2, dhw.a $$3, dhl.a $$4, @Nullable avx $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dhk a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dhw.a $$7, dhl.a $$8, @Nullable avx $$9
   ) {
      dhq.a $$10 = new dhq.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dhi.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dhk.a().a($$0).a($$1).b($$2).a($$10.b()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dhl.a $$0) {
      qd.a($$0);
      qd.av($$0);
      qd.b($$0);
      qd.c($$0);
      qd.ao($$0);
      qd.as($$0);
   }

   public static dhk a(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a();
      qd.a($$3);
      $$3.a(bvj.b, new dhw.c(bur.bM, 8, 4, 4));
      $$3.a(bvj.b, new dhw.c(bur.aY, 4, 2, 3));
      $$3.a(bvj.b, new dhw.c(bur.ab, 8, 2, 4));
      if ($$2) {
         qd.c($$3);
      } else {
         qd.b($$3);
         qd.a($$3, 100, 25, 100, false);
      }

      dhl.a $$4 = new dhl.a($$0, $$1);
      a($$4);
      qd.m($$4);
      qd.n($$4);
      qd.f($$4);
      qd.j($$4);
      $$4.a(eco.a.j, $$2 ? rw.av : rw.aw);
      qd.V($$4);
      qd.U($$4);
      qd.ac($$4);
      qd.ad($$4);
      qd.p($$4);
      avx $$5 = avy.a(awa.qK);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dhk a(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      qd.i($$2);
      $$2.a(bvj.b, new dhw.c(bur.bM, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, avy.a(awa.qX));
   }

   public static dhk b(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      qd.i($$2);
      $$2.a(bvj.b, new dhw.c(bur.aP, 40, 1, 2)).a(bvj.a, new dhw.c(bur.aJ, 2, 1, 3)).a(bvj.b, new dhw.c(bur.aO, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, avy.a(awa.qW));
   }

   public static dhk c(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      qd.i($$2);
      $$2.a(bvj.b, new dhw.c(bur.aP, 40, 1, 2)).a(bvj.b, new dhw.c(bur.aO, 80, 1, 2)).a(bvj.a, new dhw.c(bur.aJ, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, avy.a(awa.qY));
   }

   private static dhk a(js<emq> $$0, js<eew<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dhw.a $$6, avx $$7) {
      dhl.a $$8 = new dhl.a($$0, $$1);
      a($$8);
      qd.f($$8);
      qd.j($$8);
      if ($$3) {
         qd.r($$8);
      } else {
         if ($$5) {
            qd.q($$8);
         }

         if ($$4) {
            qd.F($$8);
         } else {
            qd.E($$8);
         }
      }

      qd.Y($$8);
      qd.I($$8);
      qd.ac($$8);
      qd.ad($$8);
      qd.ah($$8);
      if ($$4) {
         qd.ag($$8);
      } else {
         qd.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dhk b(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a();
      qd.a($$3);
      $$3.a(bvj.b, new dhw.c(bur.ay, 5, 4, 6));
      qd.c($$3);
      dhl.a $$4 = new dhl.a($$0, $$1);
      a($$4);
      qd.f($$4);
      qd.j($$4);
      if ($$2) {
         qd.D($$4);
      } else {
         qd.C($$4);
      }

      qd.V($$4);
      qd.Z($$4);
      qd.ac($$4);
      qd.ad($$4);
      qd.h($$4);
      qd.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, e);
   }

   public static dhk d(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      qd.f($$2);
      dhl.a $$3 = new dhl.a($$0, $$1);
      qd.al($$3);
      a($$3);
      qd.f($$3);
      qd.j($$3);
      qd.V($$3);
      qd.Z($$3);
      qd.T($$3);
      qd.ac($$3);
      qd.ai($$3);
      qd.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, avy.a(awa.qU));
   }

   public static dhk a(js<emq> $$0, js<eew<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dhw.a $$5 = new dhw.a();
      dhl.a $$6 = new dhl.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qd.e($$5);
         if ($$4) {
            $$6.a(eco.a.e, rr.a);
            $$6.a(eco.a.e, rr.b);
         }
      } else {
         qd.d($$5);
         qd.ab($$6);
         if ($$2) {
            $$6.a(eco.a.j, rw.d);
         }
      }

      qd.f($$6);
      qd.j($$6);
      if ($$3) {
         qd.H($$6);
         qd.V($$6);
         qd.Z($$6);
      } else {
         qd.S($$6);
      }

      qd.ac($$6);
      if ($$2) {
         $$6.a(eco.a.j, rw.E);
         $$6.a(eco.a.j, rw.e);
      } else {
         qd.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, e);
   }

   public static dhk e(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      qd.h($$2);
      dhl.a $$3 = new dhl.a($$0, $$1);
      a($$3);
      qd.f($$3);
      qd.j($$3);
      qd.R($$3);
      qd.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, e);
   }

   public static dhk a(js<emq> $$0, js<eew<?>> $$1, boolean $$2, boolean $$3) {
      dhl.a $$4 = new dhl.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qd.J($$4);
      }

      qd.f($$4);
      qd.j($$4);
      if ($$2) {
         qd.z($$4);
         qd.V($$4);
         qd.K($$4);
      } else {
         qd.y($$4);
         qd.Y($$4);
         qd.L($$4);
      }

      qd.ac($$4);
      qd.ad($$4);
      dhw.a $$5 = new dhw.a();
      qd.a($$5);
      $$5.a(bvj.b, new dhw.c(bur.am, 1, 2, 6)).a(bvj.b, new dhw.c(bur.J, 1, 1, 1)).a(bvj.b, new dhw.c(bur.e, 10, 2, 3));
      qd.c($$5);
      if ($$3) {
         $$5.a(bvj.b, new dhw.c(bur.ay, 8, 4, 4));
         $$5.a(bvj.b, new dhw.c(bur.bM, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, e);
   }

   public static dhk c(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a();
      qd.c($$3);
      $$3.a(bvj.b, new dhw.c(bur.e, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bvj.b, new dhw.c(bur.bM, 2, 4, 8));
         $$3.a(0.04F);
      }

      dhl.a $$4 = new dhl.a($$0, $$1);
      a($$4);
      qd.f($$4);
      qd.g($$4);
      qd.j($$4);
      if ($$2) {
         qd.G($$4);
      }

      qd.M($$4);
      qd.ac($$4);
      qd.ae($$4);
      return new dhk.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dhq.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dhi.b).a(avy.a(awa.qV)).b())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dhk a(dhw.a $$0, int $$1, int $$2, dhl.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, e);
   }

   private static dhl.a r(js<emq> $$0, js<eew<?>> $$1) {
      dhl.a $$2 = new dhl.a($$0, $$1);
      a($$2);
      qd.f($$2);
      qd.j($$2);
      qd.u($$2);
      qd.V($$2);
      qd.Z($$2);
      qd.ac($$2);
      qd.ad($$2);
      return $$2;
   }

   public static dhk d(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a();
      qd.a($$3, 3, 4, 15);
      $$3.a(bvj.g, new dhw.c(bur.ba, 15, 1, 5));
      dhl.a $$4 = r($$0, $$1);
      $$4.a(eco.a.j, $$2 ? ro.h : ro.c);
      qd.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dhk e(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a();
      qd.a($$3, 1, 4, 10);
      $$3.a(bvj.f, new dhw.c(bur.I, 1, 1, 2));
      dhl.a $$4 = r($$0, $$1);
      $$4.a(eco.a.j, $$2 ? ro.g : ro.b);
      qd.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dhk f(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a();
      if ($$2) {
         qd.a($$3, 8, 4, 8);
      } else {
         qd.a($$3, 10, 2, 15);
      }

      $$3.a(bvj.g, new dhw.c(bur.aX, 5, 1, 3)).a(bvj.g, new dhw.c(bur.bA, 25, 8, 8)).a(bvj.f, new dhw.c(bur.I, 2, 1, 2));
      dhl.a $$4 = r($$0, $$1);
      $$4.a(eco.a.j, $$2 ? ro.f : ro.a);
      qd.an($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dhk f(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a().a(bvj.g, new dhw.c(bur.aX, 15, 1, 3));
      qd.a($$2, 10, 4);
      dhl.a $$3 = r($$0, $$1).a(eco.a.j, ro.l).a(eco.a.j, ro.a).a(eco.a.j, ro.i);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dhk g(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a().a(bvj.f, new dhw.c(bur.br, 1, 1, 4)).a(bvj.g, new dhw.c(bur.ba, 15, 1, 5)).a(bvj.b, new dhw.c(bur.aV, 1, 1, 2));
      qd.c($$3);
      $$3.a(bvj.a, new dhw.c(bur.L, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dhl.a $$5 = new dhl.a($$0, $$1);
      qd.aq($$5);
      a($$5);
      qd.ar($$5);
      qd.f($$5);
      qd.j($$5);
      qd.u($$5);
      qd.V($$5);
      qd.Z($$5);
      qd.ac($$5);
      qd.ad($$5);
      return new dhk.a().a(true).a($$4).a(dhk.d.b).b(0.5F).a(new dhq.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dhi.b).b()).a($$3.a()).a($$5.a()).a();
   }

   public static dhk b(js<emq> $$0, js<eew<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dhl.a $$5 = new dhl.a($$0, $$1);
      a($$5);
      avx $$6;
      if ($$4) {
         $$6 = avy.a(awa.qT);
         $$5.a(eco.a.j, rw.aa);
      } else {
         $$6 = avy.a(awa.qJ);
         qd.N($$5);
      }

      qd.f($$5);
      qd.j($$5);
      if ($$4) {
         $$5.a(eco.a.j, rw.ae);
         $$5.a(eco.a.j, rw.R);
         qd.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               qd.x($$5);
            } else {
               qd.v($$5);
            }
         } else {
            qd.w($$5);
         }

         qd.V($$5);
         qd.O($$5);
      }

      qd.ac($$5);
      qd.ad($$5);
      dhw.a $$8 = new dhw.a();
      qd.a($$8);
      qd.c($$8);
      if ($$4) {
         $$8.a(bvj.b, new dhw.c(bur.aY, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bvj.b, new dhw.c(bur.bM, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dhk h(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a();
      qd.a($$3);
      $$3.a(bvj.b, new dhw.c(bur.bM, 8, 4, 4)).a(bvj.b, new dhw.c(bur.aY, 4, 2, 3)).a(bvj.b, new dhw.c(bur.ab, 8, 2, 4));
      qd.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dhl.a $$5 = new dhl.a($$0, $$1);
      a($$5);
      qd.n($$5);
      qd.f($$5);
      qd.j($$5);
      qd.s($$5);
      qd.V($$5);
      qd.aa($$5);
      qd.ad($$5);
      if ($$2) {
         qd.o($$5);
      } else {
         qd.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, e);
   }

   public static dhk i(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a();
      if (!$$2) {
         qd.a($$3);
      }

      qd.c($$3);
      dhl.a $$4 = new dhl.a($$0, $$1);
      a($$4);
      $$4.a(eco.a.j, $$2 ? rw.Z : rw.Y);
      if (!$$2) {
         qd.N($$4);
      } else {
         $$4.a(eco.a.j, rw.ad);
         $$4.a(eco.a.j, rw.ac);
      }

      qd.f($$4);
      qd.j($$4);
      if (!$$2) {
         qd.V($$4);
      } else {
         $$4.a(eco.a.j, rw.W);
      }

      qd.O($$4);
      if (!$$2) {
         qd.ac($$4);
      }

      qd.ad($$4);
      return new dhk.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(
            $$2
               ? new dhq.a().b(7768221).c(5597568).a(8484720).d(12171705).f(7832178).e(8883574).a(dhi.b).a().b()
               : new dhq.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dhq.b.b).a(dhi.b).a(avy.a(awa.qJ)).b()
         )
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   public static dhk g(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      qd.a($$2);
      qd.a($$2, 70);
      $$2.a(bvj.a, new dhw.c(bur.bh, 1, 1, 1));
      $$2.a(bvj.a, new dhw.c(bur.q, 30, 4, 4));
      $$2.a(bvj.b, new dhw.c(bur.ac, 10, 2, 5));
      dhl.a $$3 = new dhl.a($$0, $$1);
      qd.al($$3);
      a($$3);
      qd.f($$3);
      qd.k($$3);
      qd.P($$3);
      qd.ac($$3);
      qd.aj($$3);
      $$3.a(eco.a.j, ro.e);
      avx $$4 = avy.a(awa.qI);
      return new dhk.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dhq.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dhq.b.c).a(dhi.b).a($$4).b())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dhk h(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      qd.a($$2, 70);
      $$2.a(bvj.a, new dhw.c(bur.bh, 1, 1, 1));
      $$2.a(bvj.a, new dhw.c(bur.q, 30, 4, 4));
      $$2.a(bvj.b, new dhw.c(bur.ac, 10, 2, 5));
      $$2.a(bvj.g, new dhw.c(bur.bA, 25, 8, 8));
      dhl.a $$3 = new dhl.a($$0, $$1);
      qd.al($$3);
      a($$3);
      qd.f($$3);
      qd.l($$3);
      qd.Q($$3);
      $$3.a(eco.a.j, ro.e);
      avx $$4 = avy.a(awa.qI);
      return new dhk.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dhq.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dhq.b.c).a(dhi.b).a($$4).b())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dhk j(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhw.a $$3 = new dhw.a().a(bvj.f, new dhw.c(bur.br, 2, 1, 4)).a(bvj.g, new dhw.c(bur.ba, 5, 1, 5));
      qd.c($$3);
      $$3.a(bvj.a, new dhw.c(bur.L, $$2 ? 1 : 100, 1, 1));
      dhl.a $$4 = new dhl.a($$0, $$1);
      a($$4);
      qd.f($$4);
      qd.j($$4);
      qd.u($$4);
      qd.V($$4);
      qd.Z($$4);
      qd.ac($$4);
      qd.ad($$4);
      if (!$$2) {
         $$4.a(eco.a.j, ro.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, e);
   }

   public static dhk b(js<emq> $$0, js<eew<?>> $$1, boolean $$2, boolean $$3) {
      dhw.a $$4 = new dhw.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bvj.b, new dhw.c(bur.bB, 5, 2, 5));
      }

      qd.c($$4);
      dhl.a $$6 = new dhl.a($$0, $$1);
      a($$6);
      qd.f($$6);
      qd.j($$6);
      qd.V($$6);
      qd.Z($$6);
      qd.ac($$6);
      qd.ad($$6);
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

   public static dhk i(js<emq> $$0, js<eew<?>> $$1) {
      dhl.a $$2 = new dhl.a($$0, $$1);
      $$2.a(eco.a.k, rr.n);
      return a(false, 0.5F, 0.5F, new dhw.a(), $$2, e);
   }

   public static dhk k(js<emq> $$0, js<eew<?>> $$1, boolean $$2) {
      dhl.a $$3 = new dhl.a($$0, $$1);
      dhw.a $$4 = new dhw.a();
      $$4.a(bvj.b, new dhw.c($$2 ? bur.aR : bur.J, 1, 1, 2)).a(bvj.b, new dhw.c(bur.aY, 2, 2, 6)).a(bvj.b, new dhw.c(bur.bb, 2, 2, 4));
      qd.c($$4);
      a($$3);
      qd.ab($$3);
      qd.f($$3);
      qd.j($$3);
      if ($$2) {
         qd.W($$3);
      } else {
         qd.X($$3);
      }

      qd.h($$3);
      qd.i($$3);
      avx $$5 = avy.a($$2 ? awa.qM : awa.qL);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dhk j(js<emq> $$0, js<eew<?>> $$1) {
      dhl.a $$2 = new dhl.a($$0, $$1);
      dhw.a $$3 = new dhw.a();
      $$3.a(bvj.b, new dhw.c(bur.ai, 5, 1, 3));
      qd.c($$3);
      a($$2);
      qd.ap($$2);
      qd.f($$2);
      qd.j($$2);
      qd.h($$2);
      qd.i($$2);
      avx $$4 = avy.a(awa.qO);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dhk k(js<emq> $$0, js<eew<?>> $$1) {
      dhl.a $$2 = new dhl.a($$0, $$1);
      dhw.a $$3 = new dhw.a();
      $$3.a(bvj.b, new dhw.c(bur.ai, 5, 1, 3));
      qd.c($$3);
      a($$2);
      qd.ap($$2);
      qd.f($$2);
      qd.j($$2);
      qd.h($$2);
      qd.i($$2);
      avx $$4 = avy.a(awa.qG);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dhk l(js<emq> $$0, js<eew<?>> $$1) {
      dhl.a $$2 = new dhl.a($$0, $$1);
      dhw.a $$3 = new dhw.a();
      qd.c($$3);
      a($$2);
      qd.f($$2);
      qd.j($$2);
      qd.h($$2);
      qd.i($$2);
      avx $$4 = avy.a(awa.qR);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dhk m(js<emq> $$0, js<eew<?>> $$1) {
      dhl.a $$2 = new dhl.a($$0, $$1);
      dhw.a $$3 = new dhw.a();
      $$3.a(bvj.b, new dhw.c(bur.aY, 4, 2, 3)).a(bvj.b, new dhw.c(bur.ai, 5, 1, 3));
      qd.c($$3);
      a($$2);
      qd.ap($$2);
      qd.f($$2);
      qd.j($$2);
      qd.ad($$2);
      qd.h($$2);
      qd.i($$2);
      avx $$4 = avy.a(awa.qP);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dhk n(js<emq> $$0, js<eew<?>> $$1) {
      dhl.a $$2 = new dhl.a($$0, $$1);
      dhw.a $$3 = new dhw.a();
      $$3.a(bvj.b, new dhw.c(bur.bM, 1, 1, 1)).a(bvj.b, new dhw.c(bur.aY, 8, 2, 3)).a(bvj.b, new dhw.c(bur.ab, 4, 2, 4));
      qd.c($$3);
      a($$2);
      qd.ap($$2);
      qd.f($$2);
      qd.j($$2);
      qd.t($$2);
      qd.ad($$2);
      qd.h($$2);
      qd.i($$2);
      avx $$4 = avy.a(awa.qF);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dhk o(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      $$2.a(bvj.d, new dhw.c(bur.h, 10, 4, 6));
      $$2.a(bvj.g, new dhw.c(bur.bA, 25, 8, 8));
      qd.c($$2);
      dhl.a $$3 = new dhl.a($$0, $$1);
      a($$3);
      qd.ab($$3);
      qd.f($$3);
      qd.B($$3);
      qd.j($$3);
      qd.A($$3);
      avx $$4 = avy.a(awa.qH);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dhk p(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      qd.g($$2);
      dhl.a $$3 = new dhl.a($$0, $$1);
      a($$3);
      qd.ab($$3);
      qd.a($$3, true);
      qd.j($$3);
      qd.S($$3);
      qd.ac($$3);
      qd.ad($$3);
      qd.d($$3);
      avx $$4 = avy.a(awa.qE);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dhk q(js<emq> $$0, js<eew<?>> $$1) {
      dhw.a $$2 = new dhw.a();
      dhl.a $$3 = new dhl.a($$0, $$1);
      $$3.a(qf.a);
      $$3.a(qf.b);
      $$3.a(qf.c);
      qd.av($$3);
      qd.b($$3);
      qd.c($$3);
      qd.as($$3);
      qd.ab($$3);
      qd.f($$3);
      qd.j($$3);
      qd.S($$3);
      qd.ac($$3);
      qd.ad($$3);
      qd.e($$3);
      avx $$4 = avy.a(awa.qD);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
