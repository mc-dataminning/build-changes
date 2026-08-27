import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fyx extends amq {
   private static final amm c = new amm(te.c("resourcePack.vanilla.description"), aa.b().a(alz.a), Optional.empty());
   private static final alt d = alt.a(amm.b, c);
   private static final te e = te.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, te> f = Map.of(
      "programmer_art", te.c("resourcePack.programmer_art.name"), "high_contrast", te.c("resourcePack.high_contrast.name")
   );
   private static final aep g = new aep("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public fyx(Path $$0, egv $$1) {
      super(alz.a, b($$0), g, $$1);
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

   private static amb b(Path $$0) {
      amc $$1 = new amc().a(d).a("minecraft", "realms");
      return $$1.b().a().a(alz.a, $$0).c();
   }

   @Override
   protected te a(String $$0) {
      te $$1 = f.get($$0);
      return (te)($$1 != null ? $$1 : te.b($$0));
   }

   @Nullable
   @Override
   protected ams a(aly $$0) {
      return ams.a("vanilla", e, true, b($$0), alz.a, ams.b.b, amw.c);
   }

   @Nullable
   @Override
   protected ams a(String $$0, ams.c $$1, te $$2) {
      return ams.a($$0, $$2, false, $$1, alz.a, ams.b.a, amw.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, ams>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
