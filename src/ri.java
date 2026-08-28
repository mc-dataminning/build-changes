import javax.annotation.Nullable;

public class ri {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   @Nullable
   private static final ave e = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = ayg.a($$1, -1.0F, 1.0F);
      return ayg.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static ddg a(boolean $$0, float $$1, float $$2, dds.a $$3, ddh.a $$4, @Nullable ave $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static ddg a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dds.a $$7, ddh.a $$8, @Nullable ave $$9
   ) {
      ddm.a $$10 = new ddm.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dde.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new ddg.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(ddh.a $$0) {
      ql.a($$0);
      ql.aw($$0);
      ql.b($$0);
      ql.c($$0);
      ql.ap($$0);
      ql.at($$0);
   }

   public static ddg a(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a();
      ql.a($$3);
      $$3.a(btf.b, new dds.c(bsn.bs, 8, 4, 4));
      $$3.a(btf.b, new dds.c(bsn.aG, 4, 2, 3));
      $$3.a(btf.b, new dds.c(bsn.Q, 8, 2, 4));
      if ($$2) {
         ql.c($$3);
      } else {
         ql.b($$3);
         ql.a($$3, 100, 25, 100, false);
      }

      ddh.a $$4 = new ddh.a($$0, $$1);
      a($$4);
      ql.m($$4);
      ql.n($$4);
      ql.f($$4);
      ql.j($$4);
      $$4.a(dyc.b.j, $$2 ? se.ar : se.as);
      ql.V($$4);
      ql.U($$4);
      ql.ac($$4);
      ql.ad($$4);
      ql.p($$4);
      ave $$5 = avf.a(avh.qm);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static ddg a(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.i($$2);
      $$2.a(btf.b, new dds.c(bsn.bs, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, avf.a(avh.qz));
   }

   public static ddg b(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.i($$2);
      $$2.a(btf.b, new dds.c(bsn.ax, 40, 1, 2)).a(btf.a, new dds.c(bsn.au, 2, 1, 3)).a(btf.b, new dds.c(bsn.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, avf.a(avh.qy));
   }

   public static ddg c(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.i($$2);
      $$2.a(btf.b, new dds.c(bsn.ax, 40, 1, 2)).a(btf.b, new dds.c(bsn.aw, 80, 1, 2)).a(btf.a, new dds.c(bsn.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, avf.a(avh.qA));
   }

   private static ddg a(jk<eib> $$0, jk<eak<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dds.a $$6, ave $$7) {
      ddh.a $$8 = new ddh.a($$0, $$1);
      a($$8);
      ql.f($$8);
      ql.j($$8);
      if ($$3) {
         ql.r($$8);
      } else {
         if ($$5) {
            ql.q($$8);
         }

         if ($$4) {
            ql.F($$8);
         } else {
            ql.E($$8);
         }
      }

      ql.Y($$8);
      ql.I($$8);
      ql.ac($$8);
      ql.ad($$8);
      ql.ah($$8);
      if ($$4) {
         ql.ag($$8);
      } else {
         ql.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static ddg b(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a();
      ql.a($$3);
      $$3.a(btf.b, new dds.c(bsn.an, 5, 4, 6));
      ql.c($$3);
      ddh.a $$4 = new ddh.a($$0, $$1);
      a($$4);
      ql.f($$4);
      ql.j($$4);
      if ($$2) {
         ql.D($$4);
      } else {
         ql.C($$4);
      }

      ql.V($$4);
      ql.Z($$4);
      ql.ac($$4);
      ql.ad($$4);
      ql.h($$4);
      ql.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, e);
   }

   public static ddg d(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.f($$2);
      ddh.a $$3 = new ddh.a($$0, $$1);
      ql.al($$3);
      a($$3);
      ql.f($$3);
      ql.j($$3);
      ql.V($$3);
      ql.Z($$3);
      ql.T($$3);
      ql.ac($$3);
      ql.ai($$3);
      ql.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, avf.a(avh.qw));
   }

   public static ddg a(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dds.a $$5 = new dds.a();
      ddh.a $$6 = new ddh.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         ql.e($$5);
         if ($$4) {
            $$6.a(dyc.b.e, rz.a);
            $$6.a(dyc.b.e, rz.b);
         }
      } else {
         ql.d($$5);
         ql.ab($$6);
         if ($$2) {
            $$6.a(dyc.b.j, se.d);
         }
      }

      ql.f($$6);
      ql.j($$6);
      if ($$3) {
         ql.H($$6);
         ql.V($$6);
         ql.Z($$6);
      } else {
         ql.S($$6);
      }

      ql.ac($$6);
      if ($$2) {
         $$6.a(dyc.b.j, se.E);
         $$6.a(dyc.b.j, se.e);
      } else {
         ql.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, e);
   }

   public static ddg e(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.h($$2);
      ddh.a $$3 = new ddh.a($$0, $$1);
      a($$3);
      ql.f($$3);
      ql.j($$3);
      ql.R($$3);
      ql.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, e);
   }

   public static ddg a(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2, boolean $$3) {
      ddh.a $$4 = new ddh.a($$0, $$1);
      a($$4);
      if (!$$2) {
         ql.J($$4);
      }

      ql.f($$4);
      ql.j($$4);
      if ($$2) {
         ql.z($$4);
         ql.V($$4);
         ql.K($$4);
      } else {
         ql.y($$4);
         ql.Y($$4);
         ql.L($$4);
      }

      ql.ac($$4);
      ql.ad($$4);
      dds.a $$5 = new dds.a();
      ql.a($$5);
      $$5.a(btf.b, new dds.c(bsn.ab, 1, 2, 6)).a(btf.b, new dds.c(bsn.z, 1, 1, 1)).a(btf.b, new dds.c(bsn.c, 10, 2, 3));
      ql.c($$5);
      if ($$3) {
         $$5.a(btf.b, new dds.c(bsn.an, 8, 4, 4));
         $$5.a(btf.b, new dds.c(bsn.bs, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, e);
   }

   public static ddg c(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a();
      ql.c($$3);
      $$3.a(btf.b, new dds.c(bsn.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(btf.b, new dds.c(bsn.bs, 2, 4, 8));
         $$3.a(0.04F);
      }

      ddh.a $$4 = new ddh.a($$0, $$1);
      a($$4);
      ql.f($$4);
      ql.g($$4);
      ql.j($$4);
      if ($$2) {
         ql.G($$4);
      }

      ql.M($$4);
      ql.ac($$4);
      ql.ae($$4);
      return new ddg.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new ddm.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dde.b).a(avf.a(avh.qx)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static ddg a(dds.a $$0, int $$1, int $$2, ddh.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, e);
   }

   private static ddh.a s(jk<eib> $$0, jk<eak<?>> $$1) {
      ddh.a $$2 = new ddh.a($$0, $$1);
      a($$2);
      ql.f($$2);
      ql.j($$2);
      ql.u($$2);
      ql.V($$2);
      ql.Z($$2);
      ql.ac($$2);
      ql.ad($$2);
      return $$2;
   }

   public static ddg d(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a();
      ql.a($$3, 3, 4, 15);
      $$3.a(btf.g, new dds.c(bsn.aI, 15, 1, 5));
      ddh.a $$4 = s($$0, $$1);
      $$4.a(dyc.b.j, $$2 ? rw.h : rw.c);
      ql.an($$4);
      ql.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static ddg e(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a();
      ql.a($$3, 1, 4, 10);
      $$3.a(btf.f, new dds.c(bsn.y, 1, 1, 2));
      ddh.a $$4 = s($$0, $$1);
      $$4.a(dyc.b.j, $$2 ? rw.g : rw.b);
      ql.an($$4);
      ql.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static ddg f(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a();
      if ($$2) {
         ql.a($$3, 8, 4, 8);
      } else {
         ql.a($$3, 10, 2, 15);
      }

      $$3.a(btf.g, new dds.c(bsn.aF, 5, 1, 3)).a(btf.g, new dds.c(bsn.bg, 25, 8, 8)).a(btf.f, new dds.c(bsn.y, 2, 1, 2));
      ddh.a $$4 = s($$0, $$1);
      $$4.a(dyc.b.j, $$2 ? rw.f : rw.a);
      if ($$2) {
         ql.an($$4);
      }

      ql.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static ddg f(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a().a(btf.g, new dds.c(bsn.aF, 15, 1, 3));
      ql.a($$2, 10, 4);
      ddh.a $$3 = s($$0, $$1).a(dyc.b.j, rw.m).a(dyc.b.j, rw.a).a(dyc.b.j, rw.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static ddg g(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a().a(btf.f, new dds.c(bsn.aX, 1, 1, 4)).a(btf.g, new dds.c(bsn.aI, 15, 1, 5)).a(btf.b, new dds.c(bsn.aD, 1, 1, 2));
      ql.c($$3);
      $$3.a(btf.a, new dds.c(bsn.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      ddh.a $$5 = new ddh.a($$0, $$1);
      ql.ar($$5);
      a($$5);
      ql.as($$5);
      ql.f($$5);
      ql.j($$5);
      ql.u($$5);
      ql.V($$5);
      ql.Z($$5);
      ql.ac($$5);
      ql.ad($$5);
      return new ddg.a().a(true).a($$4).a(ddg.d.b).b(0.5F).a(new ddm.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dde.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static ddg b(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      ddh.a $$5 = new ddh.a($$0, $$1);
      a($$5);
      ave $$6;
      if ($$4) {
         $$6 = avf.a(avh.qv);
         $$5.a(dyc.b.j, se.Y);
      } else {
         $$6 = avf.a(avh.ql);
         ql.N($$5);
      }

      ql.f($$5);
      ql.j($$5);
      if ($$4) {
         $$5.a(dyc.b.j, se.aa);
         $$5.a(dyc.b.j, se.R);
         ql.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               ql.x($$5);
            } else {
               ql.v($$5);
            }
         } else {
            ql.w($$5);
         }

         ql.V($$5);
         ql.O($$5);
      }

      ql.ac($$5);
      ql.ad($$5);
      dds.a $$8 = new dds.a();
      ql.a($$8);
      ql.c($$8);
      if ($$4) {
         $$8.a(btf.b, new dds.c(bsn.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(btf.b, new dds.c(bsn.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static ddg h(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a();
      ql.a($$3);
      $$3.a(btf.b, new dds.c(bsn.bs, 8, 4, 4)).a(btf.b, new dds.c(bsn.aG, 4, 2, 3)).a(btf.b, new dds.c(bsn.Q, 8, 2, 4));
      ql.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      ddh.a $$5 = new ddh.a($$0, $$1);
      a($$5);
      ql.n($$5);
      ql.f($$5);
      ql.j($$5);
      ql.s($$5);
      ql.V($$5);
      ql.aa($$5);
      ql.ad($$5);
      if ($$2) {
         ql.o($$5);
      } else {
         ql.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, e);
   }

   public static ddg g(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.a($$2);
      ql.c($$2);
      ddh.a $$3 = new ddh.a($$0, $$1);
      a($$3);
      $$3.a(dyc.b.j, se.X);
      ql.N($$3);
      ql.f($$3);
      ql.j($$3);
      ql.V($$3);
      ql.O($$3);
      ql.ac($$3);
      ql.ad($$3);
      ave $$4 = avf.a(avh.ql);
      return new ddg.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new ddm.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(ddm.b.b).a(dde.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddg h(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.a($$2);
      ql.a($$2, 70);
      $$2.a(btf.a, new dds.c(bsn.aP, 1, 1, 1));
      $$2.a(btf.a, new dds.c(bsn.l, 30, 4, 4));
      $$2.a(btf.b, new dds.c(bsn.R, 10, 2, 5));
      ddh.a $$3 = new ddh.a($$0, $$1);
      ql.al($$3);
      a($$3);
      ql.f($$3);
      ql.k($$3);
      ql.P($$3);
      ql.ac($$3);
      ql.aj($$3);
      $$3.a(dyc.b.j, rw.e);
      ave $$4 = avf.a(avh.qk);
      return new ddg.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new ddm.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(ddm.b.c).a(dde.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddg i(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.a($$2, 70);
      $$2.a(btf.a, new dds.c(bsn.aP, 1, 1, 1));
      $$2.a(btf.a, new dds.c(bsn.l, 30, 4, 4));
      $$2.a(btf.b, new dds.c(bsn.R, 10, 2, 5));
      $$2.a(btf.g, new dds.c(bsn.bg, 25, 8, 8));
      ddh.a $$3 = new ddh.a($$0, $$1);
      ql.al($$3);
      a($$3);
      ql.f($$3);
      ql.l($$3);
      ql.Q($$3);
      $$3.a(dyc.b.j, rw.e);
      ave $$4 = avf.a(avh.qk);
      return new ddg.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new ddm.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(ddm.b.c).a(dde.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static ddg i(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      dds.a $$3 = new dds.a().a(btf.f, new dds.c(bsn.aX, 2, 1, 4)).a(btf.g, new dds.c(bsn.aI, 5, 1, 5));
      ql.c($$3);
      $$3.a(btf.a, new dds.c(bsn.B, $$2 ? 1 : 100, 1, 1));
      ddh.a $$4 = new ddh.a($$0, $$1);
      a($$4);
      ql.f($$4);
      ql.j($$4);
      ql.u($$4);
      ql.V($$4);
      ql.Z($$4);
      ql.ac($$4);
      ql.ad($$4);
      if (!$$2) {
         $$4.a(dyc.b.j, rw.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, e);
   }

   public static ddg b(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2, boolean $$3) {
      dds.a $$4 = new dds.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(btf.b, new dds.c(bsn.bh, 5, 2, 5));
      }

      ql.c($$4);
      ddh.a $$6 = new ddh.a($$0, $$1);
      a($$6);
      ql.f($$6);
      ql.j($$6);
      ql.V($$6);
      ql.Z($$6);
      ql.ac($$6);
      ql.ad($$6);
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

   public static ddg j(jk<eib> $$0, jk<eak<?>> $$1) {
      ddh.a $$2 = new ddh.a($$0, $$1);
      $$2.a(dyc.b.k, rz.n);
      return a(false, 0.5F, 0.5F, new dds.a(), $$2, e);
   }

   public static ddg j(jk<eib> $$0, jk<eak<?>> $$1, boolean $$2) {
      ddh.a $$3 = new ddh.a($$0, $$1);
      dds.a $$4 = new dds.a();
      $$4.a(btf.b, new dds.c($$2 ? bsn.az : bsn.z, 1, 1, 2)).a(btf.b, new dds.c(bsn.aG, 2, 2, 6)).a(btf.b, new dds.c(bsn.aJ, 2, 2, 4));
      ql.c($$4);
      a($$3);
      ql.ab($$3);
      ql.f($$3);
      ql.j($$3);
      if ($$2) {
         ql.W($$3);
      } else {
         ql.X($$3);
      }

      ql.h($$3);
      ql.i($$3);
      ave $$5 = avf.a($$2 ? avh.qo : avh.qn);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static ddg k(jk<eib> $$0, jk<eak<?>> $$1) {
      ddh.a $$2 = new ddh.a($$0, $$1);
      dds.a $$3 = new dds.a();
      $$3.a(btf.b, new dds.c(bsn.X, 5, 1, 3));
      ql.c($$3);
      a($$2);
      ql.aq($$2);
      ql.f($$2);
      ql.j($$2);
      ql.h($$2);
      ql.i($$2);
      ave $$4 = avf.a(avh.qq);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static ddg l(jk<eib> $$0, jk<eak<?>> $$1) {
      ddh.a $$2 = new ddh.a($$0, $$1);
      dds.a $$3 = new dds.a();
      $$3.a(btf.b, new dds.c(bsn.X, 5, 1, 3));
      ql.c($$3);
      a($$2);
      ql.aq($$2);
      ql.f($$2);
      ql.j($$2);
      ql.h($$2);
      ql.i($$2);
      ave $$4 = avf.a(avh.qi);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static ddg m(jk<eib> $$0, jk<eak<?>> $$1) {
      ddh.a $$2 = new ddh.a($$0, $$1);
      dds.a $$3 = new dds.a();
      ql.c($$3);
      a($$2);
      ql.f($$2);
      ql.j($$2);
      ql.h($$2);
      ql.i($$2);
      ave $$4 = avf.a(avh.qt);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static ddg n(jk<eib> $$0, jk<eak<?>> $$1) {
      ddh.a $$2 = new ddh.a($$0, $$1);
      dds.a $$3 = new dds.a();
      $$3.a(btf.b, new dds.c(bsn.aG, 4, 2, 3)).a(btf.b, new dds.c(bsn.X, 5, 1, 3));
      ql.c($$3);
      a($$2);
      ql.aq($$2);
      ql.f($$2);
      ql.j($$2);
      ql.ad($$2);
      ql.h($$2);
      ql.i($$2);
      ave $$4 = avf.a(avh.qr);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static ddg o(jk<eib> $$0, jk<eak<?>> $$1) {
      ddh.a $$2 = new ddh.a($$0, $$1);
      dds.a $$3 = new dds.a();
      $$3.a(btf.b, new dds.c(bsn.bs, 1, 1, 1)).a(btf.b, new dds.c(bsn.aG, 8, 2, 3)).a(btf.b, new dds.c(bsn.Q, 4, 2, 4));
      ql.c($$3);
      a($$2);
      ql.aq($$2);
      ql.f($$2);
      ql.j($$2);
      ql.t($$2);
      ql.ad($$2);
      ql.h($$2);
      ql.i($$2);
      ave $$4 = avf.a(avh.qh);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static ddg p(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      $$2.a(btf.d, new dds.c(bsn.f, 10, 4, 6));
      $$2.a(btf.g, new dds.c(bsn.bg, 25, 8, 8));
      ql.c($$2);
      ddh.a $$3 = new ddh.a($$0, $$1);
      a($$3);
      ql.ab($$3);
      ql.f($$3);
      ql.B($$3);
      ql.j($$3);
      ql.A($$3);
      ave $$4 = avf.a(avh.qj);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static ddg q(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ql.g($$2);
      ddh.a $$3 = new ddh.a($$0, $$1);
      a($$3);
      ql.ab($$3);
      ql.a($$3, true);
      ql.j($$3);
      ql.S($$3);
      ql.ac($$3);
      ql.ad($$3);
      ql.d($$3);
      ave $$4 = avf.a(avh.qg);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static ddg r(jk<eib> $$0, jk<eak<?>> $$1) {
      dds.a $$2 = new dds.a();
      ddh.a $$3 = new ddh.a($$0, $$1);
      $$3.a(dyc.a.a, qn.a);
      $$3.a(dyc.a.a, qn.b);
      $$3.a(dyc.a.a, qn.c);
      ql.aw($$3);
      ql.b($$3);
      ql.c($$3);
      ql.at($$3);
      ql.ab($$3);
      ql.f($$3);
      ql.j($$3);
      ql.S($$3);
      ql.ac($$3);
      ql.ad($$3);
      ql.e($$3);
      ave $$4 = avf.a(avh.qf);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
