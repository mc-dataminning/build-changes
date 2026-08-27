import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gfs extends app {
   private static final apl c = new apl(vg.c("resourcePack.vanilla.description"), aa.b().a(aoy.a), Optional.empty());
   private static final aoq d = aoq.a(apl.b, c);
   private static final vg e = vg.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, vg> f = Map.of(
      "programmer_art", vg.c("resourcePack.programmer_art.name"), "high_contrast", vg.c("resourcePack.high_contrast.name")
   );
   private static final ahh g = new ahh("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public gfs(Path $$0, els $$1) {
      super(aoy.a, b($$0), g, $$1);
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

   private static apa b(Path $$0) {
      apb $$1 = new apb().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aoy.a, $$0).c();
   }

   @Override
   protected vg a(String $$0) {
      vg $$1 = f.get($$0);
      return (vg)($$1 != null ? $$1 : vg.b($$0));
   }

   @Nullable
   @Override
   protected apr a(aox $$0) {
      return apr.a("vanilla", e, true, b($$0), aoy.a, apr.b.b, apv.c);
   }

   @Nullable
   @Override
   protected apr a(String $$0, apr.c $$1, vg $$2) {
      return apr.a($$0, $$2, false, $$1, aoy.a, apr.b.a, apv.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, apr>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
