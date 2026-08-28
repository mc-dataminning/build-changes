public class gtd extends gsd<ckw, gyk> {
   private static final akv a = akv.b("textures/entity/lead_knot.png");
   private final gcs b;

   public gtd(gse.a $$0) {
      super($$0);
      this.b = new gcs($$0.a(gfc.br));
   }

   @Override
   public void a(gyk $$0, ffu $$1, gly $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      ffy $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hei.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gyk d() {
      return new gyk();
   }
}
