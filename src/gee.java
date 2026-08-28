import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gee extends ged {
   static gee.a a(GameProfile $$0, xz $$1, gec $$2) {
      return new gee.a($$0, $$1, $$2);
   }

   static gee.b a(xj $$0, Instant $$1) {
      return new gee.b($$0, $$1);
   }

   xj b();

   default xj c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xz d, gec e) implements gee {
      public static final MapCodec<gee.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayv.z.fieldOf("profile").forGetter(gee.a::f), xz.a.forGetter(gee.a::g), gec.d.optionalFieldOf("trust_level", gec.a).forGetter(gee.a::h)
               )
               .apply($$0, gee.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xj b() {
         if (!this.d.o().a()) {
            xj $$0 = this.d.o().b(this.d.c());
            return (xj)($$0 != null ? $$0 : xj.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xj c() {
         xj $$0 = this.b();
         xj $$1 = this.i();
         return xj.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xj d() {
         xj $$0 = this.i();
         return xj.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xj i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xj.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public ged.a a() {
         return ged.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xz g() {
         return this.d;
      }

      public gec h() {
         return this.e;
      }
   }

   public static record b(xj c, Instant d) implements gee {
      public static final MapCodec<gee.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xl.a.fieldOf("message").forGetter(gee.b::d), ayv.q.fieldOf("time_stamp").forGetter(gee.b::e)).apply($$0, gee.b::new)
      );

      @Override
      public xj b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public ged.a a() {
         return ged.a.b;
      }

      public xj d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
