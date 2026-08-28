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

public class gox {
   private static final gox a = new gox("") {
      @Override
      public void a(fos $$0) {
      }

      @Override
      public void a(gox.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gox.b e;

   gox(String $$0) {
      this.d = fos.Q().q.toPath().resolve($$0);
   }

   public static gox a(@Nullable String $$0) {
      return $$0 == null ? a : new gox($$0);
   }

   public void a(gox.c $$0, String $$1, String $$2) {
      this.e = new gox.b($$0, $$1, $$2);
   }

   public void a(fos $$0) {
      if ($$0.r != null && this.e != null) {
         af.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gox.a $$2 = new gox.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(gox.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gox.b b, Instant c, dis d) {
      public static final Codec<gox.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gox.b.a.forGetter(gox.a::a), ayu.q.fieldOf("lastPlayedTime").forGetter(gox.a::b), dis.f.fieldOf("gamemode").forGetter(gox.a::c))
               .apply($$0, gox.a::new)
      );

      public gox.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dis c() {
         return this.d;
      }
   }

   static record b(gox.c b, String c, String d) {
      public static final MapCodec<gox.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gox.c.d.fieldOf("type").forGetter(gox.b::a), ayu.s.fieldOf("id").forGetter(gox.b::b), Codec.STRING.fieldOf("name").forGetter(gox.b::c)
               )
               .apply($$0, gox.b::new)
      );

      public gox.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bak {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gox.c> d = bak.a(gox.c::values);
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
