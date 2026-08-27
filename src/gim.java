import javax.annotation.Nullable;

public class gim {
   private static final int a = 100;
   private final aup b = aup.a();
   private final eva c;
   @Nullable
   private ghn d;
   private int e = 100;

   public gim(eva $$0) {
      this.c = $$0;
   }

   public void a() {
      arj $$0 = this.c.ai();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ah().b(this.d);
            this.e = aui.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ah().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, aui.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(arj $$0) {
      this.d = ghi.a($$0.a().a());
      if (this.d.b() != gir.a) {
         this.c.ah().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(arj $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.ah().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(arj $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
