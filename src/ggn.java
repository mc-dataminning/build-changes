public class ggn extends ggf {
   private final blf n;

   public ggn(arb $$0, ard $$1, float $$2, float $$3, blf $$4, long $$5) {
      super($$0, $$1, auf.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dr());
      this.g = (double)((float)this.n.dt());
      this.h = (double)((float)this.n.dx());
   }

   @Override
   public boolean s() {
      return !this.n.aU();
   }

   @Override
   public void q() {
      if (this.n.dH()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dr());
         this.g = (double)((float)this.n.dt());
         this.h = (double)((float)this.n.dx());
      }
   }
}
