import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hhk extends aue {
   private static final aua e = new aua(wv.c("resourcePack.vanilla.description"), ab.b().a(ato.a), Optional.empty());
   private static final ate f = ate.a(aua.b, e);
   public static final String d = "high_contrast";
   private static final Map<String, wv> g = Map.of(
      "programmer_art", wv.c("resourcePack.programmer_art.name"), "high_contrast", wv.c("resourcePack.high_contrast.name")
   );
   private static final atl h = new atl("vanilla", wv.c("resourcePack.vanilla.name"), aul.c, Optional.of(c));
   private static final atn i = new atn(true, auh.b.b, false);
   private static final atn j = new atn(false, auh.b.a, false);
   private static final ald k = ald.b("resourcepacks");
   @Nullable
   private final Path l;

   public hhk(Path $$0, fck $$1) {
      super(ato.a, b($$0), k, $$1);
      this.l = this.a($$0);
   }

   private static atl a(String $$0, wv $$1) {
      return new atl($$0, $$1, aul.c, Optional.of(aug.a($$0)));
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

   private static atq b(Path $$0) {
      atr $$1 = new atr().a(f).a("minecraft", "realms");
      return $$1.b().a().a(ato.a, $$0).a(h);
   }

   @Override
   protected wv a(String $$0) {
      wv $$1 = g.get($$0);
      return (wv)($$1 != null ? $$1 : wv.b($$0));
   }

   @Nullable
   @Override
   protected auh a(atm $$0) {
      return auh.a(h, b($$0), ato.a, i);
   }

   @Nullable
   @Override
   protected auh a(String $$0, auh.c $$1, wv $$2) {
      return auh.a(a($$0, $$2), $$1, ato.a, j);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, auh>> $$0) {
      super.a($$0);
      if (this.l != null) {
         this.a(this.l, $$0);
      }
   }
}
