import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class ms implements mf {
   private static final Logger d = LogUtils.getLogger();
   private final Path e;
   private final CompletableFuture<js.a> f;
   private static final MapCodec<alh<dgc>> g = alh.a(lz.aG).fieldOf("biome");
   private static final Codec<dgl.c<alh<dgc>>> h = dgl.c.a(g).fieldOf("biomes").codec();

   public ms(mh $$0, CompletableFuture<js.a> $$1) {
      this.e = $$0.a(mh.b.c).resolve("biome_parameters");
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(md $$0) {
      return this.f.thenCompose($$1 -> {
         DynamicOps<JsonElement> $$2 = $$1.a(JsonOps.INSTANCE);
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         dgq.b().forEach(($$3x, $$4) -> $$3.add(a(this.a($$3x.b()), $$0, $$2, h, $$4)));
         return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
      });
   }

   private static <E> CompletableFuture<?> a(Path $$0, md $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      Optional<JsonElement> $$5 = $$3.encodeStart($$2, $$4).resultOrPartial($$1x -> d.error("Couldn't serialize element {}: {}", $$0, $$1x));
      return $$5.isPresent() ? mf.a($$1, $$5.get(), $$0) : CompletableFuture.completedFuture(null);
   }

   private Path a(ali $$0) {
      return this.e.resolve($$0.b()).resolve($$0.a() + ".json");
   }

   @Override
   public final String a() {
      return "Biome Parameters";
   }
}
