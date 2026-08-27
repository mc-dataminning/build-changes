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

public class gao {
   private static final gao a = new gao("") {
      @Override
      public void a(fcu $$0) {
      }

      @Override
      public void a(gao.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gao.b e;

   gao(String $$0) {
      this.d = fcu.Q().p.toPath().resolve($$0);
   }

   public static gao a(@Nullable String $$0) {
      return $$0 == null ? a : new gao($$0);
   }

   public void a(gao.c $$0, String $$1, String $$2) {
      this.e = new gao.b($$0, $$1, $$2);
   }

   public void a(fcu $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gao.a $$2 = new gao.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(gao.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(gao.b b, Instant c, czr d) {
      public static final Codec<gao.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gao.b.a.forGetter(gao.a::a), axe.m.fieldOf("lastPlayedTime").forGetter(gao.a::b), czr.f.fieldOf("gamemode").forGetter(gao.a::c))
               .apply($$0, gao.a::new)
      );

      public gao.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public czr c() {
         return this.d;
      }
   }

   static record b(gao.c b, String c, String d) {
      public static final MapCodec<gao.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  gao.c.d.fieldOf("type").forGetter(gao.b::a), axe.o.fieldOf("id").forGetter(gao.b::b), Codec.STRING.fieldOf("name").forGetter(gao.b::c)
               )
               .apply($$0, gao.b::new)
      );

      public gao.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements ayq {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gao.c> d = ayq.a(gao.c::values);
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
