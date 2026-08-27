import java.util.List;

public record zu(int c, ib d, List<zu.a> e) implements zo {
   public static final ye<vg, zu> a = zo.a(zu::a, zu::new);
   public static final zo.b<zu> b = zo.a("debug/goal_selector");

   private zu(vg $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(zu.a::new));
   }

   private void a(vg $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zo.b<zu> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ib c() {
      return this.d;
   }

   public List<zu.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vg $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vg $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
