import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gol implements gnw<dwm> {
   private final Map<drr.a, gdj> a;
   private static final Map<drr.a, alz> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(drr.b.c, alz.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(drr.b.d, alz.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(drr.b.f, alz.b("textures/entity/zombie/zombie.png"));
      $$0.put(drr.b.g, alz.b("textures/entity/creeper/creeper.png"));
      $$0.put(drr.b.i, alz.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(drr.b.h, alz.b("textures/entity/piglin/piglin.png"));
      $$0.put(drr.b.e, hcd.a());
   });

   public static Map<drr.a, gdj> a(gek $$0) {
      Builder<drr.a, gdj> $$1 = ImmutableMap.builder();
      $$1.put(drr.b.c, new gdi($$0.a(gen.cK)));
      $$1.put(drr.b.d, new gdi($$0.a(gen.dz)));
      $$1.put(drr.b.e, new gdi($$0.a(gen.ce)));
      $$1.put(drr.b.f, new gdi($$0.a(gen.dL)));
      $$1.put(drr.b.g, new gdi($$0.a(gen.ah)));
      $$1.put(drr.b.i, new geh($$0.a(gen.as)));
      $$1.put(drr.b.h, new gcn($$0.a(gen.bU)));
      return $$1.build();
   }

   public gol(gnx.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dwm $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dxv $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dtq;
      jm $$9 = $$8 ? $$7.c(dtq.d) : null;
      int $$10 = $$8 ? dza.a($$9.g()) : $$7.c(drr.e);
      float $$11 = dza.b($$10);
      drr.a $$12 = ((dji)$$7.b()).b();
      gdj $$13 = this.a.get($$12);
      glv $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jm $$0, float $$1, float $$2, fgs $$3, gll $$4, int $$5, gdj $$6, glv $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fgw $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hbc.d);
      $$3.b();
   }

   public static glv a(drr.a $$0, @Nullable dao $$1) {
      alz $$2 = b.get($$0);
      if ($$0 == drr.b.e && $$1 != null) {
         hcn $$3 = fmg.Q().an();
         return glv.j($$3.b($$1.f()).a());
      } else {
         return glv.h($$2);
      }
   }
}
