import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hjo extends auh {
   private static final aud e = new aud(wy.c("resourcePack.vanilla.description"), ab.b().a(atr.a), Optional.empty());
   private static final ath f = ath.a(aud.b, e);
   public static final String d = "high_contrast";
   private static final Map<String, wy> g = Map.of(
      "programmer_art", wy.c("resourcePack.programmer_art.name"), "high_contrast", wy.c("resourcePack.high_contrast.name")
   );
   private static final ato h = new ato("vanilla", wy.c("resourcePack.vanilla.name"), auo.c, Optional.of(c));
   private static final atq i = new atq(true, auk.b.b, false);
   private static final atq j = new atq(false, auk.b.a, false);
   private static final alg k = alg.b("resourcepacks");
   @Nullable
   private final Path l;

   public hjo(Path $$0, feg $$1) {
      super(atr.a, b($$0), k, $$1);
      this.l = this.a($$0);
   }

   private static ato a(String $$0, wy $$1) {
      return new ato($$0, $$1, auo.c, Optional.of(auj.a($$0)));
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

   private static att b(Path $$0) {
      atu $$1 = new atu().a(f).a("minecraft", "realms");
      return $$1.b().a().a(atr.a, $$0).a(h);
   }

   @Override
   protected wy a(String $$0) {
      wy $$1 = g.get($$0);
      return (wy)($$1 != null ? $$1 : wy.b($$0));
   }

   @Nullable
   @Override
   protected auk a(atp $$0) {
      return auk.a(h, b($$0), atr.a, i);
   }

   @Nullable
   @Override
   protected auk a(String $$0, auk.c $$1, wy $$2) {
      return auk.a(a($$0, $$2), $$1, atr.a, j);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, auk>> $$0) {
      super.a($$0);
      if (this.l != null) {
         this.a(this.l, $$0);
      }
   }
}
