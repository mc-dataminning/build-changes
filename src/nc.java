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
   private final crq b;
   private final crq c;
   private final Map<bus<?>, Map<ali<eus>, eus.a>> d = Maps.newHashMap();

   protected final exm.a a() {
      js.b<dcd> $$0 = this.a.d(ma.aM);
      return exm.a(
         eyb.a(eun.b.a, bw.a.a().a(bu.a.a().b(true))), eyb.a(eun.b.c, bw.a.a().a(bt.a.a().f(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(axf.p), dj.d.c)))))))
      );
   }

   protected nc(crq $$0, js.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nc(crq $$0, crq $$1, js.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static eur.a a(Map<cvj, ali<eus>> $$0) {
      euu.a $$1 = euu.a();

      for (Entry<cvj, ali<eus>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(evg.a($$2.getValue()).a(eyb.a(eun.b.a, bw.a.a().a(dw.a($$2.getKey())))));
      }

      return eur.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<ali<eus>, eus.a> $$0) {
      this.b();
      Set<ali<eus>> $$1 = new HashSet<>();
      lz.f
         .c()
         .forEach(
            $$2 -> {
               bus<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<ali<eus>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<ali<eus>, eus.a> $$5 = this.d.remove($$3);
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
                     Map<ali<eus>, eus.a> $$6 = this.d.remove($$3);
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

   protected exy.a a(jr<bus<?>> $$0) {
      return exr.a(bl.a.a().b(bw.a.a().a($$0, bus.aa)));
   }

   protected exy.a a(jr<bus<?>> $$0, ali<chj> $$1) {
      return exr.a(bl.a.a().b(bw.a.a().a($$0, bus.aa).a(by.b(lz.aj.b($$1)))));
   }

   protected void a(bus<?> $$0, eus.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bus<?> $$0, ali<eus> $$1, eus.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
