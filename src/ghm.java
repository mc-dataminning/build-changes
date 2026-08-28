import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ghm implements ggx<dru> {
   private final Map<dnb.a, fxf> a;
   private static final Map<dnb.a, akr> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dnb.b.c, akr.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dnb.b.d, akr.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dnb.b.f, akr.b("textures/entity/zombie/zombie.png"));
      $$0.put(dnb.b.g, akr.b("textures/entity/creeper/creeper.png"));
      $$0.put(dnb.b.i, akr.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dnb.b.h, akr.b("textures/entity/piglin/piglin.png"));
      $$0.put(dnb.b.e, grb.a());
   });

   public static Map<dnb.a, fxf> a(fye $$0) {
      Builder<dnb.a, fxf> $$1 = ImmutableMap.builder();
      $$1.put(dnb.b.c, new fxe($$0.a(fyh.bs)));
      $$1.put(dnb.b.d, new fxe($$0.a(fyh.cb)));
      $$1.put(dnb.b.e, new fxe($$0.a(fyh.aU)));
      $$1.put(dnb.b.f, new fxe($$0.a(fyh.ch)));
      $$1.put(dnb.b.g, new fxe($$0.a(fyh.K)));
      $$1.put(dnb.b.i, new fyc($$0.a(fyh.R)));
      $$1.put(dnb.b.h, new fwl($$0.a(fyh.aO)));
      return $$1.build();
   }

   public ghm(ggy.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dru $$0, float $$1, fbg $$2, gex $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dtc $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dpa;
      ji $$9 = $$8 ? $$7.c(dpa.d) : null;
      int $$10 = $$8 ? dui.a($$9.g()) : $$7.c(dnb.e);
      float $$11 = dui.b($$10);
      dnb.a $$12 = ((deu)$$7.b()).b();
      fxf $$13 = this.a.get($$12);
      gff $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ji $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5, fxf $$6, gff $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fbk $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gqa.d);
      $$3.b();
   }

   public static gff a(dnb.a $$0, @Nullable cxu $$1) {
      akr $$2 = b.get($$0);
      if ($$0 == dnb.b.e && $$1 != null) {
         grk $$3 = fgm.Q().am();
         return gff.i($$3.b($$1.f()).a());
      } else {
         return gff.f($$2);
      }
   }
}
