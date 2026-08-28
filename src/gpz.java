public class gpz extends goz<ckt, gvd> {
   private static final all a = all.b("textures/entity/lead_knot.png");
   private final fzr b;

   public gpz(gpa.a $$0) {
      super($$0);
      this.b = new fzr($$0.a(gcb.bb));
   }

   @Override
   public void a(gvd $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      feo $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gyk.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gvd b() {
      return new gvd();
   }
}
