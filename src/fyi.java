import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fyi implements fxt<dki> {
   private final Map<dft.a, fof> a;
   private static final Map<dft.a, aiy> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dft.b.c, new aiy("textures/entity/skeleton/skeleton.png"));
      $$0.put(dft.b.d, new aiy("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dft.b.f, new aiy("textures/entity/zombie/zombie.png"));
      $$0.put(dft.b.g, new aiy("textures/entity/creeper/creeper.png"));
      $$0.put(dft.b.i, new aiy("textures/entity/enderdragon/dragon.png"));
      $$0.put(dft.b.h, new aiy("textures/entity/piglin/piglin.png"));
      $$0.put(dft.b.e, ght.a());
   });

   public static Map<dft.a, fof> a(fpf $$0) {
      Builder<dft.a, fof> $$1 = ImmutableMap.builder();
      $$1.put(dft.b.c, new foe($$0.a(fpi.bn)));
      $$1.put(dft.b.d, new foe($$0.a(fpi.bW)));
      $$1.put(dft.b.e, new foe($$0.a(fpi.aP)));
      $$1.put(dft.b.f, new foe($$0.a(fpi.cc)));
      $$1.put(dft.b.g, new foe($$0.a(fpi.F)));
      $$1.put(dft.b.i, new fpd($$0.a(fpi.M)));
      $$1.put(dft.b.h, new fnl($$0.a(fpi.aJ)));
      return $$1.build();
   }

   public fyi(fxu.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dki $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dlj $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof dhr;
      ie $$9 = $$8 ? $$7.c(dhr.d) : null;
      int $$10 = $$8 ? dmp.a($$9.g()) : $$7.c(dft.e);
      float $$11 = dmp.b($$10);
      dft.a $$12 = ((cxo)$$7.b()).b();
      fof $$13 = this.a.get($$12);
      fwb $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ie $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5, fof $$6, fwb $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      esl $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fwb a(dft.a $$0, @Nullable GameProfile $$1) {
      aiy $$2 = b.get($$0);
      if ($$0 == dft.b.e && $$1 != null) {
         gib $$3 = exo.P().am();
         return fwb.i($$3.b($$1).a());
      } else {
         return fwb.f($$2);
      }
   }
}
