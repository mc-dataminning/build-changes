public class gan extends fzd<cbx, flr<cbx>> {
   private static final ahg a = new ahg("textures/entity/skeleton/skeleton.png");

   public gan(fym.a $$0) {
      this($$0, fmv.bk, fmv.bm, fmv.bn);
   }

   public gan(fym.a $$0, fmu $$1, fmu $$2, fmu $$3) {
      super($$0, new flr<>($$0.a($$1)), 0.5F);
      this.a(new gcn<>(this, new flr($$0.a($$2)), new flr($$0.a($$3)), $$0.g()));
   }

   public ahg a(cbx $$0) {
      return a;
   }

   protected boolean b(cbx $$0) {
      return $$0.ge();
   }
}
