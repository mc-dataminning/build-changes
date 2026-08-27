public class fzh extends fwt<cch, fkm<cch>> {
   private static final agm a = new agm("textures/entity/zombie_villager/zombie_villager.png");

   public fzh(fwc.a $$0) {
      super($$0, new fkm<>($$0.a(fks.cc)), 0.5F);
      this.a(new gaa<>(this, new fkm($$0.a(fks.cd)), new fkm($$0.a(fks.ce)), $$0.g()));
      this.a(new gav<>(this, $$0.e(), "zombie_villager"));
   }

   public agm a(cch $$0) {
      return a;
   }

   protected boolean b(cch $$0) {
      return super.a($$0) || $$0.gp();
   }
}
