import java.util.concurrent.locks.LockSupport;

public class gcq extends bfe<Runnable> {
   private Thread a = this.b();
   private volatile boolean b;

   public gcq() {
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
   protected Thread au() {
      return this.a;
   }

   private void c() {
      while (!this.b) {
         this.c(() -> this.b);
      }
   }

   @Override
   protected void br() {
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

      this.bp();
      this.b = false;
      this.a = this.b();
   }
}
