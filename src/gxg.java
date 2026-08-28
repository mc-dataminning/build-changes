public class gxg extends gwg<cnb, hcn> {
   private static final alg a = alg.b("textures/entity/lead_knot.png");
   private final ggq g;

   public gxg(gwh.a $$0) {
      super($$0);
      this.g = new ggq($$0.a(gjb.bD));
   }

   @Override
   public void a(hcn $$0, fjj $$1, gqa $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      fjn $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hin.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hcn d() {
      return new hcn();
   }
}
