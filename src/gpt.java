import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gpt implements gpg.a {
   private final flz a;
   private final Map<alo<dgz>, Map<String, env>> b = Maps.newIdentityHashMap();
   private final Map<alo<dgz>, Map<String, abj.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gpt(flz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgl $$0, glg $$1, double $$2, double $$3, double $$4) {
      fli $$5 = this.a.j.k();
      alo<dgz> $$6 = this.a.s.ai();
      jh $$7 = jh.a($$5.b().d, 0.0, $$5.b().f);
      fgp $$8 = $$1.getBuffer(glq.y());
      if (this.b.containsKey($$6)) {
         for (env $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gma.a(
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

      Map<String, abj.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abj.a $$11 : $$10.values()) {
            env $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gma.a(
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
                  gma.a(
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

   public void a(env $$0, List<abj.a> $$1, alo<dgz> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abj.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abj.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
