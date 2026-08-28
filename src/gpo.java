import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gpo extends att {
   private static final atp d = new atp(xo.c("resourcePack.vanilla.description"), aa.b().a(atc.a), Optional.empty());
   private static final ass e = ass.a(atp.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xo> f = Map.of(
      "programmer_art", xo.c("resourcePack.programmer_art.name"), "high_contrast", xo.c("resourcePack.high_contrast.name")
   );
   private static final asz g = new asz("vanilla", xo.c("resourcePack.vanilla.name"), aua.c, Optional.of(b));
   private static final atb h = new atb(true, atw.b.b, false);
   private static final atb i = new atb(false, atw.b.a, false);
   private static final ale j = new ale("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gpo(Path $$0, evf $$1) {
      super(atc.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static asz a(String $$0, xo $$1) {
      return new asz($$0, $$1, aua.c, Optional.of(atv.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (aa.aX && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static ate b(Path $$0) {
      atf $$1 = new atf().a(e).a("minecraft", "realms");
      return $$1.b().a().a(atc.a, $$0).a(g);
   }

   @Override
   protected xo a(String $$0) {
      xo $$1 = f.get($$0);
      return (xo)($$1 != null ? $$1 : xo.b($$0));
   }

   @Nullable
   @Override
   protected atw a(ata $$0) {
      return atw.a(g, b($$0), atc.a, h);
   }

   @Nullable
   @Override
   protected atw a(String $$0, atw.c $$1, xo $$2) {
      return atw.a(a($$0, $$2), $$1, atc.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, atw>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
