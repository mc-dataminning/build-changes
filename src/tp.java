import java.util.UUID;

public record tp(UUID a, cbp b) {
   public static tp a(cbp $$0) {
      return new tp(UUID.randomUUID(), $$0);
   }

   public ty.c a(UUID $$0) {
      return new ty($$0, this.a).a(asa.a(this.b.b(), "SHA256withRSA"));
   }

   public tv a() {
      return new tv(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cbp c() {
      return this.b;
   }
}
