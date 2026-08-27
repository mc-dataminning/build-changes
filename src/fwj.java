import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fwj extends fwi {
   static fwj.a a(GameProfile $$0, xi $$1, fwh $$2) {
      return new fwj.a($$0, $$1, $$2);
   }

   static fwj.b a(ws $$0, Instant $$1) {
      return new fwj.b($$0, $$1);
   }

   ws b();

   default ws c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xi d, fwh e) implements fwj {
      public static final Codec<fwj.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.v.fieldOf("profile").forGetter(fwj.a::f), xi.a.forGetter(fwj.a::g), fwh.d.optionalFieldOf("trust_level", fwh.a).forGetter(fwj.a::h)
               )
               .apply($$0, fwj.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public ws b() {
         if (!this.d.o().a()) {
            ws $$0 = this.d.o().b(this.d.c());
            return (ws)($$0 != null ? $$0 : ws.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public ws c() {
         ws $$0 = this.b();
         ws $$1 = this.i();
         return ws.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public ws d() {
         ws $$0 = this.i();
         return ws.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private ws i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return ws.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fwi.a a() {
         return fwi.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xi g() {
         return this.d;
      }

      public fwh h() {
         return this.e;
      }
   }

   public static record b(ws c, Instant d) implements fwj {
      public static final Codec<fwj.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(wu.a.fieldOf("message").forGetter(fwj.b::d), axe.m.fieldOf("time_stamp").forGetter(fwj.b::e)).apply($$0, fwj.b::new)
      );

      @Override
      public ws b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fwi.a a() {
         return fwi.a.b;
      }

      public ws d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
