public class ghh implements ghk {
   private static final int a = 600;
   private static final ur b = ur.c("tutorial.open_inventory.title");
   private static final ur c = ur.a("tutorial.open_inventory.description", ghj.a("inventory"));
   private final ghj d;
   private exj e;
   private int f;

   public ghh(ghj $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ghl.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new exj(exj.a.d, b, c, false);
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
      this.d.a(ghl.e);
   }
}
