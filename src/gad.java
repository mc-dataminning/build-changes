import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gad extends gac {
   static gad.a a(GameProfile $$0, xp $$1, gab $$2) {
      return new gad.a($$0, $$1, $$2);
   }

   static gad.b a(wz $$0, Instant $$1) {
      return new gad.b($$0, $$1);
   }

   wz b();

   default wz c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xp d, gab e) implements gad {
      public static final MapCodec<gad.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  axw.x.fieldOf("profile").forGetter(gad.a::f), xp.a.forGetter(gad.a::g), gab.d.optionalFieldOf("trust_level", gab.a).forGetter(gad.a::h)
               )
               .apply($$0, gad.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wz b() {
         if (!this.d.o().a()) {
            wz $$0 = this.d.o().b(this.d.c());
            return (wz)($$0 != null ? $$0 : wz.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wz c() {
         wz $$0 = this.b();
         wz $$1 = this.i();
         return wz.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wz d() {
         wz $$0 = this.i();
         return wz.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wz i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wz.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gac.a a() {
         return gac.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xp g() {
         return this.d;
      }

      public gab h() {
         return this.e;
      }
   }

   public static record b(wz c, Instant d) implements gad {
      public static final MapCodec<gad.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xb.a.fieldOf("message").forGetter(gad.b::d), axw.o.fieldOf("time_stamp").forGetter(gad.b::e)).apply($$0, gad.b::new)
      );

      @Override
      public wz b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gac.a a() {
         return gac.a.b;
      }

      public wz d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
