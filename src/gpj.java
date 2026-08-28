public class gpj extends goj<ckp, gun> {
   private static final ali a = ali.b("textures/entity/lead_knot.png");
   private final fzb b;

   public gpj(gok.a $$0) {
      super($$0);
      this.b = new fzb($$0.a(gbl.bb));
   }

   @Override
   public void a(gun $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fef $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gxu.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gun b() {
      return new gun();
   }
}
