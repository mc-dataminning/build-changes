public record yj(int b, efg c, float d) implements ya {
   public static final ahg a = new ahg("debug/path");

   public yj(ui $$0) {
      this($$0.readInt(), efg.b($$0), $$0.readFloat());
   }

   @Override
   public void a(ui $$0) {
      $$0.p(this.b);
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public ahg a() {
      return a;
   }
}
