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
   private static final Set<bsy<?>> b = ImmutableSet.of(bsy.by, bsy.d, bsy.af, bsy.aS, bsy.bj);
   private final cpj c;
   private final cpj d;
   private final Map<bsy<?>, Map<ald<eql>, eql.a>> e = Maps.newHashMap();

   protected ms(cpj $$0) {
      this($$0, $$0);
   }

   protected ms(cpj $$0, cpj $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eql.a a(dbv $$0) {
      return eql.b().a(eqk.a().a(euj.a(1.0F)).a(eqt.a($$0))).a(eqk.a().a(euj.a(1.0F)).a(eqz.a(bsy.aJ.k())));
   }

   public abstract void a();

   @Override
   public void generate(jk.a $$0, BiConsumer<ald<eql>, eql.a> $$1) {
      this.a();
      Set<ald<eql>> $$2 = new HashSet<>();
      lp.g
         .h()
         .forEach(
            $$2x -> {
               bsy<?> $$3 = (bsy<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ald<eql>, eql.a> $$4 = this.e.remove($$3);
                     ald<eql> $$5 = $$3.k();
                     if ($$5 != eqc.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ald<eql>, eql.a> $$6 = this.e.remove($$3);
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

   private static boolean a(bsy<?> $$0) {
      return b.contains($$0) || $$0.f() != btq.h;
   }

   protected etq.a b() {
      return etk.a(bj.a.a().b(bu.a.a().a(bsy.R)));
   }

   protected etq.a a(ald<cfo> $$0) {
      return etk.a(bj.a.a().b(bu.a.a().a(bsy.R).a(bw.b(lp.al.g($$0)))));
   }

   protected void a(bsy<?> $$0, eql.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsy<?> $$0, ald<eql> $$1, eql.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
