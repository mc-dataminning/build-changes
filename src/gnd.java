import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class gnd {
   private static final int a = 0;
   private static final int b = 1;
   static final jn[] c = jn.values();
   private final fmk d;
   private static final int e = 100;
   static final ThreadLocal<gnd.d> f = ThreadLocal.withInitial(gnd.d::new);

   public gnd(fmk $$0) {
      this.d = $$0;
   }

   public void a(dfj $$0, hgr $$1, dww $$2, ji $$3, fft $$4, ffx $$5, boolean $$6, azh $$7, long $$8, int $$9) {
      boolean $$10 = fli.P() && $$2.k() == 0 && $$1.a();
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

   public void b(dfj $$0, hgr $$1, dww $$2, ji $$3, fft $$4, ffx $$5, boolean $$6, azh $$7, long $$8, int $$9) {
      float[] $$10 = new float[c.length * 2];
      BitSet $$11 = new BitSet(3);
      gnd.b $$12 = new gnd.b();
      ji.a $$13 = $$3.k();

      for (jn $$14 : c) {
         $$7.b($$8);
         List<gne> $$15 = $$1.a($$2, $$14, $$7);
         if (!$$15.isEmpty()) {
            $$13.a($$3, $$14);
            if (!$$6 || djl.a($$2, $$0.a_($$13), $$14)) {
               this.a($$0, $$2, $$3, $$4, $$5, $$15, $$10, $$11, $$12, $$9);
            }
         }
      }

      $$7.b($$8);
      List<gne> $$16 = $$1.a($$2, null, $$7);
      if (!$$16.isEmpty()) {
         this.a($$0, $$2, $$3, $$4, $$5, $$16, $$10, $$11, $$12, $$9);
      }
   }

   public void c(dfj $$0, hgr $$1, dww $$2, ji $$3, fft $$4, ffx $$5, boolean $$6, azh $$7, long $$8, int $$9) {
      BitSet $$10 = new BitSet(3);
      ji.a $$11 = $$3.k();

      for (jn $$12 : c) {
         $$7.b($$8);
         List<gne> $$13 = $$1.a($$2, $$12, $$7);
         if (!$$13.isEmpty()) {
            $$11.a($$3, $$12);
            if (!$$6 || djl.a($$2, $$0.a_($$11), $$12)) {
               int $$14 = glt.a($$0, $$2, $$11);
               this.a($$0, $$2, $$3, $$14, $$9, false, $$4, $$5, $$13, $$10);
            }
         }
      }

      $$7.b($$8);
      List<gne> $$15 = $$1.a($$2, null, $$7);
      if (!$$15.isEmpty()) {
         this.a($$0, $$2, $$3, -1, $$9, true, $$4, $$5, $$15, $$10);
      }
   }

   private void a(dfj $$0, dww $$1, ji $$2, fft $$3, ffx $$4, List<gne> $$5, float[] $$6, BitSet $$7, gnd.b $$8, int $$9) {
      for (gne $$10 : $$5) {
         this.a($$0, $$1, $$2, $$10.b(), $$10.e(), $$6, $$7);
         $$8.a($$0, $$1, $$2, $$10.e(), $$6, $$7, $$10.f());
         this.a($$0, $$1, $$2, $$4, $$3.c(), $$10, $$8.a[0], $$8.a[1], $$8.a[2], $$8.a[3], $$8.b[0], $$8.b[1], $$8.b[2], $$8.b[3], $$9);
      }
   }

   private void a(
      dfj $$0, dww $$1, ji $$2, ffx $$3, fft.a $$4, gne $$5, float $$6, float $$7, float $$8, float $$9, int $$10, int $$11, int $$12, int $$13, int $$14
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

   private void a(dfj $$0, dww $$1, ji $$2, int[] $$3, jn $$4, @Nullable float[] $$5, BitSet $$6) {
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
         $$5[jn.e.d()] = $$7;
         $$5[jn.f.d()] = $$10;
         $$5[jn.a.d()] = $$8;
         $$5[jn.b.d()] = $$11;
         $$5[jn.c.d()] = $$9;
         $$5[jn.d.d()] = $$12;
         int $$17 = c.length;
         $$5[jn.e.d() + $$17] = 1.0F - $$7;
         $$5[jn.f.d() + $$17] = 1.0F - $$10;
         $$5[jn.a.d() + $$17] = 1.0F - $$8;
         $$5[jn.b.d() + $$17] = 1.0F - $$11;
         $$5[jn.c.d() + $$17] = 1.0F - $$9;
         $$5[jn.d.d() + $$17] = 1.0F - $$12;
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

   private void a(dfj $$0, dww $$1, ji $$2, int $$3, int $$4, boolean $$5, fft $$6, ffx $$7, List<gne> $$8, BitSet $$9) {
      for (gne $$10 : $$8) {
         if ($$5) {
            this.a($$0, $$1, $$2, $$10.b(), $$10.e(), null, $$9);
            ji $$11 = $$9.get(0) ? $$2.a($$10.e()) : $$2;
            $$3 = glt.a($$0, $$1, $$11);
         }

         float $$12 = $$0.a($$10.e(), $$10.f());
         this.a($$0, $$1, $$2, $$7, $$6.c(), $$10, $$12, $$12, $$12, $$12, $$3, $$3, $$3, $$3, $$4);
      }
   }

   public void a(fft.a $$0, ffx $$1, @Nullable dww $$2, hgr $$3, float $$4, float $$5, float $$6, int $$7, int $$8) {
      azh $$9 = azh.a();
      long $$10 = 42L;

      for (jn $$11 : c) {
         $$9.b(42L);
         a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, $$11, $$9), $$7, $$8);
      }

      $$9.b(42L);
      a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, null, $$9), $$7, $$8);
   }

   private static void a(fft.a $$0, ffx $$1, float $$2, float $$3, float $$4, List<gne> $$5, int $$6, int $$7) {
      for (gne $$8 : $$5) {
         float $$9;
         float $$10;
         float $$11;
         if ($$8.c()) {
            $$9 = ayz.a($$2, 0.0F, 1.0F);
            $$10 = ayz.a($$3, 0.0F, 1.0F);
            $$11 = ayz.a($$4, 0.0F, 1.0F);
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
         new jn[]{jn.e, jn.f, jn.c, jn.d},
         0.5F,
         true,
         new gnd.e[]{gnd.e.k, gnd.e.d, gnd.e.k, gnd.e.j, gnd.e.e, gnd.e.j, gnd.e.e, gnd.e.d},
         new gnd.e[]{gnd.e.k, gnd.e.c, gnd.e.k, gnd.e.i, gnd.e.e, gnd.e.i, gnd.e.e, gnd.e.c},
         new gnd.e[]{gnd.e.l, gnd.e.c, gnd.e.l, gnd.e.i, gnd.e.f, gnd.e.i, gnd.e.f, gnd.e.c},
         new gnd.e[]{gnd.e.l, gnd.e.d, gnd.e.l, gnd.e.j, gnd.e.f, gnd.e.j, gnd.e.f, gnd.e.d}
      ),
      b(
         new jn[]{jn.f, jn.e, jn.c, jn.d},
         1.0F,
         true,
         new gnd.e[]{gnd.e.f, gnd.e.d, gnd.e.f, gnd.e.j, gnd.e.l, gnd.e.j, gnd.e.l, gnd.e.d},
         new gnd.e[]{gnd.e.f, gnd.e.c, gnd.e.f, gnd.e.i, gnd.e.l, gnd.e.i, gnd.e.l, gnd.e.c},
         new gnd.e[]{gnd.e.e, gnd.e.c, gnd.e.e, gnd.e.i, gnd.e.k, gnd.e.i, gnd.e.k, gnd.e.c},
         new gnd.e[]{gnd.e.e, gnd.e.d, gnd.e.e, gnd.e.j, gnd.e.k, gnd.e.j, gnd.e.k, gnd.e.d}
      ),
      c(
         new jn[]{jn.b, jn.a, jn.f, jn.e},
         0.8F,
         true,
         new gnd.e[]{gnd.e.b, gnd.e.k, gnd.e.b, gnd.e.e, gnd.e.h, gnd.e.e, gnd.e.h, gnd.e.k},
         new gnd.e[]{gnd.e.b, gnd.e.l, gnd.e.b, gnd.e.f, gnd.e.h, gnd.e.f, gnd.e.h, gnd.e.l},
         new gnd.e[]{gnd.e.a, gnd.e.l, gnd.e.a, gnd.e.f, gnd.e.g, gnd.e.f, gnd.e.g, gnd.e.l},
         new gnd.e[]{gnd.e.a, gnd.e.k, gnd.e.a, gnd.e.e, gnd.e.g, gnd.e.e, gnd.e.g, gnd.e.k}
      ),
      d(
         new jn[]{jn.e, jn.f, jn.a, jn.b},
         0.8F,
         true,
         new gnd.e[]{gnd.e.b, gnd.e.k, gnd.e.h, gnd.e.k, gnd.e.h, gnd.e.e, gnd.e.b, gnd.e.e},
         new gnd.e[]{gnd.e.a, gnd.e.k, gnd.e.g, gnd.e.k, gnd.e.g, gnd.e.e, gnd.e.a, gnd.e.e},
         new gnd.e[]{gnd.e.a, gnd.e.l, gnd.e.g, gnd.e.l, gnd.e.g, gnd.e.f, gnd.e.a, gnd.e.f},
         new gnd.e[]{gnd.e.b, gnd.e.l, gnd.e.h, gnd.e.l, gnd.e.h, gnd.e.f, gnd.e.b, gnd.e.f}
      ),
      e(
         new jn[]{jn.b, jn.a, jn.c, jn.d},
         0.6F,
         true,
         new gnd.e[]{gnd.e.b, gnd.e.d, gnd.e.b, gnd.e.j, gnd.e.h, gnd.e.j, gnd.e.h, gnd.e.d},
         new gnd.e[]{gnd.e.b, gnd.e.c, gnd.e.b, gnd.e.i, gnd.e.h, gnd.e.i, gnd.e.h, gnd.e.c},
         new gnd.e[]{gnd.e.a, gnd.e.c, gnd.e.a, gnd.e.i, gnd.e.g, gnd.e.i, gnd.e.g, gnd.e.c},
         new gnd.e[]{gnd.e.a, gnd.e.d, gnd.e.a, gnd.e.j, gnd.e.g, gnd.e.j, gnd.e.g, gnd.e.d}
      ),
      f(
         new jn[]{jn.a, jn.b, jn.c, jn.d},
         0.6F,
         true,
         new gnd.e[]{gnd.e.g, gnd.e.d, gnd.e.g, gnd.e.j, gnd.e.a, gnd.e.j, gnd.e.a, gnd.e.d},
         new gnd.e[]{gnd.e.g, gnd.e.c, gnd.e.g, gnd.e.i, gnd.e.a, gnd.e.i, gnd.e.a, gnd.e.c},
         new gnd.e[]{gnd.e.h, gnd.e.c, gnd.e.h, gnd.e.i, gnd.e.b, gnd.e.i, gnd.e.b, gnd.e.c},
         new gnd.e[]{gnd.e.h, gnd.e.d, gnd.e.h, gnd.e.j, gnd.e.b, gnd.e.j, gnd.e.b, gnd.e.d}
      );

      final jn[] g;
      final boolean h;
      final gnd.e[] i;
      final gnd.e[] j;
      final gnd.e[] k;
      final gnd.e[] l;
      private static final gnd.a[] m = af.a(new gnd.a[6], $$0 -> {
         $$0[jn.a.d()] = a;
         $$0[jn.b.d()] = b;
         $$0[jn.c.d()] = c;
         $$0[jn.d.d()] = d;
         $$0[jn.e.d()] = e;
         $$0[jn.f.d()] = f;
      });

      private a(final jn[] $$0, final float $$1, final boolean $$2, final gnd.e[] $$3, final gnd.e[] $$4, final gnd.e[] $$5, final gnd.e[] $$6) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$3;
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
      }

      public static gnd.a a(jn $$0) {
         return m[$$0.d()];
      }
   }

   static class b {
      final float[] a = new float[4];
      final int[] b = new int[4];

      public b() {
      }

      public void a(dfj $$0, dww $$1, ji $$2, jn $$3, float[] $$4, BitSet $$5, boolean $$6) {
         ji $$7 = $$5.get(0) ? $$2.a($$3) : $$2;
         gnd.a $$8 = gnd.a.a($$3);
         ji.a $$9 = new ji.a();
         gnd.d $$10 = gnd.f.get();
         $$9.a($$7, $$8.g[0]);
         dww $$11 = $$0.a_($$9);
         int $$12 = $$10.a($$11, $$0, $$9);
         float $$13 = $$10.b($$11, $$0, $$9);
         $$9.a($$7, $$8.g[1]);
         dww $$14 = $$0.a_($$9);
         int $$15 = $$10.a($$14, $$0, $$9);
         float $$16 = $$10.b($$14, $$0, $$9);
         $$9.a($$7, $$8.g[2]);
         dww $$17 = $$0.a_($$9);
         int $$18 = $$10.a($$17, $$0, $$9);
         float $$19 = $$10.b($$17, $$0, $$9);
         $$9.a($$7, $$8.g[3]);
         dww $$20 = $$0.a_($$9);
         int $$21 = $$10.a($$20, $$0, $$9);
         float $$22 = $$10.b($$20, $$0, $$9);
         dww $$23 = $$0.a_($$9.a($$7, $$8.g[0]).c($$3));
         boolean $$24 = !$$23.k($$0, $$9) || $$23.g() == 0;
         dww $$25 = $$0.a_($$9.a($$7, $$8.g[1]).c($$3));
         boolean $$26 = !$$25.k($$0, $$9) || $$25.g() == 0;
         dww $$27 = $$0.a_($$9.a($$7, $$8.g[2]).c($$3));
         boolean $$28 = !$$27.k($$0, $$9) || $$27.g() == 0;
         dww $$29 = $$0.a_($$9.a($$7, $$8.g[3]).c($$3));
         boolean $$30 = !$$29.k($$0, $$9) || $$29.g() == 0;
         float $$34;
         int $$35;
         if (!$$28 && !$$24) {
            $$34 = $$13;
            $$35 = $$12;
         } else {
            $$9.a($$7, $$8.g[0]).c($$8.g[2]);
            dww $$31 = $$0.a_($$9);
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
            dww $$36 = $$0.a_($$9);
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
            dww $$41 = $$0.a_($$9);
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
            dww $$46 = $$0.a_($$9);
            $$49 = $$10.b($$46, $$0, $$9);
            $$50 = $$10.a($$46, $$0, $$9);
         }

         int $$51 = $$10.a($$1, $$0, $$2);
         $$9.a($$2, $$3);
         dww $$52 = $$0.a_($$9);
         if ($$5.get(0) || !$$52.s()) {
            $$51 = $$10.a($$52, $$0, $$9);
         }

         float $$53 = $$5.get(0) ? $$10.b($$0.a_($$7), $$0, $$7) : $$10.b($$0.a_($$2), $$0, $$2);
         gnd.c $$54 = gnd.c.a($$3);
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
            this.a[$$54.g] = Math.clamp($$59 * $$63 + $$60 * $$64 + $$61 * $$65 + $$62 * $$66, 0.0F, 1.0F);
            this.a[$$54.h] = Math.clamp($$59 * $$67 + $$60 * $$68 + $$61 * $$69 + $$62 * $$70, 0.0F, 1.0F);
            this.a[$$54.i] = Math.clamp($$59 * $$71 + $$60 * $$72 + $$61 * $$73 + $$62 * $$74, 0.0F, 1.0F);
            this.a[$$54.j] = Math.clamp($$59 * $$75 + $$60 * $$76 + $$61 * $$77 + $$62 * $$78, 0.0F, 1.0F);
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
      private static final gnd.c[] k = af.a(new gnd.c[6], $$0 -> {
         $$0[jn.a.d()] = a;
         $$0[jn.b.d()] = b;
         $$0[jn.c.d()] = c;
         $$0[jn.d.d()] = d;
         $$0[jn.e.d()] = e;
         $$0[jn.f.d()] = f;
      });

      private c(final int $$0, final int $$1, final int $$2, final int $$3) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
      }

      public static gnd.c a(jn $$0) {
         return k[$$0.d()];
      }
   }

   static class d {
      private boolean a;
      private final Long2IntLinkedOpenHashMap b = af.a(() -> {
         Long2IntLinkedOpenHashMap $$0 = new Long2IntLinkedOpenHashMap(100, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0.defaultReturnValue(Integer.MAX_VALUE);
         return $$0;
      });
      private final Long2FloatLinkedOpenHashMap c = af.a(() -> {
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

      public int a(dww $$0, dfj $$1, ji $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            int $$4 = this.b.get($$3);
            if ($$4 != Integer.MAX_VALUE) {
               return $$4;
            }
         }

         int $$5 = glt.a($$1, $$0, $$2);
         if (this.a) {
            if (this.b.size() == 100) {
               this.b.removeFirstInt();
            }

            this.b.put($$3, $$5);
         }

         return $$5;
      }

      public float b(dww $$0, dfj $$1, ji $$2) {
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
      a(jn.a, false),
      b(jn.b, false),
      c(jn.c, false),
      d(jn.d, false),
      e(jn.e, false),
      f(jn.f, false),
      g(jn.a, true),
      h(jn.b, true),
      i(jn.c, true),
      j(jn.d, true),
      k(jn.e, true),
      l(jn.f, true);

      final int m;

      private e(final jn $$0, final boolean $$1) {
         this.m = $$0.d() + ($$1 ? gnd.c.length : 0);
      }
   }
}
