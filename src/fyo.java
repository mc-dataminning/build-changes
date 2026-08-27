public class fyo extends fwb<cfd> {
   public static final agm a = new agm("textures/entity/trident.png");
   private final fjz f;

   public fyo(fwc.a $$0) {
      super($$0);
      this.f = new fjz($$0.a(fks.bC));
   }

   public void a(cfd $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(atq.i($$2, $$0.N, $$0.dD()) - 90.0F));
      $$3.a(a.f.rotationDegrees(atq.i($$2, $$0.O, $$0.dF()) + 90.0F));
      eof $$6 = fxa.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agm a(cfd $$0) {
      return a;
   }
}
