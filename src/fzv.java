import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fzv extends ana {
   private static final amw c = new amw(tl.c("resourcePack.vanilla.description"), aa.b().a(amj.a), Optional.empty());
   private static final amd d = amd.a(amw.b, c);
   private static final tl e = tl.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, tl> f = Map.of(
      "programmer_art", tl.c("resourcePack.programmer_art.name"), "high_contrast", tl.c("resourcePack.high_contrast.name")
   );
   private static final aex g = new aex("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public fzv(Path $$0, ehd $$1) {
      super(amj.a, b($$0), g, $$1);
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

   private static aml b(Path $$0) {
      amm $$1 = new amm().a(d).a("minecraft", "realms");
      return $$1.b().a().a(amj.a, $$0).c();
   }

   @Override
   protected tl a(String $$0) {
      tl $$1 = f.get($$0);
      return (tl)($$1 != null ? $$1 : tl.b($$0));
   }

   @Nullable
   @Override
   protected anc a(ami $$0) {
      return anc.a("vanilla", e, true, b($$0), amj.a, anc.b.b, ang.c);
   }

   @Nullable
   @Override
   protected anc a(String $$0, anc.c $$1, tl $$2) {
      return anc.a($$0, $$2, false, $$1, amj.a, anc.b.a, ang.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, anc>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
