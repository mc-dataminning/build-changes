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

public class gkp {
   private static final gkp a = new gkp("") {
      @Override
      public void a(fmg $$0) {
      }

      @Override
      public void a(gkp.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gkp.b e;

   gkp(String $$0) {
      this.d = fmg.Q().q.toPath().resolve($$0);
   }

   public static gkp a(@Nullable String $$0) {
      return $$0 == null ? a : new gkp($$0);
   }

   public void a(gkp.c $$0, String $$1, String $$2) {
      this.e = new gkp.b($$0, $$1, $$2);
   }

   public void a(fmg $$0) {
      if ($$0.r != null && this.e != null) {
         ae.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gkp.a $$2 = new gkp.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(gkp.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ae.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gkp.b b, Instant c, dhf d) {
      public static final Codec<gkp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gkp.b.a.forGetter(gkp.a::a), azn.q.fieldOf("lastPlayedTime").forGetter(gkp.a::b), dhf.f.fieldOf("gamemode").forGetter(gkp.a::c))
               .apply($$0, gkp.a::new)
      );

      public gkp.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dhf c() {
         return this.d;
      }
   }

   static record b(gkp.c b, String c, String d) {
      public static final MapCodec<gkp.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gkp.c.d.fieldOf("type").forGetter(gkp.b::a), azn.s.fieldOf("id").forGetter(gkp.b::b), Codec.STRING.fieldOf("name").forGetter(gkp.b::c)
               )
               .apply($$0, gkp.b::new)
      );

      public gkp.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bba {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gkp.c> d = bba.a(gkp.c::values);
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
