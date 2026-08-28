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

public class hku implements hkx.a, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final ali b;
   final int c;
   final int d;
   private final fkg e;
   fkg[] f;
   @Nullable
   private final hku.a g;
   private final avh h;

   public hku(ali $$0, hmo $$1, fkg $$2, avh $$3) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$1.b();
      this.h = $$3;
      this.g = $$3.a(hmn.b).map($$2x -> this.a($$1, $$2.a(), $$2.b(), $$2x)).orElse(null);
      this.e = $$2;
      this.f = new fkg[]{this.e};
   }

   public void a(int $$0) {
      try {
         this.f = hko.a(this.f, $$0);
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
   private hku.a a(hmo $$0, int $$1, int $$2, hmn $$3) {
      int $$4 = $$1 / $$0.a();
      int $$5 = $$2 / $$0.b();
      int $$6 = $$4 * $$5;
      int $$7 = $$3.d();
      List<hku.b> $$8;
      if ($$3.a().isEmpty()) {
         $$8 = new ArrayList<>($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            $$8.add(new hku.b($$9, $$7));
         }
      } else {
         List<hmm> $$10 = $$3.a().get();
         $$8 = new ArrayList<>($$10.size());

         for (hmm $$12 : $$10) {
            $$8.add(new hku.b($$12.a(), $$12.a($$7)));
         }

         int $$13 = 0;
         IntSet $$14 = new IntOpenHashSet();

         for (Iterator<hku.b> $$15 = $$8.iterator(); $$15.hasNext(); $$13++) {
            hku.b $$16 = $$15.next();
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

      return $$8.size() <= 1 ? null : new hku.a(List.copyOf($$8), $$4, $$3.e());
   }

   void a(int $$0, int $$1, int $$2, int $$3, fkg[] $$4, flh $$5) {
      for (int $$6 = 0; $$6 < this.f.length; $$6++) {
         RenderSystem.getDevice().b().a($$5, $$4[$$6], $$6, $$0 >> $$6, $$1 >> $$6, this.c >> $$6, this.d >> $$6, $$2 >> $$6, $$3 >> $$6);
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
   public ali c() {
      return this.b;
   }

   public IntStream d() {
      return this.g != null ? this.g.b() : IntStream.of(1);
   }

   @Nullable
   public hkw e() {
      return this.g != null ? this.g.a() : null;
   }

   public avh f() {
      return this.h;
   }

   @Override
   public void close() {
      for (fkg $$0 : this.f) {
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

      return axy.a(this.e.a($$3, $$4)) == 0;
   }

   public void a(int $$0, int $$1, flh $$2) {
      if (this.g != null) {
         this.g.a($$0, $$1, $$2);
      } else {
         this.a($$0, $$1, 0, 0, this.f, $$2);
      }
   }

   class a {
      final List<hku.b> b;
      private final int c;
      private final boolean d;

      a(final List<hku.b> $$0, final int $$1, final boolean $$2) {
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

      void a(int $$0, int $$1, int $$2, flh $$3) {
         int $$4 = this.a($$2) * hku.this.c;
         int $$5 = this.b($$2) * hku.this.d;
         hku.this.a($$0, $$1, $$4, $$5, hku.this.f, $$3);
      }

      public hkw a() {
         return hku.this.new d(this, this.d ? hku.this.new c() : null);
      }

      public void a(int $$0, int $$1, flh $$2) {
         this.a($$0, $$1, this.b.get(0).a, $$2);
      }

      public IntStream b() {
         return this.b.stream().mapToInt($$0 -> $$0.a).distinct();
      }
   }

   static record b(int a, int b) {
   }

   final class c implements AutoCloseable {
      private final fkg[] b = new fkg[hku.this.f.length];

      c() {
         for (int $$0 = 0; $$0 < this.b.length; $$0++) {
            int $$1 = hku.this.c >> $$0;
            int $$2 = hku.this.d >> $$0;
            this.b[$$0] = new fkg($$1, $$2, false);
         }
      }

      void a(int $$0, int $$1, hku.d $$2, flh $$3) {
         hku.a $$4 = $$2.c;
         List<hku.b> $$5 = $$4.b;
         hku.b $$6 = $$5.get($$2.a);
         float $$7 = (float)$$2.b / (float)$$6.b;
         int $$8 = $$6.a;
         int $$9 = $$5.get(($$2.a + 1) % $$5.size()).a;
         if ($$8 != $$9) {
            for (int $$10 = 0; $$10 < this.b.length; $$10++) {
               int $$11 = hku.this.c >> $$10;
               int $$12 = hku.this.d >> $$10;

               for (int $$13 = 0; $$13 < $$12; $$13++) {
                  for (int $$14 = 0; $$14 < $$11; $$14++) {
                     int $$15 = this.a($$4, $$8, $$10, $$14, $$13);
                     int $$16 = this.a($$4, $$9, $$10, $$14, $$13);
                     this.b[$$10].b($$14, $$13, axy.a($$7, $$15, $$16));
                  }
               }
            }

            hku.this.a($$0, $$1, 0, 0, this.b, $$3);
         }
      }

      private int a(hku.a $$0, int $$1, int $$2, int $$3, int $$4) {
         return hku.this.f[$$2].a($$3 + ($$0.a($$1) * hku.this.c >> $$2), $$4 + ($$0.b($$1) * hku.this.d >> $$2));
      }

      @Override
      public void close() {
         for (fkg $$0 : this.b) {
            $$0.close();
         }
      }
   }

   class d implements hkw {
      int a;
      int b;
      final hku.a c;
      @Nullable
      private final hku.c d;

      d(final hku.a $$0, @Nullable final hku.c $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(int $$0, int $$1, flh $$2) {
         this.b++;
         hku.b $$3 = this.c.b.get(this.a);
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
