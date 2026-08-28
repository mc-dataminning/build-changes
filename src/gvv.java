public class gvv extends gwu<gyb, gbo> {
   private static final akv a = akv.b("textures/entity/cat/cat_collar.png");
   private final gbo b;
   private final gbo c;

   public gvv(guc<gyb, gbo> $$0, gfa $$1) {
      super($$0);
      this.b = new gbo($$1.a(gfd.R));
      this.c = new gbo($$1.a(gfd.Q));
   }

   public void a(ffv $$0, glz $$1, int $$2, gyb $$3, float $$4, float $$5) {
      cvn $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gbo $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
