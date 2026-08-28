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

public class gha {
   private static final gha a = new gha("") {
      @Override
      public void a(fja $$0) {
      }

      @Override
      public void a(gha.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gha.b e;

   gha(String $$0) {
      this.d = fja.Q().q.toPath().resolve($$0);
   }

   public static gha a(@Nullable String $$0) {
      return $$0 == null ? a : new gha($$0);
   }

   public void a(gha.c $$0, String $$1, String $$2) {
      this.e = new gha.b($$0, $$1, $$2);
   }

   public void a(fja $$0) {
      if ($$0.r != null && this.e != null) {
         ad.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gha.a $$2 = new gha.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gha.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ad.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gha.b b, Instant c, des d) {
      public static final Codec<gha.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gha.b.a.forGetter(gha.a::a), ays.q.fieldOf("lastPlayedTime").forGetter(gha.a::b), des.f.fieldOf("gamemode").forGetter(gha.a::c))
               .apply($$0, gha.a::new)
      );

      public gha.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public des c() {
         return this.d;
      }
   }

   static record b(gha.c b, String c, String d) {
      public static final MapCodec<gha.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gha.c.d.fieldOf("type").forGetter(gha.b::a), ays.s.fieldOf("id").forGetter(gha.b::b), Codec.STRING.fieldOf("name").forGetter(gha.b::c)
               )
               .apply($$0, gha.b::new)
      );

      public gha.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements baf {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gha.c> d = baf.a(gha.c::values);
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
