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
   private static final Set<bsm<?>> b = ImmutableSet.of(bsm.by, bsm.d, bsm.af, bsm.aS, bsm.bj);
   protected final jl.a a;
   private final coy c;
   private final coy d;
   private final Map<bsm<?>, Map<akj<eqz>, eqz.a>> e = Maps.newHashMap();

   protected final ett.a a() {
      jl.b<czl> $$0 = this.a.b(lr.aK);
      return ett.a(
         eui.a(equ.b.a, bu.a.a().a(bs.a.a().b(true))), eui.a(equ.b.c, bu.a.a().a(br.a.a().f(cp.a.a().a(cr.b, cl.a(List.of(new bp($$0.b(avz.p), de.d.c)))))))
      );
   }

   protected mr(coy $$0, jl.a $$1) {
      this($$0, $$0, $$1);
   }

   protected mr(coy $$0, coy $$1, jl.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
   }

   protected static eqz.a a(dce $$0) {
      return eqz.b().a(eqy.a().a(euy.a(1.0F)).a(erh.a($$0))).a(eqy.a().a(euy.a(1.0F)).a(ern.a(bsm.aJ.k())));
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<akj<eqz>, eqz.a> $$0) {
      this.b();
      Set<akj<eqz>> $$1 = new HashSet<>();
      lq.f
         .i()
         .forEach(
            $$2 -> {
               bsm<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akj<eqz>, eqz.a> $$4 = this.e.remove($$3);
                     akj<eqz> $$5 = $$3.k();
                     if ($$5 != eqq.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<akj<eqz>, eqz.a> $$6 = this.e.remove($$3);
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

   private static boolean a(bsm<?> $$0) {
      return b.contains($$0) || $$0.f() != bte.h;
   }

   protected euf.a c() {
      return ety.a(bj.a.a().b(bu.a.a().a(bsm.R)));
   }

   protected euf.a a(akj<cfc> $$0) {
      return ety.a(bj.a.a().b(bu.a.a().a(bsm.R).a(bw.b(lq.aj.g($$0)))));
   }

   protected void a(bsm<?> $$0, eqz.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsm<?> $$0, akj<eqz> $$1, eqz.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
