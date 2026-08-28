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

public class gpr {
   private static final gpr a = new gpr("") {
      @Override
      public void a(fpo $$0) {
      }

      @Override
      public void a(gpr.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gpr.b e;

   gpr(String $$0) {
      this.d = fpo.Q().q.toPath().resolve($$0);
   }

   public static gpr a(@Nullable String $$0) {
      return $$0 == null ? a : new gpr($$0);
   }

   public void a(gpr.c $$0, String $$1, String $$2) {
      this.e = new gpr.b($$0, $$1, $$2);
   }

   public void a(fpo $$0) {
      if ($$0.r != null && this.e != null) {
         ag.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gpr.a $$2 = new gpr.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(gpr.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ag.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gpr.b b, Instant c, dje d) {
      public static final Codec<gpr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gpr.b.a.forGetter(gpr.a::a), ayu.q.fieldOf("lastPlayedTime").forGetter(gpr.a::b), dje.f.fieldOf("gamemode").forGetter(gpr.a::c))
               .apply($$0, gpr.a::new)
      );

      public gpr.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dje c() {
         return this.d;
      }
   }

   static record b(gpr.c b, String c, String d) {
      public static final MapCodec<gpr.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gpr.c.d.fieldOf("type").forGetter(gpr.b::a), ayu.s.fieldOf("id").forGetter(gpr.b::b), Codec.STRING.fieldOf("name").forGetter(gpr.b::c)
               )
               .apply($$0, gpr.b::new)
      );

      public gpr.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bak {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gpr.c> d = bak.a(gpr.c::values);
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
