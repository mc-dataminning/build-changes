import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fzq extends amv {
   private static final amr c = new amr(ti.c("resourcePack.vanilla.description"), aa.b().a(ame.a), Optional.empty());
   private static final aly d = aly.a(amr.b, c);
   private static final ti e = ti.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, ti> f = Map.of(
      "programmer_art", ti.c("resourcePack.programmer_art.name"), "high_contrast", ti.c("resourcePack.high_contrast.name")
   );
   private static final aeu g = new aeu("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public fzq(Path $$0, egy $$1) {
      super(ame.a, b($$0), g, $$1);
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

   private static amg b(Path $$0) {
      amh $$1 = new amh().a(d).a("minecraft", "realms");
      return $$1.b().a().a(ame.a, $$0).c();
   }

   @Override
   protected ti a(String $$0) {
      ti $$1 = f.get($$0);
      return (ti)($$1 != null ? $$1 : ti.b($$0));
   }

   @Nullable
   @Override
   protected amx a(amd $$0) {
      return amx.a("vanilla", e, true, b($$0), ame.a, amx.b.b, anb.c);
   }

   @Nullable
   @Override
   protected amx a(String $$0, amx.c $$1, ti $$2) {
      return amx.a($$0, $$2, false, $$1, ame.a, amx.b.a, anb.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, amx>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
