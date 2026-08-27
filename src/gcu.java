public class gcu extends gbk<cdw, fnw<cdw>> {
   private static final aiy a = new aiy("textures/entity/skeleton/skeleton.png");

   public gcu(gat.a $$0) {
      this($$0, fpb.bj, fpb.bl, fpb.bm);
   }

   public gcu(gat.a $$0, fpa $$1, fpa $$2, fpa $$3) {
      super($$0, new fnw<>($$0.a($$1)), 0.5F);
      this.a(new geu<>(this, new fnw($$0.a($$2)), new fnw($$0.a($$3)), $$0.g()));
   }

   public aiy a(cdw $$0) {
      return a;
   }

   protected boolean b(cdw $$0) {
      return $$0.gg();
   }
}
