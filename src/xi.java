import java.util.UUID;

public record xi(UUID a, cma b) {
   public static xi a(cma $$0) {
      return new xi(UUID.randomUUID(), $$0);
   }

   public xr.c a(UUID $$0) {
      return new xr($$0, this.a).a(ays.a(this.b.b(), "SHA256withRSA"));
   }

   public xo a() {
      return new xo(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cma c() {
      return this.b;
   }
}
