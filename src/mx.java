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

public abstract class mx implements mz {
   private static final Set<btv<?>> b = ImmutableSet.of(btv.by, btv.d, btv.af, btv.aS, btv.bj);
   protected final jp.a a;
   private final cqn c;
   private final cqn d;
   private final Map<btv<?>, Map<alb<etm>, etm.a>> e = Maps.newHashMap();

   protected final ewg.a a() {
      jp.b<dbk> $$0 = this.a.b(lv.aM);
      return ewg.a(
         ewv.a(eth.b.a, bv.a.a().a(bt.a.a().b(true))), ewv.a(eth.b.c, bv.a.a().a(bs.a.a().f(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(aww.p), dh.d.c)))))))
      );
   }

   protected mx(cqn $$0, jp.a $$1) {
      this($$0, $$0, $$1);
   }

   protected mx(cqn $$0, cqn $$1, jp.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
   }

   protected static etm.a a(def $$0) {
      return etm.b().a(etl.a().a(exl.a(1.0F)).a(etu.a($$0))).a(etl.a().a(exl.a(1.0F)).a(eua.a(btv.aJ.k())));
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alb<etm>, etm.a> $$0) {
      this.b();
      Set<alb<etm>> $$1 = new HashSet<>();
      lu.f
         .i()
         .forEach(
            $$2 -> {
               btv<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<alb<etm>, etm.a> $$4 = this.e.remove($$3);
                     alb<etm> $$5 = $$3.k();
                     if ($$5 != etd.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<alb<etm>, etm.a> $$6 = this.e.remove($$3);
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

   private static boolean a(btv<?> $$0) {
      return b.contains($$0) || $$0.f() != bun.h;
   }

   protected ews.a a(jo<btv<?>> $$0) {
      return ewl.a(bk.a.a().b(bv.a.a().a($$0, btv.R)));
   }

   protected ews.a a(jo<btv<?>> $$0, alb<cgl> $$1) {
      return ewl.a(bk.a.a().b(bv.a.a().a($$0, btv.R).a(bx.b(lu.aj.g($$1)))));
   }

   protected void a(btv<?> $$0, etm.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(btv<?> $$0, alb<etm> $$1, etm.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
