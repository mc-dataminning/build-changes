public record yk(int b, efo c, float d) implements yb {
   public static final ahh a = new ahh("debug/path");

   public yk(uj $$0) {
      this($$0.readInt(), efo.b($$0), $$0.readFloat());
   }

   @Override
   public void a(uj $$0) {
      $$0.p(this.b);
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public ahh a() {
      return a;
   }
}
