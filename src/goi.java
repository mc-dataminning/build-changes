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

public class goi {
   private static final goi a = new goi("") {
      @Override
      public void a(fof $$0) {
      }

      @Override
      public void a(goi.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private goi.b e;

   goi(String $$0) {
      this.d = fof.Q().q.toPath().resolve($$0);
   }

   public static goi a(@Nullable String $$0) {
      return $$0 == null ? a : new goi($$0);
   }

   public void a(goi.c $$0, String $$1, String $$2) {
      this.e = new goi.b($$0, $$1, $$2);
   }

   public void a(fof $$0) {
      if ($$0.r != null && this.e != null) {
         af.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            goi.a $$2 = new goi.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(goi.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(goi.b b, Instant c, dim d) {
      public static final Codec<goi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(goi.b.a.forGetter(goi.a::a), ays.q.fieldOf("lastPlayedTime").forGetter(goi.a::b), dim.f.fieldOf("gamemode").forGetter(goi.a::c))
               .apply($$0, goi.a::new)
      );

      public goi.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dim c() {
         return this.d;
      }
   }

   static record b(goi.c b, String c, String d) {
      public static final MapCodec<goi.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  goi.c.d.fieldOf("type").forGetter(goi.b::a), ays.s.fieldOf("id").forGetter(goi.b::b), Codec.STRING.fieldOf("name").forGetter(goi.b::c)
               )
               .apply($$0, goi.b::new)
      );

      public goi.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bai {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<goi.c> d = bai.a(goi.c::values);
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
