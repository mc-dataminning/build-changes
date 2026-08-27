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

public class geq {
   private static final geq a = new geq("") {
      @Override
      public void a(fgj $$0) {
      }

      @Override
      public void a(geq.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private geq.b e;

   geq(String $$0) {
      this.d = fgj.Q().p.toPath().resolve($$0);
   }

   public static geq a(@Nullable String $$0) {
      return $$0 == null ? a : new geq($$0);
   }

   public void a(geq.c $$0, String $$1, String $$2) {
      this.e = new geq.b($$0, $$1, $$2);
   }

   public void a(fgj $$0) {
      if ($$0.q != null && this.e != null) {
         ad.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            geq.a $$2 = new geq.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(geq.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ad.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(geq.b b, Instant c, dbx d) {
      public static final Codec<geq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(geq.b.a.forGetter(geq.a::a), axu.m.fieldOf("lastPlayedTime").forGetter(geq.a::b), dbx.f.fieldOf("gamemode").forGetter(geq.a::c))
               .apply($$0, geq.a::new)
      );

      public geq.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dbx c() {
         return this.d;
      }
   }

   static record b(geq.c b, String c, String d) {
      public static final MapCodec<geq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  geq.c.d.fieldOf("type").forGetter(geq.b::a), axu.o.fieldOf("id").forGetter(geq.b::b), Codec.STRING.fieldOf("name").forGetter(geq.b::c)
               )
               .apply($$0, geq.b::new)
      );

      public geq.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azg {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<geq.c> d = azg.a(geq.c::values);
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
