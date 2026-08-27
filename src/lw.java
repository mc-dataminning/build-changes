import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class lw implements ly {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<bqg<?>> b = ImmutableSet.of(bqg.bx, bqg.d, bqg.af, bqg.aR, bqg.bi);
   private final cmn c;
   private final cmn d;
   private final Map<bqg<?>, Map<ajv, ens.a>> e = Maps.newHashMap();

   protected lw(cmn $$0) {
      this($$0, $$0);
   }

   protected lw(cmn $$0, cmn $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static ens.a a(czf $$0) {
      return ens.b().a(enr.a().a(ere.a(1.0F)).a(eoa.a($$0))).a(enr.a().a(ere.a(1.0F)).a(eog.a(bqg.aI.j())));
   }

   public abstract void a();

   @Override
   public void generate(ip.a $$0, BiConsumer<ajv, ens.a> $$1) {
      this.a();
      Set<ajv> $$2 = Sets.newHashSet();
      kt.g
         .h()
         .forEach(
            $$2x -> {
               bqg<?> $$3 = (bqg<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<ajv, ens.a> $$4 = this.e.remove($$3);
                     ajv $$5 = $$3.j();
                     if (!$$5.equals(eni.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<ajv, ens.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(ajv::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bqg<?> $$0) {
      return b.contains($$0) || $$0.f() != bqw.h;
   }

   protected eql.a b() {
      return eqf.a(bg.a.a().b(br.a.a().a(bqg.R)));
   }

   protected eql.a a(cct $$0) {
      return eqf.a(bg.a.a().b(br.a.a().a(bqg.R).a(bs.a($$0))));
   }

   protected void a(bqg<?> $$0, ens.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bqg<?> $$0, ajv $$1, ens.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
