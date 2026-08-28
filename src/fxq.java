public class fxq extends fyn {
   private fto a;
   private final Runnable b;
   private final Runnable c;

   public fxq(Runnable $$0, Runnable $$1) {
      super(wy.c("datapackFailure.title"));
      this.a = fto.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.a = fto.a(this.p, this.n(), this.n - 50);
      this.c(fsv.a(wy.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.n / 2 - 155, this.o / 6 + 96, 150, 20).a());
      this.c(fsv.a(wx.k, $$0 -> this.b.run()).a(this.n / 2 - 155 + 160, this.o / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
