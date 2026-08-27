import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gma extends ash {
   private static final asd d = new asd(wg.c("resourcePack.vanilla.description"), aa.b().a(arq.a), Optional.empty());
   private static final arg e = arg.a(asd.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, wg> f = Map.of(
      "programmer_art", wg.c("resourcePack.programmer_art.name"), "high_contrast", wg.c("resourcePack.high_contrast.name")
   );
   private static final arn g = new arn("vanilla", wg.c("resourcePack.vanilla.name"), aso.c, Optional.of(b));
   private static final arp h = new arp(true, ask.b.b, false);
   private static final arp i = new arp(false, ask.b.a, false);
   private static final ajt j = new ajt("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gma(Path $$0, erq $$1) {
      super(arq.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static arn a(String $$0, wg $$1) {
      return new arn($$0, $$1, aso.c, Optional.of(asj.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (aa.aW && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static ars b(Path $$0) {
      art $$1 = new art().a(e).a("minecraft", "realms");
      return $$1.b().a().a(arq.a, $$0).a(g);
   }

   @Override
   protected wg a(String $$0) {
      wg $$1 = f.get($$0);
      return (wg)($$1 != null ? $$1 : wg.b($$0));
   }

   @Nullable
   @Override
   protected ask a(aro $$0) {
      return ask.a(g, b($$0), arq.a, h);
   }

   @Nullable
   @Override
   protected ask a(String $$0, ask.c $$1, wg $$2) {
      return ask.a(a($$0, $$2), $$1, arq.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, ask>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
