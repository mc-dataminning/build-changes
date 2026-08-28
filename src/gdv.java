import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gdv extends gdu {
   static gdv.a a(GameProfile $$0, yb $$1, gdt $$2) {
      return new gdv.a($$0, $$1, $$2);
   }

   static gdv.b a(xl $$0, Instant $$1) {
      return new gdv.b($$0, $$1);
   }

   xl b();

   default xl c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, yb d, gdt e) implements gdv {
      public static final MapCodec<gdv.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayw.z.fieldOf("profile").forGetter(gdv.a::f), yb.a.forGetter(gdv.a::g), gdt.d.optionalFieldOf("trust_level", gdt.a).forGetter(gdv.a::h)
               )
               .apply($$0, gdv.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xl b() {
         if (!this.d.o().a()) {
            xl $$0 = this.d.o().b(this.d.c());
            return (xl)($$0 != null ? $$0 : xl.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xl c() {
         xl $$0 = this.b();
         xl $$1 = this.i();
         return xl.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xl d() {
         xl $$0 = this.i();
         return xl.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xl i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xl.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gdu.a a() {
         return gdu.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public yb g() {
         return this.d;
      }

      public gdt h() {
         return this.e;
      }
   }

   public static record b(xl c, Instant d) implements gdv {
      public static final MapCodec<gdv.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xn.a.fieldOf("message").forGetter(gdv.b::d), ayw.q.fieldOf("time_stamp").forGetter(gdv.b::e)).apply($$0, gdv.b::new)
      );

      @Override
      public xl b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gdu.a a() {
         return gdu.a.b;
      }

      public xl d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
