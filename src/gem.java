public class gem implements gep {
   private static final int a = 600;
   private static final ti b = ti.c("tutorial.open_inventory.title");
   private static final ti c = ti.a("tutorial.open_inventory.description", geo.a("inventory"));
   private final geo d;
   private euu e;
   private int f;

   public gem(geo $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(geq.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new euu(euu.a.d, b, c, false);
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
      this.d.a(geq.e);
   }
}
