import java.util.List;

public record vv(int b, gu c, List<vv.a> d) implements vp {
   public static final aer a = new aer("debug/goal_selector");

   public vv(si $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(vv.a::new));
   }

   @Override
   public void a(si $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aer a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(si $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(si $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
