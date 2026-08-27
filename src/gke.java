public class gke implements gkh {
   private static final int a = 600;
   private static final vf b = vf.c("tutorial.open_inventory.title");
   private static final vf c = vf.a("tutorial.open_inventory.description", gkg.a("inventory"));
   private final gkg d;
   private ezp e;
   private int f;

   public gke(gkg $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gki.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new ezp(ezp.a.d, b, c, false);
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
      this.d.a(gki.e);
   }
}
