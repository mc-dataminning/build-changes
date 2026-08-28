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

public class ghl {
   private static final ghl a = new ghl("") {
      @Override
      public void a(fji $$0) {
      }

      @Override
      public void a(ghl.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private ghl.b e;

   ghl(String $$0) {
      this.d = fji.Q().q.toPath().resolve($$0);
   }

   public static ghl a(@Nullable String $$0) {
      return $$0 == null ? a : new ghl($$0);
   }

   public void a(ghl.c $$0, String $$1, String $$2) {
      this.e = new ghl.b($$0, $$1, $$2);
   }

   public void a(fji $$0) {
      if ($$0.r != null && this.e != null) {
         ae.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            ghl.a $$2 = new ghl.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(ghl.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ae.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(ghl.b b, Instant c, dey d) {
      public static final Codec<ghl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ghl.b.a.forGetter(ghl.a::a), ayt.q.fieldOf("lastPlayedTime").forGetter(ghl.a::b), dey.f.fieldOf("gamemode").forGetter(ghl.a::c))
               .apply($$0, ghl.a::new)
      );

      public ghl.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dey c() {
         return this.d;
      }
   }

   static record b(ghl.c b, String c, String d) {
      public static final MapCodec<ghl.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ghl.c.d.fieldOf("type").forGetter(ghl.b::a), ayt.s.fieldOf("id").forGetter(ghl.b::b), Codec.STRING.fieldOf("name").forGetter(ghl.b::c)
               )
               .apply($$0, ghl.b::new)
      );

      public ghl.c a() {
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

      static final Codec<ghl.c> d = bag.a(ghl.c::values);
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
