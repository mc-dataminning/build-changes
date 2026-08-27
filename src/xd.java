public record xd(int b, ebt c, float d) implements wu {
   public static final afw a = new afw("debug/path");

   public xd(tl $$0) {
      this($$0.readInt(), ebt.b($$0), $$0.readFloat());
   }

   @Override
   public void a(tl $$0) {
      $$0.p(this.b);
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public afw a() {
      return a;
   }
}
