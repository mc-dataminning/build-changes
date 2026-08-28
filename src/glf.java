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

public class glf {
   private static final glf a = new glf("") {
      @Override
      public void a(flk $$0) {
      }

      @Override
      public void a(glf.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private glf.b e;

   glf(String $$0) {
      this.d = flk.Q().q.toPath().resolve($$0);
   }

   public static glf a(@Nullable String $$0) {
      return $$0 == null ? a : new glf($$0);
   }

   public void a(glf.c $$0, String $$1, String $$2) {
      this.e = new glf.b($$0, $$1, $$2);
   }

   public void a(flk $$0) {
      if ($$0.r != null && this.e != null) {
         af.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            glf.a $$2 = new glf.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(glf.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(glf.b b, Instant c, dgg d) {
      public static final Codec<glf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(glf.b.a.forGetter(glf.a::a), ayi.q.fieldOf("lastPlayedTime").forGetter(glf.a::b), dgg.f.fieldOf("gamemode").forGetter(glf.a::c))
               .apply($$0, glf.a::new)
      );

      public glf.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dgg c() {
         return this.d;
      }
   }

   static record b(glf.c b, String c, String d) {
      public static final MapCodec<glf.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  glf.c.d.fieldOf("type").forGetter(glf.b::a), ayi.s.fieldOf("id").forGetter(glf.b::b), Codec.STRING.fieldOf("name").forGetter(glf.b::c)
               )
               .apply($$0, glf.b::new)
      );

      public glf.c a() {
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

      static final Codec<glf.c> d = azv.a(glf.c::values);
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
