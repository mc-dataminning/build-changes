import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gcl extends aon {
   private static final aoj c = new aoj(ur.c("resourcePack.vanilla.description"), aa.b().a(anw.a), Optional.empty());
   private static final anq d = anq.a(aoj.b, c);
   private static final ur e = ur.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, ur> f = Map.of(
      "programmer_art", ur.c("resourcePack.programmer_art.name"), "high_contrast", ur.c("resourcePack.high_contrast.name")
   );
   private static final agi g = new agi("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public gcl(Path $$0, ejk $$1) {
      super(anw.a, b($$0), g, $$1);
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

   private static any b(Path $$0) {
      anz $$1 = new anz().a(d).a("minecraft", "realms");
      return $$1.b().a().a(anw.a, $$0).c();
   }

   @Override
   protected ur a(String $$0) {
      ur $$1 = f.get($$0);
      return (ur)($$1 != null ? $$1 : ur.b($$0));
   }

   @Nullable
   @Override
   protected aop a(anv $$0) {
      return aop.a("vanilla", e, true, b($$0), anw.a, aop.b.b, aot.c);
   }

   @Nullable
   @Override
   protected aop a(String $$0, aop.c $$1, ur $$2) {
      return aop.a($$0, $$2, false, $$1, anw.a, aop.b.a, aot.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aop>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
