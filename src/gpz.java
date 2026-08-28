import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gpz extends avi<Optional<gpz.b>> implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final alg b = alg.b("textures/environment/clouds.png");
   private static final float c = 12.0F;
   private static final float d = 4.0F;
   private static final float e = 0.6F;
   private static final long f = 0L;
   private static final int g = 4;
   private static final int h = 3;
   private static final int i = 2;
   private static final int j = 1;
   private static final int k = 0;
   private boolean l = true;
   private int m = Integer.MIN_VALUE;
   private int n = Integer.MIN_VALUE;
   private gpz.a o = gpz.a.b;
   @Nullable
   private fpf p;
   @Nullable
   private gpz.b q;
   private final fkg r = new fkg(fhr.b);
   private boolean s;

   protected Optional<gpz.b> a(avd $$0, bqq $$1) {
      try {
         Optional var20;
         try (
            InputStream $$2 = $$0.open(b);
            fiz $$3 = fiz.a($$2);
         ) {
            int $$4 = $$3.a();
            int $$5 = $$3.b();
            long[] $$6 = new long[$$4 * $$5];

            for (int $$7 = 0; $$7 < $$5; $$7++) {
               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.a($$8, $$7);
                  if (a($$9)) {
                     $$6[$$8 + $$7 * $$4] = 0L;
                  } else {
                     boolean $$10 = a($$3.a($$8, Math.floorMod($$7 - 1, $$5)));
                     boolean $$11 = a($$3.a(Math.floorMod($$8 + 1, $$5), $$7));
                     boolean $$12 = a($$3.a($$8, Math.floorMod($$7 + 1, $$5)));
                     boolean $$13 = a($$3.a(Math.floorMod($$8 - 1, $$5), $$7));
                     $$6[$$8 + $$7 * $$4] = a($$9, $$10, $$11, $$12, $$13);
                  }
               }
            }

            var20 = Optional.of(new gpz.b($$6, $$4, $$5));
         }

         return var20;
      } catch (IOException var19) {
         a.error("Failed to load cloud texture", var19);
         return Optional.empty();
      }
   }

   protected void a(Optional<gpz.b> $$0, avd $$1, bqq $$2) {
      this.q = $$0.orElse(null);
      this.l = true;
   }

   private static boolean a(int $$0) {
      return axw.a($$0) < 10;
   }

   private static long a(int $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4) {
      return (long)$$0 << 4 | (long)(($$1 ? 1 : 0) << 3) | (long)(($$2 ? 1 : 0) << 2) | (long)(($$3 ? 1 : 0) << 1) | (long)(($$4 ? 1 : 0) << 0);
   }

   private static int a(long $$0) {
      return (int)($$0 >> 4 & 4294967295L);
   }

   private static boolean b(long $$0) {
      return ($$0 >> 3 & 1L) != 0L;
   }

   private static boolean c(long $$0) {
      return ($$0 >> 2 & 1L) != 0L;
   }

   private static boolean d(long $$0) {
      return ($$0 >> 1 & 1L) != 0L;
   }

   private static boolean e(long $$0) {
      return ($$0 >> 0 & 1L) != 0L;
   }

   public void a(int $$0, fpf $$1, float $$2, ffc $$3, float $$4) {
      if (this.q != null) {
         float $$5 = (float)((double)$$2 - $$3.e);
         float $$6 = $$5 + 4.0F;
         gpz.a $$7;
         if ($$6 < 0.0F) {
            $$7 = gpz.a.a;
         } else if ($$5 > 0.0F) {
            $$7 = gpz.a.c;
         } else {
            $$7 = gpz.a.b;
         }

         double $$10 = $$3.d + (double)($$4 * 0.030000001F);
         double $$11 = $$3.f + 3.96F;
         double $$12 = (double)this.q.b * 12.0;
         double $$13 = (double)this.q.c * 12.0;
         $$10 -= (double)azm.a($$10 / $$12) * $$12;
         $$11 -= (double)azm.a($$11 / $$13) * $$13;
         int $$14 = azm.a($$10 / 12.0);
         int $$15 = azm.a($$11 / 12.0);
         float $$16 = (float)($$10 - (double)((float)$$14 * 12.0F));
         float $$17 = (float)($$11 - (double)((float)$$15 * 12.0F));
         grc $$18 = $$1 == fpf.c ? grc.w() : grc.v();
         if (this.l || $$14 != this.m || $$15 != this.n || $$7 != this.o || $$1 != this.p) {
            this.l = false;
            this.m = $$14;
            this.n = $$15;
            this.o = $$7;
            this.p = $$1;
            fkc $$19 = this.a(fkf.b(), $$14, $$15, $$1, $$7, $$18);
            if ($$19 != null) {
               this.r.a();
               this.r.a($$19);
               fkg.b();
               this.s = false;
            } else {
               this.s = true;
            }
         }

         if (!this.s) {
            RenderSystem.setShaderColor(axw.j($$0), axw.k($$0), axw.l($$0), 1.0F);
            if ($$1 == fpf.c) {
               this.a(grc.x(), $$16, $$5, $$17);
            }

            this.a($$18, $$16, $$5, $$17);
            fkg.b();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }

   private void a(grc $$0, float $$1, float $$2, float $$3) {
      RenderSystem.setModelOffset(-$$1, $$2, -$$3);
      this.r.a($$0);
      RenderSystem.resetModelOffset();
   }

   @Nullable
   private fkc a(fkf $$0, int $$1, int $$2, fpf $$3, gpz.a $$4, grc $$5) {
      float $$6 = 0.8F;
      int $$7 = axw.a(0.8F, 1.0F, 1.0F, 1.0F);
      int $$8 = axw.a(0.8F, 0.9F, 0.9F, 0.9F);
      int $$9 = axw.a(0.8F, 0.7F, 0.7F, 0.7F);
      int $$10 = axw.a(0.8F, 0.8F, 0.8F, 0.8F);
      fjz $$11 = $$0.a($$5.X(), $$5.W());
      this.a($$4, $$11, $$1, $$2, $$9, $$7, $$8, $$10, $$3 == fpf.c);
      return $$11.a();
   }

   private void a(gpz.a $$0, fjz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8) {
      if (this.q != null) {
         int $$9 = 32;
         long[] $$10 = this.q.a;
         int $$11 = this.q.b;
         int $$12 = this.q.c;

         for (int $$13 = -32; $$13 <= 32; $$13++) {
            for (int $$14 = -32; $$14 <= 32; $$14++) {
               int $$15 = Math.floorMod($$2 + $$14, $$11);
               int $$16 = Math.floorMod($$3 + $$13, $$12);
               long $$17 = $$10[$$15 + $$16 * $$11];
               if ($$17 != 0L) {
                  int $$18 = a($$17);
                  if ($$8) {
                     this.a($$0, $$1, axw.a($$4, $$18), axw.a($$5, $$18), axw.a($$6, $$18), axw.a($$7, $$18), $$14, $$13, $$17);
                  } else {
                     this.a($$1, axw.a($$5, $$18), $$14, $$13);
                  }
               }
            }
         }
      }
   }

   private void a(fjz $$0, int $$1, int $$2, int $$3) {
      float $$4 = (float)$$2 * 12.0F;
      float $$5 = $$4 + 12.0F;
      float $$6 = (float)$$3 * 12.0F;
      float $$7 = $$6 + 12.0F;
      $$0.a($$4, 0.0F, $$6).a($$1);
      $$0.a($$4, 0.0F, $$7).a($$1);
      $$0.a($$5, 0.0F, $$7).a($$1);
      $$0.a($$5, 0.0F, $$6).a($$1);
   }

   private void a(gpz.a $$0, fjz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, long $$8) {
      float $$9 = (float)$$6 * 12.0F;
      float $$10 = $$9 + 12.0F;
      float $$11 = 0.0F;
      float $$12 = 4.0F;
      float $$13 = (float)$$7 * 12.0F;
      float $$14 = $$13 + 12.0F;
      if ($$0 != gpz.a.c) {
         $$1.a($$9, 4.0F, $$13).a($$3);
         $$1.a($$9, 4.0F, $$14).a($$3);
         $$1.a($$10, 4.0F, $$14).a($$3);
         $$1.a($$10, 4.0F, $$13).a($$3);
      }

      if ($$0 != gpz.a.a) {
         $$1.a($$10, 0.0F, $$13).a($$2);
         $$1.a($$10, 0.0F, $$14).a($$2);
         $$1.a($$9, 0.0F, $$14).a($$2);
         $$1.a($$9, 0.0F, $$13).a($$2);
      }

      if (b($$8) && $$7 > 0) {
         $$1.a($$9, 0.0F, $$13).a($$5);
         $$1.a($$9, 4.0F, $$13).a($$5);
         $$1.a($$10, 4.0F, $$13).a($$5);
         $$1.a($$10, 0.0F, $$13).a($$5);
      }

      if (d($$8) && $$7 < 0) {
         $$1.a($$10, 0.0F, $$14).a($$5);
         $$1.a($$10, 4.0F, $$14).a($$5);
         $$1.a($$9, 4.0F, $$14).a($$5);
         $$1.a($$9, 0.0F, $$14).a($$5);
      }

      if (e($$8) && $$6 > 0) {
         $$1.a($$9, 0.0F, $$14).a($$4);
         $$1.a($$9, 4.0F, $$14).a($$4);
         $$1.a($$9, 4.0F, $$13).a($$4);
         $$1.a($$9, 0.0F, $$13).a($$4);
      }

      if (c($$8) && $$6 < 0) {
         $$1.a($$10, 0.0F, $$13).a($$4);
         $$1.a($$10, 4.0F, $$13).a($$4);
         $$1.a($$10, 4.0F, $$14).a($$4);
         $$1.a($$10, 0.0F, $$14).a($$4);
      }

      boolean $$15 = Math.abs($$6) <= 1 && Math.abs($$7) <= 1;
      if ($$15) {
         $$1.a($$10, 4.0F, $$13).a($$3);
         $$1.a($$10, 4.0F, $$14).a($$3);
         $$1.a($$9, 4.0F, $$14).a($$3);
         $$1.a($$9, 4.0F, $$13).a($$3);
         $$1.a($$9, 0.0F, $$13).a($$2);
         $$1.a($$9, 0.0F, $$14).a($$2);
         $$1.a($$10, 0.0F, $$14).a($$2);
         $$1.a($$10, 0.0F, $$13).a($$2);
         $$1.a($$10, 0.0F, $$13).a($$5);
         $$1.a($$10, 4.0F, $$13).a($$5);
         $$1.a($$9, 4.0F, $$13).a($$5);
         $$1.a($$9, 0.0F, $$13).a($$5);
         $$1.a($$9, 0.0F, $$14).a($$5);
         $$1.a($$9, 4.0F, $$14).a($$5);
         $$1.a($$10, 4.0F, $$14).a($$5);
         $$1.a($$10, 0.0F, $$14).a($$5);
         $$1.a($$9, 0.0F, $$13).a($$4);
         $$1.a($$9, 4.0F, $$13).a($$4);
         $$1.a($$9, 4.0F, $$14).a($$4);
         $$1.a($$9, 0.0F, $$14).a($$4);
         $$1.a($$10, 0.0F, $$14).a($$4);
         $$1.a($$10, 4.0F, $$14).a($$4);
         $$1.a($$10, 4.0F, $$13).a($$4);
         $$1.a($$10, 0.0F, $$13).a($$4);
      }
   }

   public void a() {
      this.l = true;
   }

   @Override
   public void close() {
      this.r.close();
   }

   static enum a {
      a,
      b,
      c;
   }

   public static record b(long[] a, int b, int c) {
   }
}
