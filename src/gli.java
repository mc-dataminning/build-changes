public class gli extends gkv {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cdb p;

   public gli(cdb $$0) {
      super(atp.xN, atq.g, glm.t());
      this.p = $$0;
      this.k = glm.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aU();
   }

   @Override
   public void q() {
      if (!this.p.dE() && this.p.q() == null && this.p.gr()) {
         this.f = (double)((float)this.p.do());
         this.g = (double)((float)this.p.dq());
         this.h = (double)((float)this.p.du());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
