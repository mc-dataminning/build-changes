import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hkk implements hkn.a, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final alr b;
   final int c;
   final int d;
   private final fkf e;
   fkf[] f;
   @Nullable
   private final hkk.a g;
   private final avq h;

   public hkk(alr $$0, hme $$1, fkf $$2, avq $$3) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$1.b();
      this.h = $$3;
      this.g = $$3.a(hmd.b).map($$2x -> this.a($$1, $$2.a(), $$2.b(), $$2x)).orElse(null);
      this.e = $$2;
      this.f = new fkf[]{this.e};
   }

   public void a(int $$0) {
      try {
         this.f = hke.a(this.f, $$0);
      } catch (Throwable var6) {
         p $$2 = p.a(var6, "Generating mipmaps for frame");
         q $$3 = $$2.a("Sprite being mipmapped");
         $$3.a("First frame", () -> {
            StringBuilder $$0x = new StringBuilder();
            if ($$0x.length() > 0) {
               $$0x.append(", ");
            }

            $$0x.append(this.e.a()).append("x").append(this.e.b());
            return $$0x.toString();
         });
         q $$4 = $$2.a("Frame being iterated");
         $$4.a("Sprite name", this.b);
         $$4.a("Sprite size", () -> this.c + " x " + this.d);
         $$4.a("Sprite frames", () -> this.g() + " frames");
         $$4.a("Mipmap levels", $$0);
         throw new aa($$2);
      }
   }

   private int g() {
      return this.g != null ? this.g.b.size() : 1;
   }

   @Nullable
   private hkk.a a(hme $$0, int $$1, int $$2, hmd $$3) {
      int $$4 = $$1 / $$0.a();
      int $$5 = $$2 / $$0.b();
      int $$6 = $$4 * $$5;
      int $$7 = $$3.d();
      List<hkk.b> $$8;
      if ($$3.a().isEmpty()) {
         $$8 = new ArrayList<>($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            $$8.add(new hkk.b($$9, $$7));
         }
      } else {
         List<hmc> $$10 = $$3.a().get();
         $$8 = new ArrayList<>($$10.size());

         for (hmc $$12 : $$10) {
            $$8.add(new hkk.b($$12.a(), $$12.a($$7)));
         }

         int $$13 = 0;
         IntSet $$14 = new IntOpenHashSet();

         for (Iterator<hkk.b> $$15 = $$8.iterator(); $$15.hasNext(); $$13++) {
            hkk.b $$16 = $$15.next();
            boolean $$17 = true;
            if ($$16.b <= 0) {
               a.warn("Invalid frame duration on sprite {} frame {}: {}", new Object[]{this.b, $$13, $$16.b});
               $$17 = false;
            }

            if ($$16.a < 0 || $$16.a >= $$6) {
               a.warn("Invalid frame index on sprite {} frame {}: {}", new Object[]{this.b, $$13, $$16.a});
               $$17 = false;
            }

            if ($$17) {
               $$14.add($$16.a);
            } else {
               $$15.remove();
            }
         }

         int[] $$18 = IntStream.range(0, $$6).filter($$1x -> !$$14.contains($$1x)).toArray();
         if ($$18.length > 0) {
            a.warn("Unused frames in sprite {}: {}", this.b, Arrays.toString($$18));
         }
      }

      return $$8.size() <= 1 ? null : new hkk.a(List.copyOf($$8), $$4, $$3.e());
   }

   void a(int $$0, int $$1, int $$2, int $$3, fkf[] $$4, GpuTexture $$5) {
      for (int $$6 = 0; $$6 < this.f.length; $$6++) {
         RenderSystem.getDevice()
            .createCommandEncoder()
            .writeToTexture($$5, $$4[$$6], $$6, $$0 >> $$6, $$1 >> $$6, this.c >> $$6, this.d >> $$6, $$2 >> $$6, $$3 >> $$6);
      }
   }

   @Override
   public int a() {
      return this.c;
   }

   @Override
   public int b() {
      return this.d;
   }

   @Override
   public alr c() {
      return this.b;
   }

   public IntStream d() {
      return this.g != null ? this.g.b() : IntStream.of(1);
   }

   @Nullable
   public hkm e() {
      return this.g != null ? this.g.a() : null;
   }

   public avq f() {
      return this.h;
   }

   @Override
   public void close() {
      for (fkf $$0 : this.f) {
         $$0.close();
      }
   }

   @Override
   public String toString() {
      return "SpriteContents{name=" + this.b + ", frameCount=" + this.g() + ", height=" + this.d + ", width=" + this.c + "}";
   }

   public boolean a(int $$0, int $$1, int $$2) {
      int $$3 = $$1;
      int $$4 = $$2;
      if (this.g != null) {
         $$3 = $$1 + this.g.a($$0) * this.c;
         $$4 = $$2 + this.g.b($$0) * this.d;
      }

      return ayh.a(this.e.a($$3, $$4)) == 0;
   }

   public void a(int $$0, int $$1, GpuTexture $$2) {
      if (this.g != null) {
         this.g.a($$0, $$1, $$2);
      } else {
         this.a($$0, $$1, 0, 0, this.f, $$2);
      }
   }

   class a {
      final List<hkk.b> b;
      private final int c;
      private final boolean d;

      a(final List<hkk.b> $$0, final int $$1, final boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      int a(int $$0) {
         return $$0 % this.c;
      }

      int b(int $$0) {
         return $$0 / this.c;
      }

      void a(int $$0, int $$1, int $$2, GpuTexture $$3) {
         int $$4 = this.a($$2) * hkk.this.c;
         int $$5 = this.b($$2) * hkk.this.d;
         hkk.this.a($$0, $$1, $$4, $$5, hkk.this.f, $$3);
      }

      public hkm a() {
         return hkk.this.new d(this, this.d ? hkk.this.new c() : null);
      }

      public void a(int $$0, int $$1, GpuTexture $$2) {
         this.a($$0, $$1, this.b.get(0).a, $$2);
      }

      public IntStream b() {
         return this.b.stream().mapToInt($$0 -> $$0.a).distinct();
      }
   }

   static record b(int a, int b) {
   }

   final class c implements AutoCloseable {
      private final fkf[] b = new fkf[hkk.this.f.length];

      c() {
         for (int $$0 = 0; $$0 < this.b.length; $$0++) {
            int $$1 = hkk.this.c >> $$0;
            int $$2 = hkk.this.d >> $$0;
            this.b[$$0] = new fkf($$1, $$2, false);
         }
      }

      void a(int $$0, int $$1, hkk.d $$2, GpuTexture $$3) {
         hkk.a $$4 = $$2.c;
         List<hkk.b> $$5 = $$4.b;
         hkk.b $$6 = $$5.get($$2.a);
         float $$7 = (float)$$2.b / (float)$$6.b;
         int $$8 = $$6.a;
         int $$9 = $$5.get(($$2.a + 1) % $$5.size()).a;
         if ($$8 != $$9) {
            for (int $$10 = 0; $$10 < this.b.length; $$10++) {
               int $$11 = hkk.this.c >> $$10;
               int $$12 = hkk.this.d >> $$10;

               for (int $$13 = 0; $$13 < $$12; $$13++) {
                  for (int $$14 = 0; $$14 < $$11; $$14++) {
                     int $$15 = this.a($$4, $$8, $$10, $$14, $$13);
                     int $$16 = this.a($$4, $$9, $$10, $$14, $$13);
                     this.b[$$10].b($$14, $$13, ayh.a($$7, $$15, $$16));
                  }
               }
            }

            hkk.this.a($$0, $$1, 0, 0, this.b, $$3);
         }
      }

      private int a(hkk.a $$0, int $$1, int $$2, int $$3, int $$4) {
         return hkk.this.f[$$2].a($$3 + ($$0.a($$1) * hkk.this.c >> $$2), $$4 + ($$0.b($$1) * hkk.this.d >> $$2));
      }

      @Override
      public void close() {
         for (fkf $$0 : this.b) {
            $$0.close();
         }
      }
   }

   class d implements hkm {
      int a;
      int b;
      final hkk.a c;
      @Nullable
      private final hkk.c d;

      d(final hkk.a $$0, @Nullable final hkk.c $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(int $$0, int $$1, GpuTexture $$2) {
         this.b++;
         hkk.b $$3 = this.c.b.get(this.a);
         if (this.b >= $$3.b) {
            int $$4 = $$3.a;
            this.a = (this.a + 1) % this.c.b.size();
            this.b = 0;
            int $$5 = this.c.b.get(this.a).a;
            if ($$4 != $$5) {
               this.c.a($$0, $$1, $$5, $$2);
            }
         } else if (this.d != null) {
            this.d.a($$0, $$1, this, $$2);
         }
      }

      @Override
      public void close() {
         if (this.d != null) {
            this.d.close();
         }
      }
   }
}
