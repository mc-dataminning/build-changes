public class gwe implements gwh {
   private static final int a = 600;
   private static final wz b = wz.c("tutorial.open_inventory.title");
   private static final wz c = wz.a("tutorial.open_inventory.description", gwg.a("inventory"));
   private final gwg d;
   private fkv e;
   private int f;

   public gwe(gwg $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwi.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fkv(fkv.a.d, b, c, false);
            this.d.e().aw().a(this.e);
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
      this.d.a(gwi.e);
   }
}
