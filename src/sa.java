import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class sa {
   final rw a;
   private final List<rt> b = Lists.newArrayList();
   private long c;

   sa(rw $$0) {
      this.a = $$0;
      this.c = $$0.o();
   }

   public sa a(Runnable $$0) {
      this.b.add(rt.a($$0));
      return this;
   }

   public sa a(long $$0, Runnable $$1) {
      this.b.add(rt.a($$0, $$1));
      return this;
   }

   public sa a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public sa b(Runnable $$0) {
      this.b.add(rt.a(() -> this.c($$0)));
      return this;
   }

   public sa a(int $$0, Runnable $$1) {
      this.b.add(rt.a(() -> {
         if (this.a.o() < this.c + (long)$$0) {
            throw new ro("Test timed out before sequence completed");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public sa b(int $$0, Runnable $$1) {
      this.b.add(rt.a(() -> {
         if (this.a.o() < this.c + (long)$$0) {
            this.c($$1);
            throw new ro("Test timed out before sequence completed");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(rt.a(this.a::l));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(rt.a(() -> this.a.a($$0.get())));
   }

   public sa.a b() {
      sa.a $$0 = new sa.a();
      this.b.add(rt.a(() -> $$0.a(this.a.o())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (ro var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (ro var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (ro var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<rt> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         rt $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new ro("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
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
         long $$0 = sa.this.a.o();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new ro("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new ro("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
