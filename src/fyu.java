import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fyu extends fyt {
   static fyu.a a(GameProfile $$0, yf $$1, fys $$2) {
      return new fyu.a($$0, $$1, $$2);
   }

   static fyu.b a(xp $$0, Instant $$1) {
      return new fyu.b($$0, $$1);
   }

   xp b();

   default xp c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, yf d, fys e) implements fyu {
      public static final MapCodec<fyu.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayh.x.fieldOf("profile").forGetter(fyu.a::f), yf.a.forGetter(fyu.a::g), fys.d.optionalFieldOf("trust_level", fys.a).forGetter(fyu.a::h)
               )
               .apply($$0, fyu.a::new)
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
      public fyt.a a() {
         return fyt.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public yf g() {
         return this.d;
      }

      public fys h() {
         return this.e;
      }
   }

   public static record b(xp c, Instant d) implements fyu {
      public static final MapCodec<fyu.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xr.a.fieldOf("message").forGetter(fyu.b::d), ayh.o.fieldOf("time_stamp").forGetter(fyu.b::e)).apply($$0, fyu.b::new)
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
      public fyt.a a() {
         return fyt.a.b;
      }

      public xp d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
