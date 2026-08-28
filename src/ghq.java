import javax.annotation.Nullable;

public final class ghq implements AutoCloseable {
   private final fib a;
   private final fbq b;

   public ghq(fib $$0) {
      this.a = $$0;
      this.b = new fbq(fbn::new);
   }

   public fbs a(fbf $$0, @Nullable String $$1, String $$2) {
      return new fbs(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
