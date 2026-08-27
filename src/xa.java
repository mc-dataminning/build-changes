import java.util.List;

public record xa(int b, ht c, List<xa.a> d) implements wu {
   public static final afw a = new afw("debug/goal_selector");

   public xa(tl $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(xa.a::new));
   }

   @Override
   public void a(tl $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public afw a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(tl $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(tl $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
