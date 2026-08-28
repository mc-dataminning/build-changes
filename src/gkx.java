import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gkx extends gkw {
   static gkx.a a(GameProfile $$0, xo $$1, gkv $$2) {
      return new gkx.a($$0, $$1, $$2);
   }

   static gkx.b a(wy $$0, Instant $$1) {
      return new gkx.b($$0, $$1);
   }

   wy b();

   default wy c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xo d, gkv e) implements gkx {
      public static final MapCodec<gkx.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayu.z.fieldOf("profile").forGetter(gkx.a::f), xo.a.forGetter(gkx.a::g), gkv.d.optionalFieldOf("trust_level", gkv.a).forGetter(gkx.a::h)
               )
               .apply($$0, gkx.a::new)
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
         return wy.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gkw.a a() {
         return gkw.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xo g() {
         return this.d;
      }

      public gkv h() {
         return this.e;
      }
   }

   public static record b(wy c, Instant d) implements gkx {
      public static final MapCodec<gkx.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xa.a.fieldOf("message").forGetter(gkx.b::d), ayu.q.fieldOf("time_stamp").forGetter(gkx.b::e)).apply($$0, gkx.b::new)
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
      public gkw.a a() {
         return gkw.a.b;
      }

      public wy d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
