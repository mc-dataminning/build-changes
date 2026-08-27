public class gen implements geq {
   private static final int a = 600;
   private static final tl b = tl.c("tutorial.open_inventory.title");
   private static final tl c = tl.a("tutorial.open_inventory.description", gep.a("inventory"));
   private final gep d;
   private euu e;
   private int f;

   public gen(gep $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ger.f);
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
      this.d.a(ger.e);
   }
}
