import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fzx extends anb {
   private static final amx c = new amx(tn.c("resourcePack.vanilla.description"), aa.b().a(amk.a), Optional.empty());
   private static final ame d = ame.a(amx.b, c);
   private static final tn e = tn.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, tn> f = Map.of(
      "programmer_art", tn.c("resourcePack.programmer_art.name"), "high_contrast", tn.c("resourcePack.high_contrast.name")
   );
   private static final aey g = new aey("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public fzx(Path $$0, ehf $$1) {
      super(amk.a, b($$0), g, $$1);
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

   private static amm b(Path $$0) {
      amn $$1 = new amn().a(d).a("minecraft", "realms");
      return $$1.b().a().a(amk.a, $$0).c();
   }

   @Override
   protected tn a(String $$0) {
      tn $$1 = f.get($$0);
      return (tn)($$1 != null ? $$1 : tn.b($$0));
   }

   @Nullable
   @Override
   protected and a(amj $$0) {
      return and.a("vanilla", e, true, b($$0), amk.a, and.b.b, anh.c);
   }

   @Nullable
   @Override
   protected and a(String $$0, and.c $$1, tn $$2) {
      return and.a($$0, $$2, false, $$1, amk.a, and.b.a, anh.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, and>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
