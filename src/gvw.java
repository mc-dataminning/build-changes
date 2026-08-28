public class gvw<S extends gyz, M extends gcb<S> & gem> extends gwt<S, M> {
   public gvw(gub<S, M> $$0) {
      super($$0);
   }

   public void a(ffu $$0, gly $$1, int $$2, S $$3, float $$4, float $$5) {
      hbo $$6 = $$3.i;
      if (!$$6.c()) {
         $$0.a();
         this.a($$3, $$0);
         $$6.a($$0, $$1, $$2, hei.d);
         $$0.b();
      }
   }

   protected void a(S $$0, ffu $$1) {
      this.d().a($$1);
      $$1.a(a.b.rotation(0.75F));
      $$1.b(1.07F, 1.07F, 1.07F);
      $$1.a(0.0F, 0.13F, -0.34F);
      $$1.a(a.b.rotation((float) Math.PI));
   }
}
