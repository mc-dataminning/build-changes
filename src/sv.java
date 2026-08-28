import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class sv {
   final sp a;
   private final List<sn> b = Lists.newArrayList();
   private int c;

   sv(sp $$0) {
      this.a = $$0;
      this.c = $$0.p();
   }

   public sv a(Runnable $$0) {
      this.b.add(sn.a($$0));
      return this;
   }

   public sv a(long $$0, Runnable $$1) {
      this.b.add(sn.a($$0, $$1));
      return this;
   }

   public sv a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public sv b(Runnable $$0) {
      this.b.add(sn.a(() -> this.c($$0)));
      return this;
   }

   public sv a(int $$0, Runnable $$1) {
      this.b.add(sn.a(() -> {
         if (this.a.p() < this.c + $$0) {
            throw new sh(ww.c("test.error.sequence.not_completed"), this.a.p());
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public sv b(int $$0, Runnable $$1) {
      this.b.add(sn.a(() -> {
         if (this.a.p() < this.c + $$0) {
            this.c($$1);
            throw new sh(ww.c("test.error.sequence.not_completed"), this.a.p());
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(sn.a(this.a::m));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(sn.a(() -> this.a.a($$0.get())));
   }

   public sv.a b() {
      sv.a $$0 = new sv.a();
      this.b.add(sn.a(() -> $$0.a(this.a.p())));
      return $$0;
   }

   public void b(int $$0) {
      try {
         this.d($$0);
      } catch (sh var3) {
      }
   }

   public void c(int $$0) {
      try {
         this.d($$0);
      } catch (sh var3) {
         this.a.a(var3);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (sh var3) {
         this.a.a(var3);
      }
   }

   private void d(int $$0) {
      Iterator<sn> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         sn $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         int $$3 = $$0 - this.c;
         int $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != (long)$$3) {
            this.a.a(new sh(ww.a("test.error.sequence.invalid_tick", (long)$$4 + $$2.a), $$0));
            break;
         }
      }
   }

   public class a {
      private static final int b = -1;
      private int c = -1;

      void a(int $$0) {
         if (this.c != -1) {
            throw new IllegalStateException("Condition already triggered at " + this.c);
         } else {
            this.c = $$0;
         }
      }

      public void a() {
         int $$0 = sv.this.a.p();
         if (this.c != $$0) {
            if (this.c == -1) {
               throw new sh(ww.c("test.error.sequence.condition_not_triggered"), $$0);
            } else {
               throw new sh(ww.a("test.error.sequence.condition_already_triggered", this.c), $$0);
            }
         }
      }
   }
}
