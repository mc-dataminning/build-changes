public class fvi extends fty<byr, fgy<byr>> {
   private static final aew a = new aew("textures/entity/skeleton/skeleton.png");

   public fvi(fth.a $$0) {
      this($$0, fib.bh, fib.bj, fib.bk);
   }

   public fvi(fth.a $$0, fia $$1, fia $$2, fia $$3) {
      super($$0, new fgy<>($$0.a($$1)), 0.5F);
      this.a(new fxf<>(this, new fgy($$0.a($$2)), new fgy($$0.a($$3)), $$0.g()));
   }

   public aew a(byr $$0) {
      return a;
   }

   protected boolean b(byr $$0) {
      return $$0.gd();
   }
}
