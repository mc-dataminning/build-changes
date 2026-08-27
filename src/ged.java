import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ged implements gdo<doy> {
   private final Map<dkg.a, fty> a;
   private static final Map<dkg.a, akh> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkg.b.c, new akh("textures/entity/skeleton/skeleton.png"));
      $$0.put(dkg.b.d, new akh("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dkg.b.f, new akh("textures/entity/zombie/zombie.png"));
      $$0.put(dkg.b.g, new akh("textures/entity/creeper/creeper.png"));
      $$0.put(dkg.b.i, new akh("textures/entity/enderdragon/dragon.png"));
      $$0.put(dkg.b.h, new akh("textures/entity/piglin/piglin.png"));
      $$0.put(dkg.b.e, gnq.a());
   });

   public static Map<dkg.a, fty> a(fux $$0) {
      Builder<dkg.a, fty> $$1 = ImmutableMap.builder();
      $$1.put(dkg.b.c, new ftx($$0.a(fva.br)));
      $$1.put(dkg.b.d, new ftx($$0.a(fva.ca)));
      $$1.put(dkg.b.e, new ftx($$0.a(fva.aT)));
      $$1.put(dkg.b.f, new ftx($$0.a(fva.cg)));
      $$1.put(dkg.b.g, new ftx($$0.a(fva.J)));
      $$1.put(dkg.b.i, new fuv($$0.a(fva.Q)));
      $$1.put(dkg.b.h, new fte($$0.a(fva.aN)));
      return $$1.build();
   }

   public ged(gdp.a $$0) {
      this.a = a($$0.e());
   }

   public void a(doy $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dqh $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dmf;
      is $$9 = $$8 ? $$7.c(dmf.d) : null;
      int $$10 = $$8 ? drn.a($$9.g()) : $$7.c(dkg.e);
      float $$11 = drn.b($$10);
      dkg.a $$12 = ((dca)$$7.b()).b();
      fty $$13 = this.a.get($$12);
      gbw $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable is $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5, fty $$6, gbw $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eyb $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gbw a(dkg.a $$0, @Nullable cvz $$1) {
      akh $$2 = b.get($$0);
      if ($$0 == dkg.b.e && $$1 != null) {
         gnz $$3 = fde.Q().an();
         return gbw.i($$3.b($$1.f()).a());
      } else {
         return gbw.f($$2);
      }
   }
}
