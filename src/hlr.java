import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hlr extends auj {
   private static final auf e = new auf(xa.c("resourcePack.vanilla.description"), ac.b().a(att.a), Optional.empty());
   private static final atj f = atj.a(auf.b, e);
   public static final String d = "high_contrast";
   private static final Map<String, xa> g = Map.of(
      "programmer_art", xa.c("resourcePack.programmer_art.name"), "high_contrast", xa.c("resourcePack.high_contrast.name")
   );
   private static final atq h = new atq("vanilla", xa.c("resourcePack.vanilla.name"), auq.c, Optional.of(c));
   private static final ats i = new ats(true, aum.b.b, false);
   private static final ats j = new ats(false, aum.b.a, false);
   private static final ali k = ali.b("resourcepacks");
   @Nullable
   private final Path l;

   public hlr(Path $$0, ffg $$1) {
      super(att.a, b($$0), k, $$1);
      this.l = this.a($$0);
   }

   private static atq a(String $$0, xa $$1) {
      return new atq($$0, $$1, auq.c, Optional.of(aul.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ac.aU && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static atv b(Path $$0) {
      atw $$1 = new atw().a(f).a("minecraft", "realms");
      return $$1.b().a().a(att.a, $$0).a(h);
   }

   @Override
   protected xa a(String $$0) {
      xa $$1 = g.get($$0);
      return (xa)($$1 != null ? $$1 : xa.b($$0));
   }

   @Nullable
   @Override
   protected aum a(atr $$0) {
      return aum.a(h, b($$0), att.a, i);
   }

   @Nullable
   @Override
   protected aum a(String $$0, aum.c $$1, xa $$2) {
      return aum.a(a($$0, $$2), $$1, att.a, j);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aum>> $$0) {
      super.a($$0);
      if (this.l != null) {
         this.a(this.l, $$0);
      }
   }
}
