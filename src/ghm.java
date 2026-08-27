public class ghm implements ghp {
   private static final int a = 600;
   private static final uv b = uv.c("tutorial.open_inventory.title");
   private static final uv c = uv.a("tutorial.open_inventory.description", gho.a("inventory"));
   private final gho d;
   private exo e;
   private int f;

   public ghm(gho $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ghq.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new exo(exo.a.d, b, c, false);
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
      this.d.a(ghq.e);
   }
}
