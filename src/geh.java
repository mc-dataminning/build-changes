import javax.annotation.Nullable;

public class geh {
   private static final int a = 100;
   private final ate b = ate.a();
   private final ero c;
   @Nullable
   private gdi d;
   private int e = 100;

   public geh(ero $$0) {
      this.c = $$0;
   }

   public void a() {
      aqa $$0 = this.c.aj();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ai().b(this.d);
            this.e = asy.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ai().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, asy.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(aqa $$0) {
      this.d = gdd.a($$0.a().a());
      if (this.d.b() != gem.a) {
         this.c.ai().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(aqa $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.ai().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(aqa $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
