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

public class gdh {
   private static final gdh a = new gdh("") {
      @Override
      public void a(ffn $$0) {
      }

      @Override
      public void a(gdh.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gdh.b e;

   gdh(String $$0) {
      this.d = ffn.Q().p.toPath().resolve($$0);
   }

   public static gdh a(@Nullable String $$0) {
      return $$0 == null ? a : new gdh($$0);
   }

   public void a(gdh.c $$0, String $$1, String $$2) {
      this.e = new gdh.b($$0, $$1, $$2);
   }

   public void a(ffn $$0) {
      if ($$0.q != null && this.e != null) {
         ac.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gdh.a $$2 = new gdh.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gdh.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gdh.b b, Instant c, dca d) {
      public static final Codec<gdh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gdh.b.a.forGetter(gdh.a::a), axm.o.fieldOf("lastPlayedTime").forGetter(gdh.a::b), dca.f.fieldOf("gamemode").forGetter(gdh.a::c))
               .apply($$0, gdh.a::new)
      );

      public gdh.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dca c() {
         return this.d;
      }
   }

   static record b(gdh.c b, String c, String d) {
      public static final MapCodec<gdh.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gdh.c.d.fieldOf("type").forGetter(gdh.b::a), axm.q.fieldOf("id").forGetter(gdh.b::b), Codec.STRING.fieldOf("name").forGetter(gdh.b::c)
               )
               .apply($$0, gdh.b::new)
      );

      public gdh.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements ayz {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gdh.c> d = ayz.a(gdh.c::values);
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
