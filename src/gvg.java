public class gvg extends gwf<gxl, gay> {
   private static final alz a = alz.b("textures/entity/cat/cat_collar.png");
   private final gay b;
   private final gay c;

   public gvg(gtn<gxl, gay> $$0, gek $$1) {
      super($$0);
      this.b = new gay($$1.a(gen.O));
      this.c = new gay($$1.a(gen.N));
   }

   public void a(fgs $$0, gll $$1, int $$2, gxl $$3, float $$4, float $$5) {
      cwm $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gay $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
