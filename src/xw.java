import java.util.UUID;

public record xw(xw.a b) implements xx {
   public static final ahd a = new ahd("debug/breeze");

   public xw(ug $$0) {
      this(new xw.a($$0));
   }

   @Override
   public void a(ug $$0) {
      this.b.a($$0);
   }

   @Override
   public ahd a() {
      return a;
   }

   public static record a(UUID a, int b, Integer c, hx d) {
      public a(ug $$0) {
         this($$0.p(), $$0.readInt(), $$0.c(ug::readInt), $$0.c(ug::e));
      }

      public void a(ug $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, ug::p);
         $$0.a(this.d, ug::a);
      }

      public String a() {
         return ade.a(this.a);
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

      public hx e() {
         return this.d;
      }
   }
}
