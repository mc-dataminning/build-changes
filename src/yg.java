import java.util.List;

public record yg(int b, hx c, List<yg.a> d) implements ya {
   public static final ahg a = new ahg("debug/goal_selector");

   public yg(ui $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(yg.a::new));
   }

   @Override
   public void a(ui $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public ahg a() {
      return a;
   }

   public static record a(int a, boolean b, String c) {
      public a(ui $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(ui $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
