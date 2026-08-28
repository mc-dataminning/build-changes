public record zm(String b, int c) implements yw<zc> {
   public static final yn<vl, zm> a = yw.a(zm::a, zm::new);

   private zm(vl $$0) {
      this($$0.p(), $$0.l());
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
   }

   @Override
   public yy<zm> a() {
      return zo.j;
   }

   public void a(zc $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
