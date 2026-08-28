import java.util.UUID;

public record xk(UUID a, cmz b) {
   public static xk a(cmz $$0) {
      return new xk(UUID.randomUUID(), $$0);
   }

   public xt.c a(UUID $$0) {
      return new xt($$0, this.a).a(azc.a(this.b.b(), "SHA256withRSA"));
   }

   public xq a() {
      return new xq(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cmz c() {
      return this.b;
   }
}
