import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hlh extends aus {
   private static final auo e = new auo(xg.c("resourcePack.vanilla.description"), ac.b().a(auc.a), Optional.empty());
   private static final ats f = ats.a(auo.b, e);
   public static final String d = "high_contrast";
   private static final Map<String, xg> g = Map.of(
      "programmer_art", xg.c("resourcePack.programmer_art.name"), "high_contrast", xg.c("resourcePack.high_contrast.name")
   );
   private static final atz h = new atz("vanilla", xg.c("resourcePack.vanilla.name"), ava.c, Optional.of(c));
   private static final aub i = new aub(true, auv.b.b, false);
   private static final aub j = new aub(false, auv.b.a, false);
   private static final alr k = alr.b("resourcepacks");
   @Nullable
   private final Path l;

   public hlh(Path $$0, ffs $$1) {
      super(auc.a, b($$0), k, $$1);
      this.l = this.a($$0);
   }

   private static atz a(String $$0, xg $$1) {
      return new atz($$0, $$1, ava.c, Optional.of(auu.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ac.aV && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static aue b(Path $$0) {
      auf $$1 = new auf().a(f).a("minecraft", "realms");
      return $$1.b().a().a(auc.a, $$0).a(h);
   }

   @Override
   protected xg a(String $$0) {
      xg $$1 = g.get($$0);
      return (xg)($$1 != null ? $$1 : xg.b($$0));
   }

   @Nullable
   @Override
   protected auv a(aua $$0) {
      return auv.a(h, b($$0), auc.a, i);
   }

   @Nullable
   @Override
   protected auv a(String $$0, auv.c $$1, xg $$2) {
      return auv.a(a($$0, $$2), $$1, auc.a, j);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, auv>> $$0) {
      super.a($$0);
      if (this.l != null) {
         this.a(this.l, $$0);
      }
   }
}
