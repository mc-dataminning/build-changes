import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ggc implements gfn<dqs> {
   private final Map<dma.a, fvw> a;
   private static final Map<dma.a, ale> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dma.b.c, new ale("textures/entity/skeleton/skeleton.png"));
      $$0.put(dma.b.d, new ale("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dma.b.f, new ale("textures/entity/zombie/zombie.png"));
      $$0.put(dma.b.g, new ale("textures/entity/creeper/creeper.png"));
      $$0.put(dma.b.i, new ale("textures/entity/enderdragon/dragon.png"));
      $$0.put(dma.b.h, new ale("textures/entity/piglin/piglin.png"));
      $$0.put(dma.b.e, gpq.a());
   });

   public static Map<dma.a, fvw> a(fwv $$0) {
      Builder<dma.a, fvw> $$1 = ImmutableMap.builder();
      $$1.put(dma.b.c, new fvv($$0.a(fwy.br)));
      $$1.put(dma.b.d, new fvv($$0.a(fwy.ca)));
      $$1.put(dma.b.e, new fvv($$0.a(fwy.aT)));
      $$1.put(dma.b.f, new fvv($$0.a(fwy.cg)));
      $$1.put(dma.b.g, new fvv($$0.a(fwy.J)));
      $$1.put(dma.b.i, new fwt($$0.a(fwy.Q)));
      $$1.put(dma.b.h, new fvc($$0.a(fwy.aN)));
      return $$1.build();
   }

   public ggc(gfo.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dqs $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dsb $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dnz;
      je $$9 = $$8 ? $$7.c(dnz.d) : null;
      int $$10 = $$8 ? dth.a($$9.g()) : $$7.c(dma.e);
      float $$11 = dth.b($$10);
      dma.a $$12 = ((ddu)$$7.b()).b();
      fvw $$13 = this.a.get($$12);
      gdv $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable je $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5, fvw $$6, gdv $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fab $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gdv a(dma.a $$0, @Nullable cxq $$1) {
      ale $$2 = b.get($$0);
      if ($$0 == dma.b.e && $$1 != null) {
         gpz $$3 = ffe.Q().am();
         return gdv.i($$3.b($$1.f()).a());
      } else {
         return gdv.f($$2);
      }
   }
}
