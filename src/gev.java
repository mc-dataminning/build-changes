import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
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

public class gev implements gey.a, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final ahh b;
   final int c;
   final int d;
   private final epl e;
   epl[] f;
   @Nullable
   private final gev.a g;
   private final aql h;

   public gev(ahh $$0, ggn $$1, epl $$2, aql $$3) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$1.b();
      this.h = $$3;
      ggl $$4 = $$3.a(ggl.a).orElse(ggl.e);
      this.g = this.a($$1, $$2.a(), $$2.b(), $$4);
      this.e = $$2;
      this.f = new epl[]{this.e};
   }

   public void a(int $$0) {
      try {
         this.f = geq.a(this.f, $$0);
      } catch (Throwable var6) {
         o $$2 = o.a(var6, "Generating mipmaps for frame");
         p $$3 = $$2.a("Sprite being mipmapped");
         $$3.a("First frame", () -> {
            StringBuilder $$0x = new StringBuilder();
            if ($$0x.length() > 0) {
               $$0x.append(", ");
            }

            $$0x.append(this.e.a()).append("x").append(this.e.b());
            return $$0x.toString();
         });
         p $$4 = $$2.a("Frame being iterated");
         $$4.a("Sprite name", this.b);
         $$4.a("Sprite size", () -> this.c + " x " + this.d);
         $$4.a("Sprite frames", () -> this.g() + " frames");
         $$4.a("Mipmap levels", $$0);
         throw new y($$2);
      }
   }

   private int g() {
      return this.g != null ? this.g.b.size() : 1;
   }

   @Nullable
   private gev.a a(ggn $$0, int $$1, int $$2, ggl $$3) {
      int $$4 = $$1 / $$0.a();
      int $$5 = $$2 / $$0.b();
      int $$6 = $$4 * $$5;
      List<gev.b> $$7 = new ArrayList<>();
      $$3.a(($$1x, $$2x) -> $$7.add(new gev.b($$1x, $$2x)));
      if ($$7.isEmpty()) {
         for (int $$8 = 0; $$8 < $$6; $$8++) {
            $$7.add(new gev.b($$8, $$3.a()));
         }
      } else {
         int $$9 = 0;
         IntSet $$10 = new IntOpenHashSet();

         for (Iterator<gev.b> $$11 = $$7.iterator(); $$11.hasNext(); $$9++) {
            gev.b $$12 = $$11.next();
            boolean $$13 = true;
            if ($$12.b <= 0) {
               a.warn("Invalid frame duration on sprite {} frame {}: {}", new Object[]{this.b, $$9, $$12.b});
               $$13 = false;
            }

            if ($$12.a < 0 || $$12.a >= $$6) {
               a.warn("Invalid frame index on sprite {} frame {}: {}", new Object[]{this.b, $$9, $$12.a});
               $$13 = false;
            }

            if ($$13) {
               $$10.add($$12.a);
            } else {
               $$11.remove();
            }
         }

         int[] $$14 = IntStream.range(0, $$6).filter($$1x -> !$$10.contains($$1x)).toArray();
         if ($$14.length > 0) {
            a.warn("Unused frames in sprite {}: {}", this.b, Arrays.toString($$14));
         }
      }

      return $$7.size() <= 1 ? null : new gev.a(ImmutableList.copyOf($$7), $$4, $$3.b());
   }

   void a(int $$0, int $$1, int $$2, int $$3, epl[] $$4) {
      for (int $$5 = 0; $$5 < this.f.length; $$5++) {
         $$4[$$5].a($$5, $$0 >> $$5, $$1 >> $$5, $$2 >> $$5, $$3 >> $$5, this.c >> $$5, this.d >> $$5, this.f.length > 1, false);
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
   public ahh c() {
      return this.b;
   }

   public IntStream d() {
      return this.g != null ? this.g.b() : IntStream.of(1);
   }

   @Nullable
   public gex e() {
      return this.g != null ? this.g.a() : null;
   }

   public aql f() {
      return this.h;
   }

   @Override
   public void close() {
      for (epl $$0 : this.f) {
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

      return (this.e.a($$3, $$4) >> 24 & 0xFF) == 0;
   }

   public void a(int $$0, int $$1) {
      if (this.g != null) {
         this.g.a($$0, $$1);
      } else {
         this.a($$0, $$1, 0, 0, this.f);
      }
   }

   class a {
      final List<gev.b> b;
      private final int c;
      private final boolean d;

      a(List<gev.b> $$0, int $$1, boolean $$2) {
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

      void a(int $$0, int $$1, int $$2) {
         int $$3 = this.a($$2) * gev.this.c;
         int $$4 = this.b($$2) * gev.this.d;
         gev.this.a($$0, $$1, $$3, $$4, gev.this.f);
      }

      public gex a() {
         return gev.this.new d(this, this.d ? gev.this.new c() : null);
      }

      public void a(int $$0, int $$1) {
         this.a($$0, $$1, this.b.get(0).a);
      }

      public IntStream b() {
         return this.b.stream().mapToInt($$0 -> $$0.a).distinct();
      }
   }

   static class b {
      final int a;
      final int b;

      b(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   final class c implements AutoCloseable {
      private final epl[] b = new epl[gev.this.f.length];

      c() {
         for (int $$0 = 0; $$0 < this.b.length; $$0++) {
            int $$1 = gev.this.c >> $$0;
            int $$2 = gev.this.d >> $$0;
            this.b[$$0] = new epl($$1, $$2, false);
         }
      }

      void a(int $$0, int $$1, gev.d $$2) {
         gev.a $$3 = $$2.d;
         List<gev.b> $$4 = $$3.b;
         gev.b $$5 = $$4.get($$2.b);
         double $$6 = 1.0 - (double)$$2.c / (double)$$5.b;
         int $$7 = $$5.a;
         int $$8 = $$4.get(($$2.b + 1) % $$4.size()).a;
         if ($$7 != $$8) {
            for (int $$9 = 0; $$9 < this.b.length; $$9++) {
               int $$10 = gev.this.c >> $$9;
               int $$11 = gev.this.d >> $$9;

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  for (int $$13 = 0; $$13 < $$10; $$13++) {
                     int $$14 = this.a($$3, $$7, $$9, $$13, $$12);
                     int $$15 = this.a($$3, $$8, $$9, $$13, $$12);
                     int $$16 = this.a($$6, $$14 >> 16 & 0xFF, $$15 >> 16 & 0xFF);
                     int $$17 = this.a($$6, $$14 >> 8 & 0xFF, $$15 >> 8 & 0xFF);
                     int $$18 = this.a($$6, $$14 & 0xFF, $$15 & 0xFF);
                     this.b[$$9].a($$13, $$12, $$14 & 0xFF000000 | $$16 << 16 | $$17 << 8 | $$18);
                  }
               }
            }

            gev.this.a($$0, $$1, 0, 0, this.b);
         }
      }

      private int a(gev.a $$0, int $$1, int $$2, int $$3, int $$4) {
         return gev.this.f[$$2].a($$3 + ($$0.a($$1) * gev.this.c >> $$2), $$4 + ($$0.b($$1) * gev.this.d >> $$2));
      }

      private int a(double $$0, int $$1, int $$2) {
         return (int)($$0 * (double)$$1 + (1.0 - $$0) * (double)$$2);
      }

      @Override
      public void close() {
         for (epl $$0 : this.b) {
            $$0.close();
         }
      }
   }

   class d implements gex {
      int b;
      int c;
      final gev.a d;
      @Nullable
      private final gev.c e;

      d(gev.a $$0, @Nullable gev.c $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public void a(int $$0, int $$1) {
         this.c++;
         gev.b $$2 = this.d.b.get(this.b);
         if (this.c >= $$2.b) {
            int $$3 = $$2.a;
            this.b = (this.b + 1) % this.d.b.size();
            this.c = 0;
            int $$4 = this.d.b.get(this.b).a;
            if ($$3 != $$4) {
               this.d.a($$0, $$1, $$4);
            }
         } else if (this.e != null) {
            if (!RenderSystem.isOnRenderThread()) {
               RenderSystem.recordRenderCall(() -> this.e.a($$0, $$1, this));
            } else {
               this.e.a($$0, $$1, this);
            }
         }
      }

      @Override
      public void close() {
         if (this.e != null) {
            this.e.close();
         }
      }
   }
}
