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

public class gpw {
   private static final gpw a = new gpw("") {
      @Override
      public void a(fpt $$0) {
      }

      @Override
      public void a(gpw.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gpw.b e;

   gpw(String $$0) {
      this.d = fpt.Q().q.toPath().resolve($$0);
   }

   public static gpw a(@Nullable String $$0) {
      return $$0 == null ? a : new gpw($$0);
   }

   public void a(gpw.c $$0, String $$1, String $$2) {
      this.e = new gpw.b($$0, $$1, $$2);
   }

   public void a(fpt $$0) {
      if ($$0.r != null && this.e != null) {
         ag.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gpw.a $$2 = new gpw.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(gpw.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ag.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gpw.b b, Instant c, djj d) {
      public static final Codec<gpw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gpw.b.a.forGetter(gpw.a::a), ayu.q.fieldOf("lastPlayedTime").forGetter(gpw.a::b), djj.f.fieldOf("gamemode").forGetter(gpw.a::c))
               .apply($$0, gpw.a::new)
      );

      public gpw.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public djj c() {
         return this.d;
      }
   }

   static record b(gpw.c b, String c, String d) {
      public static final MapCodec<gpw.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gpw.c.d.fieldOf("type").forGetter(gpw.b::a), ayu.s.fieldOf("id").forGetter(gpw.b::b), Codec.STRING.fieldOf("name").forGetter(gpw.b::c)
               )
               .apply($$0, gpw.b::new)
      );

      public gpw.c a() {
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

      static final Codec<gpw.c> d = bak.a(gpw.c::values);
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
