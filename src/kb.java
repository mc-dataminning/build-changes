import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class kb implements kd {
   protected static final bq.a a = bq.a.a().a(bo.a.a().a(true));
   private static final Set<bja<?>> b = ImmutableSet.of(bja.bt, bja.d, bja.ac, bja.aO, bja.bf);
   private final cei c;
   private final cei d;
   private final Map<bja<?>, Map<aez, ecs.a>> e = Maps.newHashMap();

   protected kb(cei $$0) {
      this($$0, $$0);
   }

   protected kb(cei $$0, cei $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ecs.a a(cqa $$0) {
      return ecs.b().a(ecr.a().a(egc.a(1.0F)).a(eda.a($$0))).a(ecr.a().a(egc.a(1.0F)).a(edg.a(bja.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<aez, ecs.a> $$0) {
      this.a();
      Set<aez> $$1 = Sets.newHashSet();
      jb.h
         .h()
         .forEach(
            $$2 -> {
               bja<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<aez, ecs.a> $$4 = this.e.remove($$3);
                     aez $$5 = $$3.j();
                     if (!$$5.equals(eci.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<aez, ecs.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(aez::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bja<?> $$0) {
      return b.contains($$0) || $$0.f() != bjp.h;
   }

   protected efj.a b() {
      return efd.a(bf.a.a().b(bq.a.a().a(bja.O)));
   }

   protected efj.a a(bvi $$0) {
      return efd.a(bf.a.a().b(bq.a.a().a(bja.O).a(br.a($$0))));
   }

   protected void a(bja<?> $$0, ecs.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bja<?> $$0, aez $$1, ecs.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
