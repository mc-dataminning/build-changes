import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class ml implements mn {
   protected static final bs.a a = bs.a.a().a(bq.a.a().a(true));
   private static final Set<bsb<?>> c = ImmutableSet.of(bsb.bE, bsb.d, bsb.ah, bsb.aV, bsb.bn);
   protected static final bs.a b = bs.a.a().a(new dc(true));
   private final cop d;
   private final cop e;
   private final Map<bsb<?>, Map<aks<eru>, eru.a>> f = Maps.newHashMap();

   protected ml(cop $$0) {
      this($$0, $$0);
   }

   protected ml(cop $$0, cop $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   protected static eru.a a(dbz $$0) {
      return eru.b().a(ert.a().a(evo.a(1.0F)).a(esc.a($$0))).a(ert.a().a(evo.a(1.0F)).a(esi.a(bsb.aL.j())));
   }

   public abstract void a();

   @Override
   public void generate(jc.a $$0, BiConsumer<aks<eru>, eru.a> $$1) {
      this.a();
      Set<aks<eru>> $$2 = new HashSet<>();
      lh.g
         .h()
         .forEach(
            $$2x -> {
               bsb<?> $$3 = (bsb<?>)$$2x.a();
               if ($$3.a(this.d)) {
                  if (a($$3)) {
                     Map<aks<eru>, eru.a> $$4 = this.f.remove($$3);
                     aks<eru> $$5 = $$3.j();
                     if ($$5 != ern.a && $$3.a(this.e) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2x.h().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$2.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2x.h().a()));
                           } else {
                              $$1.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<aks<eru>, eru.a> $$6 = this.f.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map($$0xx -> $$0xx.a().toString()).collect(Collectors.joining(",")),
                              $$2x.h().a()
                           )
                        );
                     }
                  }
               }
            }
         );
      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.f.keySet());
      }
   }

   private static boolean a(bsb<?> $$0) {
      return c.contains($$0) || $$0.f() != bsr.h;
   }

   protected euu.a b() {
      return euo.a(bh.a.a().b(bs.a.a().a(bsb.T)));
   }

   protected euu.a a(aks<cep> $$0) {
      return euo.a(bh.a.a().b(bs.a.a().a(bsb.T).a(bu.b(lh.al.g($$0)))));
   }

   protected void a(bsb<?> $$0, eru.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bsb<?> $$0, aks<eru> $$1, eru.a $$2) {
      this.f.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
