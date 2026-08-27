public class fyb extends fzl<cbz, fjn<cbz>> {
   private static final ahd a = new ahd("textures/entity/enderman/enderman.png");
   private final aup i = aup.a();

   public fyb(fyf.a $$0) {
      super($$0, new fjn<>($$0.a(fmo.U)), 0.5F);
      this.a(new gca<>(this));
      this.a(new gbr(this, $$0.c()));
   }

   public void a(cbz $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      dja $$6 = $$0.ge();
      fjn<cbz> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public elm a(cbz $$0, float $$1) {
      if ($$0.gf()) {
         double $$2 = 0.02;
         return new elm(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ahd a(cbz $$0) {
      return a;
   }
}
