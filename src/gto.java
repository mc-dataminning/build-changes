public class gto implements gtr {
   private static final int a = 600;
   private static final wx b = wx.c("tutorial.open_inventory.title");
   private static final wx c = wx.a("tutorial.open_inventory.description", gtq.a("inventory"));
   private final gtq d;
   private fik e;
   private int f;

   public gto(gtq $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gts.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fik(fik.a.d, b, c, false);
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
      this.d.a(gts.e);
   }
}
