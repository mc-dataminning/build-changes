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

public abstract class nj implements nl {
   protected final jh.a a;
   private final cvh b;
   private final cvh c;
   private final Map<bxc<?>, Map<alh<fam>, fam.a>> d = Maps.newHashMap();

   protected final fde.a a() {
      jh.b<dgl> $$0 = this.a.e(mh.aR);
      return fde.a(
         fdt.a(fah.b.a, by.a.a().a(bw.a.a().b(true))), fdt.a(fah.b.c, by.a.a().a(bv.a.a().f(cm.a.a().a(ku.b, kv.a(List.of(new bt($$0.b(axg.p), cw.d.c)))))))
      );
   }

   protected nj(cvh $$0, jh.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nj(cvh $$0, cvh $$1, jh.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static fal.a a(Map<cyw, alh<fam>> $$0) {
      fao.a $$1 = fao.a();

      for (Entry<cyw, alh<fam>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(fba.a($$2.getValue()).a(fdt.a(fah.b.a, by.a.a().a(ke.a(kk.aR, $$2.getKey())).a(di.b()))));
      }

      return fal.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alh<fam>, fam.a> $$0) {
      this.b();
      Set<alh<fam>> $$1 = new HashSet<>();
      mg.f
         .c()
         .forEach(
            $$2 -> {
               bxc<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alh<fam>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<alh<fam>, fam.a> $$5 = this.d.remove($$3);
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
                     Map<alh<fam>, fam.a> $$6 = this.d.remove($$3);
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

   protected fdq.a a(jg<bxc<?>> $$0) {
      return fdj.a(bn.a.a().b(by.a.a().a($$0, bxc.ac)));
   }

   protected fdq.a a(jg<bxc<?>> $$0, jg<clj> $$1, alh<clj> $$2) {
      return fdj.a(bn.a.a().b(by.a.a().a($$0, bxc.ac).a(ke.a(kk.aK, $$1.b($$2)))));
   }

   protected void a(bxc<?> $$0, fam.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bxc<?> $$0, alh<fam> $$1, fam.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
