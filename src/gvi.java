public class gvi implements gvl {
   private static final int a = 600;
   private static final wu b = wu.c("tutorial.open_inventory.title");
   private static final wu c = wu.a("tutorial.open_inventory.description", gvk.a("inventory"));
   private final gvk d;
   private fkd e;
   private int f;

   public gvi(gvk $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvm.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fkd(fkd.a.d, b, c, false);
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
      this.d.a(gvm.e);
   }
}
