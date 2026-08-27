import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fyb implements fxm<dke> {
   private final Map<dfp.a, fny> a;
   private static final Map<dfp.a, aiy> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfp.b.c, new aiy("textures/entity/skeleton/skeleton.png"));
      $$0.put(dfp.b.d, new aiy("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dfp.b.f, new aiy("textures/entity/zombie/zombie.png"));
      $$0.put(dfp.b.g, new aiy("textures/entity/creeper/creeper.png"));
      $$0.put(dfp.b.i, new aiy("textures/entity/enderdragon/dragon.png"));
      $$0.put(dfp.b.h, new aiy("textures/entity/piglin/piglin.png"));
      $$0.put(dfp.b.e, ghm.a());
   });

   public static Map<dfp.a, fny> a(foy $$0) {
      Builder<dfp.a, fny> $$1 = ImmutableMap.builder();
      $$1.put(dfp.b.c, new fnx($$0.a(fpb.bn)));
      $$1.put(dfp.b.d, new fnx($$0.a(fpb.bW)));
      $$1.put(dfp.b.e, new fnx($$0.a(fpb.aP)));
      $$1.put(dfp.b.f, new fnx($$0.a(fpb.cc)));
      $$1.put(dfp.b.g, new fnx($$0.a(fpb.F)));
      $$1.put(dfp.b.i, new fow($$0.a(fpb.M)));
      $$1.put(dfp.b.h, new fne($$0.a(fpb.aJ)));
      return $$1.build();
   }

   public fyb(fxn.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dke $$0, float $$1, esa $$2, fvm $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dlf $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof dhn;
      ie $$9 = $$8 ? $$7.c(dhn.d) : null;
      int $$10 = $$8 ? dml.a($$9.g()) : $$7.c(dfp.e);
      float $$11 = dml.b($$10);
      dfp.a $$12 = ((cxk)$$7.b()).b();
      fny $$13 = this.a.get($$12);
      fvu $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ie $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5, fny $$6, fvu $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ese $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, ggl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fvu a(dfp.a $$0, @Nullable GameProfile $$1) {
      aiy $$2 = b.get($$0);
      if ($$0 == dfp.b.e && $$1 != null) {
         ghu $$3 = exh.O().al();
         return fvu.i($$3.b($$1).a());
      } else {
         return fvu.f($$2);
      }
   }
}
