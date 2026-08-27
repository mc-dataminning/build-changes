public class gdy implements geb {
   private static final int a = 600;
   private static final tf b = tf.c("tutorial.open_inventory.title");
   private static final tf c = tf.a("tutorial.open_inventory.description", gea.a("inventory"));
   private final gea d;
   private eup e;
   private int f;

   public gdy(gea $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gec.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new eup(eup.a.d, b, c, false);
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
      this.d.a(gec.e);
   }
}
