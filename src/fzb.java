import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fzb extends fza {
   static fzb.a a(GameProfile $$0, xk $$1, fyz $$2) {
      return new fzb.a($$0, $$1, $$2);
   }

   static fzb.b a(wu $$0, Instant $$1) {
      return new fzb.b($$0, $$1);
   }

   wu b();

   default wu c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xk d, fyz e) implements fzb {
      public static final MapCodec<fzb.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  axm.x.fieldOf("profile").forGetter(fzb.a::f), xk.a.forGetter(fzb.a::g), fyz.d.optionalFieldOf("trust_level", fyz.a).forGetter(fzb.a::h)
               )
               .apply($$0, fzb.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wu b() {
         if (!this.d.o().a()) {
            wu $$0 = this.d.o().b(this.d.c());
            return (wu)($$0 != null ? $$0 : wu.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wu c() {
         wu $$0 = this.b();
         wu $$1 = this.i();
         return wu.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wu d() {
         wu $$0 = this.i();
         return wu.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wu i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wu.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fza.a a() {
         return fza.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xk g() {
         return this.d;
      }

      public fyz h() {
         return this.e;
      }
   }

   public static record b(wu c, Instant d) implements fzb {
      public static final MapCodec<fzb.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ww.a.fieldOf("message").forGetter(fzb.b::d), axm.o.fieldOf("time_stamp").forGetter(fzb.b::e)).apply($$0, fzb.b::new)
      );

      @Override
      public wu b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fza.a a() {
         return fza.a.b;
      }

      public wu d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
