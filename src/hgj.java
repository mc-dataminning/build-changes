import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hgj extends atu {
   private static final atq d = new atq(wp.c("resourcePack.vanilla.description"), ab.b().a(ate.a), Optional.empty());
   private static final asu e = asu.a(atq.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wp> f = Map.of(
      "programmer_art", wp.c("resourcePack.programmer_art.name"), "high_contrast", wp.c("resourcePack.high_contrast.name")
   );
   private static final atb g = new atb("vanilla", wp.c("resourcePack.vanilla.name"), aub.c, Optional.of(b));
   private static final atd h = new atd(true, atx.b.b, false);
   private static final atd i = new atd(false, atx.b.a, false);
   private static final aku j = aku.b("resourcepacks");
   @Nullable
   private final Path k;

   public hgj(Path $$0, fbn $$1) {
      super(ate.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static atb a(String $$0, wp $$1) {
      return new atb($$0, $$1, aub.c, Optional.of(atw.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ab.aU && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static atg b(Path $$0) {
      ath $$1 = new ath().a(e).a("minecraft", "realms");
      return $$1.b().a().a(ate.a, $$0).a(g);
   }

   @Override
   protected wp a(String $$0) {
      wp $$1 = f.get($$0);
      return (wp)($$1 != null ? $$1 : wp.b($$0));
   }

   @Nullable
   @Override
   protected atx a(atc $$0) {
      return atx.a(g, b($$0), ate.a, h);
   }

   @Nullable
   @Override
   protected atx a(String $$0, atx.c $$1, wp $$2) {
      return atx.a(a($$0, $$2), $$1, ate.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, atx>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
