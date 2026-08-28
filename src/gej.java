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

public class gej {
   private static final gej a = new gej("") {
      @Override
      public void a(fgo $$0) {
      }

      @Override
      public void a(gej.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gej.b e;

   gej(String $$0) {
      this.d = fgo.Q().p.toPath().resolve($$0);
   }

   public static gej a(@Nullable String $$0) {
      return $$0 == null ? a : new gej($$0);
   }

   public void a(gej.c $$0, String $$1, String $$2) {
      this.e = new gej.b($$0, $$1, $$2);
   }

   public void a(fgo $$0) {
      if ($$0.q != null && this.e != null) {
         ad.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gej.a $$2 = new gej.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gej.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ad.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gej.b b, Instant c, dct d) {
      public static final Codec<gej.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gej.b.a.forGetter(gej.a::a), axw.o.fieldOf("lastPlayedTime").forGetter(gej.a::b), dct.f.fieldOf("gamemode").forGetter(gej.a::c))
               .apply($$0, gej.a::new)
      );

      public gej.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dct c() {
         return this.d;
      }
   }

   static record b(gej.c b, String c, String d) {
      public static final MapCodec<gej.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gej.c.d.fieldOf("type").forGetter(gej.b::a), axw.q.fieldOf("id").forGetter(gej.b::b), Codec.STRING.fieldOf("name").forGetter(gej.b::c)
               )
               .apply($$0, gej.b::new)
      );

      public gej.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azk {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gej.c> d = azk.a(gej.c::values);
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
