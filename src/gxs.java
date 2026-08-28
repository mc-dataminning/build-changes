import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gxs extends aty {
   private static final atu d = new atu(xd.c("resourcePack.vanilla.description"), ab.b().a(ath.a), Optional.empty());
   private static final asx e = asx.a(atu.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xd> f = Map.of(
      "programmer_art", xd.c("resourcePack.programmer_art.name"), "high_contrast", xd.c("resourcePack.high_contrast.name")
   );
   private static final ate g = new ate("vanilla", xd.c("resourcePack.vanilla.name"), auf.c, Optional.of(b));
   private static final atg h = new atg(true, aub.b.b, false);
   private static final atg i = new atg(false, aub.b.a, false);
   private static final alc j = alc.b("resourcepacks");
   @Nullable
   private final Path k;

   public gxs(Path $$0, eyi $$1) {
      super(ath.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static ate a(String $$0, xd $$1) {
      return new ate($$0, $$1, auf.c, Optional.of(aua.a($$0)));
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

   private static atj b(Path $$0) {
      atk $$1 = new atk().a(e).a("minecraft", "realms");
      return $$1.b().a().a(ath.a, $$0).a(g);
   }

   @Override
   protected xd a(String $$0) {
      xd $$1 = f.get($$0);
      return (xd)($$1 != null ? $$1 : xd.b($$0));
   }

   @Nullable
   @Override
   protected aub a(atf $$0) {
      return aub.a(g, b($$0), ath.a, h);
   }

   @Nullable
   @Override
   protected aub a(String $$0, aub.c $$1, xd $$2) {
      return aub.a(a($$0, $$2), $$1, ath.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aub>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
