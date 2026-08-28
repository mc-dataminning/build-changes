import javax.annotation.Nullable;
import org.joml.Matrix4f;

public abstract class gyj<T extends bwv, S extends her> {
   protected static final float b = 0.025F;
   public static final int c = 24;
   protected final gyi d;
   private final ftx a;
   protected float e;
   protected float f = 1.0F;
   private final S g = this.d();

   protected gyj(gyk.a $$0) {
      this.d = $$0.a();
      this.a = $$0.j();
   }

   public final int a(T $$0, float $$1) {
      iw $$2 = iw.a((jq)$$0.o($$1));
      return grz.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, iw $$1) {
      return $$0.dV().a(dki.a, $$1);
   }

   protected int a(T $$0, iw $$1) {
      return $$0.bX() ? 15 : $$0.dV().a(dki.b, $$1);
   }

   public boolean a(T $$0, gvw $$1, double $$2, double $$3, double $$4) {
      if (!$$0.j($$2, $$3, $$4)) {
         return false;
      } else if (!this.b($$0)) {
         return true;
      } else {
         ffn $$5 = this.a($$0).g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new ffn($$0.dA() - 2.0, $$0.dC() - 2.0, $$0.dG() - 2.0, $$0.dA() + 2.0, $$0.dC() + 2.0, $$0.dG() + 2.0);
         }

         if ($$1.a($$5)) {
            return true;
         } else {
            if ($$0 instanceof bxu $$6) {
               bwv $$7 = $$6.C();
               if ($$7 != null) {
                  return $$1.a(this.d.a($$7).a($$7));
               }
            }

            return false;
         }
      }
   }

   protected ffn a(T $$0) {
      return $$0.cR();
   }

   protected boolean b(T $$0) {
      return true;
   }

   public ffs a(S $$0) {
      return $$0.C != null ? $$0.C : ffs.c;
   }

   public void a(S $$0, flq $$1, gsc $$2, int $$3) {
      her.a $$4 = $$0.F;
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      if ($$0.D != null) {
         this.a($$0, $$0.D, $$1, $$2, $$3);
      }
   }

   private static void a(flq $$0, gsc $$1, her.a $$2) {
      float $$3 = 0.025F;
      float $$4 = (float)($$2.c.d - $$2.b.d);
      float $$5 = (float)($$2.c.e - $$2.b.e);
      float $$6 = (float)($$2.c.f - $$2.b.f);
      float $$7 = azq.j($$4 * $$4 + $$6 * $$6) * 0.025F / 2.0F;
      float $$8 = $$6 * $$7;
      float $$9 = $$4 * $$7;
      $$0.a();
      $$0.a($$2.a);
      flt $$10 = $$1.getBuffer(gsn.i());
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
      flt $$0,
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
      int $$16 = (int)azq.h($$15, (float)$$5, (float)$$6);
      int $$17 = (int)azq.h($$15, (float)$$7, (float)$$8);
      int $$18 = grz.a($$16, $$17);
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
      return $$0.cM() || $$0.h_() && $$0 == this.d.c;
   }

   public ftx e() {
      return this.a;
   }

   protected void a(S $$0, xc $$1, flq $$2, gsc $$3, int $$4) {
      ffs $$5 = $$0.E;
      if ($$5 != null) {
         boolean $$6 = !$$0.A;
         int $$7 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a($$5.d, $$5.e + 0.5, $$5.f);
         $$2.a(this.d.b());
         $$2.b(0.025F, -0.025F, 0.025F);
         Matrix4f $$8 = $$2.c().a();
         ftx $$9 = this.e();
         float $$10 = (float)(-$$9.a($$1)) / 2.0F;
         int $$11 = (int)(frf.Q().n.a(0.25F) * 255.0F) << 24;
         $$9.a($$1, $$10, (float)$$7, -2130706433, false, $$8, $$3, $$6 ? ftx.a.b : ftx.a.a, $$11, $$4);
         if ($$6) {
            $$9.a($$1, $$10, (float)$$7, -1, false, $$8, $$3, ftx.a.a, 0, grz.b($$4, 2));
         }

         $$2.b();
      }
   }

   @Nullable
   protected xc c(T $$0) {
      return $$0.m_();
   }

   protected float c(S $$0) {
      return this.e;
   }

   protected float b(S $$0) {
      return this.f;
   }

   public abstract S d();

   public final S b(T $$0, float $$1) {
      S $$2 = this.g;
      this.a($$0, $$2, $$1);
      return $$2;
   }

   public void a(T $$0, S $$1, float $$2) {
      $$1.r = azq.d((double)$$2, $$0.aa, $$0.dA());
      $$1.s = azq.d((double)$$2, $$0.ab, $$0.dC());
      $$1.t = azq.d((double)$$2, $$0.ac, $$0.dG());
      $$1.z = $$0.co();
      $$1.u = (float)$$0.af + $$2;
      $$1.v = $$0.dq();
      $$1.w = $$0.dr();
      $$1.x = $$0.cS();
      if ($$0.bY() && $$0.dk() instanceof cum $$3 && $$3.f() instanceof cvb $$4 && $$4.o()) {
         double $$5 = azq.d((double)$$2, $$3.aa, $$3.dA());
         double $$6 = azq.d((double)$$2, $$3.ab, $$3.dC());
         double $$7 = azq.d((double)$$2, $$3.ac, $$3.dG());
         $$1.C = $$4.e($$2).d(new ffs($$5, $$6, $$7));
      } else {
         $$1.C = null;
      }

      $$1.y = this.d.b($$0);
      boolean $$8 = $$1.y < 4096.0 && this.a($$0, $$1.y);
      if ($$8) {
         $$1.D = this.c($$0);
         $$1.E = $$0.ds().a(bww.c, 0, $$0.l($$2));
      } else {
         $$1.D = null;
      }

      $$1.A = $$0.cf();
      bwv $$10 = $$0 instanceof bxu $$9 ? $$9.C() : null;
      if ($$10 != null) {
         float $$11 = $$0.u($$2) * (float) (Math.PI / 180.0);
         ffs $$12 = $$0.t($$2).b(-$$11);
         iw $$13 = iw.a((jq)$$0.n($$2));
         iw $$14 = iw.a((jq)$$10.n($$2));
         if ($$1.F == null) {
            $$1.F = new her.a();
         }

         her.a $$15 = $$1.F;
         $$15.a = $$12;
         $$15.b = $$0.p($$2).e($$12);
         $$15.c = $$10.v($$2);
         $$15.d = this.a($$0, $$13);
         $$15.e = this.d.a($$10).a($$10, $$14);
         $$15.f = $$0.dV().a(dki.a, $$13);
         $$15.g = $$0.dV().a(dki.a, $$14);
      } else {
         $$1.F = null;
      }

      $$1.B = $$0.cF();
   }
}
