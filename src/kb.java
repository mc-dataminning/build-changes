import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class kb implements kd {
   protected static final bo.a a = bo.a.a().a(bm.a.a().a(true));
   private static final Set<bim<?>> b = ImmutableSet.of(bim.bt, bim.d, bim.ac, bim.aO, bim.bf);
   private final cdv c;
   private final cdv d;
   private final Map<bim<?>, Map<aer, ecp.a>> e = Maps.newHashMap();

   protected kb(cdv $$0) {
      this($$0, $$0);
   }

   protected kb(cdv $$0, cdv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ecp.a a(cpl $$0) {
      return ecp.b().a(eco.a().a(efz.a(1.0F)).a(ecx.a($$0))).a(eco.a().a(efz.a(1.0F)).a(edd.a(bim.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<aer, ecp.a> $$0) {
      this.a();
      Set<aer> $$1 = Sets.newHashSet();
      jb.h
         .h()
         .forEach(
            $$2 -> {
               bim<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<aer, ecp.a> $$4 = this.e.remove($$3);
                     aer $$5 = $$3.j();
                     if (!$$5.equals(ecf.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<aer, ecp.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(aer::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bim<?> $$0) {
      return b.contains($$0) || $$0.f() != bjb.h;
   }

   protected efg.a b() {
      return efa.a(bd.a.a().b(bo.a.a().a(bim.O)));
   }

   protected efg.a a(buv $$0) {
      return efa.a(bd.a.a().b(bo.a.a().a(bim.O).a(bp.a($$0))));
   }

   protected void a(bim<?> $$0, ecp.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bim<?> $$0, aer $$1, ecp.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
