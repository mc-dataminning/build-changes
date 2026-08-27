import javax.annotation.Nullable;

public class rl {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final auz d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = axz.a($$1, -1.0F, 1.0F);
      return axz.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dbc a(boolean $$0, float $$1, float $$2, dbo.a $$3, dbd.a $$4, @Nullable auz $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dbc a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dbo.a $$7, dbd.a $$8, @Nullable auz $$9
   ) {
      dbi.a $$10 = new dbi.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dba.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dbc.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dbd.a $$0) {
      qk.a($$0);
      qk.aw($$0);
      qk.b($$0);
      qk.c($$0);
      qk.ap($$0);
      qk.at($$0);
   }

   public static dbc a(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a();
      qk.a($$3);
      $$3.a(bsd.b, new dbo.c(brn.br, 8, 4, 4));
      $$3.a(bsd.b, new dbo.c(brn.aF, 4, 2, 3));
      $$3.a(bsd.b, new dbo.c(brn.Q, 8, 2, 4));
      if ($$2) {
         qk.c($$3);
      } else {
         qk.b($$3);
         qk.a($$3, 100, 25, 100, false);
      }

      dbd.a $$4 = new dbd.a($$0, $$1);
      a($$4);
      qk.m($$4);
      qk.n($$4);
      qk.f($$4);
      qk.j($$4);
      $$4.a(dvv.b.j, $$2 ? sh.ar : sh.as);
      qk.V($$4);
      qk.U($$4);
      qk.ac($$4);
      qk.ad($$4);
      qk.p($$4);
      auz $$5 = ava.a(avc.pZ);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dbc a(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.i($$2);
      $$2.a(bsd.b, new dbo.c(brn.br, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, ava.a(avc.qm));
   }

   public static dbc b(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.i($$2);
      $$2.a(bsd.b, new dbo.c(brn.aw, 40, 1, 2)).a(bsd.a, new dbo.c(brn.at, 2, 1, 3)).a(bsd.b, new dbo.c(brn.av, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, ava.a(avc.ql));
   }

   public static dbc c(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.i($$2);
      $$2.a(bsd.b, new dbo.c(brn.aw, 40, 1, 2)).a(bsd.b, new dbo.c(brn.av, 80, 1, 2)).a(bsd.a, new dbo.c(brn.at, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, ava.a(avc.qn));
   }

   private static dbc a(ix<eft> $$0, ix<dyc<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dbo.a $$6, auz $$7) {
      dbd.a $$8 = new dbd.a($$0, $$1);
      a($$8);
      qk.f($$8);
      qk.j($$8);
      if ($$3) {
         qk.r($$8);
      } else {
         if ($$5) {
            qk.q($$8);
         }

         if ($$4) {
            qk.F($$8);
         } else {
            qk.E($$8);
         }
      }

      qk.Y($$8);
      qk.I($$8);
      qk.ac($$8);
      qk.ad($$8);
      qk.ah($$8);
      if ($$4) {
         qk.ag($$8);
      } else {
         qk.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dbc b(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a();
      qk.a($$3);
      $$3.a(bsd.b, new dbo.c(brn.am, 5, 4, 6));
      qk.c($$3);
      dbd.a $$4 = new dbd.a($$0, $$1);
      a($$4);
      qk.f($$4);
      qk.j($$4);
      if ($$2) {
         qk.D($$4);
      } else {
         qk.C($$4);
      }

      qk.V($$4);
      qk.Z($$4);
      qk.ac($$4);
      qk.ad($$4);
      qk.h($$4);
      qk.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static dbc d(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.f($$2);
      dbd.a $$3 = new dbd.a($$0, $$1);
      qk.al($$3);
      a($$3);
      qk.f($$3);
      qk.j($$3);
      qk.V($$3);
      qk.Z($$3);
      qk.T($$3);
      qk.ac($$3);
      qk.ai($$3);
      qk.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, ava.a(avc.qj));
   }

   public static dbc a(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dbo.a $$5 = new dbo.a();
      dbd.a $$6 = new dbd.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qk.e($$5);
         if ($$4) {
            $$6.a(dvv.b.e, sc.a);
            $$6.a(dvv.b.e, sc.b);
         }
      } else {
         qk.d($$5);
         qk.ab($$6);
         if ($$2) {
            $$6.a(dvv.b.j, sh.d);
         }
      }

      qk.f($$6);
      qk.j($$6);
      if ($$3) {
         qk.H($$6);
         qk.V($$6);
         qk.Z($$6);
      } else {
         qk.S($$6);
      }

      qk.ac($$6);
      if ($$2) {
         $$6.a(dvv.b.j, sh.E);
         $$6.a(dvv.b.j, sh.e);
      } else {
         qk.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static dbc e(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.h($$2);
      dbd.a $$3 = new dbd.a($$0, $$1);
      a($$3);
      qk.f($$3);
      qk.j($$3);
      qk.R($$3);
      qk.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static dbc a(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2, boolean $$3) {
      dbd.a $$4 = new dbd.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qk.J($$4);
      }

      qk.f($$4);
      qk.j($$4);
      if ($$2) {
         qk.z($$4);
         qk.V($$4);
         qk.K($$4);
      } else {
         qk.y($$4);
         qk.Y($$4);
         qk.L($$4);
      }

      qk.ac($$4);
      qk.ad($$4);
      dbo.a $$5 = new dbo.a();
      qk.a($$5);
      $$5.a(bsd.b, new dbo.c(brn.ab, 1, 2, 6)).a(bsd.b, new dbo.c(brn.z, 1, 1, 1)).a(bsd.b, new dbo.c(brn.c, 10, 2, 3));
      qk.c($$5);
      if ($$3) {
         $$5.a(bsd.b, new dbo.c(brn.am, 8, 4, 4));
         $$5.a(bsd.b, new dbo.c(brn.br, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static dbc c(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a();
      qk.c($$3);
      $$3.a(bsd.b, new dbo.c(brn.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bsd.b, new dbo.c(brn.br, 2, 4, 8));
         $$3.a(0.04F);
      }

      dbd.a $$4 = new dbd.a($$0, $$1);
      a($$4);
      qk.f($$4);
      qk.g($$4);
      qk.j($$4);
      if ($$2) {
         qk.G($$4);
      }

      qk.M($$4);
      qk.ac($$4);
      qk.ae($$4);
      return new dbc.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dbi.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dba.b).a(ava.a(avc.qk)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dbc a(dbo.a $$0, int $$1, int $$2, dbd.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static dbd.a s(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbd.a $$2 = new dbd.a($$0, $$1);
      a($$2);
      qk.f($$2);
      qk.j($$2);
      qk.u($$2);
      qk.V($$2);
      qk.Z($$2);
      qk.ac($$2);
      qk.ad($$2);
      return $$2;
   }

   public static dbc d(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a();
      qk.a($$3, 3, 4, 15);
      $$3.a(bsd.g, new dbo.c(brn.aH, 15, 1, 5));
      dbd.a $$4 = s($$0, $$1);
      $$4.a(dvv.b.j, $$2 ? rz.h : rz.c);
      qk.an($$4);
      qk.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dbc e(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a();
      qk.a($$3, 1, 4, 10);
      $$3.a(bsd.f, new dbo.c(brn.y, 1, 1, 2));
      dbd.a $$4 = s($$0, $$1);
      $$4.a(dvv.b.j, $$2 ? rz.g : rz.b);
      qk.an($$4);
      qk.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dbc f(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a();
      if ($$2) {
         qk.a($$3, 8, 4, 8);
      } else {
         qk.a($$3, 10, 2, 15);
      }

      $$3.a(bsd.g, new dbo.c(brn.aE, 5, 1, 3)).a(bsd.g, new dbo.c(brn.bf, 25, 8, 8)).a(bsd.f, new dbo.c(brn.y, 2, 1, 2));
      dbd.a $$4 = s($$0, $$1);
      $$4.a(dvv.b.j, $$2 ? rz.f : rz.a);
      if ($$2) {
         qk.an($$4);
      }

      qk.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dbc f(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a().a(bsd.g, new dbo.c(brn.aE, 15, 1, 3));
      qk.a($$2, 10, 4);
      dbd.a $$3 = s($$0, $$1).a(dvv.b.j, rz.m).a(dvv.b.j, rz.a).a(dvv.b.j, rz.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dbc g(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a().a(bsd.f, new dbo.c(brn.aW, 1, 1, 4)).a(bsd.g, new dbo.c(brn.aH, 15, 1, 5)).a(bsd.b, new dbo.c(brn.aC, 1, 1, 2));
      qk.c($$3);
      $$3.a(bsd.a, new dbo.c(brn.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dbd.a $$5 = new dbd.a($$0, $$1);
      qk.ar($$5);
      a($$5);
      qk.as($$5);
      qk.f($$5);
      qk.j($$5);
      qk.u($$5);
      qk.V($$5);
      qk.Z($$5);
      qk.ac($$5);
      qk.ad($$5);
      return new dbc.a().a(true).a($$4).a(dbc.d.b).b(0.5F).a(new dbi.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dba.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static dbc b(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dbd.a $$5 = new dbd.a($$0, $$1);
      a($$5);
      auz $$6;
      if ($$4) {
         $$6 = ava.a(avc.qi);
         $$5.a(dvv.b.j, sh.Y);
      } else {
         $$6 = ava.a(avc.pY);
         qk.N($$5);
      }

      qk.f($$5);
      qk.j($$5);
      if ($$4) {
         $$5.a(dvv.b.j, sh.aa);
         $$5.a(dvv.b.j, sh.R);
         qk.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               qk.x($$5);
            } else {
               qk.v($$5);
            }
         } else {
            qk.w($$5);
         }

         qk.V($$5);
         qk.O($$5);
      }

      qk.ac($$5);
      qk.ad($$5);
      dbo.a $$8 = new dbo.a();
      qk.a($$8);
      qk.c($$8);
      if ($$4) {
         $$8.a(bsd.b, new dbo.c(brn.aF, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bsd.b, new dbo.c(brn.br, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dbc h(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a();
      qk.a($$3);
      $$3.a(bsd.b, new dbo.c(brn.br, 8, 4, 4)).a(bsd.b, new dbo.c(brn.aF, 4, 2, 3)).a(bsd.b, new dbo.c(brn.Q, 8, 2, 4));
      qk.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dbd.a $$5 = new dbd.a($$0, $$1);
      a($$5);
      qk.n($$5);
      qk.f($$5);
      qk.j($$5);
      qk.s($$5);
      qk.V($$5);
      qk.aa($$5);
      qk.ad($$5);
      if ($$2) {
         qk.o($$5);
      } else {
         qk.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static dbc g(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.a($$2);
      qk.c($$2);
      dbd.a $$3 = new dbd.a($$0, $$1);
      a($$3);
      $$3.a(dvv.b.j, sh.X);
      qk.N($$3);
      qk.f($$3);
      qk.j($$3);
      qk.V($$3);
      qk.O($$3);
      qk.ac($$3);
      qk.ad($$3);
      auz $$4 = ava.a(avc.pY);
      return new dbc.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dbi.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dbi.b.b).a(dba.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dbc h(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.a($$2);
      qk.c($$2);
      $$2.a(bsd.a, new dbo.c(brn.aO, 1, 1, 1));
      $$2.a(bsd.a, new dbo.c(brn.l, 50, 4, 4));
      $$2.a(bsd.b, new dbo.c(brn.R, 10, 2, 5));
      dbd.a $$3 = new dbd.a($$0, $$1);
      qk.al($$3);
      a($$3);
      qk.f($$3);
      qk.k($$3);
      qk.P($$3);
      qk.ac($$3);
      qk.aj($$3);
      $$3.a(dvv.b.j, rz.e);
      auz $$4 = ava.a(avc.pX);
      return new dbc.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dbi.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dbi.b.c).a(dba.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dbc i(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.c($$2);
      $$2.a(bsd.a, new dbo.c(brn.aO, 1, 1, 1));
      $$2.a(bsd.a, new dbo.c(brn.l, 50, 4, 4));
      $$2.a(bsd.b, new dbo.c(brn.R, 10, 2, 5));
      $$2.a(bsd.g, new dbo.c(brn.bf, 25, 8, 8));
      dbd.a $$3 = new dbd.a($$0, $$1);
      qk.al($$3);
      a($$3);
      qk.f($$3);
      qk.l($$3);
      qk.Q($$3);
      $$3.a(dvv.b.j, rz.e);
      auz $$4 = ava.a(avc.pX);
      return new dbc.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dbi.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dbi.b.c).a(dba.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dbc i(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbo.a $$3 = new dbo.a().a(bsd.f, new dbo.c(brn.aW, 2, 1, 4)).a(bsd.g, new dbo.c(brn.aH, 5, 1, 5));
      qk.c($$3);
      $$3.a(bsd.a, new dbo.c(brn.B, $$2 ? 1 : 100, 1, 1));
      dbd.a $$4 = new dbd.a($$0, $$1);
      a($$4);
      qk.f($$4);
      qk.j($$4);
      qk.u($$4);
      qk.V($$4);
      qk.Z($$4);
      qk.ac($$4);
      qk.ad($$4);
      if (!$$2) {
         $$4.a(dvv.b.j, rz.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static dbc b(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2, boolean $$3) {
      dbo.a $$4 = new dbo.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bsd.b, new dbo.c(brn.bg, 5, 2, 5));
      }

      qk.c($$4);
      dbd.a $$6 = new dbd.a($$0, $$1);
      a($$6);
      qk.f($$6);
      qk.j($$6);
      qk.V($$6);
      qk.Z($$6);
      qk.ac($$6);
      qk.ad($$6);
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

   public static dbc j(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbd.a $$2 = new dbd.a($$0, $$1);
      $$2.a(dvv.b.k, sc.n);
      return a(false, 0.5F, 0.5F, new dbo.a(), $$2, d);
   }

   public static dbc j(ix<eft> $$0, ix<dyc<?>> $$1, boolean $$2) {
      dbd.a $$3 = new dbd.a($$0, $$1);
      dbo.a $$4 = new dbo.a();
      $$4.a(bsd.b, new dbo.c($$2 ? brn.ay : brn.z, 1, 1, 2)).a(bsd.b, new dbo.c(brn.aF, 2, 2, 6)).a(bsd.b, new dbo.c(brn.aI, 2, 2, 4));
      qk.c($$4);
      a($$3);
      qk.ab($$3);
      qk.f($$3);
      qk.j($$3);
      if ($$2) {
         qk.W($$3);
      } else {
         qk.X($$3);
      }

      qk.h($$3);
      qk.i($$3);
      auz $$5 = ava.a($$2 ? avc.qb : avc.qa);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dbc k(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbd.a $$2 = new dbd.a($$0, $$1);
      dbo.a $$3 = new dbo.a();
      $$3.a(bsd.b, new dbo.c(brn.X, 5, 1, 3));
      qk.c($$3);
      a($$2);
      qk.aq($$2);
      qk.f($$2);
      qk.j($$2);
      qk.h($$2);
      qk.i($$2);
      auz $$4 = ava.a(avc.qd);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dbc l(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbd.a $$2 = new dbd.a($$0, $$1);
      dbo.a $$3 = new dbo.a();
      $$3.a(bsd.b, new dbo.c(brn.X, 5, 1, 3));
      qk.c($$3);
      a($$2);
      qk.aq($$2);
      qk.f($$2);
      qk.j($$2);
      qk.h($$2);
      qk.i($$2);
      auz $$4 = ava.a(avc.pV);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dbc m(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbd.a $$2 = new dbd.a($$0, $$1);
      dbo.a $$3 = new dbo.a();
      qk.c($$3);
      a($$2);
      qk.f($$2);
      qk.j($$2);
      qk.h($$2);
      qk.i($$2);
      auz $$4 = ava.a(avc.qg);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dbc n(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbd.a $$2 = new dbd.a($$0, $$1);
      dbo.a $$3 = new dbo.a();
      $$3.a(bsd.b, new dbo.c(brn.aF, 4, 2, 3)).a(bsd.b, new dbo.c(brn.X, 5, 1, 3));
      qk.c($$3);
      a($$2);
      qk.aq($$2);
      qk.f($$2);
      qk.j($$2);
      qk.ad($$2);
      qk.h($$2);
      qk.i($$2);
      auz $$4 = ava.a(avc.qe);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dbc o(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbd.a $$2 = new dbd.a($$0, $$1);
      dbo.a $$3 = new dbo.a();
      $$3.a(bsd.b, new dbo.c(brn.br, 1, 1, 1)).a(bsd.b, new dbo.c(brn.aF, 8, 2, 3)).a(bsd.b, new dbo.c(brn.Q, 4, 2, 4));
      qk.c($$3);
      a($$2);
      qk.aq($$2);
      qk.f($$2);
      qk.j($$2);
      qk.t($$2);
      qk.ad($$2);
      qk.h($$2);
      qk.i($$2);
      auz $$4 = ava.a(avc.pU);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dbc p(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      $$2.a(bsd.d, new dbo.c(brn.f, 10, 4, 6));
      $$2.a(bsd.g, new dbo.c(brn.bf, 25, 8, 8));
      qk.c($$2);
      dbd.a $$3 = new dbd.a($$0, $$1);
      a($$3);
      qk.ab($$3);
      qk.f($$3);
      qk.B($$3);
      qk.j($$3);
      qk.A($$3);
      auz $$4 = ava.a(avc.pW);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dbc q(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      qk.g($$2);
      dbd.a $$3 = new dbd.a($$0, $$1);
      a($$3);
      qk.ab($$3);
      qk.a($$3, true);
      qk.j($$3);
      qk.S($$3);
      qk.ac($$3);
      qk.ad($$3);
      qk.d($$3);
      auz $$4 = ava.a(avc.pT);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dbc r(ix<eft> $$0, ix<dyc<?>> $$1) {
      dbo.a $$2 = new dbo.a();
      dbd.a $$3 = new dbd.a($$0, $$1);
      $$3.a(dvv.a.a, qm.a);
      $$3.a(dvv.a.a, qm.b);
      $$3.a(dvv.a.a, qm.c);
      qk.aw($$3);
      qk.b($$3);
      qk.c($$3);
      qk.at($$3);
      qk.ab($$3);
      qk.f($$3);
      qk.j($$3);
      qk.S($$3);
      qk.ac($$3);
      qk.ad($$3);
      qk.e($$3);
      auz $$4 = ava.a(avc.pS);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
