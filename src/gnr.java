public class gnr implements gnu {
   private static final int a = 600;
   private static final vs b = vs.c("tutorial.open_inventory.title");
   private static final vs c = vs.a("tutorial.open_inventory.description", gnt.a("inventory"));
   private final gnt d;
   private fcv e;
   private int f;

   public gnr(gnt $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gnv.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fcv(fcv.a.d, b, c, false);
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
      this.d.a(gnv.e);
   }
}
