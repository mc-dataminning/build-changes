import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface ggd extends ggc {
   static ggd.a a(GameProfile $$0, ya $$1, ggb $$2) {
      return new ggd.a($$0, $$1, $$2);
   }

   static ggd.b a(xk $$0, Instant $$1) {
      return new ggd.b($$0, $$1);
   }

   xk b();

   default xk c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, ya d, ggb e) implements ggd {
      public static final MapCodec<ggd.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  azd.z.fieldOf("profile").forGetter(ggd.a::f), ya.a.forGetter(ggd.a::g), ggb.d.optionalFieldOf("trust_level", ggb.a).forGetter(ggd.a::h)
               )
               .apply($$0, ggd.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xk b() {
         if (!this.d.o().a()) {
            xk $$0 = this.d.o().b(this.d.c());
            return (xk)($$0 != null ? $$0 : xk.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xk c() {
         xk $$0 = this.b();
         xk $$1 = this.i();
         return xk.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xk d() {
         xk $$0 = this.i();
         return xk.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xk i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xk.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public ggc.a a() {
         return ggc.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public ya g() {
         return this.d;
      }

      public ggb h() {
         return this.e;
      }
   }

   public static record b(xk c, Instant d) implements ggd {
      public static final MapCodec<ggd.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xm.a.fieldOf("message").forGetter(ggd.b::d), azd.q.fieldOf("time_stamp").forGetter(ggd.b::e)).apply($$0, ggd.b::new)
      );

      @Override
      public xk b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public ggc.a a() {
         return ggc.a.b;
      }

      public xk d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
