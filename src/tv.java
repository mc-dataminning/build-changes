import java.util.UUID;

public record tv(UUID a, cbw b) {
   public static tv a(cbw $$0) {
      return new tv(UUID.randomUUID(), $$0);
   }

   public ue.c a(UUID $$0) {
      return new ue($$0, this.a).a(asi.a(this.b.b(), "SHA256withRSA"));
   }

   public ub a() {
      return new ub(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cbw c() {
      return this.b;
   }
}
