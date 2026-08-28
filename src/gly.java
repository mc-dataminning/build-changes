import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gly implements gll.a {
   private final fip a;
   private final Map<ald<dej>, Map<String, eky>> b = Maps.newIdentityHashMap();
   private final Map<ald<dej>, Map<String, abd.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gly(fip $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4) {
      fhy $$5 = this.a.j.k();
      ald<dej> $$6 = this.a.s.ag();
      jf $$7 = jf.a($$5.b().d, 0.0, $$5.b().f);
      fdm $$8 = $$1.getBuffer(ghv.y());
      if (this.b.containsKey($$6)) {
         for (eky $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gif.a(
                  $$0,
                  $$8,
                  (double)$$9.h() - $$2,
                  (double)$$9.i() - $$3,
                  (double)$$9.j() - $$4,
                  (double)($$9.k() + 1) - $$2,
                  (double)($$9.l() + 1) - $$3,
                  (double)($$9.m() + 1) - $$4,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      Map<String, abd.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abd.a $$11 : $$10.values()) {
            eky $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gif.a(
                     $$0,
                     $$8,
                     (double)$$12.h() - $$2,
                     (double)$$12.i() - $$3,
                     (double)$$12.j() - $$4,
                     (double)($$12.k() + 1) - $$2,
                     (double)($$12.l() + 1) - $$3,
                     (double)($$12.m() + 1) - $$4,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  gif.a(
                     $$0,
                     $$8,
                     (double)$$12.h() - $$2,
                     (double)$$12.i() - $$3,
                     (double)$$12.j() - $$4,
                     (double)($$12.k() + 1) - $$2,
                     (double)($$12.l() + 1) - $$3,
                     (double)($$12.m() + 1) - $$4,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               }
            }
         }
      }
   }

   public void a(eky $$0, List<abd.a> $$1, ald<dej> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abd.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abd.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
