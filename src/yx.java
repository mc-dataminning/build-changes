import java.util.UUID;

public record yx(yx.a c) implements yy {
   public static final xo<uq, yx> a = yy.a(yx::a, yx::new);
   public static final yy.b<yx> b = yy.a("debug/breeze");

   private yx(uq $$0) {
      this(new yx.a($$0));
   }

   private void a(uq $$0) {
      this.c.a($$0);
   }

   @Override
   public yy.b<yx> a() {
      return b;
   }

   public yx.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, hz d) {
      public a(uq $$0) {
         this($$0.p(), $$0.readInt(), $$0.c(uq::readInt), $$0.c(hz.b));
      }

      public void a(uq $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, uq::p);
         $$0.a(this.d, hz.b);
      }

      public String a() {
         return aeo.a(this.a);
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

      public hz e() {
         return this.d;
      }
   }
}
