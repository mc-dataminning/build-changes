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

public class fzs {
   private static final fzs a = new fzs("") {
      @Override
      public void a(fby $$0) {
      }

      @Override
      public void a(fzs.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fzs.b e;

   fzs(String $$0) {
      this.d = fby.Q().p.toPath().resolve($$0);
   }

   public static fzs a(@Nullable String $$0) {
      return $$0 == null ? a : new fzs($$0);
   }

   public void a(fzs.c $$0, String $$1, String $$2) {
      this.e = new fzs.b($$0, $$1, $$2);
   }

   public void a(fby $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fzs.a $$2 = new fzs.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(fzs.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fzs.b b, Instant c, czd d) {
      public static final Codec<fzs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fzs.b.a.forGetter(fzs.a::a), awu.m.fieldOf("lastPlayedTime").forGetter(fzs.a::b), czd.f.fieldOf("gamemode").forGetter(fzs.a::c))
               .apply($$0, fzs.a::new)
      );

      public fzs.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public czd c() {
         return this.d;
      }
   }

   static record b(fzs.c b, String c, String d) {
      public static final MapCodec<fzs.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fzs.c.d.fieldOf("type").forGetter(fzs.b::a), awu.o.fieldOf("id").forGetter(fzs.b::b), Codec.STRING.fieldOf("name").forGetter(fzs.b::c)
               )
               .apply($$0, fzs.b::new)
      );

      public fzs.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements ayg {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fzs.c> d = ayg.a(fzs.c::values);
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
