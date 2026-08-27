import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gcq extends aor {
   private static final aon c = new aon(uv.c("resourcePack.vanilla.description"), aa.b().a(aoa.a), Optional.empty());
   private static final anu d = anu.a(aon.b, c);
   private static final uv e = uv.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, uv> f = Map.of(
      "programmer_art", uv.c("resourcePack.programmer_art.name"), "high_contrast", uv.c("resourcePack.high_contrast.name")
   );
   private static final agm g = new agm("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public gcq(Path $$0, ejp $$1) {
      super(aoa.a, b($$0), g, $$1);
      this.h = this.a($$0);
   }

   @Nullable
   private Path a(Path $$0) {
      if (aa.aT && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static aoc b(Path $$0) {
      aod $$1 = new aod().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aoa.a, $$0).c();
   }

   @Override
   protected uv a(String $$0) {
      uv $$1 = f.get($$0);
      return (uv)($$1 != null ? $$1 : uv.b($$0));
   }

   @Nullable
   @Override
   protected aot a(anz $$0) {
      return aot.a("vanilla", e, true, b($$0), aoa.a, aot.b.b, aox.c);
   }

   @Nullable
   @Override
   protected aot a(String $$0, aot.c $$1, uv $$2) {
      return aot.a($$0, $$2, false, $$1, aoa.a, aot.b.a, aox.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aot>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
