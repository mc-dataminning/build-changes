import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gdt implements gde<dop> {
   private final Map<djx.a, fto> a;
   private static final Map<djx.a, akf> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(djx.b.c, new akf("textures/entity/skeleton/skeleton.png"));
      $$0.put(djx.b.d, new akf("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(djx.b.f, new akf("textures/entity/zombie/zombie.png"));
      $$0.put(djx.b.g, new akf("textures/entity/creeper/creeper.png"));
      $$0.put(djx.b.i, new akf("textures/entity/enderdragon/dragon.png"));
      $$0.put(djx.b.h, new akf("textures/entity/piglin/piglin.png"));
      $$0.put(djx.b.e, gng.a());
   });

   public static Map<djx.a, fto> a(fun $$0) {
      Builder<djx.a, fto> $$1 = ImmutableMap.builder();
      $$1.put(djx.b.c, new ftn($$0.a(fuq.br)));
      $$1.put(djx.b.d, new ftn($$0.a(fuq.ca)));
      $$1.put(djx.b.e, new ftn($$0.a(fuq.aT)));
      $$1.put(djx.b.f, new ftn($$0.a(fuq.cg)));
      $$1.put(djx.b.g, new ftn($$0.a(fuq.J)));
      $$1.put(djx.b.i, new ful($$0.a(fuq.Q)));
      $$1.put(djx.b.h, new fsu($$0.a(fuq.aN)));
      return $$1.build();
   }

   public gdt(gdf.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dop $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dpy $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dlw;
      ir $$9 = $$8 ? $$7.c(dlw.d) : null;
      int $$10 = $$8 ? dre.a($$9.g()) : $$7.c(djx.e);
      float $$11 = dre.b($$10);
      djx.a $$12 = ((dbr)$$7.b()).b();
      fto $$13 = this.a.get($$12);
      gbm $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ir $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5, fto $$6, gbm $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      exr $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gbm a(djx.a $$0, @Nullable cvd $$1) {
      akf $$2 = b.get($$0);
      if ($$0 == djx.b.e && $$1 != null) {
         gno $$3 = fcu.Q().an();
         return gbm.i($$3.b($$1.f()).a());
      } else {
         return gbm.f($$2);
      }
   }
}
