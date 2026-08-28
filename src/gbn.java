public class gbn extends fys {
   private static final int a = 600;
   private final vr b;
   private fta c;
   private int d;
   private final fws s = fws.d();

   public gbn(wy $$0, vr $$1) {
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
      this.s.a(new fuh(this.l, this.p));
      this.c = this.s.a(fta.a(wx.p, $$0 -> this.b.a(fxr.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fsy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fwm.a(this.s, this.J());
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
