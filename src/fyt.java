public class fyt extends fzq {
   private fur a;
   private final Runnable b;
   private final Runnable c;

   public fyt(Runnable $$0, Runnable $$1) {
      super(xg.c("datapackFailure.title"));
      this.a = fur.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.a = fur.a(this.p, this.n(), this.n - 50);
      this.c(fty.a(xg.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.n / 2 - 155, this.o / 6 + 96, 150, 20).a());
      this.c(fty.a(xf.k, $$0 -> this.b.run()).a(this.n / 2 - 155 + 160, this.o / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aI_() {
      return false;
   }
}
