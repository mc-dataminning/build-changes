import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hlt extends aul {
   private static final auh e = new auh(xc.c("resourcePack.vanilla.description"), ac.b().a(atv.a), Optional.empty());
   private static final atl f = atl.a(auh.b, e);
   public static final String d = "high_contrast";
   private static final Map<String, xc> g = Map.of(
      "programmer_art", xc.c("resourcePack.programmer_art.name"), "high_contrast", xc.c("resourcePack.high_contrast.name")
   );
   private static final ats h = new ats("vanilla", xc.c("resourcePack.vanilla.name"), aus.c, Optional.of(c));
   private static final atu i = new atu(true, auo.b.b, false);
   private static final atu j = new atu(false, auo.b.a, false);
   private static final alk k = alk.b("resourcepacks");
   @Nullable
   private final Path l;

   public hlt(Path $$0, ffi $$1) {
      super(atv.a, b($$0), k, $$1);
      this.l = this.a($$0);
   }

   private static ats a(String $$0, xc $$1) {
      return new ats($$0, $$1, aus.c, Optional.of(aun.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ac.aU && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static atx b(Path $$0) {
      aty $$1 = new aty().a(f).a("minecraft", "realms");
      return $$1.b().a().a(atv.a, $$0).a(h);
   }

   @Override
   protected xc a(String $$0) {
      xc $$1 = g.get($$0);
      return (xc)($$1 != null ? $$1 : xc.b($$0));
   }

   @Nullable
   @Override
   protected auo a(att $$0) {
      return auo.a(h, b($$0), atv.a, i);
   }

   @Nullable
   @Override
   protected auo a(String $$0, auo.c $$1, xc $$2) {
      return auo.a(a($$0, $$2), $$1, atv.a, j);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, auo>> $$0) {
      super.a($$0);
      if (this.l != null) {
         this.a(this.l, $$0);
      }
   }
}
