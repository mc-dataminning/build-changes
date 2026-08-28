public class gaw extends fyb {
   private static final int a = 600;
   private final vr b;
   private fsj c;
   private int d;
   private final fwb s = fwb.d();

   public gaw(wy $$0, vr $$1) {
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
      this.s.a(new ftq(this.l, this.p));
      this.c = this.s.a(fsj.a(wx.p, $$0 -> this.b.a(fxa.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fsh var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fvv.a(this.s, this.J());
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
