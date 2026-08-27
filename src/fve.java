import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fve extends fvd {
   static fve.a a(GameProfile $$0, ww $$1, fvc $$2) {
      return new fve.a($$0, $$1, $$2);
   }

   static fve.b a(wg $$0, Instant $$1) {
      return new fve.b($$0, $$1);
   }

   wg b();

   default wg c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, ww d, fvc e) implements fve {
      public static final Codec<fve.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aws.v.fieldOf("profile").forGetter(fve.a::f), ww.a.forGetter(fve.a::g), fvc.d.optionalFieldOf("trust_level", fvc.a).forGetter(fve.a::h)
               )
               .apply($$0, fve.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wg b() {
         if (!this.d.o().a()) {
            wg $$0 = this.d.o().b(this.d.c());
            return (wg)($$0 != null ? $$0 : wg.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wg c() {
         wg $$0 = this.b();
         wg $$1 = this.i();
         return wg.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wg d() {
         wg $$0 = this.i();
         return wg.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wg i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wg.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fvd.a a() {
         return fvd.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public ww g() {
         return this.d;
      }

      public fvc h() {
         return this.e;
      }
   }

   public static record b(wg c, Instant d) implements fve {
      public static final Codec<fve.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(wi.a.fieldOf("message").forGetter(fve.b::d), aws.m.fieldOf("time_stamp").forGetter(fve.b::e)).apply($$0, fve.b::new)
      );

      @Override
      public wg b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fvd.a a() {
         return fvd.a.b;
      }

      public wg d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
