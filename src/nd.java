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

public abstract class nd implements nf {
   protected final js.a a;
   private final csk b;
   private final csk c;
   private final Map<bvi<?>, Map<alo<ewn>, ewn.a>> d = Maps.newHashMap();

   protected final ezf.a a() {
      js.b<ddq> $$0 = this.a.d(mb.aO);
      return ezf.a(
         ezu.a(ewi.b.a, bw.a.a().a(bu.a.a().b(true))), ezu.a(ewi.b.c, bw.a.a().a(bt.a.a().f(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(axn.p), dj.d.c)))))))
      );
   }

   protected nd(csk $$0, js.a $$1) {
      this($$0, $$0, $$1);
   }

   protected nd(csk $$0, csk $$1, js.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static ewm.a a(Map<cwd, alo<ewn>> $$0) {
      ewp.a $$1 = ewp.a();

      for (Entry<cwd, alo<ewn>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(exb.a($$2.getValue()).a(ezu.a(ewi.b.a, bw.a.a().a(dw.a($$2.getKey())))));
      }

      return ewm.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<alo<ewn>, ewn.a> $$0) {
      this.b();
      Set<alo<ewn>> $$1 = new HashSet<>();
      ma.f
         .c()
         .forEach(
            $$2 -> {
               bvi<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<alo<ewn>> $$4 = $$3.k();
                  if ($$4.isPresent()) {
                     Map<alo<ewn>, ewn.a> $$5 = this.d.remove($$3);
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
                     Map<alo<ewn>, ewn.a> $$6 = this.d.remove($$3);
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

   protected ezr.a a(jr<bvi<?>> $$0) {
      return ezk.a(bl.a.a().b(bw.a.a().a($$0, bvi.ac)));
   }

   protected ezr.a a(jr<bvi<?>> $$0, alo<chz> $$1) {
      return ezk.a(bl.a.a().b(bw.a.a().a($$0, bvi.ac).a(by.b(ma.aj.b($$1)))));
   }

   protected void a(bvi<?> $$0, ewn.a $$1) {
      this.a($$0, $$0.k().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bvi<?> $$0, alo<ewn> $$1, ewn.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
