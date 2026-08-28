import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gto implements gsy<dzc> {
   private final Function<dty.a, gii> a;
   private static final Map<dty.a, alg> b = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dty.b.c, alg.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dty.b.d, alg.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dty.b.f, alg.b("textures/entity/zombie/zombie.png"));
      $$0.put(dty.b.g, alg.b("textures/entity/creeper/creeper.png"));
      $$0.put(dty.b.i, alg.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dty.b.h, alg.b("textures/entity/piglin/piglin.png"));
      $$0.put(dty.b.e, hkc.a());
   });

   @Nullable
   public static gii a(gjk $$0, dty.a $$1) {
      if ($$1 instanceof dty.b $$2) {
         return (gii)(switch ($$2) {
            case c -> new gih($$0.a(gjn.dd));
            case d -> new gih($$0.a(gjn.dX));
            case e -> new gih($$0.a(gjn.cv));
            case f -> new gih($$0.a(gjn.ej));
            case g -> new gih($$0.a(gjn.as));
            case i -> new gjh($$0.a(gjn.aF));
            case h -> new ghm($$0.a(gjn.cl));
         });
      } else {
         return null;
      }
   }

   public gto(gsz.a $$0) {
      gjk $$1 = $$0.f();
      this.a = ag.b($$1x -> a($$1, $$1x));
   }

   public void a(dzc $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      float $$7 = $$0.a($$1);
      eao $$8 = $$0.m();
      boolean $$9 = $$8.b() instanceof dwe;
      jb $$10 = $$9 ? $$8.c(dwe.d) : null;
      int $$11 = $$9 ? ebu.a($$10.g()) : $$8.c(dty.e);
      float $$12 = ebu.b($$11);
      dty.a $$13 = ((dli)$$8.b()).b();
      gii $$14 = this.a.apply($$13);
      gqx $$15 = a($$13, $$0.c());
      a($$10, $$12, $$7, $$2, $$3, $$4, $$14, $$15);
   }

   public static void a(@Nullable jb $$0, float $$1, float $$2, fjy $$3, gqm $$4, int $$5, gii $$6, gqx $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fkc $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hja.d);
      $$3.b();
   }

   public static gqx a(dty.a $$0, @Nullable dck $$1) {
      return a($$0, $$1, null);
   }

   public static gqx a(dty.a $$0, @Nullable dck $$1, @Nullable alg $$2) {
      return $$0 == dty.b.e && $$1 != null ? gqx.j($$2 != null ? $$2 : fpo.Q().an().b($$1.f()).a()) : gqx.h($$2 != null ? $$2 : b.get($$0));
   }
}
