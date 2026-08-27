import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class kd implements kf {
   protected static final bq.a a = bq.a.a().a(bo.a.a().a(true));
   private static final Set<biw<?>> b = ImmutableSet.of(biw.bt, biw.d, biw.ac, biw.aO, biw.bf);
   private final cee c;
   private final cee d;
   private final Map<biw<?>, Map<aey, eda.a>> e = Maps.newHashMap();

   protected kd(cee $$0) {
      this($$0, $$0);
   }

   protected kd(cee $$0, cee $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eda.a a(cpw $$0) {
      return eda.b().a(ecz.a().a(egk.a(1.0F)).a(edi.a($$0))).a(ecz.a().a(egk.a(1.0F)).a(edo.a(biw.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<aey, eda.a> $$0) {
      this.a();
      Set<aey> $$1 = Sets.newHashSet();
      jd.h
         .h()
         .forEach(
            $$2 -> {
               biw<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<aey, eda.a> $$4 = this.e.remove($$3);
                     aey $$5 = $$3.j();
                     if (!$$5.equals(ecq.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<aey, eda.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(aey::toString).collect(Collectors.joining(",")),
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

   private static boolean a(biw<?> $$0) {
      return b.contains($$0) || $$0.f() != bjl.h;
   }

   protected efr.a b() {
      return efl.a(bf.a.a().b(bq.a.a().a(biw.O)));
   }

   protected efr.a a(bve $$0) {
      return efl.a(bf.a.a().b(bq.a.a().a(biw.O).a(br.a($$0))));
   }

   protected void a(biw<?> $$0, eda.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(biw<?> $$0, aey $$1, eda.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
