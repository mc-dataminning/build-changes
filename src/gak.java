import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gak extends gaj {
   static gak.a a(GameProfile $$0, xu $$1, gai $$2) {
      return new gak.a($$0, $$1, $$2);
   }

   static gak.b a(xe $$0, Instant $$1) {
      return new gak.b($$0, $$1);
   }

   xe b();

   default xe c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xu d, gai e) implements gak {
      public static final Codec<gak.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.w.fieldOf("profile").forGetter(gak.a::f), xu.a.forGetter(gak.a::g), gai.d.optionalFieldOf("trust_level", gai.a).forGetter(gak.a::h)
               )
               .apply($$0, gak.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xe b() {
         if (!this.d.o().a()) {
            xe $$0 = this.d.o().b(this.d.c());
            return (xe)($$0 != null ? $$0 : xe.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xe c() {
         xe $$0 = this.b();
         xe $$1 = this.i();
         return xe.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xe d() {
         xe $$0 = this.i();
         return xe.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xe i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xe.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gaj.a a() {
         return gaj.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xu g() {
         return this.d;
      }

      public gai h() {
         return this.e;
      }
   }

   public static record b(xe c, Instant d) implements gak {
      public static final Codec<gak.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(xg.a.fieldOf("message").forGetter(gak.b::d), axu.m.fieldOf("time_stamp").forGetter(gak.b::e)).apply($$0, gak.b::new)
      );

      @Override
      public xe b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gaj.a a() {
         return gaj.a.b;
      }

      public xe d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
