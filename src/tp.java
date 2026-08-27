import java.util.UUID;

public record tp(UUID a, cbo b) {
   public static tp a(cbo $$0) {
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

   public cbo c() {
      return this.b;
   }
}
