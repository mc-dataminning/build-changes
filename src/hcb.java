import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hcb extends ava {
   private static final auv d = new auv(xv.c("resourcePack.vanilla.description"), ab.b().a(aui.a), Optional.empty());
   private static final aty e = aty.a(auv.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xv> f = Map.of(
      "programmer_art", xv.c("resourcePack.programmer_art.name"), "high_contrast", xv.c("resourcePack.high_contrast.name")
   );
   private static final auf g = new auf("vanilla", xv.c("resourcePack.vanilla.name"), avh.c, Optional.of(b));
   private static final auh h = new auh(true, avd.b.b, false);
   private static final auh i = new auh(false, avd.b.a, false);
   private static final alz j = alz.b("resourcepacks");
   @Nullable
   private final Path k;

   public hcb(Path $$0, fbn $$1) {
      super(aui.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static auf a(String $$0, xv $$1) {
      return new auf($$0, $$1, avh.c, Optional.of(avc.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ab.aU && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static auk b(Path $$0) {
      aul $$1 = new aul().a(e).a("minecraft", "realms");
      return $$1.b().a().a(aui.a, $$0).a(g);
   }

   @Override
   protected xv a(String $$0) {
      xv $$1 = f.get($$0);
      return (xv)($$1 != null ? $$1 : xv.b($$0));
   }

   @Nullable
   @Override
   protected avd a(aug $$0) {
      return avd.a(g, b($$0), aui.a, h);
   }

   @Nullable
   @Override
   protected avd a(String $$0, avd.c $$1, xv $$2) {
      return avd.a(a($$0, $$2), $$1, aui.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, avd>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
