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
   private static final Set<btc<?>> b = ImmutableSet.of(btc.by, btc.d, btc.af, btc.aS, btc.bj);
   private final cpn c;
   private final cpn d;
   private final Map<btc<?>, Map<ale<eqp>, eqp.a>> e = Maps.newHashMap();

   protected ms(cpn $$0) {
      this($$0, $$0);
   }

   protected ms(cpn $$0, cpn $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eqp.a a(dbz $$0) {
      return eqp.b().a(eqo.a().a(eun.a(1.0F)).a(eqx.a($$0))).a(eqo.a().a(eun.a(1.0F)).a(erd.a(btc.aJ.k())));
   }

   public abstract void a();

   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqp>, eqp.a> $$1) {
      this.a();
      Set<ale<eqp>> $$2 = new HashSet<>();
      lp.g
         .h()
         .forEach(
            $$2x -> {
               btc<?> $$3 = (btc<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ale<eqp>, eqp.a> $$4 = this.e.remove($$3);
                     ale<eqp> $$5 = $$3.k();
                     if ($$5 != eqg.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ale<eqp>, eqp.a> $$6 = this.e.remove($$3);
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

   private static boolean a(btc<?> $$0) {
      return b.contains($$0) || $$0.f() != btu.h;
   }

   protected etu.a b() {
      return eto.a(bj.a.a().b(bu.a.a().a(btc.R)));
   }

   protected etu.a a(ale<cfs> $$0) {
      return eto.a(bj.a.a().b(bu.a.a().a(btc.R).a(bw.b(lp.al.g($$0)))));
   }

   protected void a(btc<?> $$0, eqp.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(btc<?> $$0, ale<eqp> $$1, eqp.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
