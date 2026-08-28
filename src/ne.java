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
   private final crr b;
   private final crr c;
   private final Map<buq<?>, Map<akt<evu>, evu.a>> d = Maps.newHashMap();

   protected final eym.a a() {
      jt.b<dcx> $$0 = this.a.d(mc.aO);
      return eym.a(
         ezb.a(evp.b.a, bx.a.a().a(bv.a.a().b(true))), ezb.a(evp.b.c, bx.a.a().a(bu.a.a().f(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(awr.p), dk.d.c)))))))
      );
   }

   protected ne(crr $$0, jt.a $$1) {
      this($$0, $$0, $$1);
   }

   protected ne(crr $$0, crr $$1, jt.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static evt.a a(Map<cvk, akt<evu>> $$0) {
      evw.a $$1 = evw.a();

      for (Entry<cvk, akt<evu>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(ewi.a($$2.getValue()).a(ezb.a(evp.b.a, bx.a.a().a(dx.a($$2.getKey())))));
      }

      return evt.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<akt<evu>, evu.a> $$0) {
      this.b();
      Set<akt<evu>> $$1 = new HashSet<>();
      mb.f
         .c()
         .forEach(
            $$2 -> {
               buq<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<akt<evu>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<akt<evu>, evu.a> $$5 = this.d.remove($$3);
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
                     Map<akt<evu>, evu.a> $$6 = this.d.remove($$3);
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

   protected eyy.a a(js<buq<?>> $$0) {
      return eyr.a(bm.a.a().b(bx.a.a().a($$0, buq.ab)));
   }

   protected eyy.a a(js<buq<?>> $$0, akt<chh> $$1) {
      return eyr.a(bm.a.a().b(bx.a.a().a($$0, buq.ab).a(bz.b(mb.aj.b($$1)))));
   }

   protected void a(buq<?> $$0, evu.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(buq<?> $$0, akt<evu> $$1, evu.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
