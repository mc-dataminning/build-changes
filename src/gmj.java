import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gmj extends asj {
   private static final asf d = new asf(wi.c("resourcePack.vanilla.description"), aa.b().a(ars.a), Optional.empty());
   private static final ari e = ari.a(asf.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wi> f = Map.of(
      "programmer_art", wi.c("resourcePack.programmer_art.name"), "high_contrast", wi.c("resourcePack.high_contrast.name")
   );
   private static final arp g = new arp("vanilla", wi.c("resourcePack.vanilla.name"), asq.c, Optional.of(b));
   private static final arr h = new arr(true, asm.b.b, false);
   private static final arr i = new arr(false, asm.b.a, false);
   private static final ajv j = new ajv("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gmj(Path $$0, erz $$1) {
      super(ars.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static arp a(String $$0, wi $$1) {
      return new arp($$0, $$1, asq.c, Optional.of(asl.a($$0)));
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

   private static aru b(Path $$0) {
      arv $$1 = new arv().a(e).a("minecraft", "realms");
      return $$1.b().a().a(ars.a, $$0).a(g);
   }

   @Override
   protected wi a(String $$0) {
      wi $$1 = f.get($$0);
      return (wi)($$1 != null ? $$1 : wi.b($$0));
   }

   @Nullable
   @Override
   protected asm a(arq $$0) {
      return asm.a(g, b($$0), ars.a, h);
   }

   @Nullable
   @Override
   protected asm a(String $$0, asm.c $$1, wi $$2) {
      return asm.a(a($$0, $$2), $$1, ars.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, asm>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
