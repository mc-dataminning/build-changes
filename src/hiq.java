import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hiq extends auf {
   private static final aub e = new aub(ww.c("resourcePack.vanilla.description"), ab.b().a(atp.a), Optional.empty());
   private static final atf f = atf.a(aub.b, e);
   public static final String d = "high_contrast";
   private static final Map<String, ww> g = Map.of(
      "programmer_art", ww.c("resourcePack.programmer_art.name"), "high_contrast", ww.c("resourcePack.high_contrast.name")
   );
   private static final atm h = new atm("vanilla", ww.c("resourcePack.vanilla.name"), aum.c, Optional.of(c));
   private static final ato i = new ato(true, aui.b.b, false);
   private static final ato j = new ato(false, aui.b.a, false);
   private static final ale k = ale.b("resourcepacks");
   @Nullable
   private final Path l;

   public hiq(Path $$0, fdm $$1) {
      super(atp.a, b($$0), k, $$1);
      this.l = this.a($$0);
   }

   private static atm a(String $$0, ww $$1) {
      return new atm($$0, $$1, aum.c, Optional.of(auh.a($$0)));
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

   private static atr b(Path $$0) {
      ats $$1 = new ats().a(f).a("minecraft", "realms");
      return $$1.b().a().a(atp.a, $$0).a(h);
   }

   @Override
   protected ww a(String $$0) {
      ww $$1 = g.get($$0);
      return (ww)($$1 != null ? $$1 : ww.b($$0));
   }

   @Nullable
   @Override
   protected aui a(atn $$0) {
      return aui.a(h, b($$0), atp.a, i);
   }

   @Nullable
   @Override
   protected aui a(String $$0, aui.c $$1, ww $$2) {
      return aui.a(a($$0, $$2), $$1, atp.a, j);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aui>> $$0) {
      super.a($$0);
      if (this.l != null) {
         this.a(this.l, $$0);
      }
   }
}
