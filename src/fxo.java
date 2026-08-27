import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fxo extends fxn {
   static fxo.a a(GameProfile $$0, xn $$1, fxm $$2) {
      return new fxo.a($$0, $$1, $$2);
   }

   static fxo.b a(wx $$0, Instant $$1) {
      return new fxo.b($$0, $$1);
   }

   wx b();

   default wx c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xn d, fxm e) implements fxo {
      public static final MapCodec<fxo.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  axn.v.fieldOf("profile").forGetter(fxo.a::f), xn.a.forGetter(fxo.a::g), fxm.d.optionalFieldOf("trust_level", fxm.a).forGetter(fxo.a::h)
               )
               .apply($$0, fxo.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wx b() {
         if (!this.d.o().a()) {
            wx $$0 = this.d.o().b(this.d.c());
            return (wx)($$0 != null ? $$0 : wx.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wx c() {
         wx $$0 = this.b();
         wx $$1 = this.i();
         return wx.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wx d() {
         wx $$0 = this.i();
         return wx.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wx i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wx.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fxn.a a() {
         return fxn.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xn g() {
         return this.d;
      }

      public fxm h() {
         return this.e;
      }
   }

   public static record b(wx c, Instant d) implements fxo {
      public static final MapCodec<fxo.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(wz.a.fieldOf("message").forGetter(fxo.b::d), axn.m.fieldOf("time_stamp").forGetter(fxo.b::e)).apply($$0, fxo.b::new)
      );

      @Override
      public wx b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fxn.a a() {
         return fxn.a.b;
      }

      public wx d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
