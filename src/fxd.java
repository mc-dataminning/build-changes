public class fxd extends fuk {
   private static final int a = 600;
   private final vi b;
   private fos c;
   private int d;
   private final fsk s = fsk.d();

   public fxd(wo $$0, vi $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aR_() {
      this.s.c().b().a(10);
      this.s.a(new fpz(this.l, this.p));
      this.c = this.s.a(fos.a(wn.p, $$0 -> this.b.a(ftj.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fop var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fse.a(this.s, this.J());
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
