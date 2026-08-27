import java.util.List;

public record yd(int b, hx c, List<yd.a> d) implements xx {
   public static final ahd a = new ahd("debug/goal_selector");

   public yd(ug $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(yd.a::new));
   }

   @Override
   public void a(ug $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public ahd a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(ug $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(ug $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
