public record vw(long b, gv c) implements vo {
   public static final aep a = new aep("debug/neighbors_update");

   public vw(sh $$0) {
      this($$0.n(), $$0.e());
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public aep a() {
      return a;
   }
}
