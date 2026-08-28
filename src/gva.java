import javax.annotation.Nullable;

public class gva {
   private static final int a = 100;
   private final ayw b = ayw.a();
   private final fgo c;
   @Nullable
   private gua d;
   private int e = 100;

   public gva(fgo $$0) {
      this.c = $$0;
   }

   public void a() {
      avm $$0 = this.c.ak();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.aj().b(this.d);
            this.e = ayo.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.aj().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, ayo.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(avm $$0) {
      this.d = gtv.a($$0.a().a());
      if (this.d.b() != gvf.b) {
         this.c.aj().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(avm $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.aj().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(avm $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
