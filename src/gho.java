import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gho implements ggz<dru> {
   private final Map<dnb.a, fxh> a;
   private static final Map<dnb.a, akr> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dnb.b.c, akr.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dnb.b.d, akr.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dnb.b.f, akr.b("textures/entity/zombie/zombie.png"));
      $$0.put(dnb.b.g, akr.b("textures/entity/creeper/creeper.png"));
      $$0.put(dnb.b.i, akr.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dnb.b.h, akr.b("textures/entity/piglin/piglin.png"));
      $$0.put(dnb.b.e, grd.a());
   });

   public static Map<dnb.a, fxh> a(fyg $$0) {
      Builder<dnb.a, fxh> $$1 = ImmutableMap.builder();
      $$1.put(dnb.b.c, new fxg($$0.a(fyj.bs)));
      $$1.put(dnb.b.d, new fxg($$0.a(fyj.cb)));
      $$1.put(dnb.b.e, new fxg($$0.a(fyj.aU)));
      $$1.put(dnb.b.f, new fxg($$0.a(fyj.ch)));
      $$1.put(dnb.b.g, new fxg($$0.a(fyj.K)));
      $$1.put(dnb.b.i, new fye($$0.a(fyj.R)));
      $$1.put(dnb.b.h, new fwn($$0.a(fyj.aO)));
      return $$1.build();
   }

   public gho(gha.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dru $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dtc $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dpa;
      ji $$9 = $$8 ? $$7.c(dpa.d) : null;
      int $$10 = $$8 ? dui.a($$9.g()) : $$7.c(dnb.e);
      float $$11 = dui.b($$10);
      dnb.a $$12 = ((deu)$$7.b()).b();
      fxh $$13 = this.a.get($$12);
      gfh $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ji $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5, fxh $$6, gfh $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fbm $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gqc.d);
      $$3.b();
   }

   public static gfh a(dnb.a $$0, @Nullable cxu $$1) {
      akr $$2 = b.get($$0);
      if ($$0 == dnb.b.e && $$1 != null) {
         grm $$3 = fgo.Q().am();
         return gfh.i($$3.b($$1.f()).a());
      } else {
         return gfh.f($$2);
      }
   }
}
