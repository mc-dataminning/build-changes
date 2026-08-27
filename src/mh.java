import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class mh implements mj {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<bsc<?>> b = ImmutableSet.of(bsc.by, bsc.d, bsc.af, bsc.aS, bsc.bj);
   private final col c;
   private final col d;
   private final Map<bsc<?>, Map<akm<epm>, epm.a>> e = Maps.newHashMap();

   protected mh(col $$0) {
      this($$0, $$0);
   }

   protected mh(col $$0, col $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static epm.a a(day $$0) {
      return epm.b().a(epl.a().a(etg.a(1.0F)).a(epu.a($$0))).a(epl.a().a(etg.a(1.0F)).a(eqa.a(bsc.aJ.k())));
   }

   public abstract void a();

   @Override
   public void generate(iz.a $$0, BiConsumer<akm<epm>, epm.a> $$1) {
      this.a();
      Set<akm<epm>> $$2 = new HashSet<>();
      le.g
         .h()
         .forEach(
            $$2x -> {
               bsc<?> $$3 = (bsc<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akm<epm>, epm.a> $$4 = this.e.remove($$3);
                     akm<epm> $$5 = $$3.k();
                     if ($$5 != epf.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2x.h().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$2.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2x.h().a()));
                           } else {
                              $$1.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<akm<epm>, epm.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map($$0xx -> $$0xx.a().toString()).collect(Collectors.joining(",")),
                              $$2x.h().a()
                           )
                        );
                     }
                  }
               }
            }
         );
      if (!this.e.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.e.keySet());
      }
   }

   private static boolean a(bsc<?> $$0) {
      return b.contains($$0) || $$0.f() != bst.h;
   }

   protected esn.a b() {
      return esh.a(bg.a.a().b(br.a.a().a(bsc.R)));
   }

   protected esn.a a(akm<cer> $$0) {
      return esh.a(bg.a.a().b(br.a.a().a(bsc.R).a(bt.b(le.al.g($$0)))));
   }

   protected void a(bsc<?> $$0, epm.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsc<?> $$0, akm<epm> $$1, epm.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
