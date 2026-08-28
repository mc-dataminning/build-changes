import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gpl extends atq {
   private static final atm d = new atm(xl.c("resourcePack.vanilla.description"), aa.b().a(asz.a), Optional.empty());
   private static final asp e = asp.a(atm.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, xl> f = Map.of(
      "programmer_art", xl.c("resourcePack.programmer_art.name"), "high_contrast", xl.c("resourcePack.high_contrast.name")
   );
   private static final asw g = new asw("vanilla", xl.c("resourcePack.vanilla.name"), atx.c, Optional.of(b));
   private static final asy h = new asy(true, att.b.b, false);
   private static final asy i = new asy(false, att.b.a, false);
   private static final alb j = new alb("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gpl(Path $$0, evc $$1) {
      super(asz.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static asw a(String $$0, xl $$1) {
      return new asw($$0, $$1, atx.c, Optional.of(ats.a($$0)));
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

   private static atb b(Path $$0) {
      atc $$1 = new atc().a(e).a("minecraft", "realms");
      return $$1.b().a().a(asz.a, $$0).a(g);
   }

   @Override
   protected xl a(String $$0) {
      xl $$1 = f.get($$0);
      return (xl)($$1 != null ? $$1 : xl.b($$0));
   }

   @Nullable
   @Override
   protected att a(asx $$0) {
      return att.a(g, b($$0), asz.a, h);
   }

   @Nullable
   @Override
   protected att a(String $$0, att.c $$1, xl $$2) {
      return att.a(a($$0, $$2), $$1, asz.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, att>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
