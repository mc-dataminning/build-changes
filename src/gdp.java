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

public class gdp {
   private static final gdp a = new gdp("") {
      @Override
      public void a(ffw $$0) {
      }

      @Override
      public void a(gdp.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gdp.b e;

   gdp(String $$0) {
      this.d = ffw.Q().p.toPath().resolve($$0);
   }

   public static gdp a(@Nullable String $$0) {
      return $$0 == null ? a : new gdp($$0);
   }

   public void a(gdp.c $$0, String $$1, String $$2) {
      this.e = new gdp.b($$0, $$1, $$2);
   }

   public void a(ffw $$0) {
      if ($$0.q != null && this.e != null) {
         ac.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gdp.a $$2 = new gdp.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gdp.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gdp.b b, Instant c, dcd d) {
      public static final Codec<gdp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gdp.b.a.forGetter(gdp.a::a), axo.o.fieldOf("lastPlayedTime").forGetter(gdp.a::b), dcd.f.fieldOf("gamemode").forGetter(gdp.a::c))
               .apply($$0, gdp.a::new)
      );

      public gdp.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dcd c() {
         return this.d;
      }
   }

   static record b(gdp.c b, String c, String d) {
      public static final MapCodec<gdp.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gdp.c.d.fieldOf("type").forGetter(gdp.b::a), axo.q.fieldOf("id").forGetter(gdp.b::b), Codec.STRING.fieldOf("name").forGetter(gdp.b::c)
               )
               .apply($$0, gdp.b::new)
      );

      public gdp.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azc {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gdp.c> d = azc.a(gdp.c::values);
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
