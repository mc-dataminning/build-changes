import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gcj extends gci {
   static gcj.a a(GameProfile $$0, xu $$1, gch $$2) {
      return new gcj.a($$0, $$1, $$2);
   }

   static gcj.b a(xe $$0, Instant $$1) {
      return new gcj.b($$0, $$1);
   }

   xe b();

   default xe c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xu d, gch e) implements gcj {
      public static final MapCodec<gcj.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayo.y.fieldOf("profile").forGetter(gcj.a::f), xu.a.forGetter(gcj.a::g), gch.d.optionalFieldOf("trust_level", gch.a).forGetter(gcj.a::h)
               )
               .apply($$0, gcj.a::new)
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
      public gci.a a() {
         return gci.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xu g() {
         return this.d;
      }

      public gch h() {
         return this.e;
      }
   }

   public static record b(xe c, Instant d) implements gcj {
      public static final MapCodec<gcj.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xg.a.fieldOf("message").forGetter(gcj.b::d), ayo.p.fieldOf("time_stamp").forGetter(gcj.b::e)).apply($$0, gcj.b::new)
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
      public gci.a a() {
         return gci.a.b;
      }

      public xe d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
