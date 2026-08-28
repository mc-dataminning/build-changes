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

public class gcw {
   private static final gcw a = new gcw("") {
      @Override
      public void a(ffd $$0) {
      }

      @Override
      public void a(gcw.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gcw.b e;

   gcw(String $$0) {
      this.d = ffd.Q().p.toPath().resolve($$0);
   }

   public static gcw a(@Nullable String $$0) {
      return $$0 == null ? a : new gcw($$0);
   }

   public void a(gcw.c $$0, String $$1, String $$2) {
      this.e = new gcw.b($$0, $$1, $$2);
   }

   public void a(ffd $$0) {
      if ($$0.q != null && this.e != null) {
         ac.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gcw.a $$2 = new gcw.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gcw.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gcw.b b, Instant c, dbt d) {
      public static final Codec<gcw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gcw.b.a.forGetter(gcw.a::a), ayf.o.fieldOf("lastPlayedTime").forGetter(gcw.a::b), dbt.f.fieldOf("gamemode").forGetter(gcw.a::c))
               .apply($$0, gcw.a::new)
      );

      public gcw.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dbt c() {
         return this.d;
      }
   }

   static record b(gcw.c b, String c, String d) {
      public static final MapCodec<gcw.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gcw.c.d.fieldOf("type").forGetter(gcw.b::a), ayf.q.fieldOf("id").forGetter(gcw.b::b), Codec.STRING.fieldOf("name").forGetter(gcw.b::c)
               )
               .apply($$0, gcw.b::new)
      );

      public gcw.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azs {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gcw.c> d = azs.a(gcw.c::values);
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
