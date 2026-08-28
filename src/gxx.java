import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gxx extends aua {
   private static final atw d = new atw(xe.c("resourcePack.vanilla.description"), ab.b().a(atj.a), Optional.empty());
   private static final asz e = asz.a(atw.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xe> f = Map.of(
      "programmer_art", xe.c("resourcePack.programmer_art.name"), "high_contrast", xe.c("resourcePack.high_contrast.name")
   );
   private static final atg g = new atg("vanilla", xe.c("resourcePack.vanilla.name"), auh.c, Optional.of(b));
   private static final ati h = new ati(true, aud.b.b, false);
   private static final ati i = new ati(false, aud.b.a, false);
   private static final ale j = ale.b("resourcepacks");
   @Nullable
   private final Path k;

   public gxx(Path $$0, eym $$1) {
      super(atj.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static atg a(String $$0, xe $$1) {
      return new atg($$0, $$1, auh.c, Optional.of(auc.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ab.aW && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static atl b(Path $$0) {
      atm $$1 = new atm().a(e).a("minecraft", "realms");
      return $$1.b().a().a(atj.a, $$0).a(g);
   }

   @Override
   protected xe a(String $$0) {
      xe $$1 = f.get($$0);
      return (xe)($$1 != null ? $$1 : xe.b($$0));
   }

   @Nullable
   @Override
   protected aud a(ath $$0) {
      return aud.a(g, b($$0), atj.a, h);
   }

   @Nullable
   @Override
   protected aud a(String $$0, aud.c $$1, xe $$2) {
      return aud.a(a($$0, $$2), $$1, atj.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aud>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
