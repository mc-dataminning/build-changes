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

public class gcx {
   private static final gcx a = new gcx("") {
      @Override
      public void a(ffe $$0) {
      }

      @Override
      public void a(gcx.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gcx.b e;

   gcx(String $$0) {
      this.d = ffe.Q().p.toPath().resolve($$0);
   }

   public static gcx a(@Nullable String $$0) {
      return $$0 == null ? a : new gcx($$0);
   }

   public void a(gcx.c $$0, String $$1, String $$2) {
      this.e = new gcx.b($$0, $$1, $$2);
   }

   public void a(ffe $$0) {
      if ($$0.q != null && this.e != null) {
         ac.h().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gcx.a $$2 = new gcx.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gcx.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gcx.b b, Instant c, dbu d) {
      public static final Codec<gcx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gcx.b.a.forGetter(gcx.a::a), ayg.o.fieldOf("lastPlayedTime").forGetter(gcx.a::b), dbu.f.fieldOf("gamemode").forGetter(gcx.a::c))
               .apply($$0, gcx.a::new)
      );

      public gcx.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dbu c() {
         return this.d;
      }
   }

   static record b(gcx.c b, String c, String d) {
      public static final MapCodec<gcx.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gcx.c.d.fieldOf("type").forGetter(gcx.b::a), ayg.q.fieldOf("id").forGetter(gcx.b::b), Codec.STRING.fieldOf("name").forGetter(gcx.b::c)
               )
               .apply($$0, gcx.b::new)
      );

      public gcx.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements azt {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gcx.c> d = azt.a(gcx.c::values);
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
