public class gsp extends gtn<guu, fyn> {
   private static final all a = all.b("textures/entity/cat/cat_collar.png");
   private final fyn b;
   private final fyn c;

   public gsp(gqw<guu, fyn> $$0, gby $$1) {
      super($$0);
      this.b = new fyn($$1.a(gcb.F));
      this.c = new fyn($$1.a(gcb.G));
   }

   public void a(fek $$0, gix $$1, int $$2, guu $$3, float $$4, float $$5) {
      cvc $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         fyn $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
