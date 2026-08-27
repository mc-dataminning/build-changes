import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ghk extends arg {
   private static final arc c = new arc(vq.c("resourcePack.vanilla.description"), aa.b().a(aqp.a), Optional.empty());
   private static final aqh d = aqh.a(arc.b, c);
   private static final vq e = vq.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, vq> f = Map.of(
      "programmer_art", vq.c("resourcePack.programmer_art.name"), "high_contrast", vq.c("resourcePack.high_contrast.name")
   );
   private static final aiy g = new aiy("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public ghk(Path $$0, eni $$1) {
      super(aqp.a, b($$0), g, $$1);
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

   private static aqr b(Path $$0) {
      aqs $$1 = new aqs().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aqp.a, $$0).c();
   }

   @Override
   protected vq a(String $$0) {
      vq $$1 = f.get($$0);
      return (vq)($$1 != null ? $$1 : vq.b($$0));
   }

   @Nullable
   @Override
   protected ari a(aqo $$0) {
      return ari.a("vanilla", e, true, b($$0), aqp.a, ari.b.b, arm.c);
   }

   @Nullable
   @Override
   protected ari a(String $$0, ari.c $$1, vq $$2) {
      return ari.a($$0, $$2, false, $$1, aqp.a, ari.b.a, arm.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, ari>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
