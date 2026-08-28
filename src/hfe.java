import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hfe extends att {
   private static final atp d = new atp(wo.c("resourcePack.vanilla.description"), ab.b().a(atd.a), Optional.empty());
   private static final ast e = ast.a(atp.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wo> f = Map.of(
      "programmer_art", wo.c("resourcePack.programmer_art.name"), "high_contrast", wo.c("resourcePack.high_contrast.name")
   );
   private static final ata g = new ata("vanilla", wo.c("resourcePack.vanilla.name"), aua.c, Optional.of(b));
   private static final atc h = new atc(true, atw.b.b, false);
   private static final atc i = new atc(false, atw.b.a, false);
   private static final aku j = aku.b("resourcepacks");
   @Nullable
   private final Path k;

   public hfe(Path $$0, fao $$1) {
      super(atd.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static ata a(String $$0, wo $$1) {
      return new ata($$0, $$1, aua.c, Optional.of(atv.a($$0)));
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

   private static atf b(Path $$0) {
      atg $$1 = new atg().a(e).a("minecraft", "realms");
      return $$1.b().a().a(atd.a, $$0).a(g);
   }

   @Override
   protected wo a(String $$0) {
      wo $$1 = f.get($$0);
      return (wo)($$1 != null ? $$1 : wo.b($$0));
   }

   @Nullable
   @Override
   protected atw a(atb $$0) {
      return atw.a(g, b($$0), atd.a, h);
   }

   @Nullable
   @Override
   protected atw a(String $$0, atw.c $$1, wo $$2) {
      return atw.a(a($$0, $$2), $$1, atd.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, atw>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
