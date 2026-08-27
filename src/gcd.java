public class gcd extends gbq {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final bwy p;

   public gcd(bwy $$0) {
      super(aoz.wH, apa.g, gch.t());
      this.p = $$0;
      this.k = gch.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aS();
   }

   @Override
   public void q() {
      if (!this.p.dF() && this.p.j() == null && this.p.gg()) {
         this.f = (double)((float)this.p.dp());
         this.g = (double)((float)this.p.dr());
         this.h = (double)((float)this.p.dv());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
