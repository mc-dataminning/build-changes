public class gon extends gnn<ckb, gtq> {
   private static final ale a = ale.b("textures/entity/lead_knot.png");
   private final fyf b;

   public gon(gno.a $$0) {
      super($$0);
      this.b = new fyf($$0.a(gap.bb));
   }

   @Override
   public void a(gtq $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fdm $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gwx.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gtq b() {
      return new gtq();
   }
}
