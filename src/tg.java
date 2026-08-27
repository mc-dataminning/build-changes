import java.util.UUID;

public record tg(UUID a, byq b) {
   public static tg a(byq $$0) {
      return new tg(UUID.randomUUID(), $$0);
   }

   public tp.c a(UUID $$0) {
      return new tp($$0, this.a).a(apk.a(this.b.b(), "SHA256withRSA"));
   }

   public tm a() {
      return new tm(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public byq c() {
      return this.b;
   }
}
