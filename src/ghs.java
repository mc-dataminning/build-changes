import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ghs extends arh {
   private static final ard c = new ard(vq.c("resourcePack.vanilla.description"), aa.b().a(aqq.a), Optional.empty());
   private static final aqi d = aqi.a(ard.b, c);
   private static final vq e = vq.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, vq> f = Map.of(
      "programmer_art", vq.c("resourcePack.programmer_art.name"), "high_contrast", vq.c("resourcePack.high_contrast.name")
   );
   private static final aiy g = new aiy("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public ghs(Path $$0, enp $$1) {
      super(aqq.a, b($$0), g, $$1);
      this.h = this.a($$0);
   }

   @Nullable
   private Path a(Path $$0) {
      if (aa.aU && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static aqs b(Path $$0) {
      aqt $$1 = new aqt().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aqq.a, $$0).c();
   }

   @Override
   protected vq a(String $$0) {
      vq $$1 = f.get($$0);
      return (vq)($$1 != null ? $$1 : vq.b($$0));
   }

   @Nullable
   @Override
   protected arj a(aqp $$0) {
      return arj.a("vanilla", e, true, b($$0), aqq.a, arj.b.b, arn.c);
   }

   @Nullable
   @Override
   protected arj a(String $$0, arj.c $$1, vq $$2) {
      return arj.a($$0, $$2, false, $$1, aqq.a, arj.b.a, arn.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, arj>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
