import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gge implements gfp<dqu> {
   private final Map<dmc.a, fvy> a;
   private static final Map<dmc.a, alf> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmc.b.c, new alf("textures/entity/skeleton/skeleton.png"));
      $$0.put(dmc.b.d, new alf("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dmc.b.f, new alf("textures/entity/zombie/zombie.png"));
      $$0.put(dmc.b.g, new alf("textures/entity/creeper/creeper.png"));
      $$0.put(dmc.b.i, new alf("textures/entity/enderdragon/dragon.png"));
      $$0.put(dmc.b.h, new alf("textures/entity/piglin/piglin.png"));
      $$0.put(dmc.b.e, gps.a());
   });

   public static Map<dmc.a, fvy> a(fwx $$0) {
      Builder<dmc.a, fvy> $$1 = ImmutableMap.builder();
      $$1.put(dmc.b.c, new fvx($$0.a(fxa.br)));
      $$1.put(dmc.b.d, new fvx($$0.a(fxa.ca)));
      $$1.put(dmc.b.e, new fvx($$0.a(fxa.aT)));
      $$1.put(dmc.b.f, new fvx($$0.a(fxa.cg)));
      $$1.put(dmc.b.g, new fvx($$0.a(fxa.J)));
      $$1.put(dmc.b.i, new fwv($$0.a(fxa.Q)));
      $$1.put(dmc.b.h, new fve($$0.a(fxa.aN)));
      return $$1.build();
   }

   public gge(gfq.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dqu $$0, float $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dsd $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dob;
      je $$9 = $$8 ? $$7.c(dob.d) : null;
      int $$10 = $$8 ? dtj.a($$9.g()) : $$7.c(dmc.e);
      float $$11 = dtj.b($$10);
      dmc.a $$12 = ((ddw)$$7.b()).b();
      fvy $$13 = this.a.get($$12);
      gdx $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable je $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5, fvy $$6, gdx $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fad $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gdx a(dmc.a $$0, @Nullable cxs $$1) {
      alf $$2 = b.get($$0);
      if ($$0 == dmc.b.e && $$1 != null) {
         gqb $$3 = ffg.Q().am();
         return gdx.i($$3.b($$1.f()).a());
      } else {
         return gdx.f($$2);
      }
   }
}
