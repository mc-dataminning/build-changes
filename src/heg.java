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

public class heg implements hej.a, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final aku b;
   final int c;
   final int d;
   private final fes e;
   fes[] f;
   @Nullable
   private final heg.a g;
   private final auq h;

   public heg(aku $$0, hga $$1, fes $$2, auq $$3) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$1.b();
      this.h = $$3;
      this.g = $$3.a(hfz.b).map($$2x -> this.a($$1, $$2.a(), $$2.b(), $$2x)).orElse(null);
      this.e = $$2;
      this.f = new fes[]{this.e};
   }

   public void a(int $$0) {
      try {
         this.f = hea.a(this.f, $$0);
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
         throw new z($$2);
      }
   }

   private int g() {
      return this.g != null ? this.g.b.size() : 1;
   }

   @Nullable
   private heg.a a(hga $$0, int $$1, int $$2, hfz $$3) {
      int $$4 = $$1 / $$0.a();
      int $$5 = $$2 / $$0.b();
      int $$6 = $$4 * $$5;
      int $$7 = $$3.d();
      List<heg.b> $$8;
      if ($$3.a().isEmpty()) {
         $$8 = new ArrayList<>($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            $$8.add(new heg.b($$9, $$7));
         }
      } else {
         List<hfy> $$10 = $$3.a().get();
         $$8 = new ArrayList<>($$10.size());

         for (hfy $$12 : $$10) {
            $$8.add(new heg.b($$12.a(), $$12.a($$7)));
         }

         int $$13 = 0;
         IntSet $$14 = new IntOpenHashSet();

         for (Iterator<heg.b> $$15 = $$8.iterator(); $$15.hasNext(); $$13++) {
            heg.b $$16 = $$15.next();
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

      return $$8.size() <= 1 ? null : new heg.a(List.copyOf($$8), $$4, $$3.e());
   }

   void a(int $$0, int $$1, int $$2, int $$3, fes[] $$4) {
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
   public aku c() {
      return this.b;
   }

   public IntStream d() {
      return this.g != null ? this.g.b() : IntStream.of(1);
   }

   @Nullable
   public hei e() {
      return this.g != null ? this.g.a() : null;
   }

   public auq f() {
      return this.h;
   }

   @Override
   public void close() {
      for (fes $$0 : this.f) {
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

      return axj.a(this.e.a($$3, $$4)) == 0;
   }

   public void a(int $$0, int $$1) {
      if (this.g != null) {
         this.g.a($$0, $$1);
      } else {
         this.a($$0, $$1, 0, 0, this.f);
      }
   }

   class a {
      final List<heg.b> b;
      private final int c;
      private final boolean d;

      a(final List<heg.b> $$0, final int $$1, final boolean $$2) {
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
         int $$3 = this.a($$2) * heg.this.c;
         int $$4 = this.b($$2) * heg.this.d;
         heg.this.a($$0, $$1, $$3, $$4, heg.this.f);
      }

      public hei a() {
         return heg.this.new d(this, this.d ? heg.this.new c() : null);
      }

      public void a(int $$0, int $$1) {
         this.a($$0, $$1, this.b.get(0).a);
      }

      public IntStream b() {
         return this.b.stream().mapToInt($$0 -> $$0.a).distinct();
      }
   }

   static record b(int a, int b) {
   }

   final class c implements AutoCloseable {
      private final fes[] b = new fes[heg.this.f.length];

      c() {
         for (int $$0 = 0; $$0 < this.b.length; $$0++) {
            int $$1 = heg.this.c >> $$0;
            int $$2 = heg.this.d >> $$0;
            this.b[$$0] = new fes($$1, $$2, false);
         }
      }

      void a(int $$0, int $$1, heg.d $$2) {
         heg.a $$3 = $$2.c;
         List<heg.b> $$4 = $$3.b;
         heg.b $$5 = $$4.get($$2.a);
         float $$6 = (float)$$2.b / (float)$$5.b;
         int $$7 = $$5.a;
         int $$8 = $$4.get(($$2.a + 1) % $$4.size()).a;
         if ($$7 != $$8) {
            for (int $$9 = 0; $$9 < this.b.length; $$9++) {
               int $$10 = heg.this.c >> $$9;
               int $$11 = heg.this.d >> $$9;

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  for (int $$13 = 0; $$13 < $$10; $$13++) {
                     int $$14 = this.a($$3, $$7, $$9, $$13, $$12);
                     int $$15 = this.a($$3, $$8, $$9, $$13, $$12);
                     this.b[$$9].a($$13, $$12, axj.a($$6, $$14, $$15));
                  }
               }
            }

            heg.this.a($$0, $$1, 0, 0, this.b);
         }
      }

      private int a(heg.a $$0, int $$1, int $$2, int $$3, int $$4) {
         return heg.this.f[$$2].a($$3 + ($$0.a($$1) * heg.this.c >> $$2), $$4 + ($$0.b($$1) * heg.this.d >> $$2));
      }

      @Override
      public void close() {
         for (fes $$0 : this.b) {
            $$0.close();
         }
      }
   }

   class d implements hei {
      int a;
      int b;
      final heg.a c;
      @Nullable
      private final heg.c d;

      d(final heg.a $$0, @Nullable final heg.c $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(int $$0, int $$1) {
         this.b++;
         heg.b $$2 = this.c.b.get(this.a);
         if (this.b >= $$2.b) {
            int $$3 = $$2.a;
            this.a = (this.a + 1) % this.c.b.size();
            this.b = 0;
            int $$4 = this.c.b.get(this.a).a;
            if ($$3 != $$4) {
               this.c.a($$0, $$1, $$4);
            }
         } else if (this.d != null) {
            this.d.a($$0, $$1, this);
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
