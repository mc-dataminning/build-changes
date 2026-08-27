import javax.annotation.Nullable;

public class gsi {
   private static final int a = 100;
   private final ayk b = ayk.a();
   private final fdz c;
   @Nullable
   private grj d;
   private int e = 100;

   public gsi(fdz $$0) {
      this.c = $$0;
   }

   public void a() {
      ave $$0 = this.c.al();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ak().b(this.d);
            this.e = ayd.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ak().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, ayd.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(ave $$0) {
      this.d = gre.a($$0.a().a());
      if (this.d.b() != gsn.a) {
         this.c.ak().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(ave $$0) {
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

   public boolean c(ave $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
