import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gnp extends asw {
   private static final ass d = new ass(wu.c("resourcePack.vanilla.description"), aa.b().a(asf.a), Optional.empty());
   private static final arv e = arv.a(ass.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wu> f = Map.of(
      "programmer_art", wu.c("resourcePack.programmer_art.name"), "high_contrast", wu.c("resourcePack.high_contrast.name")
   );
   private static final asc g = new asc("vanilla", wu.c("resourcePack.vanilla.name"), atd.c, Optional.of(b));
   private static final ase h = new ase(true, asz.b.b, false);
   private static final ase i = new ase(false, asz.b.a, false);
   private static final akh j = new akh("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gnp(Path $$0, etf $$1) {
      super(asf.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static asc a(String $$0, wu $$1) {
      return new asc($$0, $$1, atd.c, Optional.of(asy.a($$0)));
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

   private static ash b(Path $$0) {
      asi $$1 = new asi().a(e).a("minecraft", "realms");
      return $$1.b().a().a(asf.a, $$0).a(g);
   }

   @Override
   protected wu a(String $$0) {
      wu $$1 = f.get($$0);
      return (wu)($$1 != null ? $$1 : wu.b($$0));
   }

   @Nullable
   @Override
   protected asz a(asd $$0) {
      return asz.a(g, b($$0), asf.a, h);
   }

   @Nullable
   @Override
   protected asz a(String $$0, asz.c $$1, wu $$2) {
      return asz.a(a($$0, $$2), $$1, asf.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, asz>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
