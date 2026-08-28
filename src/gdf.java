import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gdf extends gde {
   static gdf.a a(GameProfile $$0, xy $$1, gdd $$2) {
      return new gdf.a($$0, $$1, $$2);
   }

   static gdf.b a(xi $$0, Instant $$1) {
      return new gdf.b($$0, $$1);
   }

   xi b();

   default xi c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xy d, gdd e) implements gdf {
      public static final MapCodec<gdf.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayt.z.fieldOf("profile").forGetter(gdf.a::f), xy.a.forGetter(gdf.a::g), gdd.d.optionalFieldOf("trust_level", gdd.a).forGetter(gdf.a::h)
               )
               .apply($$0, gdf.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xi b() {
         if (!this.d.o().a()) {
            xi $$0 = this.d.o().b(this.d.c());
            return (xi)($$0 != null ? $$0 : xi.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xi c() {
         xi $$0 = this.b();
         xi $$1 = this.i();
         return xi.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xi d() {
         xi $$0 = this.i();
         return xi.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xi i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xi.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gde.a a() {
         return gde.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xy g() {
         return this.d;
      }

      public gdd h() {
         return this.e;
      }
   }

   public static record b(xi c, Instant d) implements gdf {
      public static final MapCodec<gdf.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xk.a.fieldOf("message").forGetter(gdf.b::d), ayt.q.fieldOf("time_stamp").forGetter(gdf.b::e)).apply($$0, gdf.b::new)
      );

      @Override
      public xi b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gde.a a() {
         return gde.a.b;
      }

      public xi d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
