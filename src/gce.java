import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gce extends gcd {
   static gce.a a(GameProfile $$0, xt $$1, gcc $$2) {
      return new gce.a($$0, $$1, $$2);
   }

   static gce.b a(xd $$0, Instant $$1) {
      return new gce.b($$0, $$1);
   }

   xd b();

   default xd c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xt d, gcc e) implements gce {
      public static final MapCodec<gce.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  aym.y.fieldOf("profile").forGetter(gce.a::f), xt.a.forGetter(gce.a::g), gcc.d.optionalFieldOf("trust_level", gcc.a).forGetter(gce.a::h)
               )
               .apply($$0, gce.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xd b() {
         if (!this.d.o().a()) {
            xd $$0 = this.d.o().b(this.d.c());
            return (xd)($$0 != null ? $$0 : xd.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xd c() {
         xd $$0 = this.b();
         xd $$1 = this.i();
         return xd.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xd d() {
         xd $$0 = this.i();
         return xd.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xd i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xd.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gcd.a a() {
         return gcd.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xt g() {
         return this.d;
      }

      public gcc h() {
         return this.e;
      }
   }

   public static record b(xd c, Instant d) implements gce {
      public static final MapCodec<gce.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xf.a.fieldOf("message").forGetter(gce.b::d), aym.p.fieldOf("time_stamp").forGetter(gce.b::e)).apply($$0, gce.b::new)
      );

      @Override
      public xd b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gcd.a a() {
         return gcd.a.b;
      }

      public xd d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
