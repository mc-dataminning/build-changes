import java.util.List;

public record vu(int b, gv c, List<vu.a> d) implements vo {
   public static final aep a = new aep("debug/goal_selector");

   public vu(sh $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(vu.a::new));
   }

   @Override
   public void a(sh $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aep a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(sh $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(sh $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
