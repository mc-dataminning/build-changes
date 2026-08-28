public class gtr extends gtj {
   private final bsr n;

   public gtr(avo $$0, avq $$1, float $$2, float $$3, bsr $$4, long $$5) {
      super($$0, $$1, ayw.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dt());
      this.g = (double)((float)this.n.dv());
      this.h = (double)((float)this.n.dz());
   }

   @Override
   public boolean s() {
      return !this.n.aX();
   }

   @Override
   public void q() {
      if (this.n.dJ()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dt());
         this.g = (double)((float)this.n.dv());
         this.h = (double)((float)this.n.dz());
      }
   }
}
