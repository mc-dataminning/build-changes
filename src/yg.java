import java.util.UUID;

public record yg(UUID a, cpy b) {
   public static yg a(cpy $$0) {
      return new yg(UUID.randomUUID(), $$0);
   }

   public yp.c a(UUID $$0) {
      return new yp($$0, this.a).a(bas.a(this.b.b(), "SHA256withRSA"));
   }

   public ym a() {
      return new ym(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cpy c() {
      return this.b;
   }
}
