public class fvy extends fxi<cbd, fhs<cbd>> {
   private static final agm a = new agm("textures/entity/enderman/enderman.png");
   private final atw i = atw.a();

   public fvy(fwc.a $$0) {
      super($$0, new fhs<>($$0.a(fks.R)), 0.5F);
      this.a(new fzu<>(this));
      this.a(new fzl(this, $$0.c()));
   }

   public void a(cbd $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      dhn $$6 = $$0.gf();
      fhs<cbd> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gg();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ejz a(cbd $$0, float $$1) {
      if ($$0.gg()) {
         double $$2 = 0.02;
         return new ejz(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public agm a(cbd $$0) {
      return a;
   }
}
