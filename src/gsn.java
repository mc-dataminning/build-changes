public class gsn extends gti<cls, haz, gcn<haz>> {
   private static final aku a = aku.b("textures/entity/zombie/zombie.png");

   public gsn(gsc.a $$0, float $$1) {
      super($$0, new gcg($$0.a(gfb.aS)), 0.5F * $$1);
      this.a(new gwj<>(this));
      this.a(new gwg<>(this, new gcg($$0.a(gfb.aT)), new gcg($$0.a(gfb.aU)), $$0.h()));
   }

   public aku a(haz $$0) {
      return a;
   }

   public haz b() {
      return new haz();
   }

   public void a(cls $$0, haz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gst.a($$0, $$1, $$2, this.i);
   }
}
