public class gad implements gag {
   private static final int a = 600;
   private static final sw b = sw.c("tutorial.open_inventory.title");
   private static final sw c = sw.a("tutorial.open_inventory.description", gaf.a("inventory"));
   private final gaf d;
   private eri e;
   private int f;

   public gad(gaf $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gah.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new eri(eri.a.d, b, c, false);
            this.d.e().az().a(this.e);
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
      this.d.a(gah.e);
   }
}
