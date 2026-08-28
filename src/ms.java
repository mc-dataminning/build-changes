import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class ms implements mu {
   protected static final bu.a a = bu.a.a().a(bs.a.a().a(true));
   private static final Set<bta<?>> b = ImmutableSet.of(bta.by, bta.d, bta.af, bta.aS, bta.bj);
   private final cpl c;
   private final cpl d;
   private final Map<bta<?>, Map<ale<eqn>, eqn.a>> e = Maps.newHashMap();

   protected ms(cpl $$0) {
      this($$0, $$0);
   }

   protected ms(cpl $$0, cpl $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eqn.a a(dbx $$0) {
      return eqn.b().a(eqm.a().a(eul.a(1.0F)).a(eqv.a($$0))).a(eqm.a().a(eul.a(1.0F)).a(erb.a(bta.aJ.k())));
   }

   public abstract void a();

   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqn>, eqn.a> $$1) {
      this.a();
      Set<ale<eqn>> $$2 = new HashSet<>();
      lp.g
         .h()
         .forEach(
            $$2x -> {
               bta<?> $$3 = (bta<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ale<eqn>, eqn.a> $$4 = this.e.remove($$3);
                     ale<eqn> $$5 = $$3.k();
                     if ($$5 != eqe.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ale<eqn>, eqn.a> $$6 = this.e.remove($$3);
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

   private static boolean a(bta<?> $$0) {
      return b.contains($$0) || $$0.f() != bts.h;
   }

   protected ets.a b() {
      return etm.a(bj.a.a().b(bu.a.a().a(bta.R)));
   }

   protected ets.a a(ale<cfq> $$0) {
      return etm.a(bj.a.a().b(bu.a.a().a(bta.R).a(bw.b(lp.al.g($$0)))));
   }

   protected void a(bta<?> $$0, eqn.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bta<?> $$0, ale<eqn> $$1, eqn.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
