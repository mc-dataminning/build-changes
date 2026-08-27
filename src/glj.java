import java.util.concurrent.locks.LockSupport;

public class glj extends bkk<Runnable> {
   private Thread a = this.b();
   private volatile boolean b;

   public glj() {
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
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return !this.b;
   }

   @Override
   protected Thread aw() {
      return this.a;
   }

   private void c() {
      while (!this.b) {
         this.c(() -> this.b);
      }
   }

   @Override
   protected void bw() {
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

      this.bu();
      this.b = false;
      this.a = this.b();
   }
}
