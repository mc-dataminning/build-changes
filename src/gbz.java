public class gbz extends gaz<cdq> {
   private static final aiy a = new aiy("textures/entity/lead_knot.png");
   private final fmz<cdq> f;

   public gbz(gba.a $$0) {
      super($$0);
      this.f = new fmz<>($$0.a(fpi.as));
   }

   public void a(cdq $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      esl $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cdq $$0) {
      return a;
   }
}
