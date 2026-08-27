import javax.annotation.Nullable;

public class om {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int c = 12638463;
   @Nullable
   private static final apd d = null;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = asb.a($$1, -1.0F, 1.0F);
      return asb.h(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static cqz a(boolean $$0, float $$1, float $$2, crl.a $$3, cra.a $$4, @Nullable apd $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, $$3, $$4, $$5);
   }

   private static cqz a(
      boolean $$0, float $$1, float $$2, int $$3, int $$4, @Nullable Integer $$5, @Nullable Integer $$6, crl.a $$7, cra.a $$8, @Nullable apd $$9
   ) {
      crf.a $$10 = new crf.a().b($$3).c($$4).a(12638463).d(a($$1)).a(cqx.b).a($$9);
      if ($$5 != null) {
         $$10.f($$5);
      }

      if ($$6 != null) {
         $$10.e($$6);
      }

      return new cqz.a().a($$0).a($$1).b($$2).a($$10.a()).a($$7.a()).a($$8.a()).a();
   }

   private static void a(cra.a $$0) {
      nq.a($$0);
      nq.aw($$0);
      nq.b($$0);
      nq.c($$0);
      nq.ap($$0);
      nq.at($$0);
   }

   public static cqz a(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a();
      nq.a($$3);
      $$3.a(bjp.b, new crl.c(bja.bn, 8, 4, 4));
      $$3.a(bjp.b, new crl.c(bja.aC, 4, 2, 3));
      $$3.a(bjp.b, new crl.c(bja.N, 8, 2, 4));
      if ($$2) {
         nq.c($$3);
      } else {
         nq.b($$3);
         nq.a($$3, 100, 25, 100, false);
      }

      cra.a $$4 = new cra.a($$0, $$1);
      a($$4);
      nq.m($$4);
      nq.n($$4);
      nq.f($$4);
      nq.j($$4);
      $$4.a(dki.b.j, $$2 ? pi.ar : pi.as);
      nq.V($$4);
      nq.U($$4);
      nq.ac($$4);
      nq.ad($$4);
      nq.p($$4);
      apd $$5 = ape.a(apg.oD);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static cqz a(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.i($$2);
      return a($$0, $$1, 0.8F, false, true, false, $$2, ape.a(apg.oQ));
   }

   public static cqz b(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.i($$2);
      $$2.a(bjp.b, new crl.c(bja.at, 40, 1, 2)).a(bjp.a, new crl.c(bja.aq, 2, 1, 3)).a(bjp.b, new crl.c(bja.as, 1, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, ape.a(apg.oP));
   }

   public static cqz c(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.i($$2);
      $$2.a(bjp.b, new crl.c(bja.at, 40, 1, 2)).a(bjp.b, new crl.c(bja.as, 80, 1, 2)).a(bjp.a, new crl.c(bja.aq, 2, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, ape.a(apg.oR));
   }

   private static cqz a(hf<dug> $$0, hf<dmp<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, crl.a $$6, apd $$7) {
      cra.a $$8 = new cra.a($$0, $$1);
      a($$8);
      nq.f($$8);
      nq.j($$8);
      if ($$3) {
         nq.r($$8);
      } else {
         if ($$5) {
            nq.q($$8);
         }

         if ($$4) {
            nq.F($$8);
         } else {
            nq.E($$8);
         }
      }

      nq.Y($$8);
      nq.I($$8);
      nq.ac($$8);
      nq.ad($$8);
      nq.ah($$8);
      if ($$4) {
         nq.ag($$8);
      } else {
         nq.af($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static cqz b(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a();
      nq.a($$3);
      $$3.a(bjp.b, new crl.c(bja.aj, 5, 4, 6));
      nq.c($$3);
      cra.a $$4 = new cra.a($$0, $$1);
      a($$4);
      nq.f($$4);
      nq.j($$4);
      if ($$2) {
         nq.D($$4);
      } else {
         nq.C($$4);
      }

      nq.V($$4);
      nq.Z($$4);
      nq.ac($$4);
      nq.ad($$4);
      nq.h($$4);
      nq.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, d);
   }

   public static cqz d(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.f($$2);
      cra.a $$3 = new cra.a($$0, $$1);
      nq.al($$3);
      a($$3);
      nq.f($$3);
      nq.j($$3);
      nq.V($$3);
      nq.Z($$3);
      nq.T($$3);
      nq.ac($$3);
      nq.ai($$3);
      nq.ak($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, ape.a(apg.oN));
   }

   public static cqz a(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      crl.a $$5 = new crl.a();
      cra.a $$6 = new cra.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         nq.e($$5);
         if ($$4) {
            $$6.a(dki.b.e, pd.a);
            $$6.a(dki.b.e, pd.b);
         }
      } else {
         nq.d($$5);
         nq.ab($$6);
         if ($$2) {
            $$6.a(dki.b.j, pi.d);
         }
      }

      nq.f($$6);
      nq.j($$6);
      if ($$3) {
         nq.H($$6);
         nq.V($$6);
         nq.Z($$6);
      } else {
         nq.S($$6);
      }

      nq.ac($$6);
      if ($$2) {
         $$6.a(dki.b.j, pi.E);
         $$6.a(dki.b.j, pi.e);
      } else {
         nq.ad($$6);
      }

      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, d);
   }

   public static cqz e(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.h($$2);
      cra.a $$3 = new cra.a($$0, $$1);
      a($$3);
      nq.f($$3);
      nq.j($$3);
      nq.R($$3);
      nq.ad($$3);
      return a(true, 0.9F, 1.0F, $$2, $$3, d);
   }

   public static cqz a(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2, boolean $$3) {
      cra.a $$4 = new cra.a($$0, $$1);
      a($$4);
      if (!$$2) {
         nq.J($$4);
      }

      nq.f($$4);
      nq.j($$4);
      if ($$2) {
         nq.z($$4);
         nq.V($$4);
         nq.K($$4);
      } else {
         nq.y($$4);
         nq.Y($$4);
         nq.L($$4);
      }

      nq.ac($$4);
      nq.ad($$4);
      crl.a $$5 = new crl.a();
      nq.a($$5);
      $$5.a(bjp.b, new crl.c(bja.Y, 1, 2, 6)).a(bjp.b, new crl.c(bja.w, 1, 1, 1));
      nq.c($$5);
      if ($$3) {
         $$5.a(bjp.b, new crl.c(bja.aj, 8, 4, 4));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, d);
   }

   public static cqz c(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a();
      nq.c($$3);
      cra.a $$4 = new cra.a($$0, $$1);
      a($$4);
      nq.f($$4);
      nq.g($$4);
      nq.j($$4);
      if ($$2) {
         nq.G($$4);
      }

      nq.M($$4);
      nq.ac($$4);
      nq.ae($$4);
      return new cqz.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new crf.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).f(9470285).a(cqx.b).a(ape.a(apg.oO)).a())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static cqz a(crl.a $$0, int $$1, int $$2, cra.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, $$0, $$3, d);
   }

   private static cra.a s(hf<dug> $$0, hf<dmp<?>> $$1) {
      cra.a $$2 = new cra.a($$0, $$1);
      a($$2);
      nq.f($$2);
      nq.j($$2);
      nq.u($$2);
      nq.V($$2);
      nq.Z($$2);
      nq.ac($$2);
      nq.ad($$2);
      return $$2;
   }

   public static cqz d(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a();
      nq.a($$3, 3, 4, 15);
      $$3.a(bjp.g, new crl.c(bja.aE, 15, 1, 5));
      cra.a $$4 = s($$0, $$1);
      $$4.a(dki.b.j, $$2 ? pa.h : pa.c);
      nq.an($$4);
      nq.am($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static cqz e(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a();
      nq.a($$3, 1, 4, 10);
      $$3.a(bjp.f, new crl.c(bja.v, 1, 1, 2));
      cra.a $$4 = s($$0, $$1);
      $$4.a(dki.b.j, $$2 ? pa.g : pa.b);
      nq.an($$4);
      nq.am($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static cqz f(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a();
      if ($$2) {
         nq.a($$3, 8, 4, 8);
      } else {
         nq.a($$3, 10, 2, 15);
      }

      $$3.a(bjp.g, new crl.c(bja.aB, 5, 1, 3)).a(bjp.g, new crl.c(bja.bc, 25, 8, 8)).a(bjp.f, new crl.c(bja.v, 2, 1, 2));
      cra.a $$4 = s($$0, $$1);
      $$4.a(dki.b.j, $$2 ? pa.f : pa.a);
      if ($$2) {
         nq.an($$4);
      }

      nq.ao($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static cqz f(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a().a(bjp.g, new crl.c(bja.aB, 15, 1, 3));
      nq.a($$2, 10, 4);
      cra.a $$3 = s($$0, $$1).a(dki.b.j, pa.m).a(dki.b.j, pa.a).a(dki.b.j, pa.j);
      return a($$2, 4445678, 270131, $$3);
   }

   public static cqz g(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a().a(bjp.f, new crl.c(bja.aT, 1, 1, 4)).a(bjp.g, new crl.c(bja.aE, 15, 1, 5)).a(bjp.b, new crl.c(bja.az, 1, 1, 2));
      nq.c($$3);
      $$3.a(bjp.a, new crl.c(bja.y, 5, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      cra.a $$5 = new cra.a($$0, $$1);
      nq.ar($$5);
      a($$5);
      nq.as($$5);
      nq.f($$5);
      nq.j($$5);
      nq.u($$5);
      nq.V($$5);
      nq.Z($$5);
      nq.ac($$5);
      nq.ad($$5);
      return new cqz.a().a(true).a($$4).a(cqz.d.b).b(0.5F).a(new crf.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(cqx.b).a()).a($$3.a()).a($$5.a()).a();
   }

   public static cqz b(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      cra.a $$5 = new cra.a($$0, $$1);
      a($$5);
      apd $$6;
      if ($$4) {
         $$6 = ape.a(apg.oM);
         $$5.a(dki.b.j, pi.Y);
      } else {
         $$6 = ape.a(apg.oC);
         nq.N($$5);
      }

      nq.f($$5);
      nq.j($$5);
      if ($$4) {
         $$5.a(dki.b.j, pi.aa);
         $$5.a(dki.b.j, pi.R);
         nq.Z($$5);
      } else {
         if ($$2) {
            if ($$3) {
               nq.x($$5);
            } else {
               nq.v($$5);
            }
         } else {
            nq.w($$5);
         }

         nq.V($$5);
         nq.O($$5);
      }

      nq.ac($$5);
      nq.ad($$5);
      crl.a $$8 = new crl.a();
      nq.a($$8);
      nq.c($$8);
      if ($$4) {
         $$8.a(bjp.b, new crl.c(bja.aC, 4, 2, 3));
      } else if (!$$2) {
         $$8.a(bjp.b, new crl.c(bja.bn, 5, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static cqz h(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a();
      nq.a($$3);
      $$3.a(bjp.b, new crl.c(bja.bn, 8, 4, 4)).a(bjp.b, new crl.c(bja.aC, 4, 2, 3)).a(bjp.b, new crl.c(bja.N, 8, 2, 4));
      nq.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      cra.a $$5 = new cra.a($$0, $$1);
      a($$5);
      nq.n($$5);
      nq.f($$5);
      nq.j($$5);
      nq.s($$5);
      nq.V($$5);
      nq.aa($$5);
      nq.ad($$5);
      if ($$2) {
         nq.o($$5);
      } else {
         nq.p($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, $$3, $$5, d);
   }

   public static cqz g(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.a($$2);
      nq.c($$2);
      cra.a $$3 = new cra.a($$0, $$1);
      a($$3);
      $$3.a(dki.b.j, pi.X);
      nq.N($$3);
      nq.f($$3);
      nq.j($$3);
      nq.V($$3);
      nq.O($$3);
      nq.ac($$3);
      nq.ad($$3);
      apd $$4 = ape.a(apg.oC);
      return new cqz.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(new crf.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).a(crf.b.b).a(cqx.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqz h(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.a($$2);
      nq.c($$2);
      $$2.a(bjp.a, new crl.c(bja.aL, 1, 1, 1));
      $$2.a(bjp.b, new crl.c(bja.O, 10, 2, 5));
      cra.a $$3 = new cra.a($$0, $$1);
      nq.al($$3);
      a($$3);
      nq.f($$3);
      nq.k($$3);
      nq.P($$3);
      nq.ac($$3);
      nq.aj($$3);
      $$3.a(dki.b.j, pa.e);
      apd $$4 = ape.a(apg.oB);
      return new cqz.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new crf.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).a(crf.b.c).a(cqx.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqz i(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.c($$2);
      $$2.a(bjp.a, new crl.c(bja.aL, 1, 1, 1));
      $$2.a(bjp.b, new crl.c(bja.O, 10, 2, 5));
      $$2.a(bjp.g, new crl.c(bja.bc, 25, 8, 8));
      cra.a $$3 = new cra.a($$0, $$1);
      nq.al($$3);
      a($$3);
      nq.f($$3);
      nq.l($$3);
      nq.Q($$3);
      $$3.a(dki.b.j, pa.e);
      apd $$4 = ape.a(apg.oB);
      return new cqz.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new crf.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).a(crf.b.c).a(cqx.b).a($$4).a())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static cqz i(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      crl.a $$3 = new crl.a().a(bjp.f, new crl.c(bja.aT, 2, 1, 4)).a(bjp.g, new crl.c(bja.aE, 5, 1, 5));
      nq.c($$3);
      $$3.a(bjp.a, new crl.c(bja.y, $$2 ? 1 : 100, 1, 1));
      cra.a $$4 = new cra.a($$0, $$1);
      a($$4);
      nq.f($$4);
      nq.j($$4);
      nq.u($$4);
      nq.V($$4);
      nq.Z($$4);
      nq.ac($$4);
      nq.ad($$4);
      if (!$$2) {
         $$4.a(dki.b.j, pa.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, $$3, $$4, d);
   }

   public static cqz b(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2, boolean $$3) {
      crl.a $$4 = new crl.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(bjp.b, new crl.c(bja.bd, 5, 2, 5));
      }

      nq.c($$4);
      cra.a $$6 = new cra.a($$0, $$1);
      a($$6);
      nq.f($$6);
      nq.j($$6);
      nq.V($$6);
      nq.Z($$6);
      nq.ac($$6);
      nq.ad($$6);
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

   public static cqz j(hf<dug> $$0, hf<dmp<?>> $$1) {
      cra.a $$2 = new cra.a($$0, $$1);
      $$2.a(dki.b.k, pd.n);
      return a(false, 0.5F, 0.5F, new crl.a(), $$2, d);
   }

   public static cqz j(hf<dug> $$0, hf<dmp<?>> $$1, boolean $$2) {
      cra.a $$3 = new cra.a($$0, $$1);
      crl.a $$4 = new crl.a();
      $$4.a(bjp.b, new crl.c($$2 ? bja.av : bja.w, 1, 1, 2)).a(bjp.b, new crl.c(bja.aC, 2, 2, 6)).a(bjp.b, new crl.c(bja.aF, 2, 2, 4));
      nq.c($$4);
      a($$3);
      nq.ab($$3);
      nq.f($$3);
      nq.j($$3);
      if ($$2) {
         nq.W($$3);
      } else {
         nq.X($$3);
      }

      nq.h($$3);
      nq.i($$3);
      apd $$5 = ape.a($$2 ? apg.oF : apg.oE);
      return $$2 ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, $$4, $$3, $$5) : a(true, 0.5F, 0.8F, 937679, 329011, null, null, $$4, $$3, $$5);
   }

   public static cqz k(hf<dug> $$0, hf<dmp<?>> $$1) {
      cra.a $$2 = new cra.a($$0, $$1);
      crl.a $$3 = new crl.a();
      $$3.a(bjp.b, new crl.c(bja.U, 5, 1, 3));
      nq.c($$3);
      a($$2);
      nq.aq($$2);
      nq.f($$2);
      nq.j($$2);
      nq.h($$2);
      nq.i($$2);
      apd $$4 = ape.a(apg.oH);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cqz l(hf<dug> $$0, hf<dmp<?>> $$1) {
      cra.a $$2 = new cra.a($$0, $$1);
      crl.a $$3 = new crl.a();
      $$3.a(bjp.b, new crl.c(bja.U, 5, 1, 3));
      nq.c($$3);
      a($$2);
      nq.aq($$2);
      nq.f($$2);
      nq.j($$2);
      nq.h($$2);
      nq.i($$2);
      apd $$4 = ape.a(apg.oz);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static cqz m(hf<dug> $$0, hf<dmp<?>> $$1) {
      cra.a $$2 = new cra.a($$0, $$1);
      crl.a $$3 = new crl.a();
      nq.c($$3);
      a($$2);
      nq.f($$2);
      nq.j($$2);
      nq.h($$2);
      nq.i($$2);
      apd $$4 = ape.a(apg.oK);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static cqz n(hf<dug> $$0, hf<dmp<?>> $$1) {
      cra.a $$2 = new cra.a($$0, $$1);
      crl.a $$3 = new crl.a();
      $$3.a(bjp.b, new crl.c(bja.aC, 4, 2, 3)).a(bjp.b, new crl.c(bja.U, 5, 1, 3));
      nq.c($$3);
      a($$2);
      nq.aq($$2);
      nq.f($$2);
      nq.j($$2);
      nq.ad($$2);
      nq.h($$2);
      nq.i($$2);
      apd $$4 = ape.a(apg.oI);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static cqz o(hf<dug> $$0, hf<dmp<?>> $$1) {
      cra.a $$2 = new cra.a($$0, $$1);
      crl.a $$3 = new crl.a();
      nq.a($$3);
      $$3.a(bjp.b, new crl.c(bja.bn, 8, 4, 4)).a(bjp.b, new crl.c(bja.aC, 4, 2, 3)).a(bjp.b, new crl.c(bja.N, 8, 2, 4));
      nq.c($$3);
      a($$2);
      nq.aq($$2);
      nq.f($$2);
      nq.j($$2);
      nq.t($$2);
      nq.ad($$2);
      nq.h($$2);
      nq.i($$2);
      apd $$4 = ape.a(apg.oy);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static cqz p(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      $$2.a(bjp.d, new crl.c(bja.f, 10, 4, 6));
      $$2.a(bjp.g, new crl.c(bja.bc, 25, 8, 8));
      nq.c($$2);
      cra.a $$3 = new cra.a($$0, $$1);
      a($$3);
      nq.ab($$3);
      nq.f($$3);
      nq.B($$3);
      nq.j($$3);
      nq.A($$3);
      apd $$4 = ape.a(apg.oA);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static cqz q(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      nq.g($$2);
      cra.a $$3 = new cra.a($$0, $$1);
      a($$3);
      nq.ab($$3);
      nq.a($$3, true);
      nq.j($$3);
      nq.S($$3);
      nq.ac($$3);
      nq.ad($$3);
      nq.d($$3);
      apd $$4 = ape.a(apg.ox);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static cqz r(hf<dug> $$0, hf<dmp<?>> $$1) {
      crl.a $$2 = new crl.a();
      cra.a $$3 = new cra.a($$0, $$1);
      $$3.a(dki.a.a, ns.a);
      $$3.a(dki.a.a, ns.b);
      $$3.a(dki.a.a, ns.c);
      nq.aw($$3);
      nq.b($$3);
      nq.c($$3);
      nq.at($$3);
      nq.ab($$3);
      nq.f($$3);
      nq.j($$3);
      nq.S($$3);
      nq.ac($$3);
      nq.ad($$3);
      nq.e($$3);
      apd $$4 = ape.a(apg.ow);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
