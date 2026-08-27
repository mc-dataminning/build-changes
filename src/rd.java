import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class rd {
   final qz a;
   private final List<qw> b = Lists.newArrayList();
   private long c;

   rd(qz $$0) {
      this.a = $$0;
      this.c = $$0.p();
   }

   public rd a(Runnable $$0) {
      this.b.add(qw.a($$0));
      return this;
   }

   public rd a(long $$0, Runnable $$1) {
      this.b.add(qw.a($$0, $$1));
      return this;
   }

   public rd a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public rd b(Runnable $$0) {
      this.b.add(qw.a(() -> this.c($$0)));
      return this;
   }

   public rd a(int $$0, Runnable $$1) {
      this.b.add(qw.a(() -> {
         if (this.a.p() < this.c + (long)$$0) {
            throw new qs("Waiting");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public rd b(int $$0, Runnable $$1) {
      this.b.add(qw.a(() -> {
         if (this.a.p() < this.c + (long)$$0) {
            this.c($$1);
            throw new qs("Waiting");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(qw.a(this.a::m));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(qw.a(() -> this.a.a($$0.get())));
   }

   public rd.a b() {
      rd.a $$0 = new rd.a();
      this.b.add(qw.a(() -> $$0.a(this.a.p())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (qs var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (qs var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (qs var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<qw> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         qw $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new qs("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
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
         long $$0 = rd.this.a.p();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new qs("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new qs("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
