public class gjv extends gmv<cim> {
   private static final akt b = new akt("textures/entity/skeleton/bogged.png");
   private static final akt g = new akt("textures/entity/skeleton/bogged_overlay.png");

   public gjv(gkq.a $$0) {
      super($$0, fyr.p, fyr.q, new fux($$0.a(fyr.o)));
      this.a(new gpm<>(this, $$0.f(), fyr.r, g));
   }

   public akt a(cim $$0) {
      return $$0.dV() ? gmv.a : b;
   }
}
