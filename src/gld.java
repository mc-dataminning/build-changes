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

public class gld {
   private static final gld a = new gld("") {
      @Override
      public void a(fli $$0) {
      }

      @Override
      public void a(gld.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gld.b e;

   gld(String $$0) {
      this.d = fli.Q().q.toPath().resolve($$0);
   }

   public static gld a(@Nullable String $$0) {
      return $$0 == null ? a : new gld($$0);
   }

   public void a(gld.c $$0, String $$1, String $$2) {
      this.e = new gld.b($$0, $$1, $$2);
   }

   public void a(fli $$0) {
      if ($$0.r != null && this.e != null) {
         af.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gld.a $$2 = new gld.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gld.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gld.b b, Instant c, dge d) {
      public static final Codec<gld.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gld.b.a.forGetter(gld.a::a), ayi.q.fieldOf("lastPlayedTime").forGetter(gld.a::b), dge.f.fieldOf("gamemode").forGetter(gld.a::c))
               .apply($$0, gld.a::new)
      );

      public gld.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dge c() {
         return this.d;
      }
   }

   static record b(gld.c b, String c, String d) {
      public static final MapCodec<gld.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gld.c.d.fieldOf("type").forGetter(gld.b::a), ayi.s.fieldOf("id").forGetter(gld.b::b), Codec.STRING.fieldOf("name").forGetter(gld.b::c)
               )
               .apply($$0, gld.b::new)
      );

      public gld.c a() {
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

      static final Codec<gld.c> d = azv.a(gld.c::values);
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
