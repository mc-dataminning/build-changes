public class fxb extends fui {
   private static final int a = 600;
   private final vi b;
   private fop c;
   private int d;
   private final fsi s = fsi.d();

   public fxb(wo $$0, vi $$1) {
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
      this.s.a(new fpx(this.l, this.p));
      this.c = this.s.a(fop.a(wn.p, $$0 -> this.b.a(fth.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fon var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fsc.a(this.s, this.J());
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
