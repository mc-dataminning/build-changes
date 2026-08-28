import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class ghw {
   private static final int a = 0;
   private static final int b = 1;
   static final jj[] c = jj.values();
   private final fjd d;
   private static final int e = 100;
   static final ThreadLocal<ghw.d> f = ThreadLocal.withInitial(ghw.d::new);

   public ghw(fjd $$0) {
      this.d = $$0;
   }

   public void a(dcu $$0, gym $$1, dua $$2, je $$3, fcu $$4, fcy $$5, boolean $$6, azk $$7, long $$8, int $$9) {
      boolean $$10 = fib.P() && $$2.k() == 0 && $$1.a();
      $$4.a($$2.a($$3));

      try {
         if ($$10) {
            this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         } else {
            this.c($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         }
      } catch (Throwable var16) {
         o $$12 = o.a(var16, "Tesselating block model");
         p $$13 = $$12.a("Block model being tesselated");
         p.a($$13, $$0, $$3, $$2);
         $$13.a("Using AO", $$10);
         throw new z($$12);
      }
   }

   public void b(dcu $$0, gym $$1, dua $$2, je $$3, fcu $$4, fcy $$5, boolean $$6, azk $$7, long $$8, int $$9) {
      float[] $$10 = new float[c.length * 2];
      BitSet $$11 = new BitSet(3);
      ghw.b $$12 = new ghw.b();
      je.a $$13 = $$3.k();

      for (jj $$14 : c) {
         $$7.b($$8);
         List<ghx> $$15 = $$1.a($$2, $$14, $$7);
         if (!$$15.isEmpty()) {
            $$13.a($$3, $$14);
            if (!$$6 || dgv.a($$2, $$0.a_($$13), $$14)) {
               this.a($$0, $$2, $$3, $$4, $$5, $$15, $$10, $$11, $$12, $$9);
            }
         }
      }

      $$7.b($$8);
      List<ghx> $$16 = $$1.a($$2, null, $$7);
      if (!$$16.isEmpty()) {
         this.a($$0, $$2, $$3, $$4, $$5, $$16, $$10, $$11, $$12, $$9);
      }
   }

   public void c(dcu $$0, gym $$1, dua $$2, je $$3, fcu $$4, fcy $$5, boolean $$6, azk $$7, long $$8, int $$9) {
      BitSet $$10 = new BitSet(3);
      je.a $$11 = $$3.k();

      for (jj $$12 : c) {
         $$7.b($$8);
         List<ghx> $$13 = $$1.a($$2, $$12, $$7);
         if (!$$13.isEmpty()) {
            $$11.a($$3, $$12);
            if (!$$6 || dgv.a($$2, $$0.a_($$11), $$12)) {
               int $$14 = ggr.a($$0, $$2, $$11);
               this.a($$0, $$2, $$3, $$14, $$9, false, $$4, $$5, $$13, $$10);
            }
         }
      }

      $$7.b($$8);
      List<ghx> $$15 = $$1.a($$2, null, $$7);
      if (!$$15.isEmpty()) {
         this.a($$0, $$2, $$3, -1, $$9, true, $$4, $$5, $$15, $$10);
      }
   }

   private void a(dcu $$0, dua $$1, je $$2, fcu $$3, fcy $$4, List<ghx> $$5, float[] $$6, BitSet $$7, ghw.b $$8, int $$9) {
      for (ghx $$10 : $$5) {
         this.a($$0, $$1, $$2, $$10.b(), $$10.e(), $$6, $$7);
         $$8.a($$0, $$1, $$2, $$6, $$7, $$10);
         this.a($$0, $$1, $$2, $$4, $$3.c(), $$10, $$8.a[0], $$8.a[1], $$8.a[2], $$8.a[3], $$8.b[0], $$8.b[1], $$8.b[2], $$8.b[3], $$9);
      }
   }

   private void a(
      dcu $$0, dua $$1, je $$2, fcy $$3, fcu.a $$4, ghx $$5, float $$6, float $$7, float $$8, float $$9, int $$10, int $$11, int $$12, int $$13, int $$14
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

   private void a(dcu $$0, dua $$1, je $$2, int[] $$3, jj $$4, @Nullable float[] $$5, BitSet $$6) {
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
         $$5[jj.e.d()] = $$7;
         $$5[jj.f.d()] = $$10;
         $$5[jj.a.d()] = $$8;
         $$5[jj.b.d()] = $$11;
         $$5[jj.c.d()] = $$9;
         $$5[jj.d.d()] = $$12;
         int $$17 = c.length;
         $$5[jj.e.d() + $$17] = 1.0F - $$7;
         $$5[jj.f.d() + $$17] = 1.0F - $$10;
         $$5[jj.a.d() + $$17] = 1.0F - $$8;
         $$5[jj.b.d() + $$17] = 1.0F - $$11;
         $$5[jj.c.d() + $$17] = 1.0F - $$9;
         $$5[jj.d.d() + $$17] = 1.0F - $$12;
      }

      float $$18 = 1.0E-4F;
      float $$19 = 0.9999F;
      switch ($$4) {
         case a:
            $$6.set(1, $$7 >= 1.0E-4F || $$9 >= 1.0E-4F || $$10 <= 0.9999F || $$12 <= 0.9999F);
            $$6.set(0, $$8 == $$11 && ($$8 < 1.0E-4F || $$1.m($$0, $$2)));
            break;
         case b:
            $$6.set(1, $$7 >= 1.0E-4F || $$9 >= 1.0E-4F || $$10 <= 0.9999F || $$12 <= 0.9999F);
            $$6.set(0, $$8 == $$11 && ($$11 > 0.9999F || $$1.m($$0, $$2)));
            break;
         case c:
            $$6.set(1, $$7 >= 1.0E-4F || $$8 >= 1.0E-4F || $$10 <= 0.9999F || $$11 <= 0.9999F);
            $$6.set(0, $$9 == $$12 && ($$9 < 1.0E-4F || $$1.m($$0, $$2)));
            break;
         case d:
            $$6.set(1, $$7 >= 1.0E-4F || $$8 >= 1.0E-4F || $$10 <= 0.9999F || $$11 <= 0.9999F);
            $$6.set(0, $$9 == $$12 && ($$12 > 0.9999F || $$1.m($$0, $$2)));
            break;
         case e:
            $$6.set(1, $$8 >= 1.0E-4F || $$9 >= 1.0E-4F || $$11 <= 0.9999F || $$12 <= 0.9999F);
            $$6.set(0, $$7 == $$10 && ($$7 < 1.0E-4F || $$1.m($$0, $$2)));
            break;
         case f:
            $$6.set(1, $$8 >= 1.0E-4F || $$9 >= 1.0E-4F || $$11 <= 0.9999F || $$12 <= 0.9999F);
            $$6.set(0, $$7 == $$10 && ($$10 > 0.9999F || $$1.m($$0, $$2)));
      }
   }

   private void a(dcu $$0, dua $$1, je $$2, int $$3, int $$4, boolean $$5, fcu $$6, fcy $$7, List<ghx> $$8, BitSet $$9) {
      for (ghx $$10 : $$8) {
         int $$11 = $$3;
         if ($$5) {
            this.a($$0, $$1, $$2, $$10.b(), $$10.e(), null, $$9);
            je $$12 = $$9.get(0) ? $$2.a($$10.e()) : $$2;
            $$11 = ggr.a($$0, $$1, $$12);
         }

         if ($$10.g()) {
            $$11 = ggt.b($$11, $$10.h());
         }

         float $$13 = $$0.a($$10.e(), $$10.f());
         this.a($$0, $$1, $$2, $$7, $$6.c(), $$10, $$13, $$13, $$13, $$13, $$11, $$11, $$11, $$11, $$4);
      }
   }

   public void a(fcu.a $$0, fcy $$1, @Nullable dua $$2, gym $$3, float $$4, float $$5, float $$6, int $$7, int $$8) {
      azk $$9 = azk.a();
      long $$10 = 42L;

      for (jj $$11 : c) {
         $$9.b(42L);
         a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, $$11, $$9), $$7, $$8);
      }

      $$9.b(42L);
      a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, null, $$9), $$7, $$8);
   }

   private static void a(fcu.a $$0, fcy $$1, float $$2, float $$3, float $$4, List<ghx> $$5, int $$6, int $$7) {
      for (ghx $$8 : $$5) {
         float $$9;
         float $$10;
         float $$11;
         if ($$8.c()) {
            $$9 = azc.a($$2, 0.0F, 1.0F);
            $$10 = azc.a($$3, 0.0F, 1.0F);
            $$11 = azc.a($$4, 0.0F, 1.0F);
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
         new jj[]{jj.e, jj.f, jj.c, jj.d},
         0.5F,
         true,
         new ghw.e[]{ghw.e.k, ghw.e.d, ghw.e.k, ghw.e.j, ghw.e.e, ghw.e.j, ghw.e.e, ghw.e.d},
         new ghw.e[]{ghw.e.k, ghw.e.c, ghw.e.k, ghw.e.i, ghw.e.e, ghw.e.i, ghw.e.e, ghw.e.c},
         new ghw.e[]{ghw.e.l, ghw.e.c, ghw.e.l, ghw.e.i, ghw.e.f, ghw.e.i, ghw.e.f, ghw.e.c},
         new ghw.e[]{ghw.e.l, ghw.e.d, ghw.e.l, ghw.e.j, ghw.e.f, ghw.e.j, ghw.e.f, ghw.e.d}
      ),
      b(
         new jj[]{jj.f, jj.e, jj.c, jj.d},
         1.0F,
         true,
         new ghw.e[]{ghw.e.f, ghw.e.d, ghw.e.f, ghw.e.j, ghw.e.l, ghw.e.j, ghw.e.l, ghw.e.d},
         new ghw.e[]{ghw.e.f, ghw.e.c, ghw.e.f, ghw.e.i, ghw.e.l, ghw.e.i, ghw.e.l, ghw.e.c},
         new ghw.e[]{ghw.e.e, ghw.e.c, ghw.e.e, ghw.e.i, ghw.e.k, ghw.e.i, ghw.e.k, ghw.e.c},
         new ghw.e[]{ghw.e.e, ghw.e.d, ghw.e.e, ghw.e.j, ghw.e.k, ghw.e.j, ghw.e.k, ghw.e.d}
      ),
      c(
         new jj[]{jj.b, jj.a, jj.f, jj.e},
         0.8F,
         true,
         new ghw.e[]{ghw.e.b, ghw.e.k, ghw.e.b, ghw.e.e, ghw.e.h, ghw.e.e, ghw.e.h, ghw.e.k},
         new ghw.e[]{ghw.e.b, ghw.e.l, ghw.e.b, ghw.e.f, ghw.e.h, ghw.e.f, ghw.e.h, ghw.e.l},
         new ghw.e[]{ghw.e.a, ghw.e.l, ghw.e.a, ghw.e.f, ghw.e.g, ghw.e.f, ghw.e.g, ghw.e.l},
         new ghw.e[]{ghw.e.a, ghw.e.k, ghw.e.a, ghw.e.e, ghw.e.g, ghw.e.e, ghw.e.g, ghw.e.k}
      ),
      d(
         new jj[]{jj.e, jj.f, jj.a, jj.b},
         0.8F,
         true,
         new ghw.e[]{ghw.e.b, ghw.e.k, ghw.e.h, ghw.e.k, ghw.e.h, ghw.e.e, ghw.e.b, ghw.e.e},
         new ghw.e[]{ghw.e.a, ghw.e.k, ghw.e.g, ghw.e.k, ghw.e.g, ghw.e.e, ghw.e.a, ghw.e.e},
         new ghw.e[]{ghw.e.a, ghw.e.l, ghw.e.g, ghw.e.l, ghw.e.g, ghw.e.f, ghw.e.a, ghw.e.f},
         new ghw.e[]{ghw.e.b, ghw.e.l, ghw.e.h, ghw.e.l, ghw.e.h, ghw.e.f, ghw.e.b, ghw.e.f}
      ),
      e(
         new jj[]{jj.b, jj.a, jj.c, jj.d},
         0.6F,
         true,
         new ghw.e[]{ghw.e.b, ghw.e.d, ghw.e.b, ghw.e.j, ghw.e.h, ghw.e.j, ghw.e.h, ghw.e.d},
         new ghw.e[]{ghw.e.b, ghw.e.c, ghw.e.b, ghw.e.i, ghw.e.h, ghw.e.i, ghw.e.h, ghw.e.c},
         new ghw.e[]{ghw.e.a, ghw.e.c, ghw.e.a, ghw.e.i, ghw.e.g, ghw.e.i, ghw.e.g, ghw.e.c},
         new ghw.e[]{ghw.e.a, ghw.e.d, ghw.e.a, ghw.e.j, ghw.e.g, ghw.e.j, ghw.e.g, ghw.e.d}
      ),
      f(
         new jj[]{jj.a, jj.b, jj.c, jj.d},
         0.6F,
         true,
         new ghw.e[]{ghw.e.g, ghw.e.d, ghw.e.g, ghw.e.j, ghw.e.a, ghw.e.j, ghw.e.a, ghw.e.d},
         new ghw.e[]{ghw.e.g, ghw.e.c, ghw.e.g, ghw.e.i, ghw.e.a, ghw.e.i, ghw.e.a, ghw.e.c},
         new ghw.e[]{ghw.e.h, ghw.e.c, ghw.e.h, ghw.e.i, ghw.e.b, ghw.e.i, ghw.e.b, ghw.e.c},
         new ghw.e[]{ghw.e.h, ghw.e.d, ghw.e.h, ghw.e.j, ghw.e.b, ghw.e.j, ghw.e.b, ghw.e.d}
      );

      final jj[] g;
      final boolean h;
      final ghw.e[] i;
      final ghw.e[] j;
      final ghw.e[] k;
      final ghw.e[] l;
      private static final ghw.a[] m = ad.a(new ghw.a[6], $$0 -> {
         $$0[jj.a.d()] = a;
         $$0[jj.b.d()] = b;
         $$0[jj.c.d()] = c;
         $$0[jj.d.d()] = d;
         $$0[jj.e.d()] = e;
         $$0[jj.f.d()] = f;
      });

      private a(final jj[] $$0, final float $$1, final boolean $$2, final ghw.e[] $$3, final ghw.e[] $$4, final ghw.e[] $$5, final ghw.e[] $$6) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$3;
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
      }

      public static ghw.a a(jj $$0) {
         return m[$$0.d()];
      }
   }

   static class b {
      final float[] a = new float[4];
      final int[] b = new int[4];

      public b() {
      }

      public void a(dcu $$0, dua $$1, je $$2, float[] $$3, BitSet $$4, ghx $$5) {
         jj $$6 = $$5.e();
         je $$7 = $$4.get(0) ? $$2.a($$6) : $$2;
         ghw.a $$8 = ghw.a.a($$6);
         je.a $$9 = new je.a();
         ghw.d $$10 = ghw.f.get();
         $$9.a($$7, $$8.g[0]);
         dua $$11 = $$0.a_($$9);
         int $$12 = $$10.a($$11, $$0, $$9);
         float $$13 = $$10.b($$11, $$0, $$9);
         $$9.a($$7, $$8.g[1]);
         dua $$14 = $$0.a_($$9);
         int $$15 = $$10.a($$14, $$0, $$9);
         float $$16 = $$10.b($$14, $$0, $$9);
         $$9.a($$7, $$8.g[2]);
         dua $$17 = $$0.a_($$9);
         int $$18 = $$10.a($$17, $$0, $$9);
         float $$19 = $$10.b($$17, $$0, $$9);
         $$9.a($$7, $$8.g[3]);
         dua $$20 = $$0.a_($$9);
         int $$21 = $$10.a($$20, $$0, $$9);
         float $$22 = $$10.b($$20, $$0, $$9);
         dua $$23 = $$0.a_($$9.a($$7, $$8.g[0]).c($$6));
         boolean $$24 = !$$23.k($$0, $$9) || $$23.g() == 0;
         dua $$25 = $$0.a_($$9.a($$7, $$8.g[1]).c($$6));
         boolean $$26 = !$$25.k($$0, $$9) || $$25.g() == 0;
         dua $$27 = $$0.a_($$9.a($$7, $$8.g[2]).c($$6));
         boolean $$28 = !$$27.k($$0, $$9) || $$27.g() == 0;
         dua $$29 = $$0.a_($$9.a($$7, $$8.g[3]).c($$6));
         boolean $$30 = !$$29.k($$0, $$9) || $$29.g() == 0;
         float $$34;
         int $$35;
         if (!$$28 && !$$24) {
            $$34 = $$13;
            $$35 = $$12;
         } else {
            $$9.a($$7, $$8.g[0]).c($$8.g[2]);
            dua $$31 = $$0.a_($$9);
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
            dua $$36 = $$0.a_($$9);
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
            dua $$41 = $$0.a_($$9);
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
            dua $$46 = $$0.a_($$9);
            $$49 = $$10.b($$46, $$0, $$9);
            $$50 = $$10.a($$46, $$0, $$9);
         }

         int $$51 = $$10.a($$1, $$0, $$2);
         $$9.a($$2, $$6);
         dua $$52 = $$0.a_($$9);
         if ($$4.get(0) || !$$52.s()) {
            $$51 = $$10.a($$52, $$0, $$9);
         }

         float $$53 = $$4.get(0) ? $$10.b($$0.a_($$7), $$0, $$7) : $$10.b($$0.a_($$2), $$0, $$2);
         ghw.c $$54 = ghw.c.a($$6);
         if ($$4.get(1) && $$8.h) {
            float $$59 = ($$22 + $$13 + $$39 + $$53) * 0.25F;
            float $$60 = ($$19 + $$13 + $$34 + $$53) * 0.25F;
            float $$61 = ($$19 + $$16 + $$44 + $$53) * 0.25F;
            float $$62 = ($$22 + $$16 + $$49 + $$53) * 0.25F;
            float $$63 = $$3[$$8.i[0].m] * $$3[$$8.i[1].m];
            float $$64 = $$3[$$8.i[2].m] * $$3[$$8.i[3].m];
            float $$65 = $$3[$$8.i[4].m] * $$3[$$8.i[5].m];
            float $$66 = $$3[$$8.i[6].m] * $$3[$$8.i[7].m];
            float $$67 = $$3[$$8.j[0].m] * $$3[$$8.j[1].m];
            float $$68 = $$3[$$8.j[2].m] * $$3[$$8.j[3].m];
            float $$69 = $$3[$$8.j[4].m] * $$3[$$8.j[5].m];
            float $$70 = $$3[$$8.j[6].m] * $$3[$$8.j[7].m];
            float $$71 = $$3[$$8.k[0].m] * $$3[$$8.k[1].m];
            float $$72 = $$3[$$8.k[2].m] * $$3[$$8.k[3].m];
            float $$73 = $$3[$$8.k[4].m] * $$3[$$8.k[5].m];
            float $$74 = $$3[$$8.k[6].m] * $$3[$$8.k[7].m];
            float $$75 = $$3[$$8.l[0].m] * $$3[$$8.l[1].m];
            float $$76 = $$3[$$8.l[2].m] * $$3[$$8.l[3].m];
            float $$77 = $$3[$$8.l[4].m] * $$3[$$8.l[5].m];
            float $$78 = $$3[$$8.l[6].m] * $$3[$$8.l[7].m];
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

         if ($$5.g()) {
            int $$83 = $$5.h();

            for (int $$84 = 0; $$84 < this.b.length; $$84++) {
               this.b[$$84] = ggt.b(this.b[$$84], $$83);
            }
         }

         float $$85 = $$0.a($$6, $$5.f());

         for (int $$86 = 0; $$86 < this.a.length; $$86++) {
            this.a[$$86] = this.a[$$86] * $$85;
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
      private static final ghw.c[] k = ad.a(new ghw.c[6], $$0 -> {
         $$0[jj.a.d()] = a;
         $$0[jj.b.d()] = b;
         $$0[jj.c.d()] = c;
         $$0[jj.d.d()] = d;
         $$0[jj.e.d()] = e;
         $$0[jj.f.d()] = f;
      });

      private c(final int $$0, final int $$1, final int $$2, final int $$3) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
      }

      public static ghw.c a(jj $$0) {
         return k[$$0.d()];
      }
   }

   static class d {
      private boolean a;
      private final Long2IntLinkedOpenHashMap b = ad.a(() -> {
         Long2IntLinkedOpenHashMap $$0 = new Long2IntLinkedOpenHashMap(100, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0.defaultReturnValue(Integer.MAX_VALUE);
         return $$0;
      });
      private final Long2FloatLinkedOpenHashMap c = ad.a(() -> {
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

      public int a(dua $$0, dcu $$1, je $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            int $$4 = this.b.get($$3);
            if ($$4 != Integer.MAX_VALUE) {
               return $$4;
            }
         }

         int $$5 = ggr.a($$1, $$0, $$2);
         if (this.a) {
            if (this.b.size() == 100) {
               this.b.removeFirstInt();
            }

            this.b.put($$3, $$5);
         }

         return $$5;
      }

      public float b(dua $$0, dcu $$1, je $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            float $$4 = this.c.get($$3);
            if (!Float.isNaN($$4)) {
               return $$4;
            }
         }

         float $$5 = $$0.c($$1, $$2);
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
      a(jj.a, false),
      b(jj.b, false),
      c(jj.c, false),
      d(jj.d, false),
      e(jj.e, false),
      f(jj.f, false),
      g(jj.a, true),
      h(jj.b, true),
      i(jj.c, true),
      j(jj.d, true),
      k(jj.e, true),
      l(jj.f, true);

      final int m;

      private e(final jj $$0, final boolean $$1) {
         this.m = $$0.d() + ($$1 ? ghw.c.length : 0);
      }
   }
}
