import java.util.List;

public record wd(int b, gw c, List<wd.a> d) implements vx {
   public static final aez a = new aez("debug/goal_selector");

   public wd(so $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(wd.a::new));
   }

   @Override
   public void a(so $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aez a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(so $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(so $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
