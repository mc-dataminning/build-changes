import java.util.UUID;

public record vc(UUID a, cdo b) {
   public static vc a(cdo $$0) {
      return new vc(UUID.randomUUID(), $$0);
   }

   public vl.c a(UUID $$0) {
      return new vl($$0, this.a).a(atu.a(this.b.b(), "SHA256withRSA"));
   }

   public vi a() {
      return new vi(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cdo c() {
      return this.b;
   }
}
