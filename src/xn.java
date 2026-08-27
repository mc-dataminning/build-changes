import java.util.UUID;

public record xn(xn.a b) implements xo {
   public static final agt a = new agt("debug/breeze");

   public xn(ue $$0) {
      this(new xn.a($$0));
   }

   @Override
   public void a(ue $$0) {
      this.b.a($$0);
   }

   @Override
   public agt a() {
      return a;
   }

   public static record a(UUID a, int b, Integer c, hv d) {
      public a(ue $$0) {
         this($$0.p(), $$0.readInt(), $$0.c(ue::readInt), $$0.c(ue::e));
      }

      public void a(ue $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, ue::p);
         $$0.a(this.d, ue::a);
      }

      public String a() {
         return acu.a(this.a);
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

      public hv e() {
         return this.d;
      }
   }
}
