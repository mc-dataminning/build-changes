public class fyh extends fzr<cce, fjt<cce>> {
   private static final ahg a = new ahg("textures/entity/enderman/enderman.png");
   private final auu i = auu.a();

   public fyh(fyl.a $$0) {
      super($$0, new fjt<>($$0.a(fmu.U)), 0.5F);
      this.a(new gcg<>(this));
      this.a(new gbx(this, $$0.c()));
   }

   public void a(cce $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      djg $$6 = $$0.ge();
      fjt<cce> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public els a(cce $$0, float $$1) {
      if ($$0.gf()) {
         double $$2 = 0.02;
         return new els(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ahg a(cce $$0) {
      return a;
   }
}
