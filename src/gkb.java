import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gkb extends gka {
   static gkb.a a(GameProfile $$0, xm $$1, gjz $$2) {
      return new gkb.a($$0, $$1, $$2);
   }

   static gkb.b a(ww $$0, Instant $$1) {
      return new gkb.b($$0, $$1);
   }

   ww b();

   default ww c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xm d, gjz e) implements gkb {
      public static final MapCodec<gkb.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ays.z.fieldOf("profile").forGetter(gkb.a::f), xm.a.forGetter(gkb.a::g), gjz.d.optionalFieldOf("trust_level", gjz.a).forGetter(gkb.a::h)
               )
               .apply($$0, gkb.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public ww b() {
         if (!this.d.o().a()) {
            ww $$0 = this.d.o().b(this.d.c());
            return (ww)($$0 != null ? $$0 : ww.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public ww c() {
         ww $$0 = this.b();
         ww $$1 = this.i();
         return ww.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public ww d() {
         ww $$0 = this.i();
         return ww.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private ww i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return ww.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gka.a a() {
         return gka.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xm g() {
         return this.d;
      }

      public gjz h() {
         return this.e;
      }
   }

   public static record b(ww c, Instant d) implements gkb {
      public static final MapCodec<gkb.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(wy.a.fieldOf("message").forGetter(gkb.b::d), ays.q.fieldOf("time_stamp").forGetter(gkb.b::e)).apply($$0, gkb.b::new)
      );

      @Override
      public ww b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gka.a a() {
         return gka.a.b;
      }

      public ww d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
