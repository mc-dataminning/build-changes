import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gmm extends gml {
   static gmm.a a(GameProfile $$0, xw $$1, gmk $$2) {
      return new gmm.a($$0, $$1, $$2);
   }

   static gmm.b a(xg $$0, Instant $$1) {
      return new gmm.b($$0, $$1);
   }

   xg b();

   default xg c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xw d, gmk e) implements gmm {
      public static final MapCodec<gmm.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  azg.z.fieldOf("profile").forGetter(gmm.a::f), xw.a.forGetter(gmm.a::g), gmk.d.optionalFieldOf("trust_level", gmk.a).forGetter(gmm.a::h)
               )
               .apply($$0, gmm.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xg b() {
         if (!this.d.o().a()) {
            xg $$0 = this.d.o().b(this.d.c());
            return (xg)($$0 != null ? $$0 : xg.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xg c() {
         xg $$0 = this.b();
         xg $$1 = this.i();
         return xg.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xg d() {
         xg $$0 = this.i();
         return xg.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xg i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xg.b($$0.format(f)).a(o.u, o.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gml.a a() {
         return gml.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xw g() {
         return this.d;
      }

      public gmk h() {
         return this.e;
      }
   }

   public static record b(xg c, Instant d) implements gmm {
      public static final MapCodec<gmm.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xi.a.fieldOf("message").forGetter(gmm.b::d), azg.q.fieldOf("time_stamp").forGetter(gmm.b::e)).apply($$0, gmm.b::new)
      );

      @Override
      public xg b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gml.a a() {
         return gml.a.b;
      }

      public xg d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
