import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gzv extends auh {
   private static final aud d = new aud(xj.c("resourcePack.vanilla.description"), ab.b().a(atq.a), Optional.empty());
   private static final atg e = atg.a(aud.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xj> f = Map.of(
      "programmer_art", xj.c("resourcePack.programmer_art.name"), "high_contrast", xj.c("resourcePack.high_contrast.name")
   );
   private static final atn g = new atn("vanilla", xj.c("resourcePack.vanilla.name"), auo.c, Optional.of(b));
   private static final atp h = new atp(true, auk.b.b, false);
   private static final atp i = new atp(false, auk.b.a, false);
   private static final alj j = alj.b("resourcepacks");
   @Nullable
   private final Path k;

   public gzv(Path $$0, ezo $$1) {
      super(atq.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static atn a(String $$0, xj $$1) {
      return new atn($$0, $$1, auo.c, Optional.of(auj.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ab.aU && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static ats b(Path $$0) {
      att $$1 = new att().a(e).a("minecraft", "realms");
      return $$1.b().a().a(atq.a, $$0).a(g);
   }

   @Override
   protected xj a(String $$0) {
      xj $$1 = f.get($$0);
      return (xj)($$1 != null ? $$1 : xj.b($$0));
   }

   @Nullable
   @Override
   protected auk a(ato $$0) {
      return auk.a(g, b($$0), atq.a, h);
   }

   @Nullable
   @Override
   protected auk a(String $$0, auk.c $$1, xj $$2) {
      return auk.a(a($$0, $$2), $$1, atq.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, auk>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
