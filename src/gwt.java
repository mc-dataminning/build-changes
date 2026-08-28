public class gwt extends gxs<gyz, gcl> {
   private static final aku a = aku.b("textures/entity/cat/cat_collar.png");
   private final gcl b;
   private final gcl c;

   public gwt(gva<gyz, gcl> $$0, gfy $$1) {
      super($$0);
      this.b = new gcl($$1.a(ggb.R));
      this.c = new gcl($$1.a(ggb.Q));
   }

   public void a(fgr $$0, gmx $$1, int $$2, gyz $$3, float $$4, float $$5) {
      cwe $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gcl $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
