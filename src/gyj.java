import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gyj extends aue {
   private static final aua d = new aua(xh.c("resourcePack.vanilla.description"), ab.b().a(atn.a), Optional.empty());
   private static final atd e = atd.a(aua.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xh> f = Map.of(
      "programmer_art", xh.c("resourcePack.programmer_art.name"), "high_contrast", xh.c("resourcePack.high_contrast.name")
   );
   private static final atk g = new atk("vanilla", xh.c("resourcePack.vanilla.name"), aul.c, Optional.of(b));
   private static final atm h = new atm(true, auh.b.b, false);
   private static final atm i = new atm(false, auh.b.a, false);
   private static final alh j = alh.b("resourcepacks");
   @Nullable
   private final Path k;

   public gyj(Path $$0, eyx $$1) {
      super(atn.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static atk a(String $$0, xh $$1) {
      return new atk($$0, $$1, aul.c, Optional.of(aug.a($$0)));
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

   private static atp b(Path $$0) {
      atq $$1 = new atq().a(e).a("minecraft", "realms");
      return $$1.b().a().a(atn.a, $$0).a(g);
   }

   @Override
   protected xh a(String $$0) {
      xh $$1 = f.get($$0);
      return (xh)($$1 != null ? $$1 : xh.b($$0));
   }

   @Nullable
   @Override
   protected auh a(atl $$0) {
      return auh.a(g, b($$0), atn.a, h);
   }

   @Nullable
   @Override
   protected auh a(String $$0, auh.c $$1, xh $$2) {
      return auh.a(a($$0, $$2), $$1, atn.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, auh>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
