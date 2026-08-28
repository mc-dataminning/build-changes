import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gpz extends asz {
   private static final asv d = new asv(wu.c("resourcePack.vanilla.description"), aa.b().a(asi.a), Optional.empty());
   private static final ary e = ary.a(asv.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wu> f = Map.of(
      "programmer_art", wu.c("resourcePack.programmer_art.name"), "high_contrast", wu.c("resourcePack.high_contrast.name")
   );
   private static final asf g = new asf("vanilla", wu.c("resourcePack.vanilla.name"), atg.c, Optional.of(b));
   private static final ash h = new ash(true, atc.b.b, false);
   private static final ash i = new ash(false, atc.b.a, false);
   private static final akk j = new akk("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gpz(Path $$0, evp $$1) {
      super(asi.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static asf a(String $$0, wu $$1) {
      return new asf($$0, $$1, atg.c, Optional.of(atb.a($$0)));
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

   private static ask b(Path $$0) {
      asl $$1 = new asl().a(e).a("minecraft", "realms");
      return $$1.b().a().a(asi.a, $$0).a(g);
   }

   @Override
   protected wu a(String $$0) {
      wu $$1 = f.get($$0);
      return (wu)($$1 != null ? $$1 : wu.b($$0));
   }

   @Nullable
   @Override
   protected atc a(asg $$0) {
      return atc.a(g, b($$0), asi.a, h);
   }

   @Nullable
   @Override
   protected atc a(String $$0, atc.c $$1, wu $$2) {
      return atc.a(a($$0, $$2), $$1, asi.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, atc>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
