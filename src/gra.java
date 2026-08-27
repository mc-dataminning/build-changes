import javax.annotation.Nullable;

public class gra {
   private static final int a = 100;
   private final ayd b = ayd.a();
   private final fcu c;
   @Nullable
   private gqb d;
   private int e = 100;

   public gra(fcu $$0) {
      this.c = $$0;
   }

   public void a() {
      auv $$0 = this.c.al();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ak().b(this.d);
            this.e = axw.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ak().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, axw.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(auv $$0) {
      this.d = gpw.a($$0.a().a());
      if (this.d.b() != grf.a) {
         this.c.ak().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(auv $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.ak().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(auv $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
