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

public class fwa {
   private static final fwa a = new fwa("") {
      @Override
      public void a(eyk $$0) {
      }

      @Override
      public void a(fwa.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fwa.b e;

   fwa(String $$0) {
      this.d = eyk.P().p.toPath().resolve($$0);
   }

   public static fwa a(@Nullable String $$0) {
      return $$0 == null ? a : new fwa($$0);
   }

   public void a(fwa.c $$0, String $$1, String $$2) {
      this.e = new fwa.b($$0, $$1, $$2);
   }

   public void a(eyk $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fwa.a $$2 = new fwa.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(fwa.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fwa.b b, Instant c, cwb d) {
      public static final Codec<fwa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fwa.b.a.forGetter(fwa.a::a), avu.n.fieldOf("lastPlayedTime").forGetter(fwa.a::b), cwb.f.fieldOf("gamemode").forGetter(fwa.a::c))
               .apply($$0, fwa.a::new)
      );

      public fwa.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cwb c() {
         return this.d;
      }
   }

   static record b(fwa.c b, String c, String d) {
      public static final MapCodec<fwa.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fwa.c.d.fieldOf("type").forGetter(fwa.b::a), avu.p.fieldOf("id").forGetter(fwa.b::b), Codec.STRING.fieldOf("name").forGetter(fwa.b::c)
               )
               .apply($$0, fwa.b::new)
      );

      public fwa.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements axg {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fwa.c> d = axg.a(fwa.c::values);
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
