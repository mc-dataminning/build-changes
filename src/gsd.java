import javax.annotation.Nullable;
import org.joml.Matrix4f;

public abstract class gsd<T extends bul, S extends gyk> {
   protected static final float c = 0.025F;
   public static final int d = 24;
   protected final gsc e;
   private final foc a;
   protected float f;
   protected float g = 1.0F;
   private final S b = this.d();

   protected gsd(gse.a $$0) {
      this.e = $$0.a();
      this.a = $$0.j();
   }

   public final int a(T $$0, float $$1) {
      ji $$2 = ji.a((kb)$$0.n($$1));
      return glw.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, ji $$1) {
      return $$0.dV().a(dgr.a, $$1);
   }

   protected int a(T $$0, ji $$1) {
      return $$0.bY() ? 15 : $$0.dV().a(dgr.b, $$1);
   }

   public boolean a(T $$0, gpq $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if (!this.b($$0)) {
         return true;
      } else {
         fav $$5 = this.a($$0).g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new fav($$0.dA() - 2.0, $$0.dC() - 2.0, $$0.dG() - 2.0, $$0.dA() + 2.0, $$0.dC() + 2.0, $$0.dG() + 2.0);
         }

         if ($$1.a($$5)) {
            return true;
         } else {
            if ($$0 instanceof bvf $$6) {
               bul $$7 = $$6.D();
               if ($$7 != null) {
                  return $$1.a(this.e.a($$7).a($$7));
               }
            }

            return false;
         }
      }
   }

   protected fav a(T $$0) {
      return $$0.cR();
   }

   protected boolean b(T $$0) {
      return true;
   }

   public fba a(S $$0) {
      return $$0.C != null ? $$0.C : fba.c;
   }

   public void a(S $$0, ffu $$1, gly $$2, int $$3) {
      gyk.a $$4 = $$0.F;
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      if ($$0.D != null) {
         this.a($$0, $$0.D, $$1, $$2, $$3);
      }
   }

   private static void a(ffu $$0, gly $$1, gyk.a $$2) {
      float $$3 = 0.025F;
      float $$4 = (float)($$2.c.d - $$2.b.d);
      float $$5 = (float)($$2.c.e - $$2.b.e);
      float $$6 = (float)($$2.c.f - $$2.b.f);
      float $$7 = ayz.j($$4 * $$4 + $$6 * $$6) * 0.025F / 2.0F;
      float $$8 = $$6 * $$7;
      float $$9 = $$4 * $$7;
      $$0.a();
      $$0.a($$2.a);
      ffy $$10 = $$1.getBuffer(gmi.h());
      Matrix4f $$11 = $$0.c().a();

      for (int $$12 = 0; $$12 <= 24; $$12++) {
         a($$10, $$11, $$4, $$5, $$6, $$2.d, $$2.e, $$2.f, $$2.g, 0.025F, 0.025F, $$8, $$9, $$12, false);
      }

      for (int $$13 = 24; $$13 >= 0; $$13--) {
         a($$10, $$11, $$4, $$5, $$6, $$2.d, $$2.e, $$2.f, $$2.g, 0.025F, 0.0F, $$8, $$9, $$13, true);
      }

      $$0.b();
   }

   private static void a(
      ffy $$0,
      Matrix4f $$1,
      float $$2,
      float $$3,
      float $$4,
      int $$5,
      int $$6,
      int $$7,
      int $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      int $$13,
      boolean $$14
   ) {
      float $$15 = (float)$$13 / 24.0F;
      int $$16 = (int)ayz.h($$15, (float)$$5, (float)$$6);
      int $$17 = (int)ayz.h($$15, (float)$$7, (float)$$8);
      int $$18 = glw.a($$16, $$17);
      float $$19 = $$13 % 2 == ($$14 ? 1 : 0) ? 0.7F : 1.0F;
      float $$20 = 0.5F * $$19;
      float $$21 = 0.4F * $$19;
      float $$22 = 0.3F * $$19;
      float $$23 = $$2 * $$15;
      float $$24 = $$3 > 0.0F ? $$3 * $$15 * $$15 : $$3 - $$3 * (1.0F - $$15) * (1.0F - $$15);
      float $$25 = $$4 * $$15;
      $$0.a($$1, $$23 - $$11, $$24 + $$10, $$25 + $$12).a($$20, $$21, $$22, 1.0F).c($$18);
      $$0.a($$1, $$23 + $$11, $$24 + $$9 - $$10, $$25 - $$12).a($$20, $$21, $$22, 1.0F).c($$18);
   }

   protected boolean a(T $$0, double $$1) {
      return $$0.cM() || $$0.l_() && $$0 == this.e.c;
   }

   public foc e() {
      return this.a;
   }

   protected void a(S $$0, wp $$1, ffu $$2, gly $$3, int $$4) {
      fba $$5 = $$0.E;
      if ($$5 != null) {
         boolean $$6 = !$$0.A;
         int $$7 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a($$5.d, $$5.e + 0.5, $$5.f);
         $$2.a(this.e.b());
         $$2.b(0.025F, -0.025F, 0.025F);
         Matrix4f $$8 = $$2.c().a();
         foc $$9 = this.e();
         float $$10 = (float)(-$$9.a($$1)) / 2.0F;
         int $$11 = (int)(flj.Q().n.a(0.25F) * 255.0F) << 24;
         $$9.a($$1, $$10, (float)$$7, -2130706433, false, $$8, $$3, $$6 ? foc.a.b : foc.a.a, $$11, $$4);
         if ($$6) {
            $$9.a($$1, $$10, (float)$$7, -1, false, $$8, $$3, foc.a.a, 0, glw.b($$4, 2));
         }

         $$2.b();
      }
   }

   @Nullable
   protected wp c(T $$0) {
      return $$0.p_();
   }

   protected float c(S $$0) {
      return this.f;
   }

   protected float b(S $$0) {
      return this.g;
   }

   public abstract S d();

   public final S b(T $$0, float $$1) {
      S $$2 = this.b;
      this.a($$0, $$2, $$1);
      return $$2;
   }

   public void a(T $$0, S $$1, float $$2) {
      $$1.r = ayz.d((double)$$2, $$0.aa, $$0.dA());
      $$1.s = ayz.d((double)$$2, $$0.ab, $$0.dC());
      $$1.t = ayz.d((double)$$2, $$0.ac, $$0.dG());
      $$1.z = $$0.cp();
      $$1.u = (float)$$0.af + $$2;
      $$1.v = $$0.dq();
      $$1.w = $$0.dr();
      $$1.x = $$0.cS();
      if ($$0.bZ() && $$0.dk() instanceof cqw $$3 && $$3.l() instanceof crl $$4 && $$4.t()) {
         double $$5 = ayz.d((double)$$2, $$3.aa, $$3.dA());
         double $$6 = ayz.d((double)$$2, $$3.ab, $$3.dC());
         double $$7 = ayz.d((double)$$2, $$3.ac, $$3.dG());
         $$1.C = $$4.e($$2).d(new fba($$5, $$6, $$7));
      } else {
         $$1.C = null;
      }

      $$1.y = this.e.b($$0);
      boolean $$8 = $$1.y < 4096.0 && this.a($$0, $$1.y);
      if ($$8) {
         $$1.D = this.c($$0);
         $$1.E = $$0.ds().a(bum.c, 0, $$0.k($$2));
      } else {
         $$1.D = null;
      }

      $$1.A = $$0.cg();
      bul $$10 = $$0 instanceof bvf $$9 ? $$9.D() : null;
      if ($$10 != null) {
         float $$11 = $$0.t($$2) * (float) (Math.PI / 180.0);
         fba $$12 = $$0.s($$2).b(-$$11);
         ji $$13 = ji.a((kb)$$0.m($$2));
         ji $$14 = ji.a((kb)$$10.m($$2));
         if ($$1.F == null) {
            $$1.F = new gyk.a();
         }

         gyk.a $$15 = $$1.F;
         $$15.a = $$12;
         $$15.b = $$0.o($$2).e($$12);
         $$15.c = $$10.u($$2);
         $$15.d = this.a($$0, $$13);
         $$15.e = this.e.a($$10).a($$10, $$14);
         $$15.f = $$0.dV().a(dgr.a, $$13);
         $$15.g = $$0.dV().a(dgr.a, $$14);
      } else {
         $$1.F = null;
      }

      $$1.B = $$0.cF();
   }
}
