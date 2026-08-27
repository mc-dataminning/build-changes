public class gml implements gmo {
   private static final int a = 600;
   private static final vq b = vq.c("tutorial.open_inventory.title");
   private static final vq c = vq.a("tutorial.open_inventory.description", gmn.a("inventory"));
   private final gmn d;
   private fbs e;
   private int f;

   public gml(gmn $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gmp.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fbs(fbs.a.d, b, c, false);
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
      this.d.a(gmp.e);
   }
}
