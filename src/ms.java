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
   private static final Set<btb<?>> b = ImmutableSet.of(btb.by, btb.d, btb.af, btb.aS, btb.bj);
   private final cpm c;
   private final cpm d;
   private final Map<btb<?>, Map<ale<eqo>, eqo.a>> e = Maps.newHashMap();

   protected ms(cpm $$0) {
      this($$0, $$0);
   }

   protected ms(cpm $$0, cpm $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eqo.a a(dby $$0) {
      return eqo.b().a(eqn.a().a(eum.a(1.0F)).a(eqw.a($$0))).a(eqn.a().a(eum.a(1.0F)).a(erc.a(btb.aJ.k())));
   }

   public abstract void a();

   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqo>, eqo.a> $$1) {
      this.a();
      Set<ale<eqo>> $$2 = new HashSet<>();
      lp.g
         .h()
         .forEach(
            $$2x -> {
               btb<?> $$3 = (btb<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ale<eqo>, eqo.a> $$4 = this.e.remove($$3);
                     ale<eqo> $$5 = $$3.k();
                     if ($$5 != eqf.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ale<eqo>, eqo.a> $$6 = this.e.remove($$3);
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

   private static boolean a(btb<?> $$0) {
      return b.contains($$0) || $$0.f() != btt.h;
   }

   protected ett.a b() {
      return etn.a(bj.a.a().b(bu.a.a().a(btb.R)));
   }

   protected ett.a a(ale<cfr> $$0) {
      return etn.a(bj.a.a().b(bu.a.a().a(btb.R).a(bw.b(lp.al.g($$0)))));
   }

   protected void a(btb<?> $$0, eqo.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(btb<?> $$0, ale<eqo> $$1, eqo.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
