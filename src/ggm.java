import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ggm implements gfx<dqz> {
   private final Map<dmh.a, fwf> a;
   private static final Map<dmh.a, akk> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmh.b.c, new akk("textures/entity/skeleton/skeleton.png"));
      $$0.put(dmh.b.d, new akk("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dmh.b.f, new akk("textures/entity/zombie/zombie.png"));
      $$0.put(dmh.b.g, new akk("textures/entity/creeper/creeper.png"));
      $$0.put(dmh.b.i, new akk("textures/entity/enderdragon/dragon.png"));
      $$0.put(dmh.b.h, new akk("textures/entity/piglin/piglin.png"));
      $$0.put(dmh.b.e, gqa.a());
   });

   public static Map<dmh.a, fwf> a(fxe $$0) {
      Builder<dmh.a, fwf> $$1 = ImmutableMap.builder();
      $$1.put(dmh.b.c, new fwe($$0.a(fxh.br)));
      $$1.put(dmh.b.d, new fwe($$0.a(fxh.ca)));
      $$1.put(dmh.b.e, new fwe($$0.a(fxh.aT)));
      $$1.put(dmh.b.f, new fwe($$0.a(fxh.cg)));
      $$1.put(dmh.b.g, new fwe($$0.a(fxh.J)));
      $$1.put(dmh.b.i, new fxc($$0.a(fxh.Q)));
      $$1.put(dmh.b.h, new fvl($$0.a(fxh.aN)));
      return $$1.build();
   }

   public ggm(gfy.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dqz $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dsh $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dog;
      jf $$9 = $$8 ? $$7.c(dog.d) : null;
      int $$10 = $$8 ? dtn.a($$9.g()) : $$7.c(dmh.e);
      float $$11 = dtn.b($$10);
      dmh.a $$12 = ((deb)$$7.b()).b();
      fwf $$13 = this.a.get($$12);
      gef $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jf $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5, fwf $$6, gef $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fak $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gef a(dmh.a $$0, @Nullable cxb $$1) {
      akk $$2 = b.get($$0);
      if ($$0 == dmh.b.e && $$1 != null) {
         gqj $$3 = ffn.Q().am();
         return gef.i($$3.b($$1.f()).a());
      } else {
         return gef.f($$2);
      }
   }
}
