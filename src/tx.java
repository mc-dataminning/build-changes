import java.util.UUID;

public record tx(UUID a, cby b) {
   public static tx a(cby $$0) {
      return new tx(UUID.randomUUID(), $$0);
   }

   public ug.c a(UUID $$0) {
      return new ug($$0, this.a).a(ask.a(this.b.b(), "SHA256withRSA"));
   }

   public ud a() {
      return new ud(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cby c() {
      return this.b;
   }
}
