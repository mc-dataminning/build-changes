import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gkw implements gkh<dtu> {
   private final Map<dpa.a, fzw> a;
   private static final Map<dpa.a, alh> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dpa.b.c, alh.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dpa.b.d, alh.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dpa.b.f, alh.b("textures/entity/zombie/zombie.png"));
      $$0.put(dpa.b.g, alh.b("textures/entity/creeper/creeper.png"));
      $$0.put(dpa.b.i, alh.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dpa.b.h, alh.b("textures/entity/piglin/piglin.png"));
      $$0.put(dpa.b.e, gyk.a());
   });

   public static Map<dpa.a, fzw> a(gax $$0) {
      Builder<dpa.a, fzw> $$1 = ImmutableMap.builder();
      $$1.put(dpa.b.c, new fzv($$0.a(gba.cr)));
      $$1.put(dpa.b.d, new fzv($$0.a(gba.de)));
      $$1.put(dpa.b.e, new fzv($$0.a(gba.bL)));
      $$1.put(dpa.b.f, new fzv($$0.a(gba.dn)));
      $$1.put(dpa.b.g, new fzv($$0.a(gba.Y)));
      $$1.put(dpa.b.i, new gau($$0.a(gba.ah)));
      $$1.put(dpa.b.h, new fza($$0.a(gba.bB)));
      return $$1.build();
   }

   public gkw(gki.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dtu $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dvd $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dqz;
      jl $$9 = $$8 ? $$7.c(dqz.d) : null;
      int $$10 = $$8 ? dwj.a($$9.g()) : $$7.c(dpa.e);
      float $$11 = dwj.b($$10);
      dpa.a $$12 = ((dgu)$$7.b()).b();
      fzw $$13 = this.a.get($$12);
      gig $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jl $$0, float $$1, float $$2, fdt $$3, ghw $$4, int $$5, fzw $$6, gig $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fdx $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gxj.d);
      $$3.b();
   }

   public static gig a(dpa.a $$0, @Nullable cyu $$1) {
      alh $$2 = b.get($$0);
      if ($$0 == dpa.b.e && $$1 != null) {
         gyu $$3 = fja.Q().an();
         return gig.i($$3.b($$1.f()).a());
      } else {
         return gig.g($$2);
      }
   }
}
