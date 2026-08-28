import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gcu extends gct {
   static gcu.a a(GameProfile $$0, xx $$1, gcs $$2) {
      return new gcu.a($$0, $$1, $$2);
   }

   static gcu.b a(xh $$0, Instant $$1) {
      return new gcu.b($$0, $$1);
   }

   xh b();

   default xh c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xx d, gcs e) implements gcu {
      public static final MapCodec<gcu.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ays.z.fieldOf("profile").forGetter(gcu.a::f), xx.a.forGetter(gcu.a::g), gcs.d.optionalFieldOf("trust_level", gcs.a).forGetter(gcu.a::h)
               )
               .apply($$0, gcu.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xh b() {
         if (!this.d.o().a()) {
            xh $$0 = this.d.o().b(this.d.c());
            return (xh)($$0 != null ? $$0 : xh.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xh c() {
         xh $$0 = this.b();
         xh $$1 = this.i();
         return xh.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xh d() {
         xh $$0 = this.i();
         return xh.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xh i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xh.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gct.a a() {
         return gct.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xx g() {
         return this.d;
      }

      public gcs h() {
         return this.e;
      }
   }

   public static record b(xh c, Instant d) implements gcu {
      public static final MapCodec<gcu.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xj.a.fieldOf("message").forGetter(gcu.b::d), ays.q.fieldOf("time_stamp").forGetter(gcu.b::e)).apply($$0, gcu.b::new)
      );

      @Override
      public xh b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gct.a a() {
         return gct.a.b;
      }

      public xh d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
