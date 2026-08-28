import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class grc extends atj {
   private static final atf d = new atf(wz.c("resourcePack.vanilla.description"), ab.b().a(ass.a), Optional.empty());
   private static final asi e = asi.a(atf.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wz> f = Map.of(
      "programmer_art", wz.c("resourcePack.programmer_art.name"), "high_contrast", wz.c("resourcePack.high_contrast.name")
   );
   private static final asp g = new asp("vanilla", wz.c("resourcePack.vanilla.name"), atq.c, Optional.of(b));
   private static final asr h = new asr(true, atm.b.b, false);
   private static final asr i = new asr(false, atm.b.a, false);
   private static final akr j = akr.b("resourcepacks");
   @Nullable
   private final Path k;

   public grc(Path $$0, ews $$1) {
      super(ass.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static asp a(String $$0, wz $$1) {
      return new asp($$0, $$1, atq.c, Optional.of(atl.a($$0)));
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

   private static asu b(Path $$0) {
      asv $$1 = new asv().a(e).a("minecraft", "realms");
      return $$1.b().a().a(ass.a, $$0).a(g);
   }

   @Override
   protected wz a(String $$0) {
      wz $$1 = f.get($$0);
      return (wz)($$1 != null ? $$1 : wz.b($$0));
   }

   @Nullable
   @Override
   protected atm a(asq $$0) {
      return atm.a(g, b($$0), ass.a, h);
   }

   @Nullable
   @Override
   protected atm a(String $$0, atm.c $$1, wz $$2) {
      return atm.a(a($$0, $$2), $$1, ass.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, atm>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
