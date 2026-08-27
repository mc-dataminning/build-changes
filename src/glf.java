public class glf extends gkv {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cjt s;
   private float t = 0.0F;

   public glf(cjt $$0) {
      super(atp.om, atq.g, glm.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.do());
      this.g = (double)((float)$$0.dq());
      this.h = (double)((float)$$0.du());
   }

   @Override
   public boolean s() {
      return !this.s.aU();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dE()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.do());
         this.g = (double)((float)this.s.dq());
         this.h = (double)((float)this.s.du());
         float $$0 = (float)this.s.dm().h();
         if ($$0 >= 0.01F && this.s.dJ().s().i()) {
            this.t = awm.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = awm.i(awm.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
