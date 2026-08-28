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

public class gcz {
   private static final gcz a = new gcz("") {
      @Override
      public void a(ffg $$0) {
      }

      @Override
      public void a(gcz.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gcz.b e;

   gcz(String $$0) {
      this.d = ffg.Q().p.toPath().resolve($$0);
   }

   public static gcz a(@Nullable String $$0) {
      return $$0 == null ? a : new gcz($$0);
   }

   public void a(gcz.c $$0, String $$1, String $$2) {
      this.e = new gcz.b($$0, $$1, $$2);
   }

   public void a(ffg $$0) {
      if ($$0.q != null && this.e != null) {
         ac.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gcz.a $$2 = new gcz.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gcz.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gcz.b b, Instant c, dbw d) {
      public static final Codec<gcz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gcz.b.a.forGetter(gcz.a::a), ayh.o.fieldOf("lastPlayedTime").forGetter(gcz.a::b), dbw.f.fieldOf("gamemode").forGetter(gcz.a::c))
               .apply($$0, gcz.a::new)
      );

      public gcz.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dbw c() {
         return this.d;
      }
   }

   static record b(gcz.c b, String c, String d) {
      public static final MapCodec<gcz.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gcz.c.d.fieldOf("type").forGetter(gcz.b::a), ayh.q.fieldOf("id").forGetter(gcz.b::b), Codec.STRING.fieldOf("name").forGetter(gcz.b::c)
               )
               .apply($$0, gcz.b::new)
      );

      public gcz.c a() {
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

      static final Codec<gcz.c> d = azu.a(gcz.c::values);
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
