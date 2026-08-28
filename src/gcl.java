public class gcl extends fzq {
   private static final int a = 600;
   private final vv b;
   private fty c;
   private int d;
   private final fxq s = fxq.d();

   public gcl(xg $$0, vv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aO_() {
      this.s.c().b().a(10);
      this.s.a(new fvf(this.l, this.p));
      this.c = this.s.a(fty.a(xf.p, $$0 -> this.b.a(fyp.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fxk.a(this.s, this.J());
   }

   @Override
   public void e() {
      super.e();
      this.d++;
      if (this.d == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
