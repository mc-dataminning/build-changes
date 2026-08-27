import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gef extends aoy {
   private static final aou c = new aou(vb.c("resourcePack.vanilla.description"), aa.b().a(aoh.a), Optional.empty());
   private static final aob d = aob.a(aou.b, c);
   private static final vb e = vb.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, vb> f = Map.of(
      "programmer_art", vb.c("resourcePack.programmer_art.name"), "high_contrast", vb.c("resourcePack.high_contrast.name")
   );
   private static final agt g = new agt("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public gef(Path $$0, ekr $$1) {
      super(aoh.a, b($$0), g, $$1);
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

   private static aoj b(Path $$0) {
      aok $$1 = new aok().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aoh.a, $$0).c();
   }

   @Override
   protected vb a(String $$0) {
      vb $$1 = f.get($$0);
      return (vb)($$1 != null ? $$1 : vb.b($$0));
   }

   @Nullable
   @Override
   protected apa a(aog $$0) {
      return apa.a("vanilla", e, true, b($$0), aoh.a, apa.b.b, ape.c);
   }

   @Nullable
   @Override
   protected apa a(String $$0, apa.c $$1, vb $$2) {
      return apa.a($$0, $$2, false, $$1, aoh.a, apa.b.a, ape.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, apa>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
