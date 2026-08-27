import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gar extends anz {
   private static final anv c = new anv(ui.c("resourcePack.vanilla.description"), aa.b().a(ani.a), Optional.empty());
   private static final anc d = anc.a(anv.b, c);
   private static final ui e = ui.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, ui> f = Map.of(
      "programmer_art", ui.c("resourcePack.programmer_art.name"), "high_contrast", ui.c("resourcePack.high_contrast.name")
   );
   private static final afw g = new afw("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public gar(Path $$0, ehv $$1) {
      super(ani.a, b($$0), g, $$1);
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

   private static ank b(Path $$0) {
      anl $$1 = new anl().a(d).a("minecraft", "realms");
      return $$1.b().a().a(ani.a, $$0).c();
   }

   @Override
   protected ui a(String $$0) {
      ui $$1 = f.get($$0);
      return (ui)($$1 != null ? $$1 : ui.b($$0));
   }

   @Nullable
   @Override
   protected aob a(anh $$0) {
      return aob.a("vanilla", e, true, b($$0), ani.a, aob.b.b, aof.c);
   }

   @Nullable
   @Override
   protected aob a(String $$0, aob.c $$1, ui $$2) {
      return aob.a($$0, $$2, false, $$1, ani.a, aob.b.a, aof.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aob>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
