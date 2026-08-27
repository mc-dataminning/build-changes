import java.util.List;

public record zi(int c, ib d, List<zi.a> e) implements zc {
   public static final xs<uu, zi> a = zc.a(zi::a, zi::new);
   public static final zc.b<zi> b = zc.a("debug/goal_selector");

   private zi(uu $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(zi.a::new));
   }

   private void a(uu $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zc.b<zi> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ib c() {
      return this.d;
   }

   public List<zi.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(uu $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(uu $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
