import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gnb extends gna {
   static gnb.a a(GameProfile $$0, xs $$1, gmz $$2) {
      return new gnb.a($$0, $$1, $$2);
   }

   static gnb.b a(xc $$0, Instant $$1) {
      return new gnb.b($$0, $$1);
   }

   xc b();

   default xc c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xs d, gmz e) implements gnb {
      public static final MapCodec<gnb.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayy.z.fieldOf("profile").forGetter(gnb.a::f), xs.a.forGetter(gnb.a::g), gmz.d.optionalFieldOf("trust_level", gmz.a).forGetter(gnb.a::h)
               )
               .apply($$0, gnb.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xc b() {
         if (!this.d.o().a()) {
            xc $$0 = this.d.o().b(this.d.c());
            return (xc)($$0 != null ? $$0 : xc.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xc c() {
         xc $$0 = this.b();
         xc $$1 = this.i();
         return xc.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xc d() {
         xc $$0 = this.i();
         return xc.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xc i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xc.b($$0.format(f)).a(o.u, o.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gna.a a() {
         return gna.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xs g() {
         return this.d;
      }

      public gmz h() {
         return this.e;
      }
   }

   public static record b(xc c, Instant d) implements gnb {
      public static final MapCodec<gnb.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xe.a.fieldOf("message").forGetter(gnb.b::d), ayy.q.fieldOf("time_stamp").forGetter(gnb.b::e)).apply($$0, gnb.b::new)
      );

      @Override
      public xc b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gna.a a() {
         return gna.a.b;
      }

      public xc d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
