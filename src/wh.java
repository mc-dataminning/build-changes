public record wh(int b, ebd c, float d) implements vy {
   public static final aey a = new aey("debug/path");

   public wh(sq $$0) {
      this($$0.readInt(), ebd.b($$0), $$0.readFloat());
   }

   @Override
   public void a(sq $$0) {
      $$0.p(this.b);
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public aey a() {
      return a;
   }
}
