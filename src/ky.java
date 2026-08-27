import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class ky implements la {
   protected static final bq.a a = bq.a.a().a(bo.a.a().a(true));
   private static final Set<bkm<?>> b = ImmutableSet.of(bkm.bt, bkm.d, bkm.ac, bkm.aO, bkm.bf);
   private final cfv c;
   private final cfv d;
   private final Map<bkm<?>, Map<agg, eet.a>> e = Maps.newHashMap();

   protected ky(cfv $$0) {
      this($$0, $$0);
   }

   protected ky(cfv $$0, cfv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eet.a a(crr $$0) {
      return eet.b().a(ees.a().a(eid.a(1.0F)).a(efb.a($$0))).a(ees.a().a(eid.a(1.0F)).a(efh.a(bkm.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<agg, eet.a> $$0) {
      this.a();
      Set<agg> $$1 = Sets.newHashSet();
      jy.h
         .h()
         .forEach(
            $$2 -> {
               bkm<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<agg, eet.a> $$4 = this.e.remove($$3);
                     agg $$5 = $$3.j();
                     if (!$$5.equals(eej.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2.g().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.g().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<agg, eet.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(agg::toString).collect(Collectors.joining(",")),
                              $$2.g().a()
                           )
                        );
                     }
                  }
               }
            }
         );
      if (!this.e.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.e.keySet());
      }
   }

   private static boolean a(bkm<?> $$0) {
      return b.contains($$0) || $$0.f() != blb.h;
   }

   protected ehk.a b() {
      return ehe.a(bf.a.a().b(bq.a.a().a(bkm.O)));
   }

   protected ehk.a a(bwu $$0) {
      return ehe.a(bf.a.a().b(bq.a.a().a(bkm.O).a(br.a($$0))));
   }

   protected void a(bkm<?> $$0, eet.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bkm<?> $$0, agg $$1, eet.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
