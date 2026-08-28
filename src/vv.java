import java.util.concurrent.atomic.AtomicInteger;

public class vv {
   private final AtomicInteger a = new AtomicInteger();
   private final bmx b;

   public vv(bmx $$0) {
      this.b = $$0;
   }

   public void a(int $$0) {
      this.a.getAndAdd($$0);
   }

   public void a() {
      this.b.a((long)this.a.getAndSet(0));
   }
}
