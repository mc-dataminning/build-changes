import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfe extends dzt {
   static final Logger a = LogUtils.getLogger();
   private final dzz b;
   private final etl c;
   volatile gfe.a d;
   final gfi e;

   public gfe(gfi $$0, int $$1) {
      this.e = $$0;
      this.b = new dzv($$0, new dgn(0, 0), $$0.K_().e(mb.aI).b(diq.b));
      this.c = new etl(this, true, $$0.G_().g());
      this.d = new gfe.a(b($$1));
   }

   @Override
   public etl p() {
      return this.c;
   }

   private static boolean a(@Nullable dzz $$0, int $$1, int $$2) {
      if ($$0 == null) {
         return false;
      } else {
         dgn $$3 = $$0.f();
         return $$3.g == $$1 && $$3.h == $$2;
      }
   }

   public void a(dgn $$0) {
      if (this.d.b($$0.g, $$0.h)) {
         int $$1 = this.d.a($$0.g, $$0.h);
         dzz $$2 = this.d.a($$1);
         if (a($$2, $$0.g, $$0.h)) {
            this.d.b($$1, $$2);
         }
      }
   }

   @Nullable
   public dzz b(int $$0, int $$1, eaq $$2, boolean $$3) {
      if (this.d.b($$0, $$1)) {
         dzz $$4 = this.d.a(this.d.a($$0, $$1));
         if (a($$4, $$0, $$1)) {
            return $$4;
         }
      }

      return $$3 ? this.b : null;
   }

   @Override
   public dgm q() {
      return this.e;
   }

   public void a(int $$0, int $$1, ws $$2) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
      } else {
         int $$3 = this.d.a($$0, $$1);
         dzz $$4 = this.d.b.get($$3);
         if (!a($$4, $$0, $$1)) {
            a.warn("Ignoring chunk since it's not present: {}, {}", $$0, $$1);
         } else {
            $$4.a($$2);
         }
      }
   }

   @Nullable
   public dzz a(int $$0, int $$1, ws $$2, ux $$3, Consumer<aed.b> $$4) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
         return null;
      } else {
         int $$5 = this.d.a($$0, $$1);
         dzz $$6 = this.d.b.get($$5);
         dgn $$7 = new dgn($$0, $$1);
         if (!a($$6, $$0, $$1)) {
            $$6 = new dzz(this.e, $$7);
            $$6.a($$2, $$3, $$4);
            this.d.a($$5, $$6);
         } else {
            $$6.a($$2, $$3, $$4);
         }

         this.e.a($$7);
         return $$6;
      }
   }

   @Override
   public void a(BooleanSupplier $$0, boolean $$1) {
   }

   public void d(int $$0, int $$1) {
      this.d.f = $$0;
      this.d.g = $$1;
   }

   public void a(int $$0) {
      int $$1 = this.d.d;
      int $$2 = b($$0);
      if ($$1 != $$2) {
         gfe.a $$3 = new gfe.a($$2);
         $$3.f = this.d.f;
         $$3.g = this.d.g;

         for (int $$4 = 0; $$4 < this.d.b.length(); $$4++) {
            dzz $$5 = this.d.b.get($$4);
            if ($$5 != null) {
               dgn $$6 = $$5.f();
               if ($$3.b($$6.g, $$6.h)) {
                  $$3.a($$3.a($$6.g, $$6.h), $$5);
               }
            }
         }

         this.d = $$3;
      }
   }

   private static int b(int $$0) {
      return Math.max(2, $$0) + 3;
   }

   @Override
   public String e() {
      return this.d.b.length() + ", " + this.j();
   }

   @Override
   public int j() {
      return this.d.h;
   }

   @Override
   public void a(dhq $$0, kj $$1) {
      fme.Q().f.b($$1.a(), $$1.b(), $$1.c());
   }

   public LongOpenHashSet a() {
      return this.d.c;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.d.a($$0, $$1, $$2, $$3);
   }

   final class a {
      final AtomicReferenceArray<dzz> b;
      final LongOpenHashSet c = new LongOpenHashSet();
      final int d;
      private final int e;
      volatile int f;
      volatile int g;
      int h;

      a(final int $$0) {
         this.d = $$0;
         this.e = $$0 * 2 + 1;
         this.b = new AtomicReferenceArray<>(this.e * this.e);
      }

      int a(int $$0, int $$1) {
         return Math.floorMod($$1, this.e) * this.e + Math.floorMod($$0, this.e);
      }

      void a(int $$0, @Nullable dzz $$1) {
         dzz $$2 = this.b.getAndSet($$0, $$1);
         if ($$2 != null) {
            this.h--;
            this.a($$2);
            gfe.this.e.a($$2);
         }

         if ($$1 != null) {
            this.h++;
            this.b($$1);
         }
      }

      void b(int $$0, dzz $$1) {
         if (this.b.compareAndSet($$0, $$1, null)) {
            this.h--;
            this.a($$1);
         }

         gfe.this.e.a($$1);
      }

      public void a(int $$0, int $$1, int $$2, boolean $$3) {
         if (this.b($$0, $$2)) {
            long $$4 = kj.b($$0, $$1, $$2);
            if ($$3) {
               this.c.add($$4);
            } else if (this.c.remove($$4)) {
               gfe.this.e.b($$4);
            }
         }
      }

      private void a(dzz $$0) {
         eaa[] $$1 = $$0.d();

         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            dgn $$3 = $$0.f();
            this.c.remove(kj.b($$3.g, $$0.h($$2), $$3.h));
         }
      }

      private void b(dzz $$0) {
         eaa[] $$1 = $$0.d();

         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            eaa $$3 = $$1[$$2];
            if ($$3.c()) {
               dgn $$4 = $$0.f();
               this.c.add(kj.b($$4.g, $$0.h($$2), $$4.h));
            }
         }
      }

      boolean b(int $$0, int $$1) {
         return Math.abs($$0 - this.f) <= this.d && Math.abs($$1 - this.g) <= this.d;
      }

      @Nullable
      protected dzz a(int $$0) {
         return this.b.get($$0);
      }

      private void a(String $$0) {
         try (FileOutputStream $$1 = new FileOutputStream($$0)) {
            int $$2 = gfe.this.d.d;

            for (int $$3 = this.g - $$2; $$3 <= this.g + $$2; $$3++) {
               for (int $$4 = this.f - $$2; $$4 <= this.f + $$2; $$4++) {
                  dzz $$5 = gfe.this.d.b.get(gfe.this.d.a($$4, $$3));
                  if ($$5 != null) {
                     dgn $$6 = $$5.f();
                     $$1.write(($$6.g + "\t" + $$6.h + "\t" + $$5.B() + "\n").getBytes(StandardCharsets.UTF_8));
                  }
               }
            }
         } catch (IOException var10) {
            gfe.a.error("Failed to dump chunks to file {}", $$0, var10);
         }
      }
   }
}
