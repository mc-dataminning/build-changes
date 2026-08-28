import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gxb extends atx {
   private static final att d = new att(xd.c("resourcePack.vanilla.description"), ab.b().a(atg.a), Optional.empty());
   private static final asw e = asw.a(att.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xd> f = Map.of(
      "programmer_art", xd.c("resourcePack.programmer_art.name"), "high_contrast", xd.c("resourcePack.high_contrast.name")
   );
   private static final atd g = new atd("vanilla", xd.c("resourcePack.vanilla.name"), aue.c, Optional.of(b));
   private static final atf h = new atf(true, aua.b.b, false);
   private static final atf i = new atf(false, aua.b.a, false);
   private static final alb j = alb.b("resourcepacks");
   @Nullable
   private final Path k;

   public gxb(Path $$0, exu $$1) {
      super(atg.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static atd a(String $$0, xd $$1) {
      return new atd($$0, $$1, aue.c, Optional.of(atz.a($$0)));
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

   private static ati b(Path $$0) {
      atj $$1 = new atj().a(e).a("minecraft", "realms");
      return $$1.b().a().a(atg.a, $$0).a(g);
   }

   @Override
   protected xd a(String $$0) {
      xd $$1 = f.get($$0);
      return (xd)($$1 != null ? $$1 : xd.b($$0));
   }

   @Nullable
   @Override
   protected aua a(ate $$0) {
      return aua.a(g, b($$0), atg.a, h);
   }

   @Nullable
   @Override
   protected aua a(String $$0, aua.c $$1, xd $$2) {
      return aua.a(a($$0, $$2), $$1, atg.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aua>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
