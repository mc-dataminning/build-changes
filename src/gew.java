import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gew extends api {
   private static final ape c = new ape(vd.c("resourcePack.vanilla.description"), aa.b().a(aor.a), Optional.empty());
   private static final aol d = aol.a(ape.b, c);
   private static final vd e = vd.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, vd> f = Map.of(
      "programmer_art", vd.c("resourcePack.programmer_art.name"), "high_contrast", vd.c("resourcePack.high_contrast.name")
   );
   private static final ahd g = new ahd("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public gew(Path $$0, elc $$1) {
      super(aor.a, b($$0), g, $$1);
      this.h = this.a($$0);
   }

   @Nullable
   private Path a(Path $$0) {
      if (aa.aW && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static aot b(Path $$0) {
      aou $$1 = new aou().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aor.a, $$0).c();
   }

   @Override
   protected vd a(String $$0) {
      vd $$1 = f.get($$0);
      return (vd)($$1 != null ? $$1 : vd.b($$0));
   }

   @Nullable
   @Override
   protected apk a(aoq $$0) {
      return apk.a("vanilla", e, true, b($$0), aor.a, apk.b.b, apo.c);
   }

   @Nullable
   @Override
   protected apk a(String $$0, apk.c $$1, vd $$2) {
      return apk.a($$0, $$2, false, $$1, aor.a, apk.b.a, apo.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, apk>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
