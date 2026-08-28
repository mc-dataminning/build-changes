import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class tm {
   final ti a;
   private final List<tf> b = Lists.newArrayList();
   private long c;

   tm(ti $$0) {
      this.a = $$0;
      this.c = $$0.p();
   }

   public tm a(Runnable $$0) {
      this.b.add(tf.a($$0));
      return this;
   }

   public tm a(long $$0, Runnable $$1) {
      this.b.add(tf.a($$0, $$1));
      return this;
   }

   public tm a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public tm b(Runnable $$0) {
      this.b.add(tf.a(() -> this.c($$0)));
      return this;
   }

   public tm a(int $$0, Runnable $$1) {
      this.b.add(tf.a(() -> {
         if (this.a.p() < this.c + (long)$$0) {
            throw new ta("Test timed out before sequence completed");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public tm b(int $$0, Runnable $$1) {
      this.b.add(tf.a(() -> {
         if (this.a.p() < this.c + (long)$$0) {
            this.c($$1);
            throw new ta("Test timed out before sequence completed");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(tf.a(this.a::m));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(tf.a(() -> this.a.a($$0.get())));
   }

   public tm.a b() {
      tm.a $$0 = new tm.a();
      this.b.add(tf.a(() -> $$0.a(this.a.p())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (ta var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (ta var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (ta var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<tf> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         tf $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new ta("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
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
         long $$0 = tm.this.a.p();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new ta("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new ta("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
