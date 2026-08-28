public class hbu extends hbm<her, ghv> {
   public static final alg a = alg.b("textures/entity/trident_riptide.png");
   private final gis b;

   public hbu(gyv<her, ghv> $$0, gjp $$1) {
      super($$0);
      this.b = new gis($$1.a(gjs.cB));
   }

   public void a(fkd $$0, gqr $$1, int $$2, her $$3, float $$4, float $$5) {
      if ($$3.al) {
         fkh $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hjg.d);
      }
   }
}
