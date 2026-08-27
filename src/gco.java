import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class gco implements gbz<dnr> {
   private final Map<diz.a, fsj> a;
   private static final Map<diz.a, ajt> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(diz.b.c, new ajt("textures/entity/skeleton/skeleton.png"));
      $$0.put(diz.b.d, new ajt("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(diz.b.f, new ajt("textures/entity/zombie/zombie.png"));
      $$0.put(diz.b.g, new ajt("textures/entity/creeper/creeper.png"));
      $$0.put(diz.b.i, new ajt("textures/entity/enderdragon/dragon.png"));
      $$0.put(diz.b.h, new ajt("textures/entity/piglin/piglin.png"));
      $$0.put(diz.b.e, gmb.a());
   });

   public static Map<diz.a, fsj> a(fti $$0) {
      Builder<diz.a, fsj> $$1 = ImmutableMap.builder();
      $$1.put(diz.b.c, new fsi($$0.a(ftl.br)));
      $$1.put(diz.b.d, new fsi($$0.a(ftl.ca)));
      $$1.put(diz.b.e, new fsi($$0.a(ftl.aT)));
      $$1.put(diz.b.f, new fsi($$0.a(ftl.cg)));
      $$1.put(diz.b.g, new fsi($$0.a(ftl.J)));
      $$1.put(diz.b.i, new ftg($$0.a(ftl.Q)));
      $$1.put(diz.b.h, new frp($$0.a(ftl.aN)));
      return $$1.build();
   }

   public gco(gca.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dnr $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      doz $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dky;
      ih $$9 = $$8 ? $$7.c(dky.d) : null;
      int $$10 = $$8 ? dqf.a($$9.g()) : $$7.c(diz.e);
      float $$11 = dqf.b($$10);
      diz.a $$12 = ((dau)$$7.b()).b();
      fsj $$13 = this.a.get($$12);
      gah $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ih $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5, fsj $$6, gah $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ewm $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gah a(diz.a $$0, @Nullable GameProfile $$1) {
      ajt $$2 = b.get($$0);
      if ($$0 == diz.b.e && $$1 != null) {
         gmj $$3 = fbp.Q().an();
         return gah.i($$3.b($$1).a());
      } else {
         return gah.f($$2);
      }
   }
}
