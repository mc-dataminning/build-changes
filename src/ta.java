import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class ta {
   final sw a;
   private final List<st> b = Lists.newArrayList();
   private long c;

   ta(sw $$0) {
      this.a = $$0;
      this.c = $$0.o();
   }

   public ta a(Runnable $$0) {
      this.b.add(st.a($$0));
      return this;
   }

   public ta a(long $$0, Runnable $$1) {
      this.b.add(st.a($$0, $$1));
      return this;
   }

   public ta a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public ta b(Runnable $$0) {
      this.b.add(st.a(() -> this.c($$0)));
      return this;
   }

   public ta a(int $$0, Runnable $$1) {
      this.b.add(st.a(() -> {
         if (this.a.o() < this.c + (long)$$0) {
            throw new so("Test timed out before sequence completed");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public ta b(int $$0, Runnable $$1) {
      this.b.add(st.a(() -> {
         if (this.a.o() < this.c + (long)$$0) {
            this.c($$1);
            throw new so("Test timed out before sequence completed");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(st.a(this.a::l));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(st.a(() -> this.a.a($$0.get())));
   }

   public ta.a b() {
      ta.a $$0 = new ta.a();
      this.b.add(st.a(() -> $$0.a(this.a.o())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (so var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (so var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (so var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<st> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         st $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new so("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
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
         long $$0 = ta.this.a.o();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new so("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new so("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
