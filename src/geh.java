public class geh implements gek {
   private static final int a = 600;
   private static final tf b = tf.c("tutorial.open_inventory.title");
   private static final tf c = tf.a("tutorial.open_inventory.description", gej.a("inventory"));
   private final gej d;
   private eup e;
   private int f;

   public geh(gej $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gel.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new eup(eup.a.d, b, c, false);
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
      this.d.a(gel.e);
   }
}
