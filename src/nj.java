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
   private final cut b;
   private final cut c;
   private final Map<bwr<?>, Map<alf<ezt>, ezt.a>> d = Maps.newHashMap();

   protected final fcl.a a() {
      jh.b<dfx> $$0 = this.a.e(mh.aR);
      return fcl.a(
         fda.a(ezo.b.a, by.a.a().a(bw.a.a().b(true))), fda.a(ezo.b.c, by.a.a().a(bv.a.a().f(cm.a.a().a(ku.b, kv.a(List.of(new bt($$0.b(axe.p), cw.d.c)))))))
      );
   }

   protected nj(cut $$0, jh.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nj(cut $$0, cut $$1, jh.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static ezs.a a(Map<cyi, alf<ezt>> $$0) {
      ezv.a $$1 = ezv.a();

      for (Entry<cyi, alf<ezt>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(fah.a($$2.getValue()).a(fda.a(ezo.b.a, by.a.a().a(ke.a(kk.aQ, $$2.getKey())).a(di.b()))));
      }

      return ezs.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alf<ezt>, ezt.a> $$0) {
      this.b();
      Set<alf<ezt>> $$1 = new HashSet<>();
      mg.f
         .c()
         .forEach(
            $$2 -> {
               bwr<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alf<ezt>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<alf<ezt>, ezt.a> $$5 = this.d.remove($$3);
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
                     Map<alf<ezt>, ezt.a> $$6 = this.d.remove($$3);
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

   protected fcx.a a(jg<bwr<?>> $$0) {
      return fcq.a(bn.a.a().b(by.a.a().a($$0, bwr.ab)));
   }

   protected fcx.a a(jg<bwr<?>> $$0, jg<clb> $$1, alf<clb> $$2) {
      return fcq.a(bn.a.a().b(by.a.a().a($$0, bwr.ab).a(ke.a(kk.aJ, $$1.b($$2)))));
   }

   protected void a(bwr<?> $$0, ezt.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bwr<?> $$0, alf<ezt> $$1, ezt.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
