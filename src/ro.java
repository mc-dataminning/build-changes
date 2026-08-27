import javax.annotation.Nullable;

public class ro {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final avf d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = ayf.a($$1, -1.0F, 1.0F);
      return ayf.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dby a(boolean $$0, float $$1, float $$2, dck.a $$3, dbz.a $$4, @Nullable avf $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dby a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dck.a $$7, dbz.a $$8, @Nullable avf $$9
   ) {
      dce.a $$10 = new dce.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dbw.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dby.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dbz.a $$0) {
      qn.a($$0);
      qn.aw($$0);
      qn.b($$0);
      qn.c($$0);
      qn.ap($$0);
      qn.at($$0);
   }

   public static dby a(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a();
      qn.a($$3);
      $$3.a(bst.b, new dck.c(bsc.bs, 8, 4, 4));
      $$3.a(bst.b, new dck.c(bsc.aG, 4, 2, 3));
      $$3.a(bst.b, new dck.c(bsc.Q, 8, 2, 4));
      if ($$2) {
         qn.c($$3);
      } else {
         qn.b($$3);
         qn.a($$3, 100, 25, 100, false);
      }

      dbz.a $$4 = new dbz.a($$0, $$1);
      a($$4);
      qn.m($$4);
      qn.n($$4);
      qn.f($$4);
      qn.j($$4);
      $$4.a(dwr.b.j, $$2 ? sk.ar : sk.as);
      qn.V($$4);
      qn.U($$4);
      qn.ac($$4);
      qn.ad($$4);
      qn.p($$4);
      avf $$5 = avg.a(avi.qj);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dby a(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.i($$2);
      $$2.a(bst.b, new dck.c(bsc.bs, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, avg.a(avi.qw));
   }

   public static dby b(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.i($$2);
      $$2.a(bst.b, new dck.c(bsc.ax, 40, 1, 2)).a(bst.a, new dck.c(bsc.au, 2, 1, 3)).a(bst.b, new dck.c(bsc.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, avg.a(avi.qv));
   }

   public static dby c(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.i($$2);
      $$2.a(bst.b, new dck.c(bsc.ax, 40, 1, 2)).a(bst.b, new dck.c(bsc.aw, 80, 1, 2)).a(bst.a, new dck.c(bsc.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, avg.a(avi.qx));
   }

   private static dby a(iy<egp> $$0, iy<dyy<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dck.a $$6, avf $$7) {
      dbz.a $$8 = new dbz.a($$0, $$1);
      a($$8);
      qn.f($$8);
      qn.j($$8);
      if ($$3) {
         qn.r($$8);
      } else {
         if ($$5) {
            qn.q($$8);
         }

         if ($$4) {
            qn.F($$8);
         } else {
            qn.E($$8);
         }
      }

      qn.Y($$8);
      qn.I($$8);
      qn.ac($$8);
      qn.ad($$8);
      qn.ah($$8);
      if ($$4) {
         qn.ag($$8);
      } else {
         qn.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dby b(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a();
      qn.a($$3);
      $$3.a(bst.b, new dck.c(bsc.an, 5, 4, 6));
      qn.c($$3);
      dbz.a $$4 = new dbz.a($$0, $$1);
      a($$4);
      qn.f($$4);
      qn.j($$4);
      if ($$2) {
         qn.D($$4);
      } else {
         qn.C($$4);
      }

      qn.V($$4);
      qn.Z($$4);
      qn.ac($$4);
      qn.ad($$4);
      qn.h($$4);
      qn.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static dby d(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.f($$2);
      dbz.a $$3 = new dbz.a($$0, $$1);
      qn.al($$3);
      a($$3);
      qn.f($$3);
      qn.j($$3);
      qn.V($$3);
      qn.Z($$3);
      qn.T($$3);
      qn.ac($$3);
      qn.ai($$3);
      qn.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, avg.a(avi.qt));
   }

   public static dby a(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dck.a $$5 = new dck.a();
      dbz.a $$6 = new dbz.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qn.e($$5);
         if ($$4) {
            $$6.a(dwr.b.e, sf.a);
            $$6.a(dwr.b.e, sf.b);
         }
      } else {
         qn.d($$5);
         qn.ab($$6);
         if ($$2) {
            $$6.a(dwr.b.j, sk.d);
         }
      }

      qn.f($$6);
      qn.j($$6);
      if ($$3) {
         qn.H($$6);
         qn.V($$6);
         qn.Z($$6);
      } else {
         qn.S($$6);
      }

      qn.ac($$6);
      if ($$2) {
         $$6.a(dwr.b.j, sk.E);
         $$6.a(dwr.b.j, sk.e);
      } else {
         qn.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static dby e(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.h($$2);
      dbz.a $$3 = new dbz.a($$0, $$1);
      a($$3);
      qn.f($$3);
      qn.j($$3);
      qn.R($$3);
      qn.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static dby a(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2, boolean $$3) {
      dbz.a $$4 = new dbz.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qn.J($$4);
      }

      qn.f($$4);
      qn.j($$4);
      if ($$2) {
         qn.z($$4);
         qn.V($$4);
         qn.K($$4);
      } else {
         qn.y($$4);
         qn.Y($$4);
         qn.L($$4);
      }

      qn.ac($$4);
      qn.ad($$4);
      dck.a $$5 = new dck.a();
      qn.a($$5);
      $$5.a(bst.b, new dck.c(bsc.ab, 1, 2, 6)).a(bst.b, new dck.c(bsc.z, 1, 1, 1)).a(bst.b, new dck.c(bsc.c, 10, 2, 3));
      qn.c($$5);
      if ($$3) {
         $$5.a(bst.b, new dck.c(bsc.an, 8, 4, 4));
         $$5.a(bst.b, new dck.c(bsc.bs, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static dby c(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a();
      qn.c($$3);
      $$3.a(bst.b, new dck.c(bsc.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bst.b, new dck.c(bsc.bs, 2, 4, 8));
         $$3.a(0.04F);
      }

      dbz.a $$4 = new dbz.a($$0, $$1);
      a($$4);
      qn.f($$4);
      qn.g($$4);
      qn.j($$4);
      if ($$2) {
         qn.G($$4);
      }

      qn.M($$4);
      qn.ac($$4);
      qn.ae($$4);
      return new dby.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dce.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dbw.b).a(avg.a(avi.qu)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dby a(dck.a $$0, int $$1, int $$2, dbz.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static dbz.a s(iy<egp> $$0, iy<dyy<?>> $$1) {
      dbz.a $$2 = new dbz.a($$0, $$1);
      a($$2);
      qn.f($$2);
      qn.j($$2);
      qn.u($$2);
      qn.V($$2);
      qn.Z($$2);
      qn.ac($$2);
      qn.ad($$2);
      return $$2;
   }

   public static dby d(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a();
      qn.a($$3, 3, 4, 15);
      $$3.a(bst.g, new dck.c(bsc.aI, 15, 1, 5));
      dbz.a $$4 = s($$0, $$1);
      $$4.a(dwr.b.j, $$2 ? sc.h : sc.c);
      qn.an($$4);
      qn.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dby e(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a();
      qn.a($$3, 1, 4, 10);
      $$3.a(bst.f, new dck.c(bsc.y, 1, 1, 2));
      dbz.a $$4 = s($$0, $$1);
      $$4.a(dwr.b.j, $$2 ? sc.g : sc.b);
      qn.an($$4);
      qn.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dby f(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a();
      if ($$2) {
         qn.a($$3, 8, 4, 8);
      } else {
         qn.a($$3, 10, 2, 15);
      }

      $$3.a(bst.g, new dck.c(bsc.aF, 5, 1, 3)).a(bst.g, new dck.c(bsc.bg, 25, 8, 8)).a(bst.f, new dck.c(bsc.y, 2, 1, 2));
      dbz.a $$4 = s($$0, $$1);
      $$4.a(dwr.b.j, $$2 ? sc.f : sc.a);
      if ($$2) {
         qn.an($$4);
      }

      qn.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dby f(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a().a(bst.g, new dck.c(bsc.aF, 15, 1, 3));
      qn.a($$2, 10, 4);
      dbz.a $$3 = s($$0, $$1).a(dwr.b.j, sc.m).a(dwr.b.j, sc.a).a(dwr.b.j, sc.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dby g(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a().a(bst.f, new dck.c(bsc.aX, 1, 1, 4)).a(bst.g, new dck.c(bsc.aI, 15, 1, 5)).a(bst.b, new dck.c(bsc.aD, 1, 1, 2));
      qn.c($$3);
      $$3.a(bst.a, new dck.c(bsc.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dbz.a $$5 = new dbz.a($$0, $$1);
      qn.ar($$5);
      a($$5);
      qn.as($$5);
      qn.f($$5);
      qn.j($$5);
      qn.u($$5);
      qn.V($$5);
      qn.Z($$5);
      qn.ac($$5);
      qn.ad($$5);
      return new dby.a().a(true).a($$4).a(dby.d.b).b(0.5F).a(new dce.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dbw.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static dby b(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dbz.a $$5 = new dbz.a($$0, $$1);
      a($$5);
      avf $$6;
      if ($$4) {
         $$6 = avg.a(avi.qs);
         $$5.a(dwr.b.j, sk.Y);
      } else {
         $$6 = avg.a(avi.qi);
         qn.N($$5);
      }

      qn.f($$5);
      qn.j($$5);
      if ($$4) {
         $$5.a(dwr.b.j, sk.aa);
         $$5.a(dwr.b.j, sk.R);
         qn.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               qn.x($$5);
            } else {
               qn.v($$5);
            }
         } else {
            qn.w($$5);
         }

         qn.V($$5);
         qn.O($$5);
      }

      qn.ac($$5);
      qn.ad($$5);
      dck.a $$8 = new dck.a();
      qn.a($$8);
      qn.c($$8);
      if ($$4) {
         $$8.a(bst.b, new dck.c(bsc.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bst.b, new dck.c(bsc.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dby h(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a();
      qn.a($$3);
      $$3.a(bst.b, new dck.c(bsc.bs, 8, 4, 4)).a(bst.b, new dck.c(bsc.aG, 4, 2, 3)).a(bst.b, new dck.c(bsc.Q, 8, 2, 4));
      qn.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dbz.a $$5 = new dbz.a($$0, $$1);
      a($$5);
      qn.n($$5);
      qn.f($$5);
      qn.j($$5);
      qn.s($$5);
      qn.V($$5);
      qn.aa($$5);
      qn.ad($$5);
      if ($$2) {
         qn.o($$5);
      } else {
         qn.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static dby g(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.a($$2);
      qn.c($$2);
      dbz.a $$3 = new dbz.a($$0, $$1);
      a($$3);
      $$3.a(dwr.b.j, sk.X);
      qn.N($$3);
      qn.f($$3);
      qn.j($$3);
      qn.V($$3);
      qn.O($$3);
      qn.ac($$3);
      qn.ad($$3);
      avf $$4 = avg.a(avi.qi);
      return new dby.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dce.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dce.b.b).a(dbw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dby h(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.a($$2);
      qn.c($$2);
      $$2.a(bst.a, new dck.c(bsc.aP, 1, 1, 1));
      $$2.a(bst.a, new dck.c(bsc.l, 50, 4, 4));
      $$2.a(bst.b, new dck.c(bsc.R, 10, 2, 5));
      dbz.a $$3 = new dbz.a($$0, $$1);
      qn.al($$3);
      a($$3);
      qn.f($$3);
      qn.k($$3);
      qn.P($$3);
      qn.ac($$3);
      qn.aj($$3);
      $$3.a(dwr.b.j, sc.e);
      avf $$4 = avg.a(avi.qh);
      return new dby.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dce.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dce.b.c).a(dbw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dby i(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.c($$2);
      $$2.a(bst.a, new dck.c(bsc.aP, 1, 1, 1));
      $$2.a(bst.a, new dck.c(bsc.l, 50, 4, 4));
      $$2.a(bst.b, new dck.c(bsc.R, 10, 2, 5));
      $$2.a(bst.g, new dck.c(bsc.bg, 25, 8, 8));
      dbz.a $$3 = new dbz.a($$0, $$1);
      qn.al($$3);
      a($$3);
      qn.f($$3);
      qn.l($$3);
      qn.Q($$3);
      $$3.a(dwr.b.j, sc.e);
      avf $$4 = avg.a(avi.qh);
      return new dby.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dce.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dce.b.c).a(dbw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dby i(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dck.a $$3 = new dck.a().a(bst.f, new dck.c(bsc.aX, 2, 1, 4)).a(bst.g, new dck.c(bsc.aI, 5, 1, 5));
      qn.c($$3);
      $$3.a(bst.a, new dck.c(bsc.B, $$2 ? 1 : 100, 1, 1));
      dbz.a $$4 = new dbz.a($$0, $$1);
      a($$4);
      qn.f($$4);
      qn.j($$4);
      qn.u($$4);
      qn.V($$4);
      qn.Z($$4);
      qn.ac($$4);
      qn.ad($$4);
      if (!$$2) {
         $$4.a(dwr.b.j, sc.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static dby b(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2, boolean $$3) {
      dck.a $$4 = new dck.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bst.b, new dck.c(bsc.bh, 5, 2, 5));
      }

      qn.c($$4);
      dbz.a $$6 = new dbz.a($$0, $$1);
      a($$6);
      qn.f($$6);
      qn.j($$6);
      qn.V($$6);
      qn.Z($$6);
      qn.ac($$6);
      qn.ad($$6);
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

   public static dby j(iy<egp> $$0, iy<dyy<?>> $$1) {
      dbz.a $$2 = new dbz.a($$0, $$1);
      $$2.a(dwr.b.k, sf.n);
      return a(false, 0.5F, 0.5F, new dck.a(), $$2, d);
   }

   public static dby j(iy<egp> $$0, iy<dyy<?>> $$1, boolean $$2) {
      dbz.a $$3 = new dbz.a($$0, $$1);
      dck.a $$4 = new dck.a();
      $$4.a(bst.b, new dck.c($$2 ? bsc.az : bsc.z, 1, 1, 2)).a(bst.b, new dck.c(bsc.aG, 2, 2, 6)).a(bst.b, new dck.c(bsc.aJ, 2, 2, 4));
      qn.c($$4);
      a($$3);
      qn.ab($$3);
      qn.f($$3);
      qn.j($$3);
      if ($$2) {
         qn.W($$3);
      } else {
         qn.X($$3);
      }

      qn.h($$3);
      qn.i($$3);
      avf $$5 = avg.a($$2 ? avi.ql : avi.qk);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dby k(iy<egp> $$0, iy<dyy<?>> $$1) {
      dbz.a $$2 = new dbz.a($$0, $$1);
      dck.a $$3 = new dck.a();
      $$3.a(bst.b, new dck.c(bsc.X, 5, 1, 3));
      qn.c($$3);
      a($$2);
      qn.aq($$2);
      qn.f($$2);
      qn.j($$2);
      qn.h($$2);
      qn.i($$2);
      avf $$4 = avg.a(avi.qn);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dby l(iy<egp> $$0, iy<dyy<?>> $$1) {
      dbz.a $$2 = new dbz.a($$0, $$1);
      dck.a $$3 = new dck.a();
      $$3.a(bst.b, new dck.c(bsc.X, 5, 1, 3));
      qn.c($$3);
      a($$2);
      qn.aq($$2);
      qn.f($$2);
      qn.j($$2);
      qn.h($$2);
      qn.i($$2);
      avf $$4 = avg.a(avi.qf);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dby m(iy<egp> $$0, iy<dyy<?>> $$1) {
      dbz.a $$2 = new dbz.a($$0, $$1);
      dck.a $$3 = new dck.a();
      qn.c($$3);
      a($$2);
      qn.f($$2);
      qn.j($$2);
      qn.h($$2);
      qn.i($$2);
      avf $$4 = avg.a(avi.qq);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dby n(iy<egp> $$0, iy<dyy<?>> $$1) {
      dbz.a $$2 = new dbz.a($$0, $$1);
      dck.a $$3 = new dck.a();
      $$3.a(bst.b, new dck.c(bsc.aG, 4, 2, 3)).a(bst.b, new dck.c(bsc.X, 5, 1, 3));
      qn.c($$3);
      a($$2);
      qn.aq($$2);
      qn.f($$2);
      qn.j($$2);
      qn.ad($$2);
      qn.h($$2);
      qn.i($$2);
      avf $$4 = avg.a(avi.qo);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dby o(iy<egp> $$0, iy<dyy<?>> $$1) {
      dbz.a $$2 = new dbz.a($$0, $$1);
      dck.a $$3 = new dck.a();
      $$3.a(bst.b, new dck.c(bsc.bs, 1, 1, 1)).a(bst.b, new dck.c(bsc.aG, 8, 2, 3)).a(bst.b, new dck.c(bsc.Q, 4, 2, 4));
      qn.c($$3);
      a($$2);
      qn.aq($$2);
      qn.f($$2);
      qn.j($$2);
      qn.t($$2);
      qn.ad($$2);
      qn.h($$2);
      qn.i($$2);
      avf $$4 = avg.a(avi.qe);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dby p(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      $$2.a(bst.d, new dck.c(bsc.f, 10, 4, 6));
      $$2.a(bst.g, new dck.c(bsc.bg, 25, 8, 8));
      qn.c($$2);
      dbz.a $$3 = new dbz.a($$0, $$1);
      a($$3);
      qn.ab($$3);
      qn.f($$3);
      qn.B($$3);
      qn.j($$3);
      qn.A($$3);
      avf $$4 = avg.a(avi.qg);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dby q(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      qn.g($$2);
      dbz.a $$3 = new dbz.a($$0, $$1);
      a($$3);
      qn.ab($$3);
      qn.a($$3, true);
      qn.j($$3);
      qn.S($$3);
      qn.ac($$3);
      qn.ad($$3);
      qn.d($$3);
      avf $$4 = avg.a(avi.qd);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dby r(iy<egp> $$0, iy<dyy<?>> $$1) {
      dck.a $$2 = new dck.a();
      dbz.a $$3 = new dbz.a($$0, $$1);
      $$3.a(dwr.a.a, qp.a);
      $$3.a(dwr.a.a, qp.b);
      $$3.a(dwr.a.a, qp.c);
      qn.aw($$3);
      qn.b($$3);
      qn.c($$3);
      qn.at($$3);
      qn.ab($$3);
      qn.f($$3);
      qn.j($$3);
      qn.S($$3);
      qn.ac($$3);
      qn.ad($$3);
      qn.e($$3);
      avf $$4 = avg.a(avi.qc);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
