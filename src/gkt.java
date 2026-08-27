public class gkt implements gkw {
   private static final int a = 600;
   private static final vg b = vg.c("tutorial.open_inventory.title");
   private static final vg c = vg.a("tutorial.open_inventory.description", gkv.a("inventory"));
   private final gkv d;
   private fab e;
   private int f;

   public gkt(gkv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkx.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fab(fab.a.d, b, c, false);
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
      this.d.a(gkx.e);
   }
}
