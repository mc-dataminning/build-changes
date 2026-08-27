import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class gah implements fzs<dlt> {
   private final Map<dhd.a, fqc> a;
   private static final Map<dhd.a, ajh> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dhd.b.c, new ajh("textures/entity/skeleton/skeleton.png"));
      $$0.put(dhd.b.d, new ajh("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dhd.b.f, new ajh("textures/entity/zombie/zombie.png"));
      $$0.put(dhd.b.g, new ajh("textures/entity/creeper/creeper.png"));
      $$0.put(dhd.b.i, new ajh("textures/entity/enderdragon/dragon.png"));
      $$0.put(dhd.b.h, new ajh("textures/entity/piglin/piglin.png"));
      $$0.put(dhd.b.e, gju.a());
   });

   public static Map<dhd.a, fqc> a(frb $$0) {
      Builder<dhd.a, fqc> $$1 = ImmutableMap.builder();
      $$1.put(dhd.b.c, new fqb($$0.a(fre.br)));
      $$1.put(dhd.b.d, new fqb($$0.a(fre.ca)));
      $$1.put(dhd.b.e, new fqb($$0.a(fre.aT)));
      $$1.put(dhd.b.f, new fqb($$0.a(fre.cg)));
      $$1.put(dhd.b.g, new fqb($$0.a(fre.J)));
      $$1.put(dhd.b.i, new fqz($$0.a(fre.Q)));
      $$1.put(dhd.b.h, new fpi($$0.a(fre.aN)));
      return $$1.build();
   }

   public gah(fzt.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dlt $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dnb $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof djc;
      ih $$9 = $$8 ? $$7.c(djc.d) : null;
      int $$10 = $$8 ? doh.a($$9.g()) : $$7.c(dhd.e);
      float $$11 = doh.b($$10);
      dhd.a $$12 = ((cyy)$$7.b()).b();
      fqc $$13 = this.a.get($$12);
      fya $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ih $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5, fqc $$6, fya $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      euf $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fya a(dhd.a $$0, @Nullable GameProfile $$1) {
      ajh $$2 = b.get($$0);
      if ($$0 == dhd.b.e && $$1 != null) {
         gkc $$3 = ezi.Q().an();
         return fya.i($$3.b($$1).a());
      } else {
         return fya.f($$2);
      }
   }
}
