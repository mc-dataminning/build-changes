public class gxv extends gyt<haa, gdl> {
   private static final ald a = ald.b("textures/entity/cat/cat_collar.png");
   private final gdl b;
   private final gdl c;

   public gxv(gwc<haa, gdl> $$0, ggz $$1) {
      super($$0);
      this.b = new gdl($$1.a(ghc.T));
      this.c = new gdl($$1.a(ghc.S));
   }

   public void a(fho $$0, gny $$1, int $$2, haa $$3, float $$4, float $$5) {
      cwv $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gdl $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
