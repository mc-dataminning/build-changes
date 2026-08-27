import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fvu implements fvf<dif> {
   private final Map<ddq.a, fls> a;
   private static final Map<ddq.a, ahg> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddq.b.c, new ahg("textures/entity/skeleton/skeleton.png"));
      $$0.put(ddq.b.d, new ahg("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(ddq.b.f, new ahg("textures/entity/zombie/zombie.png"));
      $$0.put(ddq.b.g, new ahg("textures/entity/creeper/creeper.png"));
      $$0.put(ddq.b.i, new ahg("textures/entity/enderdragon/dragon.png"));
      $$0.put(ddq.b.h, new ahg("textures/entity/piglin/piglin.png"));
      $$0.put(ddq.b.e, gfd.a());
   });

   public static Map<ddq.a, fls> a(fmr $$0) {
      Builder<ddq.a, fls> $$1 = ImmutableMap.builder();
      $$1.put(ddq.b.c, new flr($$0.a(fmu.bo)));
      $$1.put(ddq.b.d, new flr($$0.a(fmu.bX)));
      $$1.put(ddq.b.e, new flr($$0.a(fmu.aQ)));
      $$1.put(ddq.b.f, new flr($$0.a(fmu.cc)));
      $$1.put(ddq.b.g, new flr($$0.a(fmu.G)));
      $$1.put(ddq.b.i, new fmp($$0.a(fmu.N)));
      $$1.put(ddq.b.h, new fky($$0.a(fmu.aK)));
      return $$1.build();
   }

   public fvu(fvg.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dif $$0, float $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      djg $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof dfo;
      ic $$9 = $$8 ? $$7.c(dfo.d) : null;
      int $$10 = $$8 ? dkm.a($$9.g()) : $$7.c(ddq.e);
      float $$11 = dkm.b($$10);
      ddq.a $$12 = ((cvl)$$7.b()).b();
      fls $$13 = this.a.get($$12);
      ftn $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ic $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5, fls $$6, ftn $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eqd $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static ftn a(ddq.a $$0, @Nullable GameProfile $$1) {
      ahg $$2 = b.get($$0);
      if ($$0 == ddq.b.e && $$1 != null) {
         gfl $$3 = evg.O().al();
         return ftn.i($$3.b($$1).a());
      } else {
         return ftn.f($$2);
      }
   }
}
