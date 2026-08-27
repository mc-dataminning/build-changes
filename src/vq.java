import java.util.UUID;

public record vq(UUID a, cfj b) {
   public static vq a(cfj $$0) {
      return new vq(UUID.randomUUID(), $$0);
   }

   public vz.c a(UUID $$0) {
      return new vz($$0, this.a).a(avc.a(this.b.b(), "SHA256withRSA"));
   }

   public vw a() {
      return new vw(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cfj c() {
      return this.b;
   }
}
