import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fzl extends ams {
   private static final amo c = new amo(tf.c("resourcePack.vanilla.description"), aa.b().a(amb.a), Optional.empty());
   private static final alv d = alv.a(amo.b, c);
   private static final tf e = tf.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, tf> f = Map.of(
      "programmer_art", tf.c("resourcePack.programmer_art.name"), "high_contrast", tf.c("resourcePack.high_contrast.name")
   );
   private static final aer g = new aer("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public fzl(Path $$0, egt $$1) {
      super(amb.a, b($$0), g, $$1);
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

   private static amd b(Path $$0) {
      ame $$1 = new ame().a(d).a("minecraft", "realms");
      return $$1.b().a().a(amb.a, $$0).c();
   }

   @Override
   protected tf a(String $$0) {
      tf $$1 = f.get($$0);
      return (tf)($$1 != null ? $$1 : tf.b($$0));
   }

   @Nullable
   @Override
   protected amu a(ama $$0) {
      return amu.a("vanilla", e, true, b($$0), amb.a, amu.b.b, amy.c);
   }

   @Nullable
   @Override
   protected amu a(String $$0, amu.c $$1, tf $$2) {
      return amu.a($$0, $$2, false, $$1, amb.a, amu.b.a, amy.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, amu>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
