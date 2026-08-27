public class gjb implements gje {
   private static final int a = 600;
   private static final vb b = vb.c("tutorial.open_inventory.title");
   private static final vb c = vb.a("tutorial.open_inventory.description", gjd.a("inventory"));
   private final gjd d;
   private eyr e;
   private int f;

   public gjb(gjd $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gjf.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new eyr(eyr.a.d, b, c, false);
            this.d.e().ax().a(this.e);
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
      this.d.a(gjf.e);
   }
}
