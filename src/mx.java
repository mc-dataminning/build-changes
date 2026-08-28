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
   private static final Set<btq<?>> b = ImmutableSet.of(btq.by, btq.d, btq.af, btq.aS, btq.bj);
   protected final jp.a a;
   private final cqh c;
   private final cqh d;
   private final Map<btq<?>, Map<ala<esy>, esy.a>> e = Maps.newHashMap();

   protected final evs.a a() {
      jp.b<daw> $$0 = this.a.b(lv.aL);
      return evs.a(
         ewh.a(est.b.a, bv.a.a().a(bt.a.a().b(true))), ewh.a(est.b.c, bv.a.a().a(bs.a.a().f(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(awv.p), dh.d.c)))))))
      );
   }

   protected mx(cqh $$0, jp.a $$1) {
      this($$0, $$0, $$1);
   }

   protected mx(cqh $$0, cqh $$1, jp.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
   }

   protected static esy.a a(ddr $$0) {
      return esy.b().a(esx.a().a(ewx.a(1.0F)).a(etg.a($$0))).a(esx.a().a(ewx.a(1.0F)).a(etm.a(btq.aJ.k())));
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<ala<esy>, esy.a> $$0) {
      this.b();
      Set<ala<esy>> $$1 = new HashSet<>();
      lu.f
         .i()
         .forEach(
            $$2 -> {
               btq<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ala<esy>, esy.a> $$4 = this.e.remove($$3);
                     ala<esy> $$5 = $$3.k();
                     if ($$5 != esp.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ala<esy>, esy.a> $$6 = this.e.remove($$3);
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

   private static boolean a(btq<?> $$0) {
      return b.contains($$0) || $$0.f() != bui.h;
   }

   protected ewe.a a(jo<btq<?>> $$0) {
      return evx.a(bk.a.a().b(bv.a.a().a($$0, btq.R)));
   }

   protected ewe.a a(jo<btq<?>> $$0, ala<cgg> $$1) {
      return evx.a(bk.a.a().b(bv.a.a().a($$0, btq.R).a(bx.b(lu.aj.g($$1)))));
   }

   protected void a(btq<?> $$0, esy.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(btq<?> $$0, ala<esy> $$1, esy.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
