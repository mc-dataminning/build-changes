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

public abstract class nf implements nh {
   protected final js.a a;
   private final cst b;
   private final cst c;
   private final Map<bvr<?>, Map<aly<ewu>, ewu.a>> d = Maps.newHashMap();

   protected final ezm.a a() {
      js.b<ddz> $$0 = this.a.d(mb.aO);
      return ezm.a(
         fab.a(ewp.b.a, bw.a.a().a(bu.a.a().b(true))), fab.a(ewp.b.c, bw.a.a().a(bt.a.a().f(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(axx.p), dj.d.c)))))))
      );
   }

   protected nf(cst $$0, js.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nf(cst $$0, cst $$1, js.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static ewt.a a(Map<cwm, aly<ewu>> $$0) {
      eww.a $$1 = eww.a();

      for (Entry<cwm, aly<ewu>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(exi.a($$2.getValue()).a(fab.a(ewp.b.a, bw.a.a().a(dw.a($$2.getKey())))));
      }

      return ewt.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<aly<ewu>, ewu.a> $$0) {
      this.b();
      Set<aly<ewu>> $$1 = new HashSet<>();
      ma.f
         .c()
         .forEach(
            $$2 -> {
               bvr<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<aly<ewu>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<aly<ewu>, ewu.a> $$5 = this.d.remove($$3);
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
                     Map<aly<ewu>, ewu.a> $$6 = this.d.remove($$3);
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

   protected ezy.a a(jr<bvr<?>> $$0) {
      return ezr.a(bl.a.a().b(bw.a.a().a($$0, bvr.ac)));
   }

   protected ezy.a a(jr<bvr<?>> $$0, aly<cii> $$1) {
      return ezr.a(bl.a.a().b(bw.a.a().a($$0, bvr.ac).a(by.b(ma.aj.b($$1)))));
   }

   protected void a(bvr<?> $$0, ewu.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bvr<?> $$0, aly<ewu> $$1, ewu.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
