import java.util.UUID;

public record zp(zp.a c) implements zq {
   public static final yg<vi, zp> a = zq.a(zp::a, zp::new);
   public static final zq.b<zp> b = zq.a("debug/breeze");

   private zp(vi $$0) {
      this(new zp.a($$0));
   }

   private void a(vi $$0) {
      this.c.a($$0);
   }

   @Override
   public zq.b<zp> a() {
      return b;
   }

   public zp.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, id d) {
      public a(vi $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vi::readInt), $$0.c(id.b));
      }

      public void a(vi $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, vi::p);
         $$0.a(this.d, id.b);
      }

      public String a() {
         return afj.a(this.a);
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

      public id e() {
         return this.d;
      }
   }
}
