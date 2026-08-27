public class gor implements gou {
   private static final int a = 600;
   private static final vu b = vu.c("tutorial.open_inventory.title");
   private static final vu c = vu.a("tutorial.open_inventory.description", got.a("inventory"));
   private final got d;
   private fdr e;
   private int f;

   public gor(got $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gov.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fdr(fdr.a.d, b, c, false);
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
      this.d.a(gov.e);
   }
}
