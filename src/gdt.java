public class gdt implements gdw {
   private static final int a = 600;
   private static final te b = te.c("tutorial.open_inventory.title");
   private static final te c = te.a("tutorial.open_inventory.description", gdv.a("inventory"));
   private final gdv d;
   private eul e;
   private int f;

   public gdt(gdv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gdx.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new eul(eul.a.d, b, c, false);
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
      this.d.a(gdx.e);
   }
}
