import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fux implements fui<dho> {
   private final Map<dda.a, fkv> a;
   private static final Map<dda.a, agt> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dda.b.c, new agt("textures/entity/skeleton/skeleton.png"));
      $$0.put(dda.b.d, new agt("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dda.b.f, new agt("textures/entity/zombie/zombie.png"));
      $$0.put(dda.b.g, new agt("textures/entity/creeper/creeper.png"));
      $$0.put(dda.b.i, new agt("textures/entity/enderdragon/dragon.png"));
      $$0.put(dda.b.h, new agt("textures/entity/piglin/piglin.png"));
      $$0.put(dda.b.e, geg.a());
   });

   public static Map<dda.a, fkv> a(flu $$0) {
      Builder<dda.a, fkv> $$1 = ImmutableMap.builder();
      $$1.put(dda.b.c, new fku($$0.a(flx.bo)));
      $$1.put(dda.b.d, new fku($$0.a(flx.bX)));
      $$1.put(dda.b.e, new fku($$0.a(flx.aQ)));
      $$1.put(dda.b.f, new fku($$0.a(flx.cc)));
      $$1.put(dda.b.g, new fku($$0.a(flx.G)));
      $$1.put(dda.b.i, new fls($$0.a(flx.N)));
      $$1.put(dda.b.h, new fkb($$0.a(flx.aK)));
      return $$1.build();
   }

   public fux(fuj.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dho $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dip $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof dey;
      ia $$9 = $$8 ? $$7.c(dey.d) : null;
      int $$10 = $$8 ? djv.a($$9.g()) : $$7.c(dda.e);
      float $$11 = djv.b($$10);
      dda.a $$12 = ((cuv)$$7.b()).b();
      fkv $$13 = this.a.get($$12);
      fsq $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ia $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5, fkv $$6, fsq $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eph $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fsq a(dda.a $$0, @Nullable GameProfile $$1) {
      agt $$2 = b.get($$0);
      if ($$0 == dda.b.e && $$1 != null) {
         gep $$3 = euk.N().ak();
         return fsq.i($$3.b($$1).a());
      } else {
         return fsq.f($$2);
      }
   }
}
