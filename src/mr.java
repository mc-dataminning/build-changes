import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class mr implements mt {
   private static final Set<bsn<?>> b = ImmutableSet.of(bsn.by, bsn.d, bsn.af, bsn.aS, bsn.bj);
   protected final jl.a a;
   private final coz c;
   private final coz d;
   private final Map<bsn<?>, Map<akj<erb>, erb.a>> e = Maps.newHashMap();

   protected final etv.a a() {
      jl.b<czm> $$0 = this.a.b(lr.aK);
      return etv.a(
         euk.a(eqw.b.a, bu.a.a().a(bs.a.a().b(true))), euk.a(eqw.b.c, bu.a.a().a(br.a.a().f(cp.a.a().a(cr.b, cl.a(List.of(new bp($$0.b(avz.p), de.d.c)))))))
      );
   }

   protected mr(coz $$0, jl.a $$1) {
      this($$0, $$0, $$1);
   }

   protected mr(coz $$0, coz $$1, jl.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
   }

   protected static erb.a a(dcf $$0) {
      return erb.b().a(era.a().a(eva.a(1.0F)).a(erj.a($$0))).a(era.a().a(eva.a(1.0F)).a(erp.a(bsn.aJ.k())));
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<akj<erb>, erb.a> $$0) {
      this.b();
      Set<akj<erb>> $$1 = new HashSet<>();
      lq.f
         .i()
         .forEach(
            $$2 -> {
               bsn<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akj<erb>, erb.a> $$4 = this.e.remove($$3);
                     akj<erb> $$5 = $$3.k();
                     if ($$5 != eqs.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<akj<erb>, erb.a> $$6 = this.e.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map($$0xx -> $$0xx.a().toString()).collect(Collectors.joining(",")),
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

   private static boolean a(bsn<?> $$0) {
      return b.contains($$0) || $$0.f() != btf.h;
   }

   protected euh.a c() {
      return eua.a(bj.a.a().b(bu.a.a().a(bsn.R)));
   }

   protected euh.a a(akj<cfd> $$0) {
      return eua.a(bj.a.a().b(bu.a.a().a(bsn.R).a(bw.b(lq.aj.g($$0)))));
   }

   protected void a(bsn<?> $$0, erb.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsn<?> $$0, akj<erb> $$1, erb.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
