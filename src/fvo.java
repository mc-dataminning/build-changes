import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fvo implements fuz<dhz> {
   private final Map<ddk.a, flm> a;
   private static final Map<ddk.a, ahd> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddk.b.c, new ahd("textures/entity/skeleton/skeleton.png"));
      $$0.put(ddk.b.d, new ahd("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(ddk.b.f, new ahd("textures/entity/zombie/zombie.png"));
      $$0.put(ddk.b.g, new ahd("textures/entity/creeper/creeper.png"));
      $$0.put(ddk.b.i, new ahd("textures/entity/enderdragon/dragon.png"));
      $$0.put(ddk.b.h, new ahd("textures/entity/piglin/piglin.png"));
      $$0.put(ddk.b.e, gex.a());
   });

   public static Map<ddk.a, flm> a(fml $$0) {
      Builder<ddk.a, flm> $$1 = ImmutableMap.builder();
      $$1.put(ddk.b.c, new fll($$0.a(fmo.bo)));
      $$1.put(ddk.b.d, new fll($$0.a(fmo.bX)));
      $$1.put(ddk.b.e, new fll($$0.a(fmo.aQ)));
      $$1.put(ddk.b.f, new fll($$0.a(fmo.cc)));
      $$1.put(ddk.b.g, new fll($$0.a(fmo.G)));
      $$1.put(ddk.b.i, new fmj($$0.a(fmo.N)));
      $$1.put(ddk.b.h, new fks($$0.a(fmo.aK)));
      return $$1.build();
   }

   public fvo(fva.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dhz $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dja $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof dfi;
      ic $$9 = $$8 ? $$7.c(dfi.d) : null;
      int $$10 = $$8 ? dkg.a($$9.g()) : $$7.c(ddk.e);
      float $$11 = dkg.b($$10);
      ddk.a $$12 = ((cvf)$$7.b()).b();
      flm $$13 = this.a.get($$12);
      fth $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ic $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5, flm $$6, fth $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      epx $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fth a(ddk.a $$0, @Nullable GameProfile $$1) {
      ahd $$2 = b.get($$0);
      if ($$0 == ddk.b.e && $$1 != null) {
         gfg $$3 = eva.N().ak();
         return fth.i($$3.b($$1).a());
      } else {
         return fth.f($$2);
      }
   }
}
