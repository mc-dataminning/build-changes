import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fwt extends fws {
   static fwt.a a(GameProfile $$0, xk $$1, fwr $$2) {
      return new fwt.a($$0, $$1, $$2);
   }

   static fwt.b a(wu $$0, Instant $$1) {
      return new fwt.b($$0, $$1);
   }

   wu b();

   default wu c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xk d, fwr e) implements fwt {
      public static final Codec<fwt.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.v.fieldOf("profile").forGetter(fwt.a::f), xk.a.forGetter(fwt.a::g), fwr.d.optionalFieldOf("trust_level", fwr.a).forGetter(fwt.a::h)
               )
               .apply($$0, fwt.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wu b() {
         if (!this.d.o().a()) {
            wu $$0 = this.d.o().b(this.d.c());
            return (wu)($$0 != null ? $$0 : wu.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wu c() {
         wu $$0 = this.b();
         wu $$1 = this.i();
         return wu.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wu d() {
         wu $$0 = this.i();
         return wu.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wu i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wu.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fws.a a() {
         return fws.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xk g() {
         return this.d;
      }

      public fwr h() {
         return this.e;
      }
   }

   public static record b(wu c, Instant d) implements fwt {
      public static final Codec<fwt.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(ww.a.fieldOf("message").forGetter(fwt.b::d), axh.m.fieldOf("time_stamp").forGetter(fwt.b::e)).apply($$0, fwt.b::new)
      );

      @Override
      public wu b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fws.a a() {
         return fws.a.b;
      }

      public wu d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
