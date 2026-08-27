import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class mf implements mh {
   protected static final br.a a = br.a.a().a(bp.a.a().a(true));
   private static final Set<bqr<?>> b = ImmutableSet.of(bqr.bx, bqr.d, bqr.af, bqr.aR, bqr.bi);
   private final cmy c;
   private final cmy d;
   private final Map<bqr<?>, Map<akf, eoi.a>> e = Maps.newHashMap();

   protected mf(cmy $$0) {
      this($$0, $$0);
   }

   protected mf(cmy $$0, cmy $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected static eoi.a a(czt $$0) {
      return eoi.b().a(eoh.a().a(esa.a(1.0F)).a(eoq.a($$0))).a(eoh.a().a(esa.a(1.0F)).a(eow.a(bqr.aI.j())));
   }

   public abstract void a();

   @Override
   public void generate(ix.a $$0, BiConsumer<akf, eoi.a> $$1) {
      this.a();
      Set<akf> $$2 = Sets.newHashSet();
      lc.g
         .h()
         .forEach(
            $$2x -> {
               bqr<?> $$3 = (bqr<?>)$$2x.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akf, eoi.a> $$4 = this.e.remove($$3);
                     akf $$5 = $$3.j();
                     if (!$$5.equals(eny.a) && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<akf, eoi.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map(akf::toString).collect(Collectors.joining(",")),
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

   private static boolean a(bqr<?> $$0) {
      return b.contains($$0) || $$0.f() != brh.h;
   }

   protected erh.a b() {
      return erb.a(bg.a.a().b(br.a.a().a(bqr.R)));
   }

   protected erh.a a(cde $$0) {
      return erb.a(bg.a.a().b(br.a.a().a(bqr.R).a(bt.a($$0))));
   }

   protected void a(bqr<?> $$0, eoi.a $$1) {
      this.a($$0, $$0.j(), $$1);
   }

   protected void a(bqr<?> $$0, akf $$1, eoi.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
