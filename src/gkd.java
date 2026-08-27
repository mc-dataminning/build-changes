public class gkd implements gkg {
   private static final int a = 600;
   private static final vf b = vf.c("tutorial.open_inventory.title");
   private static final vf c = vf.a("tutorial.open_inventory.description", gkf.a("inventory"));
   private final gkf d;
   private ezo e;
   private int f;

   public gkd(gkf $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkh.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new ezo(ezo.a.d, b, c, false);
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
      this.d.a(gkh.e);
   }
}
