public class gvk implements gvn {
   private static final int a = 600;
   private static final wu b = wu.c("tutorial.open_inventory.title");
   private static final wu c = wu.a("tutorial.open_inventory.description", gvm.a("inventory"));
   private final gvm d;
   private fkf e;
   private int f;

   public gvk(gvm $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvo.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fkf(fkf.a.d, b, c, false);
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
      this.d.a(gvo.e);
   }
}
