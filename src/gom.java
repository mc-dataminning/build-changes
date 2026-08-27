import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gom extends atb {
   private static final asx d = new asx(wx.c("resourcePack.vanilla.description"), aa.b().a(ask.a), Optional.empty());
   private static final asa e = asa.a(asx.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wx> f = Map.of(
      "programmer_art", wx.c("resourcePack.programmer_art.name"), "high_contrast", wx.c("resourcePack.high_contrast.name")
   );
   private static final ash g = new ash("vanilla", wx.c("resourcePack.vanilla.name"), ati.c, Optional.of(b));
   private static final asj h = new asj(true, ate.b.b, false);
   private static final asj i = new asj(false, ate.b.a, false);
   private static final akm j = new akm("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gom(Path $$0, eua $$1) {
      super(ask.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static ash a(String $$0, wx $$1) {
      return new ash($$0, $$1, ati.c, Optional.of(atd.a($$0)));
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

   private static asm b(Path $$0) {
      asn $$1 = new asn().a(e).a("minecraft", "realms");
      return $$1.b().a().a(ask.a, $$0).a(g);
   }

   @Override
   protected wx a(String $$0) {
      wx $$1 = f.get($$0);
      return (wx)($$1 != null ? $$1 : wx.b($$0));
   }

   @Nullable
   @Override
   protected ate a(asi $$0) {
      return ate.a(g, b($$0), ask.a, h);
   }

   @Nullable
   @Override
   protected ate a(String $$0, ate.c $$1, wx $$2) {
      return ate.a(a($$0, $$2), $$1, ask.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, ate>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
