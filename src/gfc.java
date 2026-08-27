public class gfc extends gds<cfi, fqa<cfi>> {
   private static final ajh a = new ajh("textures/entity/skeleton/skeleton.png");

   public gfc(gdb.a $$0) {
      this($$0, fre.bn, fre.bp, fre.bq);
   }

   public gfc(gdb.a $$0, frd $$1, frd $$2, frd $$3) {
      super($$0, new fqa<>($$0.a($$1)), 0.5F);
      this.a(new ghc<>(this, new fqa($$0.a($$2)), new fqa($$0.a($$3)), $$0.g()));
   }

   public ajh a(cfi $$0) {
      return a;
   }

   protected boolean b(cfi $$0) {
      return $$0.gp();
   }
}
