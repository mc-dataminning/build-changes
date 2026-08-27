import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class mg implements mi {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<brn<?>> b = ImmutableSet.of(brn.bx, brn.d, brn.af, brn.aR, brn.bi);
   private final cnu c;
   private final cnu d;
   private final Map<brn<?>, Map<akg<eoq>, eoq.a>> e = Maps.newHashMap();

   protected mg(cnu $$0) {
      this($$0, $$0);
   }

   protected mg(cnu $$0, cnu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eoq.a a(dac $$0) {
      return eoq.b().a(eop.a().a(esj.a(1.0F)).a(eoy.a($$0))).a(eop.a().a(esj.a(1.0F)).a(epe.a(brn.aI.j())));
   }

   public abstract void a();

   @Override
   public void generate(iy.a $$0, BiConsumer<akg<eoq>, eoq.a> $$1) {
      this.a();
      Set<akg<eoq>> $$2 = new HashSet<>();
      ld.g
         .h()
         .forEach(
            $$2x -> {
               brn<?> $$3 = (brn<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akg<eoq>, eoq.a> $$4 = this.e.remove($$3);
                     akg<eoq> $$5 = $$3.j();
                     if ($$5 != eoj.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<akg<eoq>, eoq.a> $$6 = this.e.remove($$3);
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
      if (!this.e.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.e.keySet());
      }
   }

   private static boolean a(brn<?> $$0) {
      return b.contains($$0) || $$0.f() != bsd.h;
   }

   protected erq.a b() {
      return erk.a(bg.a.a().b(br.a.a().a(brn.R)));
   }

   protected erq.a a(akg<cea> $$0) {
      return erk.a(bg.a.a().b(br.a.a().a(brn.R).a(bt.b(ld.al.g($$0)))));
   }

   protected void a(brn<?> $$0, eoq.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(brn<?> $$0, akg<eoq> $$1, eoq.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
