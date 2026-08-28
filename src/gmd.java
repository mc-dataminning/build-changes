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

public class gmd {
   private static final gmd a = new gmd("") {
      @Override
      public void a(fmg $$0) {
      }

      @Override
      public void a(gmd.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gmd.b e;

   gmd(String $$0) {
      this.d = fmg.Q().q.toPath().resolve($$0);
   }

   public static gmd a(@Nullable String $$0) {
      return $$0 == null ? a : new gmd($$0);
   }

   public void a(gmd.c $$0, String $$1, String $$2) {
      this.e = new gmd.b($$0, $$1, $$2);
   }

   public void a(fmg $$0) {
      if ($$0.r != null && this.e != null) {
         af.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gmd.a $$2 = new gmd.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(gmd.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gmd.b b, Instant c, dgw d) {
      public static final Codec<gmd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gmd.b.a.forGetter(gmd.a::a), ayi.q.fieldOf("lastPlayedTime").forGetter(gmd.a::b), dgw.f.fieldOf("gamemode").forGetter(gmd.a::c))
               .apply($$0, gmd.a::new)
      );

      public gmd.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dgw c() {
         return this.d;
      }
   }

   static record b(gmd.c b, String c, String d) {
      public static final MapCodec<gmd.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gmd.c.d.fieldOf("type").forGetter(gmd.b::a), ayi.s.fieldOf("id").forGetter(gmd.b::b), Codec.STRING.fieldOf("name").forGetter(gmd.b::c)
               )
               .apply($$0, gmd.b::new)
      );

      public gmd.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azv {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gmd.c> d = azv.a(gmd.c::values);
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
