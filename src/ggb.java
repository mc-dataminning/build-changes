import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface ggb extends gga {
   static ggb.a a(GameProfile $$0, yl $$1, gfz $$2) {
      return new ggb.a($$0, $$1, $$2);
   }

   static ggb.b a(xv $$0, Instant $$1) {
      return new ggb.b($$0, $$1);
   }

   xv b();

   default xv c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, yl d, gfz e) implements ggb {
      public static final MapCodec<ggb.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  azn.z.fieldOf("profile").forGetter(ggb.a::f), yl.a.forGetter(ggb.a::g), gfz.d.optionalFieldOf("trust_level", gfz.a).forGetter(ggb.a::h)
               )
               .apply($$0, ggb.a::new)
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
      public gga.a a() {
         return gga.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public yl g() {
         return this.d;
      }

      public gfz h() {
         return this.e;
      }
   }

   public static record b(xv c, Instant d) implements ggb {
      public static final MapCodec<ggb.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xx.a.fieldOf("message").forGetter(ggb.b::d), azn.q.fieldOf("time_stamp").forGetter(ggb.b::e)).apply($$0, ggb.b::new)
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
      public gga.a a() {
         return gga.a.b;
      }

      public xv d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
