import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gga {
   private static final gga a = new gga("") {
      @Override
      public void a(fib $$0) {
      }

      @Override
      public void a(gga.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gga.b e;

   gga(String $$0) {
      this.d = fib.Q().q.toPath().resolve($$0);
   }

   public static gga a(@Nullable String $$0) {
      return $$0 == null ? a : new gga($$0);
   }

   public void a(gga.c $$0, String $$1, String $$2) {
      this.e = new gga.b($$0, $$1, $$2);
   }

   public void a(fib $$0) {
      if ($$0.r != null && this.e != null) {
         ad.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gga.a $$2 = new gga.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gga.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ad.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
               try {
                  Files.createDirectories(this.d.getParent());
                  Files.writeString(this.d, c.toJson($$0xx));
               } catch (IOException var3x) {
                  b.error("Failed to write to quickplay log file {}", this.d, var3x);
               }
            });
         });
      } else {
         b.error("Failed to log session for quickplay. Missing world data or gamemode");
      }
   }

   static record a(gga.b b, Instant c, ddp d) {
      public static final Codec<gga.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gga.b.a.forGetter(gga.a::a), ayl.o.fieldOf("lastPlayedTime").forGetter(gga.a::b), ddp.f.fieldOf("gamemode").forGetter(gga.a::c))
               .apply($$0, gga.a::new)
      );

      public gga.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public ddp c() {
         return this.d;
      }
   }

   static record b(gga.c b, String c, String d) {
      public static final MapCodec<gga.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gga.c.d.fieldOf("type").forGetter(gga.b::a), ayl.q.fieldOf("id").forGetter(gga.b::b), Codec.STRING.fieldOf("name").forGetter(gga.b::c)
               )
               .apply($$0, gga.b::new)
      );

      public gga.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azy {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gga.c> d = azy.a(gga.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
