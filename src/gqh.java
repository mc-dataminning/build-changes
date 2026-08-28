import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gqh extends atb {
   private static final asx d = new asx(wu.c("resourcePack.vanilla.description"), aa.b().a(ask.a), Optional.empty());
   private static final asa e = asa.a(asx.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wu> f = Map.of(
      "programmer_art", wu.c("resourcePack.programmer_art.name"), "high_contrast", wu.c("resourcePack.high_contrast.name")
   );
   private static final ash g = new ash("vanilla", wu.c("resourcePack.vanilla.name"), ati.c, Optional.of(b));
   private static final asj h = new asj(true, ate.b.b, false);
   private static final asj i = new asj(false, ate.b.a, false);
   private static final akk j = new akk("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gqh(Path $$0, evx $$1) {
      super(ask.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static ash a(String $$0, wu $$1) {
      return new ash($$0, $$1, ati.c, Optional.of(atd.a($$0)));
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

   private static asm b(Path $$0) {
      asn $$1 = new asn().a(e).a("minecraft", "realms");
      return $$1.b().a().a(ask.a, $$0).a(g);
   }

   @Override
   protected wu a(String $$0) {
      wu $$1 = f.get($$0);
      return (wu)($$1 != null ? $$1 : wu.b($$0));
   }

   @Nullable
   @Override
   protected ate a(asi $$0) {
      return ate.a(g, b($$0), ask.a, h);
   }

   @Nullable
   @Override
   protected ate a(String $$0, ate.c $$1, wu $$2) {
      return ate.a(a($$0, $$2), $$1, ask.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, ate>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
