import java.util.UUID;

public record ya(ya.a b) implements yb {
   public static final ahh a = new ahh("debug/breeze");

   public ya(uj $$0) {
      this(new ya.a($$0));
   }

   @Override
   public void a(uj $$0) {
      this.b.a($$0);
   }

   @Override
   public ahh a() {
      return a;
   }

   public static record a(UUID a, int b, Integer c, hx d) {
      public a(uj $$0) {
         this($$0.p(), $$0.readInt(), $$0.c(uj::readInt), $$0.c(uj::e));
      }

      public void a(uj $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, uj::p);
         $$0.a(this.d, uj::a);
      }

      public String a() {
         return adi.a(this.a);
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
