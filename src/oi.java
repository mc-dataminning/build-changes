import javax.annotation.Nullable;

public class oi {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final aor d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = aro.a($$1, -1.0F, 1.0F);
      return aro.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static cqi a(boolean $$0, float $$1, float $$2, cqu.a $$3, cqj.a $$4, @Nullable aor $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static cqi a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, cqu.a $$7, cqj.a $$8, @Nullable aor $$9
   ) {
      cqo.a $$10 = new cqo.a().b($$3).c($$4).a(12638463).d(a($$1)).a(cqg.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new cqi.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cqj.a $$0) {
      nm.a($$0);
      nm.aw($$0);
      nm.b($$0);
      nm.c($$0);
      nm.ap($$0);
      nm.at($$0);
   }

   public static cqi a(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a();
      nm.a($$3);
      $$3.a(biz.b, new cqu.c(bik.bn, 8, 4, 4));
      $$3.a(biz.b, new cqu.c(bik.aC, 4, 2, 3));
      $$3.a(biz.b, new cqu.c(bik.N, 8, 2, 4));
      if ($$2) {
         nm.c($$3);
      } else {
         nm.b($$3);
         nm.a($$3, 100, 25, 100, false);
      }

      cqj.a $$4 = new cqj.a($$0, $$1);
      a($$4);
      nm.m($$4);
      nm.n($$4);
      nm.f($$4);
      nm.j($$4);
      $$4.a(dkd.b.j, $$2 ? pe.ar : pe.as);
      nm.V($$4);
      nm.U($$4);
      nm.ac($$4);
      nm.ad($$4);
      nm.p($$4);
      aor $$5 = aos.a(aou.oD);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static cqi a(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, aos.a(aou.oQ));
   }

   public static cqi b(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.i($$2);
      $$2.a(biz.b, new cqu.c(bik.at, 40, 1, 2)).a(biz.a, new cqu.c(bik.aq, 2, 1, 3)).a(biz.b, new cqu.c(bik.as, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, aos.a(aou.oP));
   }

   public static cqi c(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.i($$2);
      $$2.a(biz.b, new cqu.c(bik.at, 40, 1, 2)).a(biz.b, new cqu.c(bik.as, 80, 1, 2)).a(biz.a, new cqu.c(bik.aq, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, aos.a(aou.oR));
   }

   private static cqi a(hg<dub> $$0, hg<dmk<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, cqu.a $$6, aor $$7) {
      cqj.a $$8 = new cqj.a($$0, $$1);
      a($$8);
      nm.f($$8);
      nm.j($$8);
      if ($$3) {
         nm.r($$8);
      } else {
         if ($$5) {
            nm.q($$8);
         }

         if ($$4) {
            nm.F($$8);
         } else {
            nm.E($$8);
         }
      }

      nm.Y($$8);
      nm.I($$8);
      nm.ac($$8);
      nm.ad($$8);
      nm.ah($$8);
      if ($$4) {
         nm.ag($$8);
      } else {
         nm.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static cqi b(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a();
      nm.a($$3);
      $$3.a(biz.b, new cqu.c(bik.aj, 5, 4, 6));
      nm.c($$3);
      cqj.a $$4 = new cqj.a($$0, $$1);
      a($$4);
      nm.f($$4);
      nm.j($$4);
      if ($$2) {
         nm.D($$4);
      } else {
         nm.C($$4);
      }

      nm.V($$4);
      nm.Z($$4);
      nm.ac($$4);
      nm.ad($$4);
      nm.h($$4);
      nm.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static cqi d(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.f($$2);
      cqj.a $$3 = new cqj.a($$0, $$1);
      nm.al($$3);
      a($$3);
      nm.f($$3);
      nm.j($$3);
      nm.V($$3);
      nm.Z($$3);
      nm.T($$3);
      nm.ac($$3);
      nm.ai($$3);
      nm.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, aos.a(aou.oN));
   }

   public static cqi a(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cqu.a $$5 = new cqu.a();
      cqj.a $$6 = new cqj.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         nm.e($$5);
         if ($$4) {
            $$6.a(dkd.b.e, oz.a);
            $$6.a(dkd.b.e, oz.b);
         }
      } else {
         nm.d($$5);
         nm.ab($$6);
         if ($$2) {
            $$6.a(dkd.b.j, pe.d);
         }
      }

      nm.f($$6);
      nm.j($$6);
      if ($$3) {
         nm.H($$6);
         nm.V($$6);
         nm.Z($$6);
      } else {
         nm.S($$6);
      }

      nm.ac($$6);
      if ($$2) {
         $$6.a(dkd.b.j, pe.E);
         $$6.a(dkd.b.j, pe.e);
      } else {
         nm.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static cqi e(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.h($$2);
      cqj.a $$3 = new cqj.a($$0, $$1);
      a($$3);
      nm.f($$3);
      nm.j($$3);
      nm.R($$3);
      nm.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static cqi a(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2, boolean $$3) {
      cqj.a $$4 = new cqj.a($$0, $$1);
      a($$4);
      if (!$$2) {
         nm.J($$4);
      }

      nm.f($$4);
      nm.j($$4);
      if ($$2) {
         nm.z($$4);
         nm.V($$4);
         nm.K($$4);
      } else {
         nm.y($$4);
         nm.Y($$4);
         nm.L($$4);
      }

      nm.ac($$4);
      nm.ad($$4);
      cqu.a $$5 = new cqu.a();
      nm.a($$5);
      $$5.a(biz.b, new cqu.c(bik.Y, 1, 2, 6)).a(biz.b, new cqu.c(bik.w, 1, 1, 1));
      nm.c($$5);
      if ($$3) {
         $$5.a(biz.b, new cqu.c(bik.aj, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static cqi c(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a();
      nm.c($$3);
      cqj.a $$4 = new cqj.a($$0, $$1);
      a($$4);
      nm.f($$4);
      nm.g($$4);
      nm.j($$4);
      if ($$2) {
         nm.G($$4);
      }

      nm.M($$4);
      nm.ac($$4);
      nm.ae($$4);
      return new cqi.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new cqo.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(cqg.b).a(aos.a(aou.oO)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static cqi a(cqu.a $$0, int $$1, int $$2, cqj.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cqj.a s(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqj.a $$2 = new cqj.a($$0, $$1);
      a($$2);
      nm.f($$2);
      nm.j($$2);
      nm.u($$2);
      nm.V($$2);
      nm.Z($$2);
      nm.ac($$2);
      nm.ad($$2);
      return $$2;
   }

   public static cqi d(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a();
      nm.a($$3, 3, 4, 15);
      $$3.a(biz.g, new cqu.c(bik.aE, 15, 1, 5));
      cqj.a $$4 = s($$0, $$1);
      $$4.a(dkd.b.j, $$2 ? ow.h : ow.c);
      nm.an($$4);
      nm.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static cqi e(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a();
      nm.a($$3, 1, 4, 10);
      $$3.a(biz.f, new cqu.c(bik.v, 1, 1, 2));
      cqj.a $$4 = s($$0, $$1);
      $$4.a(dkd.b.j, $$2 ? ow.g : ow.b);
      nm.an($$4);
      nm.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static cqi f(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a();
      if ($$2) {
         nm.a($$3, 8, 4, 8);
      } else {
         nm.a($$3, 10, 2, 15);
      }

      $$3.a(biz.g, new cqu.c(bik.aB, 5, 1, 3)).a(biz.g, new cqu.c(bik.bc, 25, 8, 8)).a(biz.f, new cqu.c(bik.v, 2, 1, 2));
      cqj.a $$4 = s($$0, $$1);
      $$4.a(dkd.b.j, $$2 ? ow.f : ow.a);
      if ($$2) {
         nm.an($$4);
      }

      nm.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static cqi f(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a().a(biz.g, new cqu.c(bik.aB, 15, 1, 3));
      nm.a($$2, 10, 4);
      cqj.a $$3 = s($$0, $$1).a(dkd.b.j, ow.m).a(dkd.b.j, ow.a).a(dkd.b.j, ow.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static cqi g(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a().a(biz.f, new cqu.c(bik.aT, 1, 1, 4)).a(biz.g, new cqu.c(bik.aE, 15, 1, 5)).a(biz.b, new cqu.c(bik.az, 1, 1, 2));
      nm.c($$3);
      $$3.a(biz.a, new cqu.c(bik.y, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cqj.a $$5 = new cqj.a($$0, $$1);
      nm.ar($$5);
      a($$5);
      nm.as($$5);
      nm.f($$5);
      nm.j($$5);
      nm.u($$5);
      nm.V($$5);
      nm.Z($$5);
      nm.ac($$5);
      nm.ad($$5);
      return new cqi.a().a(true).a($$4).a(cqi.d.b).b(0.5F).a(new cqo.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(cqg.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static cqi b(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cqj.a $$5 = new cqj.a($$0, $$1);
      a($$5);
      aor $$6;
      if ($$4) {
         $$6 = aos.a(aou.oM);
         $$5.a(dkd.b.j, pe.Y);
      } else {
         $$6 = aos.a(aou.oC);
         nm.N($$5);
      }

      nm.f($$5);
      nm.j($$5);
      if ($$4) {
         $$5.a(dkd.b.j, pe.aa);
         $$5.a(dkd.b.j, pe.R);
         nm.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               nm.x($$5);
            } else {
               nm.v($$5);
            }
         } else {
            nm.w($$5);
         }

         nm.V($$5);
         nm.O($$5);
      }

      nm.ac($$5);
      nm.ad($$5);
      cqu.a $$8 = new cqu.a();
      nm.a($$8);
      nm.c($$8);
      if ($$4) {
         $$8.a(biz.b, new cqu.c(bik.aC, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(biz.b, new cqu.c(bik.bn, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static cqi h(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a();
      nm.a($$3);
      $$3.a(biz.b, new cqu.c(bik.bn, 8, 4, 4)).a(biz.b, new cqu.c(bik.aC, 4, 2, 3)).a(biz.b, new cqu.c(bik.N, 8, 2, 4));
      nm.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cqj.a $$5 = new cqj.a($$0, $$1);
      a($$5);
      nm.n($$5);
      nm.f($$5);
      nm.j($$5);
      nm.s($$5);
      nm.V($$5);
      nm.aa($$5);
      nm.ad($$5);
      if ($$2) {
         nm.o($$5);
      } else {
         nm.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static cqi g(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.a($$2);
      nm.c($$2);
      cqj.a $$3 = new cqj.a($$0, $$1);
      a($$3);
      $$3.a(dkd.b.j, pe.X);
      nm.N($$3);
      nm.f($$3);
      nm.j($$3);
      nm.V($$3);
      nm.O($$3);
      nm.ac($$3);
      nm.ad($$3);
      aor $$4 = aos.a(aou.oC);
      return new cqi.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new cqo.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(cqo.b.b).a(cqg.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqi h(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.a($$2);
      nm.c($$2);
      $$2.a(biz.a, new cqu.c(bik.aL, 1, 1, 1));
      $$2.a(biz.b, new cqu.c(bik.O, 10, 2, 5));
      cqj.a $$3 = new cqj.a($$0, $$1);
      nm.al($$3);
      a($$3);
      nm.f($$3);
      nm.k($$3);
      nm.P($$3);
      nm.ac($$3);
      nm.aj($$3);
      $$3.a(dkd.b.j, ow.e);
      aor $$4 = aos.a(aou.oB);
      return new cqi.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cqo.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(cqo.b.c).a(cqg.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqi i(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.c($$2);
      $$2.a(biz.a, new cqu.c(bik.aL, 1, 1, 1));
      $$2.a(biz.b, new cqu.c(bik.O, 10, 2, 5));
      $$2.a(biz.g, new cqu.c(bik.bc, 25, 8, 8));
      cqj.a $$3 = new cqj.a($$0, $$1);
      nm.al($$3);
      a($$3);
      nm.f($$3);
      nm.l($$3);
      nm.Q($$3);
      $$3.a(dkd.b.j, ow.e);
      aor $$4 = aos.a(aou.oB);
      return new cqi.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cqo.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(cqo.b.c).a(cqg.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqi i(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqu.a $$3 = new cqu.a().a(biz.f, new cqu.c(bik.aT, 2, 1, 4)).a(biz.g, new cqu.c(bik.aE, 5, 1, 5));
      nm.c($$3);
      $$3.a(biz.a, new cqu.c(bik.y, $$2 ? 1 : 100, 1, 1));
      cqj.a $$4 = new cqj.a($$0, $$1);
      a($$4);
      nm.f($$4);
      nm.j($$4);
      nm.u($$4);
      nm.V($$4);
      nm.Z($$4);
      nm.ac($$4);
      nm.ad($$4);
      if (!$$2) {
         $$4.a(dkd.b.j, ow.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static cqi b(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2, boolean $$3) {
      cqu.a $$4 = new cqu.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(biz.b, new cqu.c(bik.bd, 5, 2, 5));
      }

      nm.c($$4);
      cqj.a $$6 = new cqj.a($$0, $$1);
      a($$6);
      nm.f($$6);
      nm.j($$6);
      nm.V($$6);
      nm.Z($$6);
      nm.ac($$6);
      nm.ad($$6);
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

   public static cqi j(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqj.a $$2 = new cqj.a($$0, $$1);
      $$2.a(dkd.b.k, oz.n);
      return a(false, 0.5F, 0.5F, new cqu.a(), $$2, d);
   }

   public static cqi j(hg<dub> $$0, hg<dmk<?>> $$1, boolean $$2) {
      cqj.a $$3 = new cqj.a($$0, $$1);
      cqu.a $$4 = new cqu.a();
      $$4.a(biz.b, new cqu.c($$2 ? bik.av : bik.w, 1, 1, 2)).a(biz.b, new cqu.c(bik.aC, 2, 2, 6)).a(biz.b, new cqu.c(bik.aF, 2, 2, 4));
      nm.c($$4);
      a($$3);
      nm.ab($$3);
      nm.f($$3);
      nm.j($$3);
      if ($$2) {
         nm.W($$3);
      } else {
         nm.X($$3);
      }

      nm.h($$3);
      nm.i($$3);
      aor $$5 = aos.a($$2 ? aou.oF : aou.oE);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static cqi k(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqj.a $$2 = new cqj.a($$0, $$1);
      cqu.a $$3 = new cqu.a();
      $$3.a(biz.b, new cqu.c(bik.U, 5, 1, 3));
      nm.c($$3);
      a($$2);
      nm.aq($$2);
      nm.f($$2);
      nm.j($$2);
      nm.h($$2);
      nm.i($$2);
      aor $$4 = aos.a(aou.oH);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cqi l(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqj.a $$2 = new cqj.a($$0, $$1);
      cqu.a $$3 = new cqu.a();
      $$3.a(biz.b, new cqu.c(bik.U, 5, 1, 3));
      nm.c($$3);
      a($$2);
      nm.aq($$2);
      nm.f($$2);
      nm.j($$2);
      nm.h($$2);
      nm.i($$2);
      aor $$4 = aos.a(aou.oz);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cqi m(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqj.a $$2 = new cqj.a($$0, $$1);
      cqu.a $$3 = new cqu.a();
      nm.c($$3);
      a($$2);
      nm.f($$2);
      nm.j($$2);
      nm.h($$2);
      nm.i($$2);
      aor $$4 = aos.a(aou.oK);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static cqi n(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqj.a $$2 = new cqj.a($$0, $$1);
      cqu.a $$3 = new cqu.a();
      $$3.a(biz.b, new cqu.c(bik.aC, 4, 2, 3)).a(biz.b, new cqu.c(bik.U, 5, 1, 3));
      nm.c($$3);
      a($$2);
      nm.aq($$2);
      nm.f($$2);
      nm.j($$2);
      nm.ad($$2);
      nm.h($$2);
      nm.i($$2);
      aor $$4 = aos.a(aou.oI);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static cqi o(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqj.a $$2 = new cqj.a($$0, $$1);
      cqu.a $$3 = new cqu.a();
      nm.a($$3);
      $$3.a(biz.b, new cqu.c(bik.bn, 8, 4, 4)).a(biz.b, new cqu.c(bik.aC, 4, 2, 3)).a(biz.b, new cqu.c(bik.N, 8, 2, 4));
      nm.c($$3);
      a($$2);
      nm.aq($$2);
      nm.f($$2);
      nm.j($$2);
      nm.t($$2);
      nm.ad($$2);
      nm.h($$2);
      nm.i($$2);
      aor $$4 = aos.a(aou.oy);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static cqi p(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      $$2.a(biz.d, new cqu.c(bik.f, 10, 4, 6));
      $$2.a(biz.g, new cqu.c(bik.bc, 25, 8, 8));
      nm.c($$2);
      cqj.a $$3 = new cqj.a($$0, $$1);
      a($$3);
      nm.ab($$3);
      nm.f($$3);
      nm.B($$3);
      nm.j($$3);
      nm.A($$3);
      aor $$4 = aos.a(aou.oA);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static cqi q(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      nm.g($$2);
      cqj.a $$3 = new cqj.a($$0, $$1);
      a($$3);
      nm.ab($$3);
      nm.a($$3, true);
      nm.j($$3);
      nm.S($$3);
      nm.ac($$3);
      nm.ad($$3);
      nm.d($$3);
      aor $$4 = aos.a(aou.ox);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static cqi r(hg<dub> $$0, hg<dmk<?>> $$1) {
      cqu.a $$2 = new cqu.a();
      cqj.a $$3 = new cqj.a($$0, $$1);
      $$3.a(dkd.a.a, no.a);
      $$3.a(dkd.a.a, no.b);
      $$3.a(dkd.a.a, no.c);
      nm.aw($$3);
      nm.b($$3);
      nm.c($$3);
      nm.at($$3);
      nm.ab($$3);
      nm.f($$3);
      nm.j($$3);
      nm.S($$3);
      nm.ac($$3);
      nm.ad($$3);
      nm.e($$3);
      aor $$4 = aos.a(aou.ow);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
