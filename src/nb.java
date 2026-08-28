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

public abstract class nb implements nd {
   protected final js.a a;
   private final crf b;
   private final crf c;
   private final Map<bul<?>, Map<alh<euh>, euh.a>> d = Maps.newHashMap();

   protected final exb.a a() {
      js.b<dbs> $$0 = this.a.d(lz.aM);
      return exb.a(
         exq.a(euc.b.a, bw.a.a().a(bu.a.a().b(true))), exq.a(euc.b.c, bw.a.a().a(bt.a.a().f(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(axd.p), dj.d.c)))))))
      );
   }

   protected nb(crf $$0, js.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nb(crf $$0, crf $$1, js.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static eug.a a(Map<cuy, alh<euh>> $$0) {
      euj.a $$1 = euj.a();

      for (Entry<cuy, alh<euh>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(euv.a($$2.getValue()).a(exq.a(euc.b.a, bw.a.a().a(dw.a($$2.getKey())))));
      }

      return eug.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alh<euh>, euh.a> $$0) {
      this.b();
      Set<alh<euh>> $$1 = new HashSet<>();
      ly.f
         .c()
         .forEach(
            $$2 -> {
               bul<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alh<euh>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<alh<euh>, euh.a> $$5 = this.d.remove($$3);
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
                     Map<alh<euh>, euh.a> $$6 = this.d.remove($$3);
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

   protected exn.a a(jr<bul<?>> $$0) {
      return exg.a(bl.a.a().b(bw.a.a().a($$0, bul.R)));
   }

   protected exn.a a(jr<bul<?>> $$0, alh<chc> $$1) {
      return exg.a(bl.a.a().b(bw.a.a().a($$0, bul.R).a(by.b(ly.aj.b($$1)))));
   }

   protected void a(bul<?> $$0, euh.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bul<?> $$0, alh<euh> $$1, euh.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
