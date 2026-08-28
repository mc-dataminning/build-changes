import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface ggh extends ggg {
   static ggh.a a(GameProfile $$0, yl $$1, ggf $$2) {
      return new ggh.a($$0, $$1, $$2);
   }

   static ggh.b a(xv $$0, Instant $$1) {
      return new ggh.b($$0, $$1);
   }

   xv b();

   default xv c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, yl d, ggf e) implements ggh {
      public static final MapCodec<ggh.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  azn.z.fieldOf("profile").forGetter(ggh.a::f), yl.a.forGetter(ggh.a::g), ggf.d.optionalFieldOf("trust_level", ggf.a).forGetter(ggh.a::h)
               )
               .apply($$0, ggh.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xv b() {
         if (!this.d.o().a()) {
            xv $$0 = this.d.o().b(this.d.c());
            return (xv)($$0 != null ? $$0 : xv.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xv c() {
         xv $$0 = this.b();
         xv $$1 = this.i();
         return xv.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xv d() {
         xv $$0 = this.i();
         return xv.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xv i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xv.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public ggg.a a() {
         return ggg.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public yl g() {
         return this.d;
      }

      public ggf h() {
         return this.e;
      }
   }

   public static record b(xv c, Instant d) implements ggh {
      public static final MapCodec<ggh.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xx.a.fieldOf("message").forGetter(ggh.b::d), azn.q.fieldOf("time_stamp").forGetter(ggh.b::e)).apply($$0, ggh.b::new)
      );

      @Override
      public xv b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public ggg.a a() {
         return ggg.a.b;
      }

      public xv d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
