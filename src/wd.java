import java.util.List;

public record wd(int b, gw c, List<wd.a> d) implements vx {
   public static final aex a = new aex("debug/goal_selector");

   public wd(sp $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(wd.a::new));
   }

   @Override
   public void a(sp $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aex a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(sp $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(sp $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
