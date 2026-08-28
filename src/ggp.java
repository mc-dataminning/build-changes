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

public class ggp {
   private static final ggp a = new ggp("") {
      @Override
      public void a(fip $$0) {
      }

      @Override
      public void a(ggp.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private ggp.b e;

   ggp(String $$0) {
      this.d = fip.Q().q.toPath().resolve($$0);
   }

   public static ggp a(@Nullable String $$0) {
      return $$0 == null ? a : new ggp($$0);
   }

   public void a(ggp.c $$0, String $$1, String $$2) {
      this.e = new ggp.b($$0, $$1, $$2);
   }

   public void a(fip $$0) {
      if ($$0.r != null && this.e != null) {
         ad.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            ggp.a $$2 = new ggp.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(ggp.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ad.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(ggp.b b, Instant c, deg d) {
      public static final Codec<ggp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ggp.b.a.forGetter(ggp.a::a), ayo.p.fieldOf("lastPlayedTime").forGetter(ggp.a::b), deg.f.fieldOf("gamemode").forGetter(ggp.a::c))
               .apply($$0, ggp.a::new)
      );

      public ggp.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public deg c() {
         return this.d;
      }
   }

   static record b(ggp.c b, String c, String d) {
      public static final MapCodec<ggp.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ggp.c.d.fieldOf("type").forGetter(ggp.b::a), ayo.r.fieldOf("id").forGetter(ggp.b::b), Codec.STRING.fieldOf("name").forGetter(ggp.b::c)
               )
               .apply($$0, ggp.b::new)
      );

      public ggp.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bab {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<ggp.c> d = bab.a(ggp.c::values);
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
