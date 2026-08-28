import java.util.UUID;

public record xt(UUID a, cop b) {
   public static xt a(cop $$0) {
      return new xt(UUID.randomUUID(), $$0);
   }

   public yc.c a(UUID $$0) {
      return new yc($$0, this.a).a(azy.a(this.b.b(), "SHA256withRSA"));
   }

   public xz a() {
      return new xz(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cop c() {
      return this.b;
   }
}
