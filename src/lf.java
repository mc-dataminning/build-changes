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
   private static final Set<bmc<?>> b = ImmutableSet.of(bmc.bw, bmc.e, bmc.ae, bmc.aQ, bmc.bh);
   private final cia c;
   private final cia d;
   private final Map<bmc<?>, Map<ahh, ehn.a>> e = Maps.newHashMap();

   protected lf(cia $$0) {
      this($$0, $$0);
   }

   protected lf(cia $$0, cia $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ehn.a a(ctw $$0) {
      return ehn.b().a(ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0))).a(ehm.a().a(ekx.a(1.0F)).a(eib.a(bmc.aH.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<ahh, ehn.a> $$0) {
      this.a();
      Set<ahh> $$1 = Sets.newHashSet();
      kd.g
         .h()
         .forEach(
            $$2 -> {
               bmc<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ahh, ehn.a> $$4 = this.e.remove($$3);
                     ahh $$5 = $$3.j();
                     if (!$$5.equals(ehd.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2.h().a()));
                     }

                     if ($$4 != null) {
                        $$4.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.h().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<ahh, ehn.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(ahh::toString).collect(Collectors.joining(",")),
                              $$2.h().a()
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

   private static boolean a(bmc<?> $$0) {
      return b.contains($$0) || $$0.f() != bmr.h;
   }

   protected eke.a b() {
      return ejy.a(bf.a.a().b(bp.a.a().a(bmc.Q)));
   }

   protected eke.a a(byn $$0) {
      return ejy.a(bf.a.a().b(bp.a.a().a(bmc.Q).a(bq.a($$0))));
   }

   protected void a(bmc<?> $$0, ehn.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bmc<?> $$0, ahh $$1, ehn.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
