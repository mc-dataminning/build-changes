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

public record gsy(Optional<gsy.b> b, Optional<gsy.a> c) {
   static final Logger d = LogUtils.getLogger();
   public static final Codec<gsy> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gsy.b.a.optionalFieldOf("variants").forGetter(gsy::a), gsy.a.a.optionalFieldOf("multipart").forGetter(gsy::b)).apply($$0, gsy::new)
      )
      .validate($$0 -> $$0.a().isEmpty() && $$0.b().isEmpty() ? DataResult.error(() -> "Neither 'variants' nor 'multipart' found") : DataResult.success($$0));

   public Map<ebq, gta.c> a(ebr<dno, ebq> $$0, Supplier<String> $$1) {
      Map<ebq, gta.c> $$2 = new IdentityHashMap<>();
      this.b.ifPresent($$3 -> $$3.a($$0, $$1, ($$1xx, $$2xx) -> {
            gta.c $$3x = $$2.put($$1xx, $$2xx);
            if ($$3x != null) {
               throw new IllegalArgumentException("Overlapping definition on state: " + $$1xx);
            }
         }));
      this.c.ifPresent($$2x -> {
         List<ebq> $$3 = $$0.a();
         gta.c $$4 = $$2x.a($$0);

         for (ebq $$5 : $$3) {
            $$2.putIfAbsent($$5, $$4);
         }
      });
      return $$2;
   }

   public Optional<gsy.b> a() {
      return this.b;
   }

   public Optional<gsy.a> b() {
      return this.c;
   }

   public static record a(List<gtq> b) {
      public static final Codec<gsy.a> a = azg.b(gtq.a.listOf()).xmap(gsy.a::new, gsy.a::a);

      public gtp.c a(ebr<dno, ebq> $$0) {
         Builder<gtp.a<gta.b>> $$1 = ImmutableList.builderWithExpectedSize(this.b.size());

         for (gtq $$2 : this.b) {
            $$1.add(new gtp.a<>($$2.a($$0), $$2.b()));
         }

         return new gtp.c($$1.build());
      }

      public List<gtq> a() {
         return this.b;
      }
   }

   public static record b(Map<String, gta.b> b) {
      public static final Codec<gsy.b> a = azg.d(Codec.unboundedMap(Codec.STRING, gta.b.c)).xmap(gsy.b::new, gsy.b::a);

      public void a(ebr<dno, ebq> $$0, Supplier<String> $$1, BiConsumer<ebq, gta.c> $$2) {
         this.b.forEach(($$3, $$4) -> {
            try {
               Predicate<ebs<dno, ebq>> $$5 = gtl.a($$0, $$3);
               gta.c $$6 = $$4.a();
               UnmodifiableIterator var7 = $$0.a().iterator();

               while (var7.hasNext()) {
                  ebq $$7 = (ebq)var7.next();
                  if ($$5.test($$7)) {
                     $$2.accept($$7, $$6);
                  }
               }
            } catch (Exception var9) {
               gsy.d.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{$$1.get(), $$3, var9.getMessage()});
            }
         });
      }

      public Map<String, gta.b> a() {
         return this.b;
      }
   }
}
