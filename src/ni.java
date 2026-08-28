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
   private final cub b;
   private final cub c;
   private final Map<bwj<?>, Map<ald<eys>, eys.a>> d = Maps.newHashMap();

   protected final fbk.a a() {
      jg.b<dff> $$0 = this.a.e(mg.aP);
      return fbk.a(
         fbz.a(eyn.b.a, bx.a.a().a(bv.a.a().b(true))), fbz.a(eyn.b.c, bx.a.a().a(bu.a.a().f(cl.a.a().a(kt.b, ku.a(List.of(new bs($$0.b(axc.p), cv.d.c)))))))
      );
   }

   protected ni(cub $$0, jg.a $$1) {
      this($$0, $$0, $$1);
   }

   protected ni(cub $$0, cub $$1, jg.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static eyr.a a(Map<cxq, ald<eys>> $$0) {
      eyu.a $$1 = eyu.a();

      for (Entry<cxq, ald<eys>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(ezg.a($$2.getValue()).a(fbz.a(eyn.b.a, bx.a.a().a(kd.a(kj.aO, $$2.getKey())).a(dh.b()))));
      }

      return eyr.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<ald<eys>, eys.a> $$0) {
      this.b();
      Set<ald<eys>> $$1 = new HashSet<>();
      mf.f
         .c()
         .forEach(
            $$2 -> {
               bwj<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<ald<eys>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<ald<eys>, eys.a> $$5 = this.d.remove($$3);
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
                     Map<ald<eys>, eys.a> $$6 = this.d.remove($$3);
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

   protected fbw.a a(jf<bwj<?>> $$0) {
      return fbp.a(bm.a.a().b(bx.a.a().a($$0, bwj.ab)));
   }

   protected fbw.a a(jf<bwj<?>> $$0, jf<ckn> $$1, ald<ckn> $$2) {
      return fbp.a(bm.a.a().b(bx.a.a().a($$0, bwj.ab).a(kd.a(kj.aH, $$1.b($$2)))));
   }

   protected void a(bwj<?> $$0, eys.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bwj<?> $$0, ald<eys> $$1, eys.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
