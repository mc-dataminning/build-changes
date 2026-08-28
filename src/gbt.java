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

public class gbt extends dxd {
   static final Logger a = LogUtils.getLogger();
   private final dxj b;
   private final eqt c;
   volatile gbt.a d;
   final gbx e;

   public gbt(gbx $$0, int $$1) {
      this.e = $$0;
      this.b = new dxf($$0, new deb(0, 0), $$0.H_().e(ly.aG).b(dgd.b));
      this.c = new eqt(this, true, $$0.D_().g());
      this.d = new gbt.a(b($$1));
   }

   @Override
   public eqt p() {
      return this.c;
   }

   private static boolean a(@Nullable dxj $$0, int $$1, int $$2) {
      if ($$0 == null) {
         return false;
      } else {
         deb $$3 = $$0.f();
         return $$3.e == $$1 && $$3.f == $$2;
      }
   }

   public void a(deb $$0) {
      if (this.d.b($$0.e, $$0.f)) {
         int $$1 = this.d.a($$0.e, $$0.f);
         dxj $$2 = this.d.a($$1);
         if (a($$2, $$0.e, $$0.f)) {
            this.d.b($$1, $$2);
         }
      }
   }

   @Nullable
   public dxj b(int $$0, int $$1, dya $$2, boolean $$3) {
      if (this.d.b($$0, $$1)) {
         dxj $$4 = this.d.a(this.d.a($$0, $$1));
         if (a($$4, $$0, $$1)) {
            return $$4;
         }
      }

      return $$3 ? this.b : null;
   }

   @Override
   public dea q() {
      return this.e;
   }

   public void a(int $$0, int $$1, we $$2) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
      } else {
         int $$3 = this.d.a($$0, $$1);
         dxj $$4 = this.d.b.get($$3);
         if (!a($$4, $$0, $$1)) {
            a.warn("Ignoring chunk since it's not present: {}, {}", $$0, $$1);
         } else {
            $$4.a($$2);
         }
      }
   }

   @Nullable
   public dxj a(int $$0, int $$1, we $$2, uj $$3, Consumer<ado.b> $$4) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
         return null;
      } else {
         int $$5 = this.d.a($$0, $$1);
         dxj $$6 = this.d.b.get($$5);
         deb $$7 = new deb($$0, $$1);
         if (!a($$6, $$0, $$1)) {
            $$6 = new dxj(this.e, $$7);
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
         gbt.a $$3 = new gbt.a($$2);
         $$3.f = this.d.f;
         $$3.g = this.d.g;

         for (int $$4 = 0; $$4 < this.d.b.length(); $$4++) {
            dxj $$5 = this.d.b.get($$4);
            if ($$5 != null) {
               deb $$6 = $$5.f();
               if ($$3.b($$6.e, $$6.f)) {
                  $$3.a($$3.a($$6.e, $$6.f), $$5);
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
   public void a(dfe $$0, ki $$1) {
      fja.Q().f.b($$1.a(), $$1.b(), $$1.c());
   }

   public LongOpenHashSet a() {
      return this.d.c;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.d.a($$0, $$1, $$2, $$3);
   }

   final class a {
      final AtomicReferenceArray<dxj> b;
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

      void a(int $$0, @Nullable dxj $$1) {
         dxj $$2 = this.b.getAndSet($$0, $$1);
         if ($$2 != null) {
            this.h--;
            this.a($$2);
            gbt.this.e.a($$2);
         }

         if ($$1 != null) {
            this.h++;
            this.b($$1);
         }
      }

      void b(int $$0, dxj $$1) {
         if (this.b.compareAndSet($$0, $$1, null)) {
            this.h--;
            this.a($$1);
         }

         gbt.this.e.a($$1);
      }

      public void a(int $$0, int $$1, int $$2, boolean $$3) {
         if (this.b($$0, $$2)) {
            long $$4 = ki.b($$0, $$1, $$2);
            if ($$3) {
               this.c.add($$4);
            } else if (this.c.remove($$4)) {
               gbt.this.e.d($$4);
            }
         }
      }

      private void a(dxj $$0) {
         dxk[] $$1 = $$0.d();

         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            deb $$3 = $$0.f();
            this.c.remove(ki.b($$3.e, $$0.h($$2), $$3.f));
         }
      }

      private void b(dxj $$0) {
         dxk[] $$1 = $$0.d();

         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            dxk $$3 = $$1[$$2];
            if ($$3.c()) {
               deb $$4 = $$0.f();
               this.c.add(ki.b($$4.e, $$0.h($$2), $$4.f));
            }
         }
      }

      boolean b(int $$0, int $$1) {
         return Math.abs($$0 - this.f) <= this.d && Math.abs($$1 - this.g) <= this.d;
      }

      @Nullable
      protected dxj a(int $$0) {
         return this.b.get($$0);
      }

      private void a(String $$0) {
         try (FileOutputStream $$1 = new FileOutputStream($$0)) {
            int $$2 = gbt.this.d.d;

            for (int $$3 = this.g - $$2; $$3 <= this.g + $$2; $$3++) {
               for (int $$4 = this.f - $$2; $$4 <= this.f + $$2; $$4++) {
                  dxj $$5 = gbt.this.d.b.get(gbt.this.d.a($$4, $$3));
                  if ($$5 != null) {
                     deb $$6 = $$5.f();
                     $$1.write(($$6.e + "\t" + $$6.f + "\t" + $$5.B() + "\n").getBytes(StandardCharsets.UTF_8));
                  }
               }
            }
         } catch (IOException var10) {
            gbt.a.error("Failed to dump chunks to file {}", $$0, var10);
         }
      }
   }
}
