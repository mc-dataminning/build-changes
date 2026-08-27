import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gby extends aoj {
   private static final aof c = new aof(ur.c("resourcePack.vanilla.description"), aa.b().a(ans.a), Optional.empty());
   private static final anm d = anm.a(aof.b, c);
   private static final ur e = ur.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, ur> f = Map.of(
      "programmer_art", ur.c("resourcePack.programmer_art.name"), "high_contrast", ur.c("resourcePack.high_contrast.name")
   );
   private static final agg g = new agg("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public gby(Path $$0, eiy $$1) {
      super(ans.a, b($$0), g, $$1);
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

   private static anu b(Path $$0) {
      anv $$1 = new anv().a(d).a("minecraft", "realms");
      return $$1.b().a().a(ans.a, $$0).c();
   }

   @Override
   protected ur a(String $$0) {
      ur $$1 = f.get($$0);
      return (ur)($$1 != null ? $$1 : ur.b($$0));
   }

   @Nullable
   @Override
   protected aol a(anr $$0) {
      return aol.a("vanilla", e, true, b($$0), ans.a, aol.b.b, aop.c);
   }

   @Nullable
   @Override
   protected aol a(String $$0, aol.c $$1, ur $$2) {
      return aol.a($$0, $$2, false, $$1, ans.a, aol.b.a, aop.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aol>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
