import java.util.UUID;

public record to(UUID a, cbn b) {
   public static to a(cbn $$0) {
      return new to(UUID.randomUUID(), $$0);
   }

   public tx.c a(UUID $$0) {
      return new tx($$0, this.a).a(ary.a(this.b.b(), "SHA256withRSA"));
   }

   public tu a() {
      return new tu(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cbn c() {
      return this.b;
   }
}
