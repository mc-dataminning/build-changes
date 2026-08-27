import java.util.List;

public record xj(int b, ht c, List<xj.a> d) implements xd {
   public static final agi a = new agi("debug/goal_selector");

   public xj(tu $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(xj.a::new));
   }

   @Override
   public void a(tu $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public agi a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(tu $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(tu $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
