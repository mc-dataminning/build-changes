public class gao extends fze<cby, fls<cby>> {
   private static final ahg a = new ahg("textures/entity/skeleton/skeleton.png");

   public gao(fyn.a $$0) {
      this($$0, fmw.bk, fmw.bm, fmw.bn);
   }

   public gao(fyn.a $$0, fmv $$1, fmv $$2, fmv $$3) {
      super($$0, new fls<>($$0.a($$1)), 0.5F);
      this.a(new gco<>(this, new fls($$0.a($$2)), new fls($$0.a($$3)), $$0.g()));
   }

   public ahg a(cby $$0) {
      return a;
   }

   protected boolean b(cby $$0) {
      return $$0.ge();
   }
}
