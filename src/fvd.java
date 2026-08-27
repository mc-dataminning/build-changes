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

public class fvd {
   private static final fvd a = new fvd("") {
      @Override
      public void a(exo $$0) {
      }

      @Override
      public void a(fvd.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fvd.b e;

   fvd(String $$0) {
      this.d = exo.P().p.toPath().resolve($$0);
   }

   public static fvd a(@Nullable String $$0) {
      return $$0 == null ? a : new fvd($$0);
   }

   public void a(fvd.c $$0, String $$1, String $$2) {
      this.e = new fvd.b($$0, $$1, $$2);
   }

   public void a(exo $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fvd.a $$2 = new fvd.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(fvd.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fvd.b b, Instant c, cvo d) {
      public static final Codec<fvd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fvd.b.a.forGetter(fvd.a::a), avq.m.fieldOf("lastPlayedTime").forGetter(fvd.a::b), cvo.f.fieldOf("gamemode").forGetter(fvd.a::c))
               .apply($$0, fvd.a::new)
      );

      public fvd.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cvo c() {
         return this.d;
      }
   }

   static record b(fvd.c b, String c, String d) {
      public static final MapCodec<fvd.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fvd.c.d.fieldOf("type").forGetter(fvd.b::a), avq.o.fieldOf("id").forGetter(fvd.b::b), Codec.STRING.fieldOf("name").forGetter(fvd.b::c)
               )
               .apply($$0, fvd.b::new)
      );

      public fvd.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements axc {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fvd.c> d = axc.a(fvd.c::values);
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
