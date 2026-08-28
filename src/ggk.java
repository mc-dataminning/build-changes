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

public class ggk {
   private static final ggk a = new ggk("") {
      @Override
      public void a(fil $$0) {
      }

      @Override
      public void a(ggk.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private ggk.b e;

   ggk(String $$0) {
      this.d = fil.Q().q.toPath().resolve($$0);
   }

   public static ggk a(@Nullable String $$0) {
      return $$0 == null ? a : new ggk($$0);
   }

   public void a(ggk.c $$0, String $$1, String $$2) {
      this.e = new ggk.b($$0, $$1, $$2);
   }

   public void a(fil $$0) {
      if ($$0.r != null && this.e != null) {
         ad.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            ggk.a $$2 = new ggk.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(ggk.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ad.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(ggk.b b, Instant c, ded d) {
      public static final Codec<ggk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ggk.b.a.forGetter(ggk.a::a), aym.p.fieldOf("lastPlayedTime").forGetter(ggk.a::b), ded.f.fieldOf("gamemode").forGetter(ggk.a::c))
               .apply($$0, ggk.a::new)
      );

      public ggk.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public ded c() {
         return this.d;
      }
   }

   static record b(ggk.c b, String c, String d) {
      public static final MapCodec<ggk.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ggk.c.d.fieldOf("type").forGetter(ggk.b::a), aym.r.fieldOf("id").forGetter(ggk.b::b), Codec.STRING.fieldOf("name").forGetter(ggk.b::c)
               )
               .apply($$0, ggk.b::new)
      );

      public ggk.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azz {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<ggk.c> d = azz.a(ggk.c::values);
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
