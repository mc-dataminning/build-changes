public class gve extends gue<cmh, hak> {
   private static final ald a = ald.b("textures/entity/lead_knot.png");
   private final ges g;

   public gve(guf.a $$0) {
      super($$0);
      this.g = new ges($$0.a(ghc.bz));
   }

   @Override
   public void a(hak $$0, fho $$1, gny $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      fhs $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hgi.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hak d() {
      return new hak();
   }
}
