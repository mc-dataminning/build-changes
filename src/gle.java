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

public class gle {
   private static final gle a = new gle("") {
      @Override
      public void a(flj $$0) {
      }

      @Override
      public void a(gle.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gle.b e;

   gle(String $$0) {
      this.d = flj.Q().q.toPath().resolve($$0);
   }

   public static gle a(@Nullable String $$0) {
      return $$0 == null ? a : new gle($$0);
   }

   public void a(gle.c $$0, String $$1, String $$2) {
      this.e = new gle.b($$0, $$1, $$2);
   }

   public void a(flj $$0) {
      if ($$0.r != null && this.e != null) {
         af.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gle.a $$2 = new gle.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gle.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gle.b b, Instant c, dgf d) {
      public static final Codec<gle.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gle.b.a.forGetter(gle.a::a), ayi.q.fieldOf("lastPlayedTime").forGetter(gle.a::b), dgf.f.fieldOf("gamemode").forGetter(gle.a::c))
               .apply($$0, gle.a::new)
      );

      public gle.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dgf c() {
         return this.d;
      }
   }

   static record b(gle.c b, String c, String d) {
      public static final MapCodec<gle.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gle.c.d.fieldOf("type").forGetter(gle.b::a), ayi.s.fieldOf("id").forGetter(gle.b::b), Codec.STRING.fieldOf("name").forGetter(gle.b::c)
               )
               .apply($$0, gle.b::new)
      );

      public gle.c a() {
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

      static final Codec<gle.c> d = azv.a(gle.c::values);
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
