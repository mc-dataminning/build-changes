public class hby extends hcw<hee, ghj> {
   private static final ali a = ali.b("textures/entity/cat/cat_collar.png");
   private final ghj b;
   private final ghj c;

   public hby(haf<hee, ghj> $$0, gla $$1) {
      super($$0);
      this.b = new ghj($$1.a(gld.T));
      this.c = new ghj($$1.a(gld.S));
   }

   public void a(flo $$0, gsa $$1, int $$2, hee $$3, float $$4, float $$5) {
      cyw $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         ghj $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
