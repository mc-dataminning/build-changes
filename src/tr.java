import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class tr {
   final tn a;
   private final List<tk> b = Lists.newArrayList();
   private long c;

   tr(tn $$0) {
      this.a = $$0;
      this.c = $$0.o();
   }

   public tr a(Runnable $$0) {
      this.b.add(tk.a($$0));
      return this;
   }

   public tr a(long $$0, Runnable $$1) {
      this.b.add(tk.a($$0, $$1));
      return this;
   }

   public tr a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public tr b(Runnable $$0) {
      this.b.add(tk.a(() -> this.c($$0)));
      return this;
   }

   public tr a(int $$0, Runnable $$1) {
      this.b.add(tk.a(() -> {
         if (this.a.o() < this.c + (long)$$0) {
            throw new tf("Test timed out before sequence completed");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public tr b(int $$0, Runnable $$1) {
      this.b.add(tk.a(() -> {
         if (this.a.o() < this.c + (long)$$0) {
            this.c($$1);
            throw new tf("Test timed out before sequence completed");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(tk.a(this.a::l));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(tk.a(() -> this.a.a($$0.get())));
   }

   public tr.a b() {
      tr.a $$0 = new tr.a();
      this.b.add(tk.a(() -> $$0.a(this.a.o())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (tf var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (tf var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (tf var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<tk> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         tk $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new tf("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
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
         long $$0 = tr.this.a.o();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new tf("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new tf("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
