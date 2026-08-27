public class ggs extends ggf {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final bzu p;

   public ggs(bzu $$0) {
      super(arc.xx, ard.g, ggw.t());
      this.p = $$0;
      this.k = ggw.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aU();
   }

   @Override
   public void q() {
      if (!this.p.dH() && this.p.q() == null && this.p.gk()) {
         this.f = (double)((float)this.p.dr());
         this.g = (double)((float)this.p.dt());
         this.h = (double)((float)this.p.dx());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
