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

public class gdn {
   private static final gdn a = new gdn("") {
      @Override
      public void a(fft $$0) {
      }

      @Override
      public void a(gdn.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gdn.b e;

   gdn(String $$0) {
      this.d = fft.Q().p.toPath().resolve($$0);
   }

   public static gdn a(@Nullable String $$0) {
      return $$0 == null ? a : new gdn($$0);
   }

   public void a(gdn.c $$0, String $$1, String $$2) {
      this.e = new gdn.b($$0, $$1, $$2);
   }

   public void a(fft $$0) {
      if ($$0.q != null && this.e != null) {
         ac.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gdn.a $$2 = new gdn.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gdn.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gdn.b b, Instant c, dcc d) {
      public static final Codec<gdn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gdn.b.a.forGetter(gdn.a::a), axo.o.fieldOf("lastPlayedTime").forGetter(gdn.a::b), dcc.f.fieldOf("gamemode").forGetter(gdn.a::c))
               .apply($$0, gdn.a::new)
      );

      public gdn.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dcc c() {
         return this.d;
      }
   }

   static record b(gdn.c b, String c, String d) {
      public static final MapCodec<gdn.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gdn.c.d.fieldOf("type").forGetter(gdn.b::a), axo.q.fieldOf("id").forGetter(gdn.b::b), Codec.STRING.fieldOf("name").forGetter(gdn.b::c)
               )
               .apply($$0, gdn.b::new)
      );

      public gdn.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azc {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gdn.c> d = azc.a(gdn.c::values);
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
