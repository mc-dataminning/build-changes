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

public class glb {
   private static final glb a = new glb("") {
      @Override
      public void a(flh $$0) {
      }

      @Override
      public void a(glb.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private glb.b e;

   glb(String $$0) {
      this.d = flh.Q().q.toPath().resolve($$0);
   }

   public static glb a(@Nullable String $$0) {
      return $$0 == null ? a : new glb($$0);
   }

   public void a(glb.c $$0, String $$1, String $$2) {
      this.e = new glb.b($$0, $$1, $$2);
   }

   public void a(flh $$0) {
      if ($$0.r != null && this.e != null) {
         af.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            glb.a $$2 = new glb.a(this.e, Instant.now(), $$0.r.j());
            Codec.list(glb.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(af.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(glb.b b, Instant c, dgd d) {
      public static final Codec<glb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(glb.b.a.forGetter(glb.a::a), ayh.q.fieldOf("lastPlayedTime").forGetter(glb.a::b), dgd.f.fieldOf("gamemode").forGetter(glb.a::c))
               .apply($$0, glb.a::new)
      );

      public glb.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dgd c() {
         return this.d;
      }
   }

   static record b(glb.c b, String c, String d) {
      public static final MapCodec<glb.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  glb.c.d.fieldOf("type").forGetter(glb.b::a), ayh.s.fieldOf("id").forGetter(glb.b::b), Codec.STRING.fieldOf("name").forGetter(glb.b::c)
               )
               .apply($$0, glb.b::new)
      );

      public glb.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azu {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<glb.c> d = azu.a(glb.c::values);
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
