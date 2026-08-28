import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class my implements na {
   protected final jq.a a;
   private final cqq b;
   private final cqq c;
   private final Map<bty<?>, Map<ald<etq>, etq.a>> d = Maps.newHashMap();

   protected final ewk.a a() {
      jq.b<dbn> $$0 = this.a.d(lw.aN);
      return ewk.a(
         ewz.a(etl.b.a, bv.a.a().a(bt.a.a().b(true))), ewz.a(etl.b.c, bv.a.a().a(bs.a.a().f(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(awy.p), dh.d.c)))))))
      );
   }

   protected my(cqq $$0, jq.a $$1) {
      this($$0, $$0, $$1);
   }

   protected my(cqq $$0, cqq $$1, jq.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static etp.a a(Map<cum, ald<etq>> $$0) {
      ets.a $$1 = ets.a();

      for (Entry<cum, ald<etq>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(eue.a($$2.getValue()).a(ewz.a(etl.b.a, bv.a.a().a(du.a($$2.getKey())))));
      }

      return etp.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<ald<etq>, etq.a> $$0) {
      this.b();
      Set<ald<etq>> $$1 = new HashSet<>();
      lv.f
         .c()
         .forEach(
            $$2 -> {
               bty<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<ald<etq>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<ald<etq>, etq.a> $$5 = this.d.remove($$3);
                     if ($$3.a(this.c) && ($$5 == null || !$$5.containsKey($$4.get()))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4.get(), $$2.h().a()));
                     }

                     if ($$5 != null) {
                        $$5.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.h().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<ald<etq>, etq.a> $$6 = this.d.remove($$3);
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
      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.d.keySet());
      }
   }

   protected eww.a a(jp<bty<?>> $$0) {
      return ewp.a(bk.a.a().b(bv.a.a().a($$0, bty.R)));
   }

   protected eww.a a(jp<bty<?>> $$0, ald<cgo> $$1) {
      return ewp.a(bk.a.a().b(bv.a.a().a($$0, bty.R).a(bx.b(lv.aj.b($$1)))));
   }

   protected void a(bty<?> $$0, etq.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bty<?> $$0, ald<etq> $$1, etq.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
