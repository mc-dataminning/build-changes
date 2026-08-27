import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gom extends atc {
   private static final asy d = new asy(wx.c("resourcePack.vanilla.description"), aa.b().a(asl.a), Optional.empty());
   private static final asb e = asb.a(asy.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wx> f = Map.of(
      "programmer_art", wx.c("resourcePack.programmer_art.name"), "high_contrast", wx.c("resourcePack.high_contrast.name")
   );
   private static final asi g = new asi("vanilla", wx.c("resourcePack.vanilla.name"), atj.c, Optional.of(b));
   private static final ask h = new ask(true, atf.b.b, false);
   private static final ask i = new ask(false, atf.b.a, false);
   private static final akn j = new akn("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gom(Path $$0, euc $$1) {
      super(asl.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static asi a(String $$0, wx $$1) {
      return new asi($$0, $$1, atj.c, Optional.of(ate.a($$0)));
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

   private static asn b(Path $$0) {
      aso $$1 = new aso().a(e).a("minecraft", "realms");
      return $$1.b().a().a(asl.a, $$0).a(g);
   }

   @Override
   protected wx a(String $$0) {
      wx $$1 = f.get($$0);
      return (wx)($$1 != null ? $$1 : wx.b($$0));
   }

   @Nullable
   @Override
   protected atf a(asj $$0) {
      return atf.a(g, b($$0), asl.a, h);
   }

   @Nullable
   @Override
   protected atf a(String $$0, atf.c $$1, wx $$2) {
      return atf.a(a($$0, $$2), $$1, asl.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, atf>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
