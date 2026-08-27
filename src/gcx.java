import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gcx implements gci<doa> {
   private final Map<dji.a, fss> a;
   private static final Map<dji.a, ajv> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dji.b.c, new ajv("textures/entity/skeleton/skeleton.png"));
      $$0.put(dji.b.d, new ajv("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dji.b.f, new ajv("textures/entity/zombie/zombie.png"));
      $$0.put(dji.b.g, new ajv("textures/entity/creeper/creeper.png"));
      $$0.put(dji.b.i, new ajv("textures/entity/enderdragon/dragon.png"));
      $$0.put(dji.b.h, new ajv("textures/entity/piglin/piglin.png"));
      $$0.put(dji.b.e, gmk.a());
   });

   public static Map<dji.a, fss> a(ftr $$0) {
      Builder<dji.a, fss> $$1 = ImmutableMap.builder();
      $$1.put(dji.b.c, new fsr($$0.a(ftu.br)));
      $$1.put(dji.b.d, new fsr($$0.a(ftu.ca)));
      $$1.put(dji.b.e, new fsr($$0.a(ftu.aT)));
      $$1.put(dji.b.f, new fsr($$0.a(ftu.cg)));
      $$1.put(dji.b.g, new fsr($$0.a(ftu.J)));
      $$1.put(dji.b.i, new ftp($$0.a(ftu.Q)));
      $$1.put(dji.b.h, new fry($$0.a(ftu.aN)));
      return $$1.build();
   }

   public gcx(gcj.a $$0) {
      this.a = a($$0.e());
   }

   public void a(doa $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dpi $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dlh;
      ij $$9 = $$8 ? $$7.c(dlh.d) : null;
      int $$10 = $$8 ? dqo.a($$9.g()) : $$7.c(dji.e);
      float $$11 = dqo.b($$10);
      dji.a $$12 = ((dbd)$$7.b()).b();
      fss $$13 = this.a.get($$12);
      gaq $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ij $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5, fss $$6, gaq $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ewv $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gaq a(dji.a $$0, @Nullable cup $$1) {
      ajv $$2 = b.get($$0);
      if ($$0 == dji.b.e && $$1 != null) {
         gms $$3 = fby.Q().an();
         return gaq.i($$3.b($$1.f()).a());
      } else {
         return gaq.f($$2);
      }
   }
}
