import java.util.List;

public record xn(int b, hx c, List<xn.a> d) implements xh {
   public static final agm a = new agm("debug/goal_selector");

   public xn(ty $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(xn.a::new));
   }

   @Override
   public void a(ty $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public agm a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(ty $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(ty $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
