import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gjq extends art {
   private static final arp d = new arp(vu.c("resourcePack.vanilla.description"), aa.b().a(arc.a), Optional.empty());
   private static final aqs e = aqs.a(arp.b, d);
   public static final String c = "high_contrast";
   private static final Map<String, vu> f = Map.of(
      "programmer_art", vu.c("resourcePack.programmer_art.name"), "high_contrast", vu.c("resourcePack.high_contrast.name")
   );
   private static final aqz g = new aqz("vanilla", vu.c("resourcePack.vanilla.name"), asa.c, Optional.of(b));
   private static final arb h = new arb(true, arw.b.b, false);
   private static final arb i = new arb(false, arw.b.a, false);
   private static final ajh j = new ajh("minecraft", "resourcepacks");
   @Nullable
   private final Path k;

   public gjq(Path $$0, eph $$1) {
      super(arc.a, b($$0), j, $$1);
      this.k = this.a($$0);
   }

   private static aqz a(String $$0, vu $$1) {
      return new aqz($$0, $$1, asa.c, Optional.of(arv.a($$0)));
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

   private static are b(Path $$0) {
      arf $$1 = new arf().a(e).a("minecraft", "realms");
      return $$1.b().a().a(arc.a, $$0).a(g);
   }

   @Override
   protected vu a(String $$0) {
      vu $$1 = f.get($$0);
      return (vu)($$1 != null ? $$1 : vu.b($$0));
   }

   @Nullable
   @Override
   protected arw a(ara $$0) {
      return arw.a(g, b($$0), arc.a, h);
   }

   @Nullable
   @Override
   protected arw a(String $$0, arw.c $$1, vu $$2) {
      return arw.a(a($$0, $$2), $$1, arc.a, i);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, arw>> $$0) {
      super.a($$0);
      if (this.k != null) {
         this.a(this.k, $$0);
      }
   }
}
