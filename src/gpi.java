import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.slf4j.Logger;

public class gpi extends avi<Optional<gpi.b>> implements AutoCloseable {
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
   private gpi.a o = gpi.a.b;
   @Nullable
   private fok p;
   @Nullable
   private gpi.b q;
   private final fjm r = new fjm(fhe.b);
   private boolean s;

   protected Optional<gpi.b> a(avd $$0, bqo $$1) {
      try {
         Optional var20;
         try (
            InputStream $$2 = $$0.open(b);
            fik $$3 = fik.a($$2);
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

            var20 = Optional.of(new gpi.b($$6, $$4, $$5));
         }

         return var20;
      } catch (IOException var19) {
         a.error("Failed to load cloud texture", var19);
         return Optional.empty();
      }
   }

   protected void a(Optional<gpi.b> $$0, avd $$1, bqo $$2) {
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

   public void a(int $$0, fok $$1, float $$2, Matrix4f $$3, Matrix4f $$4, feq $$5, float $$6) {
      if (this.q != null) {
         float $$7 = (float)((double)$$2 - $$5.e);
         float $$8 = $$7 + 4.0F;
         gpi.a $$9;
         if ($$8 < 0.0F) {
            $$9 = gpi.a.a;
         } else if ($$7 > 0.0F) {
            $$9 = gpi.a.c;
         } else {
            $$9 = gpi.a.b;
         }

         double $$12 = $$5.d + (double)($$6 * 0.030000001F);
         double $$13 = $$5.f + 3.96F;
         double $$14 = (double)this.q.b * 12.0;
         double $$15 = (double)this.q.c * 12.0;
         $$12 -= (double)azm.a($$12 / $$14) * $$14;
         $$13 -= (double)azm.a($$13 / $$15) * $$15;
         int $$16 = azm.a($$12 / 12.0);
         int $$17 = azm.a($$13 / 12.0);
         float $$18 = (float)($$12 - (double)((float)$$16 * 12.0F));
         float $$19 = (float)($$13 - (double)((float)$$17 * 12.0F));
         gqk $$20 = $$1 == fok.c ? gqk.w() : gqk.v();
         this.r.a();
         if (this.l || $$16 != this.m || $$17 != this.n || $$9 != this.o || $$1 != this.p) {
            this.l = false;
            this.m = $$16;
            this.n = $$17;
            this.o = $$9;
            this.p = $$1;
            fji $$21 = this.a(fjl.b(), $$16, $$17, $$1, $$9, $$20);
            if ($$21 != null) {
               this.r.a($$21);
               this.s = false;
            } else {
               this.s = true;
            }
         }

         if (!this.s) {
            RenderSystem.setShaderColor(axw.j($$0), axw.k($$0), axw.l($$0), 1.0F);
            if ($$1 == fok.c) {
               this.a(gqk.x(), $$3, $$4, $$18, $$7, $$19);
            }

            this.a($$20, $$3, $$4, $$18, $$7, $$19);
            fjm.b();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }

   private void a(gqk $$0, Matrix4f $$1, Matrix4f $$2, float $$3, float $$4, float $$5) {
      $$0.a();
      RenderSystem.setModelOffset(-$$3, $$4, -$$5);
      this.r.a($$1, $$2, RenderSystem.getShader());
      $$0.b();
      RenderSystem.resetModelOffset();
   }

   @Nullable
   private fji a(fjl $$0, int $$1, int $$2, fok $$3, gpi.a $$4, gqk $$5) {
      float $$6 = 0.8F;
      int $$7 = axw.a(0.8F, 1.0F, 1.0F, 1.0F);
      int $$8 = axw.a(0.8F, 0.9F, 0.9F, 0.9F);
      int $$9 = axw.a(0.8F, 0.7F, 0.7F, 0.7F);
      int $$10 = axw.a(0.8F, 0.8F, 0.8F, 0.8F);
      fjf $$11 = $$0.a($$5.U(), $$5.T());
      this.a($$4, $$11, $$1, $$2, $$9, $$7, $$8, $$10, $$3 == fok.c);
      return $$11.a();
   }

   private void a(gpi.a $$0, fjf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8) {
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

   private void a(fjf $$0, int $$1, int $$2, int $$3) {
      float $$4 = (float)$$2 * 12.0F;
      float $$5 = $$4 + 12.0F;
      float $$6 = (float)$$3 * 12.0F;
      float $$7 = $$6 + 12.0F;
      $$0.a($$4, 0.0F, $$6).a($$1);
      $$0.a($$4, 0.0F, $$7).a($$1);
      $$0.a($$5, 0.0F, $$7).a($$1);
      $$0.a($$5, 0.0F, $$6).a($$1);
   }

   private void a(gpi.a $$0, fjf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, long $$8) {
      float $$9 = (float)$$6 * 12.0F;
      float $$10 = $$9 + 12.0F;
      float $$11 = 0.0F;
      float $$12 = 4.0F;
      float $$13 = (float)$$7 * 12.0F;
      float $$14 = $$13 + 12.0F;
      if ($$0 != gpi.a.c) {
         $$1.a($$9, 4.0F, $$13).a($$3);
         $$1.a($$9, 4.0F, $$14).a($$3);
         $$1.a($$10, 4.0F, $$14).a($$3);
         $$1.a($$10, 4.0F, $$13).a($$3);
      }

      if ($$0 != gpi.a.a) {
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
