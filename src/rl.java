import javax.annotation.Nullable;

public class rl {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   @Nullable
   private static final avl e = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = ayn.a($$1, -1.0F, 1.0F);
      return ayn.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static ddu a(boolean $$0, float $$1, float $$2, deg.a $$3, ddv.a $$4, @Nullable avl $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static ddu a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, deg.a $$7, ddv.a $$8, @Nullable avl $$9
   ) {
      dea.a $$10 = new dea.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dds.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new ddu.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(ddv.a $$0) {
      qo.a($$0);
      qo.aw($$0);
      qo.b($$0);
      qo.c($$0);
      qo.ap($$0);
      qo.at($$0);
   }

   public static ddu a(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a();
      qo.a($$3);
      $$3.a(bto.b, new deg.c(bsw.bs, 8, 4, 4));
      $$3.a(bto.b, new deg.c(bsw.aG, 4, 2, 3));
      $$3.a(bto.b, new deg.c(bsw.Q, 8, 2, 4));
      if ($$2) {
         qo.c($$3);
      } else {
         qo.b($$3);
         qo.a($$3, 100, 25, 100, false);
      }

      ddv.a $$4 = new ddv.a($$0, $$1);
      a($$4);
      qo.m($$4);
      qo.n($$4);
      qo.f($$4);
      qo.j($$4);
      $$4.a(dyr.b.j, $$2 ? sh.ar : sh.as);
      qo.V($$4);
      qo.U($$4);
      qo.ac($$4);
      qo.ad($$4);
      qo.p($$4);
      avl $$5 = avm.a(avo.qm);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static ddu a(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.i($$2);
      $$2.a(bto.b, new deg.c(bsw.bs, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, avm.a(avo.qz));
   }

   public static ddu b(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.i($$2);
      $$2.a(bto.b, new deg.c(bsw.ax, 40, 1, 2)).a(bto.a, new deg.c(bsw.au, 2, 1, 3)).a(bto.b, new deg.c(bsw.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, avm.a(avo.qy));
   }

   public static ddu c(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.i($$2);
      $$2.a(bto.b, new deg.c(bsw.ax, 40, 1, 2)).a(bto.b, new deg.c(bsw.aw, 80, 1, 2)).a(bto.a, new deg.c(bsw.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, avm.a(avo.qA));
   }

   private static ddu a(jn<eiq> $$0, jn<eaz<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, deg.a $$6, avl $$7) {
      ddv.a $$8 = new ddv.a($$0, $$1);
      a($$8);
      qo.f($$8);
      qo.j($$8);
      if ($$3) {
         qo.r($$8);
      } else {
         if ($$5) {
            qo.q($$8);
         }

         if ($$4) {
            qo.F($$8);
         } else {
            qo.E($$8);
         }
      }

      qo.Y($$8);
      qo.I($$8);
      qo.ac($$8);
      qo.ad($$8);
      qo.ah($$8);
      if ($$4) {
         qo.ag($$8);
      } else {
         qo.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static ddu b(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a();
      qo.a($$3);
      $$3.a(bto.b, new deg.c(bsw.an, 5, 4, 6));
      qo.c($$3);
      ddv.a $$4 = new ddv.a($$0, $$1);
      a($$4);
      qo.f($$4);
      qo.j($$4);
      if ($$2) {
         qo.D($$4);
      } else {
         qo.C($$4);
      }

      qo.V($$4);
      qo.Z($$4);
      qo.ac($$4);
      qo.ad($$4);
      qo.h($$4);
      qo.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, e);
   }

   public static ddu d(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.f($$2);
      ddv.a $$3 = new ddv.a($$0, $$1);
      qo.al($$3);
      a($$3);
      qo.f($$3);
      qo.j($$3);
      qo.V($$3);
      qo.Z($$3);
      qo.T($$3);
      qo.ac($$3);
      qo.ai($$3);
      qo.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, avm.a(avo.qw));
   }

   public static ddu a(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      deg.a $$5 = new deg.a();
      ddv.a $$6 = new ddv.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qo.e($$5);
         if ($$4) {
            $$6.a(dyr.b.e, sc.a);
            $$6.a(dyr.b.e, sc.b);
         }
      } else {
         qo.d($$5);
         qo.ab($$6);
         if ($$2) {
            $$6.a(dyr.b.j, sh.d);
         }
      }

      qo.f($$6);
      qo.j($$6);
      if ($$3) {
         qo.H($$6);
         qo.V($$6);
         qo.Z($$6);
      } else {
         qo.S($$6);
      }

      qo.ac($$6);
      if ($$2) {
         $$6.a(dyr.b.j, sh.E);
         $$6.a(dyr.b.j, sh.e);
      } else {
         qo.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, e);
   }

   public static ddu e(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.h($$2);
      ddv.a $$3 = new ddv.a($$0, $$1);
      a($$3);
      qo.f($$3);
      qo.j($$3);
      qo.R($$3);
      qo.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, e);
   }

   public static ddu a(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2, boolean $$3) {
      ddv.a $$4 = new ddv.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qo.J($$4);
      }

      qo.f($$4);
      qo.j($$4);
      if ($$2) {
         qo.z($$4);
         qo.V($$4);
         qo.K($$4);
      } else {
         qo.y($$4);
         qo.Y($$4);
         qo.L($$4);
      }

      qo.ac($$4);
      qo.ad($$4);
      deg.a $$5 = new deg.a();
      qo.a($$5);
      $$5.a(bto.b, new deg.c(bsw.ab, 1, 2, 6)).a(bto.b, new deg.c(bsw.z, 1, 1, 1)).a(bto.b, new deg.c(bsw.c, 10, 2, 3));
      qo.c($$5);
      if ($$3) {
         $$5.a(bto.b, new deg.c(bsw.an, 8, 4, 4));
         $$5.a(bto.b, new deg.c(bsw.bs, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, e);
   }

   public static ddu c(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a();
      qo.c($$3);
      $$3.a(bto.b, new deg.c(bsw.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bto.b, new deg.c(bsw.bs, 2, 4, 8));
         $$3.a(0.04F);
      }

      ddv.a $$4 = new ddv.a($$0, $$1);
      a($$4);
      qo.f($$4);
      qo.g($$4);
      qo.j($$4);
      if ($$2) {
         qo.G($$4);
      }

      qo.M($$4);
      qo.ac($$4);
      qo.ae($$4);
      return new ddu.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dea.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dds.b).a(avm.a(avo.qx)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static ddu a(deg.a $$0, int $$1, int $$2, ddv.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, e);
   }

   private static ddv.a s(jn<eiq> $$0, jn<eaz<?>> $$1) {
      ddv.a $$2 = new ddv.a($$0, $$1);
      a($$2);
      qo.f($$2);
      qo.j($$2);
      qo.u($$2);
      qo.V($$2);
      qo.Z($$2);
      qo.ac($$2);
      qo.ad($$2);
      return $$2;
   }

   public static ddu d(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a();
      qo.a($$3, 3, 4, 15);
      $$3.a(bto.g, new deg.c(bsw.aI, 15, 1, 5));
      ddv.a $$4 = s($$0, $$1);
      $$4.a(dyr.b.j, $$2 ? rz.h : rz.c);
      qo.an($$4);
      qo.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static ddu e(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a();
      qo.a($$3, 1, 4, 10);
      $$3.a(bto.f, new deg.c(bsw.y, 1, 1, 2));
      ddv.a $$4 = s($$0, $$1);
      $$4.a(dyr.b.j, $$2 ? rz.g : rz.b);
      qo.an($$4);
      qo.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static ddu f(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a();
      if ($$2) {
         qo.a($$3, 8, 4, 8);
      } else {
         qo.a($$3, 10, 2, 15);
      }

      $$3.a(bto.g, new deg.c(bsw.aF, 5, 1, 3)).a(bto.g, new deg.c(bsw.bg, 25, 8, 8)).a(bto.f, new deg.c(bsw.y, 2, 1, 2));
      ddv.a $$4 = s($$0, $$1);
      $$4.a(dyr.b.j, $$2 ? rz.f : rz.a);
      if ($$2) {
         qo.an($$4);
      }

      qo.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static ddu f(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a().a(bto.g, new deg.c(bsw.aF, 15, 1, 3));
      qo.a($$2, 10, 4);
      ddv.a $$3 = s($$0, $$1).a(dyr.b.j, rz.m).a(dyr.b.j, rz.a).a(dyr.b.j, rz.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static ddu g(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a().a(bto.f, new deg.c(bsw.aX, 1, 1, 4)).a(bto.g, new deg.c(bsw.aI, 15, 1, 5)).a(bto.b, new deg.c(bsw.aD, 1, 1, 2));
      qo.c($$3);
      $$3.a(bto.a, new deg.c(bsw.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      ddv.a $$5 = new ddv.a($$0, $$1);
      qo.ar($$5);
      a($$5);
      qo.as($$5);
      qo.f($$5);
      qo.j($$5);
      qo.u($$5);
      qo.V($$5);
      qo.Z($$5);
      qo.ac($$5);
      qo.ad($$5);
      return new ddu.a().a(true).a($$4).a(ddu.d.b).b(0.5F).a(new dea.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dds.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static ddu b(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      ddv.a $$5 = new ddv.a($$0, $$1);
      a($$5);
      avl $$6;
      if ($$4) {
         $$6 = avm.a(avo.qv);
         $$5.a(dyr.b.j, sh.Y);
      } else {
         $$6 = avm.a(avo.ql);
         qo.N($$5);
      }

      qo.f($$5);
      qo.j($$5);
      if ($$4) {
         $$5.a(dyr.b.j, sh.aa);
         $$5.a(dyr.b.j, sh.R);
         qo.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               qo.x($$5);
            } else {
               qo.v($$5);
            }
         } else {
            qo.w($$5);
         }

         qo.V($$5);
         qo.O($$5);
      }

      qo.ac($$5);
      qo.ad($$5);
      deg.a $$8 = new deg.a();
      qo.a($$8);
      qo.c($$8);
      if ($$4) {
         $$8.a(bto.b, new deg.c(bsw.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bto.b, new deg.c(bsw.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static ddu h(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a();
      qo.a($$3);
      $$3.a(bto.b, new deg.c(bsw.bs, 8, 4, 4)).a(bto.b, new deg.c(bsw.aG, 4, 2, 3)).a(bto.b, new deg.c(bsw.Q, 8, 2, 4));
      qo.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      ddv.a $$5 = new ddv.a($$0, $$1);
      a($$5);
      qo.n($$5);
      qo.f($$5);
      qo.j($$5);
      qo.s($$5);
      qo.V($$5);
      qo.aa($$5);
      qo.ad($$5);
      if ($$2) {
         qo.o($$5);
      } else {
         qo.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, e);
   }

   public static ddu g(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.a($$2);
      qo.c($$2);
      ddv.a $$3 = new ddv.a($$0, $$1);
      a($$3);
      $$3.a(dyr.b.j, sh.X);
      qo.N($$3);
      qo.f($$3);
      qo.j($$3);
      qo.V($$3);
      qo.O($$3);
      qo.ac($$3);
      qo.ad($$3);
      avl $$4 = avm.a(avo.ql);
      return new ddu.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dea.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dea.b.b).a(dds.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddu h(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.a($$2);
      qo.a($$2, 70);
      $$2.a(bto.a, new deg.c(bsw.aP, 1, 1, 1));
      $$2.a(bto.a, new deg.c(bsw.l, 30, 4, 4));
      $$2.a(bto.b, new deg.c(bsw.R, 10, 2, 5));
      ddv.a $$3 = new ddv.a($$0, $$1);
      qo.al($$3);
      a($$3);
      qo.f($$3);
      qo.k($$3);
      qo.P($$3);
      qo.ac($$3);
      qo.aj($$3);
      $$3.a(dyr.b.j, rz.e);
      avl $$4 = avm.a(avo.qk);
      return new ddu.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dea.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dea.b.c).a(dds.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddu i(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.a($$2, 70);
      $$2.a(bto.a, new deg.c(bsw.aP, 1, 1, 1));
      $$2.a(bto.a, new deg.c(bsw.l, 30, 4, 4));
      $$2.a(bto.b, new deg.c(bsw.R, 10, 2, 5));
      $$2.a(bto.g, new deg.c(bsw.bg, 25, 8, 8));
      ddv.a $$3 = new ddv.a($$0, $$1);
      qo.al($$3);
      a($$3);
      qo.f($$3);
      qo.l($$3);
      qo.Q($$3);
      $$3.a(dyr.b.j, rz.e);
      avl $$4 = avm.a(avo.qk);
      return new ddu.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dea.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dea.b.c).a(dds.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddu i(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      deg.a $$3 = new deg.a().a(bto.f, new deg.c(bsw.aX, 2, 1, 4)).a(bto.g, new deg.c(bsw.aI, 5, 1, 5));
      qo.c($$3);
      $$3.a(bto.a, new deg.c(bsw.B, $$2 ? 1 : 100, 1, 1));
      ddv.a $$4 = new ddv.a($$0, $$1);
      a($$4);
      qo.f($$4);
      qo.j($$4);
      qo.u($$4);
      qo.V($$4);
      qo.Z($$4);
      qo.ac($$4);
      qo.ad($$4);
      if (!$$2) {
         $$4.a(dyr.b.j, rz.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, e);
   }

   public static ddu b(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2, boolean $$3) {
      deg.a $$4 = new deg.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bto.b, new deg.c(bsw.bh, 5, 2, 5));
      }

      qo.c($$4);
      ddv.a $$6 = new ddv.a($$0, $$1);
      a($$6);
      qo.f($$6);
      qo.j($$6);
      qo.V($$6);
      qo.Z($$6);
      qo.ac($$6);
      qo.ad($$6);
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

   public static ddu j(jn<eiq> $$0, jn<eaz<?>> $$1) {
      ddv.a $$2 = new ddv.a($$0, $$1);
      $$2.a(dyr.b.k, sc.n);
      return a(false, 0.5F, 0.5F, new deg.a(), $$2, e);
   }

   public static ddu j(jn<eiq> $$0, jn<eaz<?>> $$1, boolean $$2) {
      ddv.a $$3 = new ddv.a($$0, $$1);
      deg.a $$4 = new deg.a();
      $$4.a(bto.b, new deg.c($$2 ? bsw.az : bsw.z, 1, 1, 2)).a(bto.b, new deg.c(bsw.aG, 2, 2, 6)).a(bto.b, new deg.c(bsw.aJ, 2, 2, 4));
      qo.c($$4);
      a($$3);
      qo.ab($$3);
      qo.f($$3);
      qo.j($$3);
      if ($$2) {
         qo.W($$3);
      } else {
         qo.X($$3);
      }

      qo.h($$3);
      qo.i($$3);
      avl $$5 = avm.a($$2 ? avo.qo : avo.qn);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static ddu k(jn<eiq> $$0, jn<eaz<?>> $$1) {
      ddv.a $$2 = new ddv.a($$0, $$1);
      deg.a $$3 = new deg.a();
      $$3.a(bto.b, new deg.c(bsw.X, 5, 1, 3));
      qo.c($$3);
      a($$2);
      qo.aq($$2);
      qo.f($$2);
      qo.j($$2);
      qo.h($$2);
      qo.i($$2);
      avl $$4 = avm.a(avo.qq);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static ddu l(jn<eiq> $$0, jn<eaz<?>> $$1) {
      ddv.a $$2 = new ddv.a($$0, $$1);
      deg.a $$3 = new deg.a();
      $$3.a(bto.b, new deg.c(bsw.X, 5, 1, 3));
      qo.c($$3);
      a($$2);
      qo.aq($$2);
      qo.f($$2);
      qo.j($$2);
      qo.h($$2);
      qo.i($$2);
      avl $$4 = avm.a(avo.qi);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static ddu m(jn<eiq> $$0, jn<eaz<?>> $$1) {
      ddv.a $$2 = new ddv.a($$0, $$1);
      deg.a $$3 = new deg.a();
      qo.c($$3);
      a($$2);
      qo.f($$2);
      qo.j($$2);
      qo.h($$2);
      qo.i($$2);
      avl $$4 = avm.a(avo.qt);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static ddu n(jn<eiq> $$0, jn<eaz<?>> $$1) {
      ddv.a $$2 = new ddv.a($$0, $$1);
      deg.a $$3 = new deg.a();
      $$3.a(bto.b, new deg.c(bsw.aG, 4, 2, 3)).a(bto.b, new deg.c(bsw.X, 5, 1, 3));
      qo.c($$3);
      a($$2);
      qo.aq($$2);
      qo.f($$2);
      qo.j($$2);
      qo.ad($$2);
      qo.h($$2);
      qo.i($$2);
      avl $$4 = avm.a(avo.qr);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static ddu o(jn<eiq> $$0, jn<eaz<?>> $$1) {
      ddv.a $$2 = new ddv.a($$0, $$1);
      deg.a $$3 = new deg.a();
      $$3.a(bto.b, new deg.c(bsw.bs, 1, 1, 1)).a(bto.b, new deg.c(bsw.aG, 8, 2, 3)).a(bto.b, new deg.c(bsw.Q, 4, 2, 4));
      qo.c($$3);
      a($$2);
      qo.aq($$2);
      qo.f($$2);
      qo.j($$2);
      qo.t($$2);
      qo.ad($$2);
      qo.h($$2);
      qo.i($$2);
      avl $$4 = avm.a(avo.qh);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static ddu p(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      $$2.a(bto.d, new deg.c(bsw.f, 10, 4, 6));
      $$2.a(bto.g, new deg.c(bsw.bg, 25, 8, 8));
      qo.c($$2);
      ddv.a $$3 = new ddv.a($$0, $$1);
      a($$3);
      qo.ab($$3);
      qo.f($$3);
      qo.B($$3);
      qo.j($$3);
      qo.A($$3);
      avl $$4 = avm.a(avo.qj);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static ddu q(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      qo.g($$2);
      ddv.a $$3 = new ddv.a($$0, $$1);
      a($$3);
      qo.ab($$3);
      qo.a($$3, true);
      qo.j($$3);
      qo.S($$3);
      qo.ac($$3);
      qo.ad($$3);
      qo.d($$3);
      avl $$4 = avm.a(avo.qg);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static ddu r(jn<eiq> $$0, jn<eaz<?>> $$1) {
      deg.a $$2 = new deg.a();
      ddv.a $$3 = new ddv.a($$0, $$1);
      $$3.a(dyr.a.a, qq.a);
      $$3.a(dyr.a.a, qq.b);
      $$3.a(dyr.a.a, qq.c);
      qo.aw($$3);
      qo.b($$3);
      qo.c($$3);
      qo.at($$3);
      qo.ab($$3);
      qo.f($$3);
      qo.j($$3);
      qo.S($$3);
      qo.ac($$3);
      qo.ad($$3);
      qo.e($$3);
      avl $$4 = avm.a(avo.qf);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
