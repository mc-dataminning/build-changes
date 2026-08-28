import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface ggu extends ggt {
   static ggu.a a(GameProfile $$0, xe $$1, ggs $$2) {
      return new ggu.a($$0, $$1, $$2);
   }

   static ggu.b a(wo $$0, Instant $$1) {
      return new ggu.b($$0, $$1);
   }

   wo b();

   default wo c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, xe d, ggs e) implements ggu {
      public static final MapCodec<ggu.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ayh.z.fieldOf("profile").forGetter(ggu.a::f), xe.a.forGetter(ggu.a::g), ggs.d.optionalFieldOf("trust_level", ggs.a).forGetter(ggu.a::h)
               )
               .apply($$0, ggu.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public wo b() {
         if (!this.d.o().a()) {
            wo $$0 = this.d.o().b(this.d.c());
            return (wo)($$0 != null ? $$0 : wo.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public wo c() {
         wo $$0 = this.b();
         wo $$1 = this.i();
         return wo.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public wo d() {
         wo $$0 = this.i();
         return wo.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private wo i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return wo.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public ggt.a a() {
         return ggt.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public xe g() {
         return this.d;
      }

      public ggs h() {
         return this.e;
      }
   }

   public static record b(wo c, Instant d) implements ggu {
      public static final MapCodec<ggu.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(wq.a.fieldOf("message").forGetter(ggu.b::d), ayh.q.fieldOf("time_stamp").forGetter(ggu.b::e)).apply($$0, ggu.b::new)
      );

      @Override
      public wo b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public ggt.a a() {
         return ggt.a.b;
      }

      public wo d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
