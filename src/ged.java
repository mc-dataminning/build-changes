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

public class ged {
   private static final ged a = new ged("") {
      @Override
      public void a(fgi $$0) {
      }

      @Override
      public void a(ged.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private ged.b e;

   ged(String $$0) {
      this.d = fgi.Q().p.toPath().resolve($$0);
   }

   public static ged a(@Nullable String $$0) {
      return $$0 == null ? a : new ged($$0);
   }

   public void a(ged.c $$0, String $$1, String $$2) {
      this.e = new ged.b($$0, $$1, $$2);
   }

   public void a(fgi $$0) {
      if ($$0.q != null && this.e != null) {
         ad.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            ged.a $$2 = new ged.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(ged.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ad.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(ged.b b, Instant c, dcr d) {
      public static final Codec<ged.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ged.b.a.forGetter(ged.a::a), axv.o.fieldOf("lastPlayedTime").forGetter(ged.a::b), dcr.f.fieldOf("gamemode").forGetter(ged.a::c))
               .apply($$0, ged.a::new)
      );

      public ged.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dcr c() {
         return this.d;
      }
   }

   static record b(ged.c b, String c, String d) {
      public static final MapCodec<ged.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ged.c.d.fieldOf("type").forGetter(ged.b::a), axv.q.fieldOf("id").forGetter(ged.b::b), Codec.STRING.fieldOf("name").forGetter(ged.b::c)
               )
               .apply($$0, ged.b::new)
      );

      public ged.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azj {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<ged.c> d = azj.a(ged.c::values);
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
