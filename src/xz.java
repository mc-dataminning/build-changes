import java.util.UUID;

public record xz(UUID a, cmy b) {
   public static xz a(cmy $$0) {
      return new xz(UUID.randomUUID(), $$0);
   }

   public yi.c a(UUID $$0) {
      return new yi($$0, this.a).a(azm.a(this.b.b(), "SHA256withRSA"));
   }

   public yf a() {
      return new yf(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cmy c() {
      return this.b;
   }
}
