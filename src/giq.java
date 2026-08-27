import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class giq extends arl {
   private static final arh c = new arh(vs.c("resourcePack.vanilla.description"), aa.b().a(aqu.a), Optional.empty());
   private static final aqm d = aqm.a(arh.b, c);
   private static final vs e = vs.c("resourcePack.vanilla.name");
   public static final String b = "high_contrast";
   private static final Map<String, vs> f = Map.of(
      "programmer_art", vs.c("resourcePack.programmer_art.name"), "high_contrast", vs.c("resourcePack.high_contrast.name")
   );
   private static final ajc g = new ajc("minecraft", "resourcepacks");
   @Nullable
   private final Path h;

   public giq(Path $$0, eol $$1) {
      super(aqu.a, b($$0), g, $$1);
      this.h = this.a($$0);
   }

   @Nullable
   private Path a(Path $$0) {
      if (aa.aV && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static aqw b(Path $$0) {
      aqx $$1 = new aqx().a(d).a("minecraft", "realms");
      return $$1.b().a().a(aqu.a, $$0).c();
   }

   @Override
   protected vs a(String $$0) {
      vs $$1 = f.get($$0);
      return (vs)($$1 != null ? $$1 : vs.b($$0));
   }

   @Nullable
   @Override
   protected arn a(aqt $$0) {
      return arn.a("vanilla", e, true, b($$0), aqu.a, arn.b.b, arr.c);
   }

   @Nullable
   @Override
   protected arn a(String $$0, arn.c $$1, vs $$2) {
      return arn.a($$0, $$2, false, $$1, aqu.a, arn.b.a, arr.c);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, arn>> $$0) {
      super.a($$0);
      if (this.h != null) {
         this.a(this.h, $$0);
      }
   }
}
