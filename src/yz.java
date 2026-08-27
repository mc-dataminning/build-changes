import java.util.UUID;

public record yz(yz.a c) implements za {
   public static final xq<us, yz> a = za.a(yz::a, yz::new);
   public static final za.b<yz> b = za.a("debug/breeze");

   private yz(us $$0) {
      this(new yz.a($$0));
   }

   private void a(us $$0) {
      this.c.a($$0);
   }

   @Override
   public za.b<yz> a() {
      return b;
   }

   public yz.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, ib d) {
      public a(us $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(us::readInt), $$0.c(ib.b));
      }

      public void a(us $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, us::p);
         $$0.a(this.d, ib.b);
      }

      public String a() {
         return aer.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public Integer d() {
         return this.c;
      }

      public ib e() {
         return this.d;
      }
   }
}
