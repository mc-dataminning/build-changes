public class gfx extends ggo<cid, fqw<cid>> {
   private static final ajt a = new ajt("textures/entity/hoglin/hoglin.png");

   public gfx(gfi.a $$0) {
      super($$0, new fqw<>($$0.a(ftl.an)), 0.7F);
   }

   public ajt a(cid $$0) {
      return a;
   }

   protected boolean b(cid $$0) {
      return super.a($$0) || $$0.y();
   }
}
