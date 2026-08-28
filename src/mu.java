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

public abstract class mu implements mw {
   private static final Set<bsw<?>> b = ImmutableSet.of(bsw.by, bsw.d, bsw.af, bsw.aS, bsw.bj);
   protected final jo.a a;
   private final cpj c;
   private final cpj d;
   private final Map<bsw<?>, Map<akp<erq>, erq.a>> e = Maps.newHashMap();

   protected final euk.a a() {
      jo.b<daa> $$0 = this.a.b(lu.aL);
      return euk.a(
         euz.a(erl.b.a, bv.a.a().a(bt.a.a().b(true))), euz.a(erl.b.c, bv.a.a().a(bs.a.a().f(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(awg.p), dh.d.c)))))))
      );
   }

   protected mu(cpj $$0, jo.a $$1) {
      this($$0, $$0, $$1);
   }

   protected mu(cpj $$0, cpj $$1, jo.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
   }

   protected static erq.a a(dct $$0) {
      return erq.b().a(erp.a().a(evp.a(1.0F)).a(ery.a($$0))).a(erp.a().a(evp.a(1.0F)).a(ese.a(bsw.aJ.k())));
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<akp<erq>, erq.a> $$0) {
      this.b();
      Set<akp<erq>> $$1 = new HashSet<>();
      lt.f
         .i()
         .forEach(
            $$2 -> {
               bsw<?> $$3 = $$2.a();
               if ($$3.a(this.c)) {
                  if (a($$3)) {
                     Map<akp<erq>, erq.a> $$4 = this.e.remove($$3);
                     akp<erq> $$5 = $$3.k();
                     if ($$5 != erh.a && $$3.a(this.d) && ($$4 == null || !$$4.containsKey($$5))) {
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
                     Map<akp<erq>, erq.a> $$6 = this.e.remove($$3);
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

   private static boolean a(bsw<?> $$0) {
      return b.contains($$0) || $$0.f() != bto.h;
   }

   protected euw.a c() {
      return eup.a(bk.a.a().b(bv.a.a().a(bsw.R)));
   }

   protected euw.a a(akp<cfn> $$0) {
      return eup.a(bk.a.a().b(bv.a.a().a(bsw.R).a(bx.b(lt.aj.g($$0)))));
   }

   protected void a(bsw<?> $$0, erq.a $$1) {
      this.a($$0, $$0.k(), $$1);
   }

   protected void a(bsw<?> $$0, akp<erq> $$1, erq.a $$2) {
      this.e.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
