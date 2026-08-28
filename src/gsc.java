import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.slf4j.Logger;

public record gsc(Map<String, gsi> b, Optional<gss.b> c) {
   private static final Logger d = LogUtils.getLogger();
   public static final Codec<gsc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(Codec.STRING, gsi.a).optionalFieldOf("variants", Map.of()).forGetter(gsc::a),
                  gss.b.a.optionalFieldOf("multipart").forGetter(gsc::b)
               )
               .apply($$0, gsc::new)
      )
      .validate($$0 -> $$0.a().isEmpty() && $$0.b().isEmpty() ? DataResult.error(() -> "Neither 'variants' nor 'multipart' found") : DataResult.success($$0));

   public Map<eat, gsd.a> a(eau<dmr, eat> $$0, Supplier<String> $$1) {
      Map<eat, gsd.a> $$2 = new IdentityHashMap<>();
      List<eat> $$3 = $$0.a();
      gss $$4;
      if (this.c.isPresent()) {
         $$4 = this.c.get().a($$0);
         $$3.forEach($$2x -> $$2.put($$2x, $$4));
      } else {
         $$4 = null;
      }

      this.b.forEach(($$5x, $$6) -> {
         try {
            Predicate<eav<dmr, eat>> $$7 = gso.a($$0, $$5x);

            for (eat $$8 : $$3) {
               if ($$7.test($$8)) {
                  gsd.a $$9 = $$2.put($$8, $$6);
                  if ($$9 != null && $$9 != $$4) {
                     String $$10 = this.b.entrySet().stream().filter($$1xx -> $$1xx.getValue() == $$9).findFirst().get().getKey();
                     throw new IllegalArgumentException("Overlapping definition with: " + $$10);
                  }
               }
            }
         } catch (Exception var13) {
            d.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{$$1.get(), $$5x, var13.getMessage()});
         }
      });
      return $$2;
   }

   public Map<String, gsi> a() {
      return this.b;
   }

   public Optional<gss.b> b() {
      return this.c;
   }
}
