public class ger implements geu {
   private static final int a = 600;
   private static final tm b = tm.c("tutorial.open_inventory.title");
   private static final tm c = tm.a("tutorial.open_inventory.description", get.a("inventory"));
   private final get d;
   private euz e;
   private int f;

   public ger(get $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gev.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new euz(euz.a.d, b, c, false);
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
      this.d.a(gev.e);
   }
}
