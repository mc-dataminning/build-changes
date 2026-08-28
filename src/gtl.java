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

public record gtl(Optional<gtl.b> b, Optional<gtl.a> c) {
   static final Logger d = LogUtils.getLogger();
   public static final Codec<gtl> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gtl.b.a.optionalFieldOf("variants").forGetter(gtl::a), gtl.a.a.optionalFieldOf("multipart").forGetter(gtl::b)).apply($$0, gtl::new)
      )
      .validate($$0 -> $$0.a().isEmpty() && $$0.b().isEmpty() ? DataResult.error(() -> "Neither 'variants' nor 'multipart' found") : DataResult.success($$0));

   public Map<ebe, gtn.c> a(ebf<dnc, ebe> $$0, Supplier<String> $$1) {
      Map<ebe, gtn.c> $$2 = new IdentityHashMap<>();
      this.b.ifPresent($$3 -> $$3.a($$0, $$1, ($$1xx, $$2xx) -> {
            gtn.c $$3x = $$2.put($$1xx, $$2xx);
            if ($$3x != null) {
               throw new IllegalArgumentException("Overlapping definition on state: " + $$1xx);
            }
         }));
      this.c.ifPresent($$2x -> {
         List<ebe> $$3 = $$0.a();
         gtn.c $$4 = $$2x.a($$0);

         for (ebe $$5 : $$3) {
            $$2.putIfAbsent($$5, $$4);
         }
      });
      return $$2;
   }

   public Optional<gtl.b> a() {
      return this.b;
   }

   public Optional<gtl.a> b() {
      return this.c;
   }

   public static record a(List<gud> b) {
      public static final Codec<gtl.a> a = ayw.b(gud.a.listOf()).xmap(gtl.a::new, gtl.a::a);

      public guc.c a(ebf<dnc, ebe> $$0) {
         Builder<guc.a<gtn.b>> $$1 = ImmutableList.builderWithExpectedSize(this.b.size());

         for (gud $$2 : this.b) {
            $$1.add(new guc.a<>($$2.a($$0), $$2.b()));
         }

         return new guc.c($$1.build());
      }

      public List<gud> a() {
         return this.b;
      }
   }

   public static record b(Map<String, gtn.b> b) {
      public static final Codec<gtl.b> a = ayw.d(Codec.unboundedMap(Codec.STRING, gtn.b.c)).xmap(gtl.b::new, gtl.b::a);

      public void a(ebf<dnc, ebe> $$0, Supplier<String> $$1, BiConsumer<ebe, gtn.c> $$2) {
         this.b.forEach(($$3, $$4) -> {
            try {
               Predicate<ebg<dnc, ebe>> $$5 = gty.a($$0, $$3);
               gtn.c $$6 = $$4.a();
               UnmodifiableIterator var7 = $$0.a().iterator();

               while (var7.hasNext()) {
                  ebe $$7 = (ebe)var7.next();
                  if ($$5.test($$7)) {
                     $$2.accept($$7, $$6);
                  }
               }
            } catch (Exception var9) {
               gtl.d.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{$$1.get(), $$3, var9.getMessage()});
            }
         });
      }

      public Map<String, gtn.b> a() {
         return this.b;
      }
   }
}
