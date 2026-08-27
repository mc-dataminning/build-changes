import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fvl extends ake {
   private static final ajz c = new ajz(sw.c("resourcePack.vanilla.description"), aa.b().a(ajm.a));
   private static final aji d = aji.a(ajz.a, c);
   private static final sw e = sw.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, sw> f = Map.of(
      "programmer_art", sw.c("resourcePack.programmer_art.name"), "high_contrast", sw.c("resourcePack.high_contrast.name")
   );
   private static final acq g = new acq("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public fvl(Path $$0) {
      super(ajm.a, b($$0), g);
      this.h = this.a($$0);
   }

   @Nullable
   private Path a(Path $$0) {
      if (aa.aS && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static ajo b(Path $$0) {
      ajp $$1 = new ajp().a(d).a("minecraft", "realms");
      return $$1.b().a().a(ajm.a, $$0).c();
   }

   @Override
   protected sw a(String $$0) {
      sw $$1 = f.get($$0);
      return (sw)($$1 != null ? $$1 : sw.b($$0));
   }

   @Nullable
   @Override
   protected akg a(ajl $$0) {
      return akg.a("vanilla", e, true, $$1 -> $$0, ajm.a, akg.b.b, akj.c);
   }

   @Nullable
   @Override
   protected akg a(String $$0, akg.c $$1, sw $$2) {
      return akg.a($$0, $$2, false, $$1, ajm.a, akg.b.a, akj.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, akg>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
