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

public class giz extends ebp {
   static final Logger a = LogUtils.getLogger();
   private final ebv b;
   private final evk c;
   volatile giz.a d;
   final gjd e;

   public giz(gjd $$0, int $$1) {
      this.e = $$0;
      this.b = new ebr($$0, new dhw(0, 0), $$0.F_().f(mg.aG).b(djz.b));
      this.c = new evk(this, true, $$0.B_().g());
      this.d = new giz.a(b($$1));
   }

   @Override
   public evk q() {
      return this.c;
   }

   private static boolean a(@Nullable ebv $$0, int $$1, int $$2) {
      if ($$0 == null) {
         return false;
      } else {
         dhw $$3 = $$0.f();
         return $$3.h == $$1 && $$3.i == $$2;
      }
   }

   public void a(dhw $$0) {
      if (this.d.b($$0.h, $$0.i)) {
         int $$1 = this.d.a($$0.h, $$0.i);
         ebv $$2 = this.d.a($$1);
         if (a($$2, $$0.h, $$0.i)) {
            this.d.b($$1, $$2);
         }
      }
   }

   @Nullable
   public ebv b(int $$0, int $$1, ecm $$2, boolean $$3) {
      if (this.d.b($$0, $$1)) {
         ebv $$4 = this.d.a(this.d.a($$0, $$1));
         if (a($$4, $$0, $$1)) {
            return $$4;
         }
      }

      return $$3 ? this.b : null;
   }

   @Override
   public dhv r() {
      return this.e;
   }

   public void a(int $$0, int $$1, vs $$2) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
      } else {
         int $$3 = this.d.a($$0, $$1);
         ebv $$4 = this.d.b.get($$3);
         if (!a($$4, $$0, $$1)) {
            a.warn("Ignoring chunk since it's not present: {}, {}", $$0, $$1);
         } else {
            $$4.a($$2);
         }
      }
   }

   @Nullable
   public ebv a(int $$0, int $$1, vs $$2, tx $$3, Consumer<add.b> $$4) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
         return null;
      } else {
         int $$5 = this.d.a($$0, $$1);
         ebv $$6 = this.d.b.get($$5);
         dhw $$7 = new dhw($$0, $$1);
         if (!a($$6, $$0, $$1)) {
            $$6 = new ebv(this.e, $$7);
            $$6.a($$2, $$3, $$4);
            this.d.a($$5, $$6);
         } else {
            $$6.a($$2, $$3, $$4);
            this.d.c($$6);
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
         giz.a $$3 = new giz.a($$2);
         $$3.f = this.d.f;
         $$3.g = this.d.g;

         for (int $$4 = 0; $$4 < this.d.b.length(); $$4++) {
            ebv $$5 = this.d.b.get($$4);
            if ($$5 != null) {
               dhw $$6 = $$5.f();
               if ($$3.b($$6.h, $$6.i)) {
                  $$3.a($$3.a($$6.h, $$6.i), $$5);
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
   public void a(diy $$0, jx $$1) {
      fof.Q().f.b($$1.a(), $$1.b(), $$1.c());
   }

   public LongOpenHashSet a() {
      return this.d.c;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.d.a($$0, $$1, $$2, $$3);
   }

   final class a {
      final AtomicReferenceArray<ebv> b;
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

      void a(int $$0, @Nullable ebv $$1) {
         ebv $$2 = this.b.getAndSet($$0, $$1);
         if ($$2 != null) {
            this.h--;
            this.a($$2);
            giz.this.e.a($$2);
         }

         if ($$1 != null) {
            this.h++;
            this.b($$1);
         }
      }

      void b(int $$0, ebv $$1) {
         if (this.b.compareAndSet($$0, $$1, null)) {
            this.h--;
            this.a($$1);
         }

         giz.this.e.a($$1);
      }

      public void a(int $$0, int $$1, int $$2, boolean $$3) {
         if (this.b($$0, $$2)) {
            long $$4 = jx.b($$0, $$1, $$2);
            if ($$3) {
               this.c.add($$4);
            } else if (this.c.remove($$4)) {
               giz.this.e.b($$4);
            }
         }
      }

      private void a(ebv $$0) {
         ebw[] $$1 = $$0.d();

         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            dhw $$3 = $$0.f();
            this.c.remove(jx.b($$3.h, $$0.h($$2), $$3.i));
         }
      }

      private void b(ebv $$0) {
         ebw[] $$1 = $$0.d();

         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            ebw $$3 = $$1[$$2];
            if ($$3.c()) {
               dhw $$4 = $$0.f();
               this.c.add(jx.b($$4.h, $$0.h($$2), $$4.i));
            }
         }
      }

      void c(ebv $$0) {
         dhw $$1 = $$0.f();
         ebw[] $$2 = $$0.d();

         for (int $$3 = 0; $$3 < $$2.length; $$3++) {
            ebw $$4 = $$2[$$3];
            long $$5 = jx.b($$1.h, $$0.h($$3), $$1.i);
            if ($$4.c()) {
               this.c.add($$5);
            } else if (this.c.remove($$5)) {
               giz.this.e.b($$5);
            }
         }
      }

      boolean b(int $$0, int $$1) {
         return Math.abs($$0 - this.f) <= this.d && Math.abs($$1 - this.g) <= this.d;
      }

      @Nullable
      protected ebv a(int $$0) {
         return this.b.get($$0);
      }

      private void a(String $$0) {
         try (FileOutputStream $$1 = new FileOutputStream($$0)) {
            int $$2 = giz.this.d.d;

            for (int $$3 = this.g - $$2; $$3 <= this.g + $$2; $$3++) {
               for (int $$4 = this.f - $$2; $$4 <= this.f + $$2; $$4++) {
                  ebv $$5 = giz.this.d.b.get(giz.this.d.a($$4, $$3));
                  if ($$5 != null) {
                     dhw $$6 = $$5.f();
                     $$1.write(($$6.h + "\t" + $$6.i + "\t" + $$5.E() + "\n").getBytes(StandardCharsets.UTF_8));
                  }
               }
            }
         } catch (IOException var10) {
            giz.a.error("Failed to dump chunks to file {}", $$0, var10);
         }
      }
   }
}
