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
   private static final Set<bsv<?>> b = ImmutableSet.of(bsv.by, bsv.d, bsv.af, bsv.aS, bsv.bj);
   private final cpg c;
   private final cpg d;
   private final Map<bsv<?>, Map<ala<eqi>, eqi.a>> e = Maps.newHashMap();

   protected ms(cpg $$0) {
      this($$0, $$0);
   }

   protected ms(cpg $$0, cpg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eqi.a a(dbs $$0) {
      return eqi.b().a(eqh.a().a(eug.a(1.0F)).a(eqq.a($$0))).a(eqh.a().a(eug.a(1.0F)).a(eqw.a(bsv.aJ.k())));
   }

   public abstract void a();

   @Override
   public void generate(jk.a $$0, BiConsumer<ala<eqi>, eqi.a> $$1) {
      this.a();
      Set<ala<eqi>> $$2 = new HashSet<>();
      lp.g
         .h()
         .forEach(
            $$2x -> {
               bsv<?> $$3 = (bsv<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ala<eqi>, eqi.a> $$4 = this.e.remove($$3);
                     ala<eqi> $$5 = $$3.k();
                     if ($$5 != epz.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ala<eqi>, eqi.a> $$6 = this.e.remove($$3);
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

   private static boolean a(bsv<?> $$0) {
      return b.contains($$0) || $$0.f() != btn.h;
   }

   protected etn.a b() {
      return eth.a(bj.a.a().b(bu.a.a().a(bsv.R)));
   }

   protected etn.a a(ala<cfl> $$0) {
      return eth.a(bj.a.a().b(bu.a.a().a(bsv.R).a(bw.b(lp.al.g($$0)))));
   }

   protected void a(bsv<?> $$0, eqi.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsv<?> $$0, ala<eqi> $$1, eqi.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
