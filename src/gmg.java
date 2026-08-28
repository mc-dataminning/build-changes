import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gmg implements glr<dum> {
   private final Map<dps.a, gbg> a;
   private static final Map<dps.a, alj> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dps.b.c, alj.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dps.b.d, alj.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dps.b.f, alj.b("textures/entity/zombie/zombie.png"));
      $$0.put(dps.b.g, alj.b("textures/entity/creeper/creeper.png"));
      $$0.put(dps.b.i, alj.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dps.b.h, alj.b("textures/entity/piglin/piglin.png"));
      $$0.put(dps.b.e, gzw.a());
   });

   public static Map<dps.a, gbg> a(gch $$0) {
      Builder<dps.a, gbg> $$1 = ImmutableMap.builder();
      $$1.put(dps.b.c, new gbf($$0.a(gck.cH)));
      $$1.put(dps.b.d, new gbf($$0.a(gck.dw)));
      $$1.put(dps.b.e, new gbf($$0.a(gck.cb)));
      $$1.put(dps.b.f, new gbf($$0.a(gck.dI)));
      $$1.put(dps.b.g, new gbf($$0.a(gck.ag)));
      $$1.put(dps.b.i, new gce($$0.a(gck.ar)));
      $$1.put(dps.b.h, new gak($$0.a(gck.bR)));
      return $$1.build();
   }

   public gmg(gls.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dum $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dvv $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof drr;
      jm $$9 = $$8 ? $$7.c(drr.d) : null;
      int $$10 = $$8 ? dxa.a($$9.g()) : $$7.c(dps.e);
      float $$11 = dxa.b($$10);
      dps.a $$12 = ((dhm)$$7.b()).b();
      gbg $$13 = this.a.get($$12);
      gjq $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jm $$0, float $$1, float $$2, fer $$3, gjg $$4, int $$5, gbg $$6, gjq $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fev $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gyv.d);
      $$3.b();
   }

   public static gjq a(dps.a $$0, @Nullable czl $$1) {
      alj $$2 = b.get($$0);
      if ($$0 == dps.b.e && $$1 != null) {
         hag $$3 = fke.Q().an();
         return gjq.i($$3.b($$1.f()).a());
      } else {
         return gjq.g($$2);
      }
   }
}
