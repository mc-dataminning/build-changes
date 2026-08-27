import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record tm(UUID a, byr b) {
   public tr a() {
      return new tr.a(this.b.a());
   }

   public tp.b a(UUID $$0) {
      return new tp($$0, this.a).a(this.b);
   }

   public tm.a b() {
      return new tm.a(this.a, this.b.b());
   }

   public boolean c() {
      return this.b.b().a();
   }

   public UUID d() {
      return this.a;
   }

   public byr e() {
      return this.b;
   }

   public static record a(UUID a, byr.a b) {
      public static tm.a a(sf $$0) {
         return new tm.a($$0.o(), new byr.a($$0));
      }

      public static void a(sf $$0, tm.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public tm a(GameProfile $$0, apj $$1, Duration $$2) throws byr.b {
         return new tm(this.a, byr.a($$1, $$0.getId(), this.b, $$2));
      }
   }
}
