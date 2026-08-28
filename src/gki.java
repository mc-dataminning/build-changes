import org.joml.Matrix4f;

public abstract class gki<T extends bsr> {
   protected static final float b = 0.025F;
   public static final int c = 24;
   protected final gkh d;
   private final fhx a;
   protected float e;
   protected float f = 1.0F;

   protected gki(gkj.a $$0) {
      this.d = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      jd $$2 = jd.a((jw)$$0.l($$1));
      return gey.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, jd $$1) {
      return $$0.dO().a(ddf.a, $$1);
   }

   protected int a(T $$0, jd $$1) {
      return $$0.bR() ? 15 : $$0.dO().a(ddf.b, $$1);
   }

   public boolean a(T $$0, gie $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.au) {
         return true;
      } else {
         ewx $$5 = $$0.h_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new ewx($$0.dt() - 2.0, $$0.dv() - 2.0, $$0.dz() - 2.0, $$0.dt() + 2.0, $$0.dv() + 2.0, $$0.dz() + 2.0);
         }

         if ($$1.a($$5)) {
            return true;
         } else {
            if ($$0 instanceof btk $$6) {
               bsr $$7 = $$6.A();
               if ($$7 != null) {
                  return $$1.a($$7.h_());
               }
            }

            return false;
         }
      }
   }

   public exc a(T $$0, float $$1) {
      return exc.b;
   }

   public void a(T $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      if ($$0 instanceof btk $$6) {
         bsr $$7 = $$6.A();
         if ($$7 != null) {
            this.a($$0, $$2, $$3, $$4, $$7);
         }
      }

      if (this.b($$0)) {
         this.a($$0, $$0.S_(), $$3, $$4, $$5, $$2);
      }
   }

   private <E extends bsr> void a(T $$0, float $$1, fbi $$2, gez $$3, E $$4) {
      $$2.a();
      exc $$5 = $$4.s($$1);
      double $$6 = (double)($$0.r($$1) * (float) (Math.PI / 180.0)) + (Math.PI / 2);
      exc $$7 = $$0.q($$1);
      double $$8 = Math.cos($$6) * $$7.e + Math.sin($$6) * $$7.c;
      double $$9 = Math.sin($$6) * $$7.e - Math.cos($$6) * $$7.c;
      double $$10 = ayo.d((double)$$1, $$0.L, $$0.dt()) + $$8;
      double $$11 = ayo.d((double)$$1, $$0.M, $$0.dv()) + $$7.d;
      double $$12 = ayo.d((double)$$1, $$0.N, $$0.dz()) + $$9;
      $$2.a($$8, $$7.d, $$9);
      float $$13 = (float)($$5.c - $$10);
      float $$14 = (float)($$5.d - $$11);
      float $$15 = (float)($$5.e - $$12);
      float $$16 = 0.025F;
      fbm $$17 = $$3.getBuffer(gfh.h());
      Matrix4f $$18 = $$2.c().a();
      float $$19 = ayo.i($$13 * $$13 + $$15 * $$15) * 0.025F / 2.0F;
      float $$20 = $$15 * $$19;
      float $$21 = $$13 * $$19;
      jd $$22 = jd.a((jw)$$0.k($$1));
      jd $$23 = jd.a((jw)$$4.k($$1));
      int $$24 = this.a($$0, $$22);
      int $$25 = this.d.a($$4).a($$4, $$23);
      int $$26 = $$0.dO().a(ddf.a, $$22);
      int $$27 = $$0.dO().a(ddf.a, $$23);

      for (int $$28 = 0; $$28 <= 24; $$28++) {
         a($$17, $$18, $$13, $$14, $$15, $$24, $$25, $$26, $$27, 0.025F, 0.025F, $$20, $$21, $$28, false);
      }

      for (int $$29 = 24; $$29 >= 0; $$29--) {
         a($$17, $$18, $$13, $$14, $$15, $$24, $$25, $$26, $$27, 0.025F, 0.0F, $$20, $$21, $$29, true);
      }

      $$2.b();
   }

   private static void a(
      fbm $$0,
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
      int $$16 = (int)ayo.i($$15, (float)$$5, (float)$$6);
      int $$17 = (int)ayo.i($$15, (float)$$7, (float)$$8);
      int $$18 = gey.a($$16, $$17);
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

   protected boolean b(T $$0) {
      return $$0.cF() || $$0.ai() && $$0 == this.d.c;
   }

   public abstract akr a(T var1);

   public fhx b() {
      return this.a;
   }

   protected void a(T $$0, wz $$1, fbi $$2, gez $$3, int $$4, float $$5) {
      double $$6 = this.d.b($$0);
      if (!($$6 > 4096.0)) {
         exc $$7 = $$0.dl().a(bss.c, 0, $$0.i($$5));
         if ($$7 != null) {
            boolean $$8 = !$$0.bZ();
            int $$9 = "deadmau5".equals($$1.getString()) ? -10 : 0;
            $$2.a();
            $$2.a($$7.c, $$7.d + 0.5, $$7.e);
            $$2.a(this.d.b());
            $$2.b(0.025F, -0.025F, 0.025F);
            Matrix4f $$10 = $$2.c().a();
            float $$11 = fgo.Q().m.a(0.25F);
            int $$12 = (int)($$11 * 255.0F) << 24;
            fhx $$13 = this.b();
            float $$14 = (float)(-$$13.a($$1) / 2);
            $$13.a($$1, $$14, (float)$$9, 553648127, false, $$10, $$3, $$8 ? fhx.a.b : fhx.a.a, $$12, $$4);
            if ($$8) {
               $$13.a($$1, $$14, (float)$$9, -1, false, $$10, $$3, fhx.a.a, 0, $$4);
            }

            $$2.b();
         }
      }
   }

   protected float c(T $$0) {
      return this.e;
   }
}
