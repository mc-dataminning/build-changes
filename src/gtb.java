public class gtb extends gsb<ckv, gyi> {
   private static final aku a = aku.b("textures/entity/lead_knot.png");
   private final gcr b;

   public gtb(gsc.a $$0) {
      super($$0);
      this.b = new gcr($$0.a(gfb.br));
   }

   @Override
   public void a(gyi $$0, ffu $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      ffy $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hea.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gyi d() {
      return new gyi();
   }
}
