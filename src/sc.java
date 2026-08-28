import javax.annotation.Nullable;

public class sc {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final avt d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = ayu.a($$1, -1.0F, 1.0F);
      return ayu.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dcs a(boolean $$0, float $$1, float $$2, dde.a $$3, dct.a $$4, @Nullable avt $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static dcs a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, dde.a $$7, dct.a $$8, @Nullable avt $$9
   ) {
      dcy.a $$10 = new dcy.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dcq.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new dcs.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(dct.a $$0) {
      rb.a($$0);
      rb.aw($$0);
      rb.b($$0);
      rb.c($$0);
      rb.ap($$0);
      rb.at($$0);
   }

   public static dcs a(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a();
      rb.a($$3);
      $$3.a(btn.b, new dde.c(bsv.bs, 8, 4, 4));
      $$3.a(btn.b, new dde.c(bsv.aG, 4, 2, 3));
      $$3.a(btn.b, new dde.c(bsv.Q, 8, 2, 4));
      if ($$2) {
         rb.c($$3);
      } else {
         rb.b($$3);
         rb.a($$3, 100, 25, 100, false);
      }

      dct.a $$4 = new dct.a($$0, $$1);
      a($$4);
      rb.m($$4);
      rb.n($$4);
      rb.f($$4);
      rb.j($$4);
      $$4.a(dxl.b.j, $$2 ? sy.ar : sy.as);
      rb.V($$4);
      rb.U($$4);
      rb.ac($$4);
      rb.ad($$4);
      rb.p($$4);
      avt $$5 = avu.a(avw.qj);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dcs a(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.i($$2);
      $$2.a(btn.b, new dde.c(bsv.bs, 8, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, avu.a(avw.qw));
   }

   public static dcs b(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.i($$2);
      $$2.a(btn.b, new dde.c(bsv.ax, 40, 1, 2)).a(btn.a, new dde.c(bsv.au, 2, 1, 3)).a(btn.b, new dde.c(bsv.aw, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, avu.a(avw.qv));
   }

   public static dcs c(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.i($$2);
      $$2.a(btn.b, new dde.c(bsv.ax, 40, 1, 2)).a(btn.b, new dde.c(bsv.aw, 80, 1, 2)).a(btn.a, new dde.c(bsv.au, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, avu.a(avw.qx));
   }

   private static dcs a(jj<ehj> $$0, jj<dzs<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, dde.a $$6, avt $$7) {
      dct.a $$8 = new dct.a($$0, $$1);
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

   public static dcs b(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a();
      rb.a($$3);
      $$3.a(btn.b, new dde.c(bsv.an, 5, 4, 6));
      rb.c($$3);
      dct.a $$4 = new dct.a($$0, $$1);
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

   public static dcs d(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.f($$2);
      dct.a $$3 = new dct.a($$0, $$1);
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
      return a(false, 2.0F, 0.0F, $$2, $$3, avu.a(avw.qt));
   }

   public static dcs a(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dde.a $$5 = new dde.a();
      dct.a $$6 = new dct.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         rb.e($$5);
         if ($$4) {
            $$6.a(dxl.b.e, st.a);
            $$6.a(dxl.b.e, st.b);
         }
      } else {
         rb.d($$5);
         rb.ab($$6);
         if ($$2) {
            $$6.a(dxl.b.j, sy.d);
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
         $$6.a(dxl.b.j, sy.E);
         $$6.a(dxl.b.j, sy.e);
      } else {
         rb.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static dcs e(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.h($$2);
      dct.a $$3 = new dct.a($$0, $$1);
      a($$3);
      rb.f($$3);
      rb.j($$3);
      rb.R($$3);
      rb.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static dcs a(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2, boolean $$3) {
      dct.a $$4 = new dct.a($$0, $$1);
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
      dde.a $$5 = new dde.a();
      rb.a($$5);
      $$5.a(btn.b, new dde.c(bsv.ab, 1, 2, 6)).a(btn.b, new dde.c(bsv.z, 1, 1, 1)).a(btn.b, new dde.c(bsv.c, 10, 2, 3));
      rb.c($$5);
      if ($$3) {
         $$5.a(btn.b, new dde.c(bsv.an, 8, 4, 4));
         $$5.a(btn.b, new dde.c(bsv.bs, 8, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static dcs c(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a();
      rb.c($$3);
      $$3.a(btn.b, new dde.c(bsv.c, 6, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(btn.b, new dde.c(bsv.bs, 2, 4, 8));
         $$3.a(0.04F);
      }

      dct.a $$4 = new dct.a($$0, $$1);
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
      return new dcs.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dcy.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(dcq.b).a(avu.a(avw.qu)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dcs a(dde.a $$0, int $$1, int $$2, dct.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static dct.a s(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dct.a $$2 = new dct.a($$0, $$1);
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

   public static dcs d(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a();
      rb.a($$3, 3, 4, 15);
      $$3.a(btn.g, new dde.c(bsv.aI, 15, 1, 5));
      dct.a $$4 = s($$0, $$1);
      $$4.a(dxl.b.j, $$2 ? sq.h : sq.c);
      rb.an($$4);
      rb.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dcs e(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a();
      rb.a($$3, 1, 4, 10);
      $$3.a(btn.f, new dde.c(bsv.y, 1, 1, 2));
      dct.a $$4 = s($$0, $$1);
      $$4.a(dxl.b.j, $$2 ? sq.g : sq.b);
      rb.an($$4);
      rb.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dcs f(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a();
      if ($$2) {
         rb.a($$3, 8, 4, 8);
      } else {
         rb.a($$3, 10, 2, 15);
      }

      $$3.a(btn.g, new dde.c(bsv.aF, 5, 1, 3)).a(btn.g, new dde.c(bsv.bg, 25, 8, 8)).a(btn.f, new dde.c(bsv.y, 2, 1, 2));
      dct.a $$4 = s($$0, $$1);
      $$4.a(dxl.b.j, $$2 ? sq.f : sq.a);
      if ($$2) {
         rb.an($$4);
      }

      rb.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dcs f(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a().a(btn.g, new dde.c(bsv.aF, 15, 1, 3));
      rb.a($$2, 10, 4);
      dct.a $$3 = s($$0, $$1).a(dxl.b.j, sq.m).a(dxl.b.j, sq.a).a(dxl.b.j, sq.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dcs g(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a().a(btn.f, new dde.c(bsv.aX, 1, 1, 4)).a(btn.g, new dde.c(bsv.aI, 15, 1, 5)).a(btn.b, new dde.c(bsv.aD, 1, 1, 2));
      rb.c($$3);
      $$3.a(btn.a, new dde.c(bsv.B, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dct.a $$5 = new dct.a($$0, $$1);
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
      return new dcs.a().a(true).a($$4).a(dcs.d.b).b(0.5F).a(new dcy.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dcq.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static dcs b(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dct.a $$5 = new dct.a($$0, $$1);
      a($$5);
      avt $$6;
      if ($$4) {
         $$6 = avu.a(avw.qs);
         $$5.a(dxl.b.j, sy.Y);
      } else {
         $$6 = avu.a(avw.qi);
         rb.N($$5);
      }

      rb.f($$5);
      rb.j($$5);
      if ($$4) {
         $$5.a(dxl.b.j, sy.aa);
         $$5.a(dxl.b.j, sy.R);
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
      dde.a $$8 = new dde.a();
      rb.a($$8);
      rb.c($$8);
      if ($$4) {
         $$8.a(btn.b, new dde.c(bsv.aG, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(btn.b, new dde.c(bsv.bs, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dcs h(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a();
      rb.a($$3);
      $$3.a(btn.b, new dde.c(bsv.bs, 8, 4, 4)).a(btn.b, new dde.c(bsv.aG, 4, 2, 3)).a(btn.b, new dde.c(bsv.Q, 8, 2, 4));
      rb.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dct.a $$5 = new dct.a($$0, $$1);
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

   public static dcs g(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.a($$2);
      rb.c($$2);
      dct.a $$3 = new dct.a($$0, $$1);
      a($$3);
      $$3.a(dxl.b.j, sy.X);
      rb.N($$3);
      rb.f($$3);
      rb.j($$3);
      rb.V($$3);
      rb.O($$3);
      rb.ac($$3);
      rb.ad($$3);
      avt $$4 = avu.a(avw.qi);
      return new dcs.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new dcy.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(dcy.b.b).a(dcq.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dcs h(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.a($$2);
      rb.c($$2);
      $$2.a(btn.a, new dde.c(bsv.aP, 1, 1, 1));
      $$2.a(btn.a, new dde.c(bsv.l, 50, 4, 4));
      $$2.a(btn.b, new dde.c(bsv.R, 10, 2, 5));
      dct.a $$3 = new dct.a($$0, $$1);
      rb.al($$3);
      a($$3);
      rb.f($$3);
      rb.k($$3);
      rb.P($$3);
      rb.ac($$3);
      rb.aj($$3);
      $$3.a(dxl.b.j, sq.e);
      avt $$4 = avu.a(avw.qh);
      return new dcs.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dcy.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(dcy.b.c).a(dcq.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dcs i(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.c($$2);
      $$2.a(btn.a, new dde.c(bsv.aP, 1, 1, 1));
      $$2.a(btn.a, new dde.c(bsv.l, 50, 4, 4));
      $$2.a(btn.b, new dde.c(bsv.R, 10, 2, 5));
      $$2.a(btn.g, new dde.c(bsv.bg, 25, 8, 8));
      dct.a $$3 = new dct.a($$0, $$1);
      rb.al($$3);
      a($$3);
      rb.f($$3);
      rb.l($$3);
      rb.Q($$3);
      $$3.a(dxl.b.j, sq.e);
      avt $$4 = avu.a(avw.qh);
      return new dcs.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dcy.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(dcy.b.c).a(dcq.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dcs i(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dde.a $$3 = new dde.a().a(btn.f, new dde.c(bsv.aX, 2, 1, 4)).a(btn.g, new dde.c(bsv.aI, 5, 1, 5));
      rb.c($$3);
      $$3.a(btn.a, new dde.c(bsv.B, $$2 ? 1 : 100, 1, 1));
      dct.a $$4 = new dct.a($$0, $$1);
      a($$4);
      rb.f($$4);
      rb.j($$4);
      rb.u($$4);
      rb.V($$4);
      rb.Z($$4);
      rb.ac($$4);
      rb.ad($$4);
      if (!$$2) {
         $$4.a(dxl.b.j, sq.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static dcs b(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2, boolean $$3) {
      dde.a $$4 = new dde.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(btn.b, new dde.c(bsv.bh, 5, 2, 5));
      }

      rb.c($$4);
      dct.a $$6 = new dct.a($$0, $$1);
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

   public static dcs j(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dct.a $$2 = new dct.a($$0, $$1);
      $$2.a(dxl.b.k, st.n);
      return a(false, 0.5F, 0.5F, new dde.a(), $$2, d);
   }

   public static dcs j(jj<ehj> $$0, jj<dzs<?>> $$1, boolean $$2) {
      dct.a $$3 = new dct.a($$0, $$1);
      dde.a $$4 = new dde.a();
      $$4.a(btn.b, new dde.c($$2 ? bsv.az : bsv.z, 1, 1, 2)).a(btn.b, new dde.c(bsv.aG, 2, 2, 6)).a(btn.b, new dde.c(bsv.aJ, 2, 2, 4));
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
      avt $$5 = avu.a($$2 ? avw.ql : avw.qk);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static dcs k(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dct.a $$2 = new dct.a($$0, $$1);
      dde.a $$3 = new dde.a();
      $$3.a(btn.b, new dde.c(bsv.X, 5, 1, 3));
      rb.c($$3);
      a($$2);
      rb.aq($$2);
      rb.f($$2);
      rb.j($$2);
      rb.h($$2);
      rb.i($$2);
      avt $$4 = avu.a(avw.qn);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dcs l(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dct.a $$2 = new dct.a($$0, $$1);
      dde.a $$3 = new dde.a();
      $$3.a(btn.b, new dde.c(bsv.X, 5, 1, 3));
      rb.c($$3);
      a($$2);
      rb.aq($$2);
      rb.f($$2);
      rb.j($$2);
      rb.h($$2);
      rb.i($$2);
      avt $$4 = avu.a(avw.qf);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dcs m(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dct.a $$2 = new dct.a($$0, $$1);
      dde.a $$3 = new dde.a();
      rb.c($$3);
      a($$2);
      rb.f($$2);
      rb.j($$2);
      rb.h($$2);
      rb.i($$2);
      avt $$4 = avu.a(avw.qq);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dcs n(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dct.a $$2 = new dct.a($$0, $$1);
      dde.a $$3 = new dde.a();
      $$3.a(btn.b, new dde.c(bsv.aG, 4, 2, 3)).a(btn.b, new dde.c(bsv.X, 5, 1, 3));
      rb.c($$3);
      a($$2);
      rb.aq($$2);
      rb.f($$2);
      rb.j($$2);
      rb.ad($$2);
      rb.h($$2);
      rb.i($$2);
      avt $$4 = avu.a(avw.qo);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dcs o(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dct.a $$2 = new dct.a($$0, $$1);
      dde.a $$3 = new dde.a();
      $$3.a(btn.b, new dde.c(bsv.bs, 1, 1, 1)).a(btn.b, new dde.c(bsv.aG, 8, 2, 3)).a(btn.b, new dde.c(bsv.Q, 4, 2, 4));
      rb.c($$3);
      a($$2);
      rb.aq($$2);
      rb.f($$2);
      rb.j($$2);
      rb.t($$2);
      rb.ad($$2);
      rb.h($$2);
      rb.i($$2);
      avt $$4 = avu.a(avw.qe);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dcs p(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      $$2.a(btn.d, new dde.c(bsv.f, 10, 4, 6));
      $$2.a(btn.g, new dde.c(bsv.bg, 25, 8, 8));
      rb.c($$2);
      dct.a $$3 = new dct.a($$0, $$1);
      a($$3);
      rb.ab($$3);
      rb.f($$3);
      rb.B($$3);
      rb.j($$3);
      rb.A($$3);
      avt $$4 = avu.a(avw.qg);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dcs q(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      rb.g($$2);
      dct.a $$3 = new dct.a($$0, $$1);
      a($$3);
      rb.ab($$3);
      rb.a($$3, true);
      rb.j($$3);
      rb.S($$3);
      rb.ac($$3);
      rb.ad($$3);
      rb.d($$3);
      avt $$4 = avu.a(avw.qd);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dcs r(jj<ehj> $$0, jj<dzs<?>> $$1) {
      dde.a $$2 = new dde.a();
      dct.a $$3 = new dct.a($$0, $$1);
      $$3.a(dxl.a.a, rd.a);
      $$3.a(dxl.a.a, rd.b);
      $$3.a(dxl.a.a, rd.c);
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
      avt $$4 = avu.a(avw.qc);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
