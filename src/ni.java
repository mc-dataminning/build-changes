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

public abstract class ni implements nk {
   protected final jg.a a;
   private final cuh b;
   private final cuh c;
   private final Map<bwm<?>, Map<alf<eze>, eze.a>> d = Maps.newHashMap();

   protected final fbw.a a() {
      jg.b<dfl> $$0 = this.a.e(mg.aQ);
      return fbw.a(
         fcl.a(eyz.b.a, bx.a.a().a(bv.a.a().b(true))), fcl.a(eyz.b.c, bx.a.a().a(bu.a.a().f(cl.a.a().a(kt.b, ku.a(List.of(new bs($$0.b(axe.p), cv.d.c)))))))
      );
   }

   protected ni(cuh $$0, jg.a $$1) {
      this($$0, $$0, $$1);
   }

   protected ni(cuh $$0, cuh $$1, jg.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static ezd.a a(Map<cxw, alf<eze>> $$0) {
      ezg.a $$1 = ezg.a();

      for (Entry<cxw, alf<eze>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(ezs.a($$2.getValue()).a(fcl.a(eyz.b.a, bx.a.a().a(kd.a(kj.aP, $$2.getKey())).a(dh.b()))));
      }

      return ezd.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alf<eze>, eze.a> $$0) {
      this.b();
      Set<alf<eze>> $$1 = new HashSet<>();
      mf.f
         .c()
         .forEach(
            $$2 -> {
               bwm<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alf<eze>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<alf<eze>, eze.a> $$5 = this.d.remove($$3);
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
                     Map<alf<eze>, eze.a> $$6 = this.d.remove($$3);
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

   protected fci.a a(jf<bwm<?>> $$0) {
      return fcb.a(bm.a.a().b(bx.a.a().a($$0, bwm.ab)));
   }

   protected fci.a a(jf<bwm<?>> $$0, jf<ckt> $$1, alf<ckt> $$2) {
      return fcb.a(bm.a.a().b(bx.a.a().a($$0, bwm.ab).a(kd.a(kj.aI, $$1.b($$2)))));
   }

   protected void a(bwm<?> $$0, eze.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bwm<?> $$0, alf<eze> $$1, eze.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
