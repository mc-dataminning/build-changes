public class heu extends hem {
   private final bvb n;

   public heu(awu $$0, aww $$1, float $$2, float $$3, bvb $$4, long $$5) {
      super($$0, $$1, bac.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dB());
      this.g = (double)((float)this.n.dD());
      this.h = (double)((float)this.n.dH());
   }

   @Override
   public boolean s() {
      return !this.n.bb();
   }

   @Override
   public void q() {
      if (this.n.dR()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dB());
         this.g = (double)((float)this.n.dD());
         this.h = (double)((float)this.n.dH());
      }
   }
}
