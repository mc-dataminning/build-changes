public class gou implements gox {
   private static final int a = 600;
   private static final vu b = vu.c("tutorial.open_inventory.title");
   private static final vu c = vu.a("tutorial.open_inventory.description", gow.a("inventory"));
   private final gow d;
   private fdt e;
   private int f;

   public gou(gow $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(goy.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fdt(fdt.a.d, b, c, false);
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
      this.d.a(goy.e);
   }
}
