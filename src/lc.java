import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lc implements le {
   protected static final bq.a a = bq.a.a().a(bo.a.a().a(true));
   private static final Set<bkz<?>> b = ImmutableSet.of(bkz.bt, bkz.d, bkz.ac, bkz.aO, bkz.bf);
   private final cgi c;
   private final cgi d;
   private final Map<bkz<?>, Map<agm, efk.a>> e = Maps.newHashMap();

   protected lc(cgi $$0) {
      this($$0, $$0);
   }

   protected lc(cgi $$0, cgi $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static efk.a a(cse $$0) {
      return efk.b().a(efj.a().a(eiu.a(1.0F)).a(efs.a($$0))).a(efj.a().a(eiu.a(1.0F)).a(efy.a(bkz.aF.j())));
   }

   public abstract void a();

   @Override
   public void generate(BiConsumer<agm, efk.a> $$0) {
      this.a();
      Set<agm> $$1 = Sets.newHashSet();
      kc.h
         .h()
         .forEach(
            $$2 -> {
               bkz<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<agm, efk.a> $$4 = this.e.remove($$3);
                     agm $$5 = $$3.j();
                     if (!$$5.equals(efa.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<agm, efk.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(agm::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bkz<?> $$0) {
      return b.contains($$0) || $$0.f() != blo.h;
   }

   protected eib.a b() {
      return ehv.a(bf.a.a().b(bq.a.a().a(bkz.O)));
   }

   protected eib.a a(bxh $$0) {
      return ehv.a(bf.a.a().b(bq.a.a().a(bkz.O).a(br.a($$0))));
   }

   protected void a(bkz<?> $$0, efk.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bkz<?> $$0, agm $$1, efk.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
