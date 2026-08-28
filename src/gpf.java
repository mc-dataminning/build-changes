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

public class gpf {
   private static final gpf a = new gpf("") {
      @Override
      public void a(foz $$0) {
      }

      @Override
      public void a(gpf.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gpf.b e;

   gpf(String $$0) {
      this.d = foz.Q().q.toPath().resolve($$0);
   }

   public static gpf a(@Nullable String $$0) {
      return $$0 == null ? a : new gpf($$0);
   }

   public void a(gpf.c $$0, String $$1, String $$2) {
      this.e = new gpf.b($$0, $$1, $$2);
   }

   public void a(foz $$0) {
      if ($$0.r != null && this.e != null) {
         af.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gpf.a $$2 = new gpf.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(gpf.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gpf.b b, Instant c, dix d) {
      public static final Codec<gpf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gpf.b.a.forGetter(gpf.a::a), ayu.q.fieldOf("lastPlayedTime").forGetter(gpf.a::b), dix.f.fieldOf("gamemode").forGetter(gpf.a::c))
               .apply($$0, gpf.a::new)
      );

      public gpf.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dix c() {
         return this.d;
      }
   }

   static record b(gpf.c b, String c, String d) {
      public static final MapCodec<gpf.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gpf.c.d.fieldOf("type").forGetter(gpf.b::a), ayu.s.fieldOf("id").forGetter(gpf.b::b), Codec.STRING.fieldOf("name").forGetter(gpf.b::c)
               )
               .apply($$0, gpf.b::new)
      );

      public gpf.c a() {
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

      static final Codec<gpf.c> d = bak.a(gpf.c::values);
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
