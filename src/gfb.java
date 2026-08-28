import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class gfb {
   private static final int a = 0;
   private static final int b = 1;
   static final jf[] c = jf.values();
   private final fgy d;
   private static final int e = 100;
   static final ThreadLocal<gfb.d> f = ThreadLocal.withInitial(gfb.d::new);

   public gfb(fgy $$0) {
      this.d = $$0;
   }

   public void a(dbj $$0, grr $$1, dsl $$2, ja $$3, fao $$4, fas $$5, boolean $$6, ayo $$7, long $$8, int $$9) {
      boolean $$10 = ffw.P() && $$2.h() == 0 && $$1.a();
      ewh $$11 = $$2.n($$0, $$3);
      $$4.a($$11.c, $$11.d, $$11.e);

      try {
         if ($$10) {
            this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         } else {
            this.c($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         }
      } catch (Throwable var17) {
         o $$13 = o.a(var17, "Tesselating block model");
         p $$14 = $$13.a("Block model being tesselated");
         p.a($$14, $$0, $$3, $$2);
         $$14.a("Using AO", $$10);
         throw new y($$13);
      }
   }

   public void b(dbj $$0, grr $$1, dsl $$2, ja $$3, fao $$4, fas $$5, boolean $$6, ayo $$7, long $$8, int $$9) {
      float[] $$10 = new float[c.length * 2];
      BitSet $$11 = new BitSet(3);
      gfb.b $$12 = new gfb.b();
      ja.a $$13 = $$3.j();

      for (jf $$14 : c) {
         $$7.b($$8);
         List<gfc> $$15 = $$1.a($$2, $$14, $$7);
         if (!$$15.isEmpty()) {
            $$13.a($$3, $$14);
            if (!$$6 || dfi.a($$2, $$0, $$3, $$14, $$13)) {
               this.a($$0, $$2, $$3, $$4, $$5, $$15, $$10, $$11, $$12, $$9);
            }
         }
      }

      $$7.b($$8);
      List<gfc> $$16 = $$1.a($$2, null, $$7);
      if (!$$16.isEmpty()) {
         this.a($$0, $$2, $$3, $$4, $$5, $$16, $$10, $$11, $$12, $$9);
      }
   }

   public void c(dbj $$0, grr $$1, dsl $$2, ja $$3, fao $$4, fas $$5, boolean $$6, ayo $$7, long $$8, int $$9) {
      BitSet $$10 = new BitSet(3);
      ja.a $$11 = $$3.j();

      for (jf $$12 : c) {
         $$7.b($$8);
         List<gfc> $$13 = $$1.a($$2, $$12, $$7);
         if (!$$13.isEmpty()) {
            $$11.a($$3, $$12);
            if (!$$6 || dfi.a($$2, $$0, $$3, $$12, $$11)) {
               int $$14 = ged.a($$0, $$2, $$11);
               this.a($$0, $$2, $$3, $$14, $$9, false, $$4, $$5, $$13, $$10);
            }
         }
      }

      $$7.b($$8);
      List<gfc> $$15 = $$1.a($$2, null, $$7);
      if (!$$15.isEmpty()) {
         this.a($$0, $$2, $$3, -1, $$9, true, $$4, $$5, $$15, $$10);
      }
   }

   private void a(dbj $$0, dsl $$1, ja $$2, fao $$3, fas $$4, List<gfc> $$5, float[] $$6, BitSet $$7, gfb.b $$8, int $$9) {
      for (gfc $$10 : $$5) {
         this.a($$0, $$1, $$2, $$10.b(), $$10.e(), $$6, $$7);
         $$8.a($$0, $$1, $$2, $$10.e(), $$6, $$7, $$10.f());
         this.a($$0, $$1, $$2, $$4, $$3.c(), $$10, $$8.a[0], $$8.a[1], $$8.a[2], $$8.a[3], $$8.b[0], $$8.b[1], $$8.b[2], $$8.b[3], $$9);
      }
   }

   private void a(
      dbj $$0, dsl $$1, ja $$2, fas $$3, fao.a $$4, gfc $$5, float $$6, float $$7, float $$8, float $$9, int $$10, int $$11, int $$12, int $$13, int $$14
   ) {
      float $$16;
      float $$17;
      float $$18;
      if ($$5.c()) {
         int $$15 = this.d.a($$1, $$0, $$2, $$5.d());
         $$16 = (float)($$15 >> 16 & 0xFF) / 255.0F;
         $$17 = (float)($$15 >> 8 & 0xFF) / 255.0F;
         $$18 = (float)($$15 & 0xFF) / 255.0F;
      } else {
         $$16 = 1.0F;
         $$17 = 1.0F;
         $$18 = 1.0F;
      }

      $$3.a($$4, $$5, new float[]{$$6, $$7, $$8, $$9}, $$16, $$17, $$18, 1.0F, new int[]{$$10, $$11, $$12, $$13}, $$14, true);
   }

   private void a(dbj $$0, dsl $$1, ja $$2, int[] $$3, jf $$4, @Nullable float[] $$5, BitSet $$6) {
      float $$7 = 32.0F;
      float $$8 = 32.0F;
      float $$9 = 32.0F;
      float $$10 = -32.0F;
      float $$11 = -32.0F;
      float $$12 = -32.0F;

      for (int $$13 = 0; $$13 < 4; $$13++) {
         float $$14 = Float.intBitsToFloat($$3[$$13 * 8]);
         float $$15 = Float.intBitsToFloat($$3[$$13 * 8 + 1]);
         float $$16 = Float.intBitsToFloat($$3[$$13 * 8 + 2]);
         $$7 = Math.min($$7, $$14);
         $$8 = Math.min($$8, $$15);
         $$9 = Math.min($$9, $$16);
         $$10 = Math.max($$10, $$14);
         $$11 = Math.max($$11, $$15);
         $$12 = Math.max($$12, $$16);
      }

      if ($$5 != null) {
         $$5[jf.e.d()] = $$7;
         $$5[jf.f.d()] = $$10;
         $$5[jf.a.d()] = $$8;
         $$5[jf.b.d()] = $$11;
         $$5[jf.c.d()] = $$9;
         $$5[jf.d.d()] = $$12;
         int $$17 = c.length;
         $$5[jf.e.d() + $$17] = 1.0F - $$7;
         $$5[jf.f.d() + $$17] = 1.0F - $$10;
         $$5[jf.a.d() + $$17] = 1.0F - $$8;
         $$5[jf.b.d() + $$17] = 1.0F - $$11;
         $$5[jf.c.d() + $$17] = 1.0F - $$9;
         $$5[jf.d.d() + $$17] = 1.0F - $$12;
      }

      float $$18 = 1.0E-4F;
      float $$19 = 0.9999F;
      switch ($$4) {
         case a:
            $$6.set(1, $$7 >= 1.0E-4F || $$9 >= 1.0E-4F || $$10 <= 0.9999F || $$12 <= 0.9999F);
            $$6.set(0, $$8 == $$11 && ($$8 < 1.0E-4F || $$1.r($$0, $$2)));
            break;
         case b:
            $$6.set(1, $$7 >= 1.0E-4F || $$9 >= 1.0E-4F || $$10 <= 0.9999F || $$12 <= 0.9999F);
            $$6.set(0, $$8 == $$11 && ($$11 > 0.9999F || $$1.r($$0, $$2)));
            break;
         case c:
            $$6.set(1, $$7 >= 1.0E-4F || $$8 >= 1.0E-4F || $$10 <= 0.9999F || $$11 <= 0.9999F);
            $$6.set(0, $$9 == $$12 && ($$9 < 1.0E-4F || $$1.r($$0, $$2)));
            break;
         case d:
            $$6.set(1, $$7 >= 1.0E-4F || $$8 >= 1.0E-4F || $$10 <= 0.9999F || $$11 <= 0.9999F);
            $$6.set(0, $$9 == $$12 && ($$12 > 0.9999F || $$1.r($$0, $$2)));
            break;
         case e:
            $$6.set(1, $$8 >= 1.0E-4F || $$9 >= 1.0E-4F || $$11 <= 0.9999F || $$12 <= 0.9999F);
            $$6.set(0, $$7 == $$10 && ($$7 < 1.0E-4F || $$1.r($$0, $$2)));
            break;
         case f:
            $$6.set(1, $$8 >= 1.0E-4F || $$9 >= 1.0E-4F || $$11 <= 0.9999F || $$12 <= 0.9999F);
            $$6.set(0, $$7 == $$10 && ($$10 > 0.9999F || $$1.r($$0, $$2)));
      }
   }

   private void a(dbj $$0, dsl $$1, ja $$2, int $$3, int $$4, boolean $$5, fao $$6, fas $$7, List<gfc> $$8, BitSet $$9) {
      for (gfc $$10 : $$8) {
         if ($$5) {
            this.a($$0, $$1, $$2, $$10.b(), $$10.e(), null, $$9);
            ja $$11 = $$9.get(0) ? $$2.a($$10.e()) : $$2;
            $$3 = ged.a($$0, $$1, $$11);
         }

         float $$12 = $$0.a($$10.e(), $$10.f());
         this.a($$0, $$1, $$2, $$7, $$6.c(), $$10, $$12, $$12, $$12, $$12, $$3, $$3, $$3, $$3, $$4);
      }
   }

   public void a(fao.a $$0, fas $$1, @Nullable dsl $$2, grr $$3, float $$4, float $$5, float $$6, int $$7, int $$8) {
      ayo $$9 = ayo.a();
      long $$10 = 42L;

      for (jf $$11 : c) {
         $$9.b(42L);
         a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, $$11, $$9), $$7, $$8);
      }

      $$9.b(42L);
      a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, null, $$9), $$7, $$8);
   }

   private static void a(fao.a $$0, fas $$1, float $$2, float $$3, float $$4, List<gfc> $$5, int $$6, int $$7) {
      for (gfc $$8 : $$5) {
         float $$9;
         float $$10;
         float $$11;
         if ($$8.c()) {
            $$9 = ayg.a($$2, 0.0F, 1.0F);
            $$10 = ayg.a($$3, 0.0F, 1.0F);
            $$11 = ayg.a($$4, 0.0F, 1.0F);
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
         }

         $$1.a($$0, $$8, $$9, $$10, $$11, 1.0F, $$6, $$7);
      }
   }

   public static void a() {
      f.get().a();
   }

   public static void b() {
      f.get().b();
   }

   protected static enum a {
      a(
         new jf[]{jf.e, jf.f, jf.c, jf.d},
         0.5F,
         true,
         new gfb.e[]{gfb.e.k, gfb.e.d, gfb.e.k, gfb.e.j, gfb.e.e, gfb.e.j, gfb.e.e, gfb.e.d},
         new gfb.e[]{gfb.e.k, gfb.e.c, gfb.e.k, gfb.e.i, gfb.e.e, gfb.e.i, gfb.e.e, gfb.e.c},
         new gfb.e[]{gfb.e.l, gfb.e.c, gfb.e.l, gfb.e.i, gfb.e.f, gfb.e.i, gfb.e.f, gfb.e.c},
         new gfb.e[]{gfb.e.l, gfb.e.d, gfb.e.l, gfb.e.j, gfb.e.f, gfb.e.j, gfb.e.f, gfb.e.d}
      ),
      b(
         new jf[]{jf.f, jf.e, jf.c, jf.d},
         1.0F,
         true,
         new gfb.e[]{gfb.e.f, gfb.e.d, gfb.e.f, gfb.e.j, gfb.e.l, gfb.e.j, gfb.e.l, gfb.e.d},
         new gfb.e[]{gfb.e.f, gfb.e.c, gfb.e.f, gfb.e.i, gfb.e.l, gfb.e.i, gfb.e.l, gfb.e.c},
         new gfb.e[]{gfb.e.e, gfb.e.c, gfb.e.e, gfb.e.i, gfb.e.k, gfb.e.i, gfb.e.k, gfb.e.c},
         new gfb.e[]{gfb.e.e, gfb.e.d, gfb.e.e, gfb.e.j, gfb.e.k, gfb.e.j, gfb.e.k, gfb.e.d}
      ),
      c(
         new jf[]{jf.b, jf.a, jf.f, jf.e},
         0.8F,
         true,
         new gfb.e[]{gfb.e.b, gfb.e.k, gfb.e.b, gfb.e.e, gfb.e.h, gfb.e.e, gfb.e.h, gfb.e.k},
         new gfb.e[]{gfb.e.b, gfb.e.l, gfb.e.b, gfb.e.f, gfb.e.h, gfb.e.f, gfb.e.h, gfb.e.l},
         new gfb.e[]{gfb.e.a, gfb.e.l, gfb.e.a, gfb.e.f, gfb.e.g, gfb.e.f, gfb.e.g, gfb.e.l},
         new gfb.e[]{gfb.e.a, gfb.e.k, gfb.e.a, gfb.e.e, gfb.e.g, gfb.e.e, gfb.e.g, gfb.e.k}
      ),
      d(
         new jf[]{jf.e, jf.f, jf.a, jf.b},
         0.8F,
         true,
         new gfb.e[]{gfb.e.b, gfb.e.k, gfb.e.h, gfb.e.k, gfb.e.h, gfb.e.e, gfb.e.b, gfb.e.e},
         new gfb.e[]{gfb.e.a, gfb.e.k, gfb.e.g, gfb.e.k, gfb.e.g, gfb.e.e, gfb.e.a, gfb.e.e},
         new gfb.e[]{gfb.e.a, gfb.e.l, gfb.e.g, gfb.e.l, gfb.e.g, gfb.e.f, gfb.e.a, gfb.e.f},
         new gfb.e[]{gfb.e.b, gfb.e.l, gfb.e.h, gfb.e.l, gfb.e.h, gfb.e.f, gfb.e.b, gfb.e.f}
      ),
      e(
         new jf[]{jf.b, jf.a, jf.c, jf.d},
         0.6F,
         true,
         new gfb.e[]{gfb.e.b, gfb.e.d, gfb.e.b, gfb.e.j, gfb.e.h, gfb.e.j, gfb.e.h, gfb.e.d},
         new gfb.e[]{gfb.e.b, gfb.e.c, gfb.e.b, gfb.e.i, gfb.e.h, gfb.e.i, gfb.e.h, gfb.e.c},
         new gfb.e[]{gfb.e.a, gfb.e.c, gfb.e.a, gfb.e.i, gfb.e.g, gfb.e.i, gfb.e.g, gfb.e.c},
         new gfb.e[]{gfb.e.a, gfb.e.d, gfb.e.a, gfb.e.j, gfb.e.g, gfb.e.j, gfb.e.g, gfb.e.d}
      ),
      f(
         new jf[]{jf.a, jf.b, jf.c, jf.d},
         0.6F,
         true,
         new gfb.e[]{gfb.e.g, gfb.e.d, gfb.e.g, gfb.e.j, gfb.e.a, gfb.e.j, gfb.e.a, gfb.e.d},
         new gfb.e[]{gfb.e.g, gfb.e.c, gfb.e.g, gfb.e.i, gfb.e.a, gfb.e.i, gfb.e.a, gfb.e.c},
         new gfb.e[]{gfb.e.h, gfb.e.c, gfb.e.h, gfb.e.i, gfb.e.b, gfb.e.i, gfb.e.b, gfb.e.c},
         new gfb.e[]{gfb.e.h, gfb.e.d, gfb.e.h, gfb.e.j, gfb.e.b, gfb.e.j, gfb.e.b, gfb.e.d}
      );

      final jf[] g;
      final boolean h;
      final gfb.e[] i;
      final gfb.e[] j;
      final gfb.e[] k;
      final gfb.e[] l;
      private static final gfb.a[] m = ac.a(new gfb.a[6], $$0 -> {
         $$0[jf.a.d()] = a;
         $$0[jf.b.d()] = b;
         $$0[jf.c.d()] = c;
         $$0[jf.d.d()] = d;
         $$0[jf.e.d()] = e;
         $$0[jf.f.d()] = f;
      });

      private a(final jf[] $$0, final float $$1, final boolean $$2, final gfb.e[] $$3, final gfb.e[] $$4, final gfb.e[] $$5, final gfb.e[] $$6) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$3;
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
      }

      public static gfb.a a(jf $$0) {
         return m[$$0.d()];
      }
   }

   static class b {
      final float[] a = new float[4];
      final int[] b = new int[4];

      public b() {
      }

      public void a(dbj $$0, dsl $$1, ja $$2, jf $$3, float[] $$4, BitSet $$5, boolean $$6) {
         ja $$7 = $$5.get(0) ? $$2.a($$3) : $$2;
         gfb.a $$8 = gfb.a.a($$3);
         ja.a $$9 = new ja.a();
         gfb.d $$10 = gfb.f.get();
         $$9.a($$7, $$8.g[0]);
         dsl $$11 = $$0.a_($$9);
         int $$12 = $$10.a($$11, $$0, $$9);
         float $$13 = $$10.b($$11, $$0, $$9);
         $$9.a($$7, $$8.g[1]);
         dsl $$14 = $$0.a_($$9);
         int $$15 = $$10.a($$14, $$0, $$9);
         float $$16 = $$10.b($$14, $$0, $$9);
         $$9.a($$7, $$8.g[2]);
         dsl $$17 = $$0.a_($$9);
         int $$18 = $$10.a($$17, $$0, $$9);
         float $$19 = $$10.b($$17, $$0, $$9);
         $$9.a($$7, $$8.g[3]);
         dsl $$20 = $$0.a_($$9);
         int $$21 = $$10.a($$20, $$0, $$9);
         float $$22 = $$10.b($$20, $$0, $$9);
         dsl $$23 = $$0.a_($$9.a($$7, $$8.g[0]).c($$3));
         boolean $$24 = !$$23.p($$0, $$9) || $$23.b($$0, $$9) == 0;
         dsl $$25 = $$0.a_($$9.a($$7, $$8.g[1]).c($$3));
         boolean $$26 = !$$25.p($$0, $$9) || $$25.b($$0, $$9) == 0;
         dsl $$27 = $$0.a_($$9.a($$7, $$8.g[2]).c($$3));
         boolean $$28 = !$$27.p($$0, $$9) || $$27.b($$0, $$9) == 0;
         dsl $$29 = $$0.a_($$9.a($$7, $$8.g[3]).c($$3));
         boolean $$30 = !$$29.p($$0, $$9) || $$29.b($$0, $$9) == 0;
         float $$34;
         int $$35;
         if (!$$28 && !$$24) {
            $$34 = $$13;
            $$35 = $$12;
         } else {
            $$9.a($$7, $$8.g[0]).c($$8.g[2]);
            dsl $$31 = $$0.a_($$9);
            $$34 = $$10.b($$31, $$0, $$9);
            $$35 = $$10.a($$31, $$0, $$9);
         }

         float $$39;
         int $$40;
         if (!$$30 && !$$24) {
            $$39 = $$13;
            $$40 = $$12;
         } else {
            $$9.a($$7, $$8.g[0]).c($$8.g[3]);
            dsl $$36 = $$0.a_($$9);
            $$39 = $$10.b($$36, $$0, $$9);
            $$40 = $$10.a($$36, $$0, $$9);
         }

         float $$44;
         int $$45;
         if (!$$28 && !$$26) {
            $$44 = $$13;
            $$45 = $$12;
         } else {
            $$9.a($$7, $$8.g[1]).c($$8.g[2]);
            dsl $$41 = $$0.a_($$9);
            $$44 = $$10.b($$41, $$0, $$9);
            $$45 = $$10.a($$41, $$0, $$9);
         }

         float $$49;
         int $$50;
         if (!$$30 && !$$26) {
            $$49 = $$13;
            $$50 = $$12;
         } else {
            $$9.a($$7, $$8.g[1]).c($$8.g[3]);
            dsl $$46 = $$0.a_($$9);
            $$49 = $$10.b($$46, $$0, $$9);
            $$50 = $$10.a($$46, $$0, $$9);
         }

         int $$51 = $$10.a($$1, $$0, $$2);
         $$9.a($$2, $$3);
         dsl $$52 = $$0.a_($$9);
         if ($$5.get(0) || !$$52.i($$0, $$9)) {
            $$51 = $$10.a($$52, $$0, $$9);
         }

         float $$53 = $$5.get(0) ? $$10.b($$0.a_($$7), $$0, $$7) : $$10.b($$0.a_($$2), $$0, $$2);
         gfb.c $$54 = gfb.c.a($$3);
         if ($$5.get(1) && $$8.h) {
            float $$59 = ($$22 + $$13 + $$39 + $$53) * 0.25F;
            float $$60 = ($$19 + $$13 + $$34 + $$53) * 0.25F;
            float $$61 = ($$19 + $$16 + $$44 + $$53) * 0.25F;
            float $$62 = ($$22 + $$16 + $$49 + $$53) * 0.25F;
            float $$63 = $$4[$$8.i[0].m] * $$4[$$8.i[1].m];
            float $$64 = $$4[$$8.i[2].m] * $$4[$$8.i[3].m];
            float $$65 = $$4[$$8.i[4].m] * $$4[$$8.i[5].m];
            float $$66 = $$4[$$8.i[6].m] * $$4[$$8.i[7].m];
            float $$67 = $$4[$$8.j[0].m] * $$4[$$8.j[1].m];
            float $$68 = $$4[$$8.j[2].m] * $$4[$$8.j[3].m];
            float $$69 = $$4[$$8.j[4].m] * $$4[$$8.j[5].m];
            float $$70 = $$4[$$8.j[6].m] * $$4[$$8.j[7].m];
            float $$71 = $$4[$$8.k[0].m] * $$4[$$8.k[1].m];
            float $$72 = $$4[$$8.k[2].m] * $$4[$$8.k[3].m];
            float $$73 = $$4[$$8.k[4].m] * $$4[$$8.k[5].m];
            float $$74 = $$4[$$8.k[6].m] * $$4[$$8.k[7].m];
            float $$75 = $$4[$$8.l[0].m] * $$4[$$8.l[1].m];
            float $$76 = $$4[$$8.l[2].m] * $$4[$$8.l[3].m];
            float $$77 = $$4[$$8.l[4].m] * $$4[$$8.l[5].m];
            float $$78 = $$4[$$8.l[6].m] * $$4[$$8.l[7].m];
            this.a[$$54.g] = $$59 * $$63 + $$60 * $$64 + $$61 * $$65 + $$62 * $$66;
            this.a[$$54.h] = $$59 * $$67 + $$60 * $$68 + $$61 * $$69 + $$62 * $$70;
            this.a[$$54.i] = $$59 * $$71 + $$60 * $$72 + $$61 * $$73 + $$62 * $$74;
            this.a[$$54.j] = $$59 * $$75 + $$60 * $$76 + $$61 * $$77 + $$62 * $$78;
            int $$79 = this.a($$21, $$12, $$40, $$51);
            int $$80 = this.a($$18, $$12, $$35, $$51);
            int $$81 = this.a($$18, $$15, $$45, $$51);
            int $$82 = this.a($$21, $$15, $$50, $$51);
            this.b[$$54.g] = this.a($$79, $$80, $$81, $$82, $$63, $$64, $$65, $$66);
            this.b[$$54.h] = this.a($$79, $$80, $$81, $$82, $$67, $$68, $$69, $$70);
            this.b[$$54.i] = this.a($$79, $$80, $$81, $$82, $$71, $$72, $$73, $$74);
            this.b[$$54.j] = this.a($$79, $$80, $$81, $$82, $$75, $$76, $$77, $$78);
         } else {
            float $$55 = ($$22 + $$13 + $$39 + $$53) * 0.25F;
            float $$56 = ($$19 + $$13 + $$34 + $$53) * 0.25F;
            float $$57 = ($$19 + $$16 + $$44 + $$53) * 0.25F;
            float $$58 = ($$22 + $$16 + $$49 + $$53) * 0.25F;
            this.b[$$54.g] = this.a($$21, $$12, $$40, $$51);
            this.b[$$54.h] = this.a($$18, $$12, $$35, $$51);
            this.b[$$54.i] = this.a($$18, $$15, $$45, $$51);
            this.b[$$54.j] = this.a($$21, $$15, $$50, $$51);
            this.a[$$54.g] = $$55;
            this.a[$$54.h] = $$56;
            this.a[$$54.i] = $$57;
            this.a[$$54.j] = $$58;
         }

         float $$83 = $$0.a($$3, $$6);

         for (int $$84 = 0; $$84 < this.a.length; $$84++) {
            this.a[$$84] = this.a[$$84] * $$83;
         }
      }

      private int a(int $$0, int $$1, int $$2, int $$3) {
         if ($$0 == 0) {
            $$0 = $$3;
         }

         if ($$1 == 0) {
            $$1 = $$3;
         }

         if ($$2 == 0) {
            $$2 = $$3;
         }

         return $$0 + $$1 + $$2 + $$3 >> 2 & 16711935;
      }

      private int a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         int $$8 = (int)((float)($$0 >> 16 & 0xFF) * $$4 + (float)($$1 >> 16 & 0xFF) * $$5 + (float)($$2 >> 16 & 0xFF) * $$6 + (float)($$3 >> 16 & 0xFF) * $$7)
            & 0xFF;
         int $$9 = (int)((float)($$0 & 0xFF) * $$4 + (float)($$1 & 0xFF) * $$5 + (float)($$2 & 0xFF) * $$6 + (float)($$3 & 0xFF) * $$7) & 0xFF;
         return $$8 << 16 | $$9;
      }
   }

   static enum c {
      a(0, 1, 2, 3),
      b(2, 3, 0, 1),
      c(3, 0, 1, 2),
      d(0, 1, 2, 3),
      e(3, 0, 1, 2),
      f(1, 2, 3, 0);

      final int g;
      final int h;
      final int i;
      final int j;
      private static final gfb.c[] k = ac.a(new gfb.c[6], $$0 -> {
         $$0[jf.a.d()] = a;
         $$0[jf.b.d()] = b;
         $$0[jf.c.d()] = c;
         $$0[jf.d.d()] = d;
         $$0[jf.e.d()] = e;
         $$0[jf.f.d()] = f;
      });

      private c(final int $$0, final int $$1, final int $$2, final int $$3) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
      }

      public static gfb.c a(jf $$0) {
         return k[$$0.d()];
      }
   }

   static class d {
      private boolean a;
      private final Long2IntLinkedOpenHashMap b = ac.a(() -> {
         Long2IntLinkedOpenHashMap $$0 = new Long2IntLinkedOpenHashMap(100, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0.defaultReturnValue(Integer.MAX_VALUE);
         return $$0;
      });
      private final Long2FloatLinkedOpenHashMap c = ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0 = new Long2FloatLinkedOpenHashMap(100, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0.defaultReturnValue(Float.NaN);
         return $$0;
      });

      private d() {
      }

      public void a() {
         this.a = true;
      }

      public void b() {
         this.a = false;
         this.b.clear();
         this.c.clear();
      }

      public int a(dsl $$0, dbj $$1, ja $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            int $$4 = this.b.get($$3);
            if ($$4 != Integer.MAX_VALUE) {
               return $$4;
            }
         }

         int $$5 = ged.a($$1, $$0, $$2);
         if (this.a) {
            if (this.b.size() == 100) {
               this.b.removeFirstInt();
            }

            this.b.put($$3, $$5);
         }

         return $$5;
      }

      public float b(dsl $$0, dbj $$1, ja $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            float $$4 = this.c.get($$3);
            if (!Float.isNaN($$4)) {
               return $$4;
            }
         }

         float $$5 = $$0.f($$1, $$2);
         if (this.a) {
            if (this.c.size() == 100) {
               this.c.removeFirstFloat();
            }

            this.c.put($$3, $$5);
         }

         return $$5;
      }
   }

   protected static enum e {
      a(jf.a, false),
      b(jf.b, false),
      c(jf.c, false),
      d(jf.d, false),
      e(jf.e, false),
      f(jf.f, false),
      g(jf.a, true),
      h(jf.b, true),
      i(jf.c, true),
      j(jf.d, true),
      k(jf.e, true),
      l(jf.f, true);

      final int m;

      private e(final jf $$0, final boolean $$1) {
         this.m = $$0.d() + ($$1 ? gfb.c.length : 0);
      }
   }
}
