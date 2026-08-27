public record zh(int c, ehe d, float e) implements yy {
   public static final xo<uq, zh> a = yy.a(zh::a, zh::new);
   public static final yy.b<zh> b = yy.a("debug/path");

   private zh(uq $$0) {
      this($$0.readInt(), ehe.b($$0), $$0.readFloat());
   }

   private void a(uq $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public yy.b<zh> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ehe c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
