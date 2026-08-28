import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface glo extends gln {
   static glo.a a(GameProfile $$0, xo $$1, glm $$2) {
      return new glo.a($$0, $$1, $$2);
   }

   static glo.b a(wy $$0, Instant $$1) {
      return new glo.b($$0, $$1);
   }

   wy b();

   default wy c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xo d, glm e) implements glo {
      public static final MapCodec<glo.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayu.z.fieldOf("profile").forGetter(glo.a::f), xo.a.forGetter(glo.a::g), glm.d.optionalFieldOf("trust_level", glm.a).forGetter(glo.a::h)
               )
               .apply($$0, glo.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wy b() {
         if (!this.d.o().a()) {
            wy $$0 = this.d.o().b(this.d.c());
            return (wy)($$0 != null ? $$0 : wy.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wy c() {
         wy $$0 = this.b();
         wy $$1 = this.i();
         return wy.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wy d() {
         wy $$0 = this.i();
         return wy.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wy i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wy.b($$0.format(f)).a(o.u, o.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gln.a a() {
         return gln.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xo g() {
         return this.d;
      }

      public glm h() {
         return this.e;
      }
   }

   public static record b(wy c, Instant d) implements glo {
      public static final MapCodec<glo.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xa.a.fieldOf("message").forGetter(glo.b::d), ayu.q.fieldOf("time_stamp").forGetter(glo.b::e)).apply($$0, glo.b::new)
      );

      @Override
      public wy b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gln.a a() {
         return gln.a.b;
      }

      public wy d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
