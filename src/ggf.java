import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ggf implements gfq<dqv> {
   private final Map<dmd.a, fvz> a;
   private static final Map<dmd.a, alf> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmd.b.c, new alf("textures/entity/skeleton/skeleton.png"));
      $$0.put(dmd.b.d, new alf("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dmd.b.f, new alf("textures/entity/zombie/zombie.png"));
      $$0.put(dmd.b.g, new alf("textures/entity/creeper/creeper.png"));
      $$0.put(dmd.b.i, new alf("textures/entity/enderdragon/dragon.png"));
      $$0.put(dmd.b.h, new alf("textures/entity/piglin/piglin.png"));
      $$0.put(dmd.b.e, gpt.a());
   });

   public static Map<dmd.a, fvz> a(fwy $$0) {
      Builder<dmd.a, fvz> $$1 = ImmutableMap.builder();
      $$1.put(dmd.b.c, new fvy($$0.a(fxb.br)));
      $$1.put(dmd.b.d, new fvy($$0.a(fxb.ca)));
      $$1.put(dmd.b.e, new fvy($$0.a(fxb.aT)));
      $$1.put(dmd.b.f, new fvy($$0.a(fxb.cg)));
      $$1.put(dmd.b.g, new fvy($$0.a(fxb.J)));
      $$1.put(dmd.b.i, new fww($$0.a(fxb.Q)));
      $$1.put(dmd.b.h, new fvf($$0.a(fxb.aN)));
      return $$1.build();
   }

   public ggf(gfr.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dqv $$0, float $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dse $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof doc;
      je $$9 = $$8 ? $$7.c(doc.d) : null;
      int $$10 = $$8 ? dtk.a($$9.g()) : $$7.c(dmd.e);
      float $$11 = dtk.b($$10);
      dmd.a $$12 = ((ddx)$$7.b()).b();
      fvz $$13 = this.a.get($$12);
      gdy $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable je $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5, fvz $$6, gdy $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fae $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gdy a(dmd.a $$0, @Nullable cxt $$1) {
      alf $$2 = b.get($$0);
      if ($$0 == dmd.b.e && $$1 != null) {
         gqc $$3 = ffh.Q().am();
         return gdy.i($$3.b($$1.f()).a());
      } else {
         return gdy.f($$2);
      }
   }
}
