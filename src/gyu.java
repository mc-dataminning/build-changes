import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gyu extends auf {
   private static final aub d = new aub(xi.c("resourcePack.vanilla.description"), ab.b().a(ato.a), Optional.empty());
   private static final ate e = ate.a(aub.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xi> f = Map.of(
      "programmer_art", xi.c("resourcePack.programmer_art.name"), "high_contrast", xi.c("resourcePack.high_contrast.name")
   );
   private static final atl g = new atl("vanilla", xi.c("resourcePack.vanilla.name"), aum.c, Optional.of(b));
   private static final atn h = new atn(true, aui.b.b, false);
   private static final atn i = new atn(false, aui.b.a, false);
   private static final ali j = ali.b("resourcepacks");
   @Nullable
   private final Path k;

   public gyu(Path $$0, ezd $$1) {
      super(ato.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static atl a(String $$0, xi $$1) {
      return new atl($$0, $$1, aum.c, Optional.of(auh.a($$0)));
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

   private static atq b(Path $$0) {
      atr $$1 = new atr().a(e).a("minecraft", "realms");
      return $$1.b().a().a(ato.a, $$0).a(g);
   }

   @Override
   protected xi a(String $$0) {
      xi $$1 = f.get($$0);
      return (xi)($$1 != null ? $$1 : xi.b($$0));
   }

   @Nullable
   @Override
   protected aui a(atm $$0) {
      return aui.a(g, b($$0), ato.a, h);
   }

   @Nullable
   @Override
   protected aui a(String $$0, aui.c $$1, xi $$2) {
      return aui.a(a($$0, $$2), $$1, ato.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aui>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
