import java.util.List;

public record we(int b, gw c, List<we.a> d) implements vy {
   public static final aey a = new aey("debug/goal_selector");

   public we(sq $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(we.a::new));
   }

   @Override
   public void a(sq $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aey a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(sq $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(sq $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
