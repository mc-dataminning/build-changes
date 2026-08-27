import javax.annotation.Nullable;

public class oh {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final aot d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = arp.a($$1, -1.0F, 1.0F);
      return arp.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static cqk a(boolean $$0, float $$1, float $$2, cqw.a $$3, cql.a $$4, @Nullable aot $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static cqk a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, cqw.a $$7, cql.a $$8, @Nullable aot $$9
   ) {
      cqq.a $$10 = new cqq.a().b($$3).c($$4).a(12638463).d(a($$1)).a(cqi.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new cqk.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cql.a $$0) {
      nl.a($$0);
      nl.aw($$0);
      nl.b($$0);
      nl.c($$0);
      nl.ap($$0);
      nl.at($$0);
   }

   public static cqk a(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a();
      nl.a($$3);
      $$3.a(bjb.b, new cqw.c(bim.bn, 8, 4, 4));
      $$3.a(bjb.b, new cqw.c(bim.aC, 4, 2, 3));
      $$3.a(bjb.b, new cqw.c(bim.N, 8, 2, 4));
      if ($$2) {
         nl.c($$3);
      } else {
         nl.b($$3);
         nl.a($$3, 100, 25, 100, false);
      }

      cql.a $$4 = new cql.a($$0, $$1);
      a($$4);
      nl.m($$4);
      nl.n($$4);
      nl.f($$4);
      nl.j($$4);
      $$4.a(dkf.b.j, $$2 ? pd.ar : pd.as);
      nl.V($$4);
      nl.U($$4);
      nl.ac($$4);
      nl.ad($$4);
      nl.p($$4);
      aot $$5 = aou.a(aow.oD);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static cqk a(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, aou.a(aow.oQ));
   }

   public static cqk b(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.i($$2);
      $$2.a(bjb.b, new cqw.c(bim.at, 40, 1, 2)).a(bjb.a, new cqw.c(bim.aq, 2, 1, 3)).a(bjb.b, new cqw.c(bim.as, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, aou.a(aow.oP));
   }

   public static cqk c(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.i($$2);
      $$2.a(bjb.b, new cqw.c(bim.at, 40, 1, 2)).a(bjb.b, new cqw.c(bim.as, 80, 1, 2)).a(bjb.a, new cqw.c(bim.aq, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, aou.a(aow.oR));
   }

   private static cqk a(hf<dud> $$0, hf<dmm<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, cqw.a $$6, aot $$7) {
      cql.a $$8 = new cql.a($$0, $$1);
      a($$8);
      nl.f($$8);
      nl.j($$8);
      if ($$3) {
         nl.r($$8);
      } else {
         if ($$5) {
            nl.q($$8);
         }

         if ($$4) {
            nl.F($$8);
         } else {
            nl.E($$8);
         }
      }

      nl.Y($$8);
      nl.I($$8);
      nl.ac($$8);
      nl.ad($$8);
      nl.ah($$8);
      if ($$4) {
         nl.ag($$8);
      } else {
         nl.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static cqk b(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a();
      nl.a($$3);
      $$3.a(bjb.b, new cqw.c(bim.aj, 5, 4, 6));
      nl.c($$3);
      cql.a $$4 = new cql.a($$0, $$1);
      a($$4);
      nl.f($$4);
      nl.j($$4);
      if ($$2) {
         nl.D($$4);
      } else {
         nl.C($$4);
      }

      nl.V($$4);
      nl.Z($$4);
      nl.ac($$4);
      nl.ad($$4);
      nl.h($$4);
      nl.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static cqk d(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.f($$2);
      cql.a $$3 = new cql.a($$0, $$1);
      nl.al($$3);
      a($$3);
      nl.f($$3);
      nl.j($$3);
      nl.V($$3);
      nl.Z($$3);
      nl.T($$3);
      nl.ac($$3);
      nl.ai($$3);
      nl.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, aou.a(aow.oN));
   }

   public static cqk a(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cqw.a $$5 = new cqw.a();
      cql.a $$6 = new cql.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         nl.e($$5);
         if ($$4) {
            $$6.a(dkf.b.e, oy.a);
            $$6.a(dkf.b.e, oy.b);
         }
      } else {
         nl.d($$5);
         nl.ab($$6);
         if ($$2) {
            $$6.a(dkf.b.j, pd.d);
         }
      }

      nl.f($$6);
      nl.j($$6);
      if ($$3) {
         nl.H($$6);
         nl.V($$6);
         nl.Z($$6);
      } else {
         nl.S($$6);
      }

      nl.ac($$6);
      if ($$2) {
         $$6.a(dkf.b.j, pd.E);
         $$6.a(dkf.b.j, pd.e);
      } else {
         nl.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static cqk e(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.h($$2);
      cql.a $$3 = new cql.a($$0, $$1);
      a($$3);
      nl.f($$3);
      nl.j($$3);
      nl.R($$3);
      nl.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static cqk a(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2, boolean $$3) {
      cql.a $$4 = new cql.a($$0, $$1);
      a($$4);
      if (!$$2) {
         nl.J($$4);
      }

      nl.f($$4);
      nl.j($$4);
      if ($$2) {
         nl.z($$4);
         nl.V($$4);
         nl.K($$4);
      } else {
         nl.y($$4);
         nl.Y($$4);
         nl.L($$4);
      }

      nl.ac($$4);
      nl.ad($$4);
      cqw.a $$5 = new cqw.a();
      nl.a($$5);
      $$5.a(bjb.b, new cqw.c(bim.Y, 1, 2, 6)).a(bjb.b, new cqw.c(bim.w, 1, 1, 1));
      nl.c($$5);
      if ($$3) {
         $$5.a(bjb.b, new cqw.c(bim.aj, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static cqk c(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a();
      nl.c($$3);
      cql.a $$4 = new cql.a($$0, $$1);
      a($$4);
      nl.f($$4);
      nl.g($$4);
      nl.j($$4);
      if ($$2) {
         nl.G($$4);
      }

      nl.M($$4);
      nl.ac($$4);
      nl.ae($$4);
      return new cqk.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new cqq.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(cqi.b).a(aou.a(aow.oO)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static cqk a(cqw.a $$0, int $$1, int $$2, cql.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cql.a s(hf<dud> $$0, hf<dmm<?>> $$1) {
      cql.a $$2 = new cql.a($$0, $$1);
      a($$2);
      nl.f($$2);
      nl.j($$2);
      nl.u($$2);
      nl.V($$2);
      nl.Z($$2);
      nl.ac($$2);
      nl.ad($$2);
      return $$2;
   }

   public static cqk d(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a();
      nl.a($$3, 3, 4, 15);
      $$3.a(bjb.g, new cqw.c(bim.aE, 15, 1, 5));
      cql.a $$4 = s($$0, $$1);
      $$4.a(dkf.b.j, $$2 ? ov.h : ov.c);
      nl.an($$4);
      nl.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static cqk e(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a();
      nl.a($$3, 1, 4, 10);
      $$3.a(bjb.f, new cqw.c(bim.v, 1, 1, 2));
      cql.a $$4 = s($$0, $$1);
      $$4.a(dkf.b.j, $$2 ? ov.g : ov.b);
      nl.an($$4);
      nl.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static cqk f(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a();
      if ($$2) {
         nl.a($$3, 8, 4, 8);
      } else {
         nl.a($$3, 10, 2, 15);
      }

      $$3.a(bjb.g, new cqw.c(bim.aB, 5, 1, 3)).a(bjb.g, new cqw.c(bim.bc, 25, 8, 8)).a(bjb.f, new cqw.c(bim.v, 2, 1, 2));
      cql.a $$4 = s($$0, $$1);
      $$4.a(dkf.b.j, $$2 ? ov.f : ov.a);
      if ($$2) {
         nl.an($$4);
      }

      nl.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static cqk f(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a().a(bjb.g, new cqw.c(bim.aB, 15, 1, 3));
      nl.a($$2, 10, 4);
      cql.a $$3 = s($$0, $$1).a(dkf.b.j, ov.m).a(dkf.b.j, ov.a).a(dkf.b.j, ov.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static cqk g(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a().a(bjb.f, new cqw.c(bim.aT, 1, 1, 4)).a(bjb.g, new cqw.c(bim.aE, 15, 1, 5)).a(bjb.b, new cqw.c(bim.az, 1, 1, 2));
      nl.c($$3);
      $$3.a(bjb.a, new cqw.c(bim.y, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cql.a $$5 = new cql.a($$0, $$1);
      nl.ar($$5);
      a($$5);
      nl.as($$5);
      nl.f($$5);
      nl.j($$5);
      nl.u($$5);
      nl.V($$5);
      nl.Z($$5);
      nl.ac($$5);
      nl.ad($$5);
      return new cqk.a().a(true).a($$4).a(cqk.d.b).b(0.5F).a(new cqq.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(cqi.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static cqk b(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cql.a $$5 = new cql.a($$0, $$1);
      a($$5);
      aot $$6;
      if ($$4) {
         $$6 = aou.a(aow.oM);
         $$5.a(dkf.b.j, pd.Y);
      } else {
         $$6 = aou.a(aow.oC);
         nl.N($$5);
      }

      nl.f($$5);
      nl.j($$5);
      if ($$4) {
         $$5.a(dkf.b.j, pd.aa);
         $$5.a(dkf.b.j, pd.R);
         nl.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               nl.x($$5);
            } else {
               nl.v($$5);
            }
         } else {
            nl.w($$5);
         }

         nl.V($$5);
         nl.O($$5);
      }

      nl.ac($$5);
      nl.ad($$5);
      cqw.a $$8 = new cqw.a();
      nl.a($$8);
      nl.c($$8);
      if ($$4) {
         $$8.a(bjb.b, new cqw.c(bim.aC, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bjb.b, new cqw.c(bim.bn, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static cqk h(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a();
      nl.a($$3);
      $$3.a(bjb.b, new cqw.c(bim.bn, 8, 4, 4)).a(bjb.b, new cqw.c(bim.aC, 4, 2, 3)).a(bjb.b, new cqw.c(bim.N, 8, 2, 4));
      nl.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cql.a $$5 = new cql.a($$0, $$1);
      a($$5);
      nl.n($$5);
      nl.f($$5);
      nl.j($$5);
      nl.s($$5);
      nl.V($$5);
      nl.aa($$5);
      nl.ad($$5);
      if ($$2) {
         nl.o($$5);
      } else {
         nl.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static cqk g(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.a($$2);
      nl.c($$2);
      cql.a $$3 = new cql.a($$0, $$1);
      a($$3);
      $$3.a(dkf.b.j, pd.X);
      nl.N($$3);
      nl.f($$3);
      nl.j($$3);
      nl.V($$3);
      nl.O($$3);
      nl.ac($$3);
      nl.ad($$3);
      aot $$4 = aou.a(aow.oC);
      return new cqk.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new cqq.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(cqq.b.b).a(cqi.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqk h(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.a($$2);
      nl.c($$2);
      $$2.a(bjb.a, new cqw.c(bim.aL, 1, 1, 1));
      $$2.a(bjb.b, new cqw.c(bim.O, 10, 2, 5));
      cql.a $$3 = new cql.a($$0, $$1);
      nl.al($$3);
      a($$3);
      nl.f($$3);
      nl.k($$3);
      nl.P($$3);
      nl.ac($$3);
      nl.aj($$3);
      $$3.a(dkf.b.j, ov.e);
      aot $$4 = aou.a(aow.oB);
      return new cqk.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cqq.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(cqq.b.c).a(cqi.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqk i(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.c($$2);
      $$2.a(bjb.a, new cqw.c(bim.aL, 1, 1, 1));
      $$2.a(bjb.b, new cqw.c(bim.O, 10, 2, 5));
      $$2.a(bjb.g, new cqw.c(bim.bc, 25, 8, 8));
      cql.a $$3 = new cql.a($$0, $$1);
      nl.al($$3);
      a($$3);
      nl.f($$3);
      nl.l($$3);
      nl.Q($$3);
      $$3.a(dkf.b.j, ov.e);
      aot $$4 = aou.a(aow.oB);
      return new cqk.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new cqq.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(cqq.b.c).a(cqi.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqk i(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cqw.a $$3 = new cqw.a().a(bjb.f, new cqw.c(bim.aT, 2, 1, 4)).a(bjb.g, new cqw.c(bim.aE, 5, 1, 5));
      nl.c($$3);
      $$3.a(bjb.a, new cqw.c(bim.y, $$2 ? 1 : 100, 1, 1));
      cql.a $$4 = new cql.a($$0, $$1);
      a($$4);
      nl.f($$4);
      nl.j($$4);
      nl.u($$4);
      nl.V($$4);
      nl.Z($$4);
      nl.ac($$4);
      nl.ad($$4);
      if (!$$2) {
         $$4.a(dkf.b.j, ov.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static cqk b(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2, boolean $$3) {
      cqw.a $$4 = new cqw.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bjb.b, new cqw.c(bim.bd, 5, 2, 5));
      }

      nl.c($$4);
      cql.a $$6 = new cql.a($$0, $$1);
      a($$6);
      nl.f($$6);
      nl.j($$6);
      nl.V($$6);
      nl.Z($$6);
      nl.ac($$6);
      nl.ad($$6);
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

   public static cqk j(hf<dud> $$0, hf<dmm<?>> $$1) {
      cql.a $$2 = new cql.a($$0, $$1);
      $$2.a(dkf.b.k, oy.n);
      return a(false, 0.5F, 0.5F, new cqw.a(), $$2, d);
   }

   public static cqk j(hf<dud> $$0, hf<dmm<?>> $$1, boolean $$2) {
      cql.a $$3 = new cql.a($$0, $$1);
      cqw.a $$4 = new cqw.a();
      $$4.a(bjb.b, new cqw.c($$2 ? bim.av : bim.w, 1, 1, 2)).a(bjb.b, new cqw.c(bim.aC, 2, 2, 6)).a(bjb.b, new cqw.c(bim.aF, 2, 2, 4));
      nl.c($$4);
      a($$3);
      nl.ab($$3);
      nl.f($$3);
      nl.j($$3);
      if ($$2) {
         nl.W($$3);
      } else {
         nl.X($$3);
      }

      nl.h($$3);
      nl.i($$3);
      aot $$5 = aou.a($$2 ? aow.oF : aow.oE);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static cqk k(hf<dud> $$0, hf<dmm<?>> $$1) {
      cql.a $$2 = new cql.a($$0, $$1);
      cqw.a $$3 = new cqw.a();
      $$3.a(bjb.b, new cqw.c(bim.U, 5, 1, 3));
      nl.c($$3);
      a($$2);
      nl.aq($$2);
      nl.f($$2);
      nl.j($$2);
      nl.h($$2);
      nl.i($$2);
      aot $$4 = aou.a(aow.oH);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cqk l(hf<dud> $$0, hf<dmm<?>> $$1) {
      cql.a $$2 = new cql.a($$0, $$1);
      cqw.a $$3 = new cqw.a();
      $$3.a(bjb.b, new cqw.c(bim.U, 5, 1, 3));
      nl.c($$3);
      a($$2);
      nl.aq($$2);
      nl.f($$2);
      nl.j($$2);
      nl.h($$2);
      nl.i($$2);
      aot $$4 = aou.a(aow.oz);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cqk m(hf<dud> $$0, hf<dmm<?>> $$1) {
      cql.a $$2 = new cql.a($$0, $$1);
      cqw.a $$3 = new cqw.a();
      nl.c($$3);
      a($$2);
      nl.f($$2);
      nl.j($$2);
      nl.h($$2);
      nl.i($$2);
      aot $$4 = aou.a(aow.oK);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static cqk n(hf<dud> $$0, hf<dmm<?>> $$1) {
      cql.a $$2 = new cql.a($$0, $$1);
      cqw.a $$3 = new cqw.a();
      $$3.a(bjb.b, new cqw.c(bim.aC, 4, 2, 3)).a(bjb.b, new cqw.c(bim.U, 5, 1, 3));
      nl.c($$3);
      a($$2);
      nl.aq($$2);
      nl.f($$2);
      nl.j($$2);
      nl.ad($$2);
      nl.h($$2);
      nl.i($$2);
      aot $$4 = aou.a(aow.oI);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static cqk o(hf<dud> $$0, hf<dmm<?>> $$1) {
      cql.a $$2 = new cql.a($$0, $$1);
      cqw.a $$3 = new cqw.a();
      nl.a($$3);
      $$3.a(bjb.b, new cqw.c(bim.bn, 8, 4, 4)).a(bjb.b, new cqw.c(bim.aC, 4, 2, 3)).a(bjb.b, new cqw.c(bim.N, 8, 2, 4));
      nl.c($$3);
      a($$2);
      nl.aq($$2);
      nl.f($$2);
      nl.j($$2);
      nl.t($$2);
      nl.ad($$2);
      nl.h($$2);
      nl.i($$2);
      aot $$4 = aou.a(aow.oy);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static cqk p(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      $$2.a(bjb.d, new cqw.c(bim.f, 10, 4, 6));
      $$2.a(bjb.g, new cqw.c(bim.bc, 25, 8, 8));
      nl.c($$2);
      cql.a $$3 = new cql.a($$0, $$1);
      a($$3);
      nl.ab($$3);
      nl.f($$3);
      nl.B($$3);
      nl.j($$3);
      nl.A($$3);
      aot $$4 = aou.a(aow.oA);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static cqk q(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      nl.g($$2);
      cql.a $$3 = new cql.a($$0, $$1);
      a($$3);
      nl.ab($$3);
      nl.a($$3, true);
      nl.j($$3);
      nl.S($$3);
      nl.ac($$3);
      nl.ad($$3);
      nl.d($$3);
      aot $$4 = aou.a(aow.ox);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static cqk r(hf<dud> $$0, hf<dmm<?>> $$1) {
      cqw.a $$2 = new cqw.a();
      cql.a $$3 = new cql.a($$0, $$1);
      $$3.a(dkf.a.a, nn.a);
      $$3.a(dkf.a.a, nn.b);
      $$3.a(dkf.a.a, nn.c);
      nl.aw($$3);
      nl.b($$3);
      nl.c($$3);
      nl.at($$3);
      nl.ab($$3);
      nl.f($$3);
      nl.j($$3);
      nl.S($$3);
      nl.ac($$3);
      nl.ad($$3);
      nl.e($$3);
      aot $$4 = aou.a(aow.ow);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
