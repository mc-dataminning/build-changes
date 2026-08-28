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

public class gki {
   private static final gki a = new gki("") {
      @Override
      public void a(flz $$0) {
      }

      @Override
      public void a(gki.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gki.b e;

   gki(String $$0) {
      this.d = flz.Q().q.toPath().resolve($$0);
   }

   public static gki a(@Nullable String $$0) {
      return $$0 == null ? a : new gki($$0);
   }

   public void a(gki.c $$0, String $$1, String $$2) {
      this.e = new gki.b($$0, $$1, $$2);
   }

   public void a(flz $$0) {
      if ($$0.r != null && this.e != null) {
         ae.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gki.a $$2 = new gki.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gki.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ae.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gki.b b, Instant c, dgx d) {
      public static final Codec<gki.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gki.b.a.forGetter(gki.a::a), azn.q.fieldOf("lastPlayedTime").forGetter(gki.a::b), dgx.f.fieldOf("gamemode").forGetter(gki.a::c))
               .apply($$0, gki.a::new)
      );

      public gki.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dgx c() {
         return this.d;
      }
   }

   static record b(gki.c b, String c, String d) {
      public static final MapCodec<gki.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gki.c.d.fieldOf("type").forGetter(gki.b::a), azn.s.fieldOf("id").forGetter(gki.b::b), Codec.STRING.fieldOf("name").forGetter(gki.b::c)
               )
               .apply($$0, gki.b::new)
      );

      public gki.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bba {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gki.c> d = bba.a(gki.c::values);
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
