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
   private final cru b;
   private final cru c;
   private final Map<but<?>, Map<aku<evx>, evx.a>> d = Maps.newHashMap();

   protected final eyp.a a() {
      jt.b<dda> $$0 = this.a.d(mc.aO);
      return eyp.a(
         eze.a(evs.b.a, bx.a.a().a(bv.a.a().b(true))), eze.a(evs.b.c, bx.a.a().a(bu.a.a().f(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(aws.p), dk.d.c)))))))
      );
   }

   protected ne(cru $$0, jt.a $$1) {
      this($$0, $$0, $$1);
   }

   protected ne(cru $$0, cru $$1, jt.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static evw.a a(Map<cvn, aku<evx>> $$0) {
      evz.a $$1 = evz.a();

      for (Entry<cvn, aku<evx>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(ewl.a($$2.getValue()).a(eze.a(evs.b.a, bx.a.a().a(dx.a($$2.getKey())))));
      }

      return evw.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<aku<evx>, evx.a> $$0) {
      this.b();
      Set<aku<evx>> $$1 = new HashSet<>();
      mb.f
         .c()
         .forEach(
            $$2 -> {
               but<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<aku<evx>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<aku<evx>, evx.a> $$5 = this.d.remove($$3);
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
                     Map<aku<evx>, evx.a> $$6 = this.d.remove($$3);
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

   protected ezb.a a(js<but<?>> $$0) {
      return eyu.a(bm.a.a().b(bx.a.a().a($$0, but.ab)));
   }

   protected ezb.a a(js<but<?>> $$0, aku<chk> $$1) {
      return eyu.a(bm.a.a().b(bx.a.a().a($$0, but.ab).a(bz.b(mb.aj.b($$1)))));
   }

   protected void a(but<?> $$0, evx.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(but<?> $$0, aku<evx> $$1, evx.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
