import java.util.concurrent.atomic.AtomicInteger;

public class vq {
   private final AtomicInteger a = new AtomicInteger();
   private final bmo b;

   public vq(bmo $$0) {
      this.b = $$0;
   }

   public void a(int $$0) {
      this.a.getAndAdd($$0);
   }

   public void a() {
      this.b.a((long)this.a.getAndSet(0));
   }
}
