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

public class gik {
   private static final gik a = new gik("") {
      @Override
      public void a(fke $$0) {
      }

      @Override
      public void a(gik.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gik.b e;

   gik(String $$0) {
      this.d = fke.Q().q.toPath().resolve($$0);
   }

   public static gik a(@Nullable String $$0) {
      return $$0 == null ? a : new gik($$0);
   }

   public void a(gik.c $$0, String $$1, String $$2) {
      this.e = new gik.b($$0, $$1, $$2);
   }

   public void a(fke $$0) {
      if ($$0.r != null && this.e != null) {
         ae.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gik.a $$2 = new gik.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gik.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ae.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gik.b b, Instant c, dfj d) {
      public static final Codec<gik.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gik.b.a.forGetter(gik.a::a), ayv.q.fieldOf("lastPlayedTime").forGetter(gik.a::b), dfj.f.fieldOf("gamemode").forGetter(gik.a::c))
               .apply($$0, gik.a::new)
      );

      public gik.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dfj c() {
         return this.d;
      }
   }

   static record b(gik.c b, String c, String d) {
      public static final MapCodec<gik.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gik.c.d.fieldOf("type").forGetter(gik.b::a), ayv.s.fieldOf("id").forGetter(gik.b::b), Codec.STRING.fieldOf("name").forGetter(gik.b::c)
               )
               .apply($$0, gik.b::new)
      );

      public gik.c a() {
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

      static final Codec<gik.c> d = bai.a(gik.c::values);
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
