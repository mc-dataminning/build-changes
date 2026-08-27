import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class rs {
   final ro a;
   private final List<rl> b = Lists.newArrayList();
   private long c;

   rs(ro $$0) {
      this.a = $$0;
      this.c = $$0.q();
   }

   public rs a(Runnable $$0) {
      this.b.add(rl.a($$0));
      return this;
   }

   public rs a(long $$0, Runnable $$1) {
      this.b.add(rl.a($$0, $$1));
      return this;
   }

   public rs a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public rs b(Runnable $$0) {
      this.b.add(rl.a(() -> this.c($$0)));
      return this;
   }

   public rs a(int $$0, Runnable $$1) {
      this.b.add(rl.a(() -> {
         if (this.a.q() < this.c + (long)$$0) {
            throw new rh("Waiting");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public rs b(int $$0, Runnable $$1) {
      this.b.add(rl.a(() -> {
         if (this.a.q() < this.c + (long)$$0) {
            this.c($$1);
            throw new rh("Waiting");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(rl.a(this.a::n));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(rl.a(() -> this.a.a($$0.get())));
   }

   public rs.a b() {
      rs.a $$0 = new rs.a();
      this.b.add(rl.a(() -> $$0.a(this.a.q())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (rh var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (rh var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (rh var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<rl> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         rl $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new rh("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
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
         long $$0 = rs.this.a.q();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new rh("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new rh("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
