import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class tk {
   final tg a;
   private final List<td> b = Lists.newArrayList();
   private long c;

   tk(tg $$0) {
      this.a = $$0;
      this.c = $$0.o();
   }

   public tk a(Runnable $$0) {
      this.b.add(td.a($$0));
      return this;
   }

   public tk a(long $$0, Runnable $$1) {
      this.b.add(td.a($$0, $$1));
      return this;
   }

   public tk a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public tk b(Runnable $$0) {
      this.b.add(td.a(() -> this.c($$0)));
      return this;
   }

   public tk a(int $$0, Runnable $$1) {
      this.b.add(td.a(() -> {
         if (this.a.o() < this.c + (long)$$0) {
            throw new sy("Test timed out before sequence completed");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public tk b(int $$0, Runnable $$1) {
      this.b.add(td.a(() -> {
         if (this.a.o() < this.c + (long)$$0) {
            this.c($$1);
            throw new sy("Test timed out before sequence completed");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(td.a(this.a::l));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(td.a(() -> this.a.a($$0.get())));
   }

   public tk.a b() {
      tk.a $$0 = new tk.a();
      this.b.add(td.a(() -> $$0.a(this.a.o())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (sy var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (sy var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (sy var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<td> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         td $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new sy("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
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
         long $$0 = tk.this.a.o();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new sy("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new sy("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
