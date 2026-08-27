import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fzv extends amz {
   private static final amv c = new amv(tl.c("resourcePack.vanilla.description"), aa.b().a(ami.a), Optional.empty());
   private static final amc d = amc.a(amv.b, c);
   private static final tl e = tl.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, tl> f = Map.of(
      "programmer_art", tl.c("resourcePack.programmer_art.name"), "high_contrast", tl.c("resourcePack.high_contrast.name")
   );
   private static final aew g = new aew("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public fzv(Path $$0, ehd $$1) {
      super(ami.a, b($$0), g, $$1);
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

   private static amk b(Path $$0) {
      aml $$1 = new aml().a(d).a("minecraft", "realms");
      return $$1.b().a().a(ami.a, $$0).c();
   }

   @Override
   protected tl a(String $$0) {
      tl $$1 = f.get($$0);
      return (tl)($$1 != null ? $$1 : tl.b($$0));
   }

   @Nullable
   @Override
   protected anb a(amh $$0) {
      return anb.a("vanilla", e, true, b($$0), ami.a, anb.b.b, anf.c);
   }

   @Nullable
   @Override
   protected anb a(String $$0, anb.c $$1, tl $$2) {
      return anb.a($$0, $$2, false, $$1, ami.a, anb.b.a, anf.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, anb>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
