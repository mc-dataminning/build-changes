import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class glx implements gli<duf> {
   private final Map<dpl.a, gax> a;
   private static final Map<dpl.a, all> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dpl.b.c, all.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dpl.b.d, all.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dpl.b.f, all.b("textures/entity/zombie/zombie.png"));
      $$0.put(dpl.b.g, all.b("textures/entity/creeper/creeper.png"));
      $$0.put(dpl.b.i, all.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dpl.b.h, all.b("textures/entity/piglin/piglin.png"));
      $$0.put(dpl.b.e, gzl.a());
   });

   public static Map<dpl.a, gax> a(gby $$0) {
      Builder<dpl.a, gax> $$1 = ImmutableMap.builder();
      $$1.put(dpl.b.c, new gaw($$0.a(gcb.cr)));
      $$1.put(dpl.b.d, new gaw($$0.a(gcb.de)));
      $$1.put(dpl.b.e, new gaw($$0.a(gcb.bL)));
      $$1.put(dpl.b.f, new gaw($$0.a(gcb.dn)));
      $$1.put(dpl.b.g, new gaw($$0.a(gcb.Y)));
      $$1.put(dpl.b.i, new gbv($$0.a(gcb.ah)));
      $$1.put(dpl.b.h, new gab($$0.a(gcb.bB)));
      return $$1.build();
   }

   public glx(glj.a $$0) {
      this.a = a($$0.e());
   }

   public void a(duf $$0, float $$1, fek $$2, gix $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dvo $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof drk;
      jm $$9 = $$8 ? $$7.c(drk.d) : null;
      int $$10 = $$8 ? dwt.a($$9.g()) : $$7.c(dpl.e);
      float $$11 = dwt.b($$10);
      dpl.a $$12 = ((dhf)$$7.b()).b();
      gax $$13 = this.a.get($$12);
      gjh $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jm $$0, float $$1, float $$2, fek $$3, gix $$4, int $$5, gax $$6, gjh $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      feo $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gyk.d);
      $$3.b();
   }

   public static gjh a(dpl.a $$0, @Nullable cze $$1) {
      all $$2 = b.get($$0);
      if ($$0 == dpl.b.e && $$1 != null) {
         gzv $$3 = fjx.Q().an();
         return gjh.i($$3.b($$1.f()).a());
      } else {
         return gjh.g($$2);
      }
   }
}
