import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fyr extends fyq {
   static fyr.a a(GameProfile $$0, ye $$1, fyp $$2) {
      return new fyr.a($$0, $$1, $$2);
   }

   static fyr.b a(xo $$0, Instant $$1) {
      return new fyr.b($$0, $$1);
   }

   xo b();

   default xo c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, ye d, fyp e) implements fyr {
      public static final MapCodec<fyr.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayg.x.fieldOf("profile").forGetter(fyr.a::f), ye.a.forGetter(fyr.a::g), fyp.d.optionalFieldOf("trust_level", fyp.a).forGetter(fyr.a::h)
               )
               .apply($$0, fyr.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xo b() {
         if (!this.d.o().a()) {
            xo $$0 = this.d.o().b(this.d.c());
            return (xo)($$0 != null ? $$0 : xo.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xo c() {
         xo $$0 = this.b();
         xo $$1 = this.i();
         return xo.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xo d() {
         xo $$0 = this.i();
         return xo.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xo i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xo.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fyq.a a() {
         return fyq.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public ye g() {
         return this.d;
      }

      public fyp h() {
         return this.e;
      }
   }

   public static record b(xo c, Instant d) implements fyr {
      public static final MapCodec<fyr.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xq.a.fieldOf("message").forGetter(fyr.b::d), ayg.o.fieldOf("time_stamp").forGetter(fyr.b::e)).apply($$0, fyr.b::new)
      );

      @Override
      public xo b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fyq.a a() {
         return fyq.a.b;
      }

      public xo d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
