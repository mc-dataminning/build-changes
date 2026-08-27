import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lf implements lh {
   protected static final bp.a a = bp.a.a().a(bn.a.a().a(true));
   private static final Set<bly<?>> b = ImmutableSet.of(bly.bv, bly.d, bly.ad, bly.aP, bly.bg);
   private final chr c;
   private final chr d;
   private final Map<bly<?>, Map<ahg, ehd.a>> e = Maps.newHashMap();

   protected lf(chr $$0) {
      this($$0, $$0);
   }

   protected lf(chr $$0, chr $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ehd.a a(ctn $$0) {
      return ehd.b().a(ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0))).a(ehc.a().a(ekn.a(1.0F)).a(ehr.a(bly.aG.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<ahg, ehd.a> $$0) {
      this.a();
      Set<ahg> $$1 = Sets.newHashSet();
      kd.g
         .h()
         .forEach(
            $$2 -> {
               bly<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ahg, ehd.a> $$4 = this.e.remove($$3);
                     ahg $$5 = $$3.j();
                     if (!$$5.equals(egt.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2.g().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.g().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<ahg, ehd.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(ahg::toString).collect(Collectors.joining(",")),
                              $$2.g().a()
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

   private static boolean a(bly<?> $$0) {
      return b.contains($$0) || $$0.f() != bmn.h;
   }

   protected eju.a b() {
      return ejo.a(bf.a.a().b(bp.a.a().a(bly.P)));
   }

   protected eju.a a(byi $$0) {
      return ejo.a(bf.a.a().b(bp.a.a().a(bly.P).a(bq.a($$0))));
   }

   protected void a(bly<?> $$0, ehd.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bly<?> $$0, ahg $$1, ehd.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
