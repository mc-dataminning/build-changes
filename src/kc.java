import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class kc implements ke {
   protected static final bo.a a = bo.a.a().a(bm.a.a().a(true).b());
   private static final Set<bik<?>> b = ImmutableSet.of(bik.bt, bik.d, bik.ac, bik.aO, bik.bf);
   private final cdt c;
   private final cdt d;
   private final Map<bik<?>, Map<aep, ecp.a>> e = Maps.newHashMap();

   protected kc(cdt $$0) {
      this($$0, $$0);
   }

   protected kc(cdt $$0, cdt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ecp.a a(cpj $$0) {
      return ecp.b().a(eco.a().a(ega.a(1.0F)).a(ecz.a($$0))).a(eco.a().a(ega.a(1.0F)).a(edf.a(bik.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<aep, ecp.a> $$0) {
      this.a();
      Set<aep> $$1 = Sets.newHashSet();
      jc.h
         .h()
         .forEach(
            $$2 -> {
               bik<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<aep, ecp.a> $$4 = this.e.remove($$3);
                     aep $$5 = $$3.j();
                     if (!$$5.equals(ecd.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<aep, ecp.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(aep::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bik<?> $$0) {
      return b.contains($$0) || $$0.f() != biz.h;
   }

   protected efh.a b() {
      return efb.a(bd.a.a().b(bo.a.a().a(bik.O)));
   }

   protected efh.a a(but $$0) {
      return efb.a(bd.a.a().b(bo.a.a().a(bik.O).a(bp.a($$0))));
   }

   protected void a(bik<?> $$0, ecp.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bik<?> $$0, aep $$1, ecp.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
