public class gss extends gsf {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final chf p;

   public gss(chf $$0) {
      super(avf.yu, avg.g, gsw.t());
      this.p = $$0;
      this.k = gsw.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aW();
   }

   @Override
   public void q() {
      if (!this.p.dK() && this.p.p() == null && this.p.gt()) {
         this.f = (double)((float)this.p.du());
         this.g = (double)((float)this.p.dw());
         this.h = (double)((float)this.p.dA());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
