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
   private static final Set<biu<?>> b = ImmutableSet.of(biu.bt, biu.d, biu.ac, biu.aO, biu.bf);
   private final cec c;
   private final cec d;
   private final Map<biu<?>, Map<aew, ecy.a>> e = Maps.newHashMap();

   protected kb(cec $$0) {
      this($$0, $$0);
   }

   protected kb(cec $$0, cec $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ecy.a a(cpu $$0) {
      return ecy.b().a(ecx.a().a(egi.a(1.0F)).a(edg.a($$0))).a(ecx.a().a(egi.a(1.0F)).a(edm.a(biu.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<aew, ecy.a> $$0) {
      this.a();
      Set<aew> $$1 = Sets.newHashSet();
      jb.h
         .h()
         .forEach(
            $$2 -> {
               biu<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<aew, ecy.a> $$4 = this.e.remove($$3);
                     aew $$5 = $$3.j();
                     if (!$$5.equals(eco.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<aew, ecy.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(aew::toString).collect(Collectors.joining(",")),
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

   private static boolean a(biu<?> $$0) {
      return b.contains($$0) || $$0.f() != bjj.h;
   }

   protected efp.a b() {
      return efj.a(bf.a.a().b(bq.a.a().a(biu.O)));
   }

   protected efp.a a(bvc $$0) {
      return efj.a(bf.a.a().b(bq.a.a().a(biu.O).a(br.a($$0))));
   }

   protected void a(biu<?> $$0, ecy.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(biu<?> $$0, aew $$1, ecy.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
