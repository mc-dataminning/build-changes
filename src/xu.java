import java.util.List;

public record xu(int b, hv c, List<xu.a> d) implements xo {
   public static final agt a = new agt("debug/goal_selector");

   public xu(ue $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(xu.a::new));
   }

   @Override
   public void a(ue $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public agt a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(ue $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(ue $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
