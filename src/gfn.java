public class gfn implements gfq {
   private static final int a = 600;
   private static final ui b = ui.c("tutorial.open_inventory.title");
   private static final ui c = ui.a("tutorial.open_inventory.description", gfp.a("inventory"));
   private final gfp d;
   private evt e;
   private int f;

   public gfn(gfp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gfr.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new evt(evt.a.d, b, c, false);
            this.d.e().ay().a(this.e);
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
      this.d.a(gfr.e);
   }
}
