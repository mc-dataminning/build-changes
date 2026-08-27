import javax.annotation.Nullable;

public class pq {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final aqo d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = atm.a($$1, -1.0F, 1.0F);
      return atm.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static csy a(boolean $$0, float $$1, float $$2, ctk.a $$3, csz.a $$4, @Nullable aqo $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static csy a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, ctk.a $$7, csz.a $$8, @Nullable aqo $$9
   ) {
      cte.a $$10 = new cte.a().b($$3).c($$4).a(12638463).d(a($$1)).a(csw.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new csy.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(csz.a $$0) {
      ou.a($$0);
      ou.aw($$0);
      ou.b($$0);
      ou.c($$0);
      ou.ap($$0);
      ou.at($$0);
   }

   public static csy a(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a();
      ou.a($$3);
      $$3.a(blj.b, new ctk.c(bku.bn, 8, 4, 4));
      $$3.a(blj.b, new ctk.c(bku.aC, 4, 2, 3));
      $$3.a(blj.b, new ctk.c(bku.N, 8, 2, 4));
      if ($$2) {
         ou.c($$3);
      } else {
         ou.b($$3);
         ou.a($$3, 100, 25, 100, false);
      }

      csz.a $$4 = new csz.a($$0, $$1);
      a($$4);
      ou.m($$4);
      ou.n($$4);
      ou.f($$4);
      ou.j($$4);
      $$4.a(dmn.b.j, $$2 ? qm.ar : qm.as);
      ou.V($$4);
      ou.U($$4);
      ou.ac($$4);
      ou.ad($$4);
      ou.p($$4);
      aqo $$5 = aqp.a(aqr.oX);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static csy a(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, aqp.a(aqr.pk));
   }

   public static csy b(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.i($$2);
      $$2.a(blj.b, new ctk.c(bku.at, 40, 1, 2)).a(blj.a, new ctk.c(bku.aq, 2, 1, 3)).a(blj.b, new ctk.c(bku.as, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, aqp.a(aqr.pj));
   }

   public static csy c(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.i($$2);
      $$2.a(blj.b, new ctk.c(bku.at, 40, 1, 2)).a(blj.b, new ctk.c(bku.as, 80, 1, 2)).a(blj.a, new ctk.c(bku.aq, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, aqp.a(aqr.pl));
   }

   private static csy a(ic<dwl> $$0, ic<dou<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, ctk.a $$6, aqo $$7) {
      csz.a $$8 = new csz.a($$0, $$1);
      a($$8);
      ou.f($$8);
      ou.j($$8);
      if ($$3) {
         ou.r($$8);
      } else {
         if ($$5) {
            ou.q($$8);
         }

         if ($$4) {
            ou.F($$8);
         } else {
            ou.E($$8);
         }
      }

      ou.Y($$8);
      ou.I($$8);
      ou.ac($$8);
      ou.ad($$8);
      ou.ah($$8);
      if ($$4) {
         ou.ag($$8);
      } else {
         ou.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static csy b(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a();
      ou.a($$3);
      $$3.a(blj.b, new ctk.c(bku.aj, 5, 4, 6));
      ou.c($$3);
      csz.a $$4 = new csz.a($$0, $$1);
      a($$4);
      ou.f($$4);
      ou.j($$4);
      if ($$2) {
         ou.D($$4);
      } else {
         ou.C($$4);
      }

      ou.V($$4);
      ou.Z($$4);
      ou.ac($$4);
      ou.ad($$4);
      ou.h($$4);
      ou.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static csy d(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.f($$2);
      csz.a $$3 = new csz.a($$0, $$1);
      ou.al($$3);
      a($$3);
      ou.f($$3);
      ou.j($$3);
      ou.V($$3);
      ou.Z($$3);
      ou.T($$3);
      ou.ac($$3);
      ou.ai($$3);
      ou.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, aqp.a(aqr.ph));
   }

   public static csy a(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      ctk.a $$5 = new ctk.a();
      csz.a $$6 = new csz.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         ou.e($$5);
         if ($$4) {
            $$6.a(dmn.b.e, qh.a);
            $$6.a(dmn.b.e, qh.b);
         }
      } else {
         ou.d($$5);
         ou.ab($$6);
         if ($$2) {
            $$6.a(dmn.b.j, qm.d);
         }
      }

      ou.f($$6);
      ou.j($$6);
      if ($$3) {
         ou.H($$6);
         ou.V($$6);
         ou.Z($$6);
      } else {
         ou.S($$6);
      }

      ou.ac($$6);
      if ($$2) {
         $$6.a(dmn.b.j, qm.E);
         $$6.a(dmn.b.j, qm.e);
      } else {
         ou.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static csy e(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.h($$2);
      csz.a $$3 = new csz.a($$0, $$1);
      a($$3);
      ou.f($$3);
      ou.j($$3);
      ou.R($$3);
      ou.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static csy a(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2, boolean $$3) {
      csz.a $$4 = new csz.a($$0, $$1);
      a($$4);
      if (!$$2) {
         ou.J($$4);
      }

      ou.f($$4);
      ou.j($$4);
      if ($$2) {
         ou.z($$4);
         ou.V($$4);
         ou.K($$4);
      } else {
         ou.y($$4);
         ou.Y($$4);
         ou.L($$4);
      }

      ou.ac($$4);
      ou.ad($$4);
      ctk.a $$5 = new ctk.a();
      ou.a($$5);
      $$5.a(blj.b, new ctk.c(bku.Y, 1, 2, 6)).a(blj.b, new ctk.c(bku.w, 1, 1, 1));
      ou.c($$5);
      if ($$3) {
         $$5.a(blj.b, new ctk.c(bku.aj, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static csy c(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a();
      ou.c($$3);
      csz.a $$4 = new csz.a($$0, $$1);
      a($$4);
      ou.f($$4);
      ou.g($$4);
      ou.j($$4);
      if ($$2) {
         ou.G($$4);
      }

      ou.M($$4);
      ou.ac($$4);
      ou.ae($$4);
      return new csy.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new cte.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(csw.b).a(aqp.a(aqr.pi)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static csy a(ctk.a $$0, int $$1, int $$2, csz.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static csz.a s(ic<dwl> $$0, ic<dou<?>> $$1) {
      csz.a $$2 = new csz.a($$0, $$1);
      a($$2);
      ou.f($$2);
      ou.j($$2);
      ou.u($$2);
      ou.V($$2);
      ou.Z($$2);
      ou.ac($$2);
      ou.ad($$2);
      return $$2;
   }

   public static csy d(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a();
      ou.a($$3, 3, 4, 15);
      $$3.a(blj.g, new ctk.c(bku.aE, 15, 1, 5));
      csz.a $$4 = s($$0, $$1);
      $$4.a(dmn.b.j, $$2 ? qe.h : qe.c);
      ou.an($$4);
      ou.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static csy e(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a();
      ou.a($$3, 1, 4, 10);
      $$3.a(blj.f, new ctk.c(bku.v, 1, 1, 2));
      csz.a $$4 = s($$0, $$1);
      $$4.a(dmn.b.j, $$2 ? qe.g : qe.b);
      ou.an($$4);
      ou.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static csy f(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a();
      if ($$2) {
         ou.a($$3, 8, 4, 8);
      } else {
         ou.a($$3, 10, 2, 15);
      }

      $$3.a(blj.g, new ctk.c(bku.aB, 5, 1, 3)).a(blj.g, new ctk.c(bku.bc, 25, 8, 8)).a(blj.f, new ctk.c(bku.v, 2, 1, 2));
      csz.a $$4 = s($$0, $$1);
      $$4.a(dmn.b.j, $$2 ? qe.f : qe.a);
      if ($$2) {
         ou.an($$4);
      }

      ou.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static csy f(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a().a(blj.g, new ctk.c(bku.aB, 15, 1, 3));
      ou.a($$2, 10, 4);
      csz.a $$3 = s($$0, $$1).a(dmn.b.j, qe.m).a(dmn.b.j, qe.a).a(dmn.b.j, qe.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static csy g(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a().a(blj.f, new ctk.c(bku.aT, 1, 1, 4)).a(blj.g, new ctk.c(bku.aE, 15, 1, 5)).a(blj.b, new ctk.c(bku.az, 1, 1, 2));
      ou.c($$3);
      $$3.a(blj.a, new ctk.c(bku.y, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      csz.a $$5 = new csz.a($$0, $$1);
      ou.ar($$5);
      a($$5);
      ou.as($$5);
      ou.f($$5);
      ou.j($$5);
      ou.u($$5);
      ou.V($$5);
      ou.Z($$5);
      ou.ac($$5);
      ou.ad($$5);
      return new csy.a().a(true).a($$4).a(csy.d.b).b(0.5F).a(new cte.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(csw.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static csy b(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      csz.a $$5 = new csz.a($$0, $$1);
      a($$5);
      aqo $$6;
      if ($$4) {
         $$6 = aqp.a(aqr.pg);
         $$5.a(dmn.b.j, qm.Y);
      } else {
         $$6 = aqp.a(aqr.oW);
         ou.N($$5);
      }

      ou.f($$5);
      ou.j($$5);
      if ($$4) {
         $$5.a(dmn.b.j, qm.aa);
         $$5.a(dmn.b.j, qm.R);
         ou.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               ou.x($$5);
            } else {
               ou.v($$5);
            }
         } else {
            ou.w($$5);
         }

         ou.V($$5);
         ou.O($$5);
      }

      ou.ac($$5);
      ou.ad($$5);
      ctk.a $$8 = new ctk.a();
      ou.a($$8);
      ou.c($$8);
      if ($$4) {
         $$8.a(blj.b, new ctk.c(bku.aC, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(blj.b, new ctk.c(bku.bn, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static csy h(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a();
      ou.a($$3);
      $$3.a(blj.b, new ctk.c(bku.bn, 8, 4, 4)).a(blj.b, new ctk.c(bku.aC, 4, 2, 3)).a(blj.b, new ctk.c(bku.N, 8, 2, 4));
      ou.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      csz.a $$5 = new csz.a($$0, $$1);
      a($$5);
      ou.n($$5);
      ou.f($$5);
      ou.j($$5);
      ou.s($$5);
      ou.V($$5);
      ou.aa($$5);
      ou.ad($$5);
      if ($$2) {
         ou.o($$5);
      } else {
         ou.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static csy g(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.a($$2);
      ou.c($$2);
      csz.a $$3 = new csz.a($$0, $$1);
      a($$3);
      $$3.a(dmn.b.j, qm.X);
      ou.N($$3);
      ou.f($$3);
      ou.j($$3);
      ou.V($$3);
      ou.O($$3);
      ou.ac($$3);
      ou.ad($$3);
      aqo $$4 = aqp.a(aqr.oW);
      return new csy.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new cte.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(cte.b.b).a(csw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static csy h(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.a($$2);
      ou.c($$2);
      $$2.a(blj.a, new ctk.c(bku.aL, 1, 1, 1));
      $$2.a(blj.b, new ctk.c(bku.O, 10, 2, 5));
      csz.a $$3 = new csz.a($$0, $$1);
      ou.al($$3);
      a($$3);
      ou.f($$3);
      ou.k($$3);
      ou.P($$3);
      ou.ac($$3);
      ou.aj($$3);
      $$3.a(dmn.b.j, qe.e);
      aqo $$4 = aqp.a(aqr.oV);
      return new csy.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cte.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(cte.b.c).a(csw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static csy i(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.c($$2);
      $$2.a(blj.a, new ctk.c(bku.aL, 1, 1, 1));
      $$2.a(blj.b, new ctk.c(bku.O, 10, 2, 5));
      $$2.a(blj.g, new ctk.c(bku.bc, 25, 8, 8));
      csz.a $$3 = new csz.a($$0, $$1);
      ou.al($$3);
      a($$3);
      ou.f($$3);
      ou.l($$3);
      ou.Q($$3);
      $$3.a(dmn.b.j, qe.e);
      aqo $$4 = aqp.a(aqr.oV);
      return new csy.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cte.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(cte.b.c).a(csw.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static csy i(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      ctk.a $$3 = new ctk.a().a(blj.f, new ctk.c(bku.aT, 2, 1, 4)).a(blj.g, new ctk.c(bku.aE, 5, 1, 5));
      ou.c($$3);
      $$3.a(blj.a, new ctk.c(bku.y, $$2 ? 1 : 100, 1, 1));
      csz.a $$4 = new csz.a($$0, $$1);
      a($$4);
      ou.f($$4);
      ou.j($$4);
      ou.u($$4);
      ou.V($$4);
      ou.Z($$4);
      ou.ac($$4);
      ou.ad($$4);
      if (!$$2) {
         $$4.a(dmn.b.j, qe.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static csy b(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2, boolean $$3) {
      ctk.a $$4 = new ctk.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(blj.b, new ctk.c(bku.bd, 5, 2, 5));
      }

      ou.c($$4);
      csz.a $$6 = new csz.a($$0, $$1);
      a($$6);
      ou.f($$6);
      ou.j($$6);
      ou.V($$6);
      ou.Z($$6);
      ou.ac($$6);
      ou.ad($$6);
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

   public static csy j(ic<dwl> $$0, ic<dou<?>> $$1) {
      csz.a $$2 = new csz.a($$0, $$1);
      $$2.a(dmn.b.k, qh.n);
      return a(false, 0.5F, 0.5F, new ctk.a(), $$2, d);
   }

   public static csy j(ic<dwl> $$0, ic<dou<?>> $$1, boolean $$2) {
      csz.a $$3 = new csz.a($$0, $$1);
      ctk.a $$4 = new ctk.a();
      $$4.a(blj.b, new ctk.c($$2 ? bku.av : bku.w, 1, 1, 2)).a(blj.b, new ctk.c(bku.aC, 2, 2, 6)).a(blj.b, new ctk.c(bku.aF, 2, 2, 4));
      ou.c($$4);
      a($$3);
      ou.ab($$3);
      ou.f($$3);
      ou.j($$3);
      if ($$2) {
         ou.W($$3);
      } else {
         ou.X($$3);
      }

      ou.h($$3);
      ou.i($$3);
      aqo $$5 = aqp.a($$2 ? aqr.oZ : aqr.oY);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static csy k(ic<dwl> $$0, ic<dou<?>> $$1) {
      csz.a $$2 = new csz.a($$0, $$1);
      ctk.a $$3 = new ctk.a();
      $$3.a(blj.b, new ctk.c(bku.U, 5, 1, 3));
      ou.c($$3);
      a($$2);
      ou.aq($$2);
      ou.f($$2);
      ou.j($$2);
      ou.h($$2);
      ou.i($$2);
      aqo $$4 = aqp.a(aqr.pb);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static csy l(ic<dwl> $$0, ic<dou<?>> $$1) {
      csz.a $$2 = new csz.a($$0, $$1);
      ctk.a $$3 = new ctk.a();
      $$3.a(blj.b, new ctk.c(bku.U, 5, 1, 3));
      ou.c($$3);
      a($$2);
      ou.aq($$2);
      ou.f($$2);
      ou.j($$2);
      ou.h($$2);
      ou.i($$2);
      aqo $$4 = aqp.a(aqr.oT);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static csy m(ic<dwl> $$0, ic<dou<?>> $$1) {
      csz.a $$2 = new csz.a($$0, $$1);
      ctk.a $$3 = new ctk.a();
      ou.c($$3);
      a($$2);
      ou.f($$2);
      ou.j($$2);
      ou.h($$2);
      ou.i($$2);
      aqo $$4 = aqp.a(aqr.pe);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static csy n(ic<dwl> $$0, ic<dou<?>> $$1) {
      csz.a $$2 = new csz.a($$0, $$1);
      ctk.a $$3 = new ctk.a();
      $$3.a(blj.b, new ctk.c(bku.aC, 4, 2, 3)).a(blj.b, new ctk.c(bku.U, 5, 1, 3));
      ou.c($$3);
      a($$2);
      ou.aq($$2);
      ou.f($$2);
      ou.j($$2);
      ou.ad($$2);
      ou.h($$2);
      ou.i($$2);
      aqo $$4 = aqp.a(aqr.pc);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static csy o(ic<dwl> $$0, ic<dou<?>> $$1) {
      csz.a $$2 = new csz.a($$0, $$1);
      ctk.a $$3 = new ctk.a();
      ou.a($$3);
      $$3.a(blj.b, new ctk.c(bku.bn, 8, 4, 4)).a(blj.b, new ctk.c(bku.aC, 4, 2, 3)).a(blj.b, new ctk.c(bku.N, 8, 2, 4));
      ou.c($$3);
      a($$2);
      ou.aq($$2);
      ou.f($$2);
      ou.j($$2);
      ou.t($$2);
      ou.ad($$2);
      ou.h($$2);
      ou.i($$2);
      aqo $$4 = aqp.a(aqr.oS);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static csy p(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      $$2.a(blj.d, new ctk.c(bku.f, 10, 4, 6));
      $$2.a(blj.g, new ctk.c(bku.bc, 25, 8, 8));
      ou.c($$2);
      csz.a $$3 = new csz.a($$0, $$1);
      a($$3);
      ou.ab($$3);
      ou.f($$3);
      ou.B($$3);
      ou.j($$3);
      ou.A($$3);
      aqo $$4 = aqp.a(aqr.oU);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static csy q(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      ou.g($$2);
      csz.a $$3 = new csz.a($$0, $$1);
      a($$3);
      ou.ab($$3);
      ou.a($$3, true);
      ou.j($$3);
      ou.S($$3);
      ou.ac($$3);
      ou.ad($$3);
      ou.d($$3);
      aqo $$4 = aqp.a(aqr.oR);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static csy r(ic<dwl> $$0, ic<dou<?>> $$1) {
      ctk.a $$2 = new ctk.a();
      csz.a $$3 = new csz.a($$0, $$1);
      $$3.a(dmn.a.a, ow.a);
      $$3.a(dmn.a.a, ow.b);
      $$3.a(dmn.a.a, ow.c);
      ou.aw($$3);
      ou.b($$3);
      ou.c($$3);
      ou.at($$3);
      ou.ab($$3);
      ou.f($$3);
      ou.j($$3);
      ou.S($$3);
      ou.ac($$3);
      ou.ad($$3);
      ou.e($$3);
      aqo $$4 = aqp.a(aqr.oQ);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
