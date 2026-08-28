import java.util.function.Consumer;
import javax.annotation.Nullable;

public class sc {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final avx d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = ayz.a($$1, -1.0F, 1.0F);
      return ayz.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dcx a(boolean $$0, float $$1, float $$2, ddj.a $$3, dcy.a $$4, @Nullable avx $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dcx a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, ddj.a $$7, dcy.a $$8, @Nullable avx $$9
   ) {
      ddd.a $$10 = new ddd.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dcv.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dcx.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dcy.a $$0) {
      rb.a($$0);
      rb.aw($$0);
      rb.b($$0);
      rb.c($$0);
      rb.ap($$0);
      rb.at($$0);
   }

   public static dcx a(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a();
      rb.a($$3);
      $$3.a(bts.b, new ddj.c(bta.bs, 8, 4, 4));
      $$3.a(bts.b, new ddj.c(bta.aG, 4, 2, 3));
      $$3.a(bts.b, new ddj.c(bta.Q, 8, 2, 4));
      if ($$2) {
         rb.c($$3);
      } else {
         rb.b($$3);
         rb.a($$3, 100, 25, 100, false);
      }

      dcy.a $$4 = new dcy.a($$0, $$1);
      a($$4);
      rb.m($$4);
      rb.n($$4);
      rb.f($$4);
      rb.j($$4);
      $$4.a(dxq.b.j, $$2 ? sz.ar : sz.as);
      rb.V($$4);
      rb.U($$4);
      rb.ac($$4);
      rb.ad($$4);
      rb.p($$4);
      avx $$5 = avy.a(awa.qj);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dcx a(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      rb.i($$2);
      $$2.a(bts.b, new ddj.c(bta.bs, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, avy.a(awa.qw));
   }

   public static dcx b(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      rb.i($$2);
      $$2.a(bts.b, new ddj.c(bta.ax, 40, 1, 2)).a(bts.a, new ddj.c(bta.au, 2, 1, 3)).a(bts.b, new ddj.c(bta.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, avy.a(awa.qv));
   }

   public static dcx c(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      rb.i($$2);
      $$2.a(bts.b, new ddj.c(bta.ax, 40, 1, 2)).a(bts.b, new ddj.c(bta.aw, 80, 1, 2)).a(bts.a, new ddj.c(bta.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, avy.a(awa.qx));
   }

   private static dcx a(jj<eho> $$0, jj<dzx<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, ddj.a $$6, avx $$7) {
      dcy.a $$8 = new dcy.a($$0, $$1);
      a($$8);
      rb.f($$8);
      rb.j($$8);
      if ($$3) {
         rb.r($$8);
      } else {
         if ($$5) {
            rb.q($$8);
         }

         if ($$4) {
            rb.F($$8);
         } else {
            rb.E($$8);
         }
      }

      rb.Y($$8);
      rb.I($$8);
      rb.ac($$8);
      rb.ad($$8);
      rb.ah($$8);
      if ($$4) {
         rb.ag($$8);
      } else {
         rb.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dcx b(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a();
      rb.a($$3);
      $$3.a(bts.b, new ddj.c(bta.an, 5, 4, 6));
      rb.c($$3);
      dcy.a $$4 = new dcy.a($$0, $$1);
      a($$4);
      rb.f($$4);
      rb.j($$4);
      if ($$2) {
         rb.D($$4);
      } else {
         rb.C($$4);
      }

      rb.V($$4);
      rb.Z($$4);
      rb.ac($$4);
      rb.ad($$4);
      rb.h($$4);
      rb.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static dcx d(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      rb.f($$2);
      dcy.a $$3 = new dcy.a($$0, $$1);
      rb.al($$3);
      a($$3);
      rb.f($$3);
      rb.j($$3);
      rb.V($$3);
      rb.Z($$3);
      rb.T($$3);
      rb.ac($$3);
      rb.ai($$3);
      rb.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, avy.a(awa.qt));
   }

   public static dcx a(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      ddj.a $$5 = new ddj.a();
      dcy.a $$6 = new dcy.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         rb.e($$5);
         if ($$4) {
            $$6.a(dxq.b.e, su.a);
            $$6.a(dxq.b.e, su.b);
         }
      } else {
         rb.d($$5);
         rb.ab($$6);
         if ($$2) {
            $$6.a(dxq.b.j, sz.d);
         }
      }

      rb.f($$6);
      rb.j($$6);
      if ($$3) {
         rb.H($$6);
         rb.V($$6);
         rb.Z($$6);
      } else {
         rb.S($$6);
      }

      rb.ac($$6);
      if ($$2) {
         $$6.a(dxq.b.j, sz.E);
         $$6.a(dxq.b.j, sz.e);
      } else {
         rb.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static dcx e(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      rb.h($$2);
      dcy.a $$3 = new dcy.a($$0, $$1);
      a($$3);
      rb.f($$3);
      rb.j($$3);
      rb.R($$3);
      rb.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static dcx a(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2, boolean $$3) {
      dcy.a $$4 = new dcy.a($$0, $$1);
      a($$4);
      if (!$$2) {
         rb.J($$4);
      }

      rb.f($$4);
      rb.j($$4);
      if ($$2) {
         rb.z($$4);
         rb.V($$4);
         rb.K($$4);
      } else {
         rb.y($$4);
         rb.Y($$4);
         rb.L($$4);
      }

      rb.ac($$4);
      rb.ad($$4);
      ddj.a $$5 = new ddj.a();
      rb.a($$5);
      $$5.a(bts.b, new ddj.c(bta.ab, 1, 2, 6)).a(bts.b, new ddj.c(bta.z, 1, 1, 1)).a(bts.b, new ddj.c(bta.c, 10, 2, 3));
      rb.c($$5);
      if ($$3) {
         $$5.a(bts.b, new ddj.c(bta.an, 8, 4, 4));
         $$5.a(bts.b, new ddj.c(bta.bs, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static dcx c(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a();
      rb.c($$3);
      $$3.a(bts.b, new ddj.c(bta.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(bts.b, new ddj.c(bta.bs, 2, 4, 8));
         $$3.a(0.04F);
      }

      dcy.a $$4 = new dcy.a($$0, $$1);
      a($$4);
      rb.f($$4);
      rb.g($$4);
      rb.j($$4);
      if ($$2) {
         rb.G($$4);
      }

      rb.M($$4);
      rb.ac($$4);
      rb.ae($$4);
      return new dcx.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new ddd.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dcv.b).a(avy.a(awa.qu)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dcx a(ddj.a $$0, int $$1, int $$2, dcy.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static dcy.a q(jj<eho> $$0, jj<dzx<?>> $$1) {
      dcy.a $$2 = new dcy.a($$0, $$1);
      a($$2);
      rb.f($$2);
      rb.j($$2);
      rb.u($$2);
      rb.V($$2);
      rb.Z($$2);
      rb.ac($$2);
      rb.ad($$2);
      return $$2;
   }

   public static dcx d(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a();
      rb.a($$3, 3, 4, 15);
      $$3.a(bts.g, new ddj.c(bta.aI, 15, 1, 5));
      dcy.a $$4 = q($$0, $$1);
      $$4.a(dxq.b.j, $$2 ? sr.h : sr.c);
      rb.an($$4);
      rb.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dcx e(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a();
      rb.a($$3, 1, 4, 10);
      $$3.a(bts.f, new ddj.c(bta.y, 1, 1, 2));
      dcy.a $$4 = q($$0, $$1);
      $$4.a(dxq.b.j, $$2 ? sr.g : sr.b);
      rb.an($$4);
      rb.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dcx f(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a();
      if ($$2) {
         rb.a($$3, 8, 4, 8);
      } else {
         rb.a($$3, 10, 2, 15);
      }

      $$3.a(bts.g, new ddj.c(bta.aF, 5, 1, 3)).a(bts.g, new ddj.c(bta.bg, 25, 8, 8)).a(bts.f, new ddj.c(bta.y, 2, 1, 2));
      dcy.a $$4 = q($$0, $$1);
      $$4.a(dxq.b.j, $$2 ? sr.f : sr.a);
      if ($$2) {
         rb.an($$4);
      }

      rb.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dcx f(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a().a(bts.g, new ddj.c(bta.aF, 15, 1, 3));
      rb.a($$2, 10, 4);
      dcy.a $$3 = q($$0, $$1).a(dxq.b.j, sr.m).a(dxq.b.j, sr.a).a(dxq.b.j, sr.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dcx g(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a().a(bts.f, new ddj.c(bta.aX, 1, 1, 4)).a(bts.g, new ddj.c(bta.aI, 15, 1, 5)).a(bts.b, new ddj.c(bta.aD, 1, 1, 2));
      rb.c($$3);
      $$3.a(bts.a, new ddj.c(bta.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dcy.a $$5 = new dcy.a($$0, $$1);
      rb.ar($$5);
      a($$5);
      rb.as($$5);
      rb.f($$5);
      rb.j($$5);
      rb.u($$5);
      rb.V($$5);
      rb.Z($$5);
      rb.ac($$5);
      rb.ad($$5);
      return new dcx.a().a(true).a($$4).a(dcx.d.b).b(0.5F).a(new ddd.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dcv.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static dcx b(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dcy.a $$5 = new dcy.a($$0, $$1);
      a($$5);
      avx $$6;
      if ($$4) {
         $$6 = avy.a(awa.qs);
         $$5.a(dxq.b.j, sz.Y);
      } else {
         $$6 = avy.a(awa.qi);
         rb.N($$5);
      }

      rb.f($$5);
      rb.j($$5);
      if ($$4) {
         $$5.a(dxq.b.j, sz.aa);
         $$5.a(dxq.b.j, sz.R);
         rb.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               rb.x($$5);
            } else {
               rb.v($$5);
            }
         } else {
            rb.w($$5);
         }

         rb.V($$5);
         rb.O($$5);
      }

      rb.ac($$5);
      rb.ad($$5);
      ddj.a $$8 = new ddj.a();
      rb.a($$8);
      rb.c($$8);
      if ($$4) {
         $$8.a(bts.b, new ddj.c(bta.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bts.b, new ddj.c(bta.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dcx h(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a();
      rb.a($$3);
      $$3.a(bts.b, new ddj.c(bta.bs, 8, 4, 4)).a(bts.b, new ddj.c(bta.aG, 4, 2, 3)).a(bts.b, new ddj.c(bta.Q, 8, 2, 4));
      rb.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dcy.a $$5 = new dcy.a($$0, $$1);
      a($$5);
      rb.n($$5);
      rb.f($$5);
      rb.j($$5);
      rb.s($$5);
      rb.V($$5);
      rb.aa($$5);
      rb.ad($$5);
      if ($$2) {
         rb.o($$5);
      } else {
         rb.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static dcx g(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      rb.a($$2);
      rb.c($$2);
      dcy.a $$3 = new dcy.a($$0, $$1);
      a($$3);
      $$3.a(dxq.b.j, sz.X);
      rb.N($$3);
      rb.f($$3);
      rb.j($$3);
      rb.V($$3);
      rb.O($$3);
      rb.ac($$3);
      rb.ad($$3);
      avx $$4 = avy.a(awa.qi);
      return new dcx.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new ddd.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(ddd.b.b).a(dcv.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dcx a(jj<eho> $$0, jj<dzx<?>> $$1, Consumer<ddj.a> $$2) {
      ddj.a $$3 = new ddj.a();
      rb.a($$3);
      rb.c($$3);
      $$3.a(bts.a, new ddj.c(bta.aP, 1, 1, 1));
      $$3.a(bts.b, new ddj.c(bta.R, 10, 2, 5));
      $$2.accept($$3);
      dcy.a $$4 = new dcy.a($$0, $$1);
      rb.al($$4);
      a($$4);
      rb.f($$4);
      rb.k($$4);
      rb.P($$4);
      rb.ac($$4);
      rb.aj($$4);
      $$4.a(dxq.b.j, sr.e);
      avx $$5 = avy.a(awa.qh);
      return new dcx.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new ddd.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(ddd.b.c).a(dcv.b).a($$5).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   public static dcx b(jj<eho> $$0, jj<dzx<?>> $$1, Consumer<ddj.a> $$2) {
      ddj.a $$3 = new ddj.a();
      rb.c($$3);
      $$3.a(bts.a, new ddj.c(bta.aP, 1, 1, 1));
      $$3.a(bts.b, new ddj.c(bta.R, 10, 2, 5));
      $$3.a(bts.g, new ddj.c(bta.bg, 25, 8, 8));
      $$2.accept($$3);
      dcy.a $$4 = new dcy.a($$0, $$1);
      rb.al($$4);
      a($$4);
      rb.f($$4);
      rb.l($$4);
      rb.Q($$4);
      $$4.a(dxq.b.j, sr.e);
      avx $$5 = avy.a(awa.qh);
      return new dcx.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new ddd.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(ddd.b.c).a(dcv.b).a($$5).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   public static dcx i(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      ddj.a $$3 = new ddj.a().a(bts.f, new ddj.c(bta.aX, 2, 1, 4)).a(bts.g, new ddj.c(bta.aI, 5, 1, 5));
      rb.c($$3);
      $$3.a(bts.a, new ddj.c(bta.B, $$2 ? 1 : 100, 1, 1));
      dcy.a $$4 = new dcy.a($$0, $$1);
      a($$4);
      rb.f($$4);
      rb.j($$4);
      rb.u($$4);
      rb.V($$4);
      rb.Z($$4);
      rb.ac($$4);
      rb.ad($$4);
      if (!$$2) {
         $$4.a(dxq.b.j, sr.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static dcx b(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2, boolean $$3) {
      ddj.a $$4 = new ddj.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bts.b, new ddj.c(bta.bh, 5, 2, 5));
      }

      rb.c($$4);
      dcy.a $$6 = new dcy.a($$0, $$1);
      a($$6);
      rb.f($$6);
      rb.j($$6);
      rb.V($$6);
      rb.Z($$6);
      rb.ac($$6);
      rb.ad($$6);
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

   public static dcx h(jj<eho> $$0, jj<dzx<?>> $$1) {
      dcy.a $$2 = new dcy.a($$0, $$1);
      $$2.a(dxq.b.k, su.n);
      return a(false, 0.5F, 0.5F, new ddj.a(), $$2, d);
   }

   public static dcx j(jj<eho> $$0, jj<dzx<?>> $$1, boolean $$2) {
      dcy.a $$3 = new dcy.a($$0, $$1);
      ddj.a $$4 = new ddj.a();
      $$4.a(bts.b, new ddj.c($$2 ? bta.az : bta.z, 1, 1, 2)).a(bts.b, new ddj.c(bta.aG, 2, 2, 6)).a(bts.b, new ddj.c(bta.aJ, 2, 2, 4));
      rb.c($$4);
      a($$3);
      rb.ab($$3);
      rb.f($$3);
      rb.j($$3);
      if ($$2) {
         rb.W($$3);
      } else {
         rb.X($$3);
      }

      rb.h($$3);
      rb.i($$3);
      avx $$5 = avy.a($$2 ? awa.ql : awa.qk);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dcx i(jj<eho> $$0, jj<dzx<?>> $$1) {
      dcy.a $$2 = new dcy.a($$0, $$1);
      ddj.a $$3 = new ddj.a();
      $$3.a(bts.b, new ddj.c(bta.X, 5, 1, 3));
      rb.c($$3);
      a($$2);
      rb.aq($$2);
      rb.f($$2);
      rb.j($$2);
      rb.h($$2);
      rb.i($$2);
      avx $$4 = avy.a(awa.qn);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dcx j(jj<eho> $$0, jj<dzx<?>> $$1) {
      dcy.a $$2 = new dcy.a($$0, $$1);
      ddj.a $$3 = new ddj.a();
      $$3.a(bts.b, new ddj.c(bta.X, 5, 1, 3));
      rb.c($$3);
      a($$2);
      rb.aq($$2);
      rb.f($$2);
      rb.j($$2);
      rb.h($$2);
      rb.i($$2);
      avx $$4 = avy.a(awa.qf);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dcx k(jj<eho> $$0, jj<dzx<?>> $$1) {
      dcy.a $$2 = new dcy.a($$0, $$1);
      ddj.a $$3 = new ddj.a();
      rb.c($$3);
      a($$2);
      rb.f($$2);
      rb.j($$2);
      rb.h($$2);
      rb.i($$2);
      avx $$4 = avy.a(awa.qq);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dcx l(jj<eho> $$0, jj<dzx<?>> $$1) {
      dcy.a $$2 = new dcy.a($$0, $$1);
      ddj.a $$3 = new ddj.a();
      $$3.a(bts.b, new ddj.c(bta.aG, 4, 2, 3)).a(bts.b, new ddj.c(bta.X, 5, 1, 3));
      rb.c($$3);
      a($$2);
      rb.aq($$2);
      rb.f($$2);
      rb.j($$2);
      rb.ad($$2);
      rb.h($$2);
      rb.i($$2);
      avx $$4 = avy.a(awa.qo);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dcx m(jj<eho> $$0, jj<dzx<?>> $$1) {
      dcy.a $$2 = new dcy.a($$0, $$1);
      ddj.a $$3 = new ddj.a();
      $$3.a(bts.b, new ddj.c(bta.bs, 1, 1, 1)).a(bts.b, new ddj.c(bta.aG, 8, 2, 3)).a(bts.b, new ddj.c(bta.Q, 4, 2, 4));
      rb.c($$3);
      a($$2);
      rb.aq($$2);
      rb.f($$2);
      rb.j($$2);
      rb.t($$2);
      rb.ad($$2);
      rb.h($$2);
      rb.i($$2);
      avx $$4 = avy.a(awa.qe);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dcx n(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      $$2.a(bts.d, new ddj.c(bta.f, 10, 4, 6));
      $$2.a(bts.g, new ddj.c(bta.bg, 25, 8, 8));
      rb.c($$2);
      dcy.a $$3 = new dcy.a($$0, $$1);
      a($$3);
      rb.ab($$3);
      rb.f($$3);
      rb.B($$3);
      rb.j($$3);
      rb.A($$3);
      avx $$4 = avy.a(awa.qg);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dcx o(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      rb.g($$2);
      dcy.a $$3 = new dcy.a($$0, $$1);
      a($$3);
      rb.ab($$3);
      rb.a($$3, true);
      rb.j($$3);
      rb.S($$3);
      rb.ac($$3);
      rb.ad($$3);
      rb.d($$3);
      avx $$4 = avy.a(awa.qd);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dcx p(jj<eho> $$0, jj<dzx<?>> $$1) {
      ddj.a $$2 = new ddj.a();
      dcy.a $$3 = new dcy.a($$0, $$1);
      $$3.a(dxq.a.a, rd.a);
      $$3.a(dxq.a.a, rd.b);
      $$3.a(dxq.a.a, rd.c);
      rb.aw($$3);
      rb.b($$3);
      rb.c($$3);
      rb.at($$3);
      rb.ab($$3);
      rb.f($$3);
      rb.j($$3);
      rb.S($$3);
      rb.ac($$3);
      rb.ad($$3);
      rb.e($$3);
      avx $$4 = avy.a(awa.qc);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
