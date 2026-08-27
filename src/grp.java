import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class grp extends ati {
   private static final ate d = new ate(xe.c("resourcePack.vanilla.description"), ab.b().a(asr.a), Optional.empty());
   private static final ash e = ash.a(ate.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xe> f = Map.of(
      "programmer_art", xe.c("resourcePack.programmer_art.name"), "high_contrast", xe.c("resourcePack.high_contrast.name")
   );
   private static final aso g = new aso("vanilla", xe.c("resourcePack.vanilla.name"), atp.c, Optional.of(b));
   private static final asq h = new asq(true, atl.b.b, false);
   private static final asq i = new asq(false, atl.b.a, false);
   private static final akt j = new akt("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public grp(Path $$0, ewk $$1) {
      super(asr.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static aso a(String $$0, xe $$1) {
      return new aso($$0, $$1, atp.c, Optional.of(atk.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ab.aX && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static ast b(Path $$0) {
      asu $$1 = new asu().a(e).a("minecraft", "realms", "nothingtoseeheremovealong");
      return $$1.b().a().a(asr.a, $$0).a(g);
   }

   @Override
   protected xe a(String $$0) {
      xe $$1 = f.get($$0);
      return (xe)($$1 != null ? $$1 : xe.b($$0));
   }

   @Nullable
   @Override
   protected atl a(asp $$0) {
      return atl.a(g, b($$0), asr.a, h);
   }

   @Nullable
   @Override
   protected atl a(String $$0, atl.c $$1, xe $$2) {
      return atl.a(a($$0, $$2), $$1, asr.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, atl>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
