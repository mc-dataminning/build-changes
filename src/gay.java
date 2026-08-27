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

public class gay {
   private static final gay a = new gay("") {
      @Override
      public void a(fde $$0) {
      }

      @Override
      public void a(gay.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gay.b e;

   gay(String $$0) {
      this.d = fde.Q().p.toPath().resolve($$0);
   }

   public static gay a(@Nullable String $$0) {
      return $$0 == null ? a : new gay($$0);
   }

   public void a(gay.c $$0, String $$1, String $$2) {
      this.e = new gay.b($$0, $$1, $$2);
   }

   public void a(fde $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gay.a $$2 = new gay.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gay.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gay.b b, Instant c, daa d) {
      public static final Codec<gay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gay.b.a.forGetter(gay.a::a), axh.m.fieldOf("lastPlayedTime").forGetter(gay.a::b), daa.f.fieldOf("gamemode").forGetter(gay.a::c))
               .apply($$0, gay.a::new)
      );

      public gay.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public daa c() {
         return this.d;
      }
   }

   static record b(gay.c b, String c, String d) {
      public static final MapCodec<gay.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gay.c.d.fieldOf("type").forGetter(gay.b::a), axh.o.fieldOf("id").forGetter(gay.b::b), Codec.STRING.fieldOf("name").forGetter(gay.b::c)
               )
               .apply($$0, gay.b::new)
      );

      public gay.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements ayt {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gay.c> d = ayt.a(gay.c::values);
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
