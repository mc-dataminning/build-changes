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

public class jx implements jk {
   private static final Logger d = LogUtils.getLogger();
   private final Path e;
   private final CompletableFuture<hi.b> f;
   private static final MapCodec<aet<cqo>> g = aet.a(je.ap).fieldOf("biome");
   private static final Codec<cqx.c<aet<cqo>>> h = cqx.c.a(g).fieldOf("biomes").codec();

   public jx(jm $$0, CompletableFuture<hi.b> $$1) {
      this.e = $$0.a(jm.b.c).resolve("biome_parameters");
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(ji $$0) {
      return this.f.thenCompose($$1 -> {
         DynamicOps<JsonElement> $$2 = aes.a(JsonOps.INSTANCE, $$1);
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         crc.b().forEach(($$3x, $$4) -> $$3.add(a(this.a($$3x.b()), $$0, $$2, h, $$4)));
         return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
      });
   }

   private static <E> CompletableFuture<?> a(Path $$0, ji $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      Optional<JsonElement> $$5 = $$3.encodeStart($$2, $$4).resultOrPartial($$1x -> d.error("Couldn't serialize element {}: {}", $$0, $$1x));
      return $$5.isPresent() ? jk.a($$1, $$5.get(), $$0) : CompletableFuture.completedFuture(null);
   }

   private Path a(aeu $$0) {
      return this.e.resolve($$0.b()).resolve($$0.a() + ".json");
   }

   @Override
   public final String a() {
      return "Biome Parameters";
   }
}
