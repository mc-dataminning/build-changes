import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gkp extends gko {
   static gkp.a a(GameProfile $$0, xo $$1, gkn $$2) {
      return new gkp.a($$0, $$1, $$2);
   }

   static gkp.b a(wy $$0, Instant $$1) {
      return new gkp.b($$0, $$1);
   }

   wy b();

   default wy c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xo d, gkn e) implements gkp {
      public static final MapCodec<gkp.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayu.z.fieldOf("profile").forGetter(gkp.a::f), xo.a.forGetter(gkp.a::g), gkn.d.optionalFieldOf("trust_level", gkn.a).forGetter(gkp.a::h)
               )
               .apply($$0, gkp.a::new)
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
      public gko.a a() {
         return gko.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xo g() {
         return this.d;
      }

      public gkn h() {
         return this.e;
      }
   }

   public static record b(wy c, Instant d) implements gkp {
      public static final MapCodec<gkp.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xa.a.fieldOf("message").forGetter(gkp.b::d), ayu.q.fieldOf("time_stamp").forGetter(gkp.b::e)).apply($$0, gkp.b::new)
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
      public gko.a a() {
         return gko.a.b;
      }

      public wy d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
