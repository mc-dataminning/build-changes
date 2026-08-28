public class gbi extends fyn {
   private static final int a = 600;
   private final vr b;
   private fsv c;
   private int d;
   private final fwn s = fwn.d();

   public gbi(wy $$0, vr $$1) {
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
      this.s.a(new fuc(this.l, this.p));
      this.c = this.s.a(fsv.a(wx.p, $$0 -> this.b.a(fxm.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fst var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fwh.a(this.s, this.J());
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
