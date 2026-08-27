import java.util.UUID;

public record zb(zb.a c) implements zc {
   public static final xs<uu, zb> a = zc.a(zb::a, zb::new);
   public static final zc.b<zb> b = zc.a("debug/breeze");

   private zb(uu $$0) {
      this(new zb.a($$0));
   }

   private void a(uu $$0) {
      this.c.a($$0);
   }

   @Override
   public zc.b<zb> a() {
      return b;
   }

   public zb.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, ib d) {
      public a(uu $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(uu::readInt), $$0.c(ib.b));
      }

      public void a(uu $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, uu::p);
         $$0.a(this.d, ib.b);
      }

      public String a() {
         return aev.a(this.a);
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
