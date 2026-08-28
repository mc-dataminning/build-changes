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

public record grx(Map<String, gsd> b, Optional<gsn.b> c) {
   private static final Logger d = LogUtils.getLogger();
   public static final Codec<grx> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(Codec.STRING, gsd.a).optionalFieldOf("variants", Map.of()).forGetter(grx::a),
                  gsn.b.a.optionalFieldOf("multipart").forGetter(grx::b)
               )
               .apply($$0, grx::new)
      )
      .validate($$0 -> $$0.a().isEmpty() && $$0.b().isEmpty() ? DataResult.error(() -> "Neither 'variants' nor 'multipart' found") : DataResult.success($$0));

   public Map<eao, gry.a> a(eap<dmm, eao> $$0, Supplier<String> $$1) {
      Map<eao, gry.a> $$2 = new IdentityHashMap<>();
      List<eao> $$3 = $$0.a();
      gsn $$4;
      if (this.c.isPresent()) {
         $$4 = this.c.get().a($$0);
         $$3.forEach($$2x -> $$2.put($$2x, $$4));
      } else {
         $$4 = null;
      }

      this.b.forEach(($$5x, $$6) -> {
         try {
            Predicate<eaq<dmm, eao>> $$7 = gsj.a($$0, $$5x);

            for (eao $$8 : $$3) {
               if ($$7.test($$8)) {
                  gry.a $$9 = $$2.put($$8, $$6);
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

   public Map<String, gsd> a() {
      return this.b;
   }

   public Optional<gsn.b> b() {
      return this.c;
   }
}
