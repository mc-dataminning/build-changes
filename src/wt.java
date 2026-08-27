import java.util.UUID;

public record wt(UUID a, ckc b) {
   public static wt a(ckc $$0) {
      return new wt(UUID.randomUUID(), $$0);
   }

   public xc.c a(UUID $$0) {
      return new xc($$0, this.a).a(axz.a(this.b.b(), "SHA256withRSA"));
   }

   public wz a() {
      return new wz(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public ckc c() {
      return this.b;
   }
}
