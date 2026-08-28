public class ham extends hae {
   private final bto n;

   public ham(awd $$0, awf $$1, float $$2, float $$3, bto $$4, long $$5) {
      super($$0, $$1, azl.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dx());
      this.g = (double)((float)this.n.dz());
      this.h = (double)((float)this.n.dD());
   }

   @Override
   public boolean s() {
      return !this.n.ba();
   }

   @Override
   public void q() {
      if (this.n.dN()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dx());
         this.g = (double)((float)this.n.dz());
         this.h = (double)((float)this.n.dD());
      }
   }
}
