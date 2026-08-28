public record zl(String b, int c) implements yv<zb> {
   public static final ym<vl, zl> a = yv.a(zl::a, zl::new);

   private zl(vl $$0) {
      this($$0.p(), $$0.l());
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
   }

   @Override
   public yx<zl> a() {
      return zn.j;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
