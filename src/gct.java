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

public class gct {
   private static final gct a = new gct("") {
      @Override
      public void a(ffa $$0) {
      }

      @Override
      public void a(gct.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gct.b e;

   gct(String $$0) {
      this.d = ffa.Q().p.toPath().resolve($$0);
   }

   public static gct a(@Nullable String $$0) {
      return $$0 == null ? a : new gct($$0);
   }

   public void a(gct.c $$0, String $$1, String $$2) {
      this.e = new gct.b($$0, $$1, $$2);
   }

   public void a(ffa $$0) {
      if ($$0.q != null && this.e != null) {
         ac.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gct.a $$2 = new gct.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gct.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gct.b b, Instant c, dbq d) {
      public static final Codec<gct.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gct.b.a.forGetter(gct.a::a), ayc.o.fieldOf("lastPlayedTime").forGetter(gct.a::b), dbq.f.fieldOf("gamemode").forGetter(gct.a::c))
               .apply($$0, gct.a::new)
      );

      public gct.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dbq c() {
         return this.d;
      }
   }

   static record b(gct.c b, String c, String d) {
      public static final MapCodec<gct.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gct.c.d.fieldOf("type").forGetter(gct.b::a), ayc.q.fieldOf("id").forGetter(gct.b::b), Codec.STRING.fieldOf("name").forGetter(gct.b::c)
               )
               .apply($$0, gct.b::new)
      );

      public gct.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azp {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gct.c> d = azp.a(gct.c::values);
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
