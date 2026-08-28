import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.BufferUsage;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gqx extends avt<Optional<gqx.b>> implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final alr b = alr.b("textures/environment/clouds.png");
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
   private gqx.a o = gqx.a.b;
   @Nullable
   private fqc p;
   @Nullable
   private gqx.b q;
   @Nullable
   private GpuBuffer r = null;
   private int s = 0;
   private final RenderSystem.a t = RenderSystem.getSequentialBuffer(VertexFormat.b.h);

   protected Optional<gqx.b> a(avo $$0, brm $$1) {
      try {
         Optional var20;
         try (
            InputStream $$2 = $$0.open(b);
            fkf $$3 = fkf.a($$2);
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

            var20 = Optional.of(new gqx.b($$6, $$4, $$5));
         }

         return var20;
      } catch (IOException var19) {
         a.error("Failed to load cloud texture", var19);
         return Optional.empty();
      }
   }

   protected void a(Optional<gqx.b> $$0, avo $$1, brm $$2) {
      this.q = $$0.orElse(null);
      this.l = true;
   }

   private static boolean a(int $$0) {
      return ayh.a($$0) < 10;
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

   public void a(int $$0, fqc $$1, float $$2, fgc $$3, float $$4) {
      if (this.q != null) {
         float $$5 = (float)((double)$$2 - $$3.e);
         float $$6 = $$5 + 4.0F;
         gqx.a $$7;
         if ($$6 < 0.0F) {
            $$7 = gqx.a.a;
         } else if ($$5 > 0.0F) {
            $$7 = gqx.a.c;
         } else {
            $$7 = gqx.a.b;
         }

         double $$10 = $$3.d + (double)($$4 * 0.030000001F);
         double $$11 = $$3.f + 3.96F;
         double $$12 = (double)this.q.b * 12.0;
         double $$13 = (double)this.q.c * 12.0;
         $$10 -= (double)azz.a($$10 / $$12) * $$12;
         $$11 -= (double)azz.a($$11 / $$13) * $$13;
         int $$14 = azz.a($$10 / 12.0);
         int $$15 = azz.a($$11 / 12.0);
         float $$16 = (float)($$10 - (double)((float)$$14 * 12.0F));
         float $$17 = (float)($$11 - (double)((float)$$15 * 12.0F));
         boolean $$18 = $$1 == fqc.c;
         RenderPipeline $$19 = $$18 ? grw.U : grw.T;
         if (this.l || $$14 != this.m || $$15 != this.n || $$7 != this.o || $$1 != this.p) {
            this.l = false;
            this.m = $$14;
            this.n = $$15;
            this.o = $$7;
            this.p = $$1;

            try (flc $$20 = this.a(flf.b(), $$14, $$15, $$1, $$7, $$19)) {
               if ($$20 == null) {
                  this.s = 0;
               } else {
                  if (this.r != null && this.r.size >= $$20.a().remaining()) {
                     CommandEncoder $$21 = RenderSystem.getDevice().createCommandEncoder();
                     $$21.writeToBuffer(this.r, $$20.a(), 0);
                  } else {
                     if (this.r != null) {
                        this.r.close();
                     }

                     this.r = RenderSystem.getDevice().createBuffer(() -> "Cloud vertex buffer", BufferType.VERTICES, BufferUsage.DYNAMIC_WRITE, $$20.a());
                  }

                  this.s = $$20.c().c();
               }
            }
         }

         if (this.s != 0) {
            RenderSystem.setShaderColor(ayh.j($$0), ayh.k($$0), ayh.l($$0), 1.0F);
            if ($$18) {
               this.a(grw.V, $$16, $$5, $$17);
            }

            this.a($$19, $$16, $$5, $$17);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }

   private void a(RenderPipeline $$0, float $$1, float $$2, float $$3) {
      RenderSystem.setModelOffset(-$$1, $$2, -$$3);
      fjr $$4 = fqq.Q().h();
      fjr $$5 = fqq.Q().f.u();
      GpuTexture $$6;
      GpuTexture $$7;
      if ($$5 != null) {
         $$6 = $$5.c();
         $$7 = $$5.d();
      } else {
         $$6 = $$4.c();
         $$7 = $$4.d();
      }

      GpuBuffer $$10 = this.t.b(this.s);

      try (RenderPass $$11 = RenderSystem.getDevice().createCommandEncoder().createRenderPass($$6, OptionalInt.empty(), $$7, OptionalDouble.empty())) {
         $$11.setPipeline($$0);
         $$11.setIndexBuffer($$10, this.t.a());
         $$11.setVertexBuffer(0, this.r);
         $$11.drawIndexed(0, this.s);
      }

      RenderSystem.resetModelOffset();
   }

   @Nullable
   private flc a(flf $$0, int $$1, int $$2, fqc $$3, gqx.a $$4, RenderPipeline $$5) {
      float $$6 = 0.8F;
      int $$7 = ayh.a(0.8F, 1.0F, 1.0F, 1.0F);
      int $$8 = ayh.a(0.8F, 0.9F, 0.9F, 0.9F);
      int $$9 = ayh.a(0.8F, 0.7F, 0.7F, 0.7F);
      int $$10 = ayh.a(0.8F, 0.8F, 0.8F, 0.8F);
      fkz $$11 = $$0.a($$5.getVertexFormatMode(), $$5.getVertexFormat());
      this.a($$4, $$11, $$1, $$2, $$9, $$7, $$8, $$10, $$3 == fqc.c);
      return $$11.a();
   }

   private void a(gqx.a $$0, fkz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8) {
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
                     this.a($$0, $$1, ayh.a($$4, $$18), ayh.a($$5, $$18), ayh.a($$6, $$18), ayh.a($$7, $$18), $$14, $$13, $$17);
                  } else {
                     this.a($$1, ayh.a($$5, $$18), $$14, $$13);
                  }
               }
            }
         }
      }
   }

   private void a(fkz $$0, int $$1, int $$2, int $$3) {
      float $$4 = (float)$$2 * 12.0F;
      float $$5 = $$4 + 12.0F;
      float $$6 = (float)$$3 * 12.0F;
      float $$7 = $$6 + 12.0F;
      $$0.a($$4, 0.0F, $$6).a($$1);
      $$0.a($$4, 0.0F, $$7).a($$1);
      $$0.a($$5, 0.0F, $$7).a($$1);
      $$0.a($$5, 0.0F, $$6).a($$1);
   }

   private void a(gqx.a $$0, fkz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, long $$8) {
      float $$9 = (float)$$6 * 12.0F;
      float $$10 = $$9 + 12.0F;
      float $$11 = 0.0F;
      float $$12 = 4.0F;
      float $$13 = (float)$$7 * 12.0F;
      float $$14 = $$13 + 12.0F;
      if ($$0 != gqx.a.c) {
         $$1.a($$9, 4.0F, $$13).a($$3);
         $$1.a($$9, 4.0F, $$14).a($$3);
         $$1.a($$10, 4.0F, $$14).a($$3);
         $$1.a($$10, 4.0F, $$13).a($$3);
      }

      if ($$0 != gqx.a.a) {
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
      if (this.r != null) {
         this.r.close();
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   public static record b(long[] a, int b, int c) {
   }
}
