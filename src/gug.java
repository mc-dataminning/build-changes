public class gug extends gtv {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cly p;
   private final cnw q;
   private final boolean r;

   public gug(cly $$0, cnw $$1, boolean $$2) {
      super($$2 ? avo.pk : avo.pl, avq.g, gum.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gum.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.ba();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dP() || !this.p.bW() || this.p.dh() != this.q) {
         this.n();
      } else if (this.r != this.p.bn()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dx().h();
         if ($$0 >= 0.01F) {
            this.d = aym.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
