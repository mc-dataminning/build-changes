import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fvn extends fvm {
   static fvn.a a(GameProfile $$0, wy $$1, fvl $$2) {
      return new fvn.a($$0, $$1, $$2);
   }

   static fvn.b a(wi $$0, Instant $$1) {
      return new fvn.b($$0, $$1);
   }

   wi b();

   default wi c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, wy d, fvl e) implements fvn {
      public static final Codec<fvn.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.v.fieldOf("profile").forGetter(fvn.a::f), wy.a.forGetter(fvn.a::g), fvl.d.optionalFieldOf("trust_level", fvl.a).forGetter(fvn.a::h)
               )
               .apply($$0, fvn.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wi b() {
         if (!this.d.o().a()) {
            wi $$0 = this.d.o().b(this.d.c());
            return (wi)($$0 != null ? $$0 : wi.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wi c() {
         wi $$0 = this.b();
         wi $$1 = this.i();
         return wi.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wi d() {
         wi $$0 = this.i();
         return wi.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wi i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wi.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fvm.a a() {
         return fvm.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public wy g() {
         return this.d;
      }

      public fvl h() {
         return this.e;
      }
   }

   public static record b(wi c, Instant d) implements fvn {
      public static final Codec<fvn.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(wk.a.fieldOf("message").forGetter(fvn.b::d), awu.m.fieldOf("time_stamp").forGetter(fvn.b::e)).apply($$0, fvn.b::new)
      );

      @Override
      public wi b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fvm.a a() {
         return fvm.a.b;
      }

      public wi d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
