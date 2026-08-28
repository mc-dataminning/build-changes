import java.time.Duration;
import java.time.Instant;
import javax.annotation.Nullable;

public abstract class hdt {
   private static final int a = 60000;
   private static final int b = 10;
   private int c;
   private boolean d = false;
   @Nullable
   private Instant e;

   public void a() {
      this.d = true;
      this.e = Instant.now();
      this.c = 0;
   }

   public void a(hdn $$0) {
      if (this.b()) {
         this.f();
         this.c++;
         this.e = Instant.now();
      }

      if (this.c()) {
         this.b($$0);
         this.c = 0;
      }
   }

   public boolean b() {
      return this.d && this.e != null && Duration.between(this.e, Instant.now()).toMillis() > 60000L;
   }

   public boolean c() {
      return this.c >= 10;
   }

   public void d() {
      this.d = false;
   }

   protected int e() {
      return this.c;
   }

   public abstract void f();

   public abstract void b(hdn var1);
}
