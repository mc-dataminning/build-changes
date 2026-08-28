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

public class gqu {
   private static final gqu a = new gqu("") {
      @Override
      public void a(fqq $$0) {
      }

      @Override
      public void a(gqu.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gqu.b e;

   gqu(String $$0) {
      this.d = fqq.Q().q.toPath().resolve($$0);
   }

   public static gqu a(@Nullable String $$0) {
      return $$0 == null ? a : new gqu($$0);
   }

   public void a(gqu.c $$0, String $$1, String $$2) {
      this.e = new gqu.b($$0, $$1, $$2);
   }

   public void a(fqq $$0) {
      if ($$0.r != null && this.e != null) {
         ag.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gqu.a $$2 = new gqu.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(gqu.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ag.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gqu.b b, Instant c, dkg d) {
      public static final Codec<gqu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gqu.b.a.forGetter(gqu.a::a), azg.q.fieldOf("lastPlayedTime").forGetter(gqu.a::b), dkg.f.fieldOf("gamemode").forGetter(gqu.a::c))
               .apply($$0, gqu.a::new)
      );

      public gqu.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dkg c() {
         return this.d;
      }
   }

   static record b(gqu.c b, String c, String d) {
      public static final MapCodec<gqu.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gqu.c.d.fieldOf("type").forGetter(gqu.b::a), azg.s.fieldOf("id").forGetter(gqu.b::b), Codec.STRING.fieldOf("name").forGetter(gqu.b::c)
               )
               .apply($$0, gqu.b::new)
      );

      public gqu.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bax {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gqu.c> d = bax.a(gqu.c::values);
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
