public class gby extends gbl {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final bwv p;

   public gby(bwv $$0) {
      super(aow.wH, aox.g, gcc.t());
      this.p = $$0;
      this.k = gcc.a.b;
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
