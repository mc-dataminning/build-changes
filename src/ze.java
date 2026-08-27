import java.util.List;

public record ze(int c, hz d, List<ze.a> e) implements yy {
   public static final xo<uq, ze> a = yy.a(ze::a, ze::new);
   public static final yy.b<ze> b = yy.a("debug/goal_selector");

   private ze(uq $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(ze.a::new));
   }

   private void a(uq $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yy.b<ze> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public hz c() {
      return this.d;
   }

   public List<ze.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(uq $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(uq $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
