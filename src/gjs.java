public class gjs implements gjv {
   private static final int a = 600;
   private static final vd b = vd.c("tutorial.open_inventory.title");
   private static final vd c = vd.a("tutorial.open_inventory.description", gju.a("inventory"));
   private final gju d;
   private ezi e;
   private int f;

   public gjs(gju $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gjw.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new ezi(ezi.a.d, b, c, false);
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
      this.d.a(gjw.e);
   }
}
