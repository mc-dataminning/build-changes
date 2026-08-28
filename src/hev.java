import javax.annotation.Nullable;

public class hev implements hey {
   private static final int a = 600;
   private static final xl b = xl.c("tutorial.open_inventory.title");
   private static final xl c = xl.a("tutorial.open_inventory.description", hex.a("inventory"));
   private final hex d;
   @Nullable
   private foi e;
   private int f;

   public hev(hex $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hez.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new foi(foi.a.d, b, c, false);
            this.d.e().aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.d();
         this.e = null;
      }
   }

   @Override
   public void c() {
      this.d.a(hez.e);
   }
}
