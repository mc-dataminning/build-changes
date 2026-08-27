import java.util.List;

public record yh(int b, hx c, List<yh.a> d) implements yb {
   public static final ahh a = new ahh("debug/goal_selector");

   public yh(uj $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(yh.a::new));
   }

   @Override
   public void a(uj $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public ahh a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(uj $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(uj $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
