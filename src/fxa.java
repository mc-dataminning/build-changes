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

public class fxa {
   private static final fxa a = new fxa("") {
      @Override
      public void a(ezg $$0) {
      }

      @Override
      public void a(fxa.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fxa.b e;

   fxa(String $$0) {
      this.d = ezg.Q().p.toPath().resolve($$0);
   }

   public static fxa a(@Nullable String $$0) {
      return $$0 == null ? a : new fxa($$0);
   }

   public void a(fxa.c $$0, String $$1, String $$2) {
      this.e = new fxa.b($$0, $$1, $$2);
   }

   public void a(ezg $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fxa.a $$2 = new fxa.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(fxa.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fxa.b b, Instant c, cww d) {
      public static final Codec<fxa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fxa.b.a.forGetter(fxa.a::a), awe.n.fieldOf("lastPlayedTime").forGetter(fxa.a::b), cww.f.fieldOf("gamemode").forGetter(fxa.a::c))
               .apply($$0, fxa.a::new)
      );

      public fxa.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cww c() {
         return this.d;
      }
   }

   static record b(fxa.c b, String c, String d) {
      public static final MapCodec<fxa.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fxa.c.d.fieldOf("type").forGetter(fxa.b::a), awe.p.fieldOf("id").forGetter(fxa.b::b), Codec.STRING.fieldOf("name").forGetter(fxa.b::c)
               )
               .apply($$0, fxa.b::new)
      );

      public fxa.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements axq {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fxa.c> d = axq.a(fxa.c::values);
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
