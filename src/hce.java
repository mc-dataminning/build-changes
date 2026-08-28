public class hce extends hcw<hhf, ghv> {
   private static final ali a = ali.b("textures/entity/zombie/drowned_outer_layer.png");
   private final ghv b;
   private final ghv c;

   public hce(haf<hhf, ghv> $$0, gla $$1) {
      super($$0);
      this.b = new ghv($$1.a(gld.aN));
      this.c = new ghv($$1.a(gld.aK));
   }

   public void a(flo $$0, gsa $$1, int $$2, hhf $$3, float $$4, float $$5) {
      ghv $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
