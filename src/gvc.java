public class gvc extends gsb<cqg, gyi> {
   private static final aku a = aku.b("textures/entity/projectiles/wind_charge.png");
   private final geo b;

   public gvc(gsc.a $$0) {
      super($$0);
      this.b = new geo($$0.a(gfb.dy));
   }

   @Override
   public void a(gyi $$0, ffu $$1, glx $$2, int $$3) {
      ffy $$4 = $$2.getBuffer(gmh.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hea.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gyi d() {
      return new gyi();
   }
}
