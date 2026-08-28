import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gix extends giw {
   static gix.a a(GameProfile $$0, xl $$1, giv $$2) {
      return new gix.a($$0, $$1, $$2);
   }

   static gix.b a(wv $$0, Instant $$1) {
      return new gix.b($$0, $$1);
   }

   wv b();

   default wv c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xl d, giv e) implements gix {
      public static final MapCodec<gix.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ays.z.fieldOf("profile").forGetter(gix.a::f), xl.a.forGetter(gix.a::g), giv.d.optionalFieldOf("trust_level", giv.a).forGetter(gix.a::h)
               )
               .apply($$0, gix.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wv b() {
         if (!this.d.o().a()) {
            wv $$0 = this.d.o().b(this.d.c());
            return (wv)($$0 != null ? $$0 : wv.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wv c() {
         wv $$0 = this.b();
         wv $$1 = this.i();
         return wv.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wv d() {
         wv $$0 = this.i();
         return wv.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wv i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wv.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public giw.a a() {
         return giw.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xl g() {
         return this.d;
      }

      public giv h() {
         return this.e;
      }
   }

   public static record b(wv c, Instant d) implements gix {
      public static final MapCodec<gix.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(wx.a.fieldOf("message").forGetter(gix.b::d), ays.q.fieldOf("time_stamp").forGetter(gix.b::e)).apply($$0, gix.b::new)
      );

      @Override
      public wv b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public giw.a a() {
         return giw.a.b;
      }

      public wv d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
