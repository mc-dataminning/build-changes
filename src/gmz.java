import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gmz extends gmy {
   static gmz.a a(GameProfile $$0, xq $$1, gmx $$2) {
      return new gmz.a($$0, $$1, $$2);
   }

   static gmz.b a(xa $$0, Instant $$1) {
      return new gmz.b($$0, $$1);
   }

   xa b();

   default xa c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xq d, gmx e) implements gmz {
      public static final MapCodec<gmz.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayw.z.fieldOf("profile").forGetter(gmz.a::f), xq.a.forGetter(gmz.a::g), gmx.d.optionalFieldOf("trust_level", gmx.a).forGetter(gmz.a::h)
               )
               .apply($$0, gmz.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xa b() {
         if (!this.d.o().a()) {
            xa $$0 = this.d.o().b(this.d.c());
            return (xa)($$0 != null ? $$0 : xa.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xa c() {
         xa $$0 = this.b();
         xa $$1 = this.i();
         return xa.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xa d() {
         xa $$0 = this.i();
         return xa.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xa i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xa.b($$0.format(f)).a(o.u, o.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gmy.a a() {
         return gmy.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xq g() {
         return this.d;
      }

      public gmx h() {
         return this.e;
      }
   }

   public static record b(xa c, Instant d) implements gmz {
      public static final MapCodec<gmz.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xc.a.fieldOf("message").forGetter(gmz.b::d), ayw.q.fieldOf("time_stamp").forGetter(gmz.b::e)).apply($$0, gmz.b::new)
      );

      @Override
      public xa b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gmy.a a() {
         return gmy.a.b;
      }

      public xa d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
