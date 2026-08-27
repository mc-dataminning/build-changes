import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gnf extends ast {
   private static final asp d = new asp(ws.c("resourcePack.vanilla.description"), aa.b().a(asc.a), Optional.empty());
   private static final ars e = ars.a(asp.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, ws> f = Map.of(
      "programmer_art", ws.c("resourcePack.programmer_art.name"), "high_contrast", ws.c("resourcePack.high_contrast.name")
   );
   private static final arz g = new arz("vanilla", ws.c("resourcePack.vanilla.name"), ata.c, Optional.of(b));
   private static final asb h = new asb(true, asw.b.b, false);
   private static final asb i = new asb(false, asw.b.a, false);
   private static final akf j = new akf("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gnf(Path $$0, esv $$1) {
      super(asc.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static arz a(String $$0, ws $$1) {
      return new arz($$0, $$1, ata.c, Optional.of(asv.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (aa.aX && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static ase b(Path $$0) {
      asf $$1 = new asf().a(e).a("minecraft", "realms");
      return $$1.b().a().a(asc.a, $$0).a(g);
   }

   @Override
   protected ws a(String $$0) {
      ws $$1 = f.get($$0);
      return (ws)($$1 != null ? $$1 : ws.b($$0));
   }

   @Nullable
   @Override
   protected asw a(asa $$0) {
      return asw.a(g, b($$0), asc.a, h);
   }

   @Nullable
   @Override
   protected asw a(String $$0, asw.c $$1, ws $$2) {
      return asw.a(a($$0, $$2), $$1, asc.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, asw>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
