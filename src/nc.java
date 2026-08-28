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

public abstract class nc implements ne {
   protected final js.a a;
   private final crj b;
   private final crj c;
   private final Map<bup<?>, Map<alk<eul>, eul.a>> d = Maps.newHashMap();

   protected final exf.a a() {
      js.b<dbw> $$0 = this.a.d(ma.aM);
      return exf.a(
         exu.a(eug.b.a, bw.a.a().a(bu.a.a().b(true))), exu.a(eug.b.c, bw.a.a().a(bt.a.a().f(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(axg.p), dj.d.c)))))))
      );
   }

   protected nc(crj $$0, js.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nc(crj $$0, crj $$1, js.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static euk.a a(Map<cvc, alk<eul>> $$0) {
      eun.a $$1 = eun.a();

      for (Entry<cvc, alk<eul>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(euz.a($$2.getValue()).a(exu.a(eug.b.a, bw.a.a().a(dw.a($$2.getKey())))));
      }

      return euk.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alk<eul>, eul.a> $$0) {
      this.b();
      Set<alk<eul>> $$1 = new HashSet<>();
      lz.f
         .c()
         .forEach(
            $$2 -> {
               bup<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alk<eul>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<alk<eul>, eul.a> $$5 = this.d.remove($$3);
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
                     Map<alk<eul>, eul.a> $$6 = this.d.remove($$3);
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

   protected exr.a a(jr<bup<?>> $$0) {
      return exk.a(bl.a.a().b(bw.a.a().a($$0, bup.R)));
   }

   protected exr.a a(jr<bup<?>> $$0, alk<chg> $$1) {
      return exk.a(bl.a.a().b(bw.a.a().a($$0, bup.R).a(by.b(lz.aj.b($$1)))));
   }

   protected void a(bup<?> $$0, eul.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bup<?> $$0, alk<eul> $$1, eul.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
