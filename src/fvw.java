import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fvw implements fvh<dig> {
   private final Map<ddr.a, flu> a;
   private static final Map<ddr.a, ahg> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddr.b.c, new ahg("textures/entity/skeleton/skeleton.png"));
      $$0.put(ddr.b.d, new ahg("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(ddr.b.f, new ahg("textures/entity/zombie/zombie.png"));
      $$0.put(ddr.b.g, new ahg("textures/entity/creeper/creeper.png"));
      $$0.put(ddr.b.i, new ahg("textures/entity/enderdragon/dragon.png"));
      $$0.put(ddr.b.h, new ahg("textures/entity/piglin/piglin.png"));
      $$0.put(ddr.b.e, gff.a());
   });

   public static Map<ddr.a, flu> a(fmt $$0) {
      Builder<ddr.a, flu> $$1 = ImmutableMap.builder();
      $$1.put(ddr.b.c, new flt($$0.a(fmw.bo)));
      $$1.put(ddr.b.d, new flt($$0.a(fmw.bX)));
      $$1.put(ddr.b.e, new flt($$0.a(fmw.aQ)));
      $$1.put(ddr.b.f, new flt($$0.a(fmw.cc)));
      $$1.put(ddr.b.g, new flt($$0.a(fmw.G)));
      $$1.put(ddr.b.i, new fmr($$0.a(fmw.N)));
      $$1.put(ddr.b.h, new fla($$0.a(fmw.aK)));
      return $$1.build();
   }

   public fvw(fvi.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dig $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      djh $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof dfp;
      ic $$9 = $$8 ? $$7.c(dfp.d) : null;
      int $$10 = $$8 ? dkn.a($$9.g()) : $$7.c(ddr.e);
      float $$11 = dkn.b($$10);
      ddr.a $$12 = ((cvm)$$7.b()).b();
      flu $$13 = this.a.get($$12);
      ftp $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ic $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5, flu $$6, ftp $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eqf $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static ftp a(ddr.a $$0, @Nullable GameProfile $$1) {
      ahg $$2 = b.get($$0);
      if ($$0 == ddr.b.e && $$1 != null) {
         gfn $$3 = evi.O().al();
         return ftp.i($$3.b($$1).a());
      } else {
         return ftp.f($$2);
      }
   }
}
