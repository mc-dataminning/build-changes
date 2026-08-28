public class guf extends gty<gwz, gao> {
   public static final alj a = alj.b("textures/entity/trident_riptide.png");
   private final gbl b;

   public guf(grh<gwz, gao> $$0, gch $$1) {
      super($$0);
      this.b = new gbl($$1.a(gck.ch));
   }

   public void a(fer $$0, gjg $$1, int $$2, gwz $$3, float $$4, float $$5) {
      if ($$3.ag) {
         fev $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, gyv.d);
      }
   }
}
