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
   private final cum b;
   private final cum c;
   private final Map<bwo<?>, Map<alf<ezm>, ezm.a>> d = Maps.newHashMap();

   protected final fce.a a() {
      jg.b<dfq> $$0 = this.a.e(mg.aR);
      return fce.a(
         fct.a(ezh.b.a, bx.a.a().a(bv.a.a().b(true))), fct.a(ezh.b.c, bx.a.a().a(bu.a.a().f(cl.a.a().a(kt.b, ku.a(List.of(new bs($$0.b(axe.p), cv.d.c)))))))
      );
   }

   protected ni(cum $$0, jg.a $$1) {
      this($$0, $$0, $$1);
   }

   protected ni(cum $$0, cum $$1, jg.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static ezl.a a(Map<cyb, alf<ezm>> $$0) {
      ezo.a $$1 = ezo.a();

      for (Entry<cyb, alf<ezm>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(faa.a($$2.getValue()).a(fct.a(ezh.b.a, bx.a.a().a(kd.a(kj.aQ, $$2.getKey())).a(dh.b()))));
      }

      return ezl.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alf<ezm>, ezm.a> $$0) {
      this.b();
      Set<alf<ezm>> $$1 = new HashSet<>();
      mf.f
         .c()
         .forEach(
            $$2 -> {
               bwo<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alf<ezm>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<alf<ezm>, ezm.a> $$5 = this.d.remove($$3);
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
                     Map<alf<ezm>, ezm.a> $$6 = this.d.remove($$3);
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

   protected fcq.a a(jf<bwo<?>> $$0) {
      return fcj.a(bm.a.a().b(bx.a.a().a($$0, bwo.ab)));
   }

   protected fcq.a a(jf<bwo<?>> $$0, jf<ckx> $$1, alf<ckx> $$2) {
      return fcj.a(bm.a.a().b(bx.a.a().a($$0, bwo.ab).a(kd.a(kj.aJ, $$1.b($$2)))));
   }

   protected void a(bwo<?> $$0, ezm.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bwo<?> $$0, alf<ezm> $$1, ezm.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
