import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class fwh {
   private static final int a = 0;
   private static final int b = 1;
   static final ie[] c = ie.values();
   private final eyl d;
   private static final int e = 100;
   static final ThreadLocal<fwh.d> f = ThreadLocal.withInitial(fwh.d::new);

   public fwh(eyl $$0) {
      this.d = $$0;
   }

   public void a(cuq $$0, git $$1, dlf $$2, hz $$3, esa $$4, ese $$5, boolean $$6, awo $$7, long $$8, int $$9) {
      boolean $$10 = exh.N() && $$2.h() == 0 && $$1.a();
      ens $$11 = $$2.n($$0, $$3);
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

   public void b(cuq $$0, git $$1, dlf $$2, hz $$3, esa $$4, ese $$5, boolean $$6, awo $$7, long $$8, int $$9) {
      float[] $$10 = new float[c.length * 2];
      BitSet $$11 = new BitSet(3);
      fwh.b $$12 = new fwh.b();
      hz.a $$13 = $$3.j();

      for (ie $$14 : c) {
         $$7.b($$8);
         List<fwi> $$15 = $$1.a($$2, $$14, $$7);
         if (!$$15.isEmpty()) {
            $$13.a($$3, $$14);
            if (!$$6 || cyo.a($$2, $$0, $$3, $$14, $$13)) {
               this.a($$0, $$2, $$3, $$4, $$5, $$15, $$10, $$11, $$12, $$9);
            }
         }
      }

      $$7.b($$8);
      List<fwi> $$16 = $$1.a($$2, null, $$7);
      if (!$$16.isEmpty()) {
         this.a($$0, $$2, $$3, $$4, $$5, $$16, $$10, $$11, $$12, $$9);
      }
   }

   public void c(cuq $$0, git $$1, dlf $$2, hz $$3, esa $$4, ese $$5, boolean $$6, awo $$7, long $$8, int $$9) {
      BitSet $$10 = new BitSet(3);
      hz.a $$11 = $$3.j();

      for (ie $$12 : c) {
         $$7.b($$8);
         List<fwi> $$13 = $$1.a($$2, $$12, $$7);
         if (!$$13.isEmpty()) {
            $$11.a($$3, $$12);
            if (!$$6 || cyo.a($$2, $$0, $$3, $$12, $$11)) {
               int $$14 = fvj.a($$0, $$2, $$11);
               this.a($$0, $$2, $$3, $$14, $$9, false, $$4, $$5, $$13, $$10);
            }
         }
      }

      $$7.b($$8);
      List<fwi> $$15 = $$1.a($$2, null, $$7);
      if (!$$15.isEmpty()) {
         this.a($$0, $$2, $$3, -1, $$9, true, $$4, $$5, $$15, $$10);
      }
   }

   private void a(cuq $$0, dlf $$1, hz $$2, esa $$3, ese $$4, List<fwi> $$5, float[] $$6, BitSet $$7, fwh.b $$8, int $$9) {
      for (fwi $$10 : $$5) {
         this.a($$0, $$1, $$2, $$10.b(), $$10.e(), $$6, $$7);
         $$8.a($$0, $$1, $$2, $$10.e(), $$6, $$7, $$10.f());
         this.a($$0, $$1, $$2, $$4, $$3.c(), $$10, $$8.a[0], $$8.a[1], $$8.a[2], $$8.a[3], $$8.b[0], $$8.b[1], $$8.b[2], $$8.b[3], $$9);
      }
   }

   private void a(
      cuq $$0, dlf $$1, hz $$2, ese $$3, esa.a $$4, fwi $$5, float $$6, float $$7, float $$8, float $$9, int $$10, int $$11, int $$12, int $$13, int $$14
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

      $$3.a($$4, $$5, new float[]{$$6, $$7, $$8, $$9}, $$16, $$17, $$18, new int[]{$$10, $$11, $$12, $$13}, $$14, true);
   }

   private void a(cuq $$0, dlf $$1, hz $$2, int[] $$3, ie $$4, @Nullable float[] $$5, BitSet $$6) {
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
         $$5[ie.e.d()] = $$7;
         $$5[ie.f.d()] = $$10;
         $$5[ie.a.d()] = $$8;
         $$5[ie.b.d()] = $$11;
         $$5[ie.c.d()] = $$9;
         $$5[ie.d.d()] = $$12;
         int $$17 = c.length;
         $$5[ie.e.d() + $$17] = 1.0F - $$7;
         $$5[ie.f.d() + $$17] = 1.0F - $$10;
         $$5[ie.a.d() + $$17] = 1.0F - $$8;
         $$5[ie.b.d() + $$17] = 1.0F - $$11;
         $$5[ie.c.d() + $$17] = 1.0F - $$9;
         $$5[ie.d.d() + $$17] = 1.0F - $$12;
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

   private void a(cuq $$0, dlf $$1, hz $$2, int $$3, int $$4, boolean $$5, esa $$6, ese $$7, List<fwi> $$8, BitSet $$9) {
      for (fwi $$10 : $$8) {
         if ($$5) {
            this.a($$0, $$1, $$2, $$10.b(), $$10.e(), null, $$9);
            hz $$11 = $$9.get(0) ? $$2.a($$10.e()) : $$2;
            $$3 = fvj.a($$0, $$1, $$11);
         }

         float $$12 = $$0.a($$10.e(), $$10.f());
         this.a($$0, $$1, $$2, $$7, $$6.c(), $$10, $$12, $$12, $$12, $$12, $$3, $$3, $$3, $$3, $$4);
      }
   }

   public void a(esa.a $$0, ese $$1, @Nullable dlf $$2, git $$3, float $$4, float $$5, float $$6, int $$7, int $$8) {
      awo $$9 = awo.a();
      long $$10 = 42L;

      for (ie $$11 : c) {
         $$9.b(42L);
         a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, $$11, $$9), $$7, $$8);
      }

      $$9.b(42L);
      a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, null, $$9), $$7, $$8);
   }

   private static void a(esa.a $$0, ese $$1, float $$2, float $$3, float $$4, List<fwi> $$5, int $$6, int $$7) {
      for (fwi $$8 : $$5) {
         float $$9;
         float $$10;
         float $$11;
         if ($$8.c()) {
            $$9 = awh.a($$2, 0.0F, 1.0F);
            $$10 = awh.a($$3, 0.0F, 1.0F);
            $$11 = awh.a($$4, 0.0F, 1.0F);
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
         }

         $$1.a($$0, $$8, $$9, $$10, $$11, $$6, $$7);
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
         new ie[]{ie.e, ie.f, ie.c, ie.d},
         0.5F,
         true,
         new fwh.e[]{fwh.e.k, fwh.e.d, fwh.e.k, fwh.e.j, fwh.e.e, fwh.e.j, fwh.e.e, fwh.e.d},
         new fwh.e[]{fwh.e.k, fwh.e.c, fwh.e.k, fwh.e.i, fwh.e.e, fwh.e.i, fwh.e.e, fwh.e.c},
         new fwh.e[]{fwh.e.l, fwh.e.c, fwh.e.l, fwh.e.i, fwh.e.f, fwh.e.i, fwh.e.f, fwh.e.c},
         new fwh.e[]{fwh.e.l, fwh.e.d, fwh.e.l, fwh.e.j, fwh.e.f, fwh.e.j, fwh.e.f, fwh.e.d}
      ),
      b(
         new ie[]{ie.f, ie.e, ie.c, ie.d},
         1.0F,
         true,
         new fwh.e[]{fwh.e.f, fwh.e.d, fwh.e.f, fwh.e.j, fwh.e.l, fwh.e.j, fwh.e.l, fwh.e.d},
         new fwh.e[]{fwh.e.f, fwh.e.c, fwh.e.f, fwh.e.i, fwh.e.l, fwh.e.i, fwh.e.l, fwh.e.c},
         new fwh.e[]{fwh.e.e, fwh.e.c, fwh.e.e, fwh.e.i, fwh.e.k, fwh.e.i, fwh.e.k, fwh.e.c},
         new fwh.e[]{fwh.e.e, fwh.e.d, fwh.e.e, fwh.e.j, fwh.e.k, fwh.e.j, fwh.e.k, fwh.e.d}
      ),
      c(
         new ie[]{ie.b, ie.a, ie.f, ie.e},
         0.8F,
         true,
         new fwh.e[]{fwh.e.b, fwh.e.k, fwh.e.b, fwh.e.e, fwh.e.h, fwh.e.e, fwh.e.h, fwh.e.k},
         new fwh.e[]{fwh.e.b, fwh.e.l, fwh.e.b, fwh.e.f, fwh.e.h, fwh.e.f, fwh.e.h, fwh.e.l},
         new fwh.e[]{fwh.e.a, fwh.e.l, fwh.e.a, fwh.e.f, fwh.e.g, fwh.e.f, fwh.e.g, fwh.e.l},
         new fwh.e[]{fwh.e.a, fwh.e.k, fwh.e.a, fwh.e.e, fwh.e.g, fwh.e.e, fwh.e.g, fwh.e.k}
      ),
      d(
         new ie[]{ie.e, ie.f, ie.a, ie.b},
         0.8F,
         true,
         new fwh.e[]{fwh.e.b, fwh.e.k, fwh.e.h, fwh.e.k, fwh.e.h, fwh.e.e, fwh.e.b, fwh.e.e},
         new fwh.e[]{fwh.e.a, fwh.e.k, fwh.e.g, fwh.e.k, fwh.e.g, fwh.e.e, fwh.e.a, fwh.e.e},
         new fwh.e[]{fwh.e.a, fwh.e.l, fwh.e.g, fwh.e.l, fwh.e.g, fwh.e.f, fwh.e.a, fwh.e.f},
         new fwh.e[]{fwh.e.b, fwh.e.l, fwh.e.h, fwh.e.l, fwh.e.h, fwh.e.f, fwh.e.b, fwh.e.f}
      ),
      e(
         new ie[]{ie.b, ie.a, ie.c, ie.d},
         0.6F,
         true,
         new fwh.e[]{fwh.e.b, fwh.e.d, fwh.e.b, fwh.e.j, fwh.e.h, fwh.e.j, fwh.e.h, fwh.e.d},
         new fwh.e[]{fwh.e.b, fwh.e.c, fwh.e.b, fwh.e.i, fwh.e.h, fwh.e.i, fwh.e.h, fwh.e.c},
         new fwh.e[]{fwh.e.a, fwh.e.c, fwh.e.a, fwh.e.i, fwh.e.g, fwh.e.i, fwh.e.g, fwh.e.c},
         new fwh.e[]{fwh.e.a, fwh.e.d, fwh.e.a, fwh.e.j, fwh.e.g, fwh.e.j, fwh.e.g, fwh.e.d}
      ),
      f(
         new ie[]{ie.a, ie.b, ie.c, ie.d},
         0.6F,
         true,
         new fwh.e[]{fwh.e.g, fwh.e.d, fwh.e.g, fwh.e.j, fwh.e.a, fwh.e.j, fwh.e.a, fwh.e.d},
         new fwh.e[]{fwh.e.g, fwh.e.c, fwh.e.g, fwh.e.i, fwh.e.a, fwh.e.i, fwh.e.a, fwh.e.c},
         new fwh.e[]{fwh.e.h, fwh.e.c, fwh.e.h, fwh.e.i, fwh.e.b, fwh.e.i, fwh.e.b, fwh.e.c},
         new fwh.e[]{fwh.e.h, fwh.e.d, fwh.e.h, fwh.e.j, fwh.e.b, fwh.e.j, fwh.e.b, fwh.e.d}
      );

      final ie[] g;
      final boolean h;
      final fwh.e[] i;
      final fwh.e[] j;
      final fwh.e[] k;
      final fwh.e[] l;
      private static final fwh.a[] m = ac.a(new fwh.a[6], $$0 -> {
         $$0[ie.a.d()] = a;
         $$0[ie.b.d()] = b;
         $$0[ie.c.d()] = c;
         $$0[ie.d.d()] = d;
         $$0[ie.e.d()] = e;
         $$0[ie.f.d()] = f;
      });

      private a(ie[] $$0, float $$1, boolean $$2, fwh.e[] $$3, fwh.e[] $$4, fwh.e[] $$5, fwh.e[] $$6) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$3;
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
      }

      public static fwh.a a(ie $$0) {
         return m[$$0.d()];
      }
   }

   static class b {
      final float[] a = new float[4];
      final int[] b = new int[4];

      public b() {
      }

      public void a(cuq $$0, dlf $$1, hz $$2, ie $$3, float[] $$4, BitSet $$5, boolean $$6) {
         hz $$7 = $$5.get(0) ? $$2.a($$3) : $$2;
         fwh.a $$8 = fwh.a.a($$3);
         hz.a $$9 = new hz.a();
         fwh.d $$10 = fwh.f.get();
         $$9.a($$7, $$8.g[0]);
         dlf $$11 = $$0.a_($$9);
         int $$12 = $$10.a($$11, $$0, $$9);
         float $$13 = $$10.b($$11, $$0, $$9);
         $$9.a($$7, $$8.g[1]);
         dlf $$14 = $$0.a_($$9);
         int $$15 = $$10.a($$14, $$0, $$9);
         float $$16 = $$10.b($$14, $$0, $$9);
         $$9.a($$7, $$8.g[2]);
         dlf $$17 = $$0.a_($$9);
         int $$18 = $$10.a($$17, $$0, $$9);
         float $$19 = $$10.b($$17, $$0, $$9);
         $$9.a($$7, $$8.g[3]);
         dlf $$20 = $$0.a_($$9);
         int $$21 = $$10.a($$20, $$0, $$9);
         float $$22 = $$10.b($$20, $$0, $$9);
         dlf $$23 = $$0.a_($$9.a($$7, $$8.g[0]).c($$3));
         boolean $$24 = !$$23.p($$0, $$9) || $$23.b($$0, $$9) == 0;
         dlf $$25 = $$0.a_($$9.a($$7, $$8.g[1]).c($$3));
         boolean $$26 = !$$25.p($$0, $$9) || $$25.b($$0, $$9) == 0;
         dlf $$27 = $$0.a_($$9.a($$7, $$8.g[2]).c($$3));
         boolean $$28 = !$$27.p($$0, $$9) || $$27.b($$0, $$9) == 0;
         dlf $$29 = $$0.a_($$9.a($$7, $$8.g[3]).c($$3));
         boolean $$30 = !$$29.p($$0, $$9) || $$29.b($$0, $$9) == 0;
         float $$34;
         int $$35;
         if (!$$28 && !$$24) {
            $$34 = $$13;
            $$35 = $$12;
         } else {
            $$9.a($$7, $$8.g[0]).c($$8.g[2]);
            dlf $$31 = $$0.a_($$9);
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
            dlf $$36 = $$0.a_($$9);
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
            dlf $$41 = $$0.a_($$9);
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
            dlf $$46 = $$0.a_($$9);
            $$49 = $$10.b($$46, $$0, $$9);
            $$50 = $$10.a($$46, $$0, $$9);
         }

         int $$51 = $$10.a($$1, $$0, $$2);
         $$9.a($$2, $$3);
         dlf $$52 = $$0.a_($$9);
         if ($$5.get(0) || !$$52.i($$0, $$9)) {
            $$51 = $$10.a($$52, $$0, $$9);
         }

         float $$53 = $$5.get(0) ? $$10.b($$0.a_($$7), $$0, $$7) : $$10.b($$0.a_($$2), $$0, $$2);
         fwh.c $$54 = fwh.c.a($$3);
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
      private static final fwh.c[] k = ac.a(new fwh.c[6], $$0 -> {
         $$0[ie.a.d()] = a;
         $$0[ie.b.d()] = b;
         $$0[ie.c.d()] = c;
         $$0[ie.d.d()] = d;
         $$0[ie.e.d()] = e;
         $$0[ie.f.d()] = f;
      });

      private c(int $$0, int $$1, int $$2, int $$3) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
      }

      public static fwh.c a(ie $$0) {
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

      public int a(dlf $$0, cuq $$1, hz $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            int $$4 = this.b.get($$3);
            if ($$4 != Integer.MAX_VALUE) {
               return $$4;
            }
         }

         int $$5 = fvj.a($$1, $$0, $$2);
         if (this.a) {
            if (this.b.size() == 100) {
               this.b.removeFirstInt();
            }

            this.b.put($$3, $$5);
         }

         return $$5;
      }

      public float b(dlf $$0, cuq $$1, hz $$2) {
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
      a(ie.a, false),
      b(ie.b, false),
      c(ie.c, false),
      d(ie.d, false),
      e(ie.e, false),
      f(ie.f, false),
      g(ie.a, true),
      h(ie.b, true),
      i(ie.c, true),
      j(ie.d, true),
      k(ie.e, true),
      l(ie.f, true);

      final int m;

      private e(ie $$0, boolean $$1) {
         this.m = $$0.d() + ($$1 ? fwh.c.length : 0);
      }
   }
}
