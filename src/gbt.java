public class gbt extends fze<cdj, fmq<cdj>> {
   private static final ahg a = new ahg("textures/entity/zombie_villager/zombie_villager.png");

   public gbt(fyn.a $$0) {
      super($$0, new fmq<>($$0.a(fmw.cg)), 0.5F);
      this.a(new gco<>(this, new fmq($$0.a(fmw.ch)), new fmq($$0.a(fmw.ci)), $$0.g()));
      this.a(new gdj<>(this, $$0.e(), "zombie_villager"));
   }

   public ahg a(cdj $$0) {
      return a;
   }

   protected boolean b(cdj $$0) {
      return super.a($$0) || $$0.go();
   }
}
