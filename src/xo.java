import java.util.UUID;

public record xo(UUID a, cnw b) {
   public static xo a(cnw $$0) {
      return new xo(UUID.randomUUID(), $$0);
   }

   public xx.c a(UUID $$0) {
      return new xx($$0, this.a).a(azr.a(this.b.b(), "SHA256withRSA"));
   }

   public xu a() {
      return new xu(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cnw c() {
      return this.b;
   }
}
