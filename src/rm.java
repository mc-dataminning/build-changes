import javax.annotation.Nullable;

public class rm {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   @Nullable
   private static final avm e = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = ayo.a($$1, -1.0F, 1.0F);
      return ayo.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static ddw a(boolean $$0, float $$1, float $$2, dei.a $$3, ddx.a $$4, @Nullable avm $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static ddw a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dei.a $$7, ddx.a $$8, @Nullable avm $$9
   ) {
      dec.a $$10 = new dec.a().b($$3).c($$4).a(12638463).d(a($$1)).a(ddu.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new ddw.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(ddx.a $$0) {
      qp.a($$0);
      qp.aw($$0);
      qp.b($$0);
      qp.c($$0);
      qp.ap($$0);
      qp.at($$0);
   }

   public static ddw a(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a();
      qp.a($$3);
      $$3.a(btq.b, new dei.c(bsx.bs, 8, 4, 4));
      $$3.a(btq.b, new dei.c(bsx.aG, 4, 2, 3));
      $$3.a(btq.b, new dei.c(bsx.Q, 8, 2, 4));
      if ($$2) {
         qp.c($$3);
      } else {
         qp.b($$3);
         qp.a($$3, 100, 25, 100, false);
      }

      ddx.a $$4 = new ddx.a($$0, $$1);
      a($$4);
      qp.m($$4);
      qp.n($$4);
      qp.f($$4);
      qp.j($$4);
      $$4.a(dyu.b.j, $$2 ? si.ar : si.as);
      qp.V($$4);
      qp.U($$4);
      qp.ac($$4);
      qp.ad($$4);
      qp.p($$4);
      avm $$5 = avn.a(avp.qm);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static ddw a(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.i($$2);
      $$2.a(btq.b, new dei.c(bsx.bs, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, avn.a(avp.qz));
   }

   public static ddw b(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.i($$2);
      $$2.a(btq.b, new dei.c(bsx.ax, 40, 1, 2)).a(btq.a, new dei.c(bsx.au, 2, 1, 3)).a(btq.b, new dei.c(bsx.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, avn.a(avp.qy));
   }

   public static ddw c(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.i($$2);
      $$2.a(btq.b, new dei.c(bsx.ax, 40, 1, 2)).a(btq.b, new dei.c(bsx.aw, 80, 1, 2)).a(btq.a, new dei.c(bsx.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, avn.a(avp.qA));
   }

   private static ddw a(jn<eiv> $$0, jn<ebc<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dei.a $$6, avm $$7) {
      ddx.a $$8 = new ddx.a($$0, $$1);
      a($$8);
      qp.f($$8);
      qp.j($$8);
      if ($$3) {
         qp.r($$8);
      } else {
         if ($$5) {
            qp.q($$8);
         }

         if ($$4) {
            qp.F($$8);
         } else {
            qp.E($$8);
         }
      }

      qp.Y($$8);
      qp.I($$8);
      qp.ac($$8);
      qp.ad($$8);
      qp.ah($$8);
      if ($$4) {
         qp.ag($$8);
      } else {
         qp.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static ddw b(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a();
      qp.a($$3);
      $$3.a(btq.b, new dei.c(bsx.an, 5, 4, 6));
      qp.c($$3);
      ddx.a $$4 = new ddx.a($$0, $$1);
      a($$4);
      qp.f($$4);
      qp.j($$4);
      if ($$2) {
         qp.D($$4);
      } else {
         qp.C($$4);
      }

      qp.V($$4);
      qp.Z($$4);
      qp.ac($$4);
      qp.ad($$4);
      qp.h($$4);
      qp.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, e);
   }

   public static ddw d(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.f($$2);
      ddx.a $$3 = new ddx.a($$0, $$1);
      qp.al($$3);
      a($$3);
      qp.f($$3);
      qp.j($$3);
      qp.V($$3);
      qp.Z($$3);
      qp.T($$3);
      qp.ac($$3);
      qp.ai($$3);
      qp.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, avn.a(avp.qw));
   }

   public static ddw a(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dei.a $$5 = new dei.a();
      ddx.a $$6 = new ddx.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qp.e($$5);
         if ($$4) {
            $$6.a(dyu.b.e, sd.a);
            $$6.a(dyu.b.e, sd.b);
         }
      } else {
         qp.d($$5);
         qp.ab($$6);
         if ($$2) {
            $$6.a(dyu.b.j, si.d);
         }
      }

      qp.f($$6);
      qp.j($$6);
      if ($$3) {
         qp.H($$6);
         qp.V($$6);
         qp.Z($$6);
      } else {
         qp.S($$6);
      }

      qp.ac($$6);
      if ($$2) {
         $$6.a(dyu.b.j, si.E);
         $$6.a(dyu.b.j, si.e);
      } else {
         qp.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, e);
   }

   public static ddw e(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.h($$2);
      ddx.a $$3 = new ddx.a($$0, $$1);
      a($$3);
      qp.f($$3);
      qp.j($$3);
      qp.R($$3);
      qp.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, e);
   }

   public static ddw a(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2, boolean $$3) {
      ddx.a $$4 = new ddx.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qp.J($$4);
      }

      qp.f($$4);
      qp.j($$4);
      if ($$2) {
         qp.z($$4);
         qp.V($$4);
         qp.K($$4);
      } else {
         qp.y($$4);
         qp.Y($$4);
         qp.L($$4);
      }

      qp.ac($$4);
      qp.ad($$4);
      dei.a $$5 = new dei.a();
      qp.a($$5);
      $$5.a(btq.b, new dei.c(bsx.ab, 1, 2, 6)).a(btq.b, new dei.c(bsx.z, 1, 1, 1)).a(btq.b, new dei.c(bsx.c, 10, 2, 3));
      qp.c($$5);
      if ($$3) {
         $$5.a(btq.b, new dei.c(bsx.an, 8, 4, 4));
         $$5.a(btq.b, new dei.c(bsx.bs, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, e);
   }

   public static ddw c(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a();
      qp.c($$3);
      $$3.a(btq.b, new dei.c(bsx.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(btq.b, new dei.c(bsx.bs, 2, 4, 8));
         $$3.a(0.04F);
      }

      ddx.a $$4 = new ddx.a($$0, $$1);
      a($$4);
      qp.f($$4);
      qp.g($$4);
      qp.j($$4);
      if ($$2) {
         qp.G($$4);
      }

      qp.M($$4);
      qp.ac($$4);
      qp.ae($$4);
      return new ddw.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dec.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(ddu.b).a(avn.a(avp.qx)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static ddw a(dei.a $$0, int $$1, int $$2, ddx.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, e);
   }

   private static ddx.a s(jn<eiv> $$0, jn<ebc<?>> $$1) {
      ddx.a $$2 = new ddx.a($$0, $$1);
      a($$2);
      qp.f($$2);
      qp.j($$2);
      qp.u($$2);
      qp.V($$2);
      qp.Z($$2);
      qp.ac($$2);
      qp.ad($$2);
      return $$2;
   }

   public static ddw d(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a();
      qp.a($$3, 3, 4, 15);
      $$3.a(btq.g, new dei.c(bsx.aI, 15, 1, 5));
      ddx.a $$4 = s($$0, $$1);
      $$4.a(dyu.b.j, $$2 ? sa.h : sa.c);
      qp.an($$4);
      qp.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static ddw e(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a();
      qp.a($$3, 1, 4, 10);
      $$3.a(btq.f, new dei.c(bsx.y, 1, 1, 2));
      ddx.a $$4 = s($$0, $$1);
      $$4.a(dyu.b.j, $$2 ? sa.g : sa.b);
      qp.an($$4);
      qp.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static ddw f(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a();
      if ($$2) {
         qp.a($$3, 8, 4, 8);
      } else {
         qp.a($$3, 10, 2, 15);
      }

      $$3.a(btq.g, new dei.c(bsx.aF, 5, 1, 3)).a(btq.g, new dei.c(bsx.bg, 25, 8, 8)).a(btq.f, new dei.c(bsx.y, 2, 1, 2));
      ddx.a $$4 = s($$0, $$1);
      $$4.a(dyu.b.j, $$2 ? sa.f : sa.a);
      if ($$2) {
         qp.an($$4);
      }

      qp.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static ddw f(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a().a(btq.g, new dei.c(bsx.aF, 15, 1, 3));
      qp.a($$2, 10, 4);
      ddx.a $$3 = s($$0, $$1).a(dyu.b.j, sa.m).a(dyu.b.j, sa.a).a(dyu.b.j, sa.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static ddw g(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a().a(btq.f, new dei.c(bsx.aX, 1, 1, 4)).a(btq.g, new dei.c(bsx.aI, 15, 1, 5)).a(btq.b, new dei.c(bsx.aD, 1, 1, 2));
      qp.c($$3);
      $$3.a(btq.a, new dei.c(bsx.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      ddx.a $$5 = new ddx.a($$0, $$1);
      qp.ar($$5);
      a($$5);
      qp.as($$5);
      qp.f($$5);
      qp.j($$5);
      qp.u($$5);
      qp.V($$5);
      qp.Z($$5);
      qp.ac($$5);
      qp.ad($$5);
      return new ddw.a().a(true).a($$4).a(ddw.d.b).b(0.5F).a(new dec.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(ddu.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static ddw b(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      ddx.a $$5 = new ddx.a($$0, $$1);
      a($$5);
      avm $$6;
      if ($$4) {
         $$6 = avn.a(avp.qv);
         $$5.a(dyu.b.j, si.Y);
      } else {
         $$6 = avn.a(avp.ql);
         qp.N($$5);
      }

      qp.f($$5);
      qp.j($$5);
      if ($$4) {
         $$5.a(dyu.b.j, si.aa);
         $$5.a(dyu.b.j, si.R);
         qp.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               qp.x($$5);
            } else {
               qp.v($$5);
            }
         } else {
            qp.w($$5);
         }

         qp.V($$5);
         qp.O($$5);
      }

      qp.ac($$5);
      qp.ad($$5);
      dei.a $$8 = new dei.a();
      qp.a($$8);
      qp.c($$8);
      if ($$4) {
         $$8.a(btq.b, new dei.c(bsx.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(btq.b, new dei.c(bsx.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static ddw h(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a();
      qp.a($$3);
      $$3.a(btq.b, new dei.c(bsx.bs, 8, 4, 4)).a(btq.b, new dei.c(bsx.aG, 4, 2, 3)).a(btq.b, new dei.c(bsx.Q, 8, 2, 4));
      qp.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      ddx.a $$5 = new ddx.a($$0, $$1);
      a($$5);
      qp.n($$5);
      qp.f($$5);
      qp.j($$5);
      qp.s($$5);
      qp.V($$5);
      qp.aa($$5);
      qp.ad($$5);
      if ($$2) {
         qp.o($$5);
      } else {
         qp.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, e);
   }

   public static ddw g(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.a($$2);
      qp.c($$2);
      ddx.a $$3 = new ddx.a($$0, $$1);
      a($$3);
      $$3.a(dyu.b.j, si.X);
      qp.N($$3);
      qp.f($$3);
      qp.j($$3);
      qp.V($$3);
      qp.O($$3);
      qp.ac($$3);
      qp.ad($$3);
      avm $$4 = avn.a(avp.ql);
      return new ddw.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dec.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dec.b.b).a(ddu.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddw h(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.a($$2);
      qp.a($$2, 70);
      $$2.a(btq.a, new dei.c(bsx.aP, 1, 1, 1));
      $$2.a(btq.a, new dei.c(bsx.l, 30, 4, 4));
      $$2.a(btq.b, new dei.c(bsx.R, 10, 2, 5));
      ddx.a $$3 = new ddx.a($$0, $$1);
      qp.al($$3);
      a($$3);
      qp.f($$3);
      qp.k($$3);
      qp.P($$3);
      qp.ac($$3);
      qp.aj($$3);
      $$3.a(dyu.b.j, sa.e);
      avm $$4 = avn.a(avp.qk);
      return new ddw.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dec.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dec.b.c).a(ddu.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddw i(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.a($$2, 70);
      $$2.a(btq.a, new dei.c(bsx.aP, 1, 1, 1));
      $$2.a(btq.a, new dei.c(bsx.l, 30, 4, 4));
      $$2.a(btq.b, new dei.c(bsx.R, 10, 2, 5));
      $$2.a(btq.g, new dei.c(bsx.bg, 25, 8, 8));
      ddx.a $$3 = new ddx.a($$0, $$1);
      qp.al($$3);
      a($$3);
      qp.f($$3);
      qp.l($$3);
      qp.Q($$3);
      $$3.a(dyu.b.j, sa.e);
      avm $$4 = avn.a(avp.qk);
      return new ddw.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dec.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dec.b.c).a(ddu.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddw i(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      dei.a $$3 = new dei.a().a(btq.f, new dei.c(bsx.aX, 2, 1, 4)).a(btq.g, new dei.c(bsx.aI, 5, 1, 5));
      qp.c($$3);
      $$3.a(btq.a, new dei.c(bsx.B, $$2 ? 1 : 100, 1, 1));
      ddx.a $$4 = new ddx.a($$0, $$1);
      a($$4);
      qp.f($$4);
      qp.j($$4);
      qp.u($$4);
      qp.V($$4);
      qp.Z($$4);
      qp.ac($$4);
      qp.ad($$4);
      if (!$$2) {
         $$4.a(dyu.b.j, sa.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, e);
   }

   public static ddw b(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2, boolean $$3) {
      dei.a $$4 = new dei.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(btq.b, new dei.c(bsx.bh, 5, 2, 5));
      }

      qp.c($$4);
      ddx.a $$6 = new ddx.a($$0, $$1);
      a($$6);
      qp.f($$6);
      qp.j($$6);
      qp.V($$6);
      qp.Z($$6);
      qp.ac($$6);
      qp.ad($$6);
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

   public static ddw j(jn<eiv> $$0, jn<ebc<?>> $$1) {
      ddx.a $$2 = new ddx.a($$0, $$1);
      $$2.a(dyu.b.k, sd.n);
      return a(false, 0.5F, 0.5F, new dei.a(), $$2, e);
   }

   public static ddw j(jn<eiv> $$0, jn<ebc<?>> $$1, boolean $$2) {
      ddx.a $$3 = new ddx.a($$0, $$1);
      dei.a $$4 = new dei.a();
      $$4.a(btq.b, new dei.c($$2 ? bsx.az : bsx.z, 1, 1, 2)).a(btq.b, new dei.c(bsx.aG, 2, 2, 6)).a(btq.b, new dei.c(bsx.aJ, 2, 2, 4));
      qp.c($$4);
      a($$3);
      qp.ab($$3);
      qp.f($$3);
      qp.j($$3);
      if ($$2) {
         qp.W($$3);
      } else {
         qp.X($$3);
      }

      qp.h($$3);
      qp.i($$3);
      avm $$5 = avn.a($$2 ? avp.qo : avp.qn);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static ddw k(jn<eiv> $$0, jn<ebc<?>> $$1) {
      ddx.a $$2 = new ddx.a($$0, $$1);
      dei.a $$3 = new dei.a();
      $$3.a(btq.b, new dei.c(bsx.X, 5, 1, 3));
      qp.c($$3);
      a($$2);
      qp.aq($$2);
      qp.f($$2);
      qp.j($$2);
      qp.h($$2);
      qp.i($$2);
      avm $$4 = avn.a(avp.qq);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static ddw l(jn<eiv> $$0, jn<ebc<?>> $$1) {
      ddx.a $$2 = new ddx.a($$0, $$1);
      dei.a $$3 = new dei.a();
      $$3.a(btq.b, new dei.c(bsx.X, 5, 1, 3));
      qp.c($$3);
      a($$2);
      qp.aq($$2);
      qp.f($$2);
      qp.j($$2);
      qp.h($$2);
      qp.i($$2);
      avm $$4 = avn.a(avp.qi);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static ddw m(jn<eiv> $$0, jn<ebc<?>> $$1) {
      ddx.a $$2 = new ddx.a($$0, $$1);
      dei.a $$3 = new dei.a();
      qp.c($$3);
      a($$2);
      qp.f($$2);
      qp.j($$2);
      qp.h($$2);
      qp.i($$2);
      avm $$4 = avn.a(avp.qt);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static ddw n(jn<eiv> $$0, jn<ebc<?>> $$1) {
      ddx.a $$2 = new ddx.a($$0, $$1);
      dei.a $$3 = new dei.a();
      $$3.a(btq.b, new dei.c(bsx.aG, 4, 2, 3)).a(btq.b, new dei.c(bsx.X, 5, 1, 3));
      qp.c($$3);
      a($$2);
      qp.aq($$2);
      qp.f($$2);
      qp.j($$2);
      qp.ad($$2);
      qp.h($$2);
      qp.i($$2);
      avm $$4 = avn.a(avp.qr);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static ddw o(jn<eiv> $$0, jn<ebc<?>> $$1) {
      ddx.a $$2 = new ddx.a($$0, $$1);
      dei.a $$3 = new dei.a();
      $$3.a(btq.b, new dei.c(bsx.bs, 1, 1, 1)).a(btq.b, new dei.c(bsx.aG, 8, 2, 3)).a(btq.b, new dei.c(bsx.Q, 4, 2, 4));
      qp.c($$3);
      a($$2);
      qp.aq($$2);
      qp.f($$2);
      qp.j($$2);
      qp.t($$2);
      qp.ad($$2);
      qp.h($$2);
      qp.i($$2);
      avm $$4 = avn.a(avp.qh);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static ddw p(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      $$2.a(btq.d, new dei.c(bsx.f, 10, 4, 6));
      $$2.a(btq.g, new dei.c(bsx.bg, 25, 8, 8));
      qp.c($$2);
      ddx.a $$3 = new ddx.a($$0, $$1);
      a($$3);
      qp.ab($$3);
      qp.f($$3);
      qp.B($$3);
      qp.j($$3);
      qp.A($$3);
      avm $$4 = avn.a(avp.qj);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static ddw q(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      qp.g($$2);
      ddx.a $$3 = new ddx.a($$0, $$1);
      a($$3);
      qp.ab($$3);
      qp.a($$3, true);
      qp.j($$3);
      qp.S($$3);
      qp.ac($$3);
      qp.ad($$3);
      qp.d($$3);
      avm $$4 = avn.a(avp.qg);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static ddw r(jn<eiv> $$0, jn<ebc<?>> $$1) {
      dei.a $$2 = new dei.a();
      ddx.a $$3 = new ddx.a($$0, $$1);
      $$3.a(dyu.a.a, qr.a);
      $$3.a(dyu.a.a, qr.b);
      $$3.a(dyu.a.a, qr.c);
      qp.aw($$3);
      qp.b($$3);
      qp.c($$3);
      qp.at($$3);
      qp.ab($$3);
      qp.f($$3);
      qp.j($$3);
      qp.S($$3);
      qp.ac($$3);
      qp.ad($$3);
      qp.e($$3);
      avm $$4 = avn.a(avp.qf);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
