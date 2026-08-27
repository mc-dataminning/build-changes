import java.util.List;

public record vy(int b, gw c, List<vy.a> d) implements vs {
   public static final aeu a = new aeu("debug/goal_selector");

   public vy(sl $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(vy.a::new));
   }

   @Override
   public void a(sl $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aeu a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(sl $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(sl $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
