import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fyt extends fys {
   static fyt.a a(GameProfile $$0, yf $$1, fyr $$2) {
      return new fyt.a($$0, $$1, $$2);
   }

   static fyt.b a(xp $$0, Instant $$1) {
      return new fyt.b($$0, $$1);
   }

   xp b();

   default xp c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, yf d, fyr e) implements fyt {
      public static final MapCodec<fyt.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayh.x.fieldOf("profile").forGetter(fyt.a::f), yf.a.forGetter(fyt.a::g), fyr.d.optionalFieldOf("trust_level", fyr.a).forGetter(fyt.a::h)
               )
               .apply($$0, fyt.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xp b() {
         if (!this.d.o().a()) {
            xp $$0 = this.d.o().b(this.d.c());
            return (xp)($$0 != null ? $$0 : xp.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xp c() {
         xp $$0 = this.b();
         xp $$1 = this.i();
         return xp.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xp d() {
         xp $$0 = this.i();
         return xp.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xp i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xp.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fys.a a() {
         return fys.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public yf g() {
         return this.d;
      }

      public fyr h() {
         return this.e;
      }
   }

   public static record b(xp c, Instant d) implements fyt {
      public static final MapCodec<fyt.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xr.a.fieldOf("message").forGetter(fyt.b::d), ayh.o.fieldOf("time_stamp").forGetter(fyt.b::e)).apply($$0, fyt.b::new)
      );

      @Override
      public xp b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fys.a a() {
         return fys.a.b;
      }

      public xp d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
