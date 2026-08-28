import java.util.concurrent.locks.LockSupport;

public class hjs extends bqy<Runnable> {
   private Thread a = this.b();
   private volatile boolean b;

   public hjs() {
      super("Sound executor");
   }

   private Thread b() {
      Thread $$0 = new Thread(this::c);
      $$0.setDaemon(true);
      $$0.setName("Sound engine");
      $$0.start();
      return $$0;
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return !this.b;
   }

   @Override
   protected Thread ay() {
      return this.a;
   }

   private void c() {
      while (!this.b) {
         this.b(() -> this.b);
      }
   }

   @Override
   protected void A() {
      LockSupport.park("waiting for tasks");
   }

   public void a() {
      this.b = true;
      this.a.interrupt();

      try {
         this.a.join();
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      }

      this.bz();
      this.b = false;
      this.a = this.b();
   }
}
