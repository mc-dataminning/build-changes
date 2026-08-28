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

public class gkk {
   private static final gkk a = new gkk("") {
      @Override
      public void a(flz $$0) {
      }

      @Override
      public void a(gkk.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gkk.b e;

   gkk(String $$0) {
      this.d = flz.Q().q.toPath().resolve($$0);
   }

   public static gkk a(@Nullable String $$0) {
      return $$0 == null ? a : new gkk($$0);
   }

   public void a(gkk.c $$0, String $$1, String $$2) {
      this.e = new gkk.b($$0, $$1, $$2);
   }

   public void a(flz $$0) {
      if ($$0.r != null && this.e != null) {
         ae.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gkk.a $$2 = new gkk.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gkk.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ae.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gkk.b b, Instant c, dgw d) {
      public static final Codec<gkk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gkk.b.a.forGetter(gkk.a::a), azd.q.fieldOf("lastPlayedTime").forGetter(gkk.a::b), dgw.f.fieldOf("gamemode").forGetter(gkk.a::c))
               .apply($$0, gkk.a::new)
      );

      public gkk.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dgw c() {
         return this.d;
      }
   }

   static record b(gkk.c b, String c, String d) {
      public static final MapCodec<gkk.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gkk.c.d.fieldOf("type").forGetter(gkk.b::a), azd.s.fieldOf("id").forGetter(gkk.b::b), Codec.STRING.fieldOf("name").forGetter(gkk.b::c)
               )
               .apply($$0, gkk.b::new)
      );

      public gkk.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements baq {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gkk.c> d = baq.a(gkk.c::values);
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
