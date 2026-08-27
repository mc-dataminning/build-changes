import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gfc extends apn {
   private static final apj c = new apj(vf.c("resourcePack.vanilla.description"), aa.b().a(aow.a), Optional.empty());
   private static final aop d = aop.a(apj.b, c);
   private static final vf e = vf.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, vf> f = Map.of(
      "programmer_art", vf.c("resourcePack.programmer_art.name"), "high_contrast", vf.c("resourcePack.high_contrast.name")
   );
   private static final ahg g = new ahg("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public gfc(Path $$0, eli $$1) {
      super(aow.a, b($$0), g, $$1);
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

   private static aoy b(Path $$0) {
      aoz $$1 = new aoz().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aow.a, $$0).c();
   }

   @Override
   protected vf a(String $$0) {
      vf $$1 = f.get($$0);
      return (vf)($$1 != null ? $$1 : vf.b($$0));
   }

   @Nullable
   @Override
   protected app a(aov $$0) {
      return app.a("vanilla", e, true, b($$0), aow.a, app.b.b, apt.c);
   }

   @Nullable
   @Override
   protected app a(String $$0, app.c $$1, vf $$2) {
      return app.a($$0, $$2, false, $$1, aow.a, app.b.a, apt.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, app>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
