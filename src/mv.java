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

public abstract class mv implements mx {
   private static final Set<bsx<?>> b = ImmutableSet.of(bsx.by, bsx.d, bsx.af, bsx.aS, bsx.bj);
   protected final jo.a a;
   private final cpl c;
   private final cpl d;
   private final Map<bsx<?>, Map<akq<erw>, erw.a>> e = Maps.newHashMap();

   protected final euq.a a() {
      jo.b<dac> $$0 = this.a.b(lu.aL);
      return euq.a(
         evf.a(err.b.a, bv.a.a().a(bt.a.a().b(true))), evf.a(err.b.c, bv.a.a().a(bs.a.a().f(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(awh.p), dh.d.c)))))))
      );
   }

   protected mv(cpl $$0, jo.a $$1) {
      this($$0, $$0, $$1);
   }

   protected mv(cpl $$0, cpl $$1, jo.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
   }

   protected static erw.a a(dcv $$0) {
      return erw.b().a(erv.a().a(evv.a(1.0F)).a(ese.a($$0))).a(erv.a().a(evv.a(1.0F)).a(esk.a(bsx.aJ.k())));
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<akq<erw>, erw.a> $$0) {
      this.b();
      Set<akq<erw>> $$1 = new HashSet<>();
      lt.f
         .i()
         .forEach(
            $$2 -> {
               bsx<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akq<erw>, erw.a> $$4 = this.e.remove($$3);
                     akq<erw> $$5 = $$3.k();
                     if ($$5 != ern.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<akq<erw>, erw.a> $$6 = this.e.remove($$3);
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

   private static boolean a(bsx<?> $$0) {
      return b.contains($$0) || $$0.f() != btq.h;
   }

   protected evc.a c() {
      return euv.a(bk.a.a().b(bv.a.a().a(bsx.R)));
   }

   protected evc.a a(akq<cfp> $$0) {
      return euv.a(bk.a.a().b(bv.a.a().a(bsx.R).a(bx.b(lt.aj.g($$0)))));
   }

   protected void a(bsx<?> $$0, erw.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsx<?> $$0, akq<erw> $$1, erw.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
