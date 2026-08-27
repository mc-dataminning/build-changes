import java.util.UUID;

public record vc(UUID a, cdw b) {
   public static vc a(cdw $$0) {
      return new vc(UUID.randomUUID(), $$0);
   }

   public vl.c a(UUID $$0) {
      return new vl($$0, this.a).a(atz.a(this.b.b(), "SHA256withRSA"));
   }

   public vi a() {
      return new vi(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cdw c() {
      return this.b;
   }
}
