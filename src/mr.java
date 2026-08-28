import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class mr implements mt {
   private static final Set<bsj<?>> b = ImmutableSet.of(bsj.by, bsj.d, bsj.af, bsj.aS, bsj.bj);
   protected final jl.a a;
   private final cov c;
   private final cov d;
   private final Map<bsj<?>, Map<akj<eqt>, eqt.a>> e = Maps.newHashMap();

   protected final etn.a a() {
      jl.b<czj> $$0 = this.a.b(lr.aK);
      return etn.a(
         euc.a(eqo.b.a, bu.a.a().a(bs.a.a().b(true))), euc.a(eqo.b.c, bu.a.a().a(br.a.a().f(cp.a.a().a(cr.b, cl.a(List.of(new bp($$0.b(avx.p), de.d.c)))))))
      );
   }

   protected mr(cov $$0, jl.a $$1) {
      this($$0, $$0, $$1);
   }

   protected mr(cov $$0, cov $$1, jl.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
   }

   protected static eqt.a a(dcc $$0) {
      return eqt.b().a(eqs.a().a(eus.a(1.0F)).a(erb.a($$0))).a(eqs.a().a(eus.a(1.0F)).a(erh.a(bsj.aJ.k())));
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<akj<eqt>, eqt.a> $$0) {
      this.b();
      Set<akj<eqt>> $$1 = new HashSet<>();
      lq.f
         .i()
         .forEach(
            $$2 -> {
               bsj<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akj<eqt>, eqt.a> $$4 = this.e.remove($$3);
                     akj<eqt> $$5 = $$3.k();
                     if ($$5 != eqk.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2.h().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.h().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<akj<eqt>, eqt.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map($$0xx -> $$0xx.a().toString()).collect(Collectors.joining(",")),
                              $$2.h().a()
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

   private static boolean a(bsj<?> $$0) {
      return b.contains($$0) || $$0.f() != btb.h;
   }

   protected etz.a c() {
      return ets.a(bj.a.a().b(bu.a.a().a(bsj.R)));
   }

   protected etz.a a(akj<cez> $$0) {
      return ets.a(bj.a.a().b(bu.a.a().a(bsj.R).a(bw.b(lq.aj.g($$0)))));
   }

   protected void a(bsj<?> $$0, eqt.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsj<?> $$0, akj<eqt> $$1, eqt.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
