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

public class glm implements glp.a, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final ajv b;
   final int c;
   final int d;
   private final evs e;
   evs[] f;
   @Nullable
   private final glm.a g;
   private final atg h;

   public glm(ajv $$0, gne $$1, evs $$2, atg $$3) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$1.b();
      this.h = $$3;
      gnc $$4 = $$3.a(gnc.a).orElse(gnc.e);
      this.g = this.a($$1, $$2.a(), $$2.b(), $$4);
      this.e = $$2;
      this.f = new evs[]{this.e};
   }

   public void a(int $$0) {
      try {
         this.f = glh.a(this.f, $$0);
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
   private glm.a a(gne $$0, int $$1, int $$2, gnc $$3) {
      int $$4 = $$1 / $$0.a();
      int $$5 = $$2 / $$0.b();
      int $$6 = $$4 * $$5;
      List<glm.b> $$7 = new ArrayList<>();
      $$3.a(($$1x, $$2x) -> $$7.add(new glm.b($$1x, $$2x)));
      if ($$7.isEmpty()) {
         for (int $$8 = 0; $$8 < $$6; $$8++) {
            $$7.add(new glm.b($$8, $$3.a()));
         }
      } else {
         int $$9 = 0;
         IntSet $$10 = new IntOpenHashSet();

         for (Iterator<glm.b> $$11 = $$7.iterator(); $$11.hasNext(); $$9++) {
            glm.b $$12 = $$11.next();
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

      return $$7.size() <= 1 ? null : new glm.a(ImmutableList.copyOf($$7), $$4, $$3.b());
   }

   void a(int $$0, int $$1, int $$2, int $$3, evs[] $$4) {
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
   public ajv c() {
      return this.b;
   }

   public IntStream d() {
      return this.g != null ? this.g.b() : IntStream.of(1);
   }

   @Nullable
   public glo e() {
      return this.g != null ? this.g.a() : null;
   }

   public atg f() {
      return this.h;
   }

   @Override
   public void close() {
      for (evs $$0 : this.f) {
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
      final List<glm.b> b;
      private final int c;
      private final boolean d;

      a(List<glm.b> $$0, int $$1, boolean $$2) {
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
         int $$3 = this.a($$2) * glm.this.c;
         int $$4 = this.b($$2) * glm.this.d;
         glm.this.a($$0, $$1, $$3, $$4, glm.this.f);
      }

      public glo a() {
         return glm.this.new d(this, this.d ? glm.this.new c() : null);
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
      private final evs[] b = new evs[glm.this.f.length];

      c() {
         for (int $$0 = 0; $$0 < this.b.length; $$0++) {
            int $$1 = glm.this.c >> $$0;
            int $$2 = glm.this.d >> $$0;
            this.b[$$0] = new evs($$1, $$2, false);
         }
      }

      void a(int $$0, int $$1, glm.d $$2) {
         glm.a $$3 = $$2.d;
         List<glm.b> $$4 = $$3.b;
         glm.b $$5 = $$4.get($$2.b);
         double $$6 = 1.0 - (double)$$2.c / (double)$$5.b;
         int $$7 = $$5.a;
         int $$8 = $$4.get(($$2.b + 1) % $$4.size()).a;
         if ($$7 != $$8) {
            for (int $$9 = 0; $$9 < this.b.length; $$9++) {
               int $$10 = glm.this.c >> $$9;
               int $$11 = glm.this.d >> $$9;

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

            glm.this.a($$0, $$1, 0, 0, this.b);
         }
      }

      private int a(glm.a $$0, int $$1, int $$2, int $$3, int $$4) {
         return glm.this.f[$$2].a($$3 + ($$0.a($$1) * glm.this.c >> $$2), $$4 + ($$0.b($$1) * glm.this.d >> $$2));
      }

      private int a(double $$0, int $$1, int $$2) {
         return (int)($$0 * (double)$$1 + (1.0 - $$0) * (double)$$2);
      }

      @Override
      public void close() {
         for (evs $$0 : this.b) {
            $$0.close();
         }
      }
   }

   class d implements glo {
      int b;
      int c;
      final glm.a d;
      @Nullable
      private final glm.c e;

      d(glm.a $$0, @Nullable glm.c $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public void a(int $$0, int $$1) {
         this.c++;
         glm.b $$2 = this.d.b.get(this.b);
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
