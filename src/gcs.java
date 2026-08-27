import javax.annotation.Nullable;

public class gcs {
   private static final int a = 100;
   private final aru b = aru.a();
   private final eqm c;
   @Nullable
   private gbt d;
   private int e = 100;

   public gcs(eqm $$0) {
      this.c = $$0;
   }

   public void a() {
      aot $$0 = this.c.aj();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ai().b(this.d);
            this.e = arp.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ai().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, arp.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(aot $$0) {
      this.d = gbo.a($$0.a().a());
      if (this.d.b() != gcx.a) {
         this.c.ai().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(aot $$0) {
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

   public boolean c(aot $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
