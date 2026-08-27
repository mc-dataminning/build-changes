import java.util.UUID;

public record wr(UUID a, cjv b) {
   public static wr a(cjv $$0) {
      return new wr(UUID.randomUUID(), $$0);
   }

   public xa.c a(UUID $$0) {
      return new xa($$0, this.a).a(axx.a(this.b.b(), "SHA256withRSA"));
   }

   public wx a() {
      return new wx(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cjv c() {
      return this.b;
   }
}
