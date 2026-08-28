import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.slf4j.Logger;

public record gtn(Optional<gtn.b> b, Optional<gtn.a> c) {
   static final Logger d = LogUtils.getLogger();
   public static final Codec<gtn> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gtn.b.a.optionalFieldOf("variants").forGetter(gtn::a), gtn.a.a.optionalFieldOf("multipart").forGetter(gtn::b)).apply($$0, gtn::new)
      )
      .validate($$0 -> $$0.a().isEmpty() && $$0.b().isEmpty() ? DataResult.error(() -> "Neither 'variants' nor 'multipart' found") : DataResult.success($$0));

   public Map<ebg, gtp.c> a(ebh<dne, ebg> $$0, Supplier<String> $$1) {
      Map<ebg, gtp.c> $$2 = new IdentityHashMap<>();
      this.b.ifPresent($$3 -> $$3.a($$0, $$1, ($$1xx, $$2xx) -> {
            gtp.c $$3x = $$2.put($$1xx, $$2xx);
            if ($$3x != null) {
               throw new IllegalArgumentException("Overlapping definition on state: " + $$1xx);
            }
         }));
      this.c.ifPresent($$2x -> {
         List<ebg> $$3 = $$0.a();
         gtp.c $$4 = $$2x.a($$0);

         for (ebg $$5 : $$3) {
            $$2.putIfAbsent($$5, $$4);
         }
      });
      return $$2;
   }

   public Optional<gtn.b> a() {
      return this.b;
   }

   public Optional<gtn.a> b() {
      return this.c;
   }

   public static record a(List<guf> b) {
      public static final Codec<gtn.a> a = ayy.b(guf.a.listOf()).xmap(gtn.a::new, gtn.a::a);

      public gue.c a(ebh<dne, ebg> $$0) {
         Builder<gue.a<gtp.b>> $$1 = ImmutableList.builderWithExpectedSize(this.b.size());

         for (guf $$2 : this.b) {
            $$1.add(new gue.a<>($$2.a($$0), $$2.b()));
         }

         return new gue.c($$1.build());
      }

      public List<guf> a() {
         return this.b;
      }
   }

   public static record b(Map<String, gtp.b> b) {
      public static final Codec<gtn.b> a = ayy.d(Codec.unboundedMap(Codec.STRING, gtp.b.c)).xmap(gtn.b::new, gtn.b::a);

      public void a(ebh<dne, ebg> $$0, Supplier<String> $$1, BiConsumer<ebg, gtp.c> $$2) {
         this.b.forEach(($$3, $$4) -> {
            try {
               Predicate<ebi<dne, ebg>> $$5 = gua.a($$0, $$3);
               gtp.c $$6 = $$4.a();
               UnmodifiableIterator var7 = $$0.a().iterator();

               while (var7.hasNext()) {
                  ebg $$7 = (ebg)var7.next();
                  if ($$5.test($$7)) {
                     $$2.accept($$7, $$6);
                  }
               }
            } catch (Exception var9) {
               gtn.d.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{$$1.get(), $$3, var9.getMessage()});
            }
         });
      }

      public Map<String, gtp.b> a() {
         return this.b;
      }
   }
}
