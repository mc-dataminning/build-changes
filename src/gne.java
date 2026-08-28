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

public class gne {
   private static final gne a = new gne("") {
      @Override
      public void a(fnd $$0) {
      }

      @Override
      public void a(gne.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gne.b e;

   gne(String $$0) {
      this.d = fnd.Q().q.toPath().resolve($$0);
   }

   public static gne a(@Nullable String $$0) {
      return $$0 == null ? a : new gne($$0);
   }

   public void a(gne.c $$0, String $$1, String $$2) {
      this.e = new gne.b($$0, $$1, $$2);
   }

   public void a(fnd $$0) {
      if ($$0.r != null && this.e != null) {
         af.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gne.a $$2 = new gne.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(gne.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gne.b b, Instant c, dhm d) {
      public static final Codec<gne.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gne.b.a.forGetter(gne.a::a), ays.q.fieldOf("lastPlayedTime").forGetter(gne.a::b), dhm.f.fieldOf("gamemode").forGetter(gne.a::c))
               .apply($$0, gne.a::new)
      );

      public gne.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dhm c() {
         return this.d;
      }
   }

   static record b(gne.c b, String c, String d) {
      public static final MapCodec<gne.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gne.c.d.fieldOf("type").forGetter(gne.b::a), ays.s.fieldOf("id").forGetter(gne.b::b), Codec.STRING.fieldOf("name").forGetter(gne.b::c)
               )
               .apply($$0, gne.b::new)
      );

      public gne.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bag {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gne.c> d = bag.a(gne.c::values);
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
