import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class qx {
   final qt a;
   private final List<qq> b = Lists.newArrayList();
   private long c;

   qx(qt $$0) {
      this.a = $$0;
      this.c = $$0.p();
   }

   public qx a(Runnable $$0) {
      this.b.add(qq.a($$0));
      return this;
   }

   public qx a(long $$0, Runnable $$1) {
      this.b.add(qq.a($$0, $$1));
      return this;
   }

   public qx a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public qx b(Runnable $$0) {
      this.b.add(qq.a(() -> this.c($$0)));
      return this;
   }

   public qx a(int $$0, Runnable $$1) {
      this.b.add(qq.a(() -> {
         if (this.a.p() < this.c + (long)$$0) {
            throw new qm("Waiting");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public qx b(int $$0, Runnable $$1) {
      this.b.add(qq.a(() -> {
         if (this.a.p() < this.c + (long)$$0) {
            this.c($$1);
            throw new qm("Waiting");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(qq.a(this.a::m));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(qq.a(() -> this.a.a($$0.get())));
   }

   public qx.a b() {
      qx.a $$0 = new qx.a();
      this.b.add(qq.a(() -> $$0.a(this.a.p())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (qm var4) {
      }
   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (qm var4) {
         this.a.a(var4);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (qm var3) {
         this.a.a(var3);
      }
   }

   private void c(long $$0) {
      Iterator<qq> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         qq $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new qm("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
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
         long $$0 = qx.this.a.p();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new qm("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new qm("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
