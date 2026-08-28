import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface ghw extends ghv {
   static ghw.a a(GameProfile $$0, xf $$1, ghu $$2) {
      return new ghw.a($$0, $$1, $$2);
   }

   static ghw.b a(wp $$0, Instant $$1) {
      return new ghw.b($$0, $$1);
   }

   wp b();

   default wp c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xf d, ghu e) implements ghw {
      public static final MapCodec<ghw.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayi.z.fieldOf("profile").forGetter(ghw.a::f), xf.a.forGetter(ghw.a::g), ghu.d.optionalFieldOf("trust_level", ghu.a).forGetter(ghw.a::h)
               )
               .apply($$0, ghw.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wp b() {
         if (!this.d.o().a()) {
            wp $$0 = this.d.o().b(this.d.c());
            return (wp)($$0 != null ? $$0 : wp.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wp c() {
         wp $$0 = this.b();
         wp $$1 = this.i();
         return wp.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wp d() {
         wp $$0 = this.i();
         return wp.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wp i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wp.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public ghv.a a() {
         return ghv.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xf g() {
         return this.d;
      }

      public ghu h() {
         return this.e;
      }
   }

   public static record b(wp c, Instant d) implements ghw {
      public static final MapCodec<ghw.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(wr.a.fieldOf("message").forGetter(ghw.b::d), ayi.q.fieldOf("time_stamp").forGetter(ghw.b::e)).apply($$0, ghw.b::new)
      );

      @Override
      public wp b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public ghv.a a() {
         return ghv.a.b;
      }

      public wp d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
