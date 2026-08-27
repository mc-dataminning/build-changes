import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class ro {
   final rk a;
   private final List<rh> b = Lists.newArrayList();
   private long c;

   ro(rk $$0) {
      this.a = $$0;
      this.c = $$0.q();
   }

   public ro a(Runnable $$0) {
      this.b.add(rh.a($$0));
      return this;
   }

   public ro a(long $$0, Runnable $$1) {
      this.b.add(rh.a($$0, $$1));
      return this;
   }

   public ro a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public ro b(Runnable $$0) {
      this.b.add(rh.a(() -> this.c($$0)));
      return this;
   }

   public ro a(int $$0, Runnable $$1) {
      this.b.add(rh.a(() -> {
         if (this.a.q() < this.c + (long)$$0) {
            throw new rd("Waiting");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public ro b(int $$0, Runnable $$1) {
      this.b.add(rh.a(() -> {
         if (this.a.q() < this.c + (long)$$0) {
            this.c($$1);
            throw new rd("Waiting");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(rh.a(this.a::n));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(rh.a(() -> this.a.a($$0.get())));
   }

   public ro.a b() {
      ro.a $$0 = new ro.a();
      this.b.add(rh.a(() -> $$0.a(this.a.q())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (rd var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (rd var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (rd var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<rh> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         rh $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new rd("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
            break;
         }
      }
   }

   public class a {
      private static final long b = -1L;
      private long c = -1L;

      void a(long $$0) {
         if (this.c != -1L) {
            throw new IllegalStateException("Condition already triggered at " + this.c);
         } else {
            this.c = $$0;
         }
      }

      public void a() {
         long $$0 = ro.this.a.q();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new rd("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new rd("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
