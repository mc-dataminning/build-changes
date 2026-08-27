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

public class fzj {
   private static final fzj a = new fzj("") {
      @Override
      public void a(fbp $$0) {
      }

      @Override
      public void a(fzj.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fzj.b e;

   fzj(String $$0) {
      this.d = fbp.Q().p.toPath().resolve($$0);
   }

   public static fzj a(@Nullable String $$0) {
      return $$0 == null ? a : new fzj($$0);
   }

   public void a(fzj.c $$0, String $$1, String $$2) {
      this.e = new fzj.b($$0, $$1, $$2);
   }

   public void a(fbp $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fzj.a $$2 = new fzj.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(fzj.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fzj.b b, Instant c, cyu d) {
      public static final Codec<fzj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fzj.b.a.forGetter(fzj.a::a), aws.m.fieldOf("lastPlayedTime").forGetter(fzj.a::b), cyu.f.fieldOf("gamemode").forGetter(fzj.a::c))
               .apply($$0, fzj.a::new)
      );

      public fzj.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cyu c() {
         return this.d;
      }
   }

   static record b(fzj.c b, String c, String d) {
      public static final MapCodec<fzj.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fzj.c.d.fieldOf("type").forGetter(fzj.b::a), aws.o.fieldOf("id").forGetter(fzj.b::b), Codec.STRING.fieldOf("name").forGetter(fzj.b::c)
               )
               .apply($$0, fzj.b::new)
      );

      public fzj.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements aye {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fzj.c> d = aye.a(fzj.c::values);
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
