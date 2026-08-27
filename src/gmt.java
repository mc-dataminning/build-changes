public class gmt implements gmw {
   private static final int a = 600;
   private static final vq b = vq.c("tutorial.open_inventory.title");
   private static final vq c = vq.a("tutorial.open_inventory.description", gmv.a("inventory"));
   private final gmv d;
   private fbz e;
   private int f;

   public gmt(gmv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gmx.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fbz(fbz.a.d, b, c, false);
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
      this.d.a(gmx.e);
   }
}
