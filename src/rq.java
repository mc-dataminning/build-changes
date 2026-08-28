import javax.annotation.Nullable;

public class rq {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   @Nullable
   private static final awd e = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = azf.a($$1, -1.0F, 1.0F);
      return azf.g(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dfk a(boolean $$0, float $$1, float $$2, dfw.a $$3, dfl.a $$4, @Nullable awd $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dfk a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dfw.a $$7, dfl.a $$8, @Nullable awd $$9
   ) {
      dfq.a $$10 = new dfq.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dfi.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dfk.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dfl.a $$0) {
      qt.a($$0);
      qt.av($$0);
      qt.b($$0);
      qt.c($$0);
      qt.ao($$0);
      qt.as($$0);
   }

   public static dfk a(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a();
      qt.a($$3);
      $$3.a(buq.b, new dfw.c(bty.bs, 8, 4, 4));
      $$3.a(buq.b, new dfw.c(bty.aG, 4, 2, 3));
      $$3.a(buq.b, new dfw.c(bty.Q, 8, 2, 4));
      if ($$2) {
         qt.c($$3);
      } else {
         qt.b($$3);
         qt.a($$3, 100, 25, 100, false);
      }

      dfl.a $$4 = new dfl.a($$0, $$1);
      a($$4);
      qt.m($$4);
      qt.n($$4);
      qt.f($$4);
      qt.j($$4);
      $$4.a(eak.a.j, $$2 ? sm.ar : sm.as);
      qt.V($$4);
      qt.U($$4);
      qt.ac($$4);
      qt.ad($$4);
      qt.p($$4);
      awd $$5 = awe.a(awg.qn);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dfk a(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.i($$2);
      $$2.a(buq.b, new dfw.c(bty.bs, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, awe.a(awg.qA));
   }

   public static dfk b(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.i($$2);
      $$2.a(buq.b, new dfw.c(bty.ax, 40, 1, 2)).a(buq.a, new dfw.c(bty.au, 2, 1, 3)).a(buq.b, new dfw.c(bty.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, awe.a(awg.qz));
   }

   public static dfk c(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.i($$2);
      $$2.a(buq.b, new dfw.c(bty.ax, 40, 1, 2)).a(buq.b, new dfw.c(bty.aw, 80, 1, 2)).a(buq.a, new dfw.c(bty.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, awe.a(awg.qB));
   }

   private static dfk a(jp<ekk> $$0, jp<ecs<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dfw.a $$6, awd $$7) {
      dfl.a $$8 = new dfl.a($$0, $$1);
      a($$8);
      qt.f($$8);
      qt.j($$8);
      if ($$3) {
         qt.r($$8);
      } else {
         if ($$5) {
            qt.q($$8);
         }

         if ($$4) {
            qt.F($$8);
         } else {
            qt.E($$8);
         }
      }

      qt.Y($$8);
      qt.I($$8);
      qt.ac($$8);
      qt.ad($$8);
      qt.ah($$8);
      if ($$4) {
         qt.ag($$8);
      } else {
         qt.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dfk b(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a();
      qt.a($$3);
      $$3.a(buq.b, new dfw.c(bty.an, 5, 4, 6));
      qt.c($$3);
      dfl.a $$4 = new dfl.a($$0, $$1);
      a($$4);
      qt.f($$4);
      qt.j($$4);
      if ($$2) {
         qt.D($$4);
      } else {
         qt.C($$4);
      }

      qt.V($$4);
      qt.Z($$4);
      qt.ac($$4);
      qt.ad($$4);
      qt.h($$4);
      qt.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, e);
   }

   public static dfk d(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.f($$2);
      dfl.a $$3 = new dfl.a($$0, $$1);
      qt.al($$3);
      a($$3);
      qt.f($$3);
      qt.j($$3);
      qt.V($$3);
      qt.Z($$3);
      qt.T($$3);
      qt.ac($$3);
      qt.ai($$3);
      qt.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, awe.a(awg.qx));
   }

   public static dfk a(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dfw.a $$5 = new dfw.a();
      dfl.a $$6 = new dfl.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qt.e($$5);
         if ($$4) {
            $$6.a(eak.a.e, sh.a);
            $$6.a(eak.a.e, sh.b);
         }
      } else {
         qt.d($$5);
         qt.ab($$6);
         if ($$2) {
            $$6.a(eak.a.j, sm.d);
         }
      }

      qt.f($$6);
      qt.j($$6);
      if ($$3) {
         qt.H($$6);
         qt.V($$6);
         qt.Z($$6);
      } else {
         qt.S($$6);
      }

      qt.ac($$6);
      if ($$2) {
         $$6.a(eak.a.j, sm.E);
         $$6.a(eak.a.j, sm.e);
      } else {
         qt.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, e);
   }

   public static dfk e(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.h($$2);
      dfl.a $$3 = new dfl.a($$0, $$1);
      a($$3);
      qt.f($$3);
      qt.j($$3);
      qt.R($$3);
      qt.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, e);
   }

   public static dfk a(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2, boolean $$3) {
      dfl.a $$4 = new dfl.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qt.J($$4);
      }

      qt.f($$4);
      qt.j($$4);
      if ($$2) {
         qt.z($$4);
         qt.V($$4);
         qt.K($$4);
      } else {
         qt.y($$4);
         qt.Y($$4);
         qt.L($$4);
      }

      qt.ac($$4);
      qt.ad($$4);
      dfw.a $$5 = new dfw.a();
      qt.a($$5);
      $$5.a(buq.b, new dfw.c(bty.ab, 1, 2, 6)).a(buq.b, new dfw.c(bty.z, 1, 1, 1)).a(buq.b, new dfw.c(bty.c, 10, 2, 3));
      qt.c($$5);
      if ($$3) {
         $$5.a(buq.b, new dfw.c(bty.an, 8, 4, 4));
         $$5.a(buq.b, new dfw.c(bty.bs, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, e);
   }

   public static dfk c(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a();
      qt.c($$3);
      $$3.a(buq.b, new dfw.c(bty.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(buq.b, new dfw.c(bty.bs, 2, 4, 8));
         $$3.a(0.04F);
      }

      dfl.a $$4 = new dfl.a($$0, $$1);
      a($$4);
      qt.f($$4);
      qt.g($$4);
      qt.j($$4);
      if ($$2) {
         qt.G($$4);
      }

      qt.M($$4);
      qt.ac($$4);
      qt.ae($$4);
      return new dfk.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dfq.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dfi.b).a(awe.a(awg.qy)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dfk a(dfw.a $$0, int $$1, int $$2, dfl.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, e);
   }

   private static dfl.a s(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfl.a $$2 = new dfl.a($$0, $$1);
      a($$2);
      qt.f($$2);
      qt.j($$2);
      qt.u($$2);
      qt.V($$2);
      qt.Z($$2);
      qt.ac($$2);
      qt.ad($$2);
      return $$2;
   }

   public static dfk d(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a();
      qt.a($$3, 3, 4, 15);
      $$3.a(buq.g, new dfw.c(bty.aI, 15, 1, 5));
      dfl.a $$4 = s($$0, $$1);
      $$4.a(eak.a.j, $$2 ? se.h : se.c);
      qt.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dfk e(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a();
      qt.a($$3, 1, 4, 10);
      $$3.a(buq.f, new dfw.c(bty.y, 1, 1, 2));
      dfl.a $$4 = s($$0, $$1);
      $$4.a(eak.a.j, $$2 ? se.g : se.b);
      qt.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dfk f(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a();
      if ($$2) {
         qt.a($$3, 8, 4, 8);
      } else {
         qt.a($$3, 10, 2, 15);
      }

      $$3.a(buq.g, new dfw.c(bty.aF, 5, 1, 3)).a(buq.g, new dfw.c(bty.bg, 25, 8, 8)).a(buq.f, new dfw.c(bty.y, 2, 1, 2));
      dfl.a $$4 = s($$0, $$1);
      $$4.a(eak.a.j, $$2 ? se.f : se.a);
      qt.an($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dfk f(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a().a(buq.g, new dfw.c(bty.aF, 15, 1, 3));
      qt.a($$2, 10, 4);
      dfl.a $$3 = s($$0, $$1).a(eak.a.j, se.l).a(eak.a.j, se.a).a(eak.a.j, se.i);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dfk g(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a().a(buq.f, new dfw.c(bty.aX, 1, 1, 4)).a(buq.g, new dfw.c(bty.aI, 15, 1, 5)).a(buq.b, new dfw.c(bty.aD, 1, 1, 2));
      qt.c($$3);
      $$3.a(buq.a, new dfw.c(bty.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dfl.a $$5 = new dfl.a($$0, $$1);
      qt.aq($$5);
      a($$5);
      qt.ar($$5);
      qt.f($$5);
      qt.j($$5);
      qt.u($$5);
      qt.V($$5);
      qt.Z($$5);
      qt.ac($$5);
      qt.ad($$5);
      return new dfk.a().a(true).a($$4).a(dfk.d.b).b(0.5F).a(new dfq.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dfi.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static dfk b(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dfl.a $$5 = new dfl.a($$0, $$1);
      a($$5);
      awd $$6;
      if ($$4) {
         $$6 = awe.a(awg.qw);
         $$5.a(eak.a.j, sm.Y);
      } else {
         $$6 = awe.a(awg.qm);
         qt.N($$5);
      }

      qt.f($$5);
      qt.j($$5);
      if ($$4) {
         $$5.a(eak.a.j, sm.aa);
         $$5.a(eak.a.j, sm.R);
         qt.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               qt.x($$5);
            } else {
               qt.v($$5);
            }
         } else {
            qt.w($$5);
         }

         qt.V($$5);
         qt.O($$5);
      }

      qt.ac($$5);
      qt.ad($$5);
      dfw.a $$8 = new dfw.a();
      qt.a($$8);
      qt.c($$8);
      if ($$4) {
         $$8.a(buq.b, new dfw.c(bty.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(buq.b, new dfw.c(bty.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dfk h(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a();
      qt.a($$3);
      $$3.a(buq.b, new dfw.c(bty.bs, 8, 4, 4)).a(buq.b, new dfw.c(bty.aG, 4, 2, 3)).a(buq.b, new dfw.c(bty.Q, 8, 2, 4));
      qt.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dfl.a $$5 = new dfl.a($$0, $$1);
      a($$5);
      qt.n($$5);
      qt.f($$5);
      qt.j($$5);
      qt.s($$5);
      qt.V($$5);
      qt.aa($$5);
      qt.ad($$5);
      if ($$2) {
         qt.o($$5);
      } else {
         qt.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, e);
   }

   public static dfk g(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.a($$2);
      qt.c($$2);
      dfl.a $$3 = new dfl.a($$0, $$1);
      a($$3);
      $$3.a(eak.a.j, sm.X);
      qt.N($$3);
      qt.f($$3);
      qt.j($$3);
      qt.V($$3);
      qt.O($$3);
      qt.ac($$3);
      qt.ad($$3);
      awd $$4 = awe.a(awg.qm);
      return new dfk.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dfq.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dfq.b.b).a(dfi.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dfk h(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.a($$2);
      qt.a($$2, 70);
      $$2.a(buq.a, new dfw.c(bty.aP, 1, 1, 1));
      $$2.a(buq.a, new dfw.c(bty.l, 30, 4, 4));
      $$2.a(buq.b, new dfw.c(bty.R, 10, 2, 5));
      dfl.a $$3 = new dfl.a($$0, $$1);
      qt.al($$3);
      a($$3);
      qt.f($$3);
      qt.k($$3);
      qt.P($$3);
      qt.ac($$3);
      qt.aj($$3);
      $$3.a(eak.a.j, se.e);
      awd $$4 = awe.a(awg.ql);
      return new dfk.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dfq.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dfq.b.c).a(dfi.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dfk i(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.a($$2, 70);
      $$2.a(buq.a, new dfw.c(bty.aP, 1, 1, 1));
      $$2.a(buq.a, new dfw.c(bty.l, 30, 4, 4));
      $$2.a(buq.b, new dfw.c(bty.R, 10, 2, 5));
      $$2.a(buq.g, new dfw.c(bty.bg, 25, 8, 8));
      dfl.a $$3 = new dfl.a($$0, $$1);
      qt.al($$3);
      a($$3);
      qt.f($$3);
      qt.l($$3);
      qt.Q($$3);
      $$3.a(eak.a.j, se.e);
      awd $$4 = awe.a(awg.ql);
      return new dfk.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dfq.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dfq.b.c).a(dfi.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dfk i(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfw.a $$3 = new dfw.a().a(buq.f, new dfw.c(bty.aX, 2, 1, 4)).a(buq.g, new dfw.c(bty.aI, 5, 1, 5));
      qt.c($$3);
      $$3.a(buq.a, new dfw.c(bty.B, $$2 ? 1 : 100, 1, 1));
      dfl.a $$4 = new dfl.a($$0, $$1);
      a($$4);
      qt.f($$4);
      qt.j($$4);
      qt.u($$4);
      qt.V($$4);
      qt.Z($$4);
      qt.ac($$4);
      qt.ad($$4);
      if (!$$2) {
         $$4.a(eak.a.j, se.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, e);
   }

   public static dfk b(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2, boolean $$3) {
      dfw.a $$4 = new dfw.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(buq.b, new dfw.c(bty.bh, 5, 2, 5));
      }

      qt.c($$4);
      dfl.a $$6 = new dfl.a($$0, $$1);
      a($$6);
      qt.f($$6);
      qt.j($$6);
      qt.V($$6);
      qt.Z($$6);
      qt.ac($$6);
      qt.ad($$6);
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

   public static dfk j(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfl.a $$2 = new dfl.a($$0, $$1);
      $$2.a(eak.a.k, sh.n);
      return a(false, 0.5F, 0.5F, new dfw.a(), $$2, e);
   }

   public static dfk j(jp<ekk> $$0, jp<ecs<?>> $$1, boolean $$2) {
      dfl.a $$3 = new dfl.a($$0, $$1);
      dfw.a $$4 = new dfw.a();
      $$4.a(buq.b, new dfw.c($$2 ? bty.az : bty.z, 1, 1, 2)).a(buq.b, new dfw.c(bty.aG, 2, 2, 6)).a(buq.b, new dfw.c(bty.aJ, 2, 2, 4));
      qt.c($$4);
      a($$3);
      qt.ab($$3);
      qt.f($$3);
      qt.j($$3);
      if ($$2) {
         qt.W($$3);
      } else {
         qt.X($$3);
      }

      qt.h($$3);
      qt.i($$3);
      awd $$5 = awe.a($$2 ? awg.qp : awg.qo);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dfk k(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfl.a $$2 = new dfl.a($$0, $$1);
      dfw.a $$3 = new dfw.a();
      $$3.a(buq.b, new dfw.c(bty.X, 5, 1, 3));
      qt.c($$3);
      a($$2);
      qt.ap($$2);
      qt.f($$2);
      qt.j($$2);
      qt.h($$2);
      qt.i($$2);
      awd $$4 = awe.a(awg.qr);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dfk l(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfl.a $$2 = new dfl.a($$0, $$1);
      dfw.a $$3 = new dfw.a();
      $$3.a(buq.b, new dfw.c(bty.X, 5, 1, 3));
      qt.c($$3);
      a($$2);
      qt.ap($$2);
      qt.f($$2);
      qt.j($$2);
      qt.h($$2);
      qt.i($$2);
      awd $$4 = awe.a(awg.qj);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dfk m(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfl.a $$2 = new dfl.a($$0, $$1);
      dfw.a $$3 = new dfw.a();
      qt.c($$3);
      a($$2);
      qt.f($$2);
      qt.j($$2);
      qt.h($$2);
      qt.i($$2);
      awd $$4 = awe.a(awg.qu);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dfk n(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfl.a $$2 = new dfl.a($$0, $$1);
      dfw.a $$3 = new dfw.a();
      $$3.a(buq.b, new dfw.c(bty.aG, 4, 2, 3)).a(buq.b, new dfw.c(bty.X, 5, 1, 3));
      qt.c($$3);
      a($$2);
      qt.ap($$2);
      qt.f($$2);
      qt.j($$2);
      qt.ad($$2);
      qt.h($$2);
      qt.i($$2);
      awd $$4 = awe.a(awg.qs);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dfk o(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfl.a $$2 = new dfl.a($$0, $$1);
      dfw.a $$3 = new dfw.a();
      $$3.a(buq.b, new dfw.c(bty.bs, 1, 1, 1)).a(buq.b, new dfw.c(bty.aG, 8, 2, 3)).a(buq.b, new dfw.c(bty.Q, 4, 2, 4));
      qt.c($$3);
      a($$2);
      qt.ap($$2);
      qt.f($$2);
      qt.j($$2);
      qt.t($$2);
      qt.ad($$2);
      qt.h($$2);
      qt.i($$2);
      awd $$4 = awe.a(awg.qi);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dfk p(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      $$2.a(buq.d, new dfw.c(bty.f, 10, 4, 6));
      $$2.a(buq.g, new dfw.c(bty.bg, 25, 8, 8));
      qt.c($$2);
      dfl.a $$3 = new dfl.a($$0, $$1);
      a($$3);
      qt.ab($$3);
      qt.f($$3);
      qt.B($$3);
      qt.j($$3);
      qt.A($$3);
      awd $$4 = awe.a(awg.qk);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dfk q(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      qt.g($$2);
      dfl.a $$3 = new dfl.a($$0, $$1);
      a($$3);
      qt.ab($$3);
      qt.a($$3, true);
      qt.j($$3);
      qt.S($$3);
      qt.ac($$3);
      qt.ad($$3);
      qt.d($$3);
      awd $$4 = awe.a(awg.qh);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dfk r(jp<ekk> $$0, jp<ecs<?>> $$1) {
      dfw.a $$2 = new dfw.a();
      dfl.a $$3 = new dfl.a($$0, $$1);
      $$3.a(qv.a);
      $$3.a(qv.b);
      $$3.a(qv.c);
      qt.av($$3);
      qt.b($$3);
      qt.c($$3);
      qt.as($$3);
      qt.ab($$3);
      qt.f($$3);
      qt.j($$3);
      qt.S($$3);
      qt.ac($$3);
      qt.ad($$3);
      qt.e($$3);
      awd $$4 = awe.a(awg.qg);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
