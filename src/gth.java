import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class gth {
   private static final int a = 0;
   private static final int b = 1;
   static final jc[] c = jc.values();
   private final fsh d;
   private static final int e = 100;
   static final ThreadLocal<gth.d> f = ThreadLocal.withInitial(gth.d::new);

   public gth(fsh $$0) {
      this.d = $$0;
   }

   public void a(dja $$0, List<gto> $$1, ebg $$2, iw $$3, flq $$4, flt $$5, boolean $$6, int $$7) {
      if (!$$1.isEmpty()) {
         boolean $$8 = frf.P() && $$2.k() == 0 && $$1.getFirst().a();
         $$4.a($$2.a($$3));

         try {
            if ($$8) {
               this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            } else {
               this.c($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            }
         } catch (Throwable var13) {
            p $$10 = p.a(var13, "Tesselating block model");
            q $$11 = $$10.a("Block model being tesselated");
            q.a($$11, $$0, $$3, $$2);
            $$11.a("Using AO", $$8);
            throw new aa($$10);
         }
      }
   }

   public void b(dja $$0, List<gto> $$1, ebg $$2, iw $$3, flq $$4, flt $$5, boolean $$6, int $$7) {
      float[] $$8 = new float[c.length * 2];
      BitSet $$9 = new BitSet(3);
      gth.b $$10 = new gth.b();
      iw.a $$11 = new iw.a();

      for (gto $$12 : $$1) {
         for (jc $$13 : c) {
            List<gti> $$14 = $$12.a($$13);
            if (!$$14.isEmpty() && (!$$6 || dne.a($$2, $$0.a_($$11.a($$3, $$13)), $$13))) {
               this.a($$0, $$2, $$3, $$4, $$5, $$14, $$8, $$9, $$10, $$7);
            }
         }

         List<gti> $$15 = $$12.a(null);
         if (!$$15.isEmpty()) {
            this.a($$0, $$2, $$3, $$4, $$5, $$15, $$8, $$9, $$10, $$7);
         }
      }
   }

   public void c(dja $$0, List<gto> $$1, ebg $$2, iw $$3, flq $$4, flt $$5, boolean $$6, int $$7) {
      BitSet $$8 = new BitSet(3);
      iw.a $$9 = $$3.k();

      for (gto $$10 : $$1) {
         for (jc $$11 : c) {
            List<gti> $$12 = $$10.a($$11);
            if (!$$12.isEmpty()) {
               $$9.a($$3, $$11);
               if (!$$6 || dne.a($$2, $$0.a_($$9), $$11)) {
                  int $$13 = grx.a($$0, $$2, $$9);
                  this.a($$0, $$2, $$3, $$13, $$7, false, $$4, $$5, $$12, $$8);
               }
            }
         }

         List<gti> $$14 = $$10.a(null);
         if (!$$14.isEmpty()) {
            this.a($$0, $$2, $$3, -1, $$7, true, $$4, $$5, $$14, $$8);
         }
      }
   }

   private void a(dja $$0, ebg $$1, iw $$2, flq $$3, flt $$4, List<gti> $$5, float[] $$6, BitSet $$7, gth.b $$8, int $$9) {
      for (gti $$10 : $$5) {
         this.a($$0, $$1, $$2, $$10.b(), $$10.d(), $$6, $$7);
         $$8.a($$0, $$1, $$2, $$10.d(), $$6, $$7, $$10.f());
         this.a($$0, $$1, $$2, $$4, $$3.c(), $$10, $$8.a, $$8.b, $$9);
      }
   }

   private void a(dja $$0, ebg $$1, iw $$2, flt $$3, flq.a $$4, gti $$5, float[] $$6, int[] $$7, int $$8) {
      float $$10;
      float $$11;
      float $$12;
      if ($$5.a()) {
         int $$9 = this.d.a($$1, $$0, $$2, $$5.c());
         $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         $$12 = (float)($$9 & 0xFF) / 255.0F;
      } else {
         $$10 = 1.0F;
         $$11 = 1.0F;
         $$12 = 1.0F;
      }

      $$3.a($$4, $$5, $$6, $$10, $$11, $$12, 1.0F, $$7, $$8, true);
   }

   private void a(dja $$0, ebg $$1, iw $$2, int[] $$3, jc $$4, @Nullable float[] $$5, BitSet $$6) {
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
         $$5[jc.e.d()] = $$7;
         $$5[jc.f.d()] = $$10;
         $$5[jc.a.d()] = $$8;
         $$5[jc.b.d()] = $$11;
         $$5[jc.c.d()] = $$9;
         $$5[jc.d.d()] = $$12;
         int $$17 = c.length;
         $$5[jc.e.d() + $$17] = 1.0F - $$7;
         $$5[jc.f.d() + $$17] = 1.0F - $$10;
         $$5[jc.a.d() + $$17] = 1.0F - $$8;
         $$5[jc.b.d() + $$17] = 1.0F - $$11;
         $$5[jc.c.d() + $$17] = 1.0F - $$9;
         $$5[jc.d.d() + $$17] = 1.0F - $$12;
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

   private void a(dja $$0, ebg $$1, iw $$2, int $$3, int $$4, boolean $$5, flq $$6, flt $$7, List<gti> $$8, BitSet $$9) {
      for (gti $$10 : $$8) {
         if ($$5) {
            this.a($$0, $$1, $$2, $$10.b(), $$10.d(), null, $$9);
            iw $$11 = $$9.get(0) ? $$2.a($$10.d()) : $$2;
            $$3 = grx.a($$0, $$1, $$11);
         }

         float $$12 = $$0.a($$10.d(), $$10.f());
         this.a($$0, $$1, $$2, $$7, $$6.c(), $$10, new float[]{$$12, $$12, $$12, $$12}, new int[]{$$3, $$3, $$3, $$3}, $$4);
      }
   }

   public void a(flq.a $$0, flt $$1, gtp $$2, float $$3, float $$4, float $$5, int $$6, int $$7) {
      for (gto $$8 : $$2.a(azz.a(42L))) {
         for (jc $$9 : c) {
            a($$0, $$1, $$3, $$4, $$5, $$8.a($$9), $$6, $$7);
         }

         a($$0, $$1, $$3, $$4, $$5, $$8.a(null), $$6, $$7);
      }
   }

   private static void a(flq.a $$0, flt $$1, float $$2, float $$3, float $$4, List<gti> $$5, int $$6, int $$7) {
      for (gti $$8 : $$5) {
         float $$9;
         float $$10;
         float $$11;
         if ($$8.a()) {
            $$9 = azq.a($$2, 0.0F, 1.0F);
            $$10 = azq.a($$3, 0.0F, 1.0F);
            $$11 = azq.a($$4, 0.0F, 1.0F);
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
         new jc[]{jc.e, jc.f, jc.c, jc.d},
         0.5F,
         true,
         new gth.e[]{gth.e.k, gth.e.d, gth.e.k, gth.e.j, gth.e.e, gth.e.j, gth.e.e, gth.e.d},
         new gth.e[]{gth.e.k, gth.e.c, gth.e.k, gth.e.i, gth.e.e, gth.e.i, gth.e.e, gth.e.c},
         new gth.e[]{gth.e.l, gth.e.c, gth.e.l, gth.e.i, gth.e.f, gth.e.i, gth.e.f, gth.e.c},
         new gth.e[]{gth.e.l, gth.e.d, gth.e.l, gth.e.j, gth.e.f, gth.e.j, gth.e.f, gth.e.d}
      ),
      b(
         new jc[]{jc.f, jc.e, jc.c, jc.d},
         1.0F,
         true,
         new gth.e[]{gth.e.f, gth.e.d, gth.e.f, gth.e.j, gth.e.l, gth.e.j, gth.e.l, gth.e.d},
         new gth.e[]{gth.e.f, gth.e.c, gth.e.f, gth.e.i, gth.e.l, gth.e.i, gth.e.l, gth.e.c},
         new gth.e[]{gth.e.e, gth.e.c, gth.e.e, gth.e.i, gth.e.k, gth.e.i, gth.e.k, gth.e.c},
         new gth.e[]{gth.e.e, gth.e.d, gth.e.e, gth.e.j, gth.e.k, gth.e.j, gth.e.k, gth.e.d}
      ),
      c(
         new jc[]{jc.b, jc.a, jc.f, jc.e},
         0.8F,
         true,
         new gth.e[]{gth.e.b, gth.e.k, gth.e.b, gth.e.e, gth.e.h, gth.e.e, gth.e.h, gth.e.k},
         new gth.e[]{gth.e.b, gth.e.l, gth.e.b, gth.e.f, gth.e.h, gth.e.f, gth.e.h, gth.e.l},
         new gth.e[]{gth.e.a, gth.e.l, gth.e.a, gth.e.f, gth.e.g, gth.e.f, gth.e.g, gth.e.l},
         new gth.e[]{gth.e.a, gth.e.k, gth.e.a, gth.e.e, gth.e.g, gth.e.e, gth.e.g, gth.e.k}
      ),
      d(
         new jc[]{jc.e, jc.f, jc.a, jc.b},
         0.8F,
         true,
         new gth.e[]{gth.e.b, gth.e.k, gth.e.h, gth.e.k, gth.e.h, gth.e.e, gth.e.b, gth.e.e},
         new gth.e[]{gth.e.a, gth.e.k, gth.e.g, gth.e.k, gth.e.g, gth.e.e, gth.e.a, gth.e.e},
         new gth.e[]{gth.e.a, gth.e.l, gth.e.g, gth.e.l, gth.e.g, gth.e.f, gth.e.a, gth.e.f},
         new gth.e[]{gth.e.b, gth.e.l, gth.e.h, gth.e.l, gth.e.h, gth.e.f, gth.e.b, gth.e.f}
      ),
      e(
         new jc[]{jc.b, jc.a, jc.c, jc.d},
         0.6F,
         true,
         new gth.e[]{gth.e.b, gth.e.d, gth.e.b, gth.e.j, gth.e.h, gth.e.j, gth.e.h, gth.e.d},
         new gth.e[]{gth.e.b, gth.e.c, gth.e.b, gth.e.i, gth.e.h, gth.e.i, gth.e.h, gth.e.c},
         new gth.e[]{gth.e.a, gth.e.c, gth.e.a, gth.e.i, gth.e.g, gth.e.i, gth.e.g, gth.e.c},
         new gth.e[]{gth.e.a, gth.e.d, gth.e.a, gth.e.j, gth.e.g, gth.e.j, gth.e.g, gth.e.d}
      ),
      f(
         new jc[]{jc.a, jc.b, jc.c, jc.d},
         0.6F,
         true,
         new gth.e[]{gth.e.g, gth.e.d, gth.e.g, gth.e.j, gth.e.a, gth.e.j, gth.e.a, gth.e.d},
         new gth.e[]{gth.e.g, gth.e.c, gth.e.g, gth.e.i, gth.e.a, gth.e.i, gth.e.a, gth.e.c},
         new gth.e[]{gth.e.h, gth.e.c, gth.e.h, gth.e.i, gth.e.b, gth.e.i, gth.e.b, gth.e.c},
         new gth.e[]{gth.e.h, gth.e.d, gth.e.h, gth.e.j, gth.e.b, gth.e.j, gth.e.b, gth.e.d}
      );

      final jc[] g;
      final boolean h;
      final gth.e[] i;
      final gth.e[] j;
      final gth.e[] k;
      final gth.e[] l;
      private static final gth.a[] m = ag.a(new gth.a[6], $$0 -> {
         $$0[jc.a.d()] = a;
         $$0[jc.b.d()] = b;
         $$0[jc.c.d()] = c;
         $$0[jc.d.d()] = d;
         $$0[jc.e.d()] = e;
         $$0[jc.f.d()] = f;
      });

      private a(final jc[] $$0, final float $$1, final boolean $$2, final gth.e[] $$3, final gth.e[] $$4, final gth.e[] $$5, final gth.e[] $$6) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$3;
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
      }

      public static gth.a a(jc $$0) {
         return m[$$0.d()];
      }
   }

   static class b {
      final float[] a = new float[4];
      final int[] b = new int[4];

      public b() {
      }

      public void a(dja $$0, ebg $$1, iw $$2, jc $$3, float[] $$4, BitSet $$5, boolean $$6) {
         iw $$7 = $$5.get(0) ? $$2.a($$3) : $$2;
         gth.a $$8 = gth.a.a($$3);
         iw.a $$9 = new iw.a();
         gth.d $$10 = gth.f.get();
         $$9.a($$7, $$8.g[0]);
         ebg $$11 = $$0.a_($$9);
         int $$12 = $$10.a($$11, $$0, $$9);
         float $$13 = $$10.b($$11, $$0, $$9);
         $$9.a($$7, $$8.g[1]);
         ebg $$14 = $$0.a_($$9);
         int $$15 = $$10.a($$14, $$0, $$9);
         float $$16 = $$10.b($$14, $$0, $$9);
         $$9.a($$7, $$8.g[2]);
         ebg $$17 = $$0.a_($$9);
         int $$18 = $$10.a($$17, $$0, $$9);
         float $$19 = $$10.b($$17, $$0, $$9);
         $$9.a($$7, $$8.g[3]);
         ebg $$20 = $$0.a_($$9);
         int $$21 = $$10.a($$20, $$0, $$9);
         float $$22 = $$10.b($$20, $$0, $$9);
         ebg $$23 = $$0.a_($$9.a($$7, $$8.g[0]).c($$3));
         boolean $$24 = !$$23.k($$0, $$9) || $$23.g() == 0;
         ebg $$25 = $$0.a_($$9.a($$7, $$8.g[1]).c($$3));
         boolean $$26 = !$$25.k($$0, $$9) || $$25.g() == 0;
         ebg $$27 = $$0.a_($$9.a($$7, $$8.g[2]).c($$3));
         boolean $$28 = !$$27.k($$0, $$9) || $$27.g() == 0;
         ebg $$29 = $$0.a_($$9.a($$7, $$8.g[3]).c($$3));
         boolean $$30 = !$$29.k($$0, $$9) || $$29.g() == 0;
         float $$34;
         int $$35;
         if (!$$28 && !$$24) {
            $$34 = $$13;
            $$35 = $$12;
         } else {
            $$9.a($$7, $$8.g[0]).c($$8.g[2]);
            ebg $$31 = $$0.a_($$9);
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
            ebg $$36 = $$0.a_($$9);
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
            ebg $$41 = $$0.a_($$9);
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
            ebg $$46 = $$0.a_($$9);
            $$49 = $$10.b($$46, $$0, $$9);
            $$50 = $$10.a($$46, $$0, $$9);
         }

         int $$51 = $$10.a($$1, $$0, $$2);
         $$9.a($$2, $$3);
         ebg $$52 = $$0.a_($$9);
         if ($$5.get(0) || !$$52.s()) {
            $$51 = $$10.a($$52, $$0, $$9);
         }

         float $$53 = $$5.get(0) ? $$10.b($$0.a_($$7), $$0, $$7) : $$10.b($$0.a_($$2), $$0, $$2);
         gth.c $$54 = gth.c.a($$3);
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
      private static final gth.c[] k = ag.a(new gth.c[6], $$0 -> {
         $$0[jc.a.d()] = a;
         $$0[jc.b.d()] = b;
         $$0[jc.c.d()] = c;
         $$0[jc.d.d()] = d;
         $$0[jc.e.d()] = e;
         $$0[jc.f.d()] = f;
      });

      private c(final int $$0, final int $$1, final int $$2, final int $$3) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
      }

      public static gth.c a(jc $$0) {
         return k[$$0.d()];
      }
   }

   static class d {
      private boolean a;
      private final Long2IntLinkedOpenHashMap b = ag.a(() -> {
         Long2IntLinkedOpenHashMap $$0 = new Long2IntLinkedOpenHashMap(100, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0.defaultReturnValue(Integer.MAX_VALUE);
         return $$0;
      });
      private final Long2FloatLinkedOpenHashMap c = ag.a(() -> {
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

      public int a(ebg $$0, dja $$1, iw $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            int $$4 = this.b.get($$3);
            if ($$4 != Integer.MAX_VALUE) {
               return $$4;
            }
         }

         int $$5 = grx.a($$1, $$0, $$2);
         if (this.a) {
            if (this.b.size() == 100) {
               this.b.removeFirstInt();
            }

            this.b.put($$3, $$5);
         }

         return $$5;
      }

      public float b(ebg $$0, dja $$1, iw $$2) {
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
      a(jc.a, false),
      b(jc.b, false),
      c(jc.c, false),
      d(jc.d, false),
      e(jc.e, false),
      f(jc.f, false),
      g(jc.a, true),
      h(jc.b, true),
      i(jc.c, true),
      j(jc.d, true),
      k(jc.e, true),
      l(jc.f, true);

      final int m;

      private e(final jc $$0, final boolean $$1) {
         this.m = $$0.d() + ($$1 ? gth.c.length : 0);
      }
   }
}
