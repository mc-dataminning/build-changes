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

public class gbu {
   private static final gbu a = new gbu("") {
      @Override
      public void a(feb $$0) {
      }

      @Override
      public void a(gbu.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gbu.b e;

   gbu(String $$0) {
      this.d = feb.Q().p.toPath().resolve($$0);
   }

   public static gbu a(@Nullable String $$0) {
      return $$0 == null ? a : new gbu($$0);
   }

   public void a(gbu.c $$0, String $$1, String $$2) {
      this.e = new gbu.b($$0, $$1, $$2);
   }

   public void a(feb $$0) {
      if ($$0.q != null && this.e != null) {
         ac.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gbu.a $$2 = new gbu.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gbu.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gbu.b b, Instant c, daw d) {
      public static final Codec<gbu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gbu.b.a.forGetter(gbu.a::a), axn.m.fieldOf("lastPlayedTime").forGetter(gbu.a::b), daw.f.fieldOf("gamemode").forGetter(gbu.a::c))
               .apply($$0, gbu.a::new)
      );

      public gbu.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public daw c() {
         return this.d;
      }
   }

   static record b(gbu.c b, String c, String d) {
      public static final MapCodec<gbu.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gbu.c.d.fieldOf("type").forGetter(gbu.b::a), axn.o.fieldOf("id").forGetter(gbu.b::b), Codec.STRING.fieldOf("name").forGetter(gbu.b::c)
               )
               .apply($$0, gbu.b::new)
      );

      public gbu.c a() {
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

      static final Codec<gbu.c> d = ayz.a(gbu.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
