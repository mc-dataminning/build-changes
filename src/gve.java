public class gve extends gwd<gxj, gaw> {
   private static final alz a = alz.b("textures/entity/cat/cat_collar.png");
   private final gaw b;
   private final gaw c;

   public gve(gtl<gxj, gaw> $$0, gei $$1) {
      super($$0);
      this.b = new gaw($$1.a(gel.O));
      this.c = new gaw($$1.a(gel.N));
   }

   public void a(fgq $$0, glj $$1, int $$2, gxj $$3, float $$4, float $$5) {
      cwl $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gaw $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
