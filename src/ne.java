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

public abstract class ne implements ng {
   protected final jt.a a;
   private final csn b;
   private final csn c;
   private final Map<bvi<?>, Map<akt<ewt>, ewt.a>> d = Maps.newHashMap();

   protected final ezl.a a() {
      jt.b<ddr> $$0 = this.a.d(mc.aP);
      return ezl.a(
         faa.a(ewo.b.a, bx.a.a().a(bv.a.a().b(true))), faa.a(ewo.b.c, bx.a.a().a(bu.a.a().f(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(aws.p), dk.d.c)))))))
      );
   }

   protected ne(csn $$0, jt.a $$1) {
      this($$0, $$0, $$1);
   }

   protected ne(csn $$0, csn $$1, jt.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static ews.a a(Map<cwe, akt<ewt>> $$0) {
      ewv.a $$1 = ewv.a();

      for (Entry<cwe, akt<ewt>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(exh.a($$2.getValue()).a(faa.a(ewo.b.a, bx.a.a().a(dx.a($$2.getKey())))));
      }

      return ews.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<akt<ewt>, ewt.a> $$0) {
      this.b();
      Set<akt<ewt>> $$1 = new HashSet<>();
      mb.f
         .c()
         .forEach(
            $$2 -> {
               bvi<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<akt<ewt>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<akt<ewt>, ewt.a> $$5 = this.d.remove($$3);
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
                     Map<akt<ewt>, ewt.a> $$6 = this.d.remove($$3);
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

   protected ezx.a a(js<bvi<?>> $$0) {
      return ezq.a(bm.a.a().b(bx.a.a().a($$0, bvi.ab)));
   }

   protected ezx.a a(js<bvi<?>> $$0, akt<cia> $$1) {
      return ezq.a(bm.a.a().b(bx.a.a().a($$0, bvi.ab).a(bz.b(mb.aj.b($$1)))));
   }

   protected void a(bvi<?> $$0, ewt.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bvi<?> $$0, akt<ewt> $$1, ewt.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
