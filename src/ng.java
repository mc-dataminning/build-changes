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

public abstract class ng implements ni {
   protected final ju.a a;
   private final cte b;
   private final cte c;
   private final Map<bwb<?>, Map<alc<exq>, exq.a>> d = Maps.newHashMap();

   protected final fai.a a() {
      ju.b<deh> $$0 = this.a.e(me.aS);
      return fai.a(
         fax.a(exl.b.a, bx.a.a().a(bv.a.a().b(true))), fax.a(exl.b.c, bx.a.a().a(bu.a.a().f(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(axc.p), dk.d.c)))))))
      );
   }

   protected ng(cte $$0, ju.a $$1) {
      this($$0, $$0, $$1);
   }

   protected ng(cte $$0, cte $$1, ju.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static exp.a a(Map<cwv, alc<exq>> $$0) {
      exs.a $$1 = exs.a();

      for (Entry<cwv, alc<exq>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(eye.a($$2.getValue()).a(fax.a(exl.b.a, bx.a.a().a(kv.a(kx.aL, $$2.getKey())).a(dx.b()))));
      }

      return exp.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alc<exq>, exq.a> $$0) {
      this.b();
      Set<alc<exq>> $$1 = new HashSet<>();
      md.f
         .c()
         .forEach(
            $$2 -> {
               bwb<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alc<exq>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<alc<exq>, exq.a> $$5 = this.d.remove($$3);
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
                     Map<alc<exq>, exq.a> $$6 = this.d.remove($$3);
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

   protected fau.a a(jt<bwb<?>> $$0) {
      return fan.a(bm.a.a().b(bx.a.a().a($$0, bwb.ab)));
   }

   protected fau.a a(jt<bwb<?>> $$0, alc<cir> $$1) {
      return fan.a(bm.a.a().b(bx.a.a().a($$0, bwb.ab).a(kv.a(kx.aE, md.aj.b($$1)))));
   }

   protected void a(bwb<?> $$0, exq.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bwb<?> $$0, alc<exq> $$1, exq.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
