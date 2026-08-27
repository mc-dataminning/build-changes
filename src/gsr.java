public class gsr implements gsu {
   private static final int a = 600;
   private static final wu b = wu.c("tutorial.open_inventory.title");
   private static final wu c = wu.a("tutorial.open_inventory.description", gst.a("inventory"));
   private final gst d;
   private fhp e;
   private int f;

   public gsr(gst $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gsv.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fhp(fhp.a.d, b, c, false);
            this.d.e().aA().a(this.e);
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
      this.d.a(gsv.e);
   }
}
