public record zs(String b, int c) implements zc<zi> {
   public static final yt<vr, zs> a = zc.a(zs::a, zs::new);

   private zs(vr $$0) {
      this($$0.p(), $$0.l());
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
   }

   @Override
   public ze<zs> a() {
      return zu.j;
   }

   public void a(zi $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
