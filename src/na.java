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

public abstract class na implements nc {
   protected final jr.a a;
   private final cra b;
   private final cra c;
   private final Map<bug<?>, Map<alg<eub>, eub.a>> d = Maps.newHashMap();

   protected final ewv.a a() {
      jr.b<dbm> $$0 = this.a.d(ly.aM);
      return ewv.a(
         exk.a(etw.b.a, bv.a.a().a(bt.a.a().b(true))), exk.a(etw.b.c, bv.a.a().a(bs.a.a().f(ct.a.a().a(cv.b, co.a(List.of(new bq($$0.b(axc.p), di.d.c)))))))
      );
   }

   protected na(cra $$0, jr.a $$1) {
      this($$0, $$0, $$1);
   }

   protected na(cra $$0, cra $$1, jr.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static eua.a a(Map<cuu, alg<eub>> $$0) {
      eud.a $$1 = eud.a();

      for (Entry<cuu, alg<eub>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(eup.a($$2.getValue()).a(exk.a(etw.b.a, bv.a.a().a(dv.a($$2.getKey())))));
      }

      return eua.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alg<eub>, eub.a> $$0) {
      this.b();
      Set<alg<eub>> $$1 = new HashSet<>();
      lx.f
         .c()
         .forEach(
            $$2 -> {
               bug<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alg<eub>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<alg<eub>, eub.a> $$5 = this.d.remove($$3);
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
                     Map<alg<eub>, eub.a> $$6 = this.d.remove($$3);
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

   protected exh.a a(jq<bug<?>> $$0) {
      return exa.a(bk.a.a().b(bv.a.a().a($$0, bug.R)));
   }

   protected exh.a a(jq<bug<?>> $$0, alg<cgx> $$1) {
      return exa.a(bk.a.a().b(bv.a.a().a($$0, bug.R).a(bx.b(lx.aj.b($$1)))));
   }

   protected void a(bug<?> $$0, eub.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bug<?> $$0, alg<eub> $$1, eub.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
