import com.mojang.logging.LogUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gat extends dwa {
   static final Logger a = LogUtils.getLogger();
   private final dwg b;
   private final epq c;
   volatile gat.a d;
   final gax e;

   public gat(gax $$0, int $$1) {
      this.e = $$0;
      this.b = new dwc($$0, new dcy(0, 0), $$0.F_().d(lv.aF).g(dfa.b));
      this.c = new epq(this, true, $$0.B_().g());
      this.d = new gat.a(b($$1));
   }

   @Override
   public epq p() {
      return this.c;
   }

   private static boolean a(@Nullable dwg $$0, int $$1, int $$2) {
      if ($$0 == null) {
         return false;
      } else {
         dcy $$3 = $$0.f();
         return $$3.e == $$1 && $$3.f == $$2;
      }
   }

   public void a(dcy $$0) {
      if (this.d.b($$0.e, $$0.f)) {
         int $$1 = this.d.a($$0.e, $$0.f);
         dwg $$2 = this.d.a($$1);
         if (a($$2, $$0.e, $$0.f)) {
            this.d.a($$1, $$2, null);
         }
      }
   }

   @Nullable
   public dwg b(int $$0, int $$1, dwx $$2, boolean $$3) {
      if (this.d.b($$0, $$1)) {
         dwg $$4 = this.d.a(this.d.a($$0, $$1));
         if (a($$4, $$0, $$1)) {
            return $$4;
         }
      }

      return $$3 ? this.b : null;
   }

   @Override
   public dcx q() {
      return this.e;
   }

   public void a(int $$0, int $$1, wa $$2) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
      } else {
         int $$3 = this.d.a($$0, $$1);
         dwg $$4 = this.d.b.get($$3);
         if (!a($$4, $$0, $$1)) {
            a.warn("Ignoring chunk since it's not present: {}, {}", $$0, $$1);
         } else {
            $$4.a($$2);
         }
      }
   }

   @Nullable
   public dwg a(int $$0, int $$1, wa $$2, uf $$3, Consumer<adk.b> $$4) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
         return null;
      } else {
         int $$5 = this.d.a($$0, $$1);
         dwg $$6 = this.d.b.get($$5);
         dcy $$7 = new dcy($$0, $$1);
         if (!a($$6, $$0, $$1)) {
            $$6 = new dwg(this.e, $$7);
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
      this.d.e = $$0;
      this.d.f = $$1;
   }

   public void a(int $$0) {
      int $$1 = this.d.c;
      int $$2 = b($$0);
      if ($$1 != $$2) {
         gat.a $$3 = new gat.a($$2);
         $$3.e = this.d.e;
         $$3.f = this.d.f;

         for (int $$4 = 0; $$4 < this.d.b.length(); $$4++) {
            dwg $$5 = this.d.b.get($$4);
            if ($$5 != null) {
               dcy $$6 = $$5.f();
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
      return this.d.g;
   }

   @Override
   public void a(deb $$0, kg $$1) {
      fib.Q().f.b($$1.a(), $$1.b(), $$1.c());
   }

   final class a {
      final AtomicReferenceArray<dwg> b;
      final int c;
      private final int d;
      volatile int e;
      volatile int f;
      int g;

      a(final int $$0) {
         this.c = $$0;
         this.d = $$0 * 2 + 1;
         this.b = new AtomicReferenceArray<>(this.d * this.d);
      }

      int a(int $$0, int $$1) {
         return Math.floorMod($$1, this.d) * this.d + Math.floorMod($$0, this.d);
      }

      protected void a(int $$0, @Nullable dwg $$1) {
         dwg $$2 = this.b.getAndSet($$0, $$1);
         if ($$2 != null) {
            this.g--;
            gat.this.e.a($$2);
         }

         if ($$1 != null) {
            this.g++;
         }
      }

      protected dwg a(int $$0, dwg $$1, @Nullable dwg $$2) {
         if (this.b.compareAndSet($$0, $$1, $$2) && $$2 == null) {
            this.g--;
         }

         gat.this.e.a($$1);
         return $$1;
      }

      boolean b(int $$0, int $$1) {
         return Math.abs($$0 - this.e) <= this.c && Math.abs($$1 - this.f) <= this.c;
      }

      @Nullable
      protected dwg a(int $$0) {
         return this.b.get($$0);
      }

      private void a(String $$0) {
         try (FileOutputStream $$1 = new FileOutputStream($$0)) {
            int $$2 = gat.this.d.c;

            for (int $$3 = this.f - $$2; $$3 <= this.f + $$2; $$3++) {
               for (int $$4 = this.e - $$2; $$4 <= this.e + $$2; $$4++) {
                  dwg $$5 = gat.this.d.b.get(gat.this.d.a($$4, $$3));
                  if ($$5 != null) {
                     dcy $$6 = $$5.f();
                     $$1.write(($$6.e + "\t" + $$6.f + "\t" + $$5.B() + "\n").getBytes(StandardCharsets.UTF_8));
                  }
               }
            }
         } catch (IOException var10) {
            gat.a.error("Failed to dump chunks to file {}", $$0, var10);
         }
      }
   }
}
