import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fwi implements fvt<dio> {
   private final Map<ddz.a, fmg> a;
   private static final Map<ddz.a, ahh> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddz.b.c, new ahh("textures/entity/skeleton/skeleton.png"));
      $$0.put(ddz.b.d, new ahh("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(ddz.b.f, new ahh("textures/entity/zombie/zombie.png"));
      $$0.put(ddz.b.g, new ahh("textures/entity/creeper/creeper.png"));
      $$0.put(ddz.b.i, new ahh("textures/entity/enderdragon/dragon.png"));
      $$0.put(ddz.b.h, new ahh("textures/entity/piglin/piglin.png"));
      $$0.put(ddz.b.e, gft.a());
   });

   public static Map<ddz.a, fmg> a(fnf $$0) {
      Builder<ddz.a, fmg> $$1 = ImmutableMap.builder();
      $$1.put(ddz.b.c, new fmf($$0.a(fni.bn)));
      $$1.put(ddz.b.d, new fmf($$0.a(fni.bW)));
      $$1.put(ddz.b.e, new fmf($$0.a(fni.aP)));
      $$1.put(ddz.b.f, new fmf($$0.a(fni.cc)));
      $$1.put(ddz.b.g, new fmf($$0.a(fni.F)));
      $$1.put(ddz.b.i, new fnd($$0.a(fni.M)));
      $$1.put(ddz.b.h, new flm($$0.a(fni.aJ)));
      return $$1.build();
   }

   public fwi(fvu.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dio $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      djp $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof dfx;
      ic $$9 = $$8 ? $$7.c(dfx.d) : null;
      int $$10 = $$8 ? dkv.a($$9.g()) : $$7.c(ddz.e);
      float $$11 = dkv.b($$10);
      ddz.a $$12 = ((cvu)$$7.b()).b();
      fmg $$13 = this.a.get($$12);
      fub $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ic $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5, fmg $$6, fub $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eqo $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fub a(ddz.a $$0, @Nullable GameProfile $$1) {
      ahh $$2 = b.get($$0);
      if ($$0 == ddz.b.e && $$1 != null) {
         ggb $$3 = evr.O().al();
         return fub.i($$3.b($$1).a());
      } else {
         return fub.f($$2);
      }
   }
}
