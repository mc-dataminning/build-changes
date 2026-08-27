import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fzf implements fyq<dkw> {
   private final Map<dgg.a, fpc> a;
   private static final Map<dgg.a, ajc> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dgg.b.c, new ajc("textures/entity/skeleton/skeleton.png"));
      $$0.put(dgg.b.d, new ajc("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dgg.b.f, new ajc("textures/entity/zombie/zombie.png"));
      $$0.put(dgg.b.g, new ajc("textures/entity/creeper/creeper.png"));
      $$0.put(dgg.b.i, new ajc("textures/entity/enderdragon/dragon.png"));
      $$0.put(dgg.b.h, new ajc("textures/entity/piglin/piglin.png"));
      $$0.put(dgg.b.e, gir.a());
   });

   public static Map<dgg.a, fpc> a(fqb $$0) {
      Builder<dgg.a, fpc> $$1 = ImmutableMap.builder();
      $$1.put(dgg.b.c, new fpb($$0.a(fqe.bn)));
      $$1.put(dgg.b.d, new fpb($$0.a(fqe.bW)));
      $$1.put(dgg.b.e, new fpb($$0.a(fqe.aP)));
      $$1.put(dgg.b.f, new fpb($$0.a(fqe.cc)));
      $$1.put(dgg.b.g, new fpb($$0.a(fqe.F)));
      $$1.put(dgg.b.i, new fpz($$0.a(fqe.M)));
      $$1.put(dgg.b.h, new foh($$0.a(fqe.aJ)));
      return $$1.build();
   }

   public fzf(fyr.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dkw $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dme $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dif;
      ih $$9 = $$8 ? $$7.c(dif.d) : null;
      int $$10 = $$8 ? dnk.a($$9.g()) : $$7.c(dgg.e);
      float $$11 = dnk.b($$10);
      dgg.a $$12 = ((cyb)$$7.b()).b();
      fpc $$13 = this.a.get($$12);
      fwy $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ih $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5, fpc $$6, fwy $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eth $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fwy a(dgg.a $$0, @Nullable GameProfile $$1) {
      ajc $$2 = b.get($$0);
      if ($$0 == dgg.b.e && $$1 != null) {
         giz $$3 = eyk.P().am();
         return fwy.i($$3.b($$1).a());
      } else {
         return fwy.f($$2);
      }
   }
}
