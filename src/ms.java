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
   private static final Set<bsz<?>> b = ImmutableSet.of(bsz.by, bsz.d, bsz.af, bsz.aS, bsz.bj);
   private final cpk c;
   private final cpk d;
   private final Map<bsz<?>, Map<ald<eqm>, eqm.a>> e = Maps.newHashMap();

   protected ms(cpk $$0) {
      this($$0, $$0);
   }

   protected ms(cpk $$0, cpk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eqm.a a(dbw $$0) {
      return eqm.b().a(eql.a().a(euk.a(1.0F)).a(equ.a($$0))).a(eql.a().a(euk.a(1.0F)).a(era.a(bsz.aJ.k())));
   }

   public abstract void a();

   @Override
   public void generate(jk.a $$0, BiConsumer<ald<eqm>, eqm.a> $$1) {
      this.a();
      Set<ald<eqm>> $$2 = new HashSet<>();
      lp.g
         .h()
         .forEach(
            $$2x -> {
               bsz<?> $$3 = (bsz<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ald<eqm>, eqm.a> $$4 = this.e.remove($$3);
                     ald<eqm> $$5 = $$3.k();
                     if ($$5 != eqd.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ald<eqm>, eqm.a> $$6 = this.e.remove($$3);
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

   private static boolean a(bsz<?> $$0) {
      return b.contains($$0) || $$0.f() != btr.h;
   }

   protected etr.a b() {
      return etl.a(bj.a.a().b(bu.a.a().a(bsz.R)));
   }

   protected etr.a a(ald<cfp> $$0) {
      return etl.a(bj.a.a().b(bu.a.a().a(bsz.R).a(bw.b(lp.al.g($$0)))));
   }

   protected void a(bsz<?> $$0, eqm.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsz<?> $$0, ald<eqm> $$1, eqm.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
