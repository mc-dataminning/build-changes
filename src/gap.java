public class gap extends fxu {
   private static final int a = 600;
   private final vr b;
   private fsc c;
   private int d;
   private final fvu s = fvu.d();

   public gap(wy $$0, vr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.s.c().b().a(10);
      this.s.a(new ftj(this.l, this.p));
      this.c = this.s.a(fsc.a(wx.p, $$0 -> this.b.a(fwt.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fsa var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fvo.a(this.s, this.J());
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
