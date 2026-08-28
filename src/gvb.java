public class gvb extends gsx<cmn, gzc> {
   private static final akv a = akv.b("textures/entity/illager/vindicator.png");

   public gvb(gse.a $$0) {
      super($$0, new gcp<>($$0.a(gfc.dv)), 0.5F);
      this.a(new gwl<gzc, gcp<gzc>>(this) {
         public void a(ffu $$0, gly $$1, int $$2, gzc $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public akv a(gzc $$0) {
      return a;
   }

   public gzc b() {
      return new gzc();
   }
}
