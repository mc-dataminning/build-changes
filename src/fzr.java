import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fzr extends anc {
   private static final amy c = new amy(tl.c("resourcePack.vanilla.description"), aa.b().a(aml.a), Optional.empty());
   private static final amf d = amf.a(amy.b, c);
   private static final tl e = tl.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, tl> f = Map.of(
      "programmer_art", tl.c("resourcePack.programmer_art.name"), "high_contrast", tl.c("resourcePack.high_contrast.name")
   );
   private static final aez g = new aez("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public fzr(Path $$0, egx $$1) {
      super(aml.a, b($$0), g, $$1);
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

   private static amn b(Path $$0) {
      amo $$1 = new amo().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aml.a, $$0).c();
   }

   @Override
   protected tl a(String $$0) {
      tl $$1 = f.get($$0);
      return (tl)($$1 != null ? $$1 : tl.b($$0));
   }

   @Nullable
   @Override
   protected ane a(amk $$0) {
      return ane.a("vanilla", e, true, b($$0), aml.a, ane.b.b, ani.c);
   }

   @Nullable
   @Override
   protected ane a(String $$0, ane.c $$1, tl $$2) {
      return ane.a($$0, $$2, false, $$1, aml.a, ane.b.a, ani.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, ane>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
