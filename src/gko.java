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

public class gko {
   private static final gko a = new gko("") {
      @Override
      public void a(fmf $$0) {
      }

      @Override
      public void a(gko.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gko.b e;

   gko(String $$0) {
      this.d = fmf.Q().q.toPath().resolve($$0);
   }

   public static gko a(@Nullable String $$0) {
      return $$0 == null ? a : new gko($$0);
   }

   public void a(gko.c $$0, String $$1, String $$2) {
      this.e = new gko.b($$0, $$1, $$2);
   }

   public void a(fmf $$0) {
      if ($$0.r != null && this.e != null) {
         ae.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gko.a $$2 = new gko.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gko.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ae.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gko.b b, Instant c, dhe d) {
      public static final Codec<gko.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gko.b.a.forGetter(gko.a::a), azn.q.fieldOf("lastPlayedTime").forGetter(gko.a::b), dhe.f.fieldOf("gamemode").forGetter(gko.a::c))
               .apply($$0, gko.a::new)
      );

      public gko.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dhe c() {
         return this.d;
      }
   }

   static record b(gko.c b, String c, String d) {
      public static final MapCodec<gko.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gko.c.d.fieldOf("type").forGetter(gko.b::a), azn.s.fieldOf("id").forGetter(gko.b::b), Codec.STRING.fieldOf("name").forGetter(gko.b::c)
               )
               .apply($$0, gko.b::new)
      );

      public gko.c a() {
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

      static final Codec<gko.c> d = bba.a(gko.c::values);
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
