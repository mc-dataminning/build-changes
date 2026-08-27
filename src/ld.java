import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class ld implements lf {
   protected static final bp.a a = bp.a.a().a(bn.a.a().a(true));
   private static final Set<blt<?>> b = ImmutableSet.of(blt.bv, blt.d, blt.ad, blt.aP, blt.bg);
   private final chl c;
   private final chl d;
   private final Map<blt<?>, Map<ahd, egx.a>> e = Maps.newHashMap();

   protected ld(chl $$0) {
      this($$0, $$0);
   }

   protected ld(chl $$0, chl $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static egx.a a(cth $$0) {
      return egx.b().a(egw.a().a(ekh.a(1.0F)).a(ehf.a($$0))).a(egw.a().a(ekh.a(1.0F)).a(ehl.a(blt.aG.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<ahd, egx.a> $$0) {
      this.a();
      Set<ahd> $$1 = Sets.newHashSet();
      kd.g
         .h()
         .forEach(
            $$2 -> {
               blt<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ahd, egx.a> $$4 = this.e.remove($$3);
                     ahd $$5 = $$3.j();
                     if (!$$5.equals(egn.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ahd, egx.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(ahd::toString).collect(Collectors.joining(",")),
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

   private static boolean a(blt<?> $$0) {
      return b.contains($$0) || $$0.f() != bmi.h;
   }

   protected ejo.a b() {
      return eji.a(bf.a.a().b(bp.a.a().a(blt.P)));
   }

   protected ejo.a a(byd $$0) {
      return eji.a(bf.a.a().b(bp.a.a().a(blt.P).a(bq.a($$0))));
   }

   protected void a(blt<?> $$0, egx.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(blt<?> $$0, ahd $$1, egx.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
