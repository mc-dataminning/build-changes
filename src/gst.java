public class gst extends gsl {
   private final bsg n;

   public gst(avg $$0, avi $$1, float $$2, float $$3, bsg $$4, long $$5) {
      super($$0, $$1, ayo.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dv());
      this.g = (double)((float)this.n.dx());
      this.h = (double)((float)this.n.dB());
   }

   @Override
   public boolean s() {
      return !this.n.aX();
   }

   @Override
   public void q() {
      if (this.n.dL()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dv());
         this.g = (double)((float)this.n.dx());
         this.h = (double)((float)this.n.dB());
      }
   }
}
