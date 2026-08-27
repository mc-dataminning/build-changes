public class fxf extends fwb<ceq> {
   private static final agm a = new agm("textures/entity/llama/spit.png");
   private final fio<ceq> f;

   public fxf(fwc.a $$0) {
      super($$0);
      this.f = new fio<>($$0.a(fks.at));
   }

   public void a(ceq $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(atq.i($$2, $$0.N, $$0.dD()) - 90.0F));
      $$3.a(a.f.rotationDegrees(atq.i($$2, $$0.O, $$0.dF())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eof $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agm a(ceq $$0) {
      return a;
   }
}
