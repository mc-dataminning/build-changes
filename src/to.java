import java.util.concurrent.atomic.AtomicInteger;

public class to {
   private final AtomicInteger a = new AtomicInteger();
   private final aty b;

   public to(aty $$0) {
      this.b = $$0;
   }

   public void a(int $$0) {
      this.a.getAndAdd($$0);
   }

   public void a() {
      this.b.a((long)this.a.getAndSet(0));
   }
}
