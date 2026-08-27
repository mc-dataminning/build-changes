import javax.annotation.Nullable;

public class gpv {
   private static final int a = 100;
   private final axr b = axr.a();
   private final fbp c;
   @Nullable
   private gow d;
   private int e = 100;

   public gpv(fbp $$0) {
      this.c = $$0;
   }

   public void a() {
      auj $$0 = this.c.al();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ak().b(this.d);
            this.e = axk.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ak().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, axk.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(auj $$0) {
      this.d = gor.a($$0.a().a());
      if (this.d.b() != gqa.a) {
         this.c.ak().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(auj $$0) {
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

   public boolean c(auj $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
