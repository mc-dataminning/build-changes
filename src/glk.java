import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class glk extends edr {
   static final Logger a = LogUtils.getLogger();
   private final edx b;
   private final exp c;
   volatile glk.a d;
   final glo e;

   public glk(glo $$0, int $$1) {
      this.e = $$0;
      this.b = new edt($$0, new djo(0, 0), $$0.J_().f(mi.aG).b(dlt.b));
      this.c = new exp(this, true, $$0.F_().g());
      this.d = new glk.a(b($$1));
   }

   @Override
   public exp q() {
      return this.c;
   }

   private static boolean a(@Nullable edx $$0, int $$1, int $$2) {
      if ($$0 == null) {
         return false;
      } else {
         djo $$3 = $$0.f();
         return $$3.h == $$1 && $$3.i == $$2;
      }
   }

   public void a(djo $$0) {
      if (this.d.b($$0.h, $$0.i)) {
         int $$1 = this.d.a($$0.h, $$0.i);
         edx $$2 = this.d.a($$1);
         if (a($$2, $$0.h, $$0.i)) {
            this.d.b($$1, $$2);
         }
      }
   }

   @Nullable
   public edx b(int $$0, int $$1, eeo $$2, boolean $$3) {
      if (this.d.b($$0, $$1)) {
         edx $$4 = this.d.a(this.d.a($$0, $$1));
         if (a($$4, $$0, $$1)) {
            return $$4;
         }
      }

      return $$3 ? this.b : null;
   }

   @Override
   public djn r() {
      return this.e;
   }

   public void a(int $$0, int $$1, vy $$2) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
      } else {
         int $$3 = this.d.a($$0, $$1);
         edx $$4 = this.d.b.get($$3);
         if (!a($$4, $$0, $$1)) {
            a.warn("Ignoring chunk since it's not present: {}, {}", $$0, $$1);
         } else {
            $$4.a($$2);
         }
      }
   }

   @Nullable
   public edx a(int $$0, int $$1, vy $$2, Map<ehp.a, long[]> $$3, Consumer<adq.b> $$4) {
      if (!this.d.b($$0, $$1)) {
         a.warn("Ignoring chunk since it's not in the view range: {}, {}", $$0, $$1);
         return null;
      } else {
         int $$5 = this.d.a($$0, $$1);
         edx $$6 = this.d.b.get($$5);
         djo $$7 = new djo($$0, $$1);
         if (!a($$6, $$0, $$1)) {
            $$6 = new edx(this.e, $$7);
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
         glk.a $$3 = new glk.a($$2);
         $$3.f = this.d.f;
         $$3.g = this.d.g;

         for (int $$4 = 0; $$4 < this.d.b.length(); $$4++) {
            edx $$5 = this.d.b.get($$4);
            if ($$5 != null) {
               djo $$6 = $$5.f();
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
   public void a(dks $$0, jz $$1) {
      fqq.Q().f.b($$1.a(), $$1.b(), $$1.c());
   }

   public LongOpenHashSet a() {
      return this.d.c;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.d.a($$0, $$1, $$2, $$3);
   }

   final class a {
      final AtomicReferenceArray<edx> b;
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

      void a(int $$0, @Nullable edx $$1) {
         edx $$2 = this.b.getAndSet($$0, $$1);
         if ($$2 != null) {
            this.h--;
            this.a($$2);
            glk.this.e.a($$2);
         }

         if ($$1 != null) {
            this.h++;
            this.b($$1);
         }
      }

      void b(int $$0, edx $$1) {
         if (this.b.compareAndSet($$0, $$1, null)) {
            this.h--;
            this.a($$1);
         }

         glk.this.e.a($$1);
      }

      public void a(int $$0, int $$1, int $$2, boolean $$3) {
         if (this.b($$0, $$2)) {
            long $$4 = jz.b($$0, $$1, $$2);
            if ($$3) {
               this.c.add($$4);
            } else if (this.c.remove($$4)) {
               glk.this.e.b($$4);
            }
         }
      }

      private void a(edx $$0) {
         edy[] $$1 = $$0.d();

         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            djo $$3 = $$0.f();
            this.c.remove(jz.b($$3.h, $$0.h($$2), $$3.i));
         }
      }

      private void b(edx $$0) {
         edy[] $$1 = $$0.d();

         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            edy $$3 = $$1[$$2];
            if ($$3.c()) {
               djo $$4 = $$0.f();
               this.c.add(jz.b($$4.h, $$0.h($$2), $$4.i));
            }
         }
      }

      void c(edx $$0) {
         djo $$1 = $$0.f();
         edy[] $$2 = $$0.d();

         for (int $$3 = 0; $$3 < $$2.length; $$3++) {
            edy $$4 = $$2[$$3];
            long $$5 = jz.b($$1.h, $$0.h($$3), $$1.i);
            if ($$4.c()) {
               this.c.add($$5);
            } else if (this.c.remove($$5)) {
               glk.this.e.b($$5);
            }
         }
      }

      boolean b(int $$0, int $$1) {
         return Math.abs($$0 - this.f) <= this.d && Math.abs($$1 - this.g) <= this.d;
      }

      @Nullable
      protected edx a(int $$0) {
         return this.b.get($$0);
      }

      private void a(String $$0) {
         try (FileOutputStream $$1 = new FileOutputStream($$0)) {
            int $$2 = glk.this.d.d;

            for (int $$3 = this.g - $$2; $$3 <= this.g + $$2; $$3++) {
               for (int $$4 = this.f - $$2; $$4 <= this.f + $$2; $$4++) {
                  edx $$5 = glk.this.d.b.get(glk.this.d.a($$4, $$3));
                  if ($$5 != null) {
                     djo $$6 = $$5.f();
                     $$1.write(($$6.h + "\t" + $$6.i + "\t" + $$5.E() + "\n").getBytes(StandardCharsets.UTF_8));
                  }
               }
            }
         } catch (IOException var10) {
            glk.a.error("Failed to dump chunks to file {}", $$0, var10);
         }
      }
   }
}
