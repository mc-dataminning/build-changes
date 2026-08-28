import java.util.UUID;

public record xw(UUID a, cmu b) {
   public static xw a(cmu $$0) {
      return new xw(UUID.randomUUID(), $$0);
   }

   public yf.c a(UUID $$0) {
      return new yf($$0, this.a).a(azi.a(this.b.b(), "SHA256withRSA"));
   }

   public yc a() {
      return new yc(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cmu c() {
      return this.b;
   }
}
