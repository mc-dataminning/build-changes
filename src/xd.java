import java.util.UUID;

public record xd(UUID a, ckn b) {
   public static xd a(ckn $$0) {
      return new xd(UUID.randomUUID(), $$0);
   }

   public xm.c a(UUID $$0) {
      return new xm($$0, this.a).a(ayj.a(this.b.b(), "SHA256withRSA"));
   }

   public xj a() {
      return new xj(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public ckn c() {
      return this.b;
   }
}
