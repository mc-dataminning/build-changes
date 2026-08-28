import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class glh implements gks<dua> {
   private final Map<dpg.a, gah> a;
   private static final Map<dpg.a, ali> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dpg.b.c, ali.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dpg.b.d, ali.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dpg.b.f, ali.b("textures/entity/zombie/zombie.png"));
      $$0.put(dpg.b.g, ali.b("textures/entity/creeper/creeper.png"));
      $$0.put(dpg.b.i, ali.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dpg.b.h, ali.b("textures/entity/piglin/piglin.png"));
      $$0.put(dpg.b.e, gyv.a());
   });

   public static Map<dpg.a, gah> a(gbi $$0) {
      Builder<dpg.a, gah> $$1 = ImmutableMap.builder();
      $$1.put(dpg.b.c, new gag($$0.a(gbl.cr)));
      $$1.put(dpg.b.d, new gag($$0.a(gbl.de)));
      $$1.put(dpg.b.e, new gag($$0.a(gbl.bL)));
      $$1.put(dpg.b.f, new gag($$0.a(gbl.dn)));
      $$1.put(dpg.b.g, new gag($$0.a(gbl.Y)));
      $$1.put(dpg.b.i, new gbf($$0.a(gbl.ah)));
      $$1.put(dpg.b.h, new fzl($$0.a(gbl.bB)));
      return $$1.build();
   }

   public glh(gkt.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dua $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dvj $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof drf;
      jm $$9 = $$8 ? $$7.c(drf.d) : null;
      int $$10 = $$8 ? dwp.a($$9.g()) : $$7.c(dpg.e);
      float $$11 = dwp.b($$10);
      dpg.a $$12 = ((dha)$$7.b()).b();
      gah $$13 = this.a.get($$12);
      gir $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jm $$0, float $$1, float $$2, feb $$3, gih $$4, int $$5, gah $$6, gir $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fef $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gxu.d);
      $$3.b();
   }

   public static gir a(dpg.a $$0, @Nullable cza $$1) {
      ali $$2 = b.get($$0);
      if ($$0 == dpg.b.e && $$1 != null) {
         gzf $$3 = fji.Q().an();
         return gir.i($$3.b($$1.f()).a());
      } else {
         return gir.g($$2);
      }
   }
}
