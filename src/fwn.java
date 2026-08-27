public class fwn extends fxi<cbi, fih<cbi>> {
   private static final agm a = new agm("textures/entity/zombie/zombie.png");
   private final float i;

   public fwn(fwc.a $$0, float $$1) {
      super($$0, new fhz($$0.a(fks.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gad<>(this, $$0.d()));
      this.a(new gaa<>(this, new fhz($$0.a(fks.ac)), new fhz($$0.a(fks.ad)), $$0.g()));
   }

   protected void a(cbi $$0, eob $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public agm a(cbi $$0) {
      return a;
   }
}
