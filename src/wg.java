public record wg(int b, eav c, float d) implements vx {
   public static final aez a = new aez("debug/path");

   public wg(so $$0) {
      this($$0.readInt(), eav.b($$0), $$0.readFloat());
   }

   @Override
   public void a(so $$0) {
      $$0.p(this.b);
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public aez a() {
      return a;
   }
}
