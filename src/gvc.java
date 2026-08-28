public class gvc implements gvf {
   private static final int a = 600;
   private static final wu b = wu.c("tutorial.open_inventory.title");
   private static final wu c = wu.a("tutorial.open_inventory.description", gve.a("inventory"));
   private final gve d;
   private fjx e;
   private int f;

   public gvc(gve $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvg.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fjx(fjx.a.d, b, c, false);
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
      this.d.a(gvg.e);
   }
}
