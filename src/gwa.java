public class gwa extends gwt<hbb, gbw> {
   private static final akv a = akv.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gbw b;
   private final gbw c;

   public gwa(gub<hbb, gbw> $$0, gez $$1) {
      super($$0);
      this.b = new gbw($$1.a(gfc.aD));
      this.c = new gbw($$1.a(gfc.aA));
   }

   public void a(ffu $$0, gly $$1, int $$2, hbb $$3, float $$4, float $$5) {
      gbw $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
