public class gur implements guu {
   private static final int a = 600;
   private static final xl b = xl.c("tutorial.open_inventory.title");
   private static final xl c = xl.a("tutorial.open_inventory.description", gut.a("inventory"));
   private final gut d;
   private fjk e;
   private int f;

   public gur(gut $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guv.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fjk(fjk.a.d, b, c, false);
            this.d.e().ax().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void c() {
      this.d.a(guv.e);
   }
}
