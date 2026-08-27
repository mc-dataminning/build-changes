public class gkf implements gki {
   private static final int a = 600;
   private static final vf b = vf.c("tutorial.open_inventory.title");
   private static final vf c = vf.a("tutorial.open_inventory.description", gkh.a("inventory"));
   private final gkh d;
   private ezq e;
   private int f;

   public gkf(gkh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkj.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new ezq(ezq.a.d, b, c, false);
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
      this.d.a(gkj.e);
   }
}
