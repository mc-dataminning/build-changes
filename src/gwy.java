public class gwy extends gvy<cmx, hcf> {
   private static final alg a = alg.b("textures/entity/lead_knot.png");
   private final ggi g;

   public gwy(gvz.a $$0) {
      super($$0);
      this.g = new ggi($$0.a(git.bB));
   }

   @Override
   public void a(hcf $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      fjg $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hif.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hcf d() {
      return new hcf();
   }
}
