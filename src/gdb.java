public class gdb extends gbr<cea, fod<cea>> {
   private static final aiy a = new aiy("textures/entity/skeleton/skeleton.png");

   public gdb(gba.a $$0) {
      this($$0, fpi.bj, fpi.bl, fpi.bm);
   }

   public gdb(gba.a $$0, fph $$1, fph $$2, fph $$3) {
      super($$0, new fod<>($$0.a($$1)), 0.5F);
      this.a(new gfb<>(this, new fod($$0.a($$2)), new fod($$0.a($$3)), $$0.g()));
   }

   public aiy a(cea $$0) {
      return a;
   }

   protected boolean b(cea $$0) {
      return $$0.gg();
   }
}
