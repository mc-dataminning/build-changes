import java.util.UUID;

public record xl(UUID a, csa b) {
   public static xl a(csa $$0) {
      return new xl(UUID.randomUUID(), $$0);
   }

   public xu.c a(UUID $$0) {
      return new xu($$0, this.a).a(bae.a(this.b.b(), "SHA256withRSA"));
   }

   public xr a() {
      return new xr(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public csa c() {
      return this.b;
   }
}
