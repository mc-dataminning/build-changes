public class gta extends gty<gvf, fyw> {
   private static final alj a = alj.b("textures/entity/cat/cat_collar.png");
   private final fyw b;
   private final fyw c;

   public gta(grh<gvf, fyw> $$0, gch $$1) {
      super($$0);
      this.b = new fyw($$1.a(gck.O));
      this.c = new fyw($$1.a(gck.N));
   }

   public void a(fer $$0, gjg $$1, int $$2, gvf $$3, float $$4, float $$5) {
      cvj $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         fyw $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
