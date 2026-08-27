import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fvv implements fvg<dif> {
   private final Map<ddq.a, flt> a;
   private static final Map<ddq.a, ahg> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddq.b.c, new ahg("textures/entity/skeleton/skeleton.png"));
      $$0.put(ddq.b.d, new ahg("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(ddq.b.f, new ahg("textures/entity/zombie/zombie.png"));
      $$0.put(ddq.b.g, new ahg("textures/entity/creeper/creeper.png"));
      $$0.put(ddq.b.i, new ahg("textures/entity/enderdragon/dragon.png"));
      $$0.put(ddq.b.h, new ahg("textures/entity/piglin/piglin.png"));
      $$0.put(ddq.b.e, gfe.a());
   });

   public static Map<ddq.a, flt> a(fms $$0) {
      Builder<ddq.a, flt> $$1 = ImmutableMap.builder();
      $$1.put(ddq.b.c, new fls($$0.a(fmv.bo)));
      $$1.put(ddq.b.d, new fls($$0.a(fmv.bX)));
      $$1.put(ddq.b.e, new fls($$0.a(fmv.aQ)));
      $$1.put(ddq.b.f, new fls($$0.a(fmv.cc)));
      $$1.put(ddq.b.g, new fls($$0.a(fmv.G)));
      $$1.put(ddq.b.i, new fmq($$0.a(fmv.N)));
      $$1.put(ddq.b.h, new fkz($$0.a(fmv.aK)));
      return $$1.build();
   }

   public fvv(fvh.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dif $$0, float $$1, eqa $$2, ftg $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      djg $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof dfo;
      ic $$9 = $$8 ? $$7.c(dfo.d) : null;
      int $$10 = $$8 ? dkm.a($$9.g()) : $$7.c(ddq.e);
      float $$11 = dkm.b($$10);
      ddq.a $$12 = ((cvl)$$7.b()).b();
      flt $$13 = this.a.get($$12);
      fto $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ic $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5, flt $$6, fto $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eqe $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, ged.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fto a(ddq.a $$0, @Nullable GameProfile $$1) {
      ahg $$2 = b.get($$0);
      if ($$0 == ddq.b.e && $$1 != null) {
         gfm $$3 = evh.O().al();
         return fto.i($$3.b($$1).a());
      } else {
         return fto.f($$2);
      }
   }
}
