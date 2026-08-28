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

public class gib {
   private static final gib a = new gib("") {
      @Override
      public void a(fjx $$0) {
      }

      @Override
      public void a(gib.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gib.b e;

   gib(String $$0) {
      this.d = fjx.Q().q.toPath().resolve($$0);
   }

   public static gib a(@Nullable String $$0) {
      return $$0 == null ? a : new gib($$0);
   }

   public void a(gib.c $$0, String $$1, String $$2) {
      this.e = new gib.b($$0, $$1, $$2);
   }

   public void a(fjx $$0) {
      if ($$0.r != null && this.e != null) {
         ae.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gib.a $$2 = new gib.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gib.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ae.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gib.b b, Instant c, dfc d) {
      public static final Codec<gib.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gib.b.a.forGetter(gib.a::a), ayw.q.fieldOf("lastPlayedTime").forGetter(gib.a::b), dfc.f.fieldOf("gamemode").forGetter(gib.a::c))
               .apply($$0, gib.a::new)
      );

      public gib.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dfc c() {
         return this.d;
      }
   }

   static record b(gib.c b, String c, String d) {
      public static final MapCodec<gib.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gib.c.d.fieldOf("type").forGetter(gib.b::a), ayw.s.fieldOf("id").forGetter(gib.b::b), Codec.STRING.fieldOf("name").forGetter(gib.b::c)
               )
               .apply($$0, gib.b::new)
      );

      public gib.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements baj {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gib.c> d = baj.a(gib.c::values);
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
