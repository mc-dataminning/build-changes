import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hbx extends aup {
   private static final aul d = new aul(xk.c("resourcePack.vanilla.description"), ab.b().a(aty.a), Optional.empty());
   private static final ato e = ato.a(aul.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xk> f = Map.of(
      "programmer_art", xk.c("resourcePack.programmer_art.name"), "high_contrast", xk.c("resourcePack.high_contrast.name")
   );
   private static final atv g = new atv("vanilla", xk.c("resourcePack.vanilla.name"), auw.c, Optional.of(b));
   private static final atx h = new atx(true, aus.b.b, false);
   private static final atx i = new atx(false, aus.b.a, false);
   private static final alp j = alp.b("resourcepacks");
   @Nullable
   private final Path k;

   public hbx(Path $$0, fbh $$1) {
      super(aty.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static atv a(String $$0, xk $$1) {
      return new atv($$0, $$1, auw.c, Optional.of(aur.a($$0)));
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

   private static aua b(Path $$0) {
      aub $$1 = new aub().a(e).a("minecraft", "realms");
      return $$1.b().a().a(aty.a, $$0).a(g);
   }

   @Override
   protected xk a(String $$0) {
      xk $$1 = f.get($$0);
      return (xk)($$1 != null ? $$1 : xk.b($$0));
   }

   @Nullable
   @Override
   protected aus a(atw $$0) {
      return aus.a(g, b($$0), aty.a, h);
   }

   @Nullable
   @Override
   protected aus a(String $$0, aus.c $$1, xk $$2) {
      return aus.a(a($$0, $$2), $$1, aty.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aus>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
