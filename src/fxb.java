public class fxb extends fwb<cam> {
   private static final agm a = new agm("textures/entity/lead_knot.png");
   private final fil<cam> f;

   public fxb(fwc.a $$0) {
      super($$0);
      this.f = new fil<>($$0.a(fks.aq));
   }

   public void a(cam $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eof $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agm a(cam $$0) {
      return a;
   }
}
