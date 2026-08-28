import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gzk extends aui {
   private static final aue d = new aue(xl.c("resourcePack.vanilla.description"), ab.b().a(atr.a), Optional.empty());
   private static final ath e = ath.a(aue.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xl> f = Map.of(
      "programmer_art", xl.c("resourcePack.programmer_art.name"), "high_contrast", xl.c("resourcePack.high_contrast.name")
   );
   private static final ato g = new ato("vanilla", xl.c("resourcePack.vanilla.name"), aup.c, Optional.of(b));
   private static final atq h = new atq(true, aul.b.b, false);
   private static final atq i = new atq(false, aul.b.a, false);
   private static final all j = all.b("resourcepacks");
   @Nullable
   private final Path k;

   public gzk(Path $$0, ezh $$1) {
      super(atr.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static ato a(String $$0, xl $$1) {
      return new ato($$0, $$1, aup.c, Optional.of(auk.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ab.aV && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static att b(Path $$0) {
      atu $$1 = new atu().a(e).a("minecraft", "realms");
      return $$1.b().a().a(atr.a, $$0).a(g);
   }

   @Override
   protected xl a(String $$0) {
      xl $$1 = f.get($$0);
      return (xl)($$1 != null ? $$1 : xl.b($$0));
   }

   @Nullable
   @Override
   protected aul a(atp $$0) {
      return aul.a(g, b($$0), atr.a, h);
   }

   @Nullable
   @Override
   protected aul a(String $$0, aul.c $$1, xl $$2) {
      return aul.a(a($$0, $$2), $$1, atr.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aul>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
