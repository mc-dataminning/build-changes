public class guy extends gsg<cnr, hal, gef> {
   private static final alz a = alz.b("textures/entity/piglin/zombified_piglin.png");

   public guy(grp.a $$0, gel $$1, gel $$2, gel $$3, gel $$4, gel $$5, gel $$6) {
      super($$0, new gef($$0.a($$1)), new gef($$0.a($$2)), 0.5F, gtf.a);
      this.a(new gvt<>(this, new gbx($$0.a($$3)), new gbx($$0.a($$4)), new gbx($$0.a($$5)), new gbx($$0.a($$5)), $$0.h()));
   }

   public alz a(hal $$0) {
      return a;
   }

   public hal b() {
      return new hal();
   }

   public void a(cnr $$0, hal $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gd();
   }
}
