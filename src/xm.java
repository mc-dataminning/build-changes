public record xm(int b, edh c, float d) implements xd {
   public static final agi a = new agi("debug/path");

   public xm(tu $$0) {
      this($$0.readInt(), edh.b($$0), $$0.readFloat());
   }

   @Override
   public void a(tu $$0) {
      $$0.p(this.b);
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public agi a() {
      return a;
   }
}
