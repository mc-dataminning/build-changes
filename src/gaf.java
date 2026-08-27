import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class gaf implements fzq<dlr> {
   private final Map<dhb.a, fqa> a;
   private static final Map<dhb.a, ajh> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dhb.b.c, new ajh("textures/entity/skeleton/skeleton.png"));
      $$0.put(dhb.b.d, new ajh("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dhb.b.f, new ajh("textures/entity/zombie/zombie.png"));
      $$0.put(dhb.b.g, new ajh("textures/entity/creeper/creeper.png"));
      $$0.put(dhb.b.i, new ajh("textures/entity/enderdragon/dragon.png"));
      $$0.put(dhb.b.h, new ajh("textures/entity/piglin/piglin.png"));
      $$0.put(dhb.b.e, gjr.a());
   });

   public static Map<dhb.a, fqa> a(fqz $$0) {
      Builder<dhb.a, fqa> $$1 = ImmutableMap.builder();
      $$1.put(dhb.b.c, new fpz($$0.a(frc.bn)));
      $$1.put(dhb.b.d, new fpz($$0.a(frc.bW)));
      $$1.put(dhb.b.e, new fpz($$0.a(frc.aP)));
      $$1.put(dhb.b.f, new fpz($$0.a(frc.cc)));
      $$1.put(dhb.b.g, new fpz($$0.a(frc.F)));
      $$1.put(dhb.b.i, new fqx($$0.a(frc.M)));
      $$1.put(dhb.b.h, new fpg($$0.a(frc.aJ)));
      return $$1.build();
   }

   public gaf(fzr.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dlr $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dmz $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dja;
      ih $$9 = $$8 ? $$7.c(dja.d) : null;
      int $$10 = $$8 ? dof.a($$9.g()) : $$7.c(dhb.e);
      float $$11 = dof.b($$10);
      dhb.a $$12 = ((cyw)$$7.b()).b();
      fqa $$13 = this.a.get($$12);
      fxy $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ih $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5, fqa $$6, fxy $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eud $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fxy a(dhb.a $$0, @Nullable GameProfile $$1) {
      ajh $$2 = b.get($$0);
      if ($$0 == dhb.b.e && $$1 != null) {
         gjz $$3 = ezg.Q().an();
         return fxy.i($$3.b($$1).a());
      } else {
         return fxy.f($$2);
      }
   }
}
