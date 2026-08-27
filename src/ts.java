import java.util.UUID;

public record ts(UUID a, cbr b) {
   public static ts a(cbr $$0) {
      return new ts(UUID.randomUUID(), $$0);
   }

   public ub.c a(UUID $$0) {
      return new ub($$0, this.a).a(asd.a(this.b.b(), "SHA256withRSA"));
   }

   public ty a() {
      return new ty(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cbr c() {
      return this.b;
   }
}
