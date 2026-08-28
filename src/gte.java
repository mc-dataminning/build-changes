public class gte extends gse<ckx, gyl> {
   private static final akv a = akv.b("textures/entity/lead_knot.png");
   private final gct b;

   public gte(gsf.a $$0) {
      super($$0);
      this.b = new gct($$0.a(gfd.br));
   }

   @Override
   public void a(gyl $$0, ffv $$1, glz $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      ffz $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hej.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gyl d() {
      return new gyl();
   }
}
