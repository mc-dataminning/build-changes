import java.util.List;

public record zg(int c, ib d, List<zg.a> e) implements za {
   public static final xq<us, zg> a = za.a(zg::a, zg::new);
   public static final za.b<zg> b = za.a("debug/goal_selector");

   private zg(us $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(zg.a::new));
   }

   private void a(us $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public za.b<zg> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ib c() {
      return this.d;
   }

   public List<zg.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(us $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(us $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
