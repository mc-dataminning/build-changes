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

public abstract class nf implements nh {
   protected final js.a a;
   private final css b;
   private final css c;
   private final Map<bvq<?>, Map<aly<ewt>, ewt.a>> d = Maps.newHashMap();

   protected final ezl.a a() {
      js.b<ddy> $$0 = this.a.d(mb.aO);
      return ezl.a(
         faa.a(ewo.b.a, bw.a.a().a(bu.a.a().b(true))), faa.a(ewo.b.c, bw.a.a().a(bt.a.a().f(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(axx.p), dj.d.c)))))))
      );
   }

   protected nf(css $$0, js.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nf(css $$0, css $$1, js.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static ews.a a(Map<cwl, aly<ewt>> $$0) {
      ewv.a $$1 = ewv.a();

      for (Entry<cwl, aly<ewt>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(exh.a($$2.getValue()).a(faa.a(ewo.b.a, bw.a.a().a(dw.a($$2.getKey())))));
      }

      return ews.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<aly<ewt>, ewt.a> $$0) {
      this.b();
      Set<aly<ewt>> $$1 = new HashSet<>();
      ma.f
         .c()
         .forEach(
            $$2 -> {
               bvq<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<aly<ewt>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<aly<ewt>, ewt.a> $$5 = this.d.remove($$3);
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
                     Map<aly<ewt>, ewt.a> $$6 = this.d.remove($$3);
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

   protected ezx.a a(jr<bvq<?>> $$0) {
      return ezq.a(bl.a.a().b(bw.a.a().a($$0, bvq.ac)));
   }

   protected ezx.a a(jr<bvq<?>> $$0, aly<cih> $$1) {
      return ezq.a(bl.a.a().b(bw.a.a().a($$0, bvq.ac).a(by.b(ma.aj.b($$1)))));
   }

   protected void a(bvq<?> $$0, ewt.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bvq<?> $$0, aly<ewt> $$1, ewt.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
