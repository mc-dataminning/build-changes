public record wb(int b, eaw c, float d) implements vs {
   public static final aeu a = new aeu("debug/path");

   public wb(sl $$0) {
      this($$0.readInt(), eaw.b($$0), $$0.readFloat());
   }

   @Override
   public void a(sl $$0) {
      $$0.p(this.b);
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public aeu a() {
      return a;
   }
}
